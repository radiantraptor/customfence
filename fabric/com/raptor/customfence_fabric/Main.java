package com.raptor.customfence_fabric;

import com.raptor.customfence_fabric.config.ModTabConfig;
import com.raptor.customfence_fabric.init.ModBlocks;
import com.raptor.customfence_fabric.init.ModItemGroup;
import com.raptor.customfence_fabric.init.ModItems;
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

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.cobblestoneCopperFence, ModBlocks.cobblestoneExposedCopperFence);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.cobblestoneExposedCopperFence, ModBlocks.cobblestoneWeatheredCopperFence);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.cobblestoneWeatheredCopperFence, ModBlocks.cobblestoneOxidizedCopperFence);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.copperFenceGate, ModBlocks.exposedCopperFenceGate);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.exposedCopperFenceGate, ModBlocks.weatheredCopperFenceGate);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.weatheredCopperFenceGate, ModBlocks.oxidizedCopperFenceGate);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.cobblestoneIronFence, ModBlocks.cobblestoneExposedIronFence);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.cobblestoneExposedIronFence, ModBlocks.cobblestoneWeatheredIronFence);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.cobblestoneWeatheredIronFence, ModBlocks.cobblestoneOxidizedIronFence);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.ironFenceGate, ModBlocks.exposedIronFenceGate);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.exposedIronFenceGate, ModBlocks.weatheredIronFenceGate);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.weatheredIronFenceGate, ModBlocks.oxidizedIronFenceGate);


        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.cobblestoneCopperFence, ModBlocks.cobblestoneWaxedCopperFence);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.cobblestoneExposedCopperFence, ModBlocks.cobblestoneWaxedExposedCopperFence);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.cobblestoneWeatheredCopperFence, ModBlocks.cobblestoneWaxedWeatheredCopperFence);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.cobblestoneOxidizedCopperFence, ModBlocks.cobblestoneWaxedOxidizedCopperFence);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.copperFenceGate, ModBlocks.waxedCopperFenceGate);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.exposedCopperFenceGate, ModBlocks.waxedExposedCopperFenceGate);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.weatheredCopperFenceGate, ModBlocks.waxedWeatheredCopperFenceGate);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.oxidizedCopperFenceGate, ModBlocks.waxedOxidizedCopperFenceGate);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.cobblestoneIronFence, ModBlocks.cobblestoneWaxedIronFence);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.cobblestoneExposedIronFence, ModBlocks.cobblestoneWaxedExposedIronFence);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.cobblestoneWeatheredIronFence, ModBlocks.cobblestoneWaxedWeatheredIronFence);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.cobblestoneOxidizedIronFence, ModBlocks.cobblestoneWaxedOxidizedIronFence);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.ironFenceGate, ModBlocks.waxedIronFenceGate);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.exposedIronFenceGate, ModBlocks.waxedExposedIronFenceGate);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.weatheredIronFenceGate, ModBlocks.waxedWeatheredIronFenceGate);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.oxidizedIronFenceGate, ModBlocks.waxedOxidizedIronFenceGate);

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
