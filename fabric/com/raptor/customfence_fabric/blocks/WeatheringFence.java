package com.raptor.customfence_fabric.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

import com.raptor.customfence_fabric.config.ModTabConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Degradable;
import com.raptor.customfence_fabric.init.ModBlocks;


public interface WeatheringFence extends Degradable<WeatheringFence.WeatherState> {
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {

        if (ModTabConfig.metal_oxidation == true) {
            return ImmutableBiMap.<Block, Block>builder()

                    .put(ModBlocks.cobblestoneCopperFence, ModBlocks.cobblestoneExposedCopperFence)
                    .put(ModBlocks.cobblestoneExposedCopperFence, ModBlocks.cobblestoneWeatheredCopperFence)
                    .put(ModBlocks.cobblestoneWeatheredCopperFence, ModBlocks.cobblestoneOxidizedCopperFence)
                    .put(ModBlocks.copperFenceGate, ModBlocks.exposedCopperFenceGate)
                    .put(ModBlocks.exposedCopperFenceGate, ModBlocks.weatheredCopperFenceGate)
                    .put(ModBlocks.weatheredCopperFenceGate, ModBlocks.oxidizedCopperFenceGate)

                    .put(ModBlocks.cobblestoneIronFence, ModBlocks.cobblestoneExposedIronFence)
                    .put(ModBlocks.cobblestoneExposedIronFence, ModBlocks.cobblestoneWeatheredIronFence)
                    .put(ModBlocks.cobblestoneWeatheredIronFence, ModBlocks.cobblestoneOxidizedIronFence)
                    .put(ModBlocks.ironFenceGate, ModBlocks.exposedIronFenceGate)
                    .put(ModBlocks.exposedIronFenceGate, ModBlocks.weatheredIronFenceGate)
                    .put(ModBlocks.weatheredIronFenceGate, ModBlocks.oxidizedIronFenceGate)

                    .build();
        }
        else {
            return ImmutableBiMap.<Block, Block>builder()

                    .build();
        }



    });

    static Optional<Block> getIncreasedOxidationBlock(Block block) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
    }

    default Optional<BlockState> getDegradationResult(BlockState state) {
        return getIncreasedOxidationBlock(state.getBlock()).map(block ->
                block.getStateWithProperties(state));
    }

    default float getDegradationChanceMultiplier() {
        return this.getDegradationLevel() == WeatheringFence.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    enum WeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;
    }
}