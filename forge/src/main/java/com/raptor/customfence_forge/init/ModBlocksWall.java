package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import com.raptor.customfence_forge.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@SuppressWarnings({"WeakerAccess", "unused"})
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModBlocksWall {

    public static final DeferredRegister<Block> WALL_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
    
    //BEGIN STONEWALLS

    public static final RegistryObject<Block> COBBLESTONE_MODERN = WALL_BLOCKS.register("cobblestone_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_BUILDING = WALL_BLOCKS.register("cobblestone_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_CASTLE = WALL_BLOCKS.register("cobblestone_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_MODERN = WALL_BLOCKS.register("mossy_cobblestone_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BUILDING = WALL_BLOCKS.register("mossy_cobblestone_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_CASTLE = WALL_BLOCKS.register("mossy_cobblestone_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_MODERN = WALL_BLOCKS.register("stone_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_BUILDING = WALL_BLOCKS.register("stone_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_CASTLE = WALL_BLOCKS.register("stone_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_BRICKS_MODERN = WALL_BLOCKS.register("stone_bricks_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_BRICKS_BUILDING = WALL_BLOCKS.register("stone_bricks_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_BRICKS_CASTLE = WALL_BLOCKS.register("stone_bricks_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_MODERN = WALL_BLOCKS.register("mossy_stone_bricks_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_BUILDING = WALL_BLOCKS.register("mossy_stone_bricks_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_CASTLE = WALL_BLOCKS.register("mossy_stone_bricks_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ANDESITE_MODERN = WALL_BLOCKS.register("andesite_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_BUILDING = WALL_BLOCKS.register("andesite_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_CASTLE = WALL_BLOCKS.register("andesite_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DIORITE_MODERN = WALL_BLOCKS.register("diorite_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_BUILDING = WALL_BLOCKS.register("diorite_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_CASTLE = WALL_BLOCKS.register("diorite_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GRANITE_MODERN = WALL_BLOCKS.register("granite_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BUILDING = WALL_BLOCKS.register("granite_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CASTLE = WALL_BLOCKS.register("granite_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SANDSTONE_MODERN = WALL_BLOCKS.register("sandstone_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BUILDING = WALL_BLOCKS.register("sandstone_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_CASTLE = WALL_BLOCKS.register("sandstone_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_MODERN = WALL_BLOCKS.register("red_sandstone_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_SANDSTONE_BUILDING = WALL_BLOCKS.register("red_sandstone_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_SANDSTONE_CASTLE = WALL_BLOCKS.register("red_sandstone_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BRICKS_MODERN = WALL_BLOCKS.register("bricks_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRICKS_BUILDING = WALL_BLOCKS.register("bricks_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRICKS_CASTLE = WALL_BLOCKS.register("bricks_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PRISMARINE_MODERN = WALL_BLOCKS.register("prismarine_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRISMARINE_BUILDING = WALL_BLOCKS.register("prismarine_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRISMARINE_CASTLE = WALL_BLOCKS.register("prismarine_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NETHER_BRICKS_MODERN = WALL_BLOCKS.register("nether_bricks_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHER_BRICKS_BUILDING = WALL_BLOCKS.register("nether_bricks_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHER_BRICKS_CASTLE = WALL_BLOCKS.register("nether_bricks_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_NETHER_BRICKS_MODERN = WALL_BLOCKS.register("red_nether_bricks_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_BUILDING = WALL_BLOCKS.register("red_nether_bricks_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_CASTLE = WALL_BLOCKS.register("red_nether_bricks_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> END_STONE_BRICKS_MODERN = WALL_BLOCKS.register("end_stone_bricks_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_BRICKS_BUILDING = WALL_BLOCKS.register("end_stone_bricks_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_BRICKS_CASTLE = WALL_BLOCKS.register("end_stone_bricks_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.0f, 9.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLACKSTONE_MODERN = WALL_BLOCKS.register("blackstone_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACKSTONE_BUILDING = WALL_BLOCKS.register("blackstone_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACKSTONE_CASTLE = WALL_BLOCKS.register("blackstone_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_MODERN = WALL_BLOCKS.register("polished_blackstone_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BUILDING = WALL_BLOCKS.register("polished_blackstone_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_CASTLE = WALL_BLOCKS.register("polished_blackstone_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_MODERN = WALL_BLOCKS.register("polished_blackstone_bricks_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_BUILDING = WALL_BLOCKS.register("polished_blackstone_bricks_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_CASTLE = WALL_BLOCKS.register("polished_blackstone_bricks_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_MODERN = WALL_BLOCKS.register("cobbled_deepslate_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BUILDING = WALL_BLOCKS.register("cobbled_deepslate_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_CASTLE = WALL_BLOCKS.register("cobbled_deepslate_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_MODERN = WALL_BLOCKS.register("polished_deepslate_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_BUILDING = WALL_BLOCKS.register("polished_deepslate_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_CASTLE = WALL_BLOCKS.register("polished_deepslate_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> DEEPSLATE_BRICK_MODERN = WALL_BLOCKS.register("deepslate_brick_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_BUILDING = WALL_BLOCKS.register("deepslate_brick_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_CASTLE = WALL_BLOCKS.register("deepslate_brick_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> DEEPSLATE_TILE_MODERN = WALL_BLOCKS.register("deepslate_tile_modern", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> DEEPSLATE_TILE_BUILDING = WALL_BLOCKS.register("deepslate_tile_building", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> DEEPSLATE_TILE_CASTLE = WALL_BLOCKS.register("deepslate_tile_castle", () -> new Wall(Block.Properties.of().requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    
    //END STONEWALLS AND BEGIN WOODENWALLS

    public static final RegistryObject<Block> OAK_WALL_BUILDING = WALL_BLOCKS.register("oak_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_WALL_BUILDING = WALL_BLOCKS.register("birch_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_WALL_BUILDING = WALL_BLOCKS.register("spruce_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_WALL_BUILDING = WALL_BLOCKS.register("acacia_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_WALL_BUILDING = WALL_BLOCKS.register("jungle_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARKOAK_WALL_BUILDING = WALL_BLOCKS.register("darkoak_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CRIMSON_WALL_BUILDING = WALL_BLOCKS.register("crimson_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WARPED_WALL_BUILDING = WALL_BLOCKS.register("warped_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MANGROVE_WALL_BUILDING = WALL_BLOCKS.register("mangrove_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BAMBOO_WALL_BUILDING = WALL_BLOCKS.register("bamboo_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_WALL_BUILDING = WALL_BLOCKS.register("cherry_wall_building", () -> new WoodWall(Block.Properties.of().strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    
    //END WOODENWALLS

}
