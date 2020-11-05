package com.raptor.customfence;

import com.raptor.customfence.init.ModBlocks;
import com.raptor.customfence.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class Main {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "customfence";

    public Main() {
        //data values wood: 0 oak, 1 spruce, 2 birch, 3 jungle, 4 acacia, 5 dark_oak
        //blockstates Dateien 216 -> 354 -> 408
        //item 306 Dateien -> 498 -> 552
        //block 144 Ordner -> 234 -> 288
        //loot_tables, recipes 216 Dateien -> 354 -> 408

        // warped-birch warped-oak warped-spruce
        // jungle-crimson dark_oak-crimson oak-crimson

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

}
