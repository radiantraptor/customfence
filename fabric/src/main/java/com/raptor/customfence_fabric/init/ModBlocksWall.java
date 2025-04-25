package com.raptor.customfence_fabric.init;

import com.raptor.customfence_fabric.Main;
import com.raptor.customfence_fabric.blocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocksWall {

    public static final Block  COBBLESTONE_MODERN = registerBlock("cobblestone_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "cobblestone_modern"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  COBBLESTONE_BUILDING = registerBlock("cobblestone_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "cobblestone_building"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  COBBLESTONE_CASTLE = registerBlock("cobblestone_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "cobblestone_castle"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  MOSSY_COBBLESTONE_MODERN = registerBlock("mossy_cobblestone_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "mossy_cobblestone_modern"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  MOSSY_COBBLESTONE_BUILDING = registerBlock("mossy_cobblestone_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "mossy_cobblestone_building"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  MOSSY_COBBLESTONE_CASTLE = registerBlock("mossy_cobblestone_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "mossy_cobblestone_castle"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  STONE_MODERN = registerBlock("stone_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "stone_modern"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  STONE_BUILDING = registerBlock("stone_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "stone_building"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  STONE_CASTLE = registerBlock("stone_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "stone_castle"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  STONE_BRICKS_MODERN = registerBlock("stone_bricks_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "stone_bricks_modern"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  STONE_BRICKS_BUILDING = registerBlock("stone_bricks_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "stone_bricks_building"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  STONE_BRICKS_CASTLE = registerBlock("stone_bricks_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "stone_bricks_castle"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  MOSSY_STONE_BRICKS_MODERN = registerBlock("mossy_stone_bricks_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "mossy_stone_bricks_modern"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  MOSSY_STONE_BRICKS_BUILDING = registerBlock("mossy_stone_bricks_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "mossy_stone_bricks_building"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  MOSSY_STONE_BRICKS_CASTLE = registerBlock("mossy_stone_bricks_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "mossy_stone_bricks_castle"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  ANDESITE_MODERN = registerBlock("andesite_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "andesite_modern"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  ANDESITE_BUILDING = registerBlock("andesite_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "andesite_building"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  ANDESITE_CASTLE = registerBlock("andesite_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "andesite_castle"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  DIORITE_MODERN = registerBlock("diorite_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "diorite_modern"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  DIORITE_BUILDING = registerBlock("diorite_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "diorite_building"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  DIORITE_CASTLE = registerBlock("diorite_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "diorite_castle"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  GRANITE_MODERN = registerBlock("granite_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "granite_modern"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  GRANITE_BUILDING = registerBlock("granite_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "granite_building"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  GRANITE_CASTLE = registerBlock("granite_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "granite_castle"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  SANDSTONE_MODERN = registerBlock("sandstone_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "sandstone_modern"))).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block  SANDSTONE_BUILDING = registerBlock("sandstone_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "sandstone_building"))).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block  SANDSTONE_CASTLE = registerBlock("sandstone_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "sandstone_castle"))).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block  RED_SANDSTONE_MODERN = registerBlock("red_sandstone_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "red_sandstone_modern"))).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block  RED_SANDSTONE_BUILDING = registerBlock("red_sandstone_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "red_sandstone_building"))).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE)));
    public static final Block  RED_SANDSTONE_CASTLE = registerBlock("red_sandstone_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "red_sandstone_castle"))).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block  BRICKS_MODERN = registerBlock("bricks_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "bricks_modern"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  BRICKS_BUILDING = registerBlock("bricks_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "bricks_building"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  BRICKS_CASTLE = registerBlock("bricks_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "bricks_castle"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  PRISMARINE_MODERN = registerBlock("prismarine_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "prismarine_modern"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  PRISMARINE_BUILDING = registerBlock("prismarine_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "prismarine_building"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  PRISMARINE_CASTLE = registerBlock("prismarine_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "prismarine_castle"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  NETHER_BRICKS_MODERN = registerBlock("nether_bricks_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "nether_bricks_modern"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block  NETHER_BRICKS_BUILDING = registerBlock("nether_bricks_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "nether_bricks_building"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block  NETHER_BRICKS_CASTLE = registerBlock("nether_bricks_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "nether_bricks_castle"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block  RED_NETHER_BRICKS_MODERN = registerBlock("red_nether_bricks_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "red_nether_bricks_modern"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block  RED_NETHER_BRICKS_BUILDING = registerBlock("red_nether_bricks_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "red_nether_bricks_building"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block  RED_NETHER_BRICKS_CASTLE = registerBlock("red_nether_bricks_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "red_nether_bricks_castle"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block  END_STONE_BRICKS_MODERN = registerBlock("end_stone_bricks_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "end_stone_bricks_modern"))).requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  END_STONE_BRICKS_BUILDING = registerBlock("end_stone_bricks_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "end_stone_bricks_building"))).requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  END_STONE_BRICKS_CASTLE = registerBlock("end_stone_bricks_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "end_stone_bricks_castle"))).requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  BLACKSTONE_MODERN = registerBlock("blackstone_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "blackstone_modern"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  BLACKSTONE_BUILDING = registerBlock("blackstone_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "blackstone_building"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  BLACKSTONE_CASTLE = registerBlock("blackstone_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "blackstone_castle"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  POLISHED_BLACKSTONE_MODERN = registerBlock("polished_blackstone_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "polished_blackstone_modern"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  POLISHED_BLACKSTONE_BUILDING = registerBlock("polished_blackstone_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "polished_blackstone_building"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  POLISHED_BLACKSTONE_CASTLE = registerBlock("polished_blackstone_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "polished_blackstone_castle"))).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  POLISHED_BLACKSTONE_BRICKS_MODERN = registerBlock("polished_blackstone_bricks_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "polished_blackstone_bricks_modern"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  POLISHED_BLACKSTONE_BRICKS_BUILDING = registerBlock("polished_blackstone_bricks_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "polished_blackstone_bricks_building"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));
    public static final Block  POLISHED_BLACKSTONE_BRICKS_CASTLE = registerBlock("polished_blackstone_bricks_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "polished_blackstone_bricks_castle"))).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block  COBBLED_DEEPSLATE_MODERN = registerBlock("cobbled_deepslate_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "cobbled_deepslate_modern"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block  COBBLED_DEEPSLATE_BUILDING = registerBlock("cobbled_deepslate_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "cobbled_deepslate_building"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block  COBBLED_DEEPSLATE_CASTLE = registerBlock("cobbled_deepslate_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "cobbled_deepslate_castle"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block  POLISHED_DEEPSLATE_MODERN = registerBlock("polished_deepslate_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "polished_deepslate_modern"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block  POLISHED_DEEPSLATE_BUILDING = registerBlock("polished_deepslate_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "polished_deepslate_building"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block  POLISHED_DEEPSLATE_CASTLE = registerBlock("polished_deepslate_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "polished_deepslate_castle"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block  DEEPSLATE_BRICK_MODERN = registerBlock("deepslate_brick_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "deepslate_brick_modern"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block  DEEPSLATE_BRICK_BUILDING = registerBlock("deepslate_brick_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "deepslate_brick_building"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block  DEEPSLATE_BRICK_CASTLE = registerBlock("deepslate_brick_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "deepslate_brick_castle"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block  DEEPSLATE_TILE_MODERN = registerBlock("deepslate_tile_modern", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "deepslate_tile_modern"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block  DEEPSLATE_TILE_BUILDING = registerBlock("deepslate_tile_building", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "deepslate_tile_building"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
    public static final Block  DEEPSLATE_TILE_CASTLE = registerBlock("deepslate_tile_castle", new Wall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "deepslate_tile_castle"))).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES)));


    public static final Block  OAK_WALL_BUILDING = registerBlock("oak_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "oak_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  BIRCH_WALL_BUILDING = registerBlock("birch_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "birch_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  SPRUCE_WALL_BUILDING = registerBlock("spruce_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "spruce_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  ACACIA_WALL_BUILDING = registerBlock("acacia_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "acacia_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  JUNGLE_WALL_BUILDING = registerBlock("jungle_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "jungle_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  DARKOAK_WALL_BUILDING = registerBlock("darkoak_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "darkoak_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  CRIMSON_WALL_BUILDING = registerBlock("crimson_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "crimson_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  WARPED_WALL_BUILDING = registerBlock("warped_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "warped_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  MANGROVE_WALL_BUILDING = registerBlock("mangrove_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "mangrove_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  BAMBOO_WALL_BUILDING = registerBlock("bamboo_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "bamboo_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  CHERRY_WALL_BUILDING = registerBlock("cherry_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "cherry_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));
    public static final Block  PALE_OAK_WALL_BUILDING = registerBlock("pale_oak_wall_building", new WoodWall(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, "pale_oak_wall_building"))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));


    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Main.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Main.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Main.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocksWall.COBBLESTONE_MODERN);
        });
    }

}
