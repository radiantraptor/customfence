package com.raptor.customfence_fabric.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;


public class MetalFence extends FenceBlock implements WeatheringFence {
    private final WeatheringFence.WeatherState weatherState;

    public MetalFence(WeatherState weatherstate, Settings settings) {
        super(settings);
        this.weatherState = weatherstate;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }


    @Override
    public boolean hasRandomTicks(BlockState state) {
        return WeatheringFence.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public WeatheringFence.WeatherState getDegradationLevel() {
        return this.weatherState;
    }
}