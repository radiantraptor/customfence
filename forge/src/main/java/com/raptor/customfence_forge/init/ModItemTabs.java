package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Field;

//@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemTabs {

    //public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WOODEN_FENCES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WALLS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);


    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_METAL_FENCES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_ALL = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);


    public static void registerTabWoodenFence() {
        Main.CREATIVE_TAB_WOODEN_FENCES.register("customfence_1_wooden_fence", () ->
                CreativeModeTab.builder()
                        .icon(() -> new ItemStack(ModItems.SPRUCE_OAK_WILDLIFE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_wooden_fence"))
                        .displayItems((displayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksWoodenFence.class.getFields())
                            {
                                if (field.getType() != RegistryObject.class) continue;

                                try
                                {
                                    RegistryObject<Block> block = (RegistryObject)field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                }
                                catch (IllegalAccessException e) {}
                            }

                        }).build()
        );
    }

    public static void registerTabWall() {
        Main.CREATIVE_TAB_WALLS.register("customfence_2_wall", () ->
                CreativeModeTab.builder()
                        .icon(() -> new ItemStack(ModItems.STONE_MODERN.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_wall"))
                        .displayItems((displayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksWall.class.getFields())
                            {
                                if (field.getType() != RegistryObject.class) continue;

                                try
                                {
                                    RegistryObject<Block> block = (RegistryObject)field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                }
                                catch (IllegalAccessException e) {}
                            }

                        }).build()
        );
    }

    public static void registerTabMetalFence() {
        Main.CREATIVE_TAB_METAL_FENCES.register("customfence_3_metal_fence", () ->
                CreativeModeTab.builder()
                        .icon(() -> new ItemStack(ModItems.COBBLESTONE_IRON_FENCE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_metal_fence"))
                        .displayItems((displayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksMetalFence.class.getFields())
                            {
                                if (field.getType() != RegistryObject.class) continue;

                                try
                                {
                                    RegistryObject<Block> block = (RegistryObject)field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                }
                                catch (IllegalAccessException e) {}
                            }

                        }).build()
        );
    }


    public static void registerTabAll() {
        Main.CREATIVE_TAB_ALL.register("customfence", () ->
                CreativeModeTab.builder()
                        .icon(() -> new ItemStack(ModItems.SPRUCE_OAK_WILDLIFE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence"))
                        .displayItems((displayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksWoodenFence.class.getFields())
                            {
                                if (field.getType() != RegistryObject.class) continue;

                                try
                                {
                                    RegistryObject<Block> block = (RegistryObject)field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                }
                                catch (IllegalAccessException e) {}
                            }
                            for (Field field : ModBlocksWall.class.getFields())
                            {
                                if (field.getType() != RegistryObject.class) continue;

                                try
                                {
                                    RegistryObject<Block> block = (RegistryObject)field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                }
                                catch (IllegalAccessException e) {}
                            }
                            for (Field field : ModBlocksMetalFence.class.getFields())
                            {
                                if (field.getType() != RegistryObject.class) continue;

                                try
                                {
                                    RegistryObject<Block> block = (RegistryObject)field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                }
                                catch (IllegalAccessException e) {}
                            }

                        }).build()
        );
    }

}
