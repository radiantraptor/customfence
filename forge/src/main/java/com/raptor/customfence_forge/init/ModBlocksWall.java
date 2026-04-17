package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import com.raptor.customfence_forge.blocks.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


@SuppressWarnings({"WeakerAccess", "unused"})
public class ModBlocksWall {

    public static final DeferredRegister<Block> WALL_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
    
    //BEGIN STONEWALLS

    public static final RegistryObject<Block> COBBLESTONE_MODERN = registerBlock("cobblestone_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("cobblestone_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_BUILDING = registerBlock("cobblestone_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("cobblestone_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_CASTLE = registerBlock("cobblestone_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("cobblestone_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_MODERN = registerBlock("mossy_cobblestone_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("mossy_cobblestone_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_BUILDING = registerBlock("mossy_cobblestone_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("mossy_cobblestone_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_CASTLE = registerBlock("mossy_cobblestone_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("mossy_cobblestone_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_MODERN = registerBlock("stone_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("stone_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_BUILDING = registerBlock("stone_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("stone_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_CASTLE = registerBlock("stone_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("stone_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_BRICKS_MODERN = registerBlock("stone_bricks_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("stone_bricks_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_BRICKS_BUILDING = registerBlock("stone_bricks_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("stone_bricks_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_BRICKS_CASTLE = registerBlock("stone_bricks_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("stone_bricks_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_MODERN = registerBlock("mossy_stone_bricks_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("mossy_stone_bricks_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_BUILDING = registerBlock("mossy_stone_bricks_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("mossy_stone_bricks_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICKS_CASTLE = registerBlock("mossy_stone_bricks_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("mossy_stone_bricks_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ANDESITE_MODERN = registerBlock("andesite_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("andesite_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_BUILDING = registerBlock("andesite_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("andesite_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_CASTLE = registerBlock("andesite_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("andesite_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> POLISHED_ANDESITE_MODERN = registerBlock("polished_andesite_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_andesite_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_BUILDING = registerBlock("polished_andesite_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_andesite_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_CASTLE = registerBlock("polished_andesite_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_andesite_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> DIORITE_MODERN = registerBlock("diorite_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("diorite_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_BUILDING = registerBlock("diorite_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("diorite_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_CASTLE = registerBlock("diorite_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("diorite_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> POLISHED_DIORITE_MODERN = registerBlock("polished_diorite_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_diorite_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_DIORITE_BUILDING = registerBlock("polished_diorite_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_diorite_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_DIORITE_CASTLE = registerBlock("polished_diorite_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_diorite_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GRANITE_MODERN = registerBlock("granite_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("granite_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BUILDING = registerBlock("granite_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("granite_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CASTLE = registerBlock("granite_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("granite_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> POLISHED_GRANITE_MODERN = registerBlock("polished_granite_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_granite_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_GRANITE_BUILDING = registerBlock("polished_granite_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_granite_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_GRANITE_CASTLE = registerBlock("polished_granite_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_granite_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SANDSTONE_MODERN = registerBlock("sandstone_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("sandstone_modern"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BUILDING = registerBlock("sandstone_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("sandstone_building"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_CASTLE = registerBlock("sandstone_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("sandstone_castle"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_MODERN = registerBlock("red_sandstone_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("red_sandstone_modern"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_SANDSTONE_BUILDING = registerBlock("red_sandstone_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("red_sandstone_building"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_SANDSTONE_CASTLE = registerBlock("red_sandstone_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("red_sandstone_castle"))).strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BRICKS_MODERN = registerBlock("bricks_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("bricks_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRICKS_BUILDING = registerBlock("bricks_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("bricks_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRICKS_CASTLE = registerBlock("bricks_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("bricks_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PRISMARINE_MODERN = registerBlock("prismarine_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("prismarine_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRISMARINE_BUILDING = registerBlock("prismarine_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("prismarine_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRISMARINE_CASTLE = registerBlock("prismarine_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("prismarine_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> NETHER_BRICKS_MODERN = registerBlock("nether_bricks_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("nether_bricks_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHER_BRICKS_BUILDING = registerBlock("nether_bricks_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("nether_bricks_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHER_BRICKS_CASTLE = registerBlock("nether_bricks_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("nether_bricks_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_NETHER_BRICKS_MODERN = registerBlock("red_nether_bricks_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("red_nether_bricks_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_BUILDING = registerBlock("red_nether_bricks_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("red_nether_bricks_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_CASTLE = registerBlock("red_nether_bricks_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("red_nether_bricks_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> END_STONE_BRICKS_MODERN = registerBlock("end_stone_bricks_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("end_stone_bricks_modern"))).strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_BRICKS_BUILDING = registerBlock("end_stone_bricks_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("end_stone_bricks_building"))).strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> END_STONE_BRICKS_CASTLE = registerBlock("end_stone_bricks_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("end_stone_bricks_castle"))).strength(3.0f, 9.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLACKSTONE_MODERN = registerBlock("blackstone_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("blackstone_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACKSTONE_BUILDING = registerBlock("blackstone_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("blackstone_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACKSTONE_CASTLE = registerBlock("blackstone_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("blackstone_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_MODERN = registerBlock("polished_blackstone_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_blackstone_modern"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BUILDING = registerBlock("polished_blackstone_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_blackstone_building"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_CASTLE = registerBlock("polished_blackstone_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_blackstone_castle"))).strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_MODERN = registerBlock("polished_blackstone_bricks_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_blackstone_bricks_modern"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_BUILDING = registerBlock("polished_blackstone_bricks_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_blackstone_bricks_building"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICKS_CASTLE = registerBlock("polished_blackstone_bricks_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_blackstone_bricks_castle"))).strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> COBBLED_DEEPSLATE_MODERN = registerBlock("cobbled_deepslate_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("cobbled_deepslate_modern"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BUILDING = registerBlock("cobbled_deepslate_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("cobbled_deepslate_building"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_CASTLE = registerBlock("cobbled_deepslate_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("cobbled_deepslate_castle"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_MODERN = registerBlock("polished_deepslate_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_deepslate_modern"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_BUILDING = registerBlock("polished_deepslate_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_deepslate_building"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_CASTLE = registerBlock("polished_deepslate_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("polished_deepslate_castle"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> DEEPSLATE_BRICK_MODERN = registerBlock("deepslate_brick_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("deepslate_brick_modern"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_BUILDING = registerBlock("deepslate_brick_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("deepslate_brick_building"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_CASTLE = registerBlock("deepslate_brick_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("deepslate_brick_castle"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> DEEPSLATE_TILE_MODERN = registerBlock("deepslate_tile_modern", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("deepslate_tile_modern"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> DEEPSLATE_TILE_BUILDING = registerBlock("deepslate_tile_building", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("deepslate_tile_building"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> DEEPSLATE_TILE_CASTLE = registerBlock("deepslate_tile_castle", () -> new Wall(Block.Properties.of().setId((WALL_BLOCKS.key("deepslate_tile_castle"))).strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));

    
    //END STONEWALLS AND BEGIN WOODENWALLS

    public static final RegistryObject<Block> OAK_WALL_BUILDING = registerBlock("oak_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("oak_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_WALL_BUILDING = registerBlock("birch_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("birch_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_WALL_BUILDING = registerBlock("spruce_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("spruce_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_WALL_BUILDING = registerBlock("acacia_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("acacia_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_WALL_BUILDING = registerBlock("jungle_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("jungle_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARKOAK_WALL_BUILDING = registerBlock("darkoak_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("darkoak_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CRIMSON_WALL_BUILDING = registerBlock("crimson_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("crimson_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WARPED_WALL_BUILDING = registerBlock("warped_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("warped_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MANGROVE_WALL_BUILDING = registerBlock("mangrove_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("mangrove_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BAMBOO_WALL_BUILDING = registerBlock("bamboo_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("bamboo_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHERRY_WALL_BUILDING = registerBlock("cherry_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("cherry_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PALE_OAK_WALL_BUILDING = registerBlock("pale_oak_wall_building", () -> new WoodWall(Block.Properties.of().setId((WALL_BLOCKS.key("pale_oak_wall_building"))).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    //END WOODENWALLS


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = WALL_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().useBlockDescriptionPrefix()
                .setId(ModItems.ITEMS.key(name))));
    }

    public static void register(BusGroup eventBus) {
        WALL_BLOCKS.register(eventBus);
    }

}
