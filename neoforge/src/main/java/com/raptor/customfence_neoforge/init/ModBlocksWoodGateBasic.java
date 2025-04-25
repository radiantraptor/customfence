package com.raptor.customfence_neoforge.init;

import com.raptor.customfence_neoforge.Main;
import com.raptor.customfence_neoforge.blocks.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;

public class ModBlocksWoodGateBasic {

    public static final DeferredRegister.Blocks WOOD_GATE_BASIC = DeferredRegister.createBlocks(Main.MOD_ID);

    public static final DeferredBlock<Block> OAK_CLASSIC_GATE = registerBlock("oak_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "oak_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.OAK));
    public static final DeferredBlock<Block> OAK_WILDLIFE_GATE = registerBlock("oak_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "oak_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.OAK));
    public static final DeferredBlock<Block> OAK_PLANK_GATE = registerBlock("oak_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "oak_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.OAK));
    public static final DeferredBlock<Block> OAK_CRISSCROSS_GATE = registerBlock("oak_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "oak_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.OAK));

    public static final DeferredBlock<Block> BIRCH_CLASSIC_GATE = registerBlock("birch_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "birch_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BIRCH));
    public static final DeferredBlock<Block> BIRCH_WILDLIFE_GATE = registerBlock("birch_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "birch_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BIRCH));
    public static final DeferredBlock<Block> BIRCH_PLANK_GATE = registerBlock("birch_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "birch_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BIRCH));
    public static final DeferredBlock<Block> BIRCH_CRISSCROSS_GATE = registerBlock("birch_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "birch_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BIRCH));

    public static final DeferredBlock<Block> SPRUCE_CLASSIC_GATE = registerBlock("spruce_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "spruce_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.SPRUCE));
    public static final DeferredBlock<Block> SPRUCE_WILDLIFE_GATE = registerBlock("spruce_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "spruce_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.SPRUCE));
    public static final DeferredBlock<Block> SPRUCE_PLANK_GATE = registerBlock("spruce_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "spruce_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.SPRUCE));
    public static final DeferredBlock<Block> SPRUCE_CRISSCROSS_GATE = registerBlock("spruce_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "spruce_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.SPRUCE));

    public static final DeferredBlock<Block> JUNGLE_CLASSIC_GATE = registerBlock("jungle_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "jungle_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.JUNGLE));
    public static final DeferredBlock<Block> JUNGLE_WILDLIFE_GATE = registerBlock("jungle_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "jungle_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.JUNGLE));
    public static final DeferredBlock<Block> JUNGLE_PLANK_GATE = registerBlock("jungle_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "jungle_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.JUNGLE));
    public static final DeferredBlock<Block> JUNGLE_CRISSCROSS_GATE = registerBlock("jungle_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "jungle_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.JUNGLE));

    public static final DeferredBlock<Block> ACACIA_CLASSIC_GATE = registerBlock("acacia_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "acacia_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.ACACIA));
    public static final DeferredBlock<Block> ACACIA_WILDLIFE_GATE = registerBlock("acacia_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "acacia_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.ACACIA));
    public static final DeferredBlock<Block> ACACIA_PLANK_GATE = registerBlock("acacia_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "acacia_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.ACACIA));
    public static final DeferredBlock<Block> ACACIA_CRISSCROSS_GATE = registerBlock("acacia_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "acacia_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.ACACIA));

    public static final DeferredBlock<Block> DARKOAK_CLASSIC_GATE = registerBlock("darkoak_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "darkoak_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.DARK_OAK));
    public static final DeferredBlock<Block> DARKOAK_WILDLIFE_GATE = registerBlock("darkoak_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "darkoak_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.DARK_OAK));
    public static final DeferredBlock<Block> DARKOAK_PLANK_GATE = registerBlock("darkoak_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "darkoak_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.DARK_OAK));
    public static final DeferredBlock<Block> DARKOAK_CRISSCROSS_GATE = registerBlock("darkoak_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "darkoak_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.DARK_OAK));

    public static final DeferredBlock<Block> WARPED_CLASSIC_GATE = registerBlock("warped_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "warped_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.WARPED));
    public static final DeferredBlock<Block> WARPED_WILDLIFE_GATE = registerBlock("warped_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "warped_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.WARPED));
    public static final DeferredBlock<Block> WARPED_PLANK_GATE = registerBlock("warped_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "warped_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.WARPED));
    public static final DeferredBlock<Block> WARPED_CRISSCROSS_GATE = registerBlock("warped_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "warped_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.WARPED));

    public static final DeferredBlock<Block> CRIMSON_CLASSIC_GATE = registerBlock("crimson_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "crimson_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CRIMSON));
    public static final DeferredBlock<Block> CRIMSON_WILDLIFE_GATE = registerBlock("crimson_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "crimson_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CRIMSON));
    public static final DeferredBlock<Block> CRIMSON_PLANK_GATE = registerBlock("crimson_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "crimson_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CRIMSON));
    public static final DeferredBlock<Block> CRIMSON_CRISSCROSS_GATE = registerBlock("crimson_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "crimson_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CRIMSON));

    public static final DeferredBlock<Block> MANGROVE_CLASSIC_GATE = registerBlock("mangrove_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mangrove_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.MANGROVE));
    public static final DeferredBlock<Block> MANGROVE_WILDLIFE_GATE = registerBlock("mangrove_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mangrove_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.MANGROVE));
    public static final DeferredBlock<Block> MANGROVE_PLANK_GATE = registerBlock("mangrove_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mangrove_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.MANGROVE));
    public static final DeferredBlock<Block> MANGROVE_CRISSCROSS_GATE = registerBlock("mangrove_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "mangrove_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.MANGROVE));

    public static final DeferredBlock<Block> BAMBOO_CLASSIC_GATE = registerBlock("bamboo_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bamboo_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BAMBOO));
    public static final DeferredBlock<Block> BAMBOO_WILDLIFE_GATE = registerBlock("bamboo_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bamboo_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BAMBOO));
    public static final DeferredBlock<Block> BAMBOO_PLANK_GATE = registerBlock("bamboo_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bamboo_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BAMBOO));
    public static final DeferredBlock<Block> BAMBOO_CRISSCROSS_GATE = registerBlock("bamboo_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bamboo_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BAMBOO));

    public static final DeferredBlock<Block> CHERRY_CLASSIC_GATE = registerBlock("cherry_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cherry_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CHERRY));
    public static final DeferredBlock<Block> CHERRY_WILDLIFE_GATE = registerBlock("cherry_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cherry_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CHERRY));
    public static final DeferredBlock<Block> CHERRY_PLANK_GATE = registerBlock("cherry_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cherry_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CHERRY));
    public static final DeferredBlock<Block> CHERRY_CRISSCROSS_GATE = registerBlock("cherry_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "cherry_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CHERRY));

    public static final DeferredBlock<Block> PALE_OAK_CLASSIC_GATE = registerBlock("pale_oak_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "pale_oak_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.PALE_OAK));
    public static final DeferredBlock<Block> PALE_OAK_WILDLIFE_GATE = registerBlock("pale_oak_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "pale_oak_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.PALE_OAK));
    public static final DeferredBlock<Block> PALE_OAK_PLANK_GATE = registerBlock("pale_oak_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "pale_oak_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.PALE_OAK));
    public static final DeferredBlock<Block> PALE_OAK_CRISSCROSS_GATE = registerBlock("pale_oak_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "pale_oak_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.PALE_OAK));


    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = WOOD_GATE_BASIC.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }


    public static void register(IEventBus eventBus) {
        WOOD_GATE_BASIC.register(eventBus);
    }

}
