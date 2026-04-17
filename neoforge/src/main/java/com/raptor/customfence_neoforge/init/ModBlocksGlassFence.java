package com.raptor.customfence_neoforge.init;

import com.raptor.customfence_neoforge.Main;
import com.raptor.customfence_neoforge.blocks.GlassFence;
import com.raptor.customfence_neoforge.blocks.GlassFenceGate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Function;

public class ModBlocksGlassFence {

    public static final DeferredRegister.Blocks GLASS_PLAIN_BLOCKS = DeferredRegister.createBlocks(Main.MOD_ID);

    public static final DeferredBlock<Block> WHITE_CONCRETE_GLASS_PLAIN = registerBlock("white_concrete_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_WHITE_STAINED_GLASS_PLAIN = registerBlock("white_concrete_white_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_LIGHT_GRAY_STAINED_GLASS_PLAIN = registerBlock("white_concrete_light_gray_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_GRAY_STAINED_GLASS_PLAIN = registerBlock("white_concrete_gray_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_BLACK_STAINED_GLASS_PLAIN = registerBlock("white_concrete_black_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_BROWN_STAINED_GLASS_PLAIN = registerBlock("white_concrete_brown_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_RED_STAINED_GLASS_PLAIN = registerBlock("white_concrete_red_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_ORANGE_STAINED_GLASS_PLAIN = registerBlock("white_concrete_orange_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_YELLOW_STAINED_GLASS_PLAIN = registerBlock("white_concrete_yellow_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_LIME_STAINED_GLASS_PLAIN = registerBlock("white_concrete_lime_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_GREEN_STAINED_GLASS_PLAIN = registerBlock("white_concrete_green_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_CYAN_STAINED_GLASS_PLAIN = registerBlock("white_concrete_cyan_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_LIGHT_BLUE_STAINED_GLASS_PLAIN = registerBlock("white_concrete_light_blue_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_BLUE_STAINED_GLASS_PLAIN = registerBlock("white_concrete_blue_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_PURPLE_STAINED_GLASS_PLAIN = registerBlock("white_concrete_purple_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_MAGENTA_STAINED_GLASS_PLAIN = registerBlock("white_concrete_magenta_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> WHITE_CONCRETE_PINK_STAINED_GLASS_PLAIN = registerBlock("white_concrete_pink_stained_glass_plain", GlassFence::new, (Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> GLASS_PLAIN_FENCE_GATE = registerBlock("glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> WHITE_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("white_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> LIGHT_GRAY_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("light_gray_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> GRAY_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("gray_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> BLACK_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("black_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> BROWN_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("brown_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> RED_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("red_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> ORANGE_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("orange_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> YELLOW_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("yellow_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> LIME_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("lime_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> GREEN_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("green_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> CYAN_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("cyan_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> LIGHT_BLUE_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("light_blue_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> BLUE_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("blue_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> PURPLE_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("purple_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> MAGENTA_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("magenta_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));
    public static final DeferredBlock<Block> PINK_STAINED_GLASS_PLAIN_FENCE_GATE = registerBlock("pink_stained_glass_plain_fence_gate", (p) -> new GlassFenceGate(p, new WoodType("metal", BlockSetType.IRON, SoundType.GLASS, SoundType.GLASS, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)), Block.Properties.ofFullCopy(Blocks.GLASS).noCollision().isValidSpawn(ModBlocksGlassFence::never).isRedstoneConductor(ModBlocksGlassFence::isntSolid).isSuffocating(ModBlocksGlassFence::isntSolid).isViewBlocking(ModBlocksGlassFence::isntSolid).strength(2.0f, 3.0f).sound(SoundType.GLASS));


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
        return GLASS_PLAIN_BLOCKS.register(name, () -> block.apply(properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void register(IEventBus eventBus) {
        GLASS_PLAIN_BLOCKS.register(eventBus);
    }

    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    private static Boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> entity) {
        return false;
    }
    private static boolean isntSolid(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

}
