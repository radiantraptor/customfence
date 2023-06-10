package com.raptor.customfence_forge;

import com.raptor.customfence_forge.config.ModTabConfig;
import com.raptor.customfence_forge.init.*;
import com.raptor.customfence_forge.mapping.NewMappings;
import com.raptor.customfence_forge.util.handler.ConfigHandler;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.MissingMappingsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid= Main.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class Main {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "customfence";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WOODEN_FENCES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WALLS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_METAL_FENCES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_ALL = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public Main() {
        IEventBus MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        CREATIVE_TAB_WOODEN_FENCES.register(MOD_EVENT_BUS);
        CREATIVE_TAB_WALLS.register(MOD_EVENT_BUS);
        CREATIVE_TAB_METAL_FENCES.register(MOD_EVENT_BUS);
        CREATIVE_TAB_ALL.register(MOD_EVENT_BUS);

        // Registers and Loads Config File
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_CONFIG);
        ConfigHandler.loadConfig(ConfigHandler.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("customfence-common.toml"));

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocksWoodenFence.WOODEN_FENCE_BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocksWall.WALL_BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocksMetalFence.METAL_FENCE_BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());


        if (ModTabConfig.more_creative_tabs.get().booleanValue() == true) {
            ModItemTabs.registerTabWoodenFence();
            ModItemTabs.registerTabWall();
            ModItemTabs.registerTabMetalFence();
        }
        else {
            ModItemTabs.registerTabAll();
        }

        MinecraftForge.EVENT_BUS.register(this);

    }

    @SubscribeEvent
    void missingBlocks(MissingMappingsEvent event) {
        NewMappings.missingBlocks(event);
    }

    @SubscribeEvent
    void missingItems(MissingMappingsEvent event) {
        NewMappings.missingItems(event);
    }

}
