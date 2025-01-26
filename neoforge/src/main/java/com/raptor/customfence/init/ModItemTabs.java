package com.raptor.customfence.init;

import com.raptor.customfence.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.ArrayList;

public class ModItemTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WOODEN_FENCES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WALLS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_METAL_FENCES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_ALL = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static ArrayList<Block> listOfWoodFenceBlocks() {

        ArrayList<Block> WOOD_FENCE_BLOCK_LIST = new ArrayList<Block>();

        //BEGIN WOODENFENCEGATES

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CRISSCROSS_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CLASSIC_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_WILDLIFE_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_PLANK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRISSCROSS_GATE.get());

        //END WOODENFENCEGATES AND BEGIN WOODENFENCES

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_OAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_SPRUCE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BIRCH_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_OAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BIRCH_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_SPRUCE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_SPRUCE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_DARKOAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_OAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_DARKOAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_JUNGLE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_DARKOAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_JUNGLE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_ACACIA_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BIRCH_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_ACACIA_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BIRCH_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_JUNGLE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BIRCH_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_WARPED_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_OAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_WARPED_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_SPRUCE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_WARPED_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_JUNGLE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CRIMSON_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_OAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_CRIMSON_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_DARKOAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_CRIMSON_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_OAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_MANGROVE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_BIRCH_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BIRCH_MANGROVE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_JUNGLE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_MANGROVE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_DARKOAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.DARKOAK_MANGROVE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_WARPED_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_MANGROVE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_OAK_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.OAK_BAMBOO_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_SPRUCE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.SPRUCE_BAMBOO_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_JUNGLE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_BAMBOO_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_ACACIA_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_BAMBOO_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_WARPED_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.WARPED_BAMBOO_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_JUNGLE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.JUNGLE_CHERRY_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_ACACIA_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.ACACIA_CHERRY_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_MANGROVE_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.MANGROVE_CHERRY_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_BAMBOO_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.BAMBOO_CHERRY_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CHERRY_CRIMSON_SPIRE_GATE.get());

         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_CLASSIC.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_WILDLIFE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_DECORATION.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_DECORATION_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_PLANK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_GARDEN.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_GARDEN_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_BOLLARD.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_BOLLARD_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_STICK.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_STICK_GATE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_CRISSCROSS.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_SPIRE.get());
         WOOD_FENCE_BLOCK_LIST.add(ModBlocksWoodenFence.CRIMSON_CHERRY_SPIRE_GATE.get());

        //END WOODENFENCES

        return WOOD_FENCE_BLOCK_LIST;
    }

    public static ArrayList<Block> listOfWallBlocks() {

        ArrayList<Block> WALL_BLOCK_LIST = new ArrayList<Block>();

        //BEGIN STONEWALLS

        WALL_BLOCK_LIST.add(ModBlocksWall.COBBLESTONE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.COBBLESTONE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.COBBLESTONE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.MOSSY_COBBLESTONE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.MOSSY_COBBLESTONE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.MOSSY_COBBLESTONE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.STONE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.STONE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.STONE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.STONE_BRICKS_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.STONE_BRICKS_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.STONE_BRICKS_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.MOSSY_STONE_BRICKS_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.MOSSY_STONE_BRICKS_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.MOSSY_STONE_BRICKS_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.ANDESITE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.ANDESITE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.ANDESITE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.DIORITE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.DIORITE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.DIORITE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.GRANITE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.GRANITE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.GRANITE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.SANDSTONE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.SANDSTONE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.SANDSTONE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.RED_SANDSTONE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.RED_SANDSTONE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.RED_SANDSTONE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.BRICKS_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.BRICKS_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.BRICKS_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.PRISMARINE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.PRISMARINE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.PRISMARINE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.NETHER_BRICKS_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.NETHER_BRICKS_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.NETHER_BRICKS_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.RED_NETHER_BRICKS_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.RED_NETHER_BRICKS_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.RED_NETHER_BRICKS_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.END_STONE_BRICKS_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.END_STONE_BRICKS_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.END_STONE_BRICKS_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.BLACKSTONE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.BLACKSTONE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.BLACKSTONE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.POLISHED_BLACKSTONE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.POLISHED_BLACKSTONE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.POLISHED_BLACKSTONE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.POLISHED_BLACKSTONE_BRICKS_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.POLISHED_BLACKSTONE_BRICKS_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.POLISHED_BLACKSTONE_BRICKS_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.COBBLED_DEEPSLATE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.COBBLED_DEEPSLATE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.COBBLED_DEEPSLATE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.POLISHED_DEEPSLATE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.POLISHED_DEEPSLATE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.POLISHED_DEEPSLATE_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.DEEPSLATE_BRICK_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.DEEPSLATE_BRICK_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.DEEPSLATE_BRICK_CASTLE.get());

        WALL_BLOCK_LIST.add(ModBlocksWall.DEEPSLATE_TILE_MODERN.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.DEEPSLATE_TILE_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.DEEPSLATE_TILE_CASTLE.get());

        //END STONEWALLS AND BEGIN WOODENWALLS

        WALL_BLOCK_LIST.add(ModBlocksWall.OAK_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.BIRCH_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.SPRUCE_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.ACACIA_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.JUNGLE_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.DARKOAK_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.CRIMSON_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.WARPED_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.MANGROVE_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.BAMBOO_WALL_BUILDING.get());
        WALL_BLOCK_LIST.add(ModBlocksWall.CHERRY_WALL_BUILDING.get());


        //END WOODENWALLS

        return WALL_BLOCK_LIST;
    }

    public static ArrayList<Block> listOfMetalFenceBlocks() {

        ArrayList<Block> METAL_FENCE_BLOCK_LIST = new ArrayList<Block>();

        //BEGIN METALLFENCES

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_COPPER_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COPPER_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.EXPOSED_COPPER_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WEATHERED_COPPER_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.OXIDIZED_COPPER_MANSION_FENCE_GATE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_COPPER_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_COPPER_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_COPPER_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_COPPER_MANSION_FENCE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_COPPER_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_EXPOSED_COPPER_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_WEATHERED_COPPER_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_OXIDIZED_COPPER_MANSION_FENCE_GATE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_IRON_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.IRON_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.EXPOSED_IRON_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WEATHERED_IRON_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.OXIDIZED_IRON_MANSION_FENCE_GATE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_IRON_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_IRON_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_IRON_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_IRON_MANSION_FENCE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_IRON_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_EXPOSED_IRON_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_WEATHERED_IRON_MANSION_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_OXIDIZED_IRON_MANSION_FENCE_GATE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_GOLD_MANSION_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.GOLD_MANSION_FENCE_GATE.get());


        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_COPPER_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COPPER_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.EXPOSED_COPPER_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WEATHERED_COPPER_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.OXIDIZED_COPPER_MESH_FENCE_GATE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_COPPER_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_COPPER_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_COPPER_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_COPPER_MESH_FENCE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_COPPER_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_EXPOSED_COPPER_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_WEATHERED_COPPER_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_OXIDIZED_COPPER_MESH_FENCE_GATE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_IRON_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_MESH_FENCE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.IRON_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.EXPOSED_IRON_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WEATHERED_IRON_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.OXIDIZED_IRON_MESH_FENCE_GATE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_IRON_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_IRON_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_IRON_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_IRON_MESH_FENCE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_IRON_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_EXPOSED_IRON_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_WEATHERED_IRON_MESH_FENCE_GATE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.WAXED_OXIDIZED_IRON_MESH_FENCE_GATE.get());

        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.COBBLESTONE_GOLD_MESH_FENCE.get());
        METAL_FENCE_BLOCK_LIST.add(ModBlocksMetalFence.GOLD_MESH_FENCE_GATE.get());

        //END METALLFENCES

        return METAL_FENCE_BLOCK_LIST;
    }


 public static void registerTabWoodenFence() {
  CREATIVE_TAB_WOODEN_FENCES.register("customfence_1_wooden_fence", () ->
          CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodenFence.SPRUCE_OAK_WILDLIFE.get()))
                  .title(Component.translatable("itemGroup.customfence.tab_customfence_wooden_fence"))
                  .displayItems((itemDisplayParameters, output) -> {
                   // Add blocks
                   for (Block block : listOfWoodFenceBlocks()) {
                    output.accept(block);
                   }
                  }).build()
  );
 }

 public static void registerTabWall() {
  CREATIVE_TAB_WALLS.register("customfence_2_wall", () ->
          CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWall.STONE_MODERN.get()))
                  .title(Component.translatable("itemGroup.customfence.tab_customfence_wall"))
                  .displayItems((itemDisplayParameters, output) -> {
                   for (Block block : listOfWallBlocks()) {
                    output.accept(block);
                   }
                  }).build()
  );
 }


 public static void registerTabMetalFence() {
  CREATIVE_TAB_METAL_FENCES.register("customfence_3_metal_fence", () ->
          CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksMetalFence.COBBLESTONE_IRON_MANSION_FENCE.get()))
                  .title(Component.translatable("itemGroup.customfence.tab_customfence_metal_fence"))
                  .displayItems((itemDisplayParameters, output) -> {
                   for (Block block : listOfMetalFenceBlocks()) {
                    output.accept(block);
                   }
                  }).build()
  );
 }


 public static void registerTabAll() {
  CREATIVE_TAB_ALL.register("customfence_all", () ->
          CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodenFence.SPRUCE_OAK_WILDLIFE.get()))
                  .title(Component.translatable("itemGroup.customfence.tab_customfence"))
                  .displayItems((itemDisplayParameters, output) -> {
                   for (Block block : listOfWoodFenceBlocks()) {
                    output.accept(block);
                   }
                   for (Block block : listOfWallBlocks()) {
                    output.accept(block);
                   }
                   for (Block block : listOfMetalFenceBlocks()) {
                    output.accept(block);
                   }
                  }).build()
  );
 }

}
