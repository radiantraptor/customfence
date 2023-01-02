package com.raptor.customfence_fabric.blocks;

import net.minecraft.advancement.Advancement;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.function.Consumer;

public class MetalFenceGate extends FenceGateBlock implements WeatheringFence, Consumer<Consumer<Advancement>> {
    private final WeatheringFence.WeatherState weatherState;

    public MetalFenceGate(WeatherState weatherstate, Settings settings, SoundEvent soundevent1, SoundEvent soundevent2) {
        super(settings, soundevent1, soundevent2);
        this.weatherState = weatherstate;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return WeatheringFence.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public WeatheringFence.WeatherState getDegradationLevel() {
        return this.weatherState;
    }



    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult result) {

        if (state.get(OPEN)) {
            state = state.with(OPEN, false);
            world.setBlockState(pos, state, 10);
            world.playSound(player, pos, SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundCategory.BLOCKS, 1.0f, 1.0f);

        } else {
            Direction direction = player.getHorizontalFacing();
            if (state.get(FACING) == direction.getOpposite()) {
                state = state.with(FACING, direction);
            }
            state = state.with(OPEN, true);
            world.setBlockState(pos, state, 10);
            world.playSound(player, pos, SoundEvents.BLOCK_IRON_DOOR_OPEN, SoundCategory.BLOCKS, 1.0f, 1.0f);
        }
        return ActionResult.success(world.isClient);
    }

    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos pos2, boolean istrue) {
        if (!world.isClient) {
            if (state.get(POWERED) != world.isReceivingRedstonePower(pos)) {
                world.setBlockState(pos, (state.with(POWERED, world.isReceivingRedstonePower(pos))).with(OPEN, world.isReceivingRedstonePower(pos)), 2);
                if (state.get(OPEN) != world.isReceivingRedstonePower(pos)) {
                    world.syncWorldEvent(null, openCloseSound(world.isReceivingRedstonePower(pos)), pos, 0);
                    //world.emitGameEvent(world.isReceivingRedstonePower(pos) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
                }
            }
        }
    }

    public int openCloseSound(boolean isopen) {
        return isopen ? 1005 : 1011;
    }

    @Override
    public void accept(Consumer<Advancement> advancementConsumer) {

    }

}
