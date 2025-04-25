package com.raptor.customfence_neoforge;

import com.raptor.customfence_neoforge.config.ConfigHandler;

import com.raptor.customfence_neoforge.init.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(Main.MOD_ID)
public class Main {

    public static final String MOD_ID = "customfence";
    public static String configData;

    public Main(IEventBus modEventBus, ModContainer modContainer) {

        ModItemTabs.CREATIVE_TAB_WOOD_GATE_BASIC.register(modEventBus);
        ModItemTabs.CREATIVE_TAB_WOOD_FENCE_BASIC.register(modEventBus);
        ModItemTabs.CREATIVE_TAB_WOOD_FENCE_GATE_ADVANCED.register(modEventBus);
        ModItemTabs.CREATIVE_TAB_WALLS.register(modEventBus);
        ModItemTabs.CREATIVE_TAB_METAL_FENCES.register(modEventBus);
        ModItemTabs.CREATIVE_TAB_ALL.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        // Registers and Loads Config File
        modContainer.registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_CONFIG);
        configData = ConfigHandler.loadConfig(ConfigHandler.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("customfence-common.toml"));

        ModItems.register(modEventBus);
        ModBlocksWoodGateBasic.register(modEventBus);
        ModBlocksWoodFenceBasic.register(modEventBus);
        ModBlocksWoodFenceGateAdvanced.register(modEventBus);
        ModBlocksWall.register(modEventBus);
        ModBlocksMetalFence.register(modEventBus);

        //ConfigHandler.COMMON.more_creative_tabs.get() funktioniert hier nicht
        if (configData.contains("more_creative_tabs=true")) {
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

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }



}
