package com.raptor.customfence.init;

import com.raptor.customfence.Main;
import com.raptor.customfence.blocks.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Supplier;


public class ModBlocksWall {

    public static final DeferredRegister.Blocks WALL_BLOCKS = DeferredRegister.createBlocks(Main.MOD_ID);
    
    //BEGIN STONEWALLS

    public static final DeferredBlock<Block> COBBLESTONE_MODERN = registerBlock("cobblestone_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cobblestone_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> COBBLESTONE_BUILDING = registerBlock("cobblestone_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cobblestone_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> COBBLESTONE_CASTLE = registerBlock("cobblestone_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cobblestone_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MOSSY_COBBLESTONE_MODERN = registerBlock("mossy_cobblestone_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mossy_cobblestone_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> MOSSY_COBBLESTONE_BUILDING = registerBlock("mossy_cobblestone_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mossy_cobblestone_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> MOSSY_COBBLESTONE_CASTLE = registerBlock("mossy_cobblestone_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mossy_cobblestone_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> STONE_MODERN = registerBlock("stone_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "stone_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> STONE_BUILDING = registerBlock("stone_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "stone_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> STONE_CASTLE = registerBlock("stone_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "stone_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> STONE_BRICKS_MODERN = registerBlock("stone_bricks_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "stone_bricks_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> STONE_BRICKS_BUILDING = registerBlock("stone_bricks_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "stone_bricks_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> STONE_BRICKS_CASTLE = registerBlock("stone_bricks_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "stone_bricks_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> MOSSY_STONE_BRICKS_MODERN = registerBlock("mossy_stone_bricks_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mossy_stone_bricks_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> MOSSY_STONE_BRICKS_BUILDING = registerBlock("mossy_stone_bricks_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mossy_stone_bricks_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> MOSSY_STONE_BRICKS_CASTLE = registerBlock("mossy_stone_bricks_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mossy_stone_bricks_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> ANDESITE_MODERN = registerBlock("andesite_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "andesite_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_BUILDING = registerBlock("andesite_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "andesite_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_CASTLE = registerBlock("andesite_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "andesite_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> DIORITE_MODERN = registerBlock("diorite_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "diorite_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_BUILDING = registerBlock("diorite_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "diorite_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_CASTLE = registerBlock("diorite_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "diorite_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> GRANITE_MODERN = registerBlock("granite_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "granite_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_BUILDING = registerBlock("granite_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "granite_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_CASTLE = registerBlock("granite_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "granite_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> SANDSTONE_MODERN = registerBlock("sandstone_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "sandstone_modern"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SANDSTONE_BUILDING = registerBlock("sandstone_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "sandstone_building"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> SANDSTONE_CASTLE = registerBlock("sandstone_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "sandstone_castle"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> RED_SANDSTONE_MODERN = registerBlock("red_sandstone_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "red_sandstone_modern"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RED_SANDSTONE_BUILDING = registerBlock("red_sandstone_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "red_sandstone_building"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RED_SANDSTONE_CASTLE = registerBlock("red_sandstone_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "red_sandstone_castle"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> BRICKS_MODERN = registerBlock("bricks_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bricks_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BRICKS_BUILDING = registerBlock("bricks_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bricks_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BRICKS_CASTLE = registerBlock("bricks_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bricks_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> PRISMARINE_MODERN = registerBlock("prismarine_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "prismarine_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> PRISMARINE_BUILDING = registerBlock("prismarine_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "prismarine_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> PRISMARINE_CASTLE = registerBlock("prismarine_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "prismarine_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> NETHER_BRICKS_MODERN = registerBlock("nether_bricks_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "nether_bricks_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> NETHER_BRICKS_BUILDING = registerBlock("nether_bricks_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "nether_bricks_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> NETHER_BRICKS_CASTLE = registerBlock("nether_bricks_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "nether_bricks_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> RED_NETHER_BRICKS_MODERN = registerBlock("red_nether_bricks_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "red_nether_bricks_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RED_NETHER_BRICKS_BUILDING = registerBlock("red_nether_bricks_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "red_nether_bricks_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RED_NETHER_BRICKS_CASTLE = registerBlock("red_nether_bricks_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "red_nether_bricks_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> END_STONE_BRICKS_MODERN = registerBlock("end_stone_bricks_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "end_stone_bricks_modern"))).strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> END_STONE_BRICKS_BUILDING = registerBlock("end_stone_bricks_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "end_stone_bricks_building"))).strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> END_STONE_BRICKS_CASTLE = registerBlock("end_stone_bricks_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "end_stone_bricks_castle"))).strength(3.0f, 9.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> BLACKSTONE_MODERN = registerBlock("blackstone_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "blackstone_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_BUILDING = registerBlock("blackstone_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "blackstone_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_CASTLE = registerBlock("blackstone_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "blackstone_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_MODERN = registerBlock("polished_blackstone_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "polished_blackstone_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BUILDING = registerBlock("polished_blackstone_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "polished_blackstone_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_CASTLE = registerBlock("polished_blackstone_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "polished_blackstone_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICKS_MODERN = registerBlock("polished_blackstone_bricks_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "polished_blackstone_bricks_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICKS_BUILDING = registerBlock("polished_blackstone_bricks_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "polished_blackstone_bricks_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICKS_CASTLE = registerBlock("polished_blackstone_bricks_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "polished_blackstone_bricks_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final DeferredBlock<Block> COBBLED_DEEPSLATE_MODERN = registerBlock("cobbled_deepslate_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cobbled_deepslate_modern"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> COBBLED_DEEPSLATE_BUILDING = registerBlock("cobbled_deepslate_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cobbled_deepslate_building"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> COBBLED_DEEPSLATE_CASTLE = registerBlock("cobbled_deepslate_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cobbled_deepslate_castle"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_MODERN = registerBlock("polished_deepslate_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "polished_deepslate_modern"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_BUILDING = registerBlock("polished_deepslate_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "polished_deepslate_building"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_CASTLE = registerBlock("polished_deepslate_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "polished_deepslate_castle"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> DEEPSLATE_BRICK_MODERN = registerBlock("deepslate_brick_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "deepslate_brick_modern"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> DEEPSLATE_BRICK_BUILDING = registerBlock("deepslate_brick_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "deepslate_brick_building"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> DEEPSLATE_BRICK_CASTLE = registerBlock("deepslate_brick_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "deepslate_brick_castle"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final DeferredBlock<Block> DEEPSLATE_TILE_MODERN = registerBlock("deepslate_tile_modern", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "deepslate_tile_modern"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> DEEPSLATE_TILE_BUILDING = registerBlock("deepslate_tile_building", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "deepslate_tile_building"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final DeferredBlock<Block> DEEPSLATE_TILE_CASTLE = registerBlock("deepslate_tile_castle", () -> new Wall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "deepslate_tile_castle"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));

    
    //END STONEWALLS AND BEGIN WOODENWALLS

    public static final DeferredBlock<Block> OAK_WALL_BUILDING = registerBlock("oak_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "oak_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_WALL_BUILDING = registerBlock("birch_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "birch_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_WALL_BUILDING = registerBlock("spruce_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "spruce_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_WALL_BUILDING = registerBlock("acacia_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "acacia_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_WALL_BUILDING = registerBlock("jungle_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "jungle_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARKOAK_WALL_BUILDING = registerBlock("darkoak_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "darkoak_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_WALL_BUILDING = registerBlock("crimson_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "crimson_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_WALL_BUILDING = registerBlock("warped_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "warped_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_WALL_BUILDING = registerBlock("mangrove_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mangrove_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_WALL_BUILDING = registerBlock("bamboo_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bamboo_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_WALL_BUILDING = registerBlock("cherry_wall_building", () -> new WoodWall(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cherry_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    
    //END WOODENWALLS


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = WALL_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void register(IEventBus eventBus) {
        WALL_BLOCKS.register(eventBus);
    }

}
