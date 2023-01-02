package com.raptor.customfence_forge.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

import com.raptor.customfence_forge.config.ModTabConfig;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import com.raptor.customfence_forge.init.ModBlocksMetalFence;


public interface WeatheringFence extends net.minecraft.world.level.block.ChangeOverTimeBlock<WeatheringFence.WeatherState> {

    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        if (ModTabConfig.metal_oxidation.get().booleanValue() == true) {
            return ImmutableBiMap.<Block, Block>builder()

                    .put(ModBlocksMetalFence.cobblestoneCopperFence.get(), ModBlocksMetalFence.cobblestoneExposedCopperFence.get())
                    .put(ModBlocksMetalFence.cobblestoneExposedCopperFence.get(), ModBlocksMetalFence.cobblestoneWeatheredCopperFence.get())
                    .put(ModBlocksMetalFence.cobblestoneWeatheredCopperFence.get(), ModBlocksMetalFence.cobblestoneOxidizedCopperFence.get())
                    .put(ModBlocksMetalFence.copperFenceGate.get(), ModBlocksMetalFence.exposedCopperFenceGate.get())
                    .put(ModBlocksMetalFence.exposedCopperFenceGate.get(), ModBlocksMetalFence.weatheredCopperFenceGate.get())
                    .put(ModBlocksMetalFence.weatheredCopperFenceGate.get(), ModBlocksMetalFence.oxidizedCopperFenceGate.get())

                    .put(ModBlocksMetalFence.cobblestoneIronFence.get(), ModBlocksMetalFence.cobblestoneExposedIronFence.get())
                    .put(ModBlocksMetalFence.cobblestoneExposedIronFence.get(), ModBlocksMetalFence.cobblestoneWeatheredIronFence.get())
                    .put(ModBlocksMetalFence.cobblestoneWeatheredIronFence.get(), ModBlocksMetalFence.cobblestoneOxidizedIronFence.get())
                    .put(ModBlocksMetalFence.ironFenceGate.get(), ModBlocksMetalFence.exposedIronFenceGate.get())
                    .put(ModBlocksMetalFence.exposedIronFenceGate.get(), ModBlocksMetalFence.weatheredIronFenceGate.get())
                    .put(ModBlocksMetalFence.weatheredIronFenceGate.get(), ModBlocksMetalFence.oxidizedIronFenceGate.get())

                    .build();
        }
        else {
            return ImmutableBiMap.<Block, Block>builder()
                    .build();
        }
    });

    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
        return NEXT_BY_BLOCK.get().inverse();
    });


    static Optional<Block> getPrevious(Block block) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(block));
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map((block) -> {
            return block.withPropertiesOf(state);
        });
    }

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map((block) -> {
            return block.withPropertiesOf(state);
        });
    }

    default float getChanceModifier() {
        return this.getAge() == WeatheringFence.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    enum WeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;
    }
}
