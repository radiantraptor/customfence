package com.raptor.customfence_forge.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;


public class MetalFenceGate extends FenceGateBlock implements WeatheringFence {
    private final WeatheringFence.WeatherState weatherState;

    public MetalFenceGate(WeatherState weatherstate, BlockBehaviour.Properties properties, WoodType woodtype) {
        super(properties, woodtype);
        this.weatherState = weatherstate;
    }

    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.onRandomTick(state, level, pos, random);
    }

    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean istrue)
    {
        if(ToolActions.AXE_SCRAPE.equals(toolAction)) {
            return WeatheringFence.getPrevious(state).orElse(null);
        }
        else if(ToolActions.AXE_WAX_OFF.equals(toolAction)) {
            if (WaxedMetal.getUnWaxed(state).isPresent()) {
                return WaxedMetal.getUnWaxed(state).get();
            }
        }
        return super.getToolModifiedState(state, context, toolAction, istrue);
    }


    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringFence.getNext(state.getBlock()).isPresent();
    }

    public WeatheringFence.WeatherState getAge() {
        return this.weatherState;
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if (state.getValue(OPEN)) {
            state = state.setValue(OPEN, Boolean.valueOf(false));
            level.setBlock(pos, state, 10);
            level.playSound(player, pos, SoundEvents.IRON_DOOR_CLOSE, SoundSource.BLOCKS, 1.0f, 1.0f);

        } else {
            Direction direction = player.getDirection();
            if (state.getValue(FACING) == direction.getOpposite()) {
                state = state.setValue(FACING, direction);
            }
            state = state.setValue(OPEN, Boolean.valueOf(true));
            level.setBlock(pos, state, 10);
            level.playSound(player, pos, SoundEvents.IRON_DOOR_OPEN, SoundSource.BLOCKS, 1.0f, 1.0f);
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos pos2, boolean istrue) {
        if (!level.isClientSide) {
            if (state.getValue(POWERED) != level.hasNeighborSignal(pos)) {
                level.setBlock(pos, state.setValue(POWERED, Boolean.valueOf(level.hasNeighborSignal(pos))).setValue(OPEN, Boolean.valueOf(level.hasNeighborSignal(pos))), 2);
                if (state.getValue(OPEN) != level.hasNeighborSignal(pos)) {
                    level.levelEvent(null,  openCloseSound(level.hasNeighborSignal(pos)), pos, 0);
                }
            }
        }
    }

    public int openCloseSound(boolean isopen) {
        return isopen ? 1005 : 1011;
    }





}
