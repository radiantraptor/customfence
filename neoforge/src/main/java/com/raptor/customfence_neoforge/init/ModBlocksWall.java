package com.raptor.customfence_neoforge.init;

import com.raptor.customfence_neoforge.Main;
import com.raptor.customfence_neoforge.blocks.*;
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
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocksWall {

    public static final DeferredRegister.Blocks WALL_BLOCKS = DeferredRegister.createBlocks(Main.MOD_ID);

    public static final DeferredBlock<Block> COBBLESTONE_MODERN = registerBlock("cobblestone_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> COBBLESTONE_BUILDING = registerBlock("cobblestone_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> COBBLESTONE_CASTLE = registerBlock("cobblestone_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> MOSSY_COBBLESTONE_MODERN = registerBlock("mossy_cobblestone_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> MOSSY_COBBLESTONE_BUILDING = registerBlock("mossy_cobblestone_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> MOSSY_COBBLESTONE_CASTLE = registerBlock("mossy_cobblestone_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> STONE_MODERN = registerBlock("stone_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> STONE_BUILDING = registerBlock("stone_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> STONE_CASTLE = registerBlock("stone_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> STONE_BRICKS_MODERN = registerBlock("stone_bricks_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> STONE_BRICKS_BUILDING = registerBlock("stone_bricks_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> STONE_BRICKS_CASTLE = registerBlock("stone_bricks_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> MOSSY_STONE_BRICKS_MODERN = registerBlock("mossy_stone_bricks_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> MOSSY_STONE_BRICKS_BUILDING = registerBlock("mossy_stone_bricks_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> MOSSY_STONE_BRICKS_CASTLE = registerBlock("mossy_stone_bricks_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> ANDESITE_MODERN = registerBlock("andesite_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> ANDESITE_BUILDING = registerBlock("andesite_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> ANDESITE_CASTLE = registerBlock("andesite_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> POLISHED_ANDESITE_MODERN = registerBlock("polished_andesite_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_ANDESITE_BUILDING = registerBlock("polished_andesite_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_ANDESITE_CASTLE = registerBlock("polished_andesite_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> DIORITE_MODERN = registerBlock("diorite_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DIORITE_BUILDING = registerBlock("diorite_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> DIORITE_CASTLE = registerBlock("diorite_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> POLISHED_DIORITE_MODERN = registerBlock("polished_diorite_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_DIORITE_BUILDING = registerBlock("polished_diorite_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_DIORITE_CASTLE = registerBlock("polished_diorite_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> GRANITE_MODERN = registerBlock("granite_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> GRANITE_BUILDING = registerBlock("granite_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> GRANITE_CASTLE = registerBlock("granite_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> POLISHED_GRANITE_MODERN = registerBlock("polished_granite_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_GRANITE_BUILDING = registerBlock("polished_granite_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_GRANITE_CASTLE = registerBlock("polished_granite_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> SANDSTONE_MODERN = registerBlock("sandstone_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> SANDSTONE_BUILDING = registerBlock("sandstone_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> SANDSTONE_CASTLE = registerBlock("sandstone_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> RED_SANDSTONE_MODERN = registerBlock("red_sandstone_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> RED_SANDSTONE_BUILDING = registerBlock("red_sandstone_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> RED_SANDSTONE_CASTLE = registerBlock("red_sandstone_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.8F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> BRICKS_MODERN = registerBlock("bricks_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> BRICKS_BUILDING = registerBlock("bricks_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> BRICKS_CASTLE = registerBlock("bricks_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> PRISMARINE_MODERN = registerBlock("prismarine_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> PRISMARINE_BUILDING = registerBlock("prismarine_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> PRISMARINE_CASTLE = registerBlock("prismarine_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> NETHER_BRICKS_MODERN = registerBlock("nether_bricks_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.NETHER_BRICKS));
    public static final DeferredBlock<Block> NETHER_BRICKS_BUILDING = registerBlock("nether_bricks_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.NETHER_BRICKS));
    public static final DeferredBlock<Block> NETHER_BRICKS_CASTLE = registerBlock("nether_bricks_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.NETHER_BRICKS));

    public static final DeferredBlock<Block> RED_NETHER_BRICKS_MODERN = registerBlock("red_nether_bricks_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.NETHER_BRICKS));
    public static final DeferredBlock<Block> RED_NETHER_BRICKS_BUILDING = registerBlock("red_nether_bricks_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.NETHER_BRICKS));
    public static final DeferredBlock<Block> RED_NETHER_BRICKS_CASTLE = registerBlock("red_nether_bricks_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.NETHER_BRICKS));

    public static final DeferredBlock<Block> END_STONE_BRICKS_MODERN = registerBlock("end_stone_bricks_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F,9.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> END_STONE_BRICKS_BUILDING = registerBlock("end_stone_bricks_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F,9.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> END_STONE_BRICKS_CASTLE = registerBlock("end_stone_bricks_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F,9.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> BLACKSTONE_MODERN = registerBlock("blackstone_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> BLACKSTONE_BUILDING = registerBlock("blackstone_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> BLACKSTONE_CASTLE = registerBlock("blackstone_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_MODERN = registerBlock("polished_blackstone_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BUILDING = registerBlock("polished_blackstone_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_CASTLE = registerBlock("polished_blackstone_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICKS_MODERN = registerBlock("polished_blackstone_bricks_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICKS_BUILDING = registerBlock("polished_blackstone_bricks_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));
    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_BRICKS_CASTLE = registerBlock("polished_blackstone_bricks_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F,6.0F).sound(SoundType.STONE));

    public static final DeferredBlock<Block> COBBLED_DEEPSLATE_MODERN = registerBlock("cobbled_deepslate_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> COBBLED_DEEPSLATE_BUILDING = registerBlock("cobbled_deepslate_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.DEEPSLATE));
    public static final DeferredBlock<Block> COBBLED_DEEPSLATE_CASTLE = registerBlock("cobbled_deepslate_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.DEEPSLATE));

    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_MODERN = registerBlock("polished_deepslate_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.POLISHED_DEEPSLATE));
    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_BUILDING = registerBlock("polished_deepslate_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.POLISHED_DEEPSLATE));
    public static final DeferredBlock<Block> POLISHED_DEEPSLATE_CASTLE = registerBlock("polished_deepslate_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.POLISHED_DEEPSLATE));

    public static final DeferredBlock<Block> DEEPSLATE_BRICK_MODERN = registerBlock("deepslate_brick_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.DEEPSLATE_BRICKS));
    public static final DeferredBlock<Block> DEEPSLATE_BRICK_BUILDING = registerBlock("deepslate_brick_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.DEEPSLATE_BRICKS));
    public static final DeferredBlock<Block> DEEPSLATE_BRICK_CASTLE = registerBlock("deepslate_brick_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.DEEPSLATE_BRICKS));

    public static final DeferredBlock<Block> DEEPSLATE_TILE_MODERN = registerBlock("deepslate_tile_modern", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.DEEPSLATE_TILES));
    public static final DeferredBlock<Block> DEEPSLATE_TILE_BUILDING = registerBlock("deepslate_tile_building", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.DEEPSLATE_TILES));
    public static final DeferredBlock<Block> DEEPSLATE_TILE_CASTLE = registerBlock("deepslate_tile_castle", Wall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F,6.0F).sound(SoundType.DEEPSLATE_TILES));


    public static final DeferredBlock<Block> OAK_WALL_BUILDING = registerBlock("oak_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());
    public static final DeferredBlock<Block> BIRCH_WALL_BUILDING = registerBlock("birch_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());
    public static final DeferredBlock<Block> SPRUCE_WALL_BUILDING = registerBlock("spruce_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());
    public static final DeferredBlock<Block> ACACIA_WALL_BUILDING = registerBlock("acacia_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());
    public static final DeferredBlock<Block> JUNGLE_WALL_BUILDING = registerBlock("jungle_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());
    public static final DeferredBlock<Block> DARKOAK_WALL_BUILDING = registerBlock("darkoak_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());
    public static final DeferredBlock<Block> CRIMSON_WALL_BUILDING = registerBlock("crimson_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());
    public static final DeferredBlock<Block> WARPED_WALL_BUILDING = registerBlock("warped_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());
    public static final DeferredBlock<Block> MANGROVE_WALL_BUILDING = registerBlock("mangrove_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());
    public static final DeferredBlock<Block> BAMBOO_WALL_BUILDING = registerBlock("bamboo_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.BAMBOO_WOOD).ignitedByLava());
    public static final DeferredBlock<Block> CHERRY_WALL_BUILDING = registerBlock("cherry_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.CHERRY_WOOD).ignitedByLava());
    public static final DeferredBlock<Block> PALE_OAK_WALL_BUILDING = registerBlock("pale_oak_wall_building", WoodWall::new, BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava());


    public static <T extends Block> DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        DeferredBlock<Block> defblock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, defblock);
        return defblock;
    }

    public static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<Block> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }


    public static <T extends Block> DeferredBlock<Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        DeferredBlock<Block> defblock = register(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        return defblock;
    }

    public static <T extends Block> DeferredBlock<Block> register(String name, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        return WALL_BLOCKS.register(name, () -> block.apply(properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void register(IEventBus eventBus) {
        WALL_BLOCKS.register(eventBus);
    }

}
