package com.raptor.customfence_fabric;

import com.raptor.customfence_fabric.init.ModBlocks;
import com.raptor.customfence_fabric.init.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "customfence";

    @Override
    public void onInitialize() {

        ModBlocks.registerBlocks();
        ModItems.registerItems();

    }

}
