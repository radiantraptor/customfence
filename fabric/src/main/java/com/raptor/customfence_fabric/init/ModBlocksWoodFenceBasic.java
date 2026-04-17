package com.raptor.customfence_fabric.init;

import com.mojang.math.Constants;
import com.raptor.customfence_fabric.Main;
import com.raptor.customfence_fabric.blocks.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

import java.util.function.Function;

public class ModBlocksWoodFenceBasic {

    public static final Block OAK_SPRUCE_CLASSIC = registerBlock("oak_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block OAK_SPRUCE_WILDLIFE = registerBlock("oak_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block OAK_SPRUCE_PLANK = registerBlock("oak_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block OAK_SPRUCE_CRISSCROSS = registerBlock("oak_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block OAK_BIRCH_CLASSIC = registerBlock("oak_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block OAK_BIRCH_WILDLIFE = registerBlock("oak_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block OAK_BIRCH_PLANK = registerBlock("oak_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block OAK_BIRCH_CRISSCROSS = registerBlock("oak_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block OAK_ACACIA_CLASSIC = registerBlock("oak_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block OAK_ACACIA_WILDLIFE = registerBlock("oak_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block OAK_ACACIA_PLANK = registerBlock("oak_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block OAK_ACACIA_CRISSCROSS = registerBlock("oak_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block OAK_JUNGLE_CLASSIC = registerBlock("oak_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block OAK_JUNGLE_WILDLIFE = registerBlock("oak_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block OAK_JUNGLE_PLANK = registerBlock("oak_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block OAK_JUNGLE_CRISSCROSS = registerBlock("oak_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block OAK_DARKOAK_CLASSIC = registerBlock("oak_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block OAK_DARKOAK_WILDLIFE = registerBlock("oak_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block OAK_DARKOAK_PLANK = registerBlock("oak_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block OAK_DARKOAK_CRISSCROSS = registerBlock("oak_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block OAK_CRIMSON_CLASSIC = registerBlock("oak_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block OAK_CRIMSON_WILDLIFE = registerBlock("oak_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block OAK_CRIMSON_PLANK = registerBlock("oak_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block OAK_CRIMSON_CRISSCROSS = registerBlock("oak_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block OAK_WARPED_CLASSIC = registerBlock("oak_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block OAK_WARPED_WILDLIFE = registerBlock("oak_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block OAK_WARPED_PLANK = registerBlock("oak_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block OAK_WARPED_CRISSCROSS = registerBlock("oak_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block OAK_MANGROVE_CLASSIC = registerBlock("oak_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block OAK_MANGROVE_WILDLIFE = registerBlock("oak_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block OAK_MANGROVE_PLANK = registerBlock("oak_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block OAK_MANGROVE_CRISSCROSS = registerBlock("oak_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block OAK_BAMBOO_CLASSIC = registerBlock("oak_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block OAK_BAMBOO_WILDLIFE = registerBlock("oak_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block OAK_BAMBOO_PLANK = registerBlock("oak_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block OAK_BAMBOO_CRISSCROSS = registerBlock("oak_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block OAK_CHERRY_CLASSIC = registerBlock("oak_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block OAK_CHERRY_WILDLIFE = registerBlock("oak_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block OAK_CHERRY_PLANK = registerBlock("oak_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block OAK_CHERRY_CRISSCROSS = registerBlock("oak_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block OAK_PALE_OAK_CLASSIC = registerBlock("oak_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block OAK_PALE_OAK_WILDLIFE = registerBlock("oak_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block OAK_PALE_OAK_PLANK = registerBlock("oak_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block OAK_PALE_OAK_CRISSCROSS = registerBlock("oak_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block SPRUCE_OAK_CLASSIC = registerBlock("spruce_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_OAK_WILDLIFE = registerBlock("spruce_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_OAK_PLANK = registerBlock("spruce_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_OAK_CRISSCROSS = registerBlock("spruce_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block SPRUCE_BIRCH_CLASSIC = registerBlock("spruce_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_BIRCH_WILDLIFE = registerBlock("spruce_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_BIRCH_PLANK = registerBlock("spruce_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_BIRCH_CRISSCROSS = registerBlock("spruce_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block SPRUCE_ACACIA_CLASSIC = registerBlock("spruce_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_ACACIA_WILDLIFE = registerBlock("spruce_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_ACACIA_PLANK = registerBlock("spruce_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_ACACIA_CRISSCROSS = registerBlock("spruce_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block SPRUCE_JUNGLE_CLASSIC = registerBlock("spruce_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_JUNGLE_WILDLIFE = registerBlock("spruce_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_JUNGLE_PLANK = registerBlock("spruce_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_JUNGLE_CRISSCROSS = registerBlock("spruce_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block SPRUCE_DARKOAK_CLASSIC = registerBlock("spruce_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_DARKOAK_WILDLIFE = registerBlock("spruce_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_DARKOAK_PLANK = registerBlock("spruce_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_DARKOAK_CRISSCROSS = registerBlock("spruce_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block SPRUCE_CRIMSON_CLASSIC = registerBlock("spruce_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_CRIMSON_WILDLIFE = registerBlock("spruce_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_CRIMSON_PLANK = registerBlock("spruce_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_CRIMSON_CRISSCROSS = registerBlock("spruce_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block SPRUCE_WARPED_CLASSIC = registerBlock("spruce_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_WARPED_WILDLIFE = registerBlock("spruce_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_WARPED_PLANK = registerBlock("spruce_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_WARPED_CRISSCROSS = registerBlock("spruce_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block SPRUCE_MANGROVE_CLASSIC = registerBlock("spruce_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_MANGROVE_WILDLIFE = registerBlock("spruce_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_MANGROVE_PLANK = registerBlock("spruce_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_MANGROVE_CRISSCROSS = registerBlock("spruce_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block SPRUCE_BAMBOO_CLASSIC = registerBlock("spruce_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block SPRUCE_BAMBOO_WILDLIFE = registerBlock("spruce_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block SPRUCE_BAMBOO_PLANK = registerBlock("spruce_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block SPRUCE_BAMBOO_CRISSCROSS = registerBlock("spruce_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block SPRUCE_CHERRY_CLASSIC = registerBlock("spruce_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block SPRUCE_CHERRY_WILDLIFE = registerBlock("spruce_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block SPRUCE_CHERRY_PLANK = registerBlock("spruce_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block SPRUCE_CHERRY_CRISSCROSS = registerBlock("spruce_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block SPRUCE_PALE_OAK_CLASSIC = registerBlock("spruce_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_PALE_OAK_WILDLIFE = registerBlock("spruce_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_PALE_OAK_PLANK = registerBlock("spruce_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block SPRUCE_PALE_OAK_CRISSCROSS = registerBlock("spruce_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BIRCH_OAK_CLASSIC = registerBlock("birch_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_OAK_WILDLIFE = registerBlock("birch_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_OAK_PLANK = registerBlock("birch_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_OAK_CRISSCROSS = registerBlock("birch_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BIRCH_SPRUCE_CLASSIC = registerBlock("birch_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_SPRUCE_WILDLIFE = registerBlock("birch_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_SPRUCE_PLANK = registerBlock("birch_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_SPRUCE_CRISSCROSS = registerBlock("birch_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BIRCH_ACACIA_CLASSIC = registerBlock("birch_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_ACACIA_WILDLIFE = registerBlock("birch_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_ACACIA_PLANK = registerBlock("birch_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_ACACIA_CRISSCROSS = registerBlock("birch_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BIRCH_JUNGLE_CLASSIC = registerBlock("birch_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_JUNGLE_WILDLIFE = registerBlock("birch_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_JUNGLE_PLANK = registerBlock("birch_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_JUNGLE_CRISSCROSS = registerBlock("birch_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BIRCH_DARKOAK_CLASSIC = registerBlock("birch_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_DARKOAK_WILDLIFE = registerBlock("birch_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_DARKOAK_PLANK = registerBlock("birch_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_DARKOAK_CRISSCROSS = registerBlock("birch_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BIRCH_CRIMSON_CLASSIC = registerBlock("birch_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_CRIMSON_WILDLIFE = registerBlock("birch_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_CRIMSON_PLANK = registerBlock("birch_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_CRIMSON_CRISSCROSS = registerBlock("birch_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BIRCH_WARPED_CLASSIC = registerBlock("birch_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_WARPED_WILDLIFE = registerBlock("birch_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_WARPED_PLANK = registerBlock("birch_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_WARPED_CRISSCROSS = registerBlock("birch_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BIRCH_MANGROVE_CLASSIC = registerBlock("birch_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_MANGROVE_WILDLIFE = registerBlock("birch_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_MANGROVE_PLANK = registerBlock("birch_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_MANGROVE_CRISSCROSS = registerBlock("birch_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BIRCH_BAMBOO_CLASSIC = registerBlock("birch_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block BIRCH_BAMBOO_WILDLIFE = registerBlock("birch_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block BIRCH_BAMBOO_PLANK = registerBlock("birch_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block BIRCH_BAMBOO_CRISSCROSS = registerBlock("birch_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block BIRCH_CHERRY_CLASSIC = registerBlock("birch_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block BIRCH_CHERRY_WILDLIFE = registerBlock("birch_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block BIRCH_CHERRY_PLANK = registerBlock("birch_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block BIRCH_CHERRY_CRISSCROSS = registerBlock("birch_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block BIRCH_PALE_OAK_CLASSIC = registerBlock("birch_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_PALE_OAK_WILDLIFE = registerBlock("birch_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_PALE_OAK_PLANK = registerBlock("birch_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block BIRCH_PALE_OAK_CRISSCROSS = registerBlock("birch_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block ACACIA_OAK_CLASSIC = registerBlock("acacia_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_OAK_WILDLIFE = registerBlock("acacia_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_OAK_PLANK = registerBlock("acacia_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_OAK_CRISSCROSS = registerBlock("acacia_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block ACACIA_SPRUCE_CLASSIC = registerBlock("acacia_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_SPRUCE_WILDLIFE = registerBlock("acacia_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_SPRUCE_PLANK = registerBlock("acacia_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_SPRUCE_CRISSCROSS = registerBlock("acacia_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block ACACIA_BIRCH_CLASSIC = registerBlock("acacia_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_BIRCH_WILDLIFE = registerBlock("acacia_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_BIRCH_PLANK = registerBlock("acacia_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_BIRCH_CRISSCROSS = registerBlock("acacia_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block ACACIA_JUNGLE_CLASSIC = registerBlock("acacia_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_JUNGLE_WILDLIFE = registerBlock("acacia_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_JUNGLE_PLANK = registerBlock("acacia_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_JUNGLE_CRISSCROSS = registerBlock("acacia_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block ACACIA_DARKOAK_CLASSIC = registerBlock("acacia_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_DARKOAK_WILDLIFE = registerBlock("acacia_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_DARKOAK_PLANK = registerBlock("acacia_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_DARKOAK_CRISSCROSS = registerBlock("acacia_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block ACACIA_CRIMSON_CLASSIC = registerBlock("acacia_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_CRIMSON_WILDLIFE = registerBlock("acacia_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_CRIMSON_PLANK = registerBlock("acacia_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_CRIMSON_CRISSCROSS = registerBlock("acacia_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block ACACIA_WARPED_CLASSIC = registerBlock("acacia_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_WARPED_WILDLIFE = registerBlock("acacia_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_WARPED_PLANK = registerBlock("acacia_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_WARPED_CRISSCROSS = registerBlock("acacia_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block ACACIA_MANGROVE_CLASSIC = registerBlock("acacia_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_MANGROVE_WILDLIFE = registerBlock("acacia_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_MANGROVE_PLANK = registerBlock("acacia_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_MANGROVE_CRISSCROSS = registerBlock("acacia_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block ACACIA_BAMBOO_CLASSIC = registerBlock("acacia_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block ACACIA_BAMBOO_WILDLIFE = registerBlock("acacia_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block ACACIA_BAMBOO_PLANK = registerBlock("acacia_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block ACACIA_BAMBOO_CRISSCROSS = registerBlock("acacia_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block ACACIA_CHERRY_CLASSIC = registerBlock("acacia_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block ACACIA_CHERRY_WILDLIFE = registerBlock("acacia_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block ACACIA_CHERRY_PLANK = registerBlock("acacia_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block ACACIA_CHERRY_CRISSCROSS = registerBlock("acacia_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block ACACIA_PALE_OAK_CLASSIC = registerBlock("acacia_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_PALE_OAK_WILDLIFE = registerBlock("acacia_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_PALE_OAK_PLANK = registerBlock("acacia_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block ACACIA_PALE_OAK_CRISSCROSS = registerBlock("acacia_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block JUNGLE_OAK_CLASSIC = registerBlock("jungle_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_OAK_WILDLIFE = registerBlock("jungle_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_OAK_PLANK = registerBlock("jungle_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_OAK_CRISSCROSS = registerBlock("jungle_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block JUNGLE_SPRUCE_CLASSIC = registerBlock("jungle_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_SPRUCE_WILDLIFE = registerBlock("jungle_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_SPRUCE_PLANK = registerBlock("jungle_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_SPRUCE_CRISSCROSS = registerBlock("jungle_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block JUNGLE_BIRCH_CLASSIC = registerBlock("jungle_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_BIRCH_WILDLIFE = registerBlock("jungle_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_BIRCH_PLANK = registerBlock("jungle_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_BIRCH_CRISSCROSS = registerBlock("jungle_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block JUNGLE_ACACIA_CLASSIC = registerBlock("jungle_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_ACACIA_WILDLIFE = registerBlock("jungle_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_ACACIA_PLANK = registerBlock("jungle_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_ACACIA_CRISSCROSS = registerBlock("jungle_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block JUNGLE_DARKOAK_CLASSIC = registerBlock("jungle_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_DARKOAK_WILDLIFE = registerBlock("jungle_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_DARKOAK_PLANK = registerBlock("jungle_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_DARKOAK_CRISSCROSS = registerBlock("jungle_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block JUNGLE_CRIMSON_CLASSIC = registerBlock("jungle_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_CRIMSON_WILDLIFE = registerBlock("jungle_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_CRIMSON_PLANK = registerBlock("jungle_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_CRIMSON_CRISSCROSS = registerBlock("jungle_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block JUNGLE_WARPED_CLASSIC = registerBlock("jungle_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_WARPED_WILDLIFE = registerBlock("jungle_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_WARPED_PLANK = registerBlock("jungle_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_WARPED_CRISSCROSS = registerBlock("jungle_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block JUNGLE_MANGROVE_CLASSIC = registerBlock("jungle_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_MANGROVE_WILDLIFE = registerBlock("jungle_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_MANGROVE_PLANK = registerBlock("jungle_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_MANGROVE_CRISSCROSS = registerBlock("jungle_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block JUNGLE_BAMBOO_CLASSIC = registerBlock("jungle_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block JUNGLE_BAMBOO_WILDLIFE = registerBlock("jungle_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block JUNGLE_BAMBOO_PLANK = registerBlock("jungle_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block JUNGLE_BAMBOO_CRISSCROSS = registerBlock("jungle_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block JUNGLE_CHERRY_CLASSIC = registerBlock("jungle_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block JUNGLE_CHERRY_WILDLIFE = registerBlock("jungle_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block JUNGLE_CHERRY_PLANK = registerBlock("jungle_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block JUNGLE_CHERRY_CRISSCROSS = registerBlock("jungle_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block JUNGLE_PALE_OAK_CLASSIC = registerBlock("jungle_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_PALE_OAK_WILDLIFE = registerBlock("jungle_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_PALE_OAK_PLANK = registerBlock("jungle_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block JUNGLE_PALE_OAK_CRISSCROSS = registerBlock("jungle_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block DARKOAK_OAK_CLASSIC = registerBlock("darkoak_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_OAK_WILDLIFE = registerBlock("darkoak_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_OAK_PLANK = registerBlock("darkoak_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_OAK_CRISSCROSS = registerBlock("darkoak_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block DARKOAK_SPRUCE_CLASSIC = registerBlock("darkoak_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_SPRUCE_WILDLIFE = registerBlock("darkoak_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_SPRUCE_PLANK = registerBlock("darkoak_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_SPRUCE_CRISSCROSS = registerBlock("darkoak_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block DARKOAK_BIRCH_CLASSIC = registerBlock("darkoak_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_BIRCH_WILDLIFE = registerBlock("darkoak_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_BIRCH_PLANK = registerBlock("darkoak_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_BIRCH_CRISSCROSS = registerBlock("darkoak_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block DARKOAK_ACACIA_CLASSIC = registerBlock("darkoak_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_ACACIA_WILDLIFE = registerBlock("darkoak_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_ACACIA_PLANK = registerBlock("darkoak_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_ACACIA_CRISSCROSS = registerBlock("darkoak_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block DARKOAK_JUNGLE_CLASSIC = registerBlock("darkoak_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_JUNGLE_WILDLIFE = registerBlock("darkoak_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_JUNGLE_PLANK = registerBlock("darkoak_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_JUNGLE_CRISSCROSS = registerBlock("darkoak_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block DARKOAK_CRIMSON_CLASSIC = registerBlock("darkoak_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_CRIMSON_WILDLIFE = registerBlock("darkoak_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_CRIMSON_PLANK = registerBlock("darkoak_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_CRIMSON_CRISSCROSS = registerBlock("darkoak_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block DARKOAK_WARPED_CLASSIC = registerBlock("darkoak_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_WARPED_WILDLIFE = registerBlock("darkoak_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_WARPED_PLANK = registerBlock("darkoak_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_WARPED_CRISSCROSS = registerBlock("darkoak_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block DARKOAK_MANGROVE_CLASSIC = registerBlock("darkoak_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_MANGROVE_WILDLIFE = registerBlock("darkoak_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_MANGROVE_PLANK = registerBlock("darkoak_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_MANGROVE_CRISSCROSS = registerBlock("darkoak_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block DARKOAK_BAMBOO_CLASSIC = registerBlock("darkoak_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block DARKOAK_BAMBOO_WILDLIFE = registerBlock("darkoak_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block DARKOAK_BAMBOO_PLANK = registerBlock("darkoak_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block DARKOAK_BAMBOO_CRISSCROSS = registerBlock("darkoak_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block DARKOAK_CHERRY_CLASSIC = registerBlock("darkoak_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block DARKOAK_CHERRY_WILDLIFE = registerBlock("darkoak_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block DARKOAK_CHERRY_PLANK = registerBlock("darkoak_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block DARKOAK_CHERRY_CRISSCROSS = registerBlock("darkoak_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block DARKOAK_PALE_OAK_CLASSIC = registerBlock("darkoak_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_PALE_OAK_WILDLIFE = registerBlock("darkoak_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_PALE_OAK_PLANK = registerBlock("darkoak_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block DARKOAK_PALE_OAK_CRISSCROSS = registerBlock("darkoak_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CRIMSON_OAK_CLASSIC = registerBlock("crimson_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_OAK_WILDLIFE = registerBlock("crimson_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_OAK_PLANK = registerBlock("crimson_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_OAK_CRISSCROSS = registerBlock("crimson_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CRIMSON_SPRUCE_CLASSIC = registerBlock("crimson_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_SPRUCE_WILDLIFE = registerBlock("crimson_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_SPRUCE_PLANK = registerBlock("crimson_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_SPRUCE_CRISSCROSS = registerBlock("crimson_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CRIMSON_BIRCH_CLASSIC = registerBlock("crimson_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_BIRCH_WILDLIFE = registerBlock("crimson_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_BIRCH_PLANK = registerBlock("crimson_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_BIRCH_CRISSCROSS = registerBlock("crimson_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CRIMSON_ACACIA_CLASSIC = registerBlock("crimson_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_ACACIA_WILDLIFE = registerBlock("crimson_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_ACACIA_PLANK = registerBlock("crimson_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_ACACIA_CRISSCROSS = registerBlock("crimson_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CRIMSON_JUNGLE_CLASSIC = registerBlock("crimson_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_JUNGLE_WILDLIFE = registerBlock("crimson_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_JUNGLE_PLANK = registerBlock("crimson_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_JUNGLE_CRISSCROSS = registerBlock("crimson_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CRIMSON_DARKOAK_CLASSIC = registerBlock("crimson_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_DARKOAK_WILDLIFE = registerBlock("crimson_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_DARKOAK_PLANK = registerBlock("crimson_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_DARKOAK_CRISSCROSS = registerBlock("crimson_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CRIMSON_WARPED_CLASSIC = registerBlock("crimson_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_WARPED_WILDLIFE = registerBlock("crimson_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_WARPED_PLANK = registerBlock("crimson_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_WARPED_CRISSCROSS = registerBlock("crimson_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CRIMSON_MANGROVE_CLASSIC = registerBlock("crimson_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_MANGROVE_WILDLIFE = registerBlock("crimson_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_MANGROVE_PLANK = registerBlock("crimson_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_MANGROVE_CRISSCROSS = registerBlock("crimson_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CRIMSON_BAMBOO_CLASSIC = registerBlock("crimson_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block CRIMSON_BAMBOO_WILDLIFE = registerBlock("crimson_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block CRIMSON_BAMBOO_PLANK = registerBlock("crimson_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block CRIMSON_BAMBOO_CRISSCROSS = registerBlock("crimson_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block CRIMSON_CHERRY_CLASSIC = registerBlock("crimson_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block CRIMSON_CHERRY_WILDLIFE = registerBlock("crimson_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block CRIMSON_CHERRY_PLANK = registerBlock("crimson_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block CRIMSON_CHERRY_CRISSCROSS = registerBlock("crimson_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block CRIMSON_PALE_OAK_CLASSIC = registerBlock("crimson_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_PALE_OAK_WILDLIFE = registerBlock("crimson_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_PALE_OAK_PLANK = registerBlock("crimson_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block CRIMSON_PALE_OAK_CRISSCROSS = registerBlock("crimson_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block WARPED_OAK_CLASSIC = registerBlock("warped_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_OAK_WILDLIFE = registerBlock("warped_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_OAK_PLANK = registerBlock("warped_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_OAK_CRISSCROSS = registerBlock("warped_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block WARPED_SPRUCE_CLASSIC = registerBlock("warped_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_SPRUCE_WILDLIFE = registerBlock("warped_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_SPRUCE_PLANK = registerBlock("warped_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_SPRUCE_CRISSCROSS = registerBlock("warped_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block WARPED_BIRCH_CLASSIC = registerBlock("warped_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_BIRCH_WILDLIFE = registerBlock("warped_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_BIRCH_PLANK = registerBlock("warped_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_BIRCH_CRISSCROSS = registerBlock("warped_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block WARPED_ACACIA_CLASSIC = registerBlock("warped_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_ACACIA_WILDLIFE = registerBlock("warped_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_ACACIA_PLANK = registerBlock("warped_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_ACACIA_CRISSCROSS = registerBlock("warped_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block WARPED_JUNGLE_CLASSIC = registerBlock("warped_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_JUNGLE_WILDLIFE = registerBlock("warped_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_JUNGLE_PLANK = registerBlock("warped_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_JUNGLE_CRISSCROSS = registerBlock("warped_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block WARPED_DARKOAK_CLASSIC = registerBlock("warped_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_DARKOAK_WILDLIFE = registerBlock("warped_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_DARKOAK_PLANK = registerBlock("warped_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_DARKOAK_CRISSCROSS = registerBlock("warped_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block WARPED_CRIMSON_CLASSIC = registerBlock("warped_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_CRIMSON_WILDLIFE = registerBlock("warped_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_CRIMSON_PLANK = registerBlock("warped_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_CRIMSON_CRISSCROSS = registerBlock("warped_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block WARPED_MANGROVE_CLASSIC = registerBlock("warped_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_MANGROVE_WILDLIFE = registerBlock("warped_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_MANGROVE_PLANK = registerBlock("warped_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_MANGROVE_CRISSCROSS = registerBlock("warped_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block WARPED_BAMBOO_CLASSIC = registerBlock("warped_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block WARPED_BAMBOO_WILDLIFE = registerBlock("warped_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block WARPED_BAMBOO_PLANK = registerBlock("warped_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block WARPED_BAMBOO_CRISSCROSS = registerBlock("warped_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block WARPED_CHERRY_CLASSIC = registerBlock("warped_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block WARPED_CHERRY_WILDLIFE = registerBlock("warped_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block WARPED_CHERRY_PLANK = registerBlock("warped_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block WARPED_CHERRY_CRISSCROSS = registerBlock("warped_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block WARPED_PALE_OAK_CLASSIC = registerBlock("warped_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_PALE_OAK_WILDLIFE = registerBlock("warped_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_PALE_OAK_PLANK = registerBlock("warped_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block WARPED_PALE_OAK_CRISSCROSS = registerBlock("warped_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block MANGROVE_OAK_CLASSIC = registerBlock("mangrove_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_OAK_WILDLIFE = registerBlock("mangrove_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_OAK_PLANK = registerBlock("mangrove_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_OAK_CRISSCROSS = registerBlock("mangrove_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block MANGROVE_SPRUCE_CLASSIC = registerBlock("mangrove_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_SPRUCE_WILDLIFE = registerBlock("mangrove_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_SPRUCE_PLANK = registerBlock("mangrove_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_SPRUCE_CRISSCROSS = registerBlock("mangrove_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block MANGROVE_BIRCH_CLASSIC = registerBlock("mangrove_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_BIRCH_WILDLIFE = registerBlock("mangrove_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_BIRCH_PLANK = registerBlock("mangrove_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_BIRCH_CRISSCROSS = registerBlock("mangrove_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block MANGROVE_ACACIA_CLASSIC = registerBlock("mangrove_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_ACACIA_WILDLIFE = registerBlock("mangrove_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_ACACIA_PLANK = registerBlock("mangrove_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_ACACIA_CRISSCROSS = registerBlock("mangrove_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block MANGROVE_JUNGLE_CLASSIC = registerBlock("mangrove_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_JUNGLE_WILDLIFE = registerBlock("mangrove_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_JUNGLE_PLANK = registerBlock("mangrove_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_JUNGLE_CRISSCROSS = registerBlock("mangrove_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block MANGROVE_DARKOAK_CLASSIC = registerBlock("mangrove_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_DARKOAK_WILDLIFE = registerBlock("mangrove_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_DARKOAK_PLANK = registerBlock("mangrove_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_DARKOAK_CRISSCROSS = registerBlock("mangrove_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block MANGROVE_CRIMSON_CLASSIC = registerBlock("mangrove_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_CRIMSON_WILDLIFE = registerBlock("mangrove_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_CRIMSON_PLANK = registerBlock("mangrove_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_CRIMSON_CRISSCROSS = registerBlock("mangrove_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block MANGROVE_WARPED_CLASSIC = registerBlock("mangrove_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_WARPED_WILDLIFE = registerBlock("mangrove_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_WARPED_PLANK = registerBlock("mangrove_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_WARPED_CRISSCROSS = registerBlock("mangrove_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block MANGROVE_BAMBOO_CLASSIC = registerBlock("mangrove_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block MANGROVE_BAMBOO_WILDLIFE = registerBlock("mangrove_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block MANGROVE_BAMBOO_PLANK = registerBlock("mangrove_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block MANGROVE_BAMBOO_CRISSCROSS = registerBlock("mangrove_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block MANGROVE_CHERRY_CLASSIC = registerBlock("mangrove_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block MANGROVE_CHERRY_WILDLIFE = registerBlock("mangrove_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block MANGROVE_CHERRY_PLANK = registerBlock("mangrove_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block MANGROVE_CHERRY_CRISSCROSS = registerBlock("mangrove_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block MANGROVE_PALE_OAK_CLASSIC = registerBlock("mangrove_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_PALE_OAK_WILDLIFE = registerBlock("mangrove_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_PALE_OAK_PLANK = registerBlock("mangrove_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block MANGROVE_PALE_OAK_CRISSCROSS = registerBlock("mangrove_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_OAK_CLASSIC = registerBlock("bamboo_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_OAK_WILDLIFE = registerBlock("bamboo_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_OAK_PLANK = registerBlock("bamboo_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_OAK_CRISSCROSS = registerBlock("bamboo_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_SPRUCE_CLASSIC = registerBlock("bamboo_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_SPRUCE_WILDLIFE = registerBlock("bamboo_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_SPRUCE_PLANK = registerBlock("bamboo_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_SPRUCE_CRISSCROSS = registerBlock("bamboo_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_BIRCH_CLASSIC = registerBlock("bamboo_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_BIRCH_WILDLIFE = registerBlock("bamboo_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_BIRCH_PLANK = registerBlock("bamboo_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_BIRCH_CRISSCROSS = registerBlock("bamboo_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_ACACIA_CLASSIC = registerBlock("bamboo_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_ACACIA_WILDLIFE = registerBlock("bamboo_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_ACACIA_PLANK = registerBlock("bamboo_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_ACACIA_CRISSCROSS = registerBlock("bamboo_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_JUNGLE_CLASSIC = registerBlock("bamboo_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_JUNGLE_WILDLIFE = registerBlock("bamboo_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_JUNGLE_PLANK = registerBlock("bamboo_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_JUNGLE_CRISSCROSS = registerBlock("bamboo_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_DARKOAK_CLASSIC = registerBlock("bamboo_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_DARKOAK_WILDLIFE = registerBlock("bamboo_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_DARKOAK_PLANK = registerBlock("bamboo_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_DARKOAK_CRISSCROSS = registerBlock("bamboo_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_CRIMSON_CLASSIC = registerBlock("bamboo_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_CRIMSON_WILDLIFE = registerBlock("bamboo_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_CRIMSON_PLANK = registerBlock("bamboo_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_CRIMSON_CRISSCROSS = registerBlock("bamboo_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_WARPED_CLASSIC = registerBlock("bamboo_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_WARPED_WILDLIFE = registerBlock("bamboo_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_WARPED_PLANK = registerBlock("bamboo_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_WARPED_CRISSCROSS = registerBlock("bamboo_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_MANGROVE_CLASSIC = registerBlock("bamboo_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_MANGROVE_WILDLIFE = registerBlock("bamboo_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_MANGROVE_PLANK = registerBlock("bamboo_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_MANGROVE_CRISSCROSS = registerBlock("bamboo_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block BAMBOO_CHERRY_CLASSIC = registerBlock("bamboo_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block BAMBOO_CHERRY_WILDLIFE = registerBlock("bamboo_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block BAMBOO_CHERRY_PLANK = registerBlock("bamboo_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block BAMBOO_CHERRY_CRISSCROSS = registerBlock("bamboo_cherry_crisscross", Fence::new, (cherryFenceProperties()));

    public static final Block BAMBOO_PALE_OAK_CLASSIC = registerBlock("bamboo_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_PALE_OAK_WILDLIFE = registerBlock("bamboo_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_PALE_OAK_PLANK = registerBlock("bamboo_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block BAMBOO_PALE_OAK_CRISSCROSS = registerBlock("bamboo_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_OAK_CLASSIC = registerBlock("cherry_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_OAK_WILDLIFE = registerBlock("cherry_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_OAK_PLANK = registerBlock("cherry_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_OAK_CRISSCROSS = registerBlock("cherry_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_SPRUCE_CLASSIC = registerBlock("cherry_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_SPRUCE_WILDLIFE = registerBlock("cherry_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_SPRUCE_PLANK = registerBlock("cherry_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_SPRUCE_CRISSCROSS = registerBlock("cherry_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_BIRCH_CLASSIC = registerBlock("cherry_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_BIRCH_WILDLIFE = registerBlock("cherry_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_BIRCH_PLANK = registerBlock("cherry_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_BIRCH_CRISSCROSS = registerBlock("cherry_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_ACACIA_CLASSIC = registerBlock("cherry_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_ACACIA_WILDLIFE = registerBlock("cherry_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_ACACIA_PLANK = registerBlock("cherry_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_ACACIA_CRISSCROSS = registerBlock("cherry_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_JUNGLE_CLASSIC = registerBlock("cherry_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_JUNGLE_WILDLIFE = registerBlock("cherry_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_JUNGLE_PLANK = registerBlock("cherry_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_JUNGLE_CRISSCROSS = registerBlock("cherry_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_DARKOAK_CLASSIC = registerBlock("cherry_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_DARKOAK_WILDLIFE = registerBlock("cherry_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_DARKOAK_PLANK = registerBlock("cherry_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_DARKOAK_CRISSCROSS = registerBlock("cherry_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_CRIMSON_CLASSIC = registerBlock("cherry_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_CRIMSON_WILDLIFE = registerBlock("cherry_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_CRIMSON_PLANK = registerBlock("cherry_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_CRIMSON_CRISSCROSS = registerBlock("cherry_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_WARPED_CLASSIC = registerBlock("cherry_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_WARPED_WILDLIFE = registerBlock("cherry_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_WARPED_PLANK = registerBlock("cherry_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_WARPED_CRISSCROSS = registerBlock("cherry_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_MANGROVE_CLASSIC = registerBlock("cherry_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_MANGROVE_WILDLIFE = registerBlock("cherry_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_MANGROVE_PLANK = registerBlock("cherry_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_MANGROVE_CRISSCROSS = registerBlock("cherry_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block CHERRY_BAMBOO_CLASSIC = registerBlock("cherry_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block CHERRY_BAMBOO_WILDLIFE = registerBlock("cherry_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block CHERRY_BAMBOO_PLANK = registerBlock("cherry_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block CHERRY_BAMBOO_CRISSCROSS = registerBlock("cherry_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block CHERRY_PALE_OAK_CLASSIC = registerBlock("cherry_pale_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_PALE_OAK_WILDLIFE = registerBlock("cherry_pale_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_PALE_OAK_PLANK = registerBlock("cherry_pale_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block CHERRY_PALE_OAK_CRISSCROSS = registerBlock("cherry_pale_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_OAK_CLASSIC = registerBlock("pale_oak_oak_classic", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_OAK_WILDLIFE = registerBlock("pale_oak_oak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_OAK_PLANK = registerBlock("pale_oak_oak_plank", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_OAK_CRISSCROSS = registerBlock("pale_oak_oak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_SPRUCE_CLASSIC = registerBlock("pale_oak_spruce_classic", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_SPRUCE_WILDLIFE = registerBlock("pale_oak_spruce_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_SPRUCE_PLANK = registerBlock("pale_oak_spruce_plank", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_SPRUCE_CRISSCROSS = registerBlock("pale_oak_spruce_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_BIRCH_CLASSIC = registerBlock("pale_oak_birch_classic", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_BIRCH_WILDLIFE = registerBlock("pale_oak_birch_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_BIRCH_PLANK = registerBlock("pale_oak_birch_plank", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_BIRCH_CRISSCROSS = registerBlock("pale_oak_birch_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_ACACIA_CLASSIC = registerBlock("pale_oak_acacia_classic", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_ACACIA_WILDLIFE = registerBlock("pale_oak_acacia_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_ACACIA_PLANK = registerBlock("pale_oak_acacia_plank", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_ACACIA_CRISSCROSS = registerBlock("pale_oak_acacia_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_JUNGLE_CLASSIC = registerBlock("pale_oak_jungle_classic", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_JUNGLE_WILDLIFE = registerBlock("pale_oak_jungle_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_JUNGLE_PLANK = registerBlock("pale_oak_jungle_plank", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_JUNGLE_CRISSCROSS = registerBlock("pale_oak_jungle_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_DARKOAK_CLASSIC = registerBlock("pale_oak_darkoak_classic", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_DARKOAK_WILDLIFE = registerBlock("pale_oak_darkoak_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_DARKOAK_PLANK = registerBlock("pale_oak_darkoak_plank", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_DARKOAK_CRISSCROSS = registerBlock("pale_oak_darkoak_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_CRIMSON_CLASSIC = registerBlock("pale_oak_crimson_classic", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_CRIMSON_WILDLIFE = registerBlock("pale_oak_crimson_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_CRIMSON_PLANK = registerBlock("pale_oak_crimson_plank", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_CRIMSON_CRISSCROSS = registerBlock("pale_oak_crimson_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_WARPED_CLASSIC = registerBlock("pale_oak_warped_classic", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_WARPED_WILDLIFE = registerBlock("pale_oak_warped_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_WARPED_PLANK = registerBlock("pale_oak_warped_plank", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_WARPED_CRISSCROSS = registerBlock("pale_oak_warped_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_MANGROVE_CLASSIC = registerBlock("pale_oak_mangrove_classic", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_MANGROVE_WILDLIFE = registerBlock("pale_oak_mangrove_wildlife", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_MANGROVE_PLANK = registerBlock("pale_oak_mangrove_plank", Fence::new, (standardFenceProperties()));
    public static final Block PALE_OAK_MANGROVE_CRISSCROSS = registerBlock("pale_oak_mangrove_crisscross", Fence::new, (standardFenceProperties()));

    public static final Block PALE_OAK_BAMBOO_CLASSIC = registerBlock("pale_oak_bamboo_classic", Fence::new, (bambooFenceProperties()));
    public static final Block PALE_OAK_BAMBOO_WILDLIFE = registerBlock("pale_oak_bamboo_wildlife", Fence::new, (bambooFenceProperties()));
    public static final Block PALE_OAK_BAMBOO_PLANK = registerBlock("pale_oak_bamboo_plank", Fence::new, (bambooFenceProperties()));
    public static final Block PALE_OAK_BAMBOO_CRISSCROSS = registerBlock("pale_oak_bamboo_crisscross", Fence::new, (bambooFenceProperties()));

    public static final Block PALE_OAK_CHERRY_CLASSIC = registerBlock("pale_oak_cherry_classic", Fence::new, (cherryFenceProperties()));
    public static final Block PALE_OAK_CHERRY_WILDLIFE = registerBlock("pale_oak_cherry_wildlife", Fence::new, (cherryFenceProperties()));
    public static final Block PALE_OAK_CHERRY_PLANK = registerBlock("pale_oak_cherry_plank", Fence::new, (cherryFenceProperties()));
    public static final Block PALE_OAK_CHERRY_CRISSCROSS = registerBlock("pale_oak_cherry_crisscross", Fence::new, (cherryFenceProperties()));


    public static BlockBehaviour.Properties standardFenceProperties() {
        return BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava();
    }

    public static BlockBehaviour.Properties cherryFenceProperties() {
        return BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava();
    }

    public static BlockBehaviour.Properties bambooFenceProperties() {
        return BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava();
    }


    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties settings) {
        Block block = function.apply(settings.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }


    public static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = (Block) factory.apply(settings.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.BLOCK, ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)), block);
    }


        public static void registerModBlocks() {

    }

}
