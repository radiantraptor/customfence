package com.raptor.customfence_fabric;

import com.raptor.customfence_fabric.config.ModTabConfig;
import com.raptor.customfence_fabric.init.ModBlocks;
import com.raptor.customfence_fabric.init.ModItemGroup;
import com.raptor.customfence_fabric.init.ModItems;
import com.raptor.customfence_fabric.mixin.DefaultedRegistryMixin;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

import java.util.EventListener;

public class Main implements ModInitializer {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "customfence";
    public static EventListener MOD_EVENT_BUS;

    @Override
    public void onInitialize() {
        ModTabConfig.load();

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_COPPER_FENCE, ModBlocks.COBBLESTONE_EXPOSED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_EXPOSED_COPPER_FENCE, ModBlocks.COBBLESTONE_WEATHERED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_WEATHERED_COPPER_FENCE, ModBlocks.COBBLESTONE_OXIDIZED_COPPER_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_FENCE_GATE, ModBlocks.EXPOSED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE_GATE, ModBlocks.WEATHERED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE_GATE, ModBlocks.OXIDIZED_COPPER_FENCE_GATE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_IRON_FENCE, ModBlocks.COBBLESTONE_EXPOSED_IRON_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_EXPOSED_IRON_FENCE, ModBlocks.COBBLESTONE_WEATHERED_IRON_FENCE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COBBLESTONE_WEATHERED_IRON_FENCE, ModBlocks.COBBLESTONE_OXIDIZED_IRON_FENCE);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.IRON_FENCE_GATE, ModBlocks.EXPOSED_IRON_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_IRON_FENCE_GATE, ModBlocks.WEATHERED_IRON_FENCE_GATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_IRON_FENCE_GATE, ModBlocks.OXIDIZED_IRON_FENCE_GATE);


        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COBBLESTONE_COPPER_FENCE, ModBlocks.COBBLESTONE_WAXED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COBBLESTONE_EXPOSED_COPPER_FENCE, ModBlocks.COBBLESTONE_WAXED_EXPOSED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COBBLESTONE_WEATHERED_COPPER_FENCE, ModBlocks.COBBLESTONE_WAXED_WEATHERED_COPPER_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COBBLESTONE_OXIDIZED_COPPER_FENCE, ModBlocks.COBBLESTONE_WAXED_OXIDIZED_COPPER_FENCE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_FENCE_GATE, ModBlocks.WAXED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_FENCE_GATE, ModBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_FENCE_GATE, ModBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_FENCE_GATE, ModBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COBBLESTONE_IRON_FENCE, ModBlocks.COBBLESTONE_WAXED_IRON_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COBBLESTONE_EXPOSED_IRON_FENCE, ModBlocks.COBBLESTONE_WAXED_EXPOSED_IRON_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COBBLESTONE_WEATHERED_IRON_FENCE, ModBlocks.COBBLESTONE_WAXED_WEATHERED_IRON_FENCE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COBBLESTONE_OXIDIZED_IRON_FENCE, ModBlocks.COBBLESTONE_WAXED_OXIDIZED_IRON_FENCE);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.IRON_FENCE_GATE, ModBlocks.WAXED_IRON_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_IRON_FENCE_GATE, ModBlocks.WAXED_EXPOSED_IRON_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_IRON_FENCE_GATE, ModBlocks.WAXED_WEATHERED_IRON_FENCE_GATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_IRON_FENCE_GATE, ModBlocks.WAXED_OXIDIZED_IRON_FENCE_GATE);

        ModBlocks.registerBlocks();
        ModItems.registerItems();

        if (ModTabConfig.more_creative_tabs == true) {
            ModItemGroup.threeTabs();
        }
        else {
            ModItemGroup.oneTab();
        }


    }

}
