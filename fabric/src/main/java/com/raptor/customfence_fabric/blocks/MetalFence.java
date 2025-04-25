package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.config.ModConfig;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;


public class MetalFence extends FenceBlock implements Oxidizable {

    public final Oxidizable.OxidationLevel oxidationLevel;

    public MetalFence(OxidationLevel oxidationLevel, Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        if (ModConfig.metal_oxidation == true) {
            return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
        }
        else {
            return false;
        }
    }

    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }

}