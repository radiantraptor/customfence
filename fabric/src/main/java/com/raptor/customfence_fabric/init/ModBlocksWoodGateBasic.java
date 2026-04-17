package com.raptor.customfence_fabric.init;

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
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Function;

public class ModBlocksWoodGateBasic {

    public static final Block OAK_CLASSIC_GATE = registerBlock("oak_classic_fence_gate", (p) -> new FenceGate(WoodType.OAK, p), (standardBasicGateProperties()));
    public static final Block OAK_WILDLIFE_GATE = registerBlock("oak_wildlife_fence_gate", (p) -> new FenceGate(WoodType.OAK, p), (standardBasicGateProperties()));
    public static final Block OAK_PLANK_GATE = registerBlock("oak_plank_fence_gate", (p) -> new FenceGate(WoodType.OAK, p), (standardBasicGateProperties()));
    public static final Block OAK_CRISSCROSS_GATE = registerBlock("oak_crisscross_fence_gate", (p) -> new FenceGate(WoodType.OAK, p), (standardBasicGateProperties()));

    public static final Block SPRUCE_CLASSIC_GATE = registerBlock("spruce_classic_fence_gate", (p) -> new FenceGate(WoodType.SPRUCE, p), (standardBasicGateProperties()));
    public static final Block SPRUCE_WILDLIFE_GATE = registerBlock("spruce_wildlife_fence_gate", (p) -> new FenceGate(WoodType.SPRUCE, p), (standardBasicGateProperties()));
    public static final Block SPRUCE_PLANK_GATE = registerBlock("spruce_plank_fence_gate", (p) -> new FenceGate(WoodType.SPRUCE, p), (standardBasicGateProperties()));
    public static final Block SPRUCE_CRISSCROSS_GATE = registerBlock("spruce_crisscross_fence_gate", (p) -> new FenceGate(WoodType.SPRUCE, p), (standardBasicGateProperties()));

    public static final Block BIRCH_CLASSIC_GATE = registerBlock("birch_classic_fence_gate", (p) -> new FenceGate(WoodType.BIRCH, p), (standardBasicGateProperties()));
    public static final Block BIRCH_WILDLIFE_GATE = registerBlock("birch_wildlife_fence_gate", (p) -> new FenceGate(WoodType.BIRCH, p), (standardBasicGateProperties()));
    public static final Block BIRCH_PLANK_GATE = registerBlock("birch_plank_fence_gate", (p) -> new FenceGate(WoodType.BIRCH, p), (standardBasicGateProperties()));
    public static final Block BIRCH_CRISSCROSS_GATE = registerBlock("birch_crisscross_fence_gate", (p) -> new FenceGate(WoodType.BIRCH, p), (standardBasicGateProperties()));

    public static final Block ACACIA_CLASSIC_GATE = registerBlock("acacia_classic_fence_gate", (p) -> new FenceGate(WoodType.ACACIA, p), (standardBasicGateProperties()));
    public static final Block ACACIA_WILDLIFE_GATE = registerBlock("acacia_wildlife_fence_gate", (p) -> new FenceGate(WoodType.ACACIA, p), (standardBasicGateProperties()));
    public static final Block ACACIA_PLANK_GATE = registerBlock("acacia_plank_fence_gate", (p) -> new FenceGate(WoodType.ACACIA, p), (standardBasicGateProperties()));
    public static final Block ACACIA_CRISSCROSS_GATE = registerBlock("acacia_crisscross_fence_gate", (p) -> new FenceGate(WoodType.ACACIA, p), (standardBasicGateProperties()));

    public static final Block JUNGLE_CLASSIC_GATE = registerBlock("jungle_classic_fence_gate", (p) -> new FenceGate(WoodType.JUNGLE, p), (standardBasicGateProperties()));
    public static final Block JUNGLE_WILDLIFE_GATE = registerBlock("jungle_wildlife_fence_gate", (p) -> new FenceGate(WoodType.JUNGLE, p), (standardBasicGateProperties()));
    public static final Block JUNGLE_PLANK_GATE = registerBlock("jungle_plank_fence_gate", (p) -> new FenceGate(WoodType.JUNGLE, p), (standardBasicGateProperties()));
    public static final Block JUNGLE_CRISSCROSS_GATE = registerBlock("jungle_crisscross_fence_gate", (p) -> new FenceGate(WoodType.JUNGLE, p), (standardBasicGateProperties()));

    public static final Block DARKOAK_CLASSIC_GATE = registerBlock("darkoak_classic_fence_gate", (p) -> new FenceGate(WoodType.DARK_OAK, p), (standardBasicGateProperties()));
    public static final Block DARKOAK_WILDLIFE_GATE = registerBlock("darkoak_wildlife_fence_gate", (p) -> new FenceGate(WoodType.DARK_OAK, p), (standardBasicGateProperties()));
    public static final Block DARKOAK_PLANK_GATE = registerBlock("darkoak_plank_fence_gate", (p) -> new FenceGate(WoodType.DARK_OAK, p), (standardBasicGateProperties()));
    public static final Block DARKOAK_CRISSCROSS_GATE = registerBlock("darkoak_crisscross_fence_gate", (p) -> new FenceGate(WoodType.DARK_OAK, p), (standardBasicGateProperties()));

    public static final Block CRIMSON_CLASSIC_GATE = registerBlock("crimson_classic_fence_gate", (p) -> new FenceGate(WoodType.CRIMSON, p), (standardBasicGateProperties()));
    public static final Block CRIMSON_WILDLIFE_GATE = registerBlock("crimson_wildlife_fence_gate", (p) -> new FenceGate(WoodType.CRIMSON, p), (standardBasicGateProperties()));
    public static final Block CRIMSON_PLANK_GATE = registerBlock("crimson_plank_fence_gate", (p) -> new FenceGate(WoodType.CRIMSON, p), (standardBasicGateProperties()));
    public static final Block CRIMSON_CRISSCROSS_GATE = registerBlock("crimson_crisscross_fence_gate", (p) -> new FenceGate(WoodType.CRIMSON, p), (standardBasicGateProperties()));

    public static final Block WARPED_CLASSIC_GATE = registerBlock("warped_classic_fence_gate", (p) -> new FenceGate(WoodType.WARPED, p), (standardBasicGateProperties()));
    public static final Block WARPED_WILDLIFE_GATE = registerBlock("warped_wildlife_fence_gate", (p) -> new FenceGate(WoodType.WARPED, p), (standardBasicGateProperties()));
    public static final Block WARPED_PLANK_GATE = registerBlock("warped_plank_fence_gate", (p) -> new FenceGate(WoodType.WARPED, p), (standardBasicGateProperties()));
    public static final Block WARPED_CRISSCROSS_GATE = registerBlock("warped_crisscross_fence_gate", (p) -> new FenceGate(WoodType.WARPED, p), (standardBasicGateProperties()));

    public static final Block MANGROVE_CLASSIC_GATE = registerBlock("mangrove_classic_fence_gate", (p) -> new FenceGate(WoodType.MANGROVE, p), (standardBasicGateProperties()));
    public static final Block MANGROVE_WILDLIFE_GATE = registerBlock("mangrove_wildlife_fence_gate", (p) -> new FenceGate(WoodType.MANGROVE, p), (standardBasicGateProperties()));
    public static final Block MANGROVE_PLANK_GATE = registerBlock("mangrove_plank_fence_gate", (p) -> new FenceGate(WoodType.MANGROVE, p), (standardBasicGateProperties()));
    public static final Block MANGROVE_CRISSCROSS_GATE = registerBlock("mangrove_crisscross_fence_gate", (p) -> new FenceGate(WoodType.MANGROVE, p), (standardBasicGateProperties()));

    public static final Block BAMBOO_CLASSIC_GATE = registerBlock("bamboo_classic_fence_gate", (p) -> new FenceGate(WoodType.BAMBOO, p), (standardBasicGateProperties()));
    public static final Block BAMBOO_WILDLIFE_GATE = registerBlock("bamboo_wildlife_fence_gate", (p) -> new FenceGate(WoodType.BAMBOO, p), (standardBasicGateProperties()));
    public static final Block BAMBOO_PLANK_GATE = registerBlock("bamboo_plank_fence_gate", (p) -> new FenceGate(WoodType.BAMBOO, p), (standardBasicGateProperties()));
    public static final Block BAMBOO_CRISSCROSS_GATE = registerBlock("bamboo_crisscross_fence_gate", (p) -> new FenceGate(WoodType.BAMBOO, p), (standardBasicGateProperties()));

    public static final Block CHERRY_CLASSIC_GATE = registerBlock("cherry_classic_fence_gate", (p) -> new FenceGate(WoodType.CHERRY, p), (standardBasicGateProperties()));
    public static final Block CHERRY_WILDLIFE_GATE = registerBlock("cherry_wildlife_fence_gate", (p) -> new FenceGate(WoodType.CHERRY, p), (standardBasicGateProperties()));
    public static final Block CHERRY_PLANK_GATE = registerBlock("cherry_plank_fence_gate", (p) -> new FenceGate(WoodType.CHERRY, p), (standardBasicGateProperties()));
    public static final Block CHERRY_CRISSCROSS_GATE = registerBlock("cherry_crisscross_fence_gate", (p) -> new FenceGate(WoodType.CHERRY, p), (standardBasicGateProperties()));

    public static final Block PALE_OAK_CLASSIC_GATE = registerBlock("pale_oak_classic_fence_gate", (p) -> new FenceGate(WoodType.PALE_OAK, p), (standardBasicGateProperties()));
    public static final Block PALE_OAK_WILDLIFE_GATE = registerBlock("pale_oak_wildlife_fence_gate", (p) -> new FenceGate(WoodType.PALE_OAK, p), (standardBasicGateProperties()));
    public static final Block PALE_OAK_PLANK_GATE = registerBlock("pale_oak_plank_fence_gate", (p) -> new FenceGate(WoodType.PALE_OAK, p), (standardBasicGateProperties()));
    public static final Block PALE_OAK_CRISSCROSS_GATE = registerBlock("pale_oak_crisscross_fence_gate", (p) -> new FenceGate(WoodType.PALE_OAK, p), (standardBasicGateProperties()));


    public static BlockBehaviour.Properties standardBasicGateProperties() {
        return BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).ignitedByLava();
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
