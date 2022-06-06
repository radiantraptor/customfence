package com.raptor.customfence_forge.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import com.raptor.customfence_forge.init.ModBlocks;


public interface WeatheringFence extends net.minecraft.world.level.block.ChangeOverTimeBlock<WeatheringFence.WeatherState> {
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()

                .put(ModBlocks.cobblestoneCopperFence.get(), ModBlocks.cobblestoneExposedCopperFence.get())
                .put(ModBlocks.cobblestoneExposedCopperFence.get(), ModBlocks.cobblestoneWeatheredCopperFence.get())
                .put(ModBlocks.cobblestoneWeatheredCopperFence.get(), ModBlocks.cobblestoneOxidizedCopperFence.get())
                .put(ModBlocks.copperFenceGate.get(), ModBlocks.exposedCopperFenceGate.get())
                .put(ModBlocks.exposedCopperFenceGate.get(), ModBlocks.weatheredCopperFenceGate.get())
                .put(ModBlocks.weatheredCopperFenceGate.get(), ModBlocks.oxidizedCopperFenceGate.get())

                .put(ModBlocks.cobblestoneIronFence.get(), ModBlocks.cobblestoneExposedIronFence.get())
                .put(ModBlocks.cobblestoneExposedIronFence.get(), ModBlocks.cobblestoneWeatheredIronFence.get())
                .put(ModBlocks.cobblestoneWeatheredIronFence.get(), ModBlocks.cobblestoneOxidizedIronFence.get())
                .put(ModBlocks.ironFenceGate.get(), ModBlocks.exposedIronFenceGate.get())
                .put(ModBlocks.exposedIronFenceGate.get(), ModBlocks.weatheredIronFenceGate.get())
                .put(ModBlocks.weatheredIronFenceGate.get(), ModBlocks.oxidizedIronFenceGate.get())

                .build();
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
