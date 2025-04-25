package com.raptor.customfence_neoforge.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;

import com.raptor.customfence_neoforge.Main;
import com.raptor.customfence_neoforge.config.ConfigHandler;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import com.raptor.customfence_neoforge.init.ModBlocksMetalFence;


public interface WeatheringFence extends net.minecraft.world.level.block.ChangeOverTimeBlock<WeatheringFence.WeatherState> {

    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        //ConfigHandler.COMMON.metal_oxidation.get() funktioniert hier nicht
        if (Main.configData.contains("metal_oxidation=true")) {
            return ImmutableBiMap.<Block, Block>builder()

                    .put(ModBlocksMetalFence.COBBLESTONE_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE.get())
                    .put(ModBlocksMetalFence.COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.OXIDIZED_COPPER_MANSION_FENCE_GATE.get())

                    .put(ModBlocksMetalFence.COBBLESTONE_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE.get())
                    .put(ModBlocksMetalFence.IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.OXIDIZED_IRON_MANSION_FENCE_GATE.get())

                    .put(ModBlocksMetalFence.COBBLESTONE_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE.get())
                    .put(ModBlocksMetalFence.COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.OXIDIZED_COPPER_MESH_FENCE_GATE.get())

                    .put(ModBlocksMetalFence.COBBLESTONE_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE.get())
                    .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MESH_FENCE.get())
                    .put(ModBlocksMetalFence.IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE.get())
                    .put(ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.OXIDIZED_IRON_MESH_FENCE_GATE.get())

                    .build();
        }
        else {
            return ImmutableBiMap.<Block, Block>builder()
                    .build();
        }
    });

    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {

        return ImmutableBiMap.<Block, Block>builder()

                .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_COPPER_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.COPPER_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.OXIDIZED_COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE.get())

                .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_IRON_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.IRON_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.OXIDIZED_IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE.get())

                .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_COPPER_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE.get())
                .put(ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.COPPER_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.OXIDIZED_COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE.get())

                .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_IRON_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE.get())
                .put(ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.IRON_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.OXIDIZED_IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE.get())

                .build();

    });


    static Optional<Block> getPrevious(Block block) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(block));
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map((block) -> block.withPropertiesOf(state));
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
