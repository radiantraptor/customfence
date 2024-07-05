package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.init.ModBlocks;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class OxidizableFence {

    public static void oxidizingFences() {

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_COPPER_MANSION_FENCE, ModBlocks.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE, ModBlocks.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE, ModBlocks.COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_MANSION_FENCE_GATE, ModBlocks.EXPOSED_COPPER_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_MANSION_FENCE_GATE, ModBlocks.WEATHERED_COPPER_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_MANSION_FENCE_GATE, ModBlocks.OXIDIZED_COPPER_MANSION_FENCE_GATE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_IRON_MANSION_FENCE, ModBlocks.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE, ModBlocks.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE, ModBlocks.COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.IRON_MANSION_FENCE_GATE, ModBlocks.EXPOSED_IRON_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_IRON_MANSION_FENCE_GATE, ModBlocks.WEATHERED_IRON_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_IRON_MANSION_FENCE_GATE, ModBlocks.OXIDIZED_IRON_MANSION_FENCE_GATE);


        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_COPPER_MESH_FENCE, ModBlocks.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE, ModBlocks.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE, ModBlocks.COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_MESH_FENCE_GATE, ModBlocks.EXPOSED_COPPER_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_MESH_FENCE_GATE, ModBlocks.WEATHERED_COPPER_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_MESH_FENCE_GATE, ModBlocks.OXIDIZED_COPPER_MESH_FENCE_GATE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_IRON_MESH_FENCE, ModBlocks.COBBLESTONE_EXPOSED_IRON_MESH_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_EXPOSED_IRON_MESH_FENCE, ModBlocks.COBBLESTONE_WEATHERED_IRON_MESH_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_WEATHERED_IRON_MESH_FENCE, ModBlocks.COBBLESTONE_OXIDIZED_IRON_MESH_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.IRON_MESH_FENCE_GATE, ModBlocks.EXPOSED_IRON_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_IRON_MESH_FENCE_GATE, ModBlocks.WEATHERED_IRON_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_IRON_MESH_FENCE_GATE, ModBlocks.OXIDIZED_IRON_MESH_FENCE_GATE);

    }

}
