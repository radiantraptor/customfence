package com.raptor.customfence_fabric.init;

import com.google.common.collect.ImmutableMap;
import com.raptor.customfence_fabric.Main;
import com.raptor.customfence_fabric.blocks.WeatheringFence;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoneycombItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Optional;


@SuppressWarnings({"WeakerAccess", "unused"})
public class ModItems {

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhoak_fence_gate_closed"), new BlockItem(ModBlocks.HHOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhhoak_fence_gate_closed"), new BlockItem(ModBlocks.HHHOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhoak_vvoak_fence_gate_closed"), new BlockItem(ModBlocks.HHOakVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhoak_xxoak_fence_gate_closed"), new BlockItem(ModBlocks.HHOakXXOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhbirch_fence_gate_closed"), new BlockItem(ModBlocks.HHBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhhbirch_fence_gate_closed"), new BlockItem(ModBlocks.HHHBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhbirch_vvbirch_fence_gate_closed"), new BlockItem(ModBlocks.HHBirchVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhbirch_xxbirch_fence_gate_closed"), new BlockItem(ModBlocks.HHBirchXXBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhspruce_fence_gate_closed"), new BlockItem(ModBlocks.HHSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhhspruce_fence_gate_closed"), new BlockItem(ModBlocks.HHHSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhspruce_vvspruce_fence_gate_closed"), new BlockItem(ModBlocks.HHSpruceVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhspruce_xxspruce_fence_gate_closed"), new BlockItem(ModBlocks.HHSpruceXXSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhjungle_fence_gate_closed"), new BlockItem(ModBlocks.HHJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhhjungle_fence_gate_closed"), new BlockItem(ModBlocks.HHHJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhjungle_vvjungle_fence_gate_closed"), new BlockItem(ModBlocks.HHJungleVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhjungle_xxjungle_fence_gate_closed"), new BlockItem(ModBlocks.HHJungleXXJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhacacia_fence_gate_closed"), new BlockItem(ModBlocks.HHAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhhacacia_fence_gate_closed"), new BlockItem(ModBlocks.HHHAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhacacia_vvacacia_fence_gate_closed"), new BlockItem(ModBlocks.HHAcaciaVVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhacacia_xxacacia_fence_gate_closed"), new BlockItem(ModBlocks.HHAcaciaXXAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.HHDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhhdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.HHHDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhdark_oak_vvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.HHDarkoakVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhdark_oak_xxdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.HHDarkoakXXDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhwarped_fence_gate_closed"), new BlockItem(ModBlocks.HHWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhhwarped_fence_gate_closed"), new BlockItem(ModBlocks.HHHWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhwarped_vvwarped_fence_gate_closed"), new BlockItem(ModBlocks.HHWarpedVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhwarped_xxwarped_fence_gate_closed"), new BlockItem(ModBlocks.HHWarpedXXWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhcrimson_fence_gate_closed"), new BlockItem(ModBlocks.HHCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhhcrimson_fence_gate_closed"), new BlockItem(ModBlocks.HHHCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhcrimson_vvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.HHCrimsonVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhcrimson_xxcrimson_fence_gate_closed"), new BlockItem(ModBlocks.HHCrimsonXXCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhmangrove_fence_gate_closed"), new BlockItem(ModBlocks.HHMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhhmangrove_fence_gate_closed"), new BlockItem(ModBlocks.HHHMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhmangrove_vvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.HHMangroveVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hhmangrove_xxmangrove_fence_gate_closed"), new BlockItem(ModBlocks.HHMangroveXXMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhoak"), new BlockItem(ModBlocks.spruceHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhoak"), new BlockItem(ModBlocks.spruceHHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhoak_vspruce"), new BlockItem(ModBlocks.spruceHHOakVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhoak_vspruce_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHOakVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhoak_vvoak"), new BlockItem(ModBlocks.spruceHHOakVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvoak"), new BlockItem(ModBlocks.spruceHHSpruceVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvoak_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvoak"), new BlockItem(ModBlocks.spruceHHSpruceVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvoak_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhoak_vvvvspruce_vvvvspruce"), new BlockItem(ModBlocks.spruceHHHOakVVVVSpruceVVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhoak_vvvvspruce_vvvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHHOakVVVVSpruceVVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhoak_xxoak"), new BlockItem(ModBlocks.spruceHHOakXXOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvoak"), new BlockItem(ModBlocks.spruceHHSpruceVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhspruce"), new BlockItem(ModBlocks.oakHHSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhspruce"), new BlockItem(ModBlocks.oakHHHSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhspruce_voak"), new BlockItem(ModBlocks.oakHHSpruceVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhspruce_voak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHSpruceVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhspruce_vvspruce"), new BlockItem(ModBlocks.oakHHSpruceVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvspruce"), new BlockItem(ModBlocks.oakHHOakVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvspruce"), new BlockItem(ModBlocks.oakHHOakVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvspruce_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhspruce_vvvvoak_vvvvoak"), new BlockItem(ModBlocks.oakHHHSpruceVVVVOakVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhspruce_vvvvoak_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHHSpruceVVVVOakVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhspruce_xxspruce"), new BlockItem(ModBlocks.oakHHSpruceXXSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvspruce"), new BlockItem(ModBlocks.oakHHOakVVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhbirch"), new BlockItem(ModBlocks.oakHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhbirch"), new BlockItem(ModBlocks.oakHHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhbirch_voak"), new BlockItem(ModBlocks.oakHHBirchVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhbirch_voak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHBirchVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhbirch_vvbirch"), new BlockItem(ModBlocks.oakHHBirchVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvbirch"), new BlockItem(ModBlocks.oakHHOakVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvbirch"), new BlockItem(ModBlocks.oakHHOakVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvbirch_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhbirch_vvvvoak_vvvvoak"), new BlockItem(ModBlocks.oakHHHBirchVVVVOakVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhbirch_vvvvoak_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHHBirchVVVVOakVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhbirch_xxbirch"), new BlockItem(ModBlocks.oakHHBirchXXBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvbirch"), new BlockItem(ModBlocks.oakHHOakVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhoak"), new BlockItem(ModBlocks.birchHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhoak"), new BlockItem(ModBlocks.birchHHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhoak_vbirch"), new BlockItem(ModBlocks.birchHHOakVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhoak_vbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHOakVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhoak_vvoak"), new BlockItem(ModBlocks.birchHHOakVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvoak"), new BlockItem(ModBlocks.birchHHBirchVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvoak_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvoak"), new BlockItem(ModBlocks.birchHHBirchVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvoak_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhoak_vvvvbirch_vvvvbirch"), new BlockItem(ModBlocks.birchHHHOakVVVVBirchVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhoak_vvvvbirch_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHHOakVVVVBirchVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhoak_xxoak"), new BlockItem(ModBlocks.birchHHOakXXOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvoak"), new BlockItem(ModBlocks.birchHHBirchVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhbirch"), new BlockItem(ModBlocks.spruceHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhbirch"), new BlockItem(ModBlocks.spruceHHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhbirch_vspruce"), new BlockItem(ModBlocks.spruceHHBirchVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhbirch_vspruce_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHBirchVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhbirch_vvbirch"), new BlockItem(ModBlocks.spruceHHBirchVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvbirch"), new BlockItem(ModBlocks.spruceHHSpruceVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvbirch"), new BlockItem(ModBlocks.spruceHHSpruceVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvbirch_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhbirch_vvvvspruce_vvvvspruce"), new BlockItem(ModBlocks.spruceHHHBirchVVVVSpruceVVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhbirch_vvvvspruce_vvvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHHBirchVVVVSpruceVVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhbirch_xxbirch"), new BlockItem(ModBlocks.spruceHHBirchXXBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvbirch"), new BlockItem(ModBlocks.spruceHHSpruceVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhspruce"), new BlockItem(ModBlocks.birchHHSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhspruce"), new BlockItem(ModBlocks.birchHHHSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhspruce_vbirch"), new BlockItem(ModBlocks.birchHHSpruceVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhspruce_vbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHSpruceVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhspruce_vvspruce"), new BlockItem(ModBlocks.birchHHSpruceVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvspruce"), new BlockItem(ModBlocks.birchHHBirchVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvspruce"), new BlockItem(ModBlocks.birchHHBirchVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvspruce_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhspruce_vvvvbirch_vvvvbirch"), new BlockItem(ModBlocks.birchHHHSpruceVVVVBirchVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhspruce_vvvvbirch_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHHSpruceVVVVBirchVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhspruce_xxspruce"), new BlockItem(ModBlocks.birchHHSpruceXXSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvspruce"), new BlockItem(ModBlocks.birchHHBirchVVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhspruce"), new BlockItem(ModBlocks.darkoakHHSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhspruce"), new BlockItem(ModBlocks.darkoakHHHSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_vdark_oak"), new BlockItem(ModBlocks.darkoakHHSpruceVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_vdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHSpruceVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_vvspruce"), new BlockItem(ModBlocks.darkoakHHSpruceVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvspruce"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvspruce"), new BlockItem(ModBlocks.darkoakHHDarkoakVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvspruce_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak"), new BlockItem(ModBlocks.darkoakHHHSpruceVVVVDarkoakVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_xxspruce"), new BlockItem(ModBlocks.darkoakHHSpruceXXSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvspruce"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhdark_oak"), new BlockItem(ModBlocks.spruceHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhdark_oak"), new BlockItem(ModBlocks.spruceHHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_vspruce"), new BlockItem(ModBlocks.spruceHHDarkoakVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_vspruce_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHDarkoakVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_vvdark_oak"), new BlockItem(ModBlocks.spruceHHDarkoakVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvdark_oak"), new BlockItem(ModBlocks.spruceHHSpruceVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvdark_oak"), new BlockItem(ModBlocks.spruceHHSpruceVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhdark_oak_vvvvspruce_vvvvspruce"), new BlockItem(ModBlocks.spruceHHHDarkoakVVVVSpruceVVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhdark_oak_vvvvspruce_vvvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHHDarkoakVVVVSpruceVVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_xxdark_oak"), new BlockItem(ModBlocks.spruceHHDarkoakXXDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvdark_oak"), new BlockItem(ModBlocks.spruceHHSpruceVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhoak"), new BlockItem(ModBlocks.darkoakHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhoak"), new BlockItem(ModBlocks.darkoakHHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhoak_vdark_oak"), new BlockItem(ModBlocks.darkoakHHOakVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhoak_vdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHOakVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhoak_vvoak"), new BlockItem(ModBlocks.darkoakHHOakVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvoak"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvoak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvoak"), new BlockItem(ModBlocks.darkoakHHDarkoakVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvoak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak"), new BlockItem(ModBlocks.darkoakHHHOakVVVVDarkoakVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHHOakVVVVDarkoakVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhoak_xxoak"), new BlockItem(ModBlocks.darkoakHHOakXXOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvoak"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhdark_oak"), new BlockItem(ModBlocks.oakHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhdark_oak"), new BlockItem(ModBlocks.oakHHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhdark_oak_voak"), new BlockItem(ModBlocks.oakHHDarkoakVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhdark_oak_voak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHDarkoakVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhdark_oak_vvdark_oak"), new BlockItem(ModBlocks.oakHHDarkoakVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvdark_oak"), new BlockItem(ModBlocks.oakHHOakVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvdark_oak"), new BlockItem(ModBlocks.oakHHOakVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhdark_oak_vvvvoak_vvvvoak"), new BlockItem(ModBlocks.oakHHHDarkoakVVVVOakVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhdark_oak_vvvvoak_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHHDarkoakVVVVOakVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhdark_oak_xxdark_oak"), new BlockItem(ModBlocks.oakHHDarkoakXXDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvdark_oak"), new BlockItem(ModBlocks.oakHHOakVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhjungle"), new BlockItem(ModBlocks.darkoakHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhjungle"), new BlockItem(ModBlocks.darkoakHHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_vdark_oak"), new BlockItem(ModBlocks.darkoakHHJungleVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_vdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHJungleVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_vvjungle"), new BlockItem(ModBlocks.darkoakHHJungleVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvjungle"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvjungle"), new BlockItem(ModBlocks.darkoakHHDarkoakVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvjungle_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak"), new BlockItem(ModBlocks.darkoakHHHJungleVVVVDarkoakVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_xxjungle"), new BlockItem(ModBlocks.darkoakHHJungleXXJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvjungle"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhdark_oak"), new BlockItem(ModBlocks.jungleHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhdark_oak"), new BlockItem(ModBlocks.jungleHHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_vjungle"), new BlockItem(ModBlocks.jungleHHDarkoakVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_vjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHDarkoakVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_vvdark_oak"), new BlockItem(ModBlocks.jungleHHDarkoakVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvdark_oak"), new BlockItem(ModBlocks.jungleHHJungleVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvdark_oak"), new BlockItem(ModBlocks.jungleHHJungleVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhdark_oak_vvvvjungle_vvvvjungle"), new BlockItem(ModBlocks.jungleHHHDarkoakVVVVJungleVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhdark_oak_vvvvjungle_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHHDarkoakVVVVJungleVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_xxdark_oak"), new BlockItem(ModBlocks.jungleHHDarkoakXXDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvdark_oak"), new BlockItem(ModBlocks.jungleHHJungleVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhjungle"), new BlockItem(ModBlocks.acaciaHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhhjungle"), new BlockItem(ModBlocks.acaciaHHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhjungle_vacacia"), new BlockItem(ModBlocks.acaciaHHJungleVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhjungle_vacacia_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHJungleVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhjungle_vvjungle"), new BlockItem(ModBlocks.acaciaHHJungleVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvjungle"), new BlockItem(ModBlocks.acaciaHHAcaciaVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHAcaciaVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvjungle"), new BlockItem(ModBlocks.acaciaHHAcaciaVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvjungle_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHAcaciaVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhhjungle_vvvvacacia_vvvvacacia"), new BlockItem(ModBlocks.acaciaHHHJungleVVVVAcaciaVVVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhhjungle_vvvvacacia_vvvvacacia_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhjungle_xxjungle"), new BlockItem(ModBlocks.acaciaHHJungleXXJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvjungle"), new BlockItem(ModBlocks.acaciaHHAcaciaVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHAcaciaVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhacacia"), new BlockItem(ModBlocks.jungleHHAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhacacia"), new BlockItem(ModBlocks.jungleHHHAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhacacia_vjungle"), new BlockItem(ModBlocks.jungleHHAcaciaVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhacacia_vjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHAcaciaVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhacacia_vvacacia"), new BlockItem(ModBlocks.jungleHHAcaciaVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvacacia"), new BlockItem(ModBlocks.jungleHHJungleVVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvacacia_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvacacia"), new BlockItem(ModBlocks.jungleHHJungleVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvacacia_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhacacia_vvvvjungle_vvvvjungle"), new BlockItem(ModBlocks.jungleHHHAcaciaVVVVJungleVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhacacia_vvvvjungle_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHHAcaciaVVVVJungleVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhacacia_xxacacia"), new BlockItem(ModBlocks.jungleHHAcaciaXXAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvacacia"), new BlockItem(ModBlocks.jungleHHJungleVVVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvacacia_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhbirch"), new BlockItem(ModBlocks.acaciaHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhhbirch"), new BlockItem(ModBlocks.acaciaHHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhbirch_vacacia"), new BlockItem(ModBlocks.acaciaHHBirchVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhbirch_vacacia_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHBirchVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhbirch_vvbirch"), new BlockItem(ModBlocks.acaciaHHBirchVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvbirch"), new BlockItem(ModBlocks.acaciaHHAcaciaVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHAcaciaVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvbirch"), new BlockItem(ModBlocks.acaciaHHAcaciaVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvbirch_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHAcaciaVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhhbirch_vvvvacacia_vvvvacacia"), new BlockItem(ModBlocks.acaciaHHHBirchVVVVAcaciaVVVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhhbirch_vvvvacacia_vvvvacacia_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhbirch_xxbirch"), new BlockItem(ModBlocks.acaciaHHBirchXXBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvbirch"), new BlockItem(ModBlocks.acaciaHHAcaciaVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.acaciaHHAcaciaVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhacacia"), new BlockItem(ModBlocks.birchHHAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhacacia"), new BlockItem(ModBlocks.birchHHHAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhacacia_vbirch"), new BlockItem(ModBlocks.birchHHAcaciaVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhacacia_vbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHAcaciaVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhacacia_vvacacia"), new BlockItem(ModBlocks.birchHHAcaciaVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvacacia"), new BlockItem(ModBlocks.birchHHBirchVVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvacacia_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvacacia"), new BlockItem(ModBlocks.birchHHBirchVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvacacia_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhacacia_vvvvbirch_vvvvbirch"), new BlockItem(ModBlocks.birchHHHAcaciaVVVVBirchVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhacacia_vvvvbirch_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHHAcaciaVVVVBirchVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhacacia_xxacacia"), new BlockItem(ModBlocks.birchHHAcaciaXXAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvacacia"), new BlockItem(ModBlocks.birchHHBirchVVVVAcacia, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvacacia_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVVAcaciaGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhbirch"), new BlockItem(ModBlocks.jungleHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhbirch"), new BlockItem(ModBlocks.jungleHHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhbirch_vjungle"), new BlockItem(ModBlocks.jungleHHBirchVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhbirch_vjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHBirchVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhbirch_vvbirch"), new BlockItem(ModBlocks.jungleHHBirchVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvbirch"), new BlockItem(ModBlocks.jungleHHJungleVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvbirch"), new BlockItem(ModBlocks.jungleHHJungleVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvbirch_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhbirch_vvvvjungle_vvvvjungle"), new BlockItem(ModBlocks.jungleHHHBirchVVVVJungleVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhbirch_vvvvjungle_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHHBirchVVVVJungleVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhbirch_xxbirch"), new BlockItem(ModBlocks.jungleHHBirchXXBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvbirch"), new BlockItem(ModBlocks.jungleHHJungleVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhjungle"), new BlockItem(ModBlocks.birchHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhjungle"), new BlockItem(ModBlocks.birchHHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhjungle_vbirch"), new BlockItem(ModBlocks.birchHHJungleVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhjungle_vbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHJungleVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhjungle_vvjungle"), new BlockItem(ModBlocks.birchHHJungleVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvjungle"), new BlockItem(ModBlocks.birchHHBirchVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvjungle"), new BlockItem(ModBlocks.birchHHBirchVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvjungle_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhjungle_vvvvbirch_vvvvbirch"), new BlockItem(ModBlocks.birchHHHJungleVVVVBirchVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhjungle_vvvvbirch_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHHJungleVVVVBirchVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhjungle_xxjungle"), new BlockItem(ModBlocks.birchHHJungleXXJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvjungle"), new BlockItem(ModBlocks.birchHHBirchVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhbirch"), new BlockItem(ModBlocks.warpedHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhbirch"), new BlockItem(ModBlocks.warpedHHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhbirch_vwarped"), new BlockItem(ModBlocks.warpedHHBirchVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhbirch_vwarped_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHBirchVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhbirch_vvbirch"), new BlockItem(ModBlocks.warpedHHBirchVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvbirch"), new BlockItem(ModBlocks.warpedHHWarpedVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvbirch"), new BlockItem(ModBlocks.warpedHHWarpedVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvbirch_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhbirch_vvvvwarped_vvvvwarped"), new BlockItem(ModBlocks.warpedHHHBirchVVVVWarpedVVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhbirch_vvvvwarped_vvvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHHBirchVVVVWarpedVVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhbirch_xxbirch"), new BlockItem(ModBlocks.warpedHHBirchXXBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvbirch"), new BlockItem(ModBlocks.warpedHHWarpedVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhwarped"), new BlockItem(ModBlocks.birchHHWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhwarped"), new BlockItem(ModBlocks.birchHHHWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhwarped_vbirch"), new BlockItem(ModBlocks.birchHHWarpedVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhwarped_vbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHWarpedVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhwarped_vvwarped"), new BlockItem(ModBlocks.birchHHWarpedVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvwarped"), new BlockItem(ModBlocks.birchHHBirchVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvwarped"), new BlockItem(ModBlocks.birchHHBirchVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvwarped_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhwarped_vvvvbirch_vvvvbirch"), new BlockItem(ModBlocks.birchHHHWarpedVVVVBirchVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhwarped_vvvvbirch_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHHWarpedVVVVBirchVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhwarped_xxwarped"), new BlockItem(ModBlocks.birchHHWarpedXXWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvwarped"), new BlockItem(ModBlocks.birchHHBirchVVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhoak"), new BlockItem(ModBlocks.warpedHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhoak"), new BlockItem(ModBlocks.warpedHHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhoak_vwarped"), new BlockItem(ModBlocks.warpedHHOakVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhoak_vwarped_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHOakVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhoak_vvoak"), new BlockItem(ModBlocks.warpedHHOakVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvoak"), new BlockItem(ModBlocks.warpedHHWarpedVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvoak_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvoak"), new BlockItem(ModBlocks.warpedHHWarpedVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvoak_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhoak_vvvvwarped_vvvvwarped"), new BlockItem(ModBlocks.warpedHHHOakVVVVWarpedVVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhoak_vvvvwarped_vvvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHHOakVVVVWarpedVVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhoak_xxoak"), new BlockItem(ModBlocks.warpedHHOakXXOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvoak"), new BlockItem(ModBlocks.warpedHHWarpedVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhwarped"), new BlockItem(ModBlocks.oakHHWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhwarped"), new BlockItem(ModBlocks.oakHHHWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhwarped_voak"), new BlockItem(ModBlocks.oakHHWarpedVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhwarped_voak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHWarpedVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhwarped_vvwarped"), new BlockItem(ModBlocks.oakHHWarpedVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvwarped"), new BlockItem(ModBlocks.oakHHOakVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvwarped"), new BlockItem(ModBlocks.oakHHOakVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvwarped_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhwarped_vvvvoak_vvvvoak"), new BlockItem(ModBlocks.oakHHHWarpedVVVVOakVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhwarped_vvvvoak_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHHWarpedVVVVOakVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhwarped_xxwarped"), new BlockItem(ModBlocks.oakHHWarpedXXWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvwarped"), new BlockItem(ModBlocks.oakHHOakVVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhspruce"), new BlockItem(ModBlocks.warpedHHSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhspruce"), new BlockItem(ModBlocks.warpedHHHSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhspruce_vwarped"), new BlockItem(ModBlocks.warpedHHSpruceVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhspruce_vwarped_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHSpruceVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhspruce_vvspruce"), new BlockItem(ModBlocks.warpedHHSpruceVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvspruce"), new BlockItem(ModBlocks.warpedHHWarpedVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvspruce"), new BlockItem(ModBlocks.warpedHHWarpedVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvspruce_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhspruce_vvvvwarped_vvvvwarped"), new BlockItem(ModBlocks.warpedHHHSpruceVVVVWarpedVVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhspruce_vvvvwarped_vvvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHHSpruceVVVVWarpedVVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhspruce_xxspruce"), new BlockItem(ModBlocks.warpedHHSpruceXXSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvspruce"), new BlockItem(ModBlocks.warpedHHWarpedVVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhwarped"), new BlockItem(ModBlocks.spruceHHWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhwarped"), new BlockItem(ModBlocks.spruceHHHWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhwarped_vspruce"), new BlockItem(ModBlocks.spruceHHWarpedVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhwarped_vspruce_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHWarpedVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhwarped_vvwarped"), new BlockItem(ModBlocks.spruceHHWarpedVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvwarped"), new BlockItem(ModBlocks.spruceHHSpruceVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvwarped"), new BlockItem(ModBlocks.spruceHHSpruceVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvwarped_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhwarped_vvvvspruce_vvvvspruce"), new BlockItem(ModBlocks.spruceHHHWarpedVVVVSpruceVVVVSpruce, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhhwarped_vvvvspruce_vvvvspruce_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHHWarpedVVVVSpruceVVVVSpruceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhwarped_xxwarped"), new BlockItem(ModBlocks.spruceHHWarpedXXWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvwarped"), new BlockItem(ModBlocks.spruceHHSpruceVVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.spruceHHSpruceVVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhjungle"), new BlockItem(ModBlocks.crimsonHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhhjungle"), new BlockItem(ModBlocks.crimsonHHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhjungle_vcrimson"), new BlockItem(ModBlocks.crimsonHHJungleVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhjungle_vcrimson_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHJungleVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhjungle_vvjungle"), new BlockItem(ModBlocks.crimsonHHJungleVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvjungle"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvjungle"), new BlockItem(ModBlocks.crimsonHHCrimsonVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvjungle_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHCrimsonVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhhjungle_vvvvcrimson_vvvvcrimson"), new BlockItem(ModBlocks.crimsonHHHJungleVVVVCrimsonVVVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhhjungle_vvvvcrimson_vvvvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhjungle_xxjungle"), new BlockItem(ModBlocks.crimsonHHJungleXXJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvjungle"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhcrimson"), new BlockItem(ModBlocks.jungleHHCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhcrimson"), new BlockItem(ModBlocks.jungleHHHCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhcrimson_vjungle"), new BlockItem(ModBlocks.jungleHHCrimsonVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhcrimson_vjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHCrimsonVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhcrimson_vvcrimson"), new BlockItem(ModBlocks.jungleHHCrimsonVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvcrimson"), new BlockItem(ModBlocks.jungleHHJungleVVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvcrimson"), new BlockItem(ModBlocks.jungleHHJungleVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhcrimson_vvvvjungle_vvvvjungle"), new BlockItem(ModBlocks.jungleHHHCrimsonVVVVJungleVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhcrimson_vvvvjungle_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHHCrimsonVVVVJungleVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhcrimson_xxcrimson"), new BlockItem(ModBlocks.jungleHHCrimsonXXCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvcrimson"), new BlockItem(ModBlocks.jungleHHJungleVVVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhoak"), new BlockItem(ModBlocks.crimsonHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhhoak"), new BlockItem(ModBlocks.crimsonHHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhoak_vcrimson"), new BlockItem(ModBlocks.crimsonHHOakVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhoak_vcrimson_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHOakVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhoak_vvoak"), new BlockItem(ModBlocks.crimsonHHOakVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvoak"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvoak_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvoak"), new BlockItem(ModBlocks.crimsonHHCrimsonVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvoak_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHCrimsonVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhhoak_vvvvcrimson_vvvvcrimson"), new BlockItem(ModBlocks.crimsonHHHOakVVVVCrimsonVVVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhhoak_vvvvcrimson_vvvvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHHOakVVVVCrimsonVVVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhoak_xxoak"), new BlockItem(ModBlocks.crimsonHHOakXXOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvoak"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhcrimson"), new BlockItem(ModBlocks.oakHHCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhcrimson"), new BlockItem(ModBlocks.oakHHHCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhcrimson_voak"), new BlockItem(ModBlocks.oakHHCrimsonVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhcrimson_voak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHCrimsonVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhcrimson_vvcrimson"), new BlockItem(ModBlocks.oakHHCrimsonVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvcrimson"), new BlockItem(ModBlocks.oakHHOakVVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvcrimson"), new BlockItem(ModBlocks.oakHHOakVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhcrimson_vvvvoak_vvvvoak"), new BlockItem(ModBlocks.oakHHHCrimsonVVVVOakVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhcrimson_vvvvoak_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHHCrimsonVVVVOakVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhcrimson_xxcrimson"), new BlockItem(ModBlocks.oakHHCrimsonXXCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvcrimson"), new BlockItem(ModBlocks.oakHHOakVVVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhdark_oak"), new BlockItem(ModBlocks.crimsonHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhhdark_oak"), new BlockItem(ModBlocks.crimsonHHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_vcrimson"), new BlockItem(ModBlocks.crimsonHHDarkoakVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_vcrimson_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHDarkoakVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_vvdark_oak"), new BlockItem(ModBlocks.crimsonHHDarkoakVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvdark_oak"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvdark_oak"), new BlockItem(ModBlocks.crimsonHHCrimsonVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHCrimsonVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson"), new BlockItem(ModBlocks.crimsonHHHDarkoakVVVVCrimsonVVVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_xxdark_oak"), new BlockItem(ModBlocks.crimsonHHDarkoakXXDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvdark_oak"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.crimsonHHCrimsonVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson"), new BlockItem(ModBlocks.darkoakHHCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhcrimson"), new BlockItem(ModBlocks.darkoakHHHCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_vdark_oak"), new BlockItem(ModBlocks.darkoakHHCrimsonVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_vdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHCrimsonVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_vvcrimson"), new BlockItem(ModBlocks.darkoakHHCrimsonVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvcrimson"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvcrimson"), new BlockItem(ModBlocks.darkoakHHDarkoakVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak"), new BlockItem(ModBlocks.darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_xxcrimson"), new BlockItem(ModBlocks.darkoakHHCrimsonXXCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvcrimson"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVCrimson, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvcrimson_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVCrimsonGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhoak"), new BlockItem(ModBlocks.mangroveHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhoak"), new BlockItem(ModBlocks.mangroveHHHOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhoak_vmangrove"), new BlockItem(ModBlocks.mangroveHHOakVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhoak_vmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHOakVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhoak_vvoak"), new BlockItem(ModBlocks.mangroveHHOakVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvoak"), new BlockItem(ModBlocks.mangroveHHMangroveVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvoak_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvoak"), new BlockItem(ModBlocks.mangroveHHMangroveVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvoak_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhoak_vvvvmangrove_vvvvmangrove"), new BlockItem(ModBlocks.mangroveHHHOakVVVVMangroveVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhoak_vvvvmangrove_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHHOakVVVVMangroveVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhoak_xxoak"), new BlockItem(ModBlocks.mangroveHHOakXXOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvoak"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhmangrove"), new BlockItem(ModBlocks.oakHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhmangrove"), new BlockItem(ModBlocks.oakHHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhmangrove_voak"), new BlockItem(ModBlocks.oakHHMangroveVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhmangrove_voak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHMangroveVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhmangrove_vvmangrove"), new BlockItem(ModBlocks.oakHHMangroveVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvmangrove"), new BlockItem(ModBlocks.oakHHOakVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvmangrove"), new BlockItem(ModBlocks.oakHHOakVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhmangrove_vvvvoak_vvvvoak"), new BlockItem(ModBlocks.oakHHHMangroveVVVVOakVVVVOak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhhmangrove_vvvvoak_vvvvoak_fence_gate_closed"), new BlockItem(ModBlocks.oakHHHMangroveVVVVOakVVVVOakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhmangrove_xxmangrove"), new BlockItem(ModBlocks.oakHHMangroveXXMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvmangrove"), new BlockItem(ModBlocks.oakHHOakVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.oakHHOakVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhbirch"), new BlockItem(ModBlocks.mangroveHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhbirch"), new BlockItem(ModBlocks.mangroveHHHBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhbirch_vmangrove"), new BlockItem(ModBlocks.mangroveHHBirchVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhbirch_vmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHBirchVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhbirch_vvbirch"), new BlockItem(ModBlocks.mangroveHHBirchVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvbirch"), new BlockItem(ModBlocks.mangroveHHMangroveVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvbirch"), new BlockItem(ModBlocks.mangroveHHMangroveVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvbirch_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhbirch_vvvvmangrove_vvvvmangrove"), new BlockItem(ModBlocks.mangroveHHHBirchVVVVMangroveVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhbirch_vvvvmangrove_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHHBirchVVVVMangroveVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhbirch_xxbirch"), new BlockItem(ModBlocks.mangroveHHBirchXXBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvbirch"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhmangrove"), new BlockItem(ModBlocks.birchHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhmangrove"), new BlockItem(ModBlocks.birchHHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhmangrove_vbirch"), new BlockItem(ModBlocks.birchHHMangroveVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhmangrove_vbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHMangroveVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhmangrove_vvmangrove"), new BlockItem(ModBlocks.birchHHMangroveVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvmangrove"), new BlockItem(ModBlocks.birchHHBirchVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvmangrove"), new BlockItem(ModBlocks.birchHHBirchVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhmangrove_vvvvbirch_vvvvbirch"), new BlockItem(ModBlocks.birchHHHMangroveVVVVBirchVVVVBirch, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhhmangrove_vvvvbirch_vvvvbirch_fence_gate_closed"), new BlockItem(ModBlocks.birchHHHMangroveVVVVBirchVVVVBirchGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhmangrove_xxmangrove"), new BlockItem(ModBlocks.birchHHMangroveXXMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvmangrove"), new BlockItem(ModBlocks.birchHHBirchVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.birchHHBirchVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhjungle"), new BlockItem(ModBlocks.mangroveHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhjungle"), new BlockItem(ModBlocks.mangroveHHHJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhjungle_vmangrove"), new BlockItem(ModBlocks.mangroveHHJungleVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhjungle_vmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHJungleVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhjungle_vvjungle"), new BlockItem(ModBlocks.mangroveHHJungleVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvjungle"), new BlockItem(ModBlocks.mangroveHHMangroveVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvjungle"), new BlockItem(ModBlocks.mangroveHHMangroveVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvjungle_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhjungle_vvvvmangrove_vvvvmangrove"), new BlockItem(ModBlocks.mangroveHHHJungleVVVVMangroveVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhjungle_vvvvmangrove_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHHJungleVVVVMangroveVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhjungle_xxjungle"), new BlockItem(ModBlocks.mangroveHHJungleXXJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvjungle"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhmangrove"), new BlockItem(ModBlocks.jungleHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhmangrove"), new BlockItem(ModBlocks.jungleHHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhmangrove_vjungle"), new BlockItem(ModBlocks.jungleHHMangroveVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhmangrove_vjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHMangroveVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhmangrove_vvmangrove"), new BlockItem(ModBlocks.jungleHHMangroveVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvmangrove"), new BlockItem(ModBlocks.jungleHHJungleVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvmangrove"), new BlockItem(ModBlocks.jungleHHJungleVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhmangrove_vvvvjungle_vvvvjungle"), new BlockItem(ModBlocks.jungleHHHMangroveVVVVJungleVVVVJungle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhhmangrove_vvvvjungle_vvvvjungle_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHHMangroveVVVVJungleVVVVJungleGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhmangrove_xxmangrove"), new BlockItem(ModBlocks.jungleHHMangroveXXMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvmangrove"), new BlockItem(ModBlocks.jungleHHJungleVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.jungleHHJungleVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak"), new BlockItem(ModBlocks.mangroveHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhdark_oak"), new BlockItem(ModBlocks.mangroveHHHDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak_vmangrove"), new BlockItem(ModBlocks.mangroveHHDarkoakVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak_vmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHDarkoakVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak_vvdark_oak"), new BlockItem(ModBlocks.mangroveHHDarkoakVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvdark_oak"), new BlockItem(ModBlocks.mangroveHHMangroveVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvdark_oak"), new BlockItem(ModBlocks.mangroveHHMangroveVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove"), new BlockItem(ModBlocks.mangroveHHHDarkoakVVVVMangroveVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHHDarkoakVVVVMangroveVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak_xxdark_oak"), new BlockItem(ModBlocks.mangroveHHDarkoakXXDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvdark_oak"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove"), new BlockItem(ModBlocks.darkoakHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhmangrove"), new BlockItem(ModBlocks.darkoakHHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove_vdark_oak"), new BlockItem(ModBlocks.darkoakHHMangroveVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove_vdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHMangroveVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove_vvmangrove"), new BlockItem(ModBlocks.darkoakHHMangroveVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvmangrove"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvmangrove"), new BlockItem(ModBlocks.darkoakHHDarkoakVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak"), new BlockItem(ModBlocks.darkoakHHHMangroveVVVVDarkoakVVVVDarkoak, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHHMangroveVVVVDarkoakVVVVDarkoakGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove_xxmangrove"), new BlockItem(ModBlocks.darkoakHHMangroveXXMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvmangrove"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.darkoakHHDarkoakVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhwarped"), new BlockItem(ModBlocks.mangroveHHWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhwarped"), new BlockItem(ModBlocks.mangroveHHHWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhwarped_vmangrove"), new BlockItem(ModBlocks.mangroveHHWarpedVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhwarped_vmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHWarpedVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhwarped_vvwarped"), new BlockItem(ModBlocks.mangroveHHWarpedVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvwarped"), new BlockItem(ModBlocks.mangroveHHMangroveVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvwarped"), new BlockItem(ModBlocks.mangroveHHMangroveVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvwarped_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhwarped_vvvvmangrove_vvvvmangrove"), new BlockItem(ModBlocks.mangroveHHHWarpedVVVVMangroveVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhhwarped_vvvvmangrove_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHHWarpedVVVVMangroveVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhwarped_xxwarped"), new BlockItem(ModBlocks.mangroveHHWarpedXXWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvwarped"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.mangroveHHMangroveVVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhmangrove"), new BlockItem(ModBlocks.warpedHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhmangrove"), new BlockItem(ModBlocks.warpedHHHMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhmangrove_vwarped"), new BlockItem(ModBlocks.warpedHHMangroveVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhmangrove_vwarped_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHMangroveVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhmangrove_vvmangrove"), new BlockItem(ModBlocks.warpedHHMangroveVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvmangrove"), new BlockItem(ModBlocks.warpedHHWarpedVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvmangrove"), new BlockItem(ModBlocks.warpedHHWarpedVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhmangrove_vvvvwarped_vvvvwarped"), new BlockItem(ModBlocks.warpedHHHMangroveVVVVWarpedVVVVWarped, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhhmangrove_vvvvwarped_vvvvwarped_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHHMangroveVVVVWarpedVVVVWarpedGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhmangrove_xxmangrove"), new BlockItem(ModBlocks.warpedHHMangroveXXMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvmangrove"), new BlockItem(ModBlocks.warpedHHWarpedVVVVMangrove, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvmangrove_fence_gate_closed"), new BlockItem(ModBlocks.warpedHHWarpedVVVVMangroveGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_modern"), new BlockItem(ModBlocks.cobblestoneModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_building"), new BlockItem(ModBlocks.cobblestoneBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_castle"), new BlockItem(ModBlocks.cobblestoneCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mossy_cobblestone_modern"), new BlockItem(ModBlocks.mossyCobblestoneModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mossy_cobblestone_building"), new BlockItem(ModBlocks.mossyCobblestoneBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mossy_cobblestone_castle"), new BlockItem(ModBlocks.mossyCobblestoneCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "stone_modern"), new BlockItem(ModBlocks.stoneModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "stone_building"), new BlockItem(ModBlocks.stoneBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "stone_castle"), new BlockItem(ModBlocks.stoneCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "stone_bricks_modern"), new BlockItem(ModBlocks.stoneBrickModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "stone_bricks_building"), new BlockItem(ModBlocks.stoneBrickBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "stone_bricks_castle"), new BlockItem(ModBlocks.stoneBrickCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mossy_stone_bricks_modern"), new BlockItem(ModBlocks.mossyStoneBrickModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mossy_stone_bricks_building"), new BlockItem(ModBlocks.mossyStoneBrickBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "mossy_stone_bricks_castle"), new BlockItem(ModBlocks.mossyStoneBrickCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "andesite_modern"), new BlockItem(ModBlocks.andesiteModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "andesite_building"), new BlockItem(ModBlocks.andesiteBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "andesite_castle"), new BlockItem(ModBlocks.andesiteCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "diorite_modern"), new BlockItem(ModBlocks.dioriteModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "diorite_building"), new BlockItem(ModBlocks.dioriteBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "diorite_castle"), new BlockItem(ModBlocks.dioriteCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "granite_modern"), new BlockItem(ModBlocks.graniteModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "granite_building"), new BlockItem(ModBlocks.graniteBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "granite_castle"), new BlockItem(ModBlocks.graniteCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sandstone_modern"), new BlockItem(ModBlocks.sandstoneModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sandstone_building"), new BlockItem(ModBlocks.sandstoneBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sandstone_castle"), new BlockItem(ModBlocks.sandstoneCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_sandstone_modern"), new BlockItem(ModBlocks.redSandstoneModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_sandstone_building"), new BlockItem(ModBlocks.redSandstoneBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_sandstone_castle"), new BlockItem(ModBlocks.redSandstoneCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "bricks_modern"), new BlockItem(ModBlocks.bricksModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "bricks_building"), new BlockItem(ModBlocks.bricksBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "bricks_castle"), new BlockItem(ModBlocks.bricksCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "prismarine_modern"), new BlockItem(ModBlocks.prismarineModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "prismarine_building"), new BlockItem(ModBlocks.prismarineBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "prismarine_castle"), new BlockItem(ModBlocks.prismarineCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "nether_bricks_modern"), new BlockItem(ModBlocks.netherBrickModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "nether_bricks_building"), new BlockItem(ModBlocks.netherBrickBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "nether_bricks_castle"), new BlockItem(ModBlocks.netherBrickCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_nether_bricks_modern"), new BlockItem(ModBlocks.redNetherBrickModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_nether_bricks_building"), new BlockItem(ModBlocks.redNetherBrickBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "red_nether_bricks_castle"), new BlockItem(ModBlocks.redNetherBrickCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "end_stone_bricks_modern"), new BlockItem(ModBlocks.endStoneBrickModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "end_stone_bricks_building"), new BlockItem(ModBlocks.endStoneBrickBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "end_stone_bricks_castle"), new BlockItem(ModBlocks.endStoneBrickCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blackstone_modern"), new BlockItem(ModBlocks.blackstoneModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blackstone_building"), new BlockItem(ModBlocks.blackstoneBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "blackstone_castle"), new BlockItem(ModBlocks.blackstoneCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_blackstone_modern"), new BlockItem(ModBlocks.polishedBlackstoneModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_blackstone_building"), new BlockItem(ModBlocks.polishedBlackstoneBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_blackstone_castle"), new BlockItem(ModBlocks.polishedBlackstoneCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_modern"), new BlockItem(ModBlocks.polishedBlackstoneBrickModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_building"), new BlockItem(ModBlocks.polishedBlackstoneBrickBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_castle"), new BlockItem(ModBlocks.polishedBlackstoneBrickCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobbled_deepslate_modern"), new BlockItem(ModBlocks.cobbledDeepslateModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobbled_deepslate_building"), new BlockItem(ModBlocks.cobbledDeepslateBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobbled_deepslate_castle"), new BlockItem(ModBlocks.cobbledDeepslateCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_deepslate_modern"), new BlockItem(ModBlocks.polishedDeepslateModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_deepslate_building"), new BlockItem(ModBlocks.polishedDeepslateBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "polished_deepslate_castle"), new BlockItem(ModBlocks.polishedDeepslateCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "deepslate_brick_modern"), new BlockItem(ModBlocks.deepslateBrickModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "deepslate_brick_building"), new BlockItem(ModBlocks.deepslateBrickBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "deepslate_brick_castle"), new BlockItem(ModBlocks.deepslateBrickCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "deepslate_tile_modern"), new BlockItem(ModBlocks.deepslateTileModern, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "deepslate_tile_building"), new BlockItem(ModBlocks.deepslateTileBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "deepslate_tile_castle"), new BlockItem(ModBlocks.deepslateTileCastle, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oak_wall_building"), new BlockItem(ModBlocks.oakWallBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "birch_wall_building"), new BlockItem(ModBlocks.birchWallBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "spruce_wall_building"), new BlockItem(ModBlocks.spruceWallBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "acacia_wall_building"), new BlockItem(ModBlocks.acaciaWallBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "jungle_wall_building"), new BlockItem(ModBlocks.jungleWallBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_oak_wall_building"), new BlockItem(ModBlocks.darkoakWallBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crimson_wall_building"), new BlockItem(ModBlocks.crimsonWallBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "warped_wall_building"), new BlockItem(ModBlocks.warpedWallBuilding, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_copper_fence"), new BlockItem(ModBlocks.cobblestoneCopperFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_exposed_copper_fence"), new BlockItem(ModBlocks.cobblestoneExposedCopperFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_weathered_copper_fence"), new BlockItem(ModBlocks.cobblestoneWeatheredCopperFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_oxidized_copper_fence"), new BlockItem(ModBlocks.cobblestoneOxidizedCopperFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "copper_fence_gate_closed"), new BlockItem(ModBlocks.copperFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "exposed_copper_fence_gate_closed"), new BlockItem(ModBlocks.exposedCopperFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "weathered_copper_fence_gate_closed"), new BlockItem(ModBlocks.weatheredCopperFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oxidized_copper_fence_gate_closed"), new BlockItem(ModBlocks.oxidizedCopperFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_waxed_copper_fence"), new BlockItem(ModBlocks.cobblestoneWaxedCopperFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_waxed_exposed_copper_fence"), new BlockItem(ModBlocks.cobblestoneWaxedExposedCopperFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_waxed_weathered_copper_fence"), new BlockItem(ModBlocks.cobblestoneWaxedWeatheredCopperFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_waxed_oxidized_copper_fence"), new BlockItem(ModBlocks.cobblestoneWaxedOxidizedCopperFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "waxed_copper_fence_gate_closed"), new BlockItem(ModBlocks.waxedCopperFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "waxed_exposed_copper_fence_gate_closed"), new BlockItem(ModBlocks.waxedExposedCopperFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "waxed_weathered_copper_fence_gate_closed"), new BlockItem(ModBlocks.waxedWeatheredCopperFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "waxed_oxidized_copper_fence_gate_closed"), new BlockItem(ModBlocks.waxedOxidizedCopperFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_iron_fence"), new BlockItem(ModBlocks.cobblestoneIronFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_exposed_iron_fence"), new BlockItem(ModBlocks.cobblestoneExposedIronFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_weathered_iron_fence"), new BlockItem(ModBlocks.cobblestoneWeatheredIronFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_oxidized_iron_fence"), new BlockItem(ModBlocks.cobblestoneOxidizedIronFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "iron_fence_gate_closed"), new BlockItem(ModBlocks.ironFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "exposed_iron_fence_gate_closed"), new BlockItem(ModBlocks.exposedIronFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "weathered_iron_fence_gate_closed"), new BlockItem(ModBlocks.weatheredIronFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "oxidized_iron_fence_gate_closed"), new BlockItem(ModBlocks.oxidizedIronFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_waxed_iron_fence"), new BlockItem(ModBlocks.cobblestoneWaxedIronFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_waxed_exposed_iron_fence"), new BlockItem(ModBlocks.cobblestoneWaxedExposedIronFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_waxed_weathered_iron_fence"), new BlockItem(ModBlocks.cobblestoneWaxedWeatheredIronFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_waxed_oxidized_iron_fence"), new BlockItem(ModBlocks.cobblestoneWaxedOxidizedIronFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "waxed_iron_fence_gate_closed"), new BlockItem(ModBlocks.waxedIronFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "waxed_exposed_iron_fence_gate_closed"), new BlockItem(ModBlocks.waxedExposedIronFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "waxed_weathered_iron_fence_gate_closed"), new BlockItem(ModBlocks.waxedWeatheredIronFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "waxed_oxidized_iron_fence_gate_closed"), new BlockItem(ModBlocks.waxedOxidizedIronFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cobblestone_gold_fence"), new BlockItem(ModBlocks.cobblestoneGoldFence, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gold_fence_gate_closed"), new BlockItem(ModBlocks.goldFenceGate, new BlockItem.Settings().group(ModItemGroup.CUSTOMFENCE)));

    }


}
