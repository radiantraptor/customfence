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

                    .put(ModBlocks.COBBLESTONE_COPPER_FENCE, ModBlocks.COBBLESTONE_EXPOSED_COPPER_FENCE)
                    .put(ModBlocks.COBBLESTONE_EXPOSED_COPPER_FENCE, ModBlocks.COBBLESTONE_WEATHERED_COPPER_FENCE)
                    .put(ModBlocks.COBBLESTONE_WEATHERED_COPPER_FENCE, ModBlocks.COBBLESTONE_OXIDIZED_COPPER_FENCE)
                    .put(ModBlocks.COPPER_FENCE_GATE, ModBlocks.EXPOSED_COPPER_FENCE_GATE)
                    .put(ModBlocks.EXPOSED_COPPER_FENCE_GATE, ModBlocks.WEATHERED_COPPER_FENCE_GATE)
                    .put(ModBlocks.WEATHERED_COPPER_FENCE_GATE, ModBlocks.OXIDIZED_COPPER_FENCE_GATE)

                    .put(ModBlocks.COBBLESTONE_IRON_FENCE, ModBlocks.COBBLESTONE_EXPOSED_IRON_FENCE)
                    .put(ModBlocks.COBBLESTONE_EXPOSED_IRON_FENCE, ModBlocks.COBBLESTONE_WEATHERED_IRON_FENCE)
                    .put(ModBlocks.COBBLESTONE_WEATHERED_IRON_FENCE, ModBlocks.COBBLESTONE_OXIDIZED_IRON_FENCE)
                    .put(ModBlocks.IRON_FENCE_GATE, ModBlocks.EXPOSED_IRON_FENCE_GATE)
                    .put(ModBlocks.EXPOSED_IRON_FENCE_GATE, ModBlocks.WEATHERED_IRON_FENCE_GATE)
                    .put(ModBlocks.WEATHERED_IRON_FENCE_GATE, ModBlocks.OXIDIZED_IRON_FENCE_GATE)

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