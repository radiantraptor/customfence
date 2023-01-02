package com.raptor.customfence_forge;

import com.raptor.customfence_forge.config.ModTabConfig;
import com.raptor.customfence_forge.init.*;
import com.raptor.customfence_forge.util.handler.ConfigHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid= Main.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class Main {

    @SuppressWarnings("WeakerAccess")
    public static final String MOD_ID = "customfence";
    public static IEventBus MOD_EVENT_BUS;

    public Main() {

        // Registers and Loads Config File
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_CONFIG);
        ConfigHandler.loadConfig(ConfigHandler.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("customfence-common.toml"));

        MOD_EVENT_BUS = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocksWoodenFence.WOODEN_FENCE_BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocksWall.WALL_BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocksMetalFence.METAL_FENCE_BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());


        if (ModTabConfig.more_creative_tabs.get().booleanValue() == true) {
            MOD_EVENT_BUS.addListener(ModItemTabs::registerTabWoodenFence);
            MOD_EVENT_BUS.addListener(ModItemTabs::registerTabWall);
            MOD_EVENT_BUS.addListener(ModItemTabs::registerTabMetalFence);
        }
        else {
            MOD_EVENT_BUS.addListener(ModItemTabs::registerTab);
            MOD_EVENT_BUS.addListener(ModItemTabs::addItemsToTab);
        }

    }

}
