package com.raptor.customfence_fabric;

import com.raptor.customfence_fabric.blocks.OxidizableFence;
import com.raptor.customfence_fabric.blocks.WaxableFence;
import com.raptor.customfence_fabric.config.ModTabConfig;
import com.raptor.customfence_fabric.init.ModItemGroup;
import com.raptor.customfence_fabric.init.ModItems;
import net.fabricmc.api.ModInitializer;

import java.util.EventListener;

public class Main implements ModInitializer {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "customfence";
    public static EventListener MOD_EVENT_BUS;

    @Override
    public void onInitialize() {
        ModTabConfig.load();

        //ModBlocks.registerBlocksWoodenFenceGate(string, fencegate);
        ModItems.registerItems();

        OxidizableFence.oxidizingFences();
        WaxableFence.waxingFences();

        if (ModTabConfig.more_creative_tabs == true) {
            ModItemGroup.threeTabs();
        }
        else {
            ModItemGroup.oneTab();
        }


    }

}
