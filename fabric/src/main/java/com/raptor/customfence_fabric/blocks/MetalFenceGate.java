package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.config.ModConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class MetalFenceGate extends FenceGateBlock implements WeatheringCopper {

    public final WeatheringCopper.WeatherState weatherState;

    public MetalFenceGate(WeatheringCopper.WeatherState weatherState, WoodType woodtype, BlockBehaviour.Properties properties) {
        super(woodtype, properties);
        this.weatherState = weatherState;
    }

    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }

    public boolean isRandomlyTicking(BlockState state) {
        if (ModConfig.metal_oxidation == true) {
            return WeatheringCopper.getNext(state.getBlock()).isPresent();
        }
        else {
            return false;
        }
    }

    public WeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }

    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult result) {

        if (state.getValue(OPEN)) {
            state = state.setValue(OPEN, false);
            level.setBlock(pos, state, 10);
            level.playSound(player, pos, SoundEvents.IRON_DOOR_CLOSE, SoundSource.BLOCKS, 1.0f, level.getRandom().nextFloat() * 0.1F + 0.9F);

        } else {
            Direction direction = player.getDirection();
            if (state.getValue(FACING) == direction.getOpposite()) {
                state = state.setValue(FACING, direction);
            }
            state = state.setValue(OPEN, true);
            level.setBlock(pos, state, 10);
            level.playSound(player, pos, SoundEvents.IRON_DOOR_OPEN, SoundSource.BLOCKS, 1.0f, level.getRandom().nextFloat() * 0.1F + 0.9F);
        }
        return InteractionResult.SUCCESS;
    }

    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, @Nullable Orientation orientation, boolean notify) {
        if (!level.isClientSide()) {
            boolean hasPower = level.hasNeighborSignal(pos);
            if (state.getValue(POWERED) != hasPower) {
                level.setBlock(pos, (state.setValue(POWERED, hasPower)).setValue(OPEN, hasPower), 2);
                if (state.getValue(OPEN) != hasPower) {
                    level.playSound((Entity)null, pos, hasPower ? SoundEvents.IRON_DOOR_OPEN : SoundEvents.IRON_DOOR_CLOSE, SoundSource.BLOCKS, 1.0f, level.getRandom().nextFloat() * 0.1F + 0.9F);
                    level.gameEvent((Entity)null, hasPower ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
                }
            }
        }
    }

    public int openCloseSound(boolean isopen) {
        return isopen ? 1005 : 1011;
    }

}
