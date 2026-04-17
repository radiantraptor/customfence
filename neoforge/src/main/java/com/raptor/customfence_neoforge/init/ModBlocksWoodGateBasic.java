package com.raptor.customfence_neoforge.init;

import com.raptor.customfence_neoforge.Main;
import com.raptor.customfence_neoforge.blocks.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Function;

public class ModBlocksWoodGateBasic {

    public static final DeferredRegister.Blocks WOOD_GATE_BASIC = DeferredRegister.createBlocks(Main.MOD_ID);

    public static final DeferredBlock<Block> OAK_CLASSIC_GATE = registerBlock("oak_classic_fence_gate", (p) -> new FenceGate(WoodType.OAK, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> OAK_WILDLIFE_GATE = registerBlock("oak_wildlife_fence_gate", (p) -> new FenceGate(WoodType.OAK, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> OAK_PLANK_GATE = registerBlock("oak_plank_fence_gate", (p) -> new FenceGate(WoodType.OAK, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> OAK_CRISSCROSS_GATE = registerBlock("oak_crisscross_fence_gate", (p) -> new FenceGate(WoodType.OAK, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> SPRUCE_CLASSIC_GATE = registerBlock("spruce_classic_fence_gate", (p) -> new FenceGate(WoodType.SPRUCE, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> SPRUCE_WILDLIFE_GATE = registerBlock("spruce_wildlife_fence_gate", (p) -> new FenceGate(WoodType.SPRUCE, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> SPRUCE_PLANK_GATE = registerBlock("spruce_plank_fence_gate", (p) -> new FenceGate(WoodType.SPRUCE, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> SPRUCE_CRISSCROSS_GATE = registerBlock("spruce_crisscross_fence_gate", (p) -> new FenceGate(WoodType.SPRUCE, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> BIRCH_CLASSIC_GATE = registerBlock("birch_classic_fence_gate", (p) -> new FenceGate(WoodType.BIRCH, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> BIRCH_WILDLIFE_GATE = registerBlock("birch_wildlife_fence_gate", (p) -> new FenceGate(WoodType.BIRCH, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> BIRCH_PLANK_GATE = registerBlock("birch_plank_fence_gate", (p) -> new FenceGate(WoodType.BIRCH, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> BIRCH_CRISSCROSS_GATE = registerBlock("birch_crisscross_fence_gate", (p) -> new FenceGate(WoodType.BIRCH, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> ACACIA_CLASSIC_GATE = registerBlock("acacia_classic_fence_gate", (p) -> new FenceGate(WoodType.ACACIA, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> ACACIA_WILDLIFE_GATE = registerBlock("acacia_wildlife_fence_gate", (p) -> new FenceGate(WoodType.ACACIA, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> ACACIA_PLANK_GATE = registerBlock("acacia_plank_fence_gate", (p) -> new FenceGate(WoodType.ACACIA, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> ACACIA_CRISSCROSS_GATE = registerBlock("acacia_crisscross_fence_gate", (p) -> new FenceGate(WoodType.ACACIA, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> JUNGLE_CLASSIC_GATE = registerBlock("jungle_classic_fence_gate", (p) -> new FenceGate(WoodType.JUNGLE, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> JUNGLE_WILDLIFE_GATE = registerBlock("jungle_wildlife_fence_gate", (p) -> new FenceGate(WoodType.JUNGLE, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> JUNGLE_PLANK_GATE = registerBlock("jungle_plank_fence_gate", (p) -> new FenceGate(WoodType.JUNGLE, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> JUNGLE_CRISSCROSS_GATE = registerBlock("jungle_crisscross_fence_gate", (p) -> new FenceGate(WoodType.JUNGLE, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> DARKOAK_CLASSIC_GATE = registerBlock("darkoak_classic_fence_gate", (p) -> new FenceGate(WoodType.DARK_OAK, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> DARKOAK_WILDLIFE_GATE = registerBlock("darkoak_wildlife_fence_gate", (p) -> new FenceGate(WoodType.DARK_OAK, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> DARKOAK_PLANK_GATE = registerBlock("darkoak_plank_fence_gate", (p) -> new FenceGate(WoodType.DARK_OAK, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> DARKOAK_CRISSCROSS_GATE = registerBlock("darkoak_crisscross_fence_gate", (p) -> new FenceGate(WoodType.DARK_OAK, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> CRIMSON_CLASSIC_GATE = registerBlock("crimson_classic_fence_gate", (p) -> new FenceGate(WoodType.CRIMSON, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> CRIMSON_WILDLIFE_GATE = registerBlock("crimson_wildlife_fence_gate", (p) -> new FenceGate(WoodType.CRIMSON, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> CRIMSON_PLANK_GATE = registerBlock("crimson_plank_fence_gate", (p) -> new FenceGate(WoodType.CRIMSON, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> CRIMSON_CRISSCROSS_GATE = registerBlock("crimson_crisscross_fence_gate", (p) -> new FenceGate(WoodType.CRIMSON, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> WARPED_CLASSIC_GATE = registerBlock("warped_classic_fence_gate", (p) -> new FenceGate(WoodType.WARPED, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> WARPED_WILDLIFE_GATE = registerBlock("warped_wildlife_fence_gate", (p) -> new FenceGate(WoodType.WARPED, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> WARPED_PLANK_GATE = registerBlock("warped_plank_fence_gate", (p) -> new FenceGate(WoodType.WARPED, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> WARPED_CRISSCROSS_GATE = registerBlock("warped_crisscross_fence_gate", (p) -> new FenceGate(WoodType.WARPED, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> MANGROVE_CLASSIC_GATE = registerBlock("mangrove_classic_fence_gate", (p) -> new FenceGate(WoodType.MANGROVE, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> MANGROVE_WILDLIFE_GATE = registerBlock("mangrove_wildlife_fence_gate", (p) -> new FenceGate(WoodType.MANGROVE, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> MANGROVE_PLANK_GATE = registerBlock("mangrove_plank_fence_gate", (p) -> new FenceGate(WoodType.MANGROVE, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> MANGROVE_CRISSCROSS_GATE = registerBlock("mangrove_crisscross_fence_gate", (p) -> new FenceGate(WoodType.MANGROVE, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> BAMBOO_CLASSIC_GATE = registerBlock("bamboo_classic_fence_gate", (p) -> new FenceGate(WoodType.BAMBOO, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> BAMBOO_WILDLIFE_GATE = registerBlock("bamboo_wildlife_fence_gate", (p) -> new FenceGate(WoodType.BAMBOO, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> BAMBOO_PLANK_GATE = registerBlock("bamboo_plank_fence_gate", (p) -> new FenceGate(WoodType.BAMBOO, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> BAMBOO_CRISSCROSS_GATE = registerBlock("bamboo_crisscross_fence_gate", (p) -> new FenceGate(WoodType.BAMBOO, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> CHERRY_CLASSIC_GATE = registerBlock("cherry_classic_fence_gate", (p) -> new FenceGate(WoodType.CHERRY, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> CHERRY_WILDLIFE_GATE = registerBlock("cherry_wildlife_fence_gate", (p) -> new FenceGate(WoodType.CHERRY, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> CHERRY_PLANK_GATE = registerBlock("cherry_plank_fence_gate", (p) -> new FenceGate(WoodType.CHERRY, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> CHERRY_CRISSCROSS_GATE = registerBlock("cherry_crisscross_fence_gate", (p) -> new FenceGate(WoodType.CHERRY, p), (standardBasicGateProperties()));

    public static final DeferredBlock<Block> PALE_OAK_CLASSIC_GATE = registerBlock("pale_oak_classic_fence_gate", (p) -> new FenceGate(WoodType.PALE_OAK, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> PALE_OAK_WILDLIFE_GATE = registerBlock("pale_oak_wildlife_fence_gate", (p) -> new FenceGate(WoodType.PALE_OAK, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> PALE_OAK_PLANK_GATE = registerBlock("pale_oak_plank_fence_gate", (p) -> new FenceGate(WoodType.PALE_OAK, p), (standardBasicGateProperties()));
    public static final DeferredBlock<Block> PALE_OAK_CRISSCROSS_GATE = registerBlock("pale_oak_crisscross_fence_gate", (p) -> new FenceGate(WoodType.PALE_OAK, p), (standardBasicGateProperties()));


    public static BlockBehaviour.Properties standardBasicGateProperties() {
        return BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F,3.0F).ignitedByLava();
    }

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
        return WOOD_GATE_BASIC.register(name, () -> block.apply(properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }


    public static void register(IEventBus eventBus) {
        WOOD_GATE_BASIC.register(eventBus);
    }

}
