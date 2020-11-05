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

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

}
