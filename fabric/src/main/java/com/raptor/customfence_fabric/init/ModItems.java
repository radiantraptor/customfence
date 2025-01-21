package com.raptor.customfence_fabric.init;

import com.raptor.customfence_fabric.Main;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


@SuppressWarnings({"WeakerAccess", "unused"})
public class ModItems {

    public static void registerItems() {

/*       //BEGIN WOODENFENCEGATES

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_classic_fence_gate"), new BlockItem(ModBlocks.OAK_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_wildlife_fence_gate"), new BlockItem(ModBlocks.OAK_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_plank_fence_gate"), new BlockItem(ModBlocks.OAK_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crisscross_fence_gate"), new BlockItem(ModBlocks.OAK_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_classic_fence_gate"), new BlockItem(ModBlocks.BIRCH_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_wildlife_fence_gate"), new BlockItem(ModBlocks.BIRCH_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_plank_fence_gate"), new BlockItem(ModBlocks.BIRCH_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_crisscross_fence_gate"), new BlockItem(ModBlocks.BIRCH_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_classic_fence_gate"), new BlockItem(ModBlocks.SPRUCE_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_wildlife_fence_gate"), new BlockItem(ModBlocks.SPRUCE_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_plank_fence_gate"), new BlockItem(ModBlocks.SPRUCE_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_crisscross_fence_gate"), new BlockItem(ModBlocks.SPRUCE_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_classic_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_wildlife_fence_gate"), new BlockItem(ModBlocks.JUNGLE_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_plank_fence_gate"), new BlockItem(ModBlocks.JUNGLE_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crisscross_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_classic_fence_gate"), new BlockItem(ModBlocks.ACACIA_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_wildlife_fence_gate"), new BlockItem(ModBlocks.ACACIA_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_plank_fence_gate"), new BlockItem(ModBlocks.ACACIA_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_crisscross_fence_gate"), new BlockItem(ModBlocks.ACACIA_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_classic_fence_gate"), new BlockItem(ModBlocks.DARKOAK_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_wildlife_fence_gate"), new BlockItem(ModBlocks.DARKOAK_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_plank_fence_gate"), new BlockItem(ModBlocks.DARKOAK_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crisscross_fence_gate"), new BlockItem(ModBlocks.DARKOAK_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_classic_fence_gate"), new BlockItem(ModBlocks.WARPED_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_wildlife_fence_gate"), new BlockItem(ModBlocks.WARPED_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_plank_fence_gate"), new BlockItem(ModBlocks.WARPED_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_crisscross_fence_gate"), new BlockItem(ModBlocks.WARPED_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_classic_fence_gate"), new BlockItem(ModBlocks.CRIMSON_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_wildlife_fence_gate"), new BlockItem(ModBlocks.CRIMSON_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_plank_fence_gate"), new BlockItem(ModBlocks.CRIMSON_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_crisscross_fence_gate"), new BlockItem(ModBlocks.CRIMSON_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_classic_fence_gate"), new BlockItem(ModBlocks.MANGROVE_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_wildlife_fence_gate"), new BlockItem(ModBlocks.MANGROVE_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_plank_fence_gate"), new BlockItem(ModBlocks.MANGROVE_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_crisscross_fence_gate"), new BlockItem(ModBlocks.MANGROVE_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_classic_fence_gate"), new BlockItem(ModBlocks.BAMBOO_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_wildlife_fence_gate"), new BlockItem(ModBlocks.BAMBOO_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_plank_fence_gate"), new BlockItem(ModBlocks.BAMBOO_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_crisscross_fence_gate"), new BlockItem(ModBlocks.BAMBOO_CRISSCROSS_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_classic_fence_gate"), new BlockItem(ModBlocks.CHERRY_CLASSIC_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_wildlife_fence_gate"), new BlockItem(ModBlocks.CHERRY_WILDLIFE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_plank_fence_gate"), new BlockItem(ModBlocks.CHERRY_PLANK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crisscross_fence_gate"), new BlockItem(ModBlocks.CHERRY_CRISSCROSS_GATE, new BlockItem.Settings()));

        //END WOODENFENCEGATES AND BEGIN WOODENFENCES

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_classic"), new BlockItem(ModBlocks.SPRUCE_OAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_wildlife"), new BlockItem(ModBlocks.SPRUCE_OAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_decoration"), new BlockItem(ModBlocks.SPRUCE_OAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_decoration_fence_gate"), new BlockItem(ModBlocks.SPRUCE_OAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_plank"), new BlockItem(ModBlocks.SPRUCE_OAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_garden"), new BlockItem(ModBlocks.SPRUCE_OAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_garden_fence_gate"), new BlockItem(ModBlocks.SPRUCE_OAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_bollard"), new BlockItem(ModBlocks.SPRUCE_OAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_bollard_fence_gate"), new BlockItem(ModBlocks.SPRUCE_OAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_stick"), new BlockItem(ModBlocks.SPRUCE_OAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_stick_fence_gate"), new BlockItem(ModBlocks.SPRUCE_OAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_crisscross"), new BlockItem(ModBlocks.SPRUCE_OAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_spire"), new BlockItem(ModBlocks.SPRUCE_OAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_oak_spire_fence_gate"), new BlockItem(ModBlocks.SPRUCE_OAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_classic"), new BlockItem(ModBlocks.OAK_SPRUCE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_wildlife"), new BlockItem(ModBlocks.OAK_SPRUCE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_decoration"), new BlockItem(ModBlocks.OAK_SPRUCE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_decoration_fence_gate"), new BlockItem(ModBlocks.OAK_SPRUCE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_plank"), new BlockItem(ModBlocks.OAK_SPRUCE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_garden"), new BlockItem(ModBlocks.OAK_SPRUCE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_garden_fence_gate"), new BlockItem(ModBlocks.OAK_SPRUCE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_bollard"), new BlockItem(ModBlocks.OAK_SPRUCE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_bollard_fence_gate"), new BlockItem(ModBlocks.OAK_SPRUCE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_stick"), new BlockItem(ModBlocks.OAK_SPRUCE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_stick_fence_gate"), new BlockItem(ModBlocks.OAK_SPRUCE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_crisscross"), new BlockItem(ModBlocks.OAK_SPRUCE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_spire"), new BlockItem(ModBlocks.OAK_SPRUCE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_spruce_spire_fence_gate"), new BlockItem(ModBlocks.OAK_SPRUCE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_classic"), new BlockItem(ModBlocks.OAK_BIRCH_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_wildlife"), new BlockItem(ModBlocks.OAK_BIRCH_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_decoration"), new BlockItem(ModBlocks.OAK_BIRCH_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_decoration_fence_gate"), new BlockItem(ModBlocks.OAK_BIRCH_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_plank"), new BlockItem(ModBlocks.OAK_BIRCH_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_garden"), new BlockItem(ModBlocks.OAK_BIRCH_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_garden_fence_gate"), new BlockItem(ModBlocks.OAK_BIRCH_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_bollard"), new BlockItem(ModBlocks.OAK_BIRCH_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_bollard_fence_gate"), new BlockItem(ModBlocks.OAK_BIRCH_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_stick"), new BlockItem(ModBlocks.OAK_BIRCH_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_stick_fence_gate"), new BlockItem(ModBlocks.OAK_BIRCH_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_crisscross"), new BlockItem(ModBlocks.OAK_BIRCH_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_spire"), new BlockItem(ModBlocks.OAK_BIRCH_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_birch_spire_fence_gate"), new BlockItem(ModBlocks.OAK_BIRCH_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_classic"), new BlockItem(ModBlocks.BIRCH_OAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_wildlife"), new BlockItem(ModBlocks.BIRCH_OAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_decoration"), new BlockItem(ModBlocks.BIRCH_OAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_decoration_fence_gate"), new BlockItem(ModBlocks.BIRCH_OAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_plank"), new BlockItem(ModBlocks.BIRCH_OAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_garden"), new BlockItem(ModBlocks.BIRCH_OAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_garden_fence_gate"), new BlockItem(ModBlocks.BIRCH_OAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_bollard"), new BlockItem(ModBlocks.BIRCH_OAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_bollard_fence_gate"), new BlockItem(ModBlocks.BIRCH_OAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_stick"), new BlockItem(ModBlocks.BIRCH_OAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_stick_fence_gate"), new BlockItem(ModBlocks.BIRCH_OAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_crisscross"), new BlockItem(ModBlocks.BIRCH_OAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_spire"), new BlockItem(ModBlocks.BIRCH_OAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_oak_spire_fence_gate"), new BlockItem(ModBlocks.BIRCH_OAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_classic"), new BlockItem(ModBlocks.SPRUCE_BIRCH_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_wildlife"), new BlockItem(ModBlocks.SPRUCE_BIRCH_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_decoration"), new BlockItem(ModBlocks.SPRUCE_BIRCH_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_decoration_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BIRCH_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_plank"), new BlockItem(ModBlocks.SPRUCE_BIRCH_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_garden"), new BlockItem(ModBlocks.SPRUCE_BIRCH_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_garden_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BIRCH_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_bollard"), new BlockItem(ModBlocks.SPRUCE_BIRCH_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_bollard_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BIRCH_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_stick"), new BlockItem(ModBlocks.SPRUCE_BIRCH_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_stick_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BIRCH_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_crisscross"), new BlockItem(ModBlocks.SPRUCE_BIRCH_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_spire"), new BlockItem(ModBlocks.SPRUCE_BIRCH_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_birch_spire_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BIRCH_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_classic"), new BlockItem(ModBlocks.BIRCH_SPRUCE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_wildlife"), new BlockItem(ModBlocks.BIRCH_SPRUCE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_decoration"), new BlockItem(ModBlocks.BIRCH_SPRUCE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_decoration_fence_gate"), new BlockItem(ModBlocks.BIRCH_SPRUCE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_plank"), new BlockItem(ModBlocks.BIRCH_SPRUCE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_garden"), new BlockItem(ModBlocks.BIRCH_SPRUCE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_garden_fence_gate"), new BlockItem(ModBlocks.BIRCH_SPRUCE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_bollard"), new BlockItem(ModBlocks.BIRCH_SPRUCE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_bollard_fence_gate"), new BlockItem(ModBlocks.BIRCH_SPRUCE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_stick"), new BlockItem(ModBlocks.BIRCH_SPRUCE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_stick_fence_gate"), new BlockItem(ModBlocks.BIRCH_SPRUCE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_crisscross"), new BlockItem(ModBlocks.BIRCH_SPRUCE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_spire"), new BlockItem(ModBlocks.BIRCH_SPRUCE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_spruce_spire_fence_gate"), new BlockItem(ModBlocks.BIRCH_SPRUCE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_classic"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_wildlife"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_decoration"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_decoration_fence_gate"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_plank"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_garden"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_garden_fence_gate"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_bollard"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_bollard_fence_gate"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_stick"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_stick_fence_gate"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_crisscross"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_spire"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_spruce_spire_fence_gate"), new BlockItem(ModBlocks.DARKOAK_SPRUCE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_classic"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_wildlife"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_decoration"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_decoration_fence_gate"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_plank"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_garden"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_garden_fence_gate"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_bollard"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_bollard_fence_gate"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_stick"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_stick_fence_gate"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_crisscross"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_spire"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_darkoak_spire_fence_gate"), new BlockItem(ModBlocks.SPRUCE_DARKOAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_classic"), new BlockItem(ModBlocks.DARKOAK_OAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_wildlife"), new BlockItem(ModBlocks.DARKOAK_OAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_decoration"), new BlockItem(ModBlocks.DARKOAK_OAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_decoration_fence_gate"), new BlockItem(ModBlocks.DARKOAK_OAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_plank"), new BlockItem(ModBlocks.DARKOAK_OAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_garden"), new BlockItem(ModBlocks.DARKOAK_OAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_garden_fence_gate"), new BlockItem(ModBlocks.DARKOAK_OAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_bollard"), new BlockItem(ModBlocks.DARKOAK_OAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_bollard_fence_gate"), new BlockItem(ModBlocks.DARKOAK_OAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_stick"), new BlockItem(ModBlocks.DARKOAK_OAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_stick_fence_gate"), new BlockItem(ModBlocks.DARKOAK_OAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_crisscross"), new BlockItem(ModBlocks.DARKOAK_OAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_spire"), new BlockItem(ModBlocks.DARKOAK_OAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_oak_spire_fence_gate"), new BlockItem(ModBlocks.DARKOAK_OAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_classic"), new BlockItem(ModBlocks.OAK_DARKOAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_wildlife"), new BlockItem(ModBlocks.OAK_DARKOAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_decoration"), new BlockItem(ModBlocks.OAK_DARKOAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_decoration_fence_gate"), new BlockItem(ModBlocks.OAK_DARKOAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_plank"), new BlockItem(ModBlocks.OAK_DARKOAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_garden"), new BlockItem(ModBlocks.OAK_DARKOAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_garden_fence_gate"), new BlockItem(ModBlocks.OAK_DARKOAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_bollard"), new BlockItem(ModBlocks.OAK_DARKOAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_bollard_fence_gate"), new BlockItem(ModBlocks.OAK_DARKOAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_stick"), new BlockItem(ModBlocks.OAK_DARKOAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_stick_fence_gate"), new BlockItem(ModBlocks.OAK_DARKOAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_crisscross"), new BlockItem(ModBlocks.OAK_DARKOAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_spire"), new BlockItem(ModBlocks.OAK_DARKOAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_darkoak_spire_fence_gate"), new BlockItem(ModBlocks.OAK_DARKOAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_classic"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_wildlife"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_decoration"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_decoration_fence_gate"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_plank"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_garden"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_garden_fence_gate"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_bollard"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_bollard_fence_gate"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_stick"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_stick_fence_gate"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_crisscross"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_spire"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_jungle_spire_fence_gate"), new BlockItem(ModBlocks.DARKOAK_JUNGLE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_classic"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_wildlife"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_decoration"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_decoration_fence_gate"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_plank"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_garden"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_garden_fence_gate"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_bollard"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_bollard_fence_gate"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_stick"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_stick_fence_gate"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_crisscross"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_spire"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_darkoak_spire_fence_gate"), new BlockItem(ModBlocks.JUNGLE_DARKOAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_classic"), new BlockItem(ModBlocks.ACACIA_JUNGLE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_wildlife"), new BlockItem(ModBlocks.ACACIA_JUNGLE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_decoration"), new BlockItem(ModBlocks.ACACIA_JUNGLE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_decoration_fence_gate"), new BlockItem(ModBlocks.ACACIA_JUNGLE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_plank"), new BlockItem(ModBlocks.ACACIA_JUNGLE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_garden"), new BlockItem(ModBlocks.ACACIA_JUNGLE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_garden_fence_gate"), new BlockItem(ModBlocks.ACACIA_JUNGLE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_bollard"), new BlockItem(ModBlocks.ACACIA_JUNGLE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_bollard_fence_gate"), new BlockItem(ModBlocks.ACACIA_JUNGLE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_stick"), new BlockItem(ModBlocks.ACACIA_JUNGLE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_stick_fence_gate"), new BlockItem(ModBlocks.ACACIA_JUNGLE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_crisscross"), new BlockItem(ModBlocks.ACACIA_JUNGLE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_spire"), new BlockItem(ModBlocks.ACACIA_JUNGLE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_jungle_spire_fence_gate"), new BlockItem(ModBlocks.ACACIA_JUNGLE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_classic"), new BlockItem(ModBlocks.JUNGLE_ACACIA_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_wildlife"), new BlockItem(ModBlocks.JUNGLE_ACACIA_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_decoration"), new BlockItem(ModBlocks.JUNGLE_ACACIA_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_decoration_fence_gate"), new BlockItem(ModBlocks.JUNGLE_ACACIA_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_plank"), new BlockItem(ModBlocks.JUNGLE_ACACIA_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_garden"), new BlockItem(ModBlocks.JUNGLE_ACACIA_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_garden_fence_gate"), new BlockItem(ModBlocks.JUNGLE_ACACIA_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_bollard"), new BlockItem(ModBlocks.JUNGLE_ACACIA_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_bollard_fence_gate"), new BlockItem(ModBlocks.JUNGLE_ACACIA_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_stick"), new BlockItem(ModBlocks.JUNGLE_ACACIA_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_stick_fence_gate"), new BlockItem(ModBlocks.JUNGLE_ACACIA_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_crisscross"), new BlockItem(ModBlocks.JUNGLE_ACACIA_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_spire"), new BlockItem(ModBlocks.JUNGLE_ACACIA_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_acacia_spire_fence_gate"), new BlockItem(ModBlocks.JUNGLE_ACACIA_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_classic"), new BlockItem(ModBlocks.ACACIA_BIRCH_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_wildlife"), new BlockItem(ModBlocks.ACACIA_BIRCH_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_decoration"), new BlockItem(ModBlocks.ACACIA_BIRCH_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_decoration_fence_gate"), new BlockItem(ModBlocks.ACACIA_BIRCH_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_plank"), new BlockItem(ModBlocks.ACACIA_BIRCH_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_garden"), new BlockItem(ModBlocks.ACACIA_BIRCH_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_garden_fence_gate"), new BlockItem(ModBlocks.ACACIA_BIRCH_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_bollard"), new BlockItem(ModBlocks.ACACIA_BIRCH_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_bollard_fence_gate"), new BlockItem(ModBlocks.ACACIA_BIRCH_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_stick"), new BlockItem(ModBlocks.ACACIA_BIRCH_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_stick_fence_gate"), new BlockItem(ModBlocks.ACACIA_BIRCH_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_crisscross"), new BlockItem(ModBlocks.ACACIA_BIRCH_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_spire"), new BlockItem(ModBlocks.ACACIA_BIRCH_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_birch_spire_fence_gate"), new BlockItem(ModBlocks.ACACIA_BIRCH_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_classic"), new BlockItem(ModBlocks.BIRCH_ACACIA_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_wildlife"), new BlockItem(ModBlocks.BIRCH_ACACIA_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_decoration"), new BlockItem(ModBlocks.BIRCH_ACACIA_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_decoration_fence_gate"), new BlockItem(ModBlocks.BIRCH_ACACIA_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_plank"), new BlockItem(ModBlocks.BIRCH_ACACIA_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_garden"), new BlockItem(ModBlocks.BIRCH_ACACIA_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_garden_fence_gate"), new BlockItem(ModBlocks.BIRCH_ACACIA_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_bollard"), new BlockItem(ModBlocks.BIRCH_ACACIA_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_bollard_fence_gate"), new BlockItem(ModBlocks.BIRCH_ACACIA_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_stick"), new BlockItem(ModBlocks.BIRCH_ACACIA_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_stick_fence_gate"), new BlockItem(ModBlocks.BIRCH_ACACIA_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_crisscross"), new BlockItem(ModBlocks.BIRCH_ACACIA_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_spire"), new BlockItem(ModBlocks.BIRCH_ACACIA_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_acacia_spire_fence_gate"), new BlockItem(ModBlocks.BIRCH_ACACIA_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_classic"), new BlockItem(ModBlocks.JUNGLE_BIRCH_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_wildlife"), new BlockItem(ModBlocks.JUNGLE_BIRCH_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_decoration"), new BlockItem(ModBlocks.JUNGLE_BIRCH_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_decoration_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BIRCH_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_plank"), new BlockItem(ModBlocks.JUNGLE_BIRCH_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_garden"), new BlockItem(ModBlocks.JUNGLE_BIRCH_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_garden_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BIRCH_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_bollard"), new BlockItem(ModBlocks.JUNGLE_BIRCH_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_bollard_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BIRCH_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_stick"), new BlockItem(ModBlocks.JUNGLE_BIRCH_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_stick_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BIRCH_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_crisscross"), new BlockItem(ModBlocks.JUNGLE_BIRCH_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_spire"), new BlockItem(ModBlocks.JUNGLE_BIRCH_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_birch_spire_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BIRCH_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_classic"), new BlockItem(ModBlocks.BIRCH_JUNGLE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_wildlife"), new BlockItem(ModBlocks.BIRCH_JUNGLE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_decoration"), new BlockItem(ModBlocks.BIRCH_JUNGLE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_decoration_fence_gate"), new BlockItem(ModBlocks.BIRCH_JUNGLE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_plank"), new BlockItem(ModBlocks.BIRCH_JUNGLE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_garden"), new BlockItem(ModBlocks.BIRCH_JUNGLE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_garden_fence_gate"), new BlockItem(ModBlocks.BIRCH_JUNGLE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_bollard"), new BlockItem(ModBlocks.BIRCH_JUNGLE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_bollard_fence_gate"), new BlockItem(ModBlocks.BIRCH_JUNGLE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_stick"), new BlockItem(ModBlocks.BIRCH_JUNGLE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_stick_fence_gate"), new BlockItem(ModBlocks.BIRCH_JUNGLE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_crisscross"), new BlockItem(ModBlocks.BIRCH_JUNGLE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_spire"), new BlockItem(ModBlocks.BIRCH_JUNGLE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_jungle_spire_fence_gate"), new BlockItem(ModBlocks.BIRCH_JUNGLE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_classic"), new BlockItem(ModBlocks.WARPED_BIRCH_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_wildlife"), new BlockItem(ModBlocks.WARPED_BIRCH_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_decoration"), new BlockItem(ModBlocks.WARPED_BIRCH_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_decoration_fence_gate"), new BlockItem(ModBlocks.WARPED_BIRCH_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_plank"), new BlockItem(ModBlocks.WARPED_BIRCH_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_garden"), new BlockItem(ModBlocks.WARPED_BIRCH_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_garden_fence_gate"), new BlockItem(ModBlocks.WARPED_BIRCH_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_bollard"), new BlockItem(ModBlocks.WARPED_BIRCH_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_bollard_fence_gate"), new BlockItem(ModBlocks.WARPED_BIRCH_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_stick"), new BlockItem(ModBlocks.WARPED_BIRCH_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_stick_fence_gate"), new BlockItem(ModBlocks.WARPED_BIRCH_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_crisscross"), new BlockItem(ModBlocks.WARPED_BIRCH_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_spire"), new BlockItem(ModBlocks.WARPED_BIRCH_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_birch_spire_fence_gate"), new BlockItem(ModBlocks.WARPED_BIRCH_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_classic"), new BlockItem(ModBlocks.BIRCH_WARPED_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_wildlife"), new BlockItem(ModBlocks.BIRCH_WARPED_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_decoration"), new BlockItem(ModBlocks.BIRCH_WARPED_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_decoration_fence_gate"), new BlockItem(ModBlocks.BIRCH_WARPED_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_plank"), new BlockItem(ModBlocks.BIRCH_WARPED_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_garden"), new BlockItem(ModBlocks.BIRCH_WARPED_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_garden_fence_gate"), new BlockItem(ModBlocks.BIRCH_WARPED_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_bollard"), new BlockItem(ModBlocks.BIRCH_WARPED_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_bollard_fence_gate"), new BlockItem(ModBlocks.BIRCH_WARPED_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_stick"), new BlockItem(ModBlocks.BIRCH_WARPED_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_stick_fence_gate"), new BlockItem(ModBlocks.BIRCH_WARPED_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_crisscross"), new BlockItem(ModBlocks.BIRCH_WARPED_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_spire"), new BlockItem(ModBlocks.BIRCH_WARPED_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_warped_spire_fence_gate"), new BlockItem(ModBlocks.BIRCH_WARPED_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_classic"), new BlockItem(ModBlocks.WARPED_OAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_wildlife"), new BlockItem(ModBlocks.WARPED_OAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_decoration"), new BlockItem(ModBlocks.WARPED_OAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_decoration_fence_gate"), new BlockItem(ModBlocks.WARPED_OAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_plank"), new BlockItem(ModBlocks.WARPED_OAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_garden"), new BlockItem(ModBlocks.WARPED_OAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_garden_fence_gate"), new BlockItem(ModBlocks.WARPED_OAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_bollard"), new BlockItem(ModBlocks.WARPED_OAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_bollard_fence_gate"), new BlockItem(ModBlocks.WARPED_OAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_stick"), new BlockItem(ModBlocks.WARPED_OAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_stick_fence_gate"), new BlockItem(ModBlocks.WARPED_OAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_crisscross"), new BlockItem(ModBlocks.WARPED_OAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_spire"), new BlockItem(ModBlocks.WARPED_OAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_oak_spire_fence_gate"), new BlockItem(ModBlocks.WARPED_OAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_classic"), new BlockItem(ModBlocks.OAK_WARPED_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_wildlife"), new BlockItem(ModBlocks.OAK_WARPED_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_decoration"), new BlockItem(ModBlocks.OAK_WARPED_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_decoration_fence_gate"), new BlockItem(ModBlocks.OAK_WARPED_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_plank"), new BlockItem(ModBlocks.OAK_WARPED_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_garden"), new BlockItem(ModBlocks.OAK_WARPED_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_garden_fence_gate"), new BlockItem(ModBlocks.OAK_WARPED_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_bollard"), new BlockItem(ModBlocks.OAK_WARPED_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_bollard_fence_gate"), new BlockItem(ModBlocks.OAK_WARPED_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_stick"), new BlockItem(ModBlocks.OAK_WARPED_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_stick_fence_gate"), new BlockItem(ModBlocks.OAK_WARPED_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_crisscross"), new BlockItem(ModBlocks.OAK_WARPED_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_spire"), new BlockItem(ModBlocks.OAK_WARPED_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_warped_spire_fence_gate"), new BlockItem(ModBlocks.OAK_WARPED_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_classic"), new BlockItem(ModBlocks.WARPED_SPRUCE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_wildlife"), new BlockItem(ModBlocks.WARPED_SPRUCE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_decoration"), new BlockItem(ModBlocks.WARPED_SPRUCE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_decoration_fence_gate"), new BlockItem(ModBlocks.WARPED_SPRUCE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_plank"), new BlockItem(ModBlocks.WARPED_SPRUCE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_garden"), new BlockItem(ModBlocks.WARPED_SPRUCE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_garden_fence_gate"), new BlockItem(ModBlocks.WARPED_SPRUCE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_bollard"), new BlockItem(ModBlocks.WARPED_SPRUCE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_bollard_fence_gate"), new BlockItem(ModBlocks.WARPED_SPRUCE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_stick"), new BlockItem(ModBlocks.WARPED_SPRUCE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_stick_fence_gate"), new BlockItem(ModBlocks.WARPED_SPRUCE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_crisscross"), new BlockItem(ModBlocks.WARPED_SPRUCE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_spire"), new BlockItem(ModBlocks.WARPED_SPRUCE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_spruce_spire_fence_gate"), new BlockItem(ModBlocks.WARPED_SPRUCE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_classic"), new BlockItem(ModBlocks.SPRUCE_WARPED_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_wildlife"), new BlockItem(ModBlocks.SPRUCE_WARPED_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_decoration"), new BlockItem(ModBlocks.SPRUCE_WARPED_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_decoration_fence_gate"), new BlockItem(ModBlocks.SPRUCE_WARPED_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_plank"), new BlockItem(ModBlocks.SPRUCE_WARPED_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_garden"), new BlockItem(ModBlocks.SPRUCE_WARPED_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_garden_fence_gate"), new BlockItem(ModBlocks.SPRUCE_WARPED_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_bollard"), new BlockItem(ModBlocks.SPRUCE_WARPED_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_bollard_fence_gate"), new BlockItem(ModBlocks.SPRUCE_WARPED_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_stick"), new BlockItem(ModBlocks.SPRUCE_WARPED_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_stick_fence_gate"), new BlockItem(ModBlocks.SPRUCE_WARPED_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_crisscross"), new BlockItem(ModBlocks.SPRUCE_WARPED_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_spire"), new BlockItem(ModBlocks.SPRUCE_WARPED_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_warped_spire_fence_gate"), new BlockItem(ModBlocks.SPRUCE_WARPED_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_classic"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_wildlife"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_decoration"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_decoration_fence_gate"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_plank"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_garden"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_garden_fence_gate"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_bollard"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_bollard_fence_gate"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_stick"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_stick_fence_gate"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_crisscross"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_spire"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_jungle_spire_fence_gate"), new BlockItem(ModBlocks.CRIMSON_JUNGLE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_classic"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_wildlife"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_decoration"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_decoration_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_plank"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_garden"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_garden_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_bollard"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_bollard_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_stick"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_stick_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_crisscross"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_spire"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_crimson_spire_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CRIMSON_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_classic"), new BlockItem(ModBlocks.CRIMSON_OAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_wildlife"), new BlockItem(ModBlocks.CRIMSON_OAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_decoration"), new BlockItem(ModBlocks.CRIMSON_OAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_decoration_fence_gate"), new BlockItem(ModBlocks.CRIMSON_OAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_plank"), new BlockItem(ModBlocks.CRIMSON_OAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_garden"), new BlockItem(ModBlocks.CRIMSON_OAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_garden_fence_gate"), new BlockItem(ModBlocks.CRIMSON_OAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_bollard"), new BlockItem(ModBlocks.CRIMSON_OAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_bollard_fence_gate"), new BlockItem(ModBlocks.CRIMSON_OAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_stick"), new BlockItem(ModBlocks.CRIMSON_OAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_stick_fence_gate"), new BlockItem(ModBlocks.CRIMSON_OAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_crisscross"), new BlockItem(ModBlocks.CRIMSON_OAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_spire"), new BlockItem(ModBlocks.CRIMSON_OAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_oak_spire_fence_gate"), new BlockItem(ModBlocks.CRIMSON_OAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_classic"), new BlockItem(ModBlocks.OAK_CRIMSON_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_wildlife"), new BlockItem(ModBlocks.OAK_CRIMSON_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_decoration"), new BlockItem(ModBlocks.OAK_CRIMSON_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_decoration_fence_gate"), new BlockItem(ModBlocks.OAK_CRIMSON_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_plank"), new BlockItem(ModBlocks.OAK_CRIMSON_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_garden"), new BlockItem(ModBlocks.OAK_CRIMSON_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_garden_fence_gate"), new BlockItem(ModBlocks.OAK_CRIMSON_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_bollard"), new BlockItem(ModBlocks.OAK_CRIMSON_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_bollard_fence_gate"), new BlockItem(ModBlocks.OAK_CRIMSON_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_stick"), new BlockItem(ModBlocks.OAK_CRIMSON_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_stick_fence_gate"), new BlockItem(ModBlocks.OAK_CRIMSON_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_crisscross"), new BlockItem(ModBlocks.OAK_CRIMSON_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_spire"), new BlockItem(ModBlocks.OAK_CRIMSON_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_crimson_spire_fence_gate"), new BlockItem(ModBlocks.OAK_CRIMSON_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_classic"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_wildlife"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_decoration"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_decoration_fence_gate"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_plank"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_garden"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_garden_fence_gate"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_bollard"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_bollard_fence_gate"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_stick"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_stick_fence_gate"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_crisscross"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_spire"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_darkoak_spire_fence_gate"), new BlockItem(ModBlocks.CRIMSON_DARKOAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_classic"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_wildlife"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_decoration"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_decoration_fence_gate"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_plank"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_garden"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_garden_fence_gate"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_bollard"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_bollard_fence_gate"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_stick"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_stick_fence_gate"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_crisscross"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_spire"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_crimson_spire_fence_gate"), new BlockItem(ModBlocks.DARKOAK_CRIMSON_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_classic"), new BlockItem(ModBlocks.MANGROVE_OAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_wildlife"), new BlockItem(ModBlocks.MANGROVE_OAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_decoration"), new BlockItem(ModBlocks.MANGROVE_OAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_decoration_fence_gate"), new BlockItem(ModBlocks.MANGROVE_OAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_plank"), new BlockItem(ModBlocks.MANGROVE_OAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_garden"), new BlockItem(ModBlocks.MANGROVE_OAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_garden_fence_gate"), new BlockItem(ModBlocks.MANGROVE_OAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_bollard"), new BlockItem(ModBlocks.MANGROVE_OAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_bollard_fence_gate"), new BlockItem(ModBlocks.MANGROVE_OAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_stick"), new BlockItem(ModBlocks.MANGROVE_OAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_stick_fence_gate"), new BlockItem(ModBlocks.MANGROVE_OAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_crisscross"), new BlockItem(ModBlocks.MANGROVE_OAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_spire"), new BlockItem(ModBlocks.MANGROVE_OAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_oak_spire_fence_gate"), new BlockItem(ModBlocks.MANGROVE_OAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_classic"), new BlockItem(ModBlocks.OAK_MANGROVE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_wildlife"), new BlockItem(ModBlocks.OAK_MANGROVE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_decoration"), new BlockItem(ModBlocks.OAK_MANGROVE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_decoration_fence_gate"), new BlockItem(ModBlocks.OAK_MANGROVE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_plank"), new BlockItem(ModBlocks.OAK_MANGROVE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_garden"), new BlockItem(ModBlocks.OAK_MANGROVE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_garden_fence_gate"), new BlockItem(ModBlocks.OAK_MANGROVE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_bollard"), new BlockItem(ModBlocks.OAK_MANGROVE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_bollard_fence_gate"), new BlockItem(ModBlocks.OAK_MANGROVE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_stick"), new BlockItem(ModBlocks.OAK_MANGROVE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_stick_fence_gate"), new BlockItem(ModBlocks.OAK_MANGROVE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_crisscross"), new BlockItem(ModBlocks.OAK_MANGROVE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_spire"), new BlockItem(ModBlocks.OAK_MANGROVE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_mangrove_spire_fence_gate"), new BlockItem(ModBlocks.OAK_MANGROVE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_classic"), new BlockItem(ModBlocks.MANGROVE_BIRCH_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_wildlife"), new BlockItem(ModBlocks.MANGROVE_BIRCH_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_decoration"), new BlockItem(ModBlocks.MANGROVE_BIRCH_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_decoration_fence_gate"), new BlockItem(ModBlocks.MANGROVE_BIRCH_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_plank"), new BlockItem(ModBlocks.MANGROVE_BIRCH_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_garden"), new BlockItem(ModBlocks.MANGROVE_BIRCH_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_garden_fence_gate"), new BlockItem(ModBlocks.MANGROVE_BIRCH_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_bollard"), new BlockItem(ModBlocks.MANGROVE_BIRCH_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_bollard_fence_gate"), new BlockItem(ModBlocks.MANGROVE_BIRCH_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_stick"), new BlockItem(ModBlocks.MANGROVE_BIRCH_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_stick_fence_gate"), new BlockItem(ModBlocks.MANGROVE_BIRCH_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_crisscross"), new BlockItem(ModBlocks.MANGROVE_BIRCH_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_spire"), new BlockItem(ModBlocks.MANGROVE_BIRCH_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_birch_spire_fence_gate"), new BlockItem(ModBlocks.MANGROVE_BIRCH_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_classic"), new BlockItem(ModBlocks.BIRCH_MANGROVE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_wildlife"), new BlockItem(ModBlocks.BIRCH_MANGROVE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_decoration"), new BlockItem(ModBlocks.BIRCH_MANGROVE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_decoration_fence_gate"), new BlockItem(ModBlocks.BIRCH_MANGROVE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_plank"), new BlockItem(ModBlocks.BIRCH_MANGROVE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_garden"), new BlockItem(ModBlocks.BIRCH_MANGROVE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_garden_fence_gate"), new BlockItem(ModBlocks.BIRCH_MANGROVE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_bollard"), new BlockItem(ModBlocks.BIRCH_MANGROVE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_bollard_fence_gate"), new BlockItem(ModBlocks.BIRCH_MANGROVE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_stick"), new BlockItem(ModBlocks.BIRCH_MANGROVE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_stick_fence_gate"), new BlockItem(ModBlocks.BIRCH_MANGROVE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_crisscross"), new BlockItem(ModBlocks.BIRCH_MANGROVE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_spire"), new BlockItem(ModBlocks.BIRCH_MANGROVE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_mangrove_spire_fence_gate"), new BlockItem(ModBlocks.BIRCH_MANGROVE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_classic"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_wildlife"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_decoration"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_decoration_fence_gate"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_plank"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_garden"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_garden_fence_gate"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_bollard"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_bollard_fence_gate"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_stick"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_stick_fence_gate"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_crisscross"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_spire"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_jungle_spire_fence_gate"), new BlockItem(ModBlocks.MANGROVE_JUNGLE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_classic"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_wildlife"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_decoration"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_decoration_fence_gate"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_plank"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_garden"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_garden_fence_gate"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_bollard"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_bollard_fence_gate"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_stick"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_stick_fence_gate"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_crisscross"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_spire"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_mangrove_spire_fence_gate"), new BlockItem(ModBlocks.JUNGLE_MANGROVE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_classic"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_wildlife"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_decoration"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_decoration_fence_gate"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_plank"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_garden"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_garden_fence_gate"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_bollard"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_bollard_fence_gate"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_stick"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_stick_fence_gate"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_crisscross"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_spire"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_darkoak_spire_fence_gate"), new BlockItem(ModBlocks.MANGROVE_DARKOAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_classic"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_wildlife"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_decoration"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_decoration_fence_gate"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_plank"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_garden"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_garden_fence_gate"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_bollard"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_bollard_fence_gate"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_stick"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_stick_fence_gate"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_crisscross"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_spire"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_mangrove_spire_fence_gate"), new BlockItem(ModBlocks.DARKOAK_MANGROVE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_classic"), new BlockItem(ModBlocks.MANGROVE_WARPED_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_wildlife"), new BlockItem(ModBlocks.MANGROVE_WARPED_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_decoration"), new BlockItem(ModBlocks.MANGROVE_WARPED_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_decoration_fence_gate"), new BlockItem(ModBlocks.MANGROVE_WARPED_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_plank"), new BlockItem(ModBlocks.MANGROVE_WARPED_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_garden"), new BlockItem(ModBlocks.MANGROVE_WARPED_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_garden_fence_gate"), new BlockItem(ModBlocks.MANGROVE_WARPED_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_bollard"), new BlockItem(ModBlocks.MANGROVE_WARPED_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_bollard_fence_gate"), new BlockItem(ModBlocks.MANGROVE_WARPED_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_stick"), new BlockItem(ModBlocks.MANGROVE_WARPED_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_stick_fence_gate"), new BlockItem(ModBlocks.MANGROVE_WARPED_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_crisscross"), new BlockItem(ModBlocks.MANGROVE_WARPED_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_spire"), new BlockItem(ModBlocks.MANGROVE_WARPED_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_warped_spire_fence_gate"), new BlockItem(ModBlocks.MANGROVE_WARPED_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_classic"), new BlockItem(ModBlocks.WARPED_MANGROVE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_wildlife"), new BlockItem(ModBlocks.WARPED_MANGROVE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_decoration"), new BlockItem(ModBlocks.WARPED_MANGROVE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_decoration_fence_gate"), new BlockItem(ModBlocks.WARPED_MANGROVE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_plank"), new BlockItem(ModBlocks.WARPED_MANGROVE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_garden"), new BlockItem(ModBlocks.WARPED_MANGROVE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_garden_fence_gate"), new BlockItem(ModBlocks.WARPED_MANGROVE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_bollard"), new BlockItem(ModBlocks.WARPED_MANGROVE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_bollard_fence_gate"), new BlockItem(ModBlocks.WARPED_MANGROVE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_stick"), new BlockItem(ModBlocks.WARPED_MANGROVE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_stick_fence_gate"), new BlockItem(ModBlocks.WARPED_MANGROVE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_crisscross"), new BlockItem(ModBlocks.WARPED_MANGROVE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_spire"), new BlockItem(ModBlocks.WARPED_MANGROVE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_mangrove_spire_fence_gate"), new BlockItem(ModBlocks.WARPED_MANGROVE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_classic"), new BlockItem(ModBlocks.BAMBOO_OAK_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_wildlife"), new BlockItem(ModBlocks.BAMBOO_OAK_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_decoration"), new BlockItem(ModBlocks.BAMBOO_OAK_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_decoration_fence_gate"), new BlockItem(ModBlocks.BAMBOO_OAK_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_plank"), new BlockItem(ModBlocks.BAMBOO_OAK_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_garden"), new BlockItem(ModBlocks.BAMBOO_OAK_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_garden_fence_gate"), new BlockItem(ModBlocks.BAMBOO_OAK_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_bollard"), new BlockItem(ModBlocks.BAMBOO_OAK_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_bollard_fence_gate"), new BlockItem(ModBlocks.BAMBOO_OAK_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_stick"), new BlockItem(ModBlocks.BAMBOO_OAK_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_stick_fence_gate"), new BlockItem(ModBlocks.BAMBOO_OAK_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_crisscross"), new BlockItem(ModBlocks.BAMBOO_OAK_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_spire"), new BlockItem(ModBlocks.BAMBOO_OAK_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_oak_spire_fence_gate"), new BlockItem(ModBlocks.BAMBOO_OAK_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_classic"), new BlockItem(ModBlocks.OAK_BAMBOO_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_wildlife"), new BlockItem(ModBlocks.OAK_BAMBOO_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_decoration"), new BlockItem(ModBlocks.OAK_BAMBOO_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_decoration_fence_gate"), new BlockItem(ModBlocks.OAK_BAMBOO_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_plank"), new BlockItem(ModBlocks.OAK_BAMBOO_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_garden"), new BlockItem(ModBlocks.OAK_BAMBOO_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_garden_fence_gate"), new BlockItem(ModBlocks.OAK_BAMBOO_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_bollard"), new BlockItem(ModBlocks.OAK_BAMBOO_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_bollard_fence_gate"), new BlockItem(ModBlocks.OAK_BAMBOO_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_stick"), new BlockItem(ModBlocks.OAK_BAMBOO_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_stick_fence_gate"), new BlockItem(ModBlocks.OAK_BAMBOO_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_crisscross"), new BlockItem(ModBlocks.OAK_BAMBOO_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_spire"), new BlockItem(ModBlocks.OAK_BAMBOO_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_bamboo_spire_fence_gate"), new BlockItem(ModBlocks.OAK_BAMBOO_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_classic"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_wildlife"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_decoration"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_decoration_fence_gate"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_plank"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_garden"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_garden_fence_gate"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_bollard"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_bollard_fence_gate"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_stick"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_stick_fence_gate"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_crisscross"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_spire"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_spruce_spire_fence_gate"), new BlockItem(ModBlocks.BAMBOO_SPRUCE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_classic"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_wildlife"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_decoration"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_decoration_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_plank"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_garden"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_garden_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_bollard"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_bollard_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_stick"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_stick_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_crisscross"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_spire"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_bamboo_spire_fence_gate"), new BlockItem(ModBlocks.SPRUCE_BAMBOO_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_classic"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_wildlife"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_decoration"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_decoration_fence_gate"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_plank"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_garden"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_garden_fence_gate"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_bollard"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_bollard_fence_gate"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_stick"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_stick_fence_gate"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_crisscross"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_spire"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_jungle_spire_fence_gate"), new BlockItem(ModBlocks.BAMBOO_JUNGLE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_classic"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_wildlife"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_decoration"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_decoration_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_plank"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_garden"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_garden_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_bollard"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_bollard_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_stick"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_stick_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_crisscross"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_spire"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_bamboo_spire_fence_gate"), new BlockItem(ModBlocks.JUNGLE_BAMBOO_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_classic"), new BlockItem(ModBlocks.BAMBOO_ACACIA_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_wildlife"), new BlockItem(ModBlocks.BAMBOO_ACACIA_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_decoration"), new BlockItem(ModBlocks.BAMBOO_ACACIA_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_decoration_fence_gate"), new BlockItem(ModBlocks.BAMBOO_ACACIA_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_plank"), new BlockItem(ModBlocks.BAMBOO_ACACIA_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_garden"), new BlockItem(ModBlocks.BAMBOO_ACACIA_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_garden_fence_gate"), new BlockItem(ModBlocks.BAMBOO_ACACIA_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_bollard"), new BlockItem(ModBlocks.BAMBOO_ACACIA_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_bollard_fence_gate"), new BlockItem(ModBlocks.BAMBOO_ACACIA_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_stick"), new BlockItem(ModBlocks.BAMBOO_ACACIA_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_stick_fence_gate"), new BlockItem(ModBlocks.BAMBOO_ACACIA_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_crisscross"), new BlockItem(ModBlocks.BAMBOO_ACACIA_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_spire"), new BlockItem(ModBlocks.BAMBOO_ACACIA_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_acacia_spire_fence_gate"), new BlockItem(ModBlocks.BAMBOO_ACACIA_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_classic"), new BlockItem(ModBlocks.ACACIA_BAMBOO_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_wildlife"), new BlockItem(ModBlocks.ACACIA_BAMBOO_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_decoration"), new BlockItem(ModBlocks.ACACIA_BAMBOO_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_decoration_fence_gate"), new BlockItem(ModBlocks.ACACIA_BAMBOO_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_plank"), new BlockItem(ModBlocks.ACACIA_BAMBOO_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_garden"), new BlockItem(ModBlocks.ACACIA_BAMBOO_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_garden_fence_gate"), new BlockItem(ModBlocks.ACACIA_BAMBOO_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_bollard"), new BlockItem(ModBlocks.ACACIA_BAMBOO_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_bollard_fence_gate"), new BlockItem(ModBlocks.ACACIA_BAMBOO_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_stick"), new BlockItem(ModBlocks.ACACIA_BAMBOO_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_stick_fence_gate"), new BlockItem(ModBlocks.ACACIA_BAMBOO_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_crisscross"), new BlockItem(ModBlocks.ACACIA_BAMBOO_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_spire"), new BlockItem(ModBlocks.ACACIA_BAMBOO_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_bamboo_spire_fence_gate"), new BlockItem(ModBlocks.ACACIA_BAMBOO_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_classic"), new BlockItem(ModBlocks.BAMBOO_WARPED_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_wildlife"), new BlockItem(ModBlocks.BAMBOO_WARPED_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_decoration"), new BlockItem(ModBlocks.BAMBOO_WARPED_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_decoration_fence_gate"), new BlockItem(ModBlocks.BAMBOO_WARPED_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_plank"), new BlockItem(ModBlocks.BAMBOO_WARPED_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_garden"), new BlockItem(ModBlocks.BAMBOO_WARPED_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_garden_fence_gate"), new BlockItem(ModBlocks.BAMBOO_WARPED_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_bollard"), new BlockItem(ModBlocks.BAMBOO_WARPED_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_bollard_fence_gate"), new BlockItem(ModBlocks.BAMBOO_WARPED_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_stick"), new BlockItem(ModBlocks.BAMBOO_WARPED_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_stick_fence_gate"), new BlockItem(ModBlocks.BAMBOO_WARPED_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_crisscross"), new BlockItem(ModBlocks.BAMBOO_WARPED_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_spire"), new BlockItem(ModBlocks.BAMBOO_WARPED_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_warped_spire_fence_gate"), new BlockItem(ModBlocks.BAMBOO_WARPED_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_classic"), new BlockItem(ModBlocks.WARPED_BAMBOO_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_wildlife"), new BlockItem(ModBlocks.WARPED_BAMBOO_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_decoration"), new BlockItem(ModBlocks.WARPED_BAMBOO_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_decoration_fence_gate"), new BlockItem(ModBlocks.WARPED_BAMBOO_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_plank"), new BlockItem(ModBlocks.WARPED_BAMBOO_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_garden"), new BlockItem(ModBlocks.WARPED_BAMBOO_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_garden_fence_gate"), new BlockItem(ModBlocks.WARPED_BAMBOO_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_bollard"), new BlockItem(ModBlocks.WARPED_BAMBOO_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_bollard_fence_gate"), new BlockItem(ModBlocks.WARPED_BAMBOO_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_stick"), new BlockItem(ModBlocks.WARPED_BAMBOO_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_stick_fence_gate"), new BlockItem(ModBlocks.WARPED_BAMBOO_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_crisscross"), new BlockItem(ModBlocks.WARPED_BAMBOO_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_spire"), new BlockItem(ModBlocks.WARPED_BAMBOO_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_bamboo_spire_fence_gate"), new BlockItem(ModBlocks.WARPED_BAMBOO_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_classic"), new BlockItem(ModBlocks.CHERRY_JUNGLE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_wildlife"), new BlockItem(ModBlocks.CHERRY_JUNGLE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_decoration"), new BlockItem(ModBlocks.CHERRY_JUNGLE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_decoration_fence_gate"), new BlockItem(ModBlocks.CHERRY_JUNGLE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_plank"), new BlockItem(ModBlocks.CHERRY_JUNGLE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_garden"), new BlockItem(ModBlocks.CHERRY_JUNGLE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_garden_fence_gate"), new BlockItem(ModBlocks.CHERRY_JUNGLE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_bollard"), new BlockItem(ModBlocks.CHERRY_JUNGLE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_bollard_fence_gate"), new BlockItem(ModBlocks.CHERRY_JUNGLE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_stick"), new BlockItem(ModBlocks.CHERRY_JUNGLE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_stick_fence_gate"), new BlockItem(ModBlocks.CHERRY_JUNGLE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_crisscross"), new BlockItem(ModBlocks.CHERRY_JUNGLE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_spire"), new BlockItem(ModBlocks.CHERRY_JUNGLE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_jungle_spire_fence_gate"), new BlockItem(ModBlocks.CHERRY_JUNGLE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_classic"), new BlockItem(ModBlocks.JUNGLE_CHERRY_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_wildlife"), new BlockItem(ModBlocks.JUNGLE_CHERRY_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_decoration"), new BlockItem(ModBlocks.JUNGLE_CHERRY_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_decoration_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CHERRY_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_plank"), new BlockItem(ModBlocks.JUNGLE_CHERRY_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_garden"), new BlockItem(ModBlocks.JUNGLE_CHERRY_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_garden_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CHERRY_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_bollard"), new BlockItem(ModBlocks.JUNGLE_CHERRY_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_bollard_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CHERRY_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_stick"), new BlockItem(ModBlocks.JUNGLE_CHERRY_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_stick_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CHERRY_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_crisscross"), new BlockItem(ModBlocks.JUNGLE_CHERRY_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_spire"), new BlockItem(ModBlocks.JUNGLE_CHERRY_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_cherry_spire_fence_gate"), new BlockItem(ModBlocks.JUNGLE_CHERRY_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_classic"), new BlockItem(ModBlocks.CHERRY_ACACIA_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_wildlife"), new BlockItem(ModBlocks.CHERRY_ACACIA_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_decoration"), new BlockItem(ModBlocks.CHERRY_ACACIA_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_decoration_fence_gate"), new BlockItem(ModBlocks.CHERRY_ACACIA_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_plank"), new BlockItem(ModBlocks.CHERRY_ACACIA_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_garden"), new BlockItem(ModBlocks.CHERRY_ACACIA_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_garden_fence_gate"), new BlockItem(ModBlocks.CHERRY_ACACIA_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_bollard"), new BlockItem(ModBlocks.CHERRY_ACACIA_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_bollard_fence_gate"), new BlockItem(ModBlocks.CHERRY_ACACIA_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_stick"), new BlockItem(ModBlocks.CHERRY_ACACIA_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_stick_fence_gate"), new BlockItem(ModBlocks.CHERRY_ACACIA_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_crisscross"), new BlockItem(ModBlocks.CHERRY_ACACIA_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_spire"), new BlockItem(ModBlocks.CHERRY_ACACIA_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_acacia_spire_fence_gate"), new BlockItem(ModBlocks.CHERRY_ACACIA_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_classic"), new BlockItem(ModBlocks.ACACIA_CHERRY_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_wildlife"), new BlockItem(ModBlocks.ACACIA_CHERRY_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_decoration"), new BlockItem(ModBlocks.ACACIA_CHERRY_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_decoration_fence_gate"), new BlockItem(ModBlocks.ACACIA_CHERRY_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_plank"), new BlockItem(ModBlocks.ACACIA_CHERRY_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_garden"), new BlockItem(ModBlocks.ACACIA_CHERRY_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_garden_fence_gate"), new BlockItem(ModBlocks.ACACIA_CHERRY_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_bollard"), new BlockItem(ModBlocks.ACACIA_CHERRY_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_bollard_fence_gate"), new BlockItem(ModBlocks.ACACIA_CHERRY_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_stick"), new BlockItem(ModBlocks.ACACIA_CHERRY_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_stick_fence_gate"), new BlockItem(ModBlocks.ACACIA_CHERRY_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_crisscross"), new BlockItem(ModBlocks.ACACIA_CHERRY_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_spire"), new BlockItem(ModBlocks.ACACIA_CHERRY_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_cherry_spire_fence_gate"), new BlockItem(ModBlocks.ACACIA_CHERRY_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_classic"), new BlockItem(ModBlocks.CHERRY_MANGROVE_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_wildlife"), new BlockItem(ModBlocks.CHERRY_MANGROVE_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_decoration"), new BlockItem(ModBlocks.CHERRY_MANGROVE_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_decoration_fence_gate"), new BlockItem(ModBlocks.CHERRY_MANGROVE_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_plank"), new BlockItem(ModBlocks.CHERRY_MANGROVE_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_garden"), new BlockItem(ModBlocks.CHERRY_MANGROVE_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_garden_fence_gate"), new BlockItem(ModBlocks.CHERRY_MANGROVE_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_bollard"), new BlockItem(ModBlocks.CHERRY_MANGROVE_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_bollard_fence_gate"), new BlockItem(ModBlocks.CHERRY_MANGROVE_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_stick"), new BlockItem(ModBlocks.CHERRY_MANGROVE_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_stick_fence_gate"), new BlockItem(ModBlocks.CHERRY_MANGROVE_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_crisscross"), new BlockItem(ModBlocks.CHERRY_MANGROVE_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_spire"), new BlockItem(ModBlocks.CHERRY_MANGROVE_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_mangrove_spire_fence_gate"), new BlockItem(ModBlocks.CHERRY_MANGROVE_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_classic"), new BlockItem(ModBlocks.MANGROVE_CHERRY_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_wildlife"), new BlockItem(ModBlocks.MANGROVE_CHERRY_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_decoration"), new BlockItem(ModBlocks.MANGROVE_CHERRY_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_decoration_fence_gate"), new BlockItem(ModBlocks.MANGROVE_CHERRY_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_plank"), new BlockItem(ModBlocks.MANGROVE_CHERRY_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_garden"), new BlockItem(ModBlocks.MANGROVE_CHERRY_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_garden_fence_gate"), new BlockItem(ModBlocks.MANGROVE_CHERRY_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_bollard"), new BlockItem(ModBlocks.MANGROVE_CHERRY_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_bollard_fence_gate"), new BlockItem(ModBlocks.MANGROVE_CHERRY_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_stick"), new BlockItem(ModBlocks.MANGROVE_CHERRY_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_stick_fence_gate"), new BlockItem(ModBlocks.MANGROVE_CHERRY_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_crisscross"), new BlockItem(ModBlocks.MANGROVE_CHERRY_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_spire"), new BlockItem(ModBlocks.MANGROVE_CHERRY_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_cherry_spire_fence_gate"), new BlockItem(ModBlocks.MANGROVE_CHERRY_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_classic"), new BlockItem(ModBlocks.CHERRY_BAMBOO_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_wildlife"), new BlockItem(ModBlocks.CHERRY_BAMBOO_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_decoration"), new BlockItem(ModBlocks.CHERRY_BAMBOO_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_decoration_fence_gate"), new BlockItem(ModBlocks.CHERRY_BAMBOO_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_plank"), new BlockItem(ModBlocks.CHERRY_BAMBOO_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_garden"), new BlockItem(ModBlocks.CHERRY_BAMBOO_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_garden_fence_gate"), new BlockItem(ModBlocks.CHERRY_BAMBOO_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_bollard"), new BlockItem(ModBlocks.CHERRY_BAMBOO_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_bollard_fence_gate"), new BlockItem(ModBlocks.CHERRY_BAMBOO_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_stick"), new BlockItem(ModBlocks.CHERRY_BAMBOO_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_stick_fence_gate"), new BlockItem(ModBlocks.CHERRY_BAMBOO_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_crisscross"), new BlockItem(ModBlocks.CHERRY_BAMBOO_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_spire"), new BlockItem(ModBlocks.CHERRY_BAMBOO_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_bamboo_spire_fence_gate"), new BlockItem(ModBlocks.CHERRY_BAMBOO_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_classic"), new BlockItem(ModBlocks.BAMBOO_CHERRY_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_wildlife"), new BlockItem(ModBlocks.BAMBOO_CHERRY_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_decoration"), new BlockItem(ModBlocks.BAMBOO_CHERRY_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_decoration_fence_gate"), new BlockItem(ModBlocks.BAMBOO_CHERRY_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_plank"), new BlockItem(ModBlocks.BAMBOO_CHERRY_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_garden"), new BlockItem(ModBlocks.BAMBOO_CHERRY_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_garden_fence_gate"), new BlockItem(ModBlocks.BAMBOO_CHERRY_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_bollard"), new BlockItem(ModBlocks.BAMBOO_CHERRY_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_bollard_fence_gate"), new BlockItem(ModBlocks.BAMBOO_CHERRY_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_stick"), new BlockItem(ModBlocks.BAMBOO_CHERRY_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_stick_fence_gate"), new BlockItem(ModBlocks.BAMBOO_CHERRY_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_crisscross"), new BlockItem(ModBlocks.BAMBOO_CHERRY_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_spire"), new BlockItem(ModBlocks.BAMBOO_CHERRY_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_cherry_spire_fence_gate"), new BlockItem(ModBlocks.BAMBOO_CHERRY_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_classic"), new BlockItem(ModBlocks.CHERRY_CRIMSON_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_wildlife"), new BlockItem(ModBlocks.CHERRY_CRIMSON_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_decoration"), new BlockItem(ModBlocks.CHERRY_CRIMSON_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_decoration_fence_gate"), new BlockItem(ModBlocks.CHERRY_CRIMSON_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_plank"), new BlockItem(ModBlocks.CHERRY_CRIMSON_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_garden"), new BlockItem(ModBlocks.CHERRY_CRIMSON_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_garden_fence_gate"), new BlockItem(ModBlocks.CHERRY_CRIMSON_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_bollard"), new BlockItem(ModBlocks.CHERRY_CRIMSON_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_bollard_fence_gate"), new BlockItem(ModBlocks.CHERRY_CRIMSON_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_stick"), new BlockItem(ModBlocks.CHERRY_CRIMSON_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_stick_fence_gate"), new BlockItem(ModBlocks.CHERRY_CRIMSON_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_crisscross"), new BlockItem(ModBlocks.CHERRY_CRIMSON_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_spire"), new BlockItem(ModBlocks.CHERRY_CRIMSON_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_crimson_spire_fence_gate"), new BlockItem(ModBlocks.CHERRY_CRIMSON_SPIRE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_classic"), new BlockItem(ModBlocks.CRIMSON_CHERRY_CLASSIC, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_wildlife"), new BlockItem(ModBlocks.CRIMSON_CHERRY_WILDLIFE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_decoration"), new BlockItem(ModBlocks.CRIMSON_CHERRY_DECORATION, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_decoration_fence_gate"), new BlockItem(ModBlocks.CRIMSON_CHERRY_DECORATION_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_plank"), new BlockItem(ModBlocks.CRIMSON_CHERRY_PLANK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_garden"), new BlockItem(ModBlocks.CRIMSON_CHERRY_GARDEN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_garden_fence_gate"), new BlockItem(ModBlocks.CRIMSON_CHERRY_GARDEN_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_bollard"), new BlockItem(ModBlocks.CRIMSON_CHERRY_BOLLARD, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_bollard_fence_gate"), new BlockItem(ModBlocks.CRIMSON_CHERRY_BOLLARD_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_stick"), new BlockItem(ModBlocks.CRIMSON_CHERRY_STICK, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_stick_fence_gate"), new BlockItem(ModBlocks.CRIMSON_CHERRY_STICK_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_crisscross"), new BlockItem(ModBlocks.CRIMSON_CHERRY_CRISSCROSS, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_spire"), new BlockItem(ModBlocks.CRIMSON_CHERRY_SPIRE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_cherry_spire_fence_gate"), new BlockItem(ModBlocks.CRIMSON_CHERRY_SPIRE_GATE, new BlockItem.Settings()));

        //END WOODENFENCES AND BEGIN STONEWALLS

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_modern"), new BlockItem(ModBlocks.COBBLESTONE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_building"), new BlockItem(ModBlocks.COBBLESTONE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_castle"), new BlockItem(ModBlocks.COBBLESTONE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mossy_cobblestone_modern"), new BlockItem(ModBlocks.MOSSY_COBBLESTONE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mossy_cobblestone_building"), new BlockItem(ModBlocks.MOSSY_COBBLESTONE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mossy_cobblestone_castle"), new BlockItem(ModBlocks.MOSSY_COBBLESTONE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":stone_modern"), new BlockItem(ModBlocks.STONE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":stone_building"), new BlockItem(ModBlocks.STONE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":stone_castle"), new BlockItem(ModBlocks.STONE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":stone_bricks_modern"), new BlockItem(ModBlocks.STONE_BRICKS_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":stone_bricks_building"), new BlockItem(ModBlocks.STONE_BRICKS_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":stone_bricks_castle"), new BlockItem(ModBlocks.STONE_BRICKS_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mossy_stone_bricks_modern"), new BlockItem(ModBlocks.MOSSY_STONE_BRICKS_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mossy_stone_bricks_building"), new BlockItem(ModBlocks.MOSSY_STONE_BRICKS_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mossy_stone_bricks_castle"), new BlockItem(ModBlocks.MOSSY_STONE_BRICKS_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":andesite_modern"), new BlockItem(ModBlocks.ANDESITE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":andesite_building"), new BlockItem(ModBlocks.ANDESITE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":andesite_castle"), new BlockItem(ModBlocks.ANDESITE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":diorite_modern"), new BlockItem(ModBlocks.DIORITE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":diorite_building"), new BlockItem(ModBlocks.DIORITE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":diorite_castle"), new BlockItem(ModBlocks.DIORITE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":granite_modern"), new BlockItem(ModBlocks.GRANITE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":granite_building"), new BlockItem(ModBlocks.GRANITE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":granite_castle"), new BlockItem(ModBlocks.GRANITE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":sandstone_modern"), new BlockItem(ModBlocks.SANDSTONE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":sandstone_building"), new BlockItem(ModBlocks.SANDSTONE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":sandstone_castle"), new BlockItem(ModBlocks.SANDSTONE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":red_sandstone_modern"), new BlockItem(ModBlocks.RED_SANDSTONE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":red_sandstone_building"), new BlockItem(ModBlocks.RED_SANDSTONE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":red_sandstone_castle"), new BlockItem(ModBlocks.RED_SANDSTONE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bricks_modern"), new BlockItem(ModBlocks.BRICKS_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bricks_building"), new BlockItem(ModBlocks.BRICKS_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bricks_castle"), new BlockItem(ModBlocks.BRICKS_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":prismarine_modern"), new BlockItem(ModBlocks.PRISMARINE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":prismarine_building"), new BlockItem(ModBlocks.PRISMARINE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":prismarine_castle"), new BlockItem(ModBlocks.PRISMARINE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":nether_bricks_modern"), new BlockItem(ModBlocks.NETHER_BRICKS_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":nether_bricks_building"), new BlockItem(ModBlocks.NETHER_BRICKS_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":nether_bricks_castle"), new BlockItem(ModBlocks.NETHER_BRICKS_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":red_nether_bricks_modern"), new BlockItem(ModBlocks.RED_NETHER_BRICKS_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":red_nether_bricks_building"), new BlockItem(ModBlocks.RED_NETHER_BRICKS_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":red_nether_bricks_castle"), new BlockItem(ModBlocks.RED_NETHER_BRICKS_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":end_stone_bricks_modern"), new BlockItem(ModBlocks.END_STONE_BRICKS_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":end_stone_bricks_building"), new BlockItem(ModBlocks.END_STONE_BRICKS_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":end_stone_bricks_castle"), new BlockItem(ModBlocks.END_STONE_BRICKS_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":blackstone_modern"), new BlockItem(ModBlocks.BLACKSTONE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":blackstone_building"), new BlockItem(ModBlocks.BLACKSTONE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":blackstone_castle"), new BlockItem(ModBlocks.BLACKSTONE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":polished_blackstone_modern"), new BlockItem(ModBlocks.POLISHED_BLACKSTONE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":polished_blackstone_building"), new BlockItem(ModBlocks.POLISHED_BLACKSTONE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":polished_blackstone_castle"), new BlockItem(ModBlocks.POLISHED_BLACKSTONE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":polished_blackstone_bricks_modern"), new BlockItem(ModBlocks.POLISHED_BLACKSTONE_BRICKS_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":polished_blackstone_bricks_building"), new BlockItem(ModBlocks.POLISHED_BLACKSTONE_BRICKS_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":polished_blackstone_bricks_castle"), new BlockItem(ModBlocks.POLISHED_BLACKSTONE_BRICKS_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobbled_deepslate_modern"), new BlockItem(ModBlocks.COBBLED_DEEPSLATE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobbled_deepslate_building"), new BlockItem(ModBlocks.COBBLED_DEEPSLATE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobbled_deepslate_castle"), new BlockItem(ModBlocks.COBBLED_DEEPSLATE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":polished_deepslate_modern"), new BlockItem(ModBlocks.POLISHED_DEEPSLATE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":polished_deepslate_building"), new BlockItem(ModBlocks.POLISHED_DEEPSLATE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":polished_deepslate_castle"), new BlockItem(ModBlocks.POLISHED_DEEPSLATE_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":deepslate_brick_modern"), new BlockItem(ModBlocks.DEEPSLATE_BRICK_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":deepslate_brick_building"), new BlockItem(ModBlocks.DEEPSLATE_BRICK_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":deepslate_brick_castle"), new BlockItem(ModBlocks.DEEPSLATE_BRICK_CASTLE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":deepslate_tile_modern"), new BlockItem(ModBlocks.DEEPSLATE_TILE_MODERN, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":deepslate_tile_building"), new BlockItem(ModBlocks.DEEPSLATE_TILE_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":deepslate_tile_castle"), new BlockItem(ModBlocks.DEEPSLATE_TILE_CASTLE, new BlockItem.Settings()));
        
        //END STONEWALLS AND BEGIN WOODENWALLS

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oak_wall_building"), new BlockItem(ModBlocks.OAK_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":birch_wall_building"), new BlockItem(ModBlocks.BIRCH_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":spruce_wall_building"), new BlockItem(ModBlocks.SPRUCE_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":acacia_wall_building"), new BlockItem(ModBlocks.ACACIA_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":jungle_wall_building"), new BlockItem(ModBlocks.JUNGLE_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":darkoak_wall_building"), new BlockItem(ModBlocks.DARKOAK_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":crimson_wall_building"), new BlockItem(ModBlocks.CRIMSON_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":warped_wall_building"), new BlockItem(ModBlocks.WARPED_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":mangrove_wall_building"), new BlockItem(ModBlocks.MANGROVE_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":bamboo_wall_building"), new BlockItem(ModBlocks.BAMBOO_WALL_BUILDING, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cherry_wall_building"), new BlockItem(ModBlocks.CHERRY_WALL_BUILDING, new BlockItem.Settings()));

        //END WOODENWALLS AND BEGIN METALLFENCES

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_copper_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_COPPER_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_exposed_copper_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_weathered_copper_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_oxidized_copper_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":copper_mansion_fence_gate"), new BlockItem(ModBlocks.COPPER_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":exposed_copper_mansion_fence_gate"), new BlockItem(ModBlocks.EXPOSED_COPPER_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":weathered_copper_mansion_fence_gate"), new BlockItem(ModBlocks.WEATHERED_COPPER_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oxidized_copper_mansion_fence_gate"), new BlockItem(ModBlocks.OXIDIZED_COPPER_MANSION_FENCE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_copper_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_COPPER_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_exposed_copper_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_EXPOSED_COPPER_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_weathered_copper_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_WEATHERED_COPPER_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_oxidized_copper_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_OXIDIZED_COPPER_MANSION_FENCE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_copper_mansion_fence_gate"), new BlockItem(ModBlocks.WAXED_COPPER_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_exposed_copper_mansion_fence_gate"), new BlockItem(ModBlocks.WAXED_EXPOSED_COPPER_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_weathered_copper_mansion_fence_gate"), new BlockItem(ModBlocks.WAXED_WEATHERED_COPPER_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_oxidized_copper_mansion_fence_gate"), new BlockItem(ModBlocks.WAXED_OXIDIZED_COPPER_MANSION_FENCE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_iron_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_IRON_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_exposed_iron_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_EXPOSED_IRON_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_weathered_iron_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WEATHERED_IRON_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_oxidized_iron_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":iron_mansion_fence_gate"), new BlockItem(ModBlocks.IRON_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":exposed_iron_mansion_fence_gate"), new BlockItem(ModBlocks.EXPOSED_IRON_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":weathered_iron_mansion_fence_gate"), new BlockItem(ModBlocks.WEATHERED_IRON_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oxidized_iron_mansion_fence_gate"), new BlockItem(ModBlocks.OXIDIZED_IRON_MANSION_FENCE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_iron_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_IRON_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_exposed_iron_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_EXPOSED_IRON_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_weathered_iron_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_WEATHERED_IRON_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_oxidized_iron_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_OXIDIZED_IRON_MANSION_FENCE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_iron_mansion_fence_gate"), new BlockItem(ModBlocks.WAXED_IRON_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_exposed_iron_mansion_fence_gate"), new BlockItem(ModBlocks.WAXED_EXPOSED_IRON_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_weathered_iron_mansion_fence_gate"), new BlockItem(ModBlocks.WAXED_WEATHERED_IRON_MANSION_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_oxidized_iron_mansion_fence_gate"), new BlockItem(ModBlocks.WAXED_OXIDIZED_IRON_MANSION_FENCE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_gold_mansion_fence"), new BlockItem(ModBlocks.COBBLESTONE_GOLD_MANSION_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":gold_mansion_fence_gate"), new BlockItem(ModBlocks.GOLD_MANSION_FENCE_GATE, new BlockItem.Settings()));


        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_copper_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_COPPER_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_exposed_copper_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_EXPOSED_COPPER_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_weathered_copper_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WEATHERED_COPPER_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_oxidized_copper_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":copper_mesh_fence_gate"), new BlockItem(ModBlocks.COPPER_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":exposed_copper_mesh_fence_gate"), new BlockItem(ModBlocks.EXPOSED_COPPER_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":weathered_copper_mesh_fence_gate"), new BlockItem(ModBlocks.WEATHERED_COPPER_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oxidized_copper_mesh_fence_gate"), new BlockItem(ModBlocks.OXIDIZED_COPPER_MESH_FENCE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_copper_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_COPPER_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_exposed_copper_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_EXPOSED_COPPER_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_weathered_copper_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_WEATHERED_COPPER_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_oxidized_copper_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_OXIDIZED_COPPER_MESH_FENCE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_copper_mesh_fence_gate"), new BlockItem(ModBlocks.WAXED_COPPER_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_exposed_copper_mesh_fence_gate"), new BlockItem(ModBlocks.WAXED_EXPOSED_COPPER_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_weathered_copper_mesh_fence_gate"), new BlockItem(ModBlocks.WAXED_WEATHERED_COPPER_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_oxidized_copper_mesh_fence_gate"), new BlockItem(ModBlocks.WAXED_OXIDIZED_COPPER_MESH_FENCE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_iron_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_IRON_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_exposed_iron_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_EXPOSED_IRON_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_weathered_iron_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WEATHERED_IRON_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_oxidized_iron_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_OXIDIZED_IRON_MESH_FENCE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":iron_mesh_fence_gate"), new BlockItem(ModBlocks.IRON_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":exposed_iron_mesh_fence_gate"), new BlockItem(ModBlocks.EXPOSED_IRON_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":weathered_iron_mesh_fence_gate"), new BlockItem(ModBlocks.WEATHERED_IRON_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":oxidized_iron_mesh_fence_gate"), new BlockItem(ModBlocks.OXIDIZED_IRON_MESH_FENCE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_iron_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_IRON_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_exposed_iron_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_EXPOSED_IRON_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_weathered_iron_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_WEATHERED_IRON_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_waxed_oxidized_iron_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_WAXED_OXIDIZED_IRON_MESH_FENCE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_iron_mesh_fence_gate"), new BlockItem(ModBlocks.WAXED_IRON_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_exposed_iron_mesh_fence_gate"), new BlockItem(ModBlocks.WAXED_EXPOSED_IRON_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_weathered_iron_mesh_fence_gate"), new BlockItem(ModBlocks.WAXED_WEATHERED_IRON_MESH_FENCE_GATE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":waxed_oxidized_iron_mesh_fence_gate"), new BlockItem(ModBlocks.WAXED_OXIDIZED_IRON_MESH_FENCE_GATE, new BlockItem.Settings()));

        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":cobblestone_gold_mesh_fence"), new BlockItem(ModBlocks.COBBLESTONE_GOLD_MESH_FENCE, new BlockItem.Settings()));
        Registry.register(Registries.ITEM, Main.MOD_ID.concat(":gold_mesh_fence_gate"), new BlockItem(ModBlocks.GOLD_MESH_FENCE_GATE, new BlockItem.Settings()));

        
        //END METALLFENCES

*/

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Main.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.SPRUCE_OAK_CLASSIC.asItem());
        });
    }


}
