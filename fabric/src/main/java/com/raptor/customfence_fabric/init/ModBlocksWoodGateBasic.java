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

public class ModBlocksWoodGateBasic {

    public static final Block OAK_CLASSIC_GATE = registerBlock("oak_classic_fence_gate", new FenceGate("oak_classic_fence_gate", WoodType.OAK));
    public static final Block OAK_WILDLIFE_GATE = registerBlock("oak_wildlife_fence_gate", new FenceGate("oak_wildlife_fence_gate", WoodType.OAK));
    public static final Block OAK_PLANK_GATE = registerBlock("oak_plank_fence_gate", new FenceGate("oak_plank_fence_gate", WoodType.OAK));
    public static final Block OAK_CRISSCROSS_GATE = registerBlock("oak_crisscross_fence_gate", new FenceGate("oak_crisscross_fence_gate", WoodType.OAK));

    public static final Block SPRUCE_CLASSIC_GATE = registerBlock("spruce_classic_fence_gate", new FenceGate("spruce_classic_fence_gate", WoodType.SPRUCE));
    public static final Block SPRUCE_WILDLIFE_GATE = registerBlock("spruce_wildlife_fence_gate", new FenceGate("spruce_wildlife_fence_gate", WoodType.SPRUCE));
    public static final Block SPRUCE_PLANK_GATE = registerBlock("spruce_plank_fence_gate", new FenceGate("spruce_plank_fence_gate", WoodType.SPRUCE));
    public static final Block SPRUCE_CRISSCROSS_GATE = registerBlock("spruce_crisscross_fence_gate", new FenceGate("spruce_crisscross_fence_gate", WoodType.SPRUCE));

    public static final Block BIRCH_CLASSIC_GATE = registerBlock("birch_classic_fence_gate", new FenceGate("birch_classic_fence_gate", WoodType.BIRCH));
    public static final Block BIRCH_WILDLIFE_GATE = registerBlock("birch_wildlife_fence_gate", new FenceGate("birch_wildlife_fence_gate", WoodType.BIRCH));
    public static final Block BIRCH_PLANK_GATE = registerBlock("birch_plank_fence_gate", new FenceGate("birch_plank_fence_gate", WoodType.BIRCH));
    public static final Block BIRCH_CRISSCROSS_GATE = registerBlock("birch_crisscross_fence_gate", new FenceGate("birch_crisscross_fence_gate", WoodType.BIRCH));

    public static final Block ACACIA_CLASSIC_GATE = registerBlock("acacia_classic_fence_gate", new FenceGate("acacia_classic_fence_gate", WoodType.ACACIA));
    public static final Block ACACIA_WILDLIFE_GATE = registerBlock("acacia_wildlife_fence_gate", new FenceGate("acacia_wildlife_fence_gate", WoodType.ACACIA));
    public static final Block ACACIA_PLANK_GATE = registerBlock("acacia_plank_fence_gate", new FenceGate("acacia_plank_fence_gate", WoodType.ACACIA));
    public static final Block ACACIA_CRISSCROSS_GATE = registerBlock("acacia_crisscross_fence_gate", new FenceGate("acacia_crisscross_fence_gate", WoodType.ACACIA));

    public static final Block JUNGLE_CLASSIC_GATE = registerBlock("jungle_classic_fence_gate", new FenceGate("jungle_classic_fence_gate", WoodType.JUNGLE));
    public static final Block JUNGLE_WILDLIFE_GATE = registerBlock("jungle_wildlife_fence_gate", new FenceGate("jungle_wildlife_fence_gate", WoodType.JUNGLE));
    public static final Block JUNGLE_PLANK_GATE = registerBlock("jungle_plank_fence_gate", new FenceGate("jungle_plank_fence_gate", WoodType.JUNGLE));
    public static final Block JUNGLE_CRISSCROSS_GATE = registerBlock("jungle_crisscross_fence_gate", new FenceGate("jungle_crisscross_fence_gate", WoodType.JUNGLE));

    public static final Block DARKOAK_CLASSIC_GATE = registerBlock("darkoak_classic_fence_gate", new FenceGate("darkoak_classic_fence_gate", WoodType.DARK_OAK));
    public static final Block DARKOAK_WILDLIFE_GATE = registerBlock("darkoak_wildlife_fence_gate", new FenceGate("darkoak_wildlife_fence_gate", WoodType.DARK_OAK));
    public static final Block DARKOAK_PLANK_GATE = registerBlock("darkoak_plank_fence_gate", new FenceGate("darkoak_plank_fence_gate", WoodType.DARK_OAK));
    public static final Block DARKOAK_CRISSCROSS_GATE = registerBlock("darkoak_crisscross_fence_gate", new FenceGate("darkoak_crisscross_fence_gate", WoodType.DARK_OAK));

    public static final Block CRIMSON_CLASSIC_GATE = registerBlock("crimson_classic_fence_gate", new FenceGate("crimson_classic_fence_gate", WoodType.CRIMSON));
    public static final Block CRIMSON_WILDLIFE_GATE = registerBlock("crimson_wildlife_fence_gate", new FenceGate("crimson_wildlife_fence_gate", WoodType.CRIMSON));
    public static final Block CRIMSON_PLANK_GATE = registerBlock("crimson_plank_fence_gate", new FenceGate("crimson_plank_fence_gate", WoodType.CRIMSON));
    public static final Block CRIMSON_CRISSCROSS_GATE = registerBlock("crimson_crisscross_fence_gate", new FenceGate("crimson_crisscross_fence_gate", WoodType.CRIMSON));

    public static final Block WARPED_CLASSIC_GATE = registerBlock("warped_classic_fence_gate", new FenceGate("warped_classic_fence_gate", WoodType.WARPED));
    public static final Block WARPED_WILDLIFE_GATE = registerBlock("warped_wildlife_fence_gate", new FenceGate("warped_wildlife_fence_gate", WoodType.WARPED));
    public static final Block WARPED_PLANK_GATE = registerBlock("warped_plank_fence_gate", new FenceGate("warped_plank_fence_gate", WoodType.WARPED));
    public static final Block WARPED_CRISSCROSS_GATE = registerBlock("warped_crisscross_fence_gate", new FenceGate("warped_crisscross_fence_gate", WoodType.WARPED));

    public static final Block MANGROVE_CLASSIC_GATE = registerBlock("mangrove_classic_fence_gate", new FenceGate("mangrove_classic_fence_gate", WoodType.MANGROVE));
    public static final Block MANGROVE_WILDLIFE_GATE = registerBlock("mangrove_wildlife_fence_gate", new FenceGate("mangrove_wildlife_fence_gate", WoodType.MANGROVE));
    public static final Block MANGROVE_PLANK_GATE = registerBlock("mangrove_plank_fence_gate", new FenceGate("mangrove_plank_fence_gate", WoodType.MANGROVE));
    public static final Block MANGROVE_CRISSCROSS_GATE = registerBlock("mangrove_crisscross_fence_gate", new FenceGate("mangrove_crisscross_fence_gate", WoodType.MANGROVE));

    public static final Block BAMBOO_CLASSIC_GATE = registerBlock("bamboo_classic_fence_gate", new FenceGate("bamboo_classic_fence_gate", WoodType.BAMBOO));
    public static final Block BAMBOO_WILDLIFE_GATE = registerBlock("bamboo_wildlife_fence_gate", new FenceGate("bamboo_wildlife_fence_gate", WoodType.BAMBOO));
    public static final Block BAMBOO_PLANK_GATE = registerBlock("bamboo_plank_fence_gate", new FenceGate("bamboo_plank_fence_gate", WoodType.BAMBOO));
    public static final Block BAMBOO_CRISSCROSS_GATE = registerBlock("bamboo_crisscross_fence_gate", new FenceGate("bamboo_crisscross_fence_gate", WoodType.BAMBOO));

    public static final Block CHERRY_CLASSIC_GATE = registerBlock("cherry_classic_fence_gate", new FenceGate("cherry_classic_fence_gate", WoodType.CHERRY));
    public static final Block CHERRY_WILDLIFE_GATE = registerBlock("cherry_wildlife_fence_gate", new FenceGate("cherry_wildlife_fence_gate", WoodType.CHERRY));
    public static final Block CHERRY_PLANK_GATE = registerBlock("cherry_plank_fence_gate", new FenceGate("cherry_plank_fence_gate", WoodType.CHERRY));
    public static final Block CHERRY_CRISSCROSS_GATE = registerBlock("cherry_crisscross_fence_gate", new FenceGate("cherry_crisscross_fence_gate", WoodType.CHERRY));

    public static final Block PALE_OAK_CLASSIC_GATE = registerBlock("pale_oak_classic_fence_gate", new FenceGate("pale_oak_classic_fence_gate", WoodType.PALE_OAK));
    public static final Block PALE_OAK_WILDLIFE_GATE = registerBlock("pale_oak_wildlife_fence_gate", new FenceGate("pale_oak_wildlife_fence_gate", WoodType.PALE_OAK));
    public static final Block PALE_OAK_PLANK_GATE = registerBlock("pale_oak_plank_fence_gate", new FenceGate("pale_oak_plank_fence_gate", WoodType.PALE_OAK));
    public static final Block PALE_OAK_CRISSCROSS_GATE = registerBlock("pale_oak_crisscross_fence_gate", new FenceGate("pale_oak_crisscross_fence_gate", WoodType.PALE_OAK));


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
            entries.add(ModBlocksWoodGateBasic.OAK_CLASSIC_GATE);
        });
    }

}
