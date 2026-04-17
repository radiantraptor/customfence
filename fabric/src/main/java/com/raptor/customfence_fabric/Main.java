package com.raptor.customfence_fabric;

import com.raptor.customfence_fabric.blocks.OxidizableFence;
import com.raptor.customfence_fabric.blocks.WaxableFence;
import com.raptor.customfence_fabric.config.ModConfig;
import com.raptor.customfence_fabric.init.*;
import net.fabricmc.api.ModInitializer;

import java.util.EventListener;

public class Main implements ModInitializer {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "customfence";
    public static EventListener MOD_EVENT_BUS;

    @Override
    public void onInitialize() {

        ModConfig.load();

        ModItems.registerModItems();
        ModBlocksWoodGateBasic.registerModBlocks();
        ModBlocksWoodFenceBasic.registerModBlocks();
        ModBlocksWoodFenceGateAdvanced.registerModBlocks();
        ModBlocksWall.registerModBlocks();
        ModBlocksMetalFence.registerModBlocks();
        ModBlocksGlassFence.registerModBlocks();
        OxidizableFence.oxidizingFences();
        WaxableFence.waxingFences();

        if (ModConfig.more_creative_tabs == true) {
            ModItemGroup.moreTabs();
        }
        else {
            ModItemGroup.oneTab();
        }


    }



}
