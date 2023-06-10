package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@SuppressWarnings({"WeakerAccess", "unused"})
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    //BEGIN WOODENFENCEGATES

    public static final RegistryObject<Item> OAK_CLASSIC_GATE = ITEMS.register("oak_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WILDLIFE_GATE = ITEMS.register("oak_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_PLANK_GATE = ITEMS.register("oak_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRISSCROSS_GATE = ITEMS.register("oak_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_CLASSIC_GATE = ITEMS.register("birch_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WILDLIFE_GATE = ITEMS.register("birch_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_PLANK_GATE = ITEMS.register("birch_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_CRISSCROSS_GATE = ITEMS.register("birch_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_CLASSIC_GATE = ITEMS.register("spruce_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WILDLIFE_GATE = ITEMS.register("spruce_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_PLANK_GATE = ITEMS.register("spruce_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_CRISSCROSS_GATE = ITEMS.register("spruce_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_CLASSIC_GATE = ITEMS.register("jungle_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WILDLIFE_GATE = ITEMS.register("jungle_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_PLANK_GATE = ITEMS.register("jungle_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRISSCROSS_GATE = ITEMS.register("jungle_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_CLASSIC_GATE = ITEMS.register("acacia_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WILDLIFE_GATE = ITEMS.register("acacia_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_PLANK_GATE = ITEMS.register("acacia_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CRISSCROSS_GATE = ITEMS.register("acacia_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DARKOAK_CLASSIC_GATE = ITEMS.register("darkoak_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_WILDLIFE_GATE = ITEMS.register("darkoak_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_PLANK_GATE = ITEMS.register("darkoak_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRISSCROSS_GATE = ITEMS.register("darkoak_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WARPED_CLASSIC_GATE = ITEMS.register("warped_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WILDLIFE_GATE = ITEMS.register("warped_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_PLANK_GATE = ITEMS.register("warped_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_CRISSCROSS_GATE = ITEMS.register("warped_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CRIMSON_CLASSIC_GATE = ITEMS.register("crimson_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WILDLIFE_GATE = ITEMS.register("crimson_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_PLANK_GATE = ITEMS.register("crimson_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CRISSCROSS_GATE = ITEMS.register("crimson_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_CLASSIC_GATE = ITEMS.register("mangrove_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WILDLIFE_GATE = ITEMS.register("mangrove_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_PLANK_GATE = ITEMS.register("mangrove_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CRISSCROSS_GATE = ITEMS.register("mangrove_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAMBOO_CLASSIC_GATE = ITEMS.register("bamboo_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WILDLIFE_GATE = ITEMS.register("bamboo_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_PLANK_GATE = ITEMS.register("bamboo_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CRISSCROSS_GATE = ITEMS.register("bamboo_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CRISSCROSS_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHERRY_CLASSIC_GATE = ITEMS.register("cherry_classic_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CLASSIC_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WILDLIFE_GATE = ITEMS.register("cherry_wildlife_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_WILDLIFE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_PLANK_GATE = ITEMS.register("cherry_plank_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_PLANK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRISSCROSS_GATE = ITEMS.register("cherry_crisscross_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRISSCROSS_GATE.get(), new Item.Properties()));

    //END WOODENFENCEGATES AND BEGIN WOODENFENCES

    public static final RegistryObject<Item> SPRUCE_OAK_CLASSIC = ITEMS.register("spruce_oak_classic", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_WILDLIFE = ITEMS.register("spruce_oak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_DECORATION = ITEMS.register("spruce_oak_decoration", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_DECORATION_GATE = ITEMS.register("spruce_oak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_PLANK = ITEMS.register("spruce_oak_plank", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_GARDEN = ITEMS.register("spruce_oak_garden", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_GARDEN_GATE = ITEMS.register("spruce_oak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_BOLLARD = ITEMS.register("spruce_oak_bollard", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_BOLLARD_GATE = ITEMS.register("spruce_oak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_STICK = ITEMS.register("spruce_oak_stick", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_STICK_GATE = ITEMS.register("spruce_oak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_CRISSCROSS = ITEMS.register("spruce_oak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_SPIRE = ITEMS.register("spruce_oak_spire", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_OAK_SPIRE_GATE = ITEMS.register("spruce_oak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_OAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> OAK_SPRUCE_CLASSIC = ITEMS.register("oak_spruce_classic", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_WILDLIFE = ITEMS.register("oak_spruce_wildlife", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_DECORATION = ITEMS.register("oak_spruce_decoration", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_DECORATION_GATE = ITEMS.register("oak_spruce_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_PLANK = ITEMS.register("oak_spruce_plank", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_GARDEN = ITEMS.register("oak_spruce_garden", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_GARDEN_GATE = ITEMS.register("oak_spruce_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_BOLLARD = ITEMS.register("oak_spruce_bollard", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_BOLLARD_GATE = ITEMS.register("oak_spruce_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_STICK = ITEMS.register("oak_spruce_stick", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_STICK_GATE = ITEMS.register("oak_spruce_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_CRISSCROSS = ITEMS.register("oak_spruce_crisscross", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_SPIRE = ITEMS.register("oak_spruce_spire", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_SPRUCE_SPIRE_GATE = ITEMS.register("oak_spruce_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_SPRUCE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> OAK_BIRCH_CLASSIC = ITEMS.register("oak_birch_classic", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_WILDLIFE = ITEMS.register("oak_birch_wildlife", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_DECORATION = ITEMS.register("oak_birch_decoration", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_DECORATION_GATE = ITEMS.register("oak_birch_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_PLANK = ITEMS.register("oak_birch_plank", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_GARDEN = ITEMS.register("oak_birch_garden", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_GARDEN_GATE = ITEMS.register("oak_birch_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_BOLLARD = ITEMS.register("oak_birch_bollard", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_BOLLARD_GATE = ITEMS.register("oak_birch_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_STICK = ITEMS.register("oak_birch_stick", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_STICK_GATE = ITEMS.register("oak_birch_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_CRISSCROSS = ITEMS.register("oak_birch_crisscross", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_SPIRE = ITEMS.register("oak_birch_spire", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BIRCH_SPIRE_GATE = ITEMS.register("oak_birch_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BIRCH_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_OAK_CLASSIC = ITEMS.register("birch_oak_classic", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_WILDLIFE = ITEMS.register("birch_oak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_DECORATION = ITEMS.register("birch_oak_decoration", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_DECORATION_GATE = ITEMS.register("birch_oak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_PLANK = ITEMS.register("birch_oak_plank", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_GARDEN = ITEMS.register("birch_oak_garden", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_GARDEN_GATE = ITEMS.register("birch_oak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_BOLLARD = ITEMS.register("birch_oak_bollard", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_BOLLARD_GATE = ITEMS.register("birch_oak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_STICK = ITEMS.register("birch_oak_stick", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_STICK_GATE = ITEMS.register("birch_oak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_CRISSCROSS = ITEMS.register("birch_oak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_SPIRE = ITEMS.register("birch_oak_spire", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_OAK_SPIRE_GATE = ITEMS.register("birch_oak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_OAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_BIRCH_CLASSIC = ITEMS.register("spruce_birch_classic", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_WILDLIFE = ITEMS.register("spruce_birch_wildlife", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_DECORATION = ITEMS.register("spruce_birch_decoration", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_DECORATION_GATE = ITEMS.register("spruce_birch_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_PLANK = ITEMS.register("spruce_birch_plank", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_GARDEN = ITEMS.register("spruce_birch_garden", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_GARDEN_GATE = ITEMS.register("spruce_birch_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_BOLLARD = ITEMS.register("spruce_birch_bollard", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_BOLLARD_GATE = ITEMS.register("spruce_birch_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_STICK = ITEMS.register("spruce_birch_stick", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_STICK_GATE = ITEMS.register("spruce_birch_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_CRISSCROSS = ITEMS.register("spruce_birch_crisscross", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_SPIRE = ITEMS.register("spruce_birch_spire", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BIRCH_SPIRE_GATE = ITEMS.register("spruce_birch_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BIRCH_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_SPRUCE_CLASSIC = ITEMS.register("birch_spruce_classic", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_WILDLIFE = ITEMS.register("birch_spruce_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_DECORATION = ITEMS.register("birch_spruce_decoration", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_DECORATION_GATE = ITEMS.register("birch_spruce_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_PLANK = ITEMS.register("birch_spruce_plank", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_GARDEN = ITEMS.register("birch_spruce_garden", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_GARDEN_GATE = ITEMS.register("birch_spruce_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_BOLLARD = ITEMS.register("birch_spruce_bollard", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_BOLLARD_GATE = ITEMS.register("birch_spruce_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_STICK = ITEMS.register("birch_spruce_stick", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_STICK_GATE = ITEMS.register("birch_spruce_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_CRISSCROSS = ITEMS.register("birch_spruce_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_SPIRE = ITEMS.register("birch_spruce_spire", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_SPRUCE_SPIRE_GATE = ITEMS.register("birch_spruce_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_SPRUCE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DARKOAK_SPRUCE_CLASSIC = ITEMS.register("darkoak_spruce_classic", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_WILDLIFE = ITEMS.register("darkoak_spruce_wildlife", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_DECORATION = ITEMS.register("darkoak_spruce_decoration", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_DECORATION_GATE = ITEMS.register("darkoak_spruce_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_PLANK = ITEMS.register("darkoak_spruce_plank", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_GARDEN = ITEMS.register("darkoak_spruce_garden", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_GARDEN_GATE = ITEMS.register("darkoak_spruce_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_BOLLARD = ITEMS.register("darkoak_spruce_bollard", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_BOLLARD_GATE = ITEMS.register("darkoak_spruce_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_STICK = ITEMS.register("darkoak_spruce_stick", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_STICK_GATE = ITEMS.register("darkoak_spruce_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_CRISSCROSS = ITEMS.register("darkoak_spruce_crisscross", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_SPIRE = ITEMS.register("darkoak_spruce_spire", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_SPRUCE_SPIRE_GATE = ITEMS.register("darkoak_spruce_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_SPRUCE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_DARKOAK_CLASSIC = ITEMS.register("spruce_darkoak_classic", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_WILDLIFE = ITEMS.register("spruce_darkoak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_DECORATION = ITEMS.register("spruce_darkoak_decoration", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_DECORATION_GATE = ITEMS.register("spruce_darkoak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_PLANK = ITEMS.register("spruce_darkoak_plank", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_GARDEN = ITEMS.register("spruce_darkoak_garden", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_GARDEN_GATE = ITEMS.register("spruce_darkoak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_BOLLARD = ITEMS.register("spruce_darkoak_bollard", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_BOLLARD_GATE = ITEMS.register("spruce_darkoak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_STICK = ITEMS.register("spruce_darkoak_stick", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_STICK_GATE = ITEMS.register("spruce_darkoak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_CRISSCROSS = ITEMS.register("spruce_darkoak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_SPIRE = ITEMS.register("spruce_darkoak_spire", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DARKOAK_SPIRE_GATE = ITEMS.register("spruce_darkoak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_DARKOAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DARKOAK_OAK_CLASSIC = ITEMS.register("darkoak_oak_classic", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_WILDLIFE = ITEMS.register("darkoak_oak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_DECORATION = ITEMS.register("darkoak_oak_decoration", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_DECORATION_GATE = ITEMS.register("darkoak_oak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_PLANK = ITEMS.register("darkoak_oak_plank", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_GARDEN = ITEMS.register("darkoak_oak_garden", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_GARDEN_GATE = ITEMS.register("darkoak_oak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_BOLLARD = ITEMS.register("darkoak_oak_bollard", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_BOLLARD_GATE = ITEMS.register("darkoak_oak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_STICK = ITEMS.register("darkoak_oak_stick", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_STICK_GATE = ITEMS.register("darkoak_oak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_CRISSCROSS = ITEMS.register("darkoak_oak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_SPIRE = ITEMS.register("darkoak_oak_spire", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_OAK_SPIRE_GATE = ITEMS.register("darkoak_oak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_OAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> OAK_DARKOAK_CLASSIC = ITEMS.register("oak_darkoak_classic", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_WILDLIFE = ITEMS.register("oak_darkoak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_DECORATION = ITEMS.register("oak_darkoak_decoration", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_DECORATION_GATE = ITEMS.register("oak_darkoak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_PLANK = ITEMS.register("oak_darkoak_plank", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_GARDEN = ITEMS.register("oak_darkoak_garden", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_GARDEN_GATE = ITEMS.register("oak_darkoak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_BOLLARD = ITEMS.register("oak_darkoak_bollard", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_BOLLARD_GATE = ITEMS.register("oak_darkoak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_STICK = ITEMS.register("oak_darkoak_stick", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_STICK_GATE = ITEMS.register("oak_darkoak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_CRISSCROSS = ITEMS.register("oak_darkoak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_SPIRE = ITEMS.register("oak_darkoak_spire", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DARKOAK_SPIRE_GATE = ITEMS.register("oak_darkoak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_DARKOAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DARKOAK_JUNGLE_CLASSIC = ITEMS.register("darkoak_jungle_classic", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_WILDLIFE = ITEMS.register("darkoak_jungle_wildlife", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_DECORATION = ITEMS.register("darkoak_jungle_decoration", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_DECORATION_GATE = ITEMS.register("darkoak_jungle_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_PLANK = ITEMS.register("darkoak_jungle_plank", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_GARDEN = ITEMS.register("darkoak_jungle_garden", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_GARDEN_GATE = ITEMS.register("darkoak_jungle_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_BOLLARD = ITEMS.register("darkoak_jungle_bollard", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_BOLLARD_GATE = ITEMS.register("darkoak_jungle_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_STICK = ITEMS.register("darkoak_jungle_stick", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_STICK_GATE = ITEMS.register("darkoak_jungle_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_CRISSCROSS = ITEMS.register("darkoak_jungle_crisscross", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_SPIRE = ITEMS.register("darkoak_jungle_spire", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_JUNGLE_SPIRE_GATE = ITEMS.register("darkoak_jungle_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_JUNGLE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_DARKOAK_CLASSIC = ITEMS.register("jungle_darkoak_classic", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_WILDLIFE = ITEMS.register("jungle_darkoak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_DECORATION = ITEMS.register("jungle_darkoak_decoration", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_DECORATION_GATE = ITEMS.register("jungle_darkoak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_PLANK = ITEMS.register("jungle_darkoak_plank", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_GARDEN = ITEMS.register("jungle_darkoak_garden", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_GARDEN_GATE = ITEMS.register("jungle_darkoak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_BOLLARD = ITEMS.register("jungle_darkoak_bollard", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_BOLLARD_GATE = ITEMS.register("jungle_darkoak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_STICK = ITEMS.register("jungle_darkoak_stick", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_STICK_GATE = ITEMS.register("jungle_darkoak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_CRISSCROSS = ITEMS.register("jungle_darkoak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_SPIRE = ITEMS.register("jungle_darkoak_spire", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_DARKOAK_SPIRE_GATE = ITEMS.register("jungle_darkoak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_DARKOAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_JUNGLE_CLASSIC = ITEMS.register("acacia_jungle_classic", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_WILDLIFE = ITEMS.register("acacia_jungle_wildlife", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_DECORATION = ITEMS.register("acacia_jungle_decoration", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_DECORATION_GATE = ITEMS.register("acacia_jungle_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_PLANK = ITEMS.register("acacia_jungle_plank", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_GARDEN = ITEMS.register("acacia_jungle_garden", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_GARDEN_GATE = ITEMS.register("acacia_jungle_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_BOLLARD = ITEMS.register("acacia_jungle_bollard", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_BOLLARD_GATE = ITEMS.register("acacia_jungle_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_STICK = ITEMS.register("acacia_jungle_stick", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_STICK_GATE = ITEMS.register("acacia_jungle_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_CRISSCROSS = ITEMS.register("acacia_jungle_crisscross", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_SPIRE = ITEMS.register("acacia_jungle_spire", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_JUNGLE_SPIRE_GATE = ITEMS.register("acacia_jungle_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_JUNGLE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_ACACIA_CLASSIC = ITEMS.register("jungle_acacia_classic", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_WILDLIFE = ITEMS.register("jungle_acacia_wildlife", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_DECORATION = ITEMS.register("jungle_acacia_decoration", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_DECORATION_GATE = ITEMS.register("jungle_acacia_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_PLANK = ITEMS.register("jungle_acacia_plank", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_GARDEN = ITEMS.register("jungle_acacia_garden", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_GARDEN_GATE = ITEMS.register("jungle_acacia_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_BOLLARD = ITEMS.register("jungle_acacia_bollard", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_BOLLARD_GATE = ITEMS.register("jungle_acacia_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_STICK = ITEMS.register("jungle_acacia_stick", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_STICK_GATE = ITEMS.register("jungle_acacia_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_CRISSCROSS = ITEMS.register("jungle_acacia_crisscross", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_SPIRE = ITEMS.register("jungle_acacia_spire", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_ACACIA_SPIRE_GATE = ITEMS.register("jungle_acacia_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_ACACIA_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_BIRCH_CLASSIC = ITEMS.register("acacia_birch_classic", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_WILDLIFE = ITEMS.register("acacia_birch_wildlife", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_DECORATION = ITEMS.register("acacia_birch_decoration", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_DECORATION_GATE = ITEMS.register("acacia_birch_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_PLANK = ITEMS.register("acacia_birch_plank", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_GARDEN = ITEMS.register("acacia_birch_garden", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_GARDEN_GATE = ITEMS.register("acacia_birch_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_BOLLARD = ITEMS.register("acacia_birch_bollard", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_BOLLARD_GATE = ITEMS.register("acacia_birch_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_STICK = ITEMS.register("acacia_birch_stick", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_STICK_GATE = ITEMS.register("acacia_birch_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_CRISSCROSS = ITEMS.register("acacia_birch_crisscross", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_SPIRE = ITEMS.register("acacia_birch_spire", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BIRCH_SPIRE_GATE = ITEMS.register("acacia_birch_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BIRCH_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_ACACIA_CLASSIC = ITEMS.register("birch_acacia_classic", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_WILDLIFE = ITEMS.register("birch_acacia_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_DECORATION = ITEMS.register("birch_acacia_decoration", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_DECORATION_GATE = ITEMS.register("birch_acacia_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_PLANK = ITEMS.register("birch_acacia_plank", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_GARDEN = ITEMS.register("birch_acacia_garden", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_GARDEN_GATE = ITEMS.register("birch_acacia_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_BOLLARD = ITEMS.register("birch_acacia_bollard", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_BOLLARD_GATE = ITEMS.register("birch_acacia_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_STICK = ITEMS.register("birch_acacia_stick", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_STICK_GATE = ITEMS.register("birch_acacia_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_CRISSCROSS = ITEMS.register("birch_acacia_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_SPIRE = ITEMS.register("birch_acacia_spire", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_ACACIA_SPIRE_GATE = ITEMS.register("birch_acacia_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_ACACIA_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_BIRCH_CLASSIC = ITEMS.register("jungle_birch_classic", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_WILDLIFE = ITEMS.register("jungle_birch_wildlife", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_DECORATION = ITEMS.register("jungle_birch_decoration", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_DECORATION_GATE = ITEMS.register("jungle_birch_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_PLANK = ITEMS.register("jungle_birch_plank", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_GARDEN = ITEMS.register("jungle_birch_garden", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_GARDEN_GATE = ITEMS.register("jungle_birch_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_BOLLARD = ITEMS.register("jungle_birch_bollard", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_BOLLARD_GATE = ITEMS.register("jungle_birch_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_STICK = ITEMS.register("jungle_birch_stick", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_STICK_GATE = ITEMS.register("jungle_birch_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_CRISSCROSS = ITEMS.register("jungle_birch_crisscross", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_SPIRE = ITEMS.register("jungle_birch_spire", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BIRCH_SPIRE_GATE = ITEMS.register("jungle_birch_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BIRCH_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_JUNGLE_CLASSIC = ITEMS.register("birch_jungle_classic", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_WILDLIFE = ITEMS.register("birch_jungle_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_DECORATION = ITEMS.register("birch_jungle_decoration", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_DECORATION_GATE = ITEMS.register("birch_jungle_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_PLANK = ITEMS.register("birch_jungle_plank", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_GARDEN = ITEMS.register("birch_jungle_garden", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_GARDEN_GATE = ITEMS.register("birch_jungle_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_BOLLARD = ITEMS.register("birch_jungle_bollard", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_BOLLARD_GATE = ITEMS.register("birch_jungle_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_STICK = ITEMS.register("birch_jungle_stick", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_STICK_GATE = ITEMS.register("birch_jungle_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_CRISSCROSS = ITEMS.register("birch_jungle_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_SPIRE = ITEMS.register("birch_jungle_spire", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_JUNGLE_SPIRE_GATE = ITEMS.register("birch_jungle_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_JUNGLE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WARPED_BIRCH_CLASSIC = ITEMS.register("warped_birch_classic", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_WILDLIFE = ITEMS.register("warped_birch_wildlife", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_DECORATION = ITEMS.register("warped_birch_decoration", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_DECORATION_GATE = ITEMS.register("warped_birch_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_PLANK = ITEMS.register("warped_birch_plank", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_GARDEN = ITEMS.register("warped_birch_garden", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_GARDEN_GATE = ITEMS.register("warped_birch_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_BOLLARD = ITEMS.register("warped_birch_bollard", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_BOLLARD_GATE = ITEMS.register("warped_birch_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_STICK = ITEMS.register("warped_birch_stick", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_STICK_GATE = ITEMS.register("warped_birch_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_CRISSCROSS = ITEMS.register("warped_birch_crisscross", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_SPIRE = ITEMS.register("warped_birch_spire", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BIRCH_SPIRE_GATE = ITEMS.register("warped_birch_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BIRCH_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_WARPED_CLASSIC = ITEMS.register("birch_warped_classic", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_WILDLIFE = ITEMS.register("birch_warped_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_DECORATION = ITEMS.register("birch_warped_decoration", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_DECORATION_GATE = ITEMS.register("birch_warped_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_PLANK = ITEMS.register("birch_warped_plank", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_GARDEN = ITEMS.register("birch_warped_garden", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_GARDEN_GATE = ITEMS.register("birch_warped_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_BOLLARD = ITEMS.register("birch_warped_bollard", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_BOLLARD_GATE = ITEMS.register("birch_warped_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_STICK = ITEMS.register("birch_warped_stick", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_STICK_GATE = ITEMS.register("birch_warped_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_CRISSCROSS = ITEMS.register("birch_warped_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_SPIRE = ITEMS.register("birch_warped_spire", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WARPED_SPIRE_GATE = ITEMS.register("birch_warped_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_WARPED_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WARPED_OAK_CLASSIC = ITEMS.register("warped_oak_classic", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_WILDLIFE = ITEMS.register("warped_oak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_DECORATION = ITEMS.register("warped_oak_decoration", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_DECORATION_GATE = ITEMS.register("warped_oak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_PLANK = ITEMS.register("warped_oak_plank", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_GARDEN = ITEMS.register("warped_oak_garden", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_GARDEN_GATE = ITEMS.register("warped_oak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_BOLLARD = ITEMS.register("warped_oak_bollard", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_BOLLARD_GATE = ITEMS.register("warped_oak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_STICK = ITEMS.register("warped_oak_stick", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_STICK_GATE = ITEMS.register("warped_oak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_CRISSCROSS = ITEMS.register("warped_oak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_SPIRE = ITEMS.register("warped_oak_spire", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_OAK_SPIRE_GATE = ITEMS.register("warped_oak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_OAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> OAK_WARPED_CLASSIC = ITEMS.register("oak_warped_classic", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_WILDLIFE = ITEMS.register("oak_warped_wildlife", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_DECORATION = ITEMS.register("oak_warped_decoration", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_DECORATION_GATE = ITEMS.register("oak_warped_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_PLANK = ITEMS.register("oak_warped_plank", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_GARDEN = ITEMS.register("oak_warped_garden", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_GARDEN_GATE = ITEMS.register("oak_warped_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_BOLLARD = ITEMS.register("oak_warped_bollard", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_BOLLARD_GATE = ITEMS.register("oak_warped_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_STICK = ITEMS.register("oak_warped_stick", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_STICK_GATE = ITEMS.register("oak_warped_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_CRISSCROSS = ITEMS.register("oak_warped_crisscross", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_SPIRE = ITEMS.register("oak_warped_spire", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WARPED_SPIRE_GATE = ITEMS.register("oak_warped_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_WARPED_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WARPED_SPRUCE_CLASSIC = ITEMS.register("warped_spruce_classic", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_WILDLIFE = ITEMS.register("warped_spruce_wildlife", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_DECORATION = ITEMS.register("warped_spruce_decoration", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_DECORATION_GATE = ITEMS.register("warped_spruce_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_PLANK = ITEMS.register("warped_spruce_plank", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_GARDEN = ITEMS.register("warped_spruce_garden", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_GARDEN_GATE = ITEMS.register("warped_spruce_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_BOLLARD = ITEMS.register("warped_spruce_bollard", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_BOLLARD_GATE = ITEMS.register("warped_spruce_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_STICK = ITEMS.register("warped_spruce_stick", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_STICK_GATE = ITEMS.register("warped_spruce_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_CRISSCROSS = ITEMS.register("warped_spruce_crisscross", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_SPIRE = ITEMS.register("warped_spruce_spire", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_SPRUCE_SPIRE_GATE = ITEMS.register("warped_spruce_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_SPRUCE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_WARPED_CLASSIC = ITEMS.register("spruce_warped_classic", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_WILDLIFE = ITEMS.register("spruce_warped_wildlife", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_DECORATION = ITEMS.register("spruce_warped_decoration", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_DECORATION_GATE = ITEMS.register("spruce_warped_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_PLANK = ITEMS.register("spruce_warped_plank", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_GARDEN = ITEMS.register("spruce_warped_garden", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_GARDEN_GATE = ITEMS.register("spruce_warped_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_BOLLARD = ITEMS.register("spruce_warped_bollard", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_BOLLARD_GATE = ITEMS.register("spruce_warped_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_STICK = ITEMS.register("spruce_warped_stick", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_STICK_GATE = ITEMS.register("spruce_warped_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_CRISSCROSS = ITEMS.register("spruce_warped_crisscross", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_SPIRE = ITEMS.register("spruce_warped_spire", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WARPED_SPIRE_GATE = ITEMS.register("spruce_warped_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_WARPED_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CRIMSON_JUNGLE_CLASSIC = ITEMS.register("crimson_jungle_classic", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_WILDLIFE = ITEMS.register("crimson_jungle_wildlife", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_DECORATION = ITEMS.register("crimson_jungle_decoration", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_DECORATION_GATE = ITEMS.register("crimson_jungle_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_PLANK = ITEMS.register("crimson_jungle_plank", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_GARDEN = ITEMS.register("crimson_jungle_garden", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_GARDEN_GATE = ITEMS.register("crimson_jungle_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_BOLLARD = ITEMS.register("crimson_jungle_bollard", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_BOLLARD_GATE = ITEMS.register("crimson_jungle_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_STICK = ITEMS.register("crimson_jungle_stick", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_STICK_GATE = ITEMS.register("crimson_jungle_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_CRISSCROSS = ITEMS.register("crimson_jungle_crisscross", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_SPIRE = ITEMS.register("crimson_jungle_spire", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_JUNGLE_SPIRE_GATE = ITEMS.register("crimson_jungle_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_JUNGLE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_CRIMSON_CLASSIC = ITEMS.register("jungle_crimson_classic", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_WILDLIFE = ITEMS.register("jungle_crimson_wildlife", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_DECORATION = ITEMS.register("jungle_crimson_decoration", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_DECORATION_GATE = ITEMS.register("jungle_crimson_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_PLANK = ITEMS.register("jungle_crimson_plank", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_GARDEN = ITEMS.register("jungle_crimson_garden", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_GARDEN_GATE = ITEMS.register("jungle_crimson_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_BOLLARD = ITEMS.register("jungle_crimson_bollard", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_BOLLARD_GATE = ITEMS.register("jungle_crimson_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_STICK = ITEMS.register("jungle_crimson_stick", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_STICK_GATE = ITEMS.register("jungle_crimson_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_CRISSCROSS = ITEMS.register("jungle_crimson_crisscross", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_SPIRE = ITEMS.register("jungle_crimson_spire", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CRIMSON_SPIRE_GATE = ITEMS.register("jungle_crimson_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CRIMSON_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CRIMSON_OAK_CLASSIC = ITEMS.register("crimson_oak_classic", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_WILDLIFE = ITEMS.register("crimson_oak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_DECORATION = ITEMS.register("crimson_oak_decoration", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_DECORATION_GATE = ITEMS.register("crimson_oak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_PLANK = ITEMS.register("crimson_oak_plank", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_GARDEN = ITEMS.register("crimson_oak_garden", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_GARDEN_GATE = ITEMS.register("crimson_oak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_BOLLARD = ITEMS.register("crimson_oak_bollard", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_BOLLARD_GATE = ITEMS.register("crimson_oak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_STICK = ITEMS.register("crimson_oak_stick", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_STICK_GATE = ITEMS.register("crimson_oak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_CRISSCROSS = ITEMS.register("crimson_oak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_SPIRE = ITEMS.register("crimson_oak_spire", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_OAK_SPIRE_GATE = ITEMS.register("crimson_oak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_OAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> OAK_CRIMSON_CLASSIC = ITEMS.register("oak_crimson_classic", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_WILDLIFE = ITEMS.register("oak_crimson_wildlife", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_DECORATION = ITEMS.register("oak_crimson_decoration", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_DECORATION_GATE = ITEMS.register("oak_crimson_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_PLANK = ITEMS.register("oak_crimson_plank", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_GARDEN = ITEMS.register("oak_crimson_garden", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_GARDEN_GATE = ITEMS.register("oak_crimson_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_BOLLARD = ITEMS.register("oak_crimson_bollard", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_BOLLARD_GATE = ITEMS.register("oak_crimson_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_STICK = ITEMS.register("oak_crimson_stick", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_STICK_GATE = ITEMS.register("oak_crimson_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_CRISSCROSS = ITEMS.register("oak_crimson_crisscross", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_SPIRE = ITEMS.register("oak_crimson_spire", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CRIMSON_SPIRE_GATE = ITEMS.register("oak_crimson_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_CRIMSON_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CRIMSON_DARKOAK_CLASSIC = ITEMS.register("crimson_darkoak_classic", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_WILDLIFE = ITEMS.register("crimson_darkoak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_DECORATION = ITEMS.register("crimson_darkoak_decoration", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_DECORATION_GATE = ITEMS.register("crimson_darkoak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_PLANK = ITEMS.register("crimson_darkoak_plank", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_GARDEN = ITEMS.register("crimson_darkoak_garden", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_GARDEN_GATE = ITEMS.register("crimson_darkoak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_BOLLARD = ITEMS.register("crimson_darkoak_bollard", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_BOLLARD_GATE = ITEMS.register("crimson_darkoak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_STICK = ITEMS.register("crimson_darkoak_stick", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_STICK_GATE = ITEMS.register("crimson_darkoak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_CRISSCROSS = ITEMS.register("crimson_darkoak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_SPIRE = ITEMS.register("crimson_darkoak_spire", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_DARKOAK_SPIRE_GATE = ITEMS.register("crimson_darkoak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_DARKOAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DARKOAK_CRIMSON_CLASSIC = ITEMS.register("darkoak_crimson_classic", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_WILDLIFE = ITEMS.register("darkoak_crimson_wildlife", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_DECORATION = ITEMS.register("darkoak_crimson_decoration", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_DECORATION_GATE = ITEMS.register("darkoak_crimson_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_PLANK = ITEMS.register("darkoak_crimson_plank", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_GARDEN = ITEMS.register("darkoak_crimson_garden", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_GARDEN_GATE = ITEMS.register("darkoak_crimson_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_BOLLARD = ITEMS.register("darkoak_crimson_bollard", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_BOLLARD_GATE = ITEMS.register("darkoak_crimson_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_STICK = ITEMS.register("darkoak_crimson_stick", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_STICK_GATE = ITEMS.register("darkoak_crimson_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_CRISSCROSS = ITEMS.register("darkoak_crimson_crisscross", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_SPIRE = ITEMS.register("darkoak_crimson_spire", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_CRIMSON_SPIRE_GATE = ITEMS.register("darkoak_crimson_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_CRIMSON_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_OAK_CLASSIC = ITEMS.register("mangrove_oak_classic", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_WILDLIFE = ITEMS.register("mangrove_oak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_DECORATION = ITEMS.register("mangrove_oak_decoration", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_DECORATION_GATE = ITEMS.register("mangrove_oak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_PLANK = ITEMS.register("mangrove_oak_plank", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_GARDEN = ITEMS.register("mangrove_oak_garden", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_GARDEN_GATE = ITEMS.register("mangrove_oak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_BOLLARD = ITEMS.register("mangrove_oak_bollard", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_BOLLARD_GATE = ITEMS.register("mangrove_oak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_STICK = ITEMS.register("mangrove_oak_stick", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_STICK_GATE = ITEMS.register("mangrove_oak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_CRISSCROSS = ITEMS.register("mangrove_oak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_SPIRE = ITEMS.register("mangrove_oak_spire", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_OAK_SPIRE_GATE = ITEMS.register("mangrove_oak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_OAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> OAK_MANGROVE_CLASSIC = ITEMS.register("oak_mangrove_classic", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_WILDLIFE = ITEMS.register("oak_mangrove_wildlife", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_DECORATION = ITEMS.register("oak_mangrove_decoration", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_DECORATION_GATE = ITEMS.register("oak_mangrove_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_PLANK = ITEMS.register("oak_mangrove_plank", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_GARDEN = ITEMS.register("oak_mangrove_garden", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_GARDEN_GATE = ITEMS.register("oak_mangrove_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_BOLLARD = ITEMS.register("oak_mangrove_bollard", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_BOLLARD_GATE = ITEMS.register("oak_mangrove_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_STICK = ITEMS.register("oak_mangrove_stick", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_STICK_GATE = ITEMS.register("oak_mangrove_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_CRISSCROSS = ITEMS.register("oak_mangrove_crisscross", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_SPIRE = ITEMS.register("oak_mangrove_spire", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MANGROVE_SPIRE_GATE = ITEMS.register("oak_mangrove_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_MANGROVE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_BIRCH_CLASSIC = ITEMS.register("mangrove_birch_classic", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_WILDLIFE = ITEMS.register("mangrove_birch_wildlife", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_DECORATION = ITEMS.register("mangrove_birch_decoration", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_DECORATION_GATE = ITEMS.register("mangrove_birch_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_PLANK = ITEMS.register("mangrove_birch_plank", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_GARDEN = ITEMS.register("mangrove_birch_garden", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_GARDEN_GATE = ITEMS.register("mangrove_birch_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_BOLLARD = ITEMS.register("mangrove_birch_bollard", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_BOLLARD_GATE = ITEMS.register("mangrove_birch_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_STICK = ITEMS.register("mangrove_birch_stick", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_STICK_GATE = ITEMS.register("mangrove_birch_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_CRISSCROSS = ITEMS.register("mangrove_birch_crisscross", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_SPIRE = ITEMS.register("mangrove_birch_spire", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BIRCH_SPIRE_GATE = ITEMS.register("mangrove_birch_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_BIRCH_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_MANGROVE_CLASSIC = ITEMS.register("birch_mangrove_classic", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_WILDLIFE = ITEMS.register("birch_mangrove_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_DECORATION = ITEMS.register("birch_mangrove_decoration", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_DECORATION_GATE = ITEMS.register("birch_mangrove_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_PLANK = ITEMS.register("birch_mangrove_plank", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_GARDEN = ITEMS.register("birch_mangrove_garden", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_GARDEN_GATE = ITEMS.register("birch_mangrove_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_BOLLARD = ITEMS.register("birch_mangrove_bollard", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_BOLLARD_GATE = ITEMS.register("birch_mangrove_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_STICK = ITEMS.register("birch_mangrove_stick", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_STICK_GATE = ITEMS.register("birch_mangrove_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_CRISSCROSS = ITEMS.register("birch_mangrove_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_SPIRE = ITEMS.register("birch_mangrove_spire", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MANGROVE_SPIRE_GATE = ITEMS.register("birch_mangrove_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BIRCH_MANGROVE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_JUNGLE_CLASSIC = ITEMS.register("mangrove_jungle_classic", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_WILDLIFE = ITEMS.register("mangrove_jungle_wildlife", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_DECORATION = ITEMS.register("mangrove_jungle_decoration", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_DECORATION_GATE = ITEMS.register("mangrove_jungle_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_PLANK = ITEMS.register("mangrove_jungle_plank", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_GARDEN = ITEMS.register("mangrove_jungle_garden", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_GARDEN_GATE = ITEMS.register("mangrove_jungle_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_BOLLARD = ITEMS.register("mangrove_jungle_bollard", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_BOLLARD_GATE = ITEMS.register("mangrove_jungle_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_STICK = ITEMS.register("mangrove_jungle_stick", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_STICK_GATE = ITEMS.register("mangrove_jungle_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_CRISSCROSS = ITEMS.register("mangrove_jungle_crisscross", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_SPIRE = ITEMS.register("mangrove_jungle_spire", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_JUNGLE_SPIRE_GATE = ITEMS.register("mangrove_jungle_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_JUNGLE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_MANGROVE_CLASSIC = ITEMS.register("jungle_mangrove_classic", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_WILDLIFE = ITEMS.register("jungle_mangrove_wildlife", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_DECORATION = ITEMS.register("jungle_mangrove_decoration", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_DECORATION_GATE = ITEMS.register("jungle_mangrove_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_PLANK = ITEMS.register("jungle_mangrove_plank", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_GARDEN = ITEMS.register("jungle_mangrove_garden", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_GARDEN_GATE = ITEMS.register("jungle_mangrove_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_BOLLARD = ITEMS.register("jungle_mangrove_bollard", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_BOLLARD_GATE = ITEMS.register("jungle_mangrove_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_STICK = ITEMS.register("jungle_mangrove_stick", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_STICK_GATE = ITEMS.register("jungle_mangrove_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_CRISSCROSS = ITEMS.register("jungle_mangrove_crisscross", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_SPIRE = ITEMS.register("jungle_mangrove_spire", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_MANGROVE_SPIRE_GATE = ITEMS.register("jungle_mangrove_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_MANGROVE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_DARKOAK_CLASSIC = ITEMS.register("mangrove_darkoak_classic", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_WILDLIFE = ITEMS.register("mangrove_darkoak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_DECORATION = ITEMS.register("mangrove_darkoak_decoration", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_DECORATION_GATE = ITEMS.register("mangrove_darkoak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_PLANK = ITEMS.register("mangrove_darkoak_plank", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_GARDEN = ITEMS.register("mangrove_darkoak_garden", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_GARDEN_GATE = ITEMS.register("mangrove_darkoak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_BOLLARD = ITEMS.register("mangrove_darkoak_bollard", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_BOLLARD_GATE = ITEMS.register("mangrove_darkoak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_STICK = ITEMS.register("mangrove_darkoak_stick", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_STICK_GATE = ITEMS.register("mangrove_darkoak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_CRISSCROSS = ITEMS.register("mangrove_darkoak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_SPIRE = ITEMS.register("mangrove_darkoak_spire", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DARKOAK_SPIRE_GATE = ITEMS.register("mangrove_darkoak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_DARKOAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DARKOAK_MANGROVE_CLASSIC = ITEMS.register("darkoak_mangrove_classic", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_WILDLIFE = ITEMS.register("darkoak_mangrove_wildlife", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_DECORATION = ITEMS.register("darkoak_mangrove_decoration", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_DECORATION_GATE = ITEMS.register("darkoak_mangrove_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_PLANK = ITEMS.register("darkoak_mangrove_plank", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_GARDEN = ITEMS.register("darkoak_mangrove_garden", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_GARDEN_GATE = ITEMS.register("darkoak_mangrove_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_BOLLARD = ITEMS.register("darkoak_mangrove_bollard", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_BOLLARD_GATE = ITEMS.register("darkoak_mangrove_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_STICK = ITEMS.register("darkoak_mangrove_stick", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_STICK_GATE = ITEMS.register("darkoak_mangrove_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_CRISSCROSS = ITEMS.register("darkoak_mangrove_crisscross", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_SPIRE = ITEMS.register("darkoak_mangrove_spire", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_MANGROVE_SPIRE_GATE = ITEMS.register("darkoak_mangrove_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.DARKOAK_MANGROVE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_WARPED_CLASSIC = ITEMS.register("mangrove_warped_classic", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_WILDLIFE = ITEMS.register("mangrove_warped_wildlife", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_DECORATION = ITEMS.register("mangrove_warped_decoration", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_DECORATION_GATE = ITEMS.register("mangrove_warped_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_PLANK = ITEMS.register("mangrove_warped_plank", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_GARDEN = ITEMS.register("mangrove_warped_garden", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_GARDEN_GATE = ITEMS.register("mangrove_warped_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_BOLLARD = ITEMS.register("mangrove_warped_bollard", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_BOLLARD_GATE = ITEMS.register("mangrove_warped_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_STICK = ITEMS.register("mangrove_warped_stick", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_STICK_GATE = ITEMS.register("mangrove_warped_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_CRISSCROSS = ITEMS.register("mangrove_warped_crisscross", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_SPIRE = ITEMS.register("mangrove_warped_spire", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WARPED_SPIRE_GATE = ITEMS.register("mangrove_warped_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_WARPED_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WARPED_MANGROVE_CLASSIC = ITEMS.register("warped_mangrove_classic", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_WILDLIFE = ITEMS.register("warped_mangrove_wildlife", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_DECORATION = ITEMS.register("warped_mangrove_decoration", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_DECORATION_GATE = ITEMS.register("warped_mangrove_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_PLANK = ITEMS.register("warped_mangrove_plank", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_GARDEN = ITEMS.register("warped_mangrove_garden", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_GARDEN_GATE = ITEMS.register("warped_mangrove_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_BOLLARD = ITEMS.register("warped_mangrove_bollard", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_BOLLARD_GATE = ITEMS.register("warped_mangrove_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_STICK = ITEMS.register("warped_mangrove_stick", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_STICK_GATE = ITEMS.register("warped_mangrove_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_CRISSCROSS = ITEMS.register("warped_mangrove_crisscross", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_SPIRE = ITEMS.register("warped_mangrove_spire", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_MANGROVE_SPIRE_GATE = ITEMS.register("warped_mangrove_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_MANGROVE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAMBOO_OAK_CLASSIC = ITEMS.register("bamboo_oak_classic", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_WILDLIFE = ITEMS.register("bamboo_oak_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_DECORATION = ITEMS.register("bamboo_oak_decoration", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_DECORATION_GATE = ITEMS.register("bamboo_oak_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_PLANK = ITEMS.register("bamboo_oak_plank", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_GARDEN = ITEMS.register("bamboo_oak_garden", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_GARDEN_GATE = ITEMS.register("bamboo_oak_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_BOLLARD = ITEMS.register("bamboo_oak_bollard", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_BOLLARD_GATE = ITEMS.register("bamboo_oak_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_STICK = ITEMS.register("bamboo_oak_stick", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_STICK_GATE = ITEMS.register("bamboo_oak_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_CRISSCROSS = ITEMS.register("bamboo_oak_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_SPIRE = ITEMS.register("bamboo_oak_spire", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_OAK_SPIRE_GATE = ITEMS.register("bamboo_oak_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_OAK_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> OAK_BAMBOO_CLASSIC = ITEMS.register("oak_bamboo_classic", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_WILDLIFE = ITEMS.register("oak_bamboo_wildlife", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_DECORATION = ITEMS.register("oak_bamboo_decoration", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_DECORATION_GATE = ITEMS.register("oak_bamboo_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_PLANK = ITEMS.register("oak_bamboo_plank", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_GARDEN = ITEMS.register("oak_bamboo_garden", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_GARDEN_GATE = ITEMS.register("oak_bamboo_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_BOLLARD = ITEMS.register("oak_bamboo_bollard", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_BOLLARD_GATE = ITEMS.register("oak_bamboo_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_STICK = ITEMS.register("oak_bamboo_stick", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_STICK_GATE = ITEMS.register("oak_bamboo_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_CRISSCROSS = ITEMS.register("oak_bamboo_crisscross", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_SPIRE = ITEMS.register("oak_bamboo_spire", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BAMBOO_SPIRE_GATE = ITEMS.register("oak_bamboo_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.OAK_BAMBOO_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAMBOO_SPRUCE_CLASSIC = ITEMS.register("bamboo_spruce_classic", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_WILDLIFE = ITEMS.register("bamboo_spruce_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_DECORATION = ITEMS.register("bamboo_spruce_decoration", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_DECORATION_GATE = ITEMS.register("bamboo_spruce_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_PLANK = ITEMS.register("bamboo_spruce_plank", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_GARDEN = ITEMS.register("bamboo_spruce_garden", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_GARDEN_GATE = ITEMS.register("bamboo_spruce_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_BOLLARD = ITEMS.register("bamboo_spruce_bollard", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_BOLLARD_GATE = ITEMS.register("bamboo_spruce_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_STICK = ITEMS.register("bamboo_spruce_stick", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_STICK_GATE = ITEMS.register("bamboo_spruce_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_CRISSCROSS = ITEMS.register("bamboo_spruce_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_SPIRE = ITEMS.register("bamboo_spruce_spire", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_SPRUCE_SPIRE_GATE = ITEMS.register("bamboo_spruce_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_SPRUCE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_BAMBOO_CLASSIC = ITEMS.register("spruce_bamboo_classic", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_WILDLIFE = ITEMS.register("spruce_bamboo_wildlife", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_DECORATION = ITEMS.register("spruce_bamboo_decoration", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_DECORATION_GATE = ITEMS.register("spruce_bamboo_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_PLANK = ITEMS.register("spruce_bamboo_plank", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_GARDEN = ITEMS.register("spruce_bamboo_garden", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_GARDEN_GATE = ITEMS.register("spruce_bamboo_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_BOLLARD = ITEMS.register("spruce_bamboo_bollard", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_BOLLARD_GATE = ITEMS.register("spruce_bamboo_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_STICK = ITEMS.register("spruce_bamboo_stick", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_STICK_GATE = ITEMS.register("spruce_bamboo_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_CRISSCROSS = ITEMS.register("spruce_bamboo_crisscross", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_SPIRE = ITEMS.register("spruce_bamboo_spire", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BAMBOO_SPIRE_GATE = ITEMS.register("spruce_bamboo_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.SPRUCE_BAMBOO_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAMBOO_JUNGLE_CLASSIC = ITEMS.register("bamboo_jungle_classic", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_WILDLIFE = ITEMS.register("bamboo_jungle_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_DECORATION = ITEMS.register("bamboo_jungle_decoration", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_DECORATION_GATE = ITEMS.register("bamboo_jungle_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_PLANK = ITEMS.register("bamboo_jungle_plank", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_GARDEN = ITEMS.register("bamboo_jungle_garden", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_GARDEN_GATE = ITEMS.register("bamboo_jungle_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_BOLLARD = ITEMS.register("bamboo_jungle_bollard", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_BOLLARD_GATE = ITEMS.register("bamboo_jungle_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_STICK = ITEMS.register("bamboo_jungle_stick", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_STICK_GATE = ITEMS.register("bamboo_jungle_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_CRISSCROSS = ITEMS.register("bamboo_jungle_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_SPIRE = ITEMS.register("bamboo_jungle_spire", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_JUNGLE_SPIRE_GATE = ITEMS.register("bamboo_jungle_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_JUNGLE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_BAMBOO_CLASSIC = ITEMS.register("jungle_bamboo_classic", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_WILDLIFE = ITEMS.register("jungle_bamboo_wildlife", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_DECORATION = ITEMS.register("jungle_bamboo_decoration", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_DECORATION_GATE = ITEMS.register("jungle_bamboo_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_PLANK = ITEMS.register("jungle_bamboo_plank", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_GARDEN = ITEMS.register("jungle_bamboo_garden", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_GARDEN_GATE = ITEMS.register("jungle_bamboo_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_BOLLARD = ITEMS.register("jungle_bamboo_bollard", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_BOLLARD_GATE = ITEMS.register("jungle_bamboo_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_STICK = ITEMS.register("jungle_bamboo_stick", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_STICK_GATE = ITEMS.register("jungle_bamboo_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_CRISSCROSS = ITEMS.register("jungle_bamboo_crisscross", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_SPIRE = ITEMS.register("jungle_bamboo_spire", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BAMBOO_SPIRE_GATE = ITEMS.register("jungle_bamboo_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_BAMBOO_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAMBOO_ACACIA_CLASSIC = ITEMS.register("bamboo_acacia_classic", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_WILDLIFE = ITEMS.register("bamboo_acacia_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_DECORATION = ITEMS.register("bamboo_acacia_decoration", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_DECORATION_GATE = ITEMS.register("bamboo_acacia_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_PLANK = ITEMS.register("bamboo_acacia_plank", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_GARDEN = ITEMS.register("bamboo_acacia_garden", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_GARDEN_GATE = ITEMS.register("bamboo_acacia_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_BOLLARD = ITEMS.register("bamboo_acacia_bollard", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_BOLLARD_GATE = ITEMS.register("bamboo_acacia_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_STICK = ITEMS.register("bamboo_acacia_stick", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_STICK_GATE = ITEMS.register("bamboo_acacia_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_CRISSCROSS = ITEMS.register("bamboo_acacia_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_SPIRE = ITEMS.register("bamboo_acacia_spire", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_ACACIA_SPIRE_GATE = ITEMS.register("bamboo_acacia_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_ACACIA_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_BAMBOO_CLASSIC = ITEMS.register("acacia_bamboo_classic", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_WILDLIFE = ITEMS.register("acacia_bamboo_wildlife", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_DECORATION = ITEMS.register("acacia_bamboo_decoration", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_DECORATION_GATE = ITEMS.register("acacia_bamboo_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_PLANK = ITEMS.register("acacia_bamboo_plank", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_GARDEN = ITEMS.register("acacia_bamboo_garden", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_GARDEN_GATE = ITEMS.register("acacia_bamboo_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_BOLLARD = ITEMS.register("acacia_bamboo_bollard", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_BOLLARD_GATE = ITEMS.register("acacia_bamboo_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_STICK = ITEMS.register("acacia_bamboo_stick", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_STICK_GATE = ITEMS.register("acacia_bamboo_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_CRISSCROSS = ITEMS.register("acacia_bamboo_crisscross", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_SPIRE = ITEMS.register("acacia_bamboo_spire", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BAMBOO_SPIRE_GATE = ITEMS.register("acacia_bamboo_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_BAMBOO_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAMBOO_WARPED_CLASSIC = ITEMS.register("bamboo_warped_classic", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_WILDLIFE = ITEMS.register("bamboo_warped_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_DECORATION = ITEMS.register("bamboo_warped_decoration", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_DECORATION_GATE = ITEMS.register("bamboo_warped_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_PLANK = ITEMS.register("bamboo_warped_plank", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_GARDEN = ITEMS.register("bamboo_warped_garden", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_GARDEN_GATE = ITEMS.register("bamboo_warped_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_BOLLARD = ITEMS.register("bamboo_warped_bollard", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_BOLLARD_GATE = ITEMS.register("bamboo_warped_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_STICK = ITEMS.register("bamboo_warped_stick", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_STICK_GATE = ITEMS.register("bamboo_warped_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_CRISSCROSS = ITEMS.register("bamboo_warped_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_SPIRE = ITEMS.register("bamboo_warped_spire", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WARPED_SPIRE_GATE = ITEMS.register("bamboo_warped_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_WARPED_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WARPED_BAMBOO_CLASSIC = ITEMS.register("warped_bamboo_classic", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_WILDLIFE = ITEMS.register("warped_bamboo_wildlife", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_DECORATION = ITEMS.register("warped_bamboo_decoration", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_DECORATION_GATE = ITEMS.register("warped_bamboo_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_PLANK = ITEMS.register("warped_bamboo_plank", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_GARDEN = ITEMS.register("warped_bamboo_garden", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_GARDEN_GATE = ITEMS.register("warped_bamboo_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_BOLLARD = ITEMS.register("warped_bamboo_bollard", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_BOLLARD_GATE = ITEMS.register("warped_bamboo_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_STICK = ITEMS.register("warped_bamboo_stick", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_STICK_GATE = ITEMS.register("warped_bamboo_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_CRISSCROSS = ITEMS.register("warped_bamboo_crisscross", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_SPIRE = ITEMS.register("warped_bamboo_spire", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BAMBOO_SPIRE_GATE = ITEMS.register("warped_bamboo_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.WARPED_BAMBOO_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHERRY_JUNGLE_CLASSIC = ITEMS.register("cherry_jungle_classic", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_WILDLIFE = ITEMS.register("cherry_jungle_wildlife", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_DECORATION = ITEMS.register("cherry_jungle_decoration", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_DECORATION_GATE = ITEMS.register("cherry_jungle_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_PLANK = ITEMS.register("cherry_jungle_plank", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_GARDEN = ITEMS.register("cherry_jungle_garden", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_GARDEN_GATE = ITEMS.register("cherry_jungle_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_BOLLARD = ITEMS.register("cherry_jungle_bollard", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_BOLLARD_GATE = ITEMS.register("cherry_jungle_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_STICK = ITEMS.register("cherry_jungle_stick", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_STICK_GATE = ITEMS.register("cherry_jungle_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_CRISSCROSS = ITEMS.register("cherry_jungle_crisscross", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_SPIRE = ITEMS.register("cherry_jungle_spire", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_JUNGLE_SPIRE_GATE = ITEMS.register("cherry_jungle_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_JUNGLE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_CHERRY_CLASSIC = ITEMS.register("jungle_cherry_classic", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_WILDLIFE = ITEMS.register("jungle_cherry_wildlife", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_DECORATION = ITEMS.register("jungle_cherry_decoration", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_DECORATION_GATE = ITEMS.register("jungle_cherry_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_PLANK = ITEMS.register("jungle_cherry_plank", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_GARDEN = ITEMS.register("jungle_cherry_garden", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_GARDEN_GATE = ITEMS.register("jungle_cherry_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_BOLLARD = ITEMS.register("jungle_cherry_bollard", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_BOLLARD_GATE = ITEMS.register("jungle_cherry_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_STICK = ITEMS.register("jungle_cherry_stick", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_STICK_GATE = ITEMS.register("jungle_cherry_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_CRISSCROSS = ITEMS.register("jungle_cherry_crisscross", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_SPIRE = ITEMS.register("jungle_cherry_spire", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_CHERRY_SPIRE_GATE = ITEMS.register("jungle_cherry_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.JUNGLE_CHERRY_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHERRY_ACACIA_CLASSIC = ITEMS.register("cherry_acacia_classic", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_WILDLIFE = ITEMS.register("cherry_acacia_wildlife", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_DECORATION = ITEMS.register("cherry_acacia_decoration", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_DECORATION_GATE = ITEMS.register("cherry_acacia_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_PLANK = ITEMS.register("cherry_acacia_plank", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_GARDEN = ITEMS.register("cherry_acacia_garden", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_GARDEN_GATE = ITEMS.register("cherry_acacia_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_BOLLARD = ITEMS.register("cherry_acacia_bollard", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_BOLLARD_GATE = ITEMS.register("cherry_acacia_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_STICK = ITEMS.register("cherry_acacia_stick", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_STICK_GATE = ITEMS.register("cherry_acacia_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_CRISSCROSS = ITEMS.register("cherry_acacia_crisscross", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_SPIRE = ITEMS.register("cherry_acacia_spire", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_ACACIA_SPIRE_GATE = ITEMS.register("cherry_acacia_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_ACACIA_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_CHERRY_CLASSIC = ITEMS.register("acacia_cherry_classic", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_WILDLIFE = ITEMS.register("acacia_cherry_wildlife", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_DECORATION = ITEMS.register("acacia_cherry_decoration", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_DECORATION_GATE = ITEMS.register("acacia_cherry_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_PLANK = ITEMS.register("acacia_cherry_plank", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_GARDEN = ITEMS.register("acacia_cherry_garden", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_GARDEN_GATE = ITEMS.register("acacia_cherry_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_BOLLARD = ITEMS.register("acacia_cherry_bollard", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_BOLLARD_GATE = ITEMS.register("acacia_cherry_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_STICK = ITEMS.register("acacia_cherry_stick", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_STICK_GATE = ITEMS.register("acacia_cherry_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_CRISSCROSS = ITEMS.register("acacia_cherry_crisscross", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_SPIRE = ITEMS.register("acacia_cherry_spire", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHERRY_SPIRE_GATE = ITEMS.register("acacia_cherry_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.ACACIA_CHERRY_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHERRY_MANGROVE_CLASSIC = ITEMS.register("cherry_mangrove_classic", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_WILDLIFE = ITEMS.register("cherry_mangrove_wildlife", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_DECORATION = ITEMS.register("cherry_mangrove_decoration", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_DECORATION_GATE = ITEMS.register("cherry_mangrove_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_PLANK = ITEMS.register("cherry_mangrove_plank", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_GARDEN = ITEMS.register("cherry_mangrove_garden", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_GARDEN_GATE = ITEMS.register("cherry_mangrove_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_BOLLARD = ITEMS.register("cherry_mangrove_bollard", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_BOLLARD_GATE = ITEMS.register("cherry_mangrove_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_STICK = ITEMS.register("cherry_mangrove_stick", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_STICK_GATE = ITEMS.register("cherry_mangrove_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_CRISSCROSS = ITEMS.register("cherry_mangrove_crisscross", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_SPIRE = ITEMS.register("cherry_mangrove_spire", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_MANGROVE_SPIRE_GATE = ITEMS.register("cherry_mangrove_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_MANGROVE_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_CHERRY_CLASSIC = ITEMS.register("mangrove_cherry_classic", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_WILDLIFE = ITEMS.register("mangrove_cherry_wildlife", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_DECORATION = ITEMS.register("mangrove_cherry_decoration", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_DECORATION_GATE = ITEMS.register("mangrove_cherry_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_PLANK = ITEMS.register("mangrove_cherry_plank", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_GARDEN = ITEMS.register("mangrove_cherry_garden", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_GARDEN_GATE = ITEMS.register("mangrove_cherry_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_BOLLARD = ITEMS.register("mangrove_cherry_bollard", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_BOLLARD_GATE = ITEMS.register("mangrove_cherry_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_STICK = ITEMS.register("mangrove_cherry_stick", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_STICK_GATE = ITEMS.register("mangrove_cherry_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_CRISSCROSS = ITEMS.register("mangrove_cherry_crisscross", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_SPIRE = ITEMS.register("mangrove_cherry_spire", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHERRY_SPIRE_GATE = ITEMS.register("mangrove_cherry_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.MANGROVE_CHERRY_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHERRY_BAMBOO_CLASSIC = ITEMS.register("cherry_bamboo_classic", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_WILDLIFE = ITEMS.register("cherry_bamboo_wildlife", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_DECORATION = ITEMS.register("cherry_bamboo_decoration", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_DECORATION_GATE = ITEMS.register("cherry_bamboo_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_PLANK = ITEMS.register("cherry_bamboo_plank", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_GARDEN = ITEMS.register("cherry_bamboo_garden", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_GARDEN_GATE = ITEMS.register("cherry_bamboo_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_BOLLARD = ITEMS.register("cherry_bamboo_bollard", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_BOLLARD_GATE = ITEMS.register("cherry_bamboo_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_STICK = ITEMS.register("cherry_bamboo_stick", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_STICK_GATE = ITEMS.register("cherry_bamboo_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_CRISSCROSS = ITEMS.register("cherry_bamboo_crisscross", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_SPIRE = ITEMS.register("cherry_bamboo_spire", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_BAMBOO_SPIRE_GATE = ITEMS.register("cherry_bamboo_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_BAMBOO_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAMBOO_CHERRY_CLASSIC = ITEMS.register("bamboo_cherry_classic", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_WILDLIFE = ITEMS.register("bamboo_cherry_wildlife", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_DECORATION = ITEMS.register("bamboo_cherry_decoration", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_DECORATION_GATE = ITEMS.register("bamboo_cherry_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_PLANK = ITEMS.register("bamboo_cherry_plank", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_GARDEN = ITEMS.register("bamboo_cherry_garden", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_GARDEN_GATE = ITEMS.register("bamboo_cherry_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_BOLLARD = ITEMS.register("bamboo_cherry_bollard", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_BOLLARD_GATE = ITEMS.register("bamboo_cherry_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_STICK = ITEMS.register("bamboo_cherry_stick", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_STICK_GATE = ITEMS.register("bamboo_cherry_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_CRISSCROSS = ITEMS.register("bamboo_cherry_crisscross", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_SPIRE = ITEMS.register("bamboo_cherry_spire", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_CHERRY_SPIRE_GATE = ITEMS.register("bamboo_cherry_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.BAMBOO_CHERRY_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHERRY_CRIMSON_CLASSIC = ITEMS.register("cherry_crimson_classic", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_WILDLIFE = ITEMS.register("cherry_crimson_wildlife", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_DECORATION = ITEMS.register("cherry_crimson_decoration", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_DECORATION_GATE = ITEMS.register("cherry_crimson_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_PLANK = ITEMS.register("cherry_crimson_plank", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_GARDEN = ITEMS.register("cherry_crimson_garden", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_GARDEN_GATE = ITEMS.register("cherry_crimson_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_BOLLARD = ITEMS.register("cherry_crimson_bollard", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_BOLLARD_GATE = ITEMS.register("cherry_crimson_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_STICK = ITEMS.register("cherry_crimson_stick", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_STICK_GATE = ITEMS.register("cherry_crimson_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_CRISSCROSS = ITEMS.register("cherry_crimson_crisscross", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_SPIRE = ITEMS.register("cherry_crimson_spire", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_CRIMSON_SPIRE_GATE = ITEMS.register("cherry_crimson_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CHERRY_CRIMSON_SPIRE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> CRIMSON_CHERRY_CLASSIC = ITEMS.register("crimson_cherry_classic", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_CLASSIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_WILDLIFE = ITEMS.register("crimson_cherry_wildlife", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_WILDLIFE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_DECORATION = ITEMS.register("crimson_cherry_decoration", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_DECORATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_DECORATION_GATE = ITEMS.register("crimson_cherry_decoration_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_DECORATION_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_PLANK = ITEMS.register("crimson_cherry_plank", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_PLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_GARDEN = ITEMS.register("crimson_cherry_garden", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_GARDEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_GARDEN_GATE = ITEMS.register("crimson_cherry_garden_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_GARDEN_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_BOLLARD = ITEMS.register("crimson_cherry_bollard", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_BOLLARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_BOLLARD_GATE = ITEMS.register("crimson_cherry_bollard_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_BOLLARD_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_STICK = ITEMS.register("crimson_cherry_stick", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_STICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_STICK_GATE = ITEMS.register("crimson_cherry_stick_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_STICK_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_CRISSCROSS = ITEMS.register("crimson_cherry_crisscross", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_CRISSCROSS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_SPIRE = ITEMS.register("crimson_cherry_spire", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_SPIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_CHERRY_SPIRE_GATE = ITEMS.register("crimson_cherry_spire_fence_gate", () -> new BlockItem(ModBlocksWoodenFence.CRIMSON_CHERRY_SPIRE_GATE.get(), new Item.Properties()));

    //END WOODENFENCES AND BEGIN STONEWALLS

    public static final RegistryObject<Item> COBBLESTONE_MODERN = ITEMS.register("cobblestone_modern", () -> new BlockItem(ModBlocksWall.COBBLESTONE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_BUILDING = ITEMS.register("cobblestone_building", () -> new BlockItem(ModBlocksWall.COBBLESTONE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_CASTLE = ITEMS.register("cobblestone_castle", () -> new BlockItem(ModBlocksWall.COBBLESTONE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MOSSY_COBBLESTONE_MODERN = ITEMS.register("mossy_cobblestone_modern", () -> new BlockItem(ModBlocksWall.MOSSY_COBBLESTONE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_BUILDING = ITEMS.register("mossy_cobblestone_building", () -> new BlockItem(ModBlocksWall.MOSSY_COBBLESTONE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_COBBLESTONE_CASTLE = ITEMS.register("mossy_cobblestone_castle", () -> new BlockItem(ModBlocksWall.MOSSY_COBBLESTONE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> STONE_MODERN = ITEMS.register("stone_modern", () -> new BlockItem(ModBlocksWall.STONE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> STONE_BUILDING = ITEMS.register("stone_building", () -> new BlockItem(ModBlocksWall.STONE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> STONE_CASTLE = ITEMS.register("stone_castle", () -> new BlockItem(ModBlocksWall.STONE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> STONE_BRICKS_MODERN = ITEMS.register("stone_bricks_modern", () -> new BlockItem(ModBlocksWall.STONE_BRICKS_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> STONE_BRICKS_BUILDING = ITEMS.register("stone_bricks_building", () -> new BlockItem(ModBlocksWall.STONE_BRICKS_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> STONE_BRICKS_CASTLE = ITEMS.register("stone_bricks_castle", () -> new BlockItem(ModBlocksWall.STONE_BRICKS_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> MOSSY_STONE_BRICKS_MODERN = ITEMS.register("mossy_stone_bricks_modern", () -> new BlockItem(ModBlocksWall.MOSSY_STONE_BRICKS_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_STONE_BRICKS_BUILDING = ITEMS.register("mossy_stone_bricks_building", () -> new BlockItem(ModBlocksWall.MOSSY_STONE_BRICKS_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_STONE_BRICKS_CASTLE = ITEMS.register("mossy_stone_bricks_castle", () -> new BlockItem(ModBlocksWall.MOSSY_STONE_BRICKS_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> ANDESITE_MODERN = ITEMS.register("andesite_modern", () -> new BlockItem(ModBlocksWall.ANDESITE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_BUILDING = ITEMS.register("andesite_building", () -> new BlockItem(ModBlocksWall.ANDESITE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> ANDESITE_CASTLE = ITEMS.register("andesite_castle", () -> new BlockItem(ModBlocksWall.ANDESITE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DIORITE_MODERN = ITEMS.register("diorite_modern", () -> new BlockItem(ModBlocksWall.DIORITE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIORITE_BUILDING = ITEMS.register("diorite_building", () -> new BlockItem(ModBlocksWall.DIORITE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIORITE_CASTLE = ITEMS.register("diorite_castle", () -> new BlockItem(ModBlocksWall.DIORITE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> GRANITE_MODERN = ITEMS.register("granite_modern", () -> new BlockItem(ModBlocksWall.GRANITE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRANITE_BUILDING = ITEMS.register("granite_building", () -> new BlockItem(ModBlocksWall.GRANITE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRANITE_CASTLE = ITEMS.register("granite_castle", () -> new BlockItem(ModBlocksWall.GRANITE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> SANDSTONE_MODERN = ITEMS.register("sandstone_modern", () -> new BlockItem(ModBlocksWall.SANDSTONE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDSTONE_BUILDING = ITEMS.register("sandstone_building", () -> new BlockItem(ModBlocksWall.SANDSTONE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDSTONE_CASTLE = ITEMS.register("sandstone_castle", () -> new BlockItem(ModBlocksWall.SANDSTONE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> RED_SANDSTONE_MODERN = ITEMS.register("red_sandstone_modern", () -> new BlockItem(ModBlocksWall.RED_SANDSTONE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_BUILDING = ITEMS.register("red_sandstone_building", () -> new BlockItem(ModBlocksWall.RED_SANDSTONE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_CASTLE = ITEMS.register("red_sandstone_castle", () -> new BlockItem(ModBlocksWall.RED_SANDSTONE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BRICKS_MODERN = ITEMS.register("bricks_modern", () -> new BlockItem(ModBlocksWall.BRICKS_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRICKS_BUILDING = ITEMS.register("bricks_building", () -> new BlockItem(ModBlocksWall.BRICKS_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRICKS_CASTLE = ITEMS.register("bricks_castle", () -> new BlockItem(ModBlocksWall.BRICKS_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> PRISMARINE_MODERN = ITEMS.register("prismarine_modern", () -> new BlockItem(ModBlocksWall.PRISMARINE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_BUILDING = ITEMS.register("prismarine_building", () -> new BlockItem(ModBlocksWall.PRISMARINE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_CASTLE = ITEMS.register("prismarine_castle", () -> new BlockItem(ModBlocksWall.PRISMARINE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> NETHER_BRICKS_MODERN = ITEMS.register("nether_bricks_modern", () -> new BlockItem(ModBlocksWall.NETHER_BRICKS_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> NETHER_BRICKS_BUILDING = ITEMS.register("nether_bricks_building", () -> new BlockItem(ModBlocksWall.NETHER_BRICKS_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> NETHER_BRICKS_CASTLE = ITEMS.register("nether_bricks_castle", () -> new BlockItem(ModBlocksWall.NETHER_BRICKS_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> RED_NETHER_BRICKS_MODERN = ITEMS.register("red_nether_bricks_modern", () -> new BlockItem(ModBlocksWall.RED_NETHER_BRICKS_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_BUILDING = ITEMS.register("red_nether_bricks_building", () -> new BlockItem(ModBlocksWall.RED_NETHER_BRICKS_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_CASTLE = ITEMS.register("red_nether_bricks_castle", () -> new BlockItem(ModBlocksWall.RED_NETHER_BRICKS_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> END_STONE_BRICKS_MODERN = ITEMS.register("end_stone_bricks_modern", () -> new BlockItem(ModBlocksWall.END_STONE_BRICKS_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_BRICKS_BUILDING = ITEMS.register("end_stone_bricks_building", () -> new BlockItem(ModBlocksWall.END_STONE_BRICKS_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_BRICKS_CASTLE = ITEMS.register("end_stone_bricks_castle", () -> new BlockItem(ModBlocksWall.END_STONE_BRICKS_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTONE_MODERN = ITEMS.register("blackstone_modern", () -> new BlockItem(ModBlocksWall.BLACKSTONE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKSTONE_BUILDING = ITEMS.register("blackstone_building", () -> new BlockItem(ModBlocksWall.BLACKSTONE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKSTONE_CASTLE = ITEMS.register("blackstone_castle", () -> new BlockItem(ModBlocksWall.BLACKSTONE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> POLISHED_BLACKSTONE_MODERN = ITEMS.register("polished_blackstone_modern", () -> new BlockItem(ModBlocksWall.POLISHED_BLACKSTONE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_BUILDING = ITEMS.register("polished_blackstone_building", () -> new BlockItem(ModBlocksWall.POLISHED_BLACKSTONE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_CASTLE = ITEMS.register("polished_blackstone_castle", () -> new BlockItem(ModBlocksWall.POLISHED_BLACKSTONE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICKS_MODERN = ITEMS.register("polished_blackstone_bricks_modern", () -> new BlockItem(ModBlocksWall.POLISHED_BLACKSTONE_BRICKS_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICKS_BUILDING = ITEMS.register("polished_blackstone_bricks_building", () -> new BlockItem(ModBlocksWall.POLISHED_BLACKSTONE_BRICKS_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BLACKSTONE_BRICKS_CASTLE = ITEMS.register("polished_blackstone_bricks_castle", () -> new BlockItem(ModBlocksWall.POLISHED_BLACKSTONE_BRICKS_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> COBBLED_DEEPSLATE_MODERN = ITEMS.register("cobbled_deepslate_modern", () -> new BlockItem(ModBlocksWall.COBBLED_DEEPSLATE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_BUILDING = ITEMS.register("cobbled_deepslate_building", () -> new BlockItem(ModBlocksWall.COBBLED_DEEPSLATE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_CASTLE = ITEMS.register("cobbled_deepslate_castle", () -> new BlockItem(ModBlocksWall.COBBLED_DEEPSLATE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> POLISHED_DEEPSLATE_MODERN = ITEMS.register("polished_deepslate_modern", () -> new BlockItem(ModBlocksWall.POLISHED_DEEPSLATE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_DEEPSLATE_BUILDING = ITEMS.register("polished_deepslate_building", () -> new BlockItem(ModBlocksWall.POLISHED_DEEPSLATE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_DEEPSLATE_CASTLE = ITEMS.register("polished_deepslate_castle", () -> new BlockItem(ModBlocksWall.POLISHED_DEEPSLATE_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DEEPSLATE_BRICK_MODERN = ITEMS.register("deepslate_brick_modern", () -> new BlockItem(ModBlocksWall.DEEPSLATE_BRICK_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_BRICK_BUILDING = ITEMS.register("deepslate_brick_building", () -> new BlockItem(ModBlocksWall.DEEPSLATE_BRICK_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_BRICK_CASTLE = ITEMS.register("deepslate_brick_castle", () -> new BlockItem(ModBlocksWall.DEEPSLATE_BRICK_CASTLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> DEEPSLATE_TILE_MODERN = ITEMS.register("deepslate_tile_modern", () -> new BlockItem(ModBlocksWall.DEEPSLATE_TILE_MODERN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_TILE_BUILDING = ITEMS.register("deepslate_tile_building", () -> new BlockItem(ModBlocksWall.DEEPSLATE_TILE_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_TILE_CASTLE = ITEMS.register("deepslate_tile_castle", () -> new BlockItem(ModBlocksWall.DEEPSLATE_TILE_CASTLE.get(), new Item.Properties()));

    
    //END STONEWALLS AND BEGIN WOODENWALLS

    public static final RegistryObject<Item> OAK_WALL_BUILDING = ITEMS.register("oak_wall_building", () -> new BlockItem(ModBlocksWall.OAK_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WALL_BUILDING = ITEMS.register("birch_wall_building", () -> new BlockItem(ModBlocksWall.BIRCH_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WALL_BUILDING = ITEMS.register("spruce_wall_building", () -> new BlockItem(ModBlocksWall.SPRUCE_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WALL_BUILDING = ITEMS.register("acacia_wall_building", () -> new BlockItem(ModBlocksWall.ACACIA_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WALL_BUILDING = ITEMS.register("jungle_wall_building", () -> new BlockItem(ModBlocksWall.JUNGLE_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARKOAK_WALL_BUILDING = ITEMS.register("darkoak_wall_building", () -> new BlockItem(ModBlocksWall.DARKOAK_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WALL_BUILDING = ITEMS.register("crimson_wall_building", () -> new BlockItem(ModBlocksWall.CRIMSON_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WALL_BUILDING = ITEMS.register("warped_wall_building", () -> new BlockItem(ModBlocksWall.WARPED_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WALL_BUILDING = ITEMS.register("mangrove_wall_building", () -> new BlockItem(ModBlocksWall.MANGROVE_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WALL_BUILDING = ITEMS.register("bamboo_wall_building", () -> new BlockItem(ModBlocksWall.BAMBOO_WALL_BUILDING.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WALL_BUILDING = ITEMS.register("cherry_wall_building", () -> new BlockItem(ModBlocksWall.CHERRY_WALL_BUILDING.get(), new Item.Properties()));
    
    //END WOODENWALLS AND BEGIN METALLFENCES

    public static final RegistryObject<Item> COBBLESTONE_COPPER_FENCE = ITEMS.register("cobblestone_copper_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_COPPER_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_EXPOSED_COPPER_FENCE = ITEMS.register("cobblestone_exposed_copper_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_EXPOSED_COPPER_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_WEATHERED_COPPER_FENCE = ITEMS.register("cobblestone_weathered_copper_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WEATHERED_COPPER_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_OXIDIZED_COPPER_FENCE = ITEMS.register("cobblestone_oxidized_copper_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_COPPER_FENCE.get(), new Item.Properties()));

    public static final RegistryObject<Item> COPPER_FENCE_GATE = ITEMS.register("copper_fence_gate", () -> new BlockItem(ModBlocksMetalFence.COPPER_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_COPPER_FENCE_GATE = ITEMS.register("exposed_copper_fence_gate", () -> new BlockItem(ModBlocksMetalFence.EXPOSED_COPPER_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_COPPER_FENCE_GATE = ITEMS.register("weathered_copper_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WEATHERED_COPPER_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_COPPER_FENCE_GATE = ITEMS.register("oxidized_copper_fence_gate", () -> new BlockItem(ModBlocksMetalFence.OXIDIZED_COPPER_FENCE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> COBBLESTONE_WAXED_COPPER_FENCE = ITEMS.register("cobblestone_waxed_copper_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WAXED_COPPER_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_WAXED_EXPOSED_COPPER_FENCE = ITEMS.register("cobblestone_waxed_exposed_copper_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_COPPER_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_WAXED_WEATHERED_COPPER_FENCE = ITEMS.register("cobblestone_waxed_weathered_copper_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_COPPER_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_WAXED_OXIDIZED_COPPER_FENCE = ITEMS.register("cobblestone_waxed_oxidized_copper_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_COPPER_FENCE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WAXED_COPPER_FENCE_GATE = ITEMS.register("waxed_copper_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WAXED_COPPER_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_EXPOSED_COPPER_FENCE_GATE = ITEMS.register("waxed_exposed_copper_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WAXED_EXPOSED_COPPER_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_WEATHERED_COPPER_FENCE_GATE = ITEMS.register("waxed_weathered_copper_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WAXED_WEATHERED_COPPER_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_OXIDIZED_COPPER_FENCE_GATE = ITEMS.register("waxed_oxidized_copper_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WAXED_OXIDIZED_COPPER_FENCE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> COBBLESTONE_IRON_FENCE = ITEMS.register("cobblestone_iron_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_IRON_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_EXPOSED_IRON_FENCE = ITEMS.register("cobblestone_exposed_iron_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_EXPOSED_IRON_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_WEATHERED_IRON_FENCE = ITEMS.register("cobblestone_weathered_iron_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WEATHERED_IRON_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_OXIDIZED_IRON_FENCE = ITEMS.register("cobblestone_oxidized_iron_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_OXIDIZED_IRON_FENCE.get(), new Item.Properties()));

    public static final RegistryObject<Item> IRON_FENCE_GATE = ITEMS.register("iron_fence_gate", () -> new BlockItem(ModBlocksMetalFence.IRON_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EXPOSED_IRON_FENCE_GATE = ITEMS.register("exposed_iron_fence_gate", () -> new BlockItem(ModBlocksMetalFence.EXPOSED_IRON_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEATHERED_IRON_FENCE_GATE = ITEMS.register("weathered_iron_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WEATHERED_IRON_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OXIDIZED_IRON_FENCE_GATE = ITEMS.register("oxidized_iron_fence_gate", () -> new BlockItem(ModBlocksMetalFence.OXIDIZED_IRON_FENCE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> COBBLESTONE_WAXED_IRON_FENCE = ITEMS.register("cobblestone_waxed_iron_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WAXED_IRON_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_WAXED_EXPOSED_IRON_FENCE = ITEMS.register("cobblestone_waxed_exposed_iron_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WAXED_EXPOSED_IRON_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_WAXED_WEATHERED_IRON_FENCE = ITEMS.register("cobblestone_waxed_weathered_iron_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WAXED_WEATHERED_IRON_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBBLESTONE_WAXED_OXIDIZED_IRON_FENCE = ITEMS.register("cobblestone_waxed_oxidized_iron_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_WAXED_OXIDIZED_IRON_FENCE.get(), new Item.Properties()));

    public static final RegistryObject<Item> WAXED_IRON_FENCE_GATE = ITEMS.register("waxed_iron_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WAXED_IRON_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_EXPOSED_IRON_FENCE_GATE = ITEMS.register("waxed_exposed_iron_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WAXED_EXPOSED_IRON_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_WEATHERED_IRON_FENCE_GATE = ITEMS.register("waxed_weathered_iron_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WAXED_WEATHERED_IRON_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WAXED_OXIDIZED_IRON_FENCE_GATE = ITEMS.register("waxed_oxidized_iron_fence_gate", () -> new BlockItem(ModBlocksMetalFence.WAXED_OXIDIZED_IRON_FENCE_GATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> COBBLESTONE_GOLD_FENCE = ITEMS.register("cobblestone_gold_fence", () -> new BlockItem(ModBlocksMetalFence.COBBLESTONE_GOLD_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_FENCE_GATE = ITEMS.register("gold_fence_gate", () -> new BlockItem(ModBlocksMetalFence.GOLD_FENCE_GATE.get(), new Item.Properties()));
    
    //END METALLFENCES

}
