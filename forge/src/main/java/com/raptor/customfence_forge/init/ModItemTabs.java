package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Field;

public class ModItemTabs {

    public static CreativeModeTab tabWoodenFences;
    public static CreativeModeTab tabWalls;
    public static CreativeModeTab tabMetalFences;

    public static void registerTabWoodenFence(CreativeModeTabEvent.Register event) {

        tabWoodenFences = event.registerCreativeModeTab(new ResourceLocation(Main.MOD_ID, "customfence_1_wooden_fence"), builder -> {
            builder
                    .icon(() -> new ItemStack(ModItems.spruceHHHOak.get()))
                    .title(Component.translatable("itemGroup.customfence.tab_customfence_wooden_fence"))
                    .displayItems((featureFlags, output, hasOp) -> {
                        for (Field field : ModBlocksWoodenFence.class.getFields()) {
                            if (field.getType() != RegistryObject.class) continue;
                            try {
                                RegistryObject<Block> block = (RegistryObject) field.get(null);
                                output.accept(new ItemStack(block.get()));
                            } catch (IllegalAccessException e) {
                            }

                        }
                    });
        });
    }

    public static void registerTabWall(CreativeModeTabEvent.Register event) {

        tabWalls = event.registerCreativeModeTab(new ResourceLocation(Main.MOD_ID, "customfence_2_wall"), builder -> {
            builder
                    .icon(() -> new ItemStack(ModItems.stoneModern.get()))
                    .title(Component.translatable("itemGroup.customfence.tab_customfence_wall"))
                    .displayItems((featureFlags, output, hasOp) -> {
                        for (Field field : ModBlocksWall.class.getFields()) {
                            if (field.getType() != RegistryObject.class) continue;
                            try {
                                RegistryObject<Block> block = (RegistryObject) field.get(null);
                                output.accept(new ItemStack(block.get()));
                            } catch (IllegalAccessException e) {
                            }

                        }
                    });
        });
    }

    public static void registerTabMetalFence(CreativeModeTabEvent.Register event) {

        tabMetalFences = event.registerCreativeModeTab(new ResourceLocation(Main.MOD_ID, "customfence_3_metal_fence"), builder -> {builder
                .icon(() -> new ItemStack(ModItems.cobblestoneIronFence.get()))
                .title(Component.translatable("itemGroup.customfence.tab_customfence_metal_fence"))
                .displayItems((featureFlags, output, hasOp) -> {
                    for (Field field : ModBlocksMetalFence.class.getFields()) {
                        if (field.getType() != RegistryObject.class) continue;
                        try
                        {
                            RegistryObject<Block> block = (RegistryObject)field.get(null);
                            output.accept(new ItemStack(block.get()));
                        }
                        catch (IllegalAccessException e) {}

                    }
                });
        });

    }


    public static void registerTab(CreativeModeTabEvent.Register event) {
        ModItemTabs.tabWoodenFences = event.registerCreativeModeTab(new ResourceLocation(Main.MOD_ID, "customfence"), builder -> {builder
                .icon(() -> new ItemStack(ModItems.spruceHHHOak.get()))
                .title(Component.translatable("itemGroup.customfence.tab_customfence"))
                .displayItems((featureFlags, output, hasOp) -> {
                    for (Field field : ModBlocksWoodenFence.class.getFields()) {
                        if (field.getType() != RegistryObject.class) continue;
                        try
                        {
                            RegistryObject<Block> block = (RegistryObject)field.get(null);
                            output.accept(new ItemStack(block.get()));
                        }
                        catch (IllegalAccessException e) {}

                    }
                });
        });
    }

    @SubscribeEvent
    public static void addItemsToTab(CreativeModeTabEvent.BuildContents event) {

        if (event.getTab() == ModItemTabs.tabWoodenFences) {
            for (Field field : ModBlocksWall.class.getFields()) {
                if (field.getType() != RegistryObject.class) continue;
                try
                {
                    RegistryObject<Block> block = (RegistryObject)field.get(null);
                    event.accept(new ItemStack(block.get()));
                }
                catch (IllegalAccessException e) {}

            }
            for (Field field : ModBlocksMetalFence.class.getFields()) {
                if (field.getType() != RegistryObject.class) continue;
                try
                {
                    RegistryObject<Block> block = (RegistryObject)field.get(null);
                    event.accept(new ItemStack(block.get()));
                }
                catch (IllegalAccessException e) {}

            }
        }
    }


}
