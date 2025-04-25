package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.init.ModBlocksMetalFence;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class OxidizableFence {

    public static void oxidizingFences() {

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_COPPER_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COPPER_MANSION_FENCE_GATE, ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE, ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE, ModBlocksMetalFence.OXIDIZED_COPPER_MANSION_FENCE_GATE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_IRON_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.IRON_MANSION_FENCE_GATE, ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE, ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE, ModBlocksMetalFence.OXIDIZED_IRON_MANSION_FENCE_GATE);


        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_COPPER_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COPPER_MESH_FENCE_GATE, ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE, ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE, ModBlocksMetalFence.OXIDIZED_COPPER_MESH_FENCE_GATE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_IRON_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MESH_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.IRON_MESH_FENCE_GATE, ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE, ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE, ModBlocksMetalFence.OXIDIZED_IRON_MESH_FENCE_GATE);

    }

}
