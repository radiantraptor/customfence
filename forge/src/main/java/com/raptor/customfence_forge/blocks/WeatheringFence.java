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

                    .put(ModBlocksMetalFence.COBBLESTONE_COPPER_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_FENCE.get())
                    .put(ModBlocksMetalFence.COPPER_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_COPPER_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.EXPOSED_COPPER_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_COPPER_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.WEATHERED_COPPER_FENCE_GATE.get(), ModBlocksMetalFence.OXIDIZED_COPPER_FENCE_GATE.get())

                    .put(ModBlocksMetalFence.COBBLESTONE_IRON_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_FENCE.get())
                    .put(ModBlocksMetalFence.IRON_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_IRON_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.EXPOSED_IRON_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_IRON_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.WEATHERED_IRON_FENCE_GATE.get(), ModBlocksMetalFence.OXIDIZED_IRON_FENCE_GATE.get())

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
