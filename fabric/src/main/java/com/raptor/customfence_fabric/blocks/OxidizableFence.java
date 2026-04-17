package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.init.ModBlocksMetalFence;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class OxidizableFence {

    public static void oxidizingFences() {

        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_COPPER_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE);

        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COPPER_MANSION_FENCE_GATE, ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE, ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE, ModBlocksMetalFence.OXIDIZED_COPPER_MANSION_FENCE_GATE);

        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_IRON_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE, ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE);

        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.IRON_MANSION_FENCE_GATE, ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE, ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE, ModBlocksMetalFence.OXIDIZED_IRON_MANSION_FENCE_GATE);


        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_COPPER_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE);

        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COPPER_MESH_FENCE_GATE, ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE, ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE, ModBlocksMetalFence.OXIDIZED_COPPER_MESH_FENCE_GATE);

        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_IRON_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE, ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MESH_FENCE);

        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.IRON_MESH_FENCE_GATE, ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE, ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE);
        OxidizableBlocksRegistry.registerNextStage(ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE, ModBlocksMetalFence.OXIDIZED_IRON_MESH_FENCE_GATE);

    }

}
