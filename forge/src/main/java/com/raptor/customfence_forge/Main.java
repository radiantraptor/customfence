package com.raptor.customfence_forge;

import com.raptor.customfence_forge.config.ConfigHandler;
import com.raptor.customfence_forge.init.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(Main.MOD_ID)
public class Main {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "customfence";


    public Main(FMLJavaModLoadingContext modLoadingContext) {
        BusGroup MOD_EVENT_BUS = modLoadingContext.getModBusGroup();
        ModItemTabs.CREATIVE_TAB_WOOD_GATE_BASIC.register(MOD_EVENT_BUS);
        ModItemTabs.CREATIVE_TAB_WOOD_FENCE_BASIC.register(MOD_EVENT_BUS);
        ModItemTabs.CREATIVE_TAB_WOOD_FENCE_GATE_ADVANCED.register(MOD_EVENT_BUS);
        ModItemTabs.CREATIVE_TAB_WALLS.register(MOD_EVENT_BUS);
        ModItemTabs.CREATIVE_TAB_METAL_FENCES.register(MOD_EVENT_BUS);
        ModItemTabs.CREATIVE_TAB_ALL.register(MOD_EVENT_BUS);

        // Registers and Loads Config File
        modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_CONFIG);
        ConfigHandler.loadConfig(ConfigHandler.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("customfence-common.toml"));
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ModItems.register(MOD_EVENT_BUS);
        ModBlocksWoodFenceBasic.register(MOD_EVENT_BUS);
        ModBlocksWoodGateBasic.register(MOD_EVENT_BUS);
        ModBlocksWoodFenceGateAdvanced.register(MOD_EVENT_BUS);
        ModBlocksWall.register(MOD_EVENT_BUS);
        ModBlocksMetalFence.register(MOD_EVENT_BUS);

        //MinecraftForge.EVENT_BUS.register(this);
        //FMLLoadCompleteEvent.getBus(MOD_EVENT_BUS).addListener(this::loadComplete);

        if (ConfigHandler.COMMON.more_creative_tabs.get() == true) {
            ModItemTabs.registerTabWoodGateBasic();
            ModItemTabs.registerTabWoodFenceBasic();
            ModItemTabs.registerTabWoodFenceGateAdvanced();
            ModItemTabs.registerTabWall();
            ModItemTabs.registerTabMetalFence();
        }
        else {
            ModItemTabs.registerTabAll();
        }


    }

    //public void loadComplete(FMLLoadCompleteEvent event) {
    //    ModBlocksMetalFence.registerEvents();
    //}

}
