package com.raptor.customfence_fabric.blocks;

import net.minecraft.class_2338;
import net.minecraft.class_2354;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_5819;


public class MetalFence extends class_2354 implements WeatheringFence {
    private final WeatheringFence.WeatherState weatherState;

    public MetalFence(WeatherState weatherstate, class_2251 settings) {
        super(settings);
        this.weatherState = weatherstate;
    }

    @Override
    public void method_9514(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        this.method_33621(state, world, pos, random);
    }


    @Override
    public boolean method_9542(class_2680 state) {
        return WeatheringFence.getIncreasedOxidationBlock(state.method_26204()).isPresent();
    }

    @Override
    public WeatheringFence.WeatherState method_33622() {
        return this.weatherState;
    }
}