package com.raptor.customfence_neoforge.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.raptor.customfence_neoforge.init.ModBlocksMetalFence;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public class WaxedMetal {

    public static final Supplier<BiMap<Block, Block>> WAXABLES = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()

                .put(ModBlocksMetalFence.COBBLESTONE_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_COPPER_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_COPPER_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_COPPER_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_COPPER_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_COPPER_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_EXPOSED_COPPER_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_WEATHERED_COPPER_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.OXIDIZED_COPPER_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_OXIDIZED_COPPER_MANSION_FENCE_GATE.get())

                .put(ModBlocksMetalFence.COBBLESTONE_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_IRON_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_IRON_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_IRON_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_IRON_MANSION_FENCE.get())
                .put(ModBlocksMetalFence.IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_IRON_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_EXPOSED_IRON_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_WEATHERED_IRON_MANSION_FENCE_GATE.get())
                .put(ModBlocksMetalFence.OXIDIZED_IRON_MANSION_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_OXIDIZED_IRON_MANSION_FENCE_GATE.get())

                .put(ModBlocksMetalFence.COBBLESTONE_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_IRON_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_IRON_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_IRON_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_IRON_MESH_FENCE.get())
                .put(ModBlocksMetalFence.IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_IRON_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_EXPOSED_IRON_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_WEATHERED_IRON_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.OXIDIZED_IRON_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_OXIDIZED_IRON_MESH_FENCE_GATE.get())

                .put(ModBlocksMetalFence.COBBLESTONE_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_COPPER_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_COPPER_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_COPPER_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE.get(), ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_COPPER_MESH_FENCE.get())
                .put(ModBlocksMetalFence.COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_COPPER_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_EXPOSED_COPPER_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_WEATHERED_COPPER_MESH_FENCE_GATE.get())
                .put(ModBlocksMetalFence.OXIDIZED_COPPER_MESH_FENCE_GATE.get(), ModBlocksMetalFence.WAXED_OXIDIZED_COPPER_MESH_FENCE_GATE.get())

                .build();
        });
    public static final Supplier<BiMap<Block, Block>> WAX_OFF_BY_BLOCK = Suppliers.memoize(() -> {
        return WaxedMetal.WAXABLES.get().inverse();
    });


    public static Optional<BlockState> getWaxed(BlockState state) {
        return Optional.ofNullable(WaxedMetal.WAXABLES.get().get(state.getBlock())).map(block -> block.withPropertiesOf(state));
    }

    public static Optional<BlockState> getUnWaxed(BlockState state) {
        return Optional.ofNullable(WaxedMetal.WAXABLES.get().inverse().get(state.getBlock())).map(block -> block.withPropertiesOf(state));
    }

}
