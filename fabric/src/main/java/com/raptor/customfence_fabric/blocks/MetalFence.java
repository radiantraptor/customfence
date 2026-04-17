package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.config.ModConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public class MetalFence extends FenceBlock implements WeatheringCopper {

    public final WeatheringCopper.WeatherState weatherState;

    public MetalFence(WeatherState weatherState, Properties properties) {
        super(properties);
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

}