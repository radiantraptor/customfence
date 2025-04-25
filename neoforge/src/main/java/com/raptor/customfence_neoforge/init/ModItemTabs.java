package com.raptor.customfence_neoforge.init;

import com.raptor.customfence_neoforge.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.ArrayList;

public class ModItemTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WOOD_GATE_BASIC = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WOOD_FENCE_BASIC = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WOOD_FENCE_GATE_ADVANCED = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WALLS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_METAL_FENCES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_ALL = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static ArrayList<Block> listOfWoodGateBasicBlocks() {

        ArrayList<Block> WOOD_GATE_BASIC_LIST = new ArrayList<Block>();

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.OAK_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.OAK_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.OAK_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.OAK_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.BIRCH_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.BIRCH_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.BIRCH_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.BIRCH_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.SPRUCE_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.SPRUCE_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.SPRUCE_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.SPRUCE_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.JUNGLE_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.JUNGLE_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.JUNGLE_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.JUNGLE_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.ACACIA_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.ACACIA_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.ACACIA_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.ACACIA_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.DARKOAK_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.DARKOAK_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.DARKOAK_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.DARKOAK_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.WARPED_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.WARPED_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.WARPED_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.WARPED_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.CRIMSON_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.CRIMSON_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.CRIMSON_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.CRIMSON_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.MANGROVE_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.MANGROVE_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.MANGROVE_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.MANGROVE_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.BAMBOO_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.BAMBOO_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.BAMBOO_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.BAMBOO_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.CHERRY_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.CHERRY_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.CHERRY_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.CHERRY_CRISSCROSS_GATE.get());

        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.PALE_OAK_CLASSIC_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.PALE_OAK_WILDLIFE_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.PALE_OAK_PLANK_GATE.get());
        WOOD_GATE_BASIC_LIST.add(ModBlocksWoodGateBasic.PALE_OAK_CRISSCROSS_GATE.get());

        return WOOD_GATE_BASIC_LIST;
        
    }
    
    public static ArrayList<Block> listOfWoodFenceBasicBlocks() {

        ArrayList<Block> WOOD_FENCE_BASIC_LIST = new ArrayList<Block>();

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.OAK_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.SPRUCE_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BIRCH_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.ACACIA_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.JUNGLE_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.DARKOAK_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CRIMSON_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.WARPED_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.MANGROVE_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_CHERRY_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.BAMBOO_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_PALE_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_PALE_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_PALE_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.CHERRY_PALE_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_OAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_OAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_OAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_OAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_SPRUCE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_SPRUCE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_SPRUCE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_SPRUCE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_BIRCH_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_BIRCH_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_BIRCH_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_BIRCH_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_ACACIA_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_ACACIA_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_ACACIA_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_ACACIA_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_JUNGLE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_JUNGLE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_JUNGLE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_JUNGLE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_DARKOAK_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_DARKOAK_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_DARKOAK_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_DARKOAK_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_CRIMSON_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_CRIMSON_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_CRIMSON_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_CRIMSON_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_WARPED_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_WARPED_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_WARPED_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_WARPED_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_MANGROVE_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_MANGROVE_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_MANGROVE_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_MANGROVE_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_BAMBOO_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_BAMBOO_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_BAMBOO_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_BAMBOO_CRISSCROSS.get());

        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_CHERRY_CLASSIC.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_CHERRY_WILDLIFE.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_CHERRY_PLANK.get());
        WOOD_FENCE_BASIC_LIST.add(ModBlocksWoodFenceBasic.PALE_OAK_CHERRY_CRISSCROSS.get());
        
        return WOOD_FENCE_BASIC_LIST;
    }

    public static ArrayList<Block> listOfWoodFenceGateAdvancedBlocks() {

        ArrayList<Block> WOOD_FENCE_GATE_ADVANCED_LIST = new ArrayList<Block>();

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.OAK_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.SPRUCE_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BIRCH_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.ACACIA_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.JUNGLE_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.DARKOAK_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CRIMSON_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.WARPED_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.MANGROVE_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_CHERRY_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.BAMBOO_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.CHERRY_PALE_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_OAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_SPRUCE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BIRCH_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_ACACIA_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_JUNGLE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_DARKOAK_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CRIMSON_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_WARPED_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_MANGROVE_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_BAMBOO_SPIRE_GATE.get());

        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_DECORATION.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_DECORATION_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_GARDEN.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_GARDEN_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_BOLLARD.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_BOLLARD_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_STICK.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_STICK_GATE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_SPIRE.get());
        WOOD_FENCE_GATE_ADVANCED_LIST.add(ModBlocksWoodFenceGateAdvanced.PALE_OAK_CHERRY_SPIRE_GATE.get());

        return WOOD_FENCE_GATE_ADVANCED_LIST;
    }

    public static ArrayList<Block> listOfWallBlocks() {

        ArrayList<Block> WALL_BLOCK_LIST = new ArrayList<Block>();

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
        WALL_BLOCK_LIST.add(ModBlocksWall.PALE_OAK_WALL_BUILDING.get());


        return WALL_BLOCK_LIST;
    }

    public static ArrayList<Block> listOfMetalFenceBlocks() {

        ArrayList<Block> METAL_FENCE_BLOCK_LIST = new ArrayList<Block>();


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

        return METAL_FENCE_BLOCK_LIST;
    }


    public static void registerTabWoodGateBasic() {
        CREATIVE_TAB_WOOD_GATE_BASIC.register("customfence_1_wood_gate_basic", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodGateBasic.OAK_CLASSIC_GATE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_wood_gate_basic"))
                        .displayItems((itemDisplayParameters, output) -> {
                            // Add blocks
                            for (Block block : listOfWoodGateBasicBlocks()) {
                                output.accept(block);
                            }
                        }).build()
        );
    }

    public static void registerTabWoodFenceBasic() {
        CREATIVE_TAB_WOOD_FENCE_BASIC.register("customfence_1_wood_fence_basic", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodFenceBasic.SPRUCE_OAK_WILDLIFE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_wood_fence_basic"))
                        .displayItems((itemDisplayParameters, output) -> {
                            // Add blocks
                            for (Block block : listOfWoodFenceBasicBlocks()) {
                                output.accept(block);
                            }
                        }).build()
        );
    }

    public static void registerTabWoodFenceGateAdvanced() {
        CREATIVE_TAB_WOOD_FENCE_GATE_ADVANCED.register("customfence_1_wood_fence_gate_advanced", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_DECORATION.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_wood_fence_gate_advanced"))
                        .displayItems((itemDisplayParameters, output) -> {
                            // Add blocks
                            for (Block block : listOfWoodFenceGateAdvancedBlocks()) {
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
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodFenceBasic.SPRUCE_OAK_WILDLIFE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence"))
                        .displayItems((itemDisplayParameters, output) -> {
                            for (Block block : listOfWoodGateBasicBlocks()) {
                                output.accept(block);
                            }
                            for (Block block : listOfWoodFenceBasicBlocks()) {
                                output.accept(block);
                            }
                            for (Block block : listOfWoodFenceGateAdvancedBlocks()) {
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