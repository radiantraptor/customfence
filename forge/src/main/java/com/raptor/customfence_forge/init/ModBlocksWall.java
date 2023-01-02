package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import com.raptor.customfence_forge.blocks.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Field;
import java.util.ArrayList;

@SuppressWarnings({"WeakerAccess", "unused"})
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModBlocksWall {

    public static final DeferredRegister<Block> WALL_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> cobblestoneModern = WALL_BLOCKS.register("cobblestone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneBuilding = WALL_BLOCKS.register("cobblestone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneCastle = WALL_BLOCKS.register("cobblestone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> mossyCobblestoneModern = WALL_BLOCKS.register("mossy_cobblestone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> mossyCobblestoneBuilding = WALL_BLOCKS.register("mossy_cobblestone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> mossyCobblestoneCastle = WALL_BLOCKS.register("mossy_cobblestone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> stoneModern = WALL_BLOCKS.register("stone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> stoneBuilding = WALL_BLOCKS.register("stone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> stoneCastle = WALL_BLOCKS.register("stone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> stoneBrickModern = WALL_BLOCKS.register("stone_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> stoneBrickBuilding = WALL_BLOCKS.register("stone_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> stoneBrickCastle = WALL_BLOCKS.register("stone_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> mossyStoneBrickModern = WALL_BLOCKS.register("mossy_stone_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> mossyStoneBrickBuilding = WALL_BLOCKS.register("mossy_stone_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> mossyStoneBrickCastle = WALL_BLOCKS.register("mossy_stone_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> andesiteModern = WALL_BLOCKS.register("andesite_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> andesiteBuilding = WALL_BLOCKS.register("andesite_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> andesiteCastle = WALL_BLOCKS.register("andesite_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> dioriteModern = WALL_BLOCKS.register("diorite_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dioriteBuilding = WALL_BLOCKS.register("diorite_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dioriteCastle = WALL_BLOCKS.register("diorite_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> graniteModern = WALL_BLOCKS.register("granite_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> graniteBuilding = WALL_BLOCKS.register("granite_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> graniteCastle = WALL_BLOCKS.register("granite_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> sandstoneModern = WALL_BLOCKS.register("sandstone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> sandstoneBuilding = WALL_BLOCKS.register("sandstone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> sandstoneCastle = WALL_BLOCKS.register("sandstone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> redSandstoneModern = WALL_BLOCKS.register("red_sandstone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> redSandstoneBuilding = WALL_BLOCKS.register("red_sandstone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> redSandstoneCastle = WALL_BLOCKS.register("red_sandstone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> bricksModern = WALL_BLOCKS.register("bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> bricksBuilding = WALL_BLOCKS.register("bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> bricksCastle = WALL_BLOCKS.register("bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> prismarineModern = WALL_BLOCKS.register("prismarine_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> prismarineBuilding = WALL_BLOCKS.register("prismarine_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> prismarineCastle = WALL_BLOCKS.register("prismarine_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> netherBrickModern = WALL_BLOCKS.register("nether_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> netherBrickBuilding = WALL_BLOCKS.register("nether_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> netherBrickCastle = WALL_BLOCKS.register("nether_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> redNetherBrickModern = WALL_BLOCKS.register("red_nether_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> redNetherBrickBuilding = WALL_BLOCKS.register("red_nether_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> redNetherBrickCastle = WALL_BLOCKS.register("red_nether_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> endStoneBrickModern = WALL_BLOCKS.register("end_stone_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> endStoneBrickBuilding = WALL_BLOCKS.register("end_stone_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> endStoneBrickCastle = WALL_BLOCKS.register("end_stone_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 9.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> blackstoneModern = WALL_BLOCKS.register("blackstone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> blackstoneBuilding = WALL_BLOCKS.register("blackstone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> blackstoneCastle = WALL_BLOCKS.register("blackstone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> polishedBlackstoneModern = WALL_BLOCKS.register("polished_blackstone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polishedBlackstoneBuilding = WALL_BLOCKS.register("polished_blackstone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polishedBlackstoneCastle = WALL_BLOCKS.register("polished_blackstone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> polishedBlackstoneBrickModern = WALL_BLOCKS.register("polished_blackstone_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polishedBlackstoneBrickBuilding = WALL_BLOCKS.register("polished_blackstone_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polishedBlackstoneBrickCastle = WALL_BLOCKS.register("polished_blackstone_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> cobbledDeepslateModern = WALL_BLOCKS.register("cobbled_deepslate_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> cobbledDeepslateBuilding = WALL_BLOCKS.register("cobbled_deepslate_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> cobbledDeepslateCastle = WALL_BLOCKS.register("cobbled_deepslate_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> polishedDeepslateModern = WALL_BLOCKS.register("polished_deepslate_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> polishedDeepslateBuilding = WALL_BLOCKS.register("polished_deepslate_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> polishedDeepslateCastle = WALL_BLOCKS.register("polished_deepslate_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> deepslateBrickModern = WALL_BLOCKS.register("deepslate_brick_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> deepslateBrickBuilding = WALL_BLOCKS.register("deepslate_brick_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> deepslateBrickCastle = WALL_BLOCKS.register("deepslate_brick_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> deepslateTileModern = WALL_BLOCKS.register("deepslate_tile_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> deepslateTileBuilding = WALL_BLOCKS.register("deepslate_tile_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> deepslateTileCastle = WALL_BLOCKS.register("deepslate_tile_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> oakWallBuilding = WALL_BLOCKS.register("oak_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchWallBuilding = WALL_BLOCKS.register("birch_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceWallBuilding = WALL_BLOCKS.register("spruce_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaWallBuilding = WALL_BLOCKS.register("acacia_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleWallBuilding = WALL_BLOCKS.register("jungle_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakWallBuilding = WALL_BLOCKS.register("dark_oak_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonWallBuilding = WALL_BLOCKS.register("crimson_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedWallBuilding = WALL_BLOCKS.register("warped_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveWallBuilding = WALL_BLOCKS.register("mangrove_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> bambooWallBuilding = WALL_BLOCKS.register("bamboo_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

}
