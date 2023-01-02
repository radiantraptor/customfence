package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Field;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> HHOakGate = ITEMS.register("hhoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHOakGate = ITEMS.register("hhhoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHOakVVOakGate = ITEMS.register("hhoak_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHOakVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHOakXXOakGate = ITEMS.register("hhoak_xxoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHOakXXOakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> HHBirchGate = ITEMS.register("hhbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHBirchGate = ITEMS.register("hhhbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHBirchVVBirchGate = ITEMS.register("hhbirch_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHBirchVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHBirchXXBirchGate = ITEMS.register("hhbirch_xxbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHBirchXXBirchGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> HHSpruceGate = ITEMS.register("hhspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHSpruceGate = ITEMS.register("hhhspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHSpruceVVSpruceGate = ITEMS.register("hhspruce_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHSpruceVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHSpruceXXSpruceGate = ITEMS.register("hhspruce_xxspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHSpruceXXSpruceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> HHJungleGate = ITEMS.register("hhjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHJungleGate = ITEMS.register("hhhjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHJungleVVJungleGate = ITEMS.register("hhjungle_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHJungleVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHJungleXXJungleGate = ITEMS.register("hhjungle_xxjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHJungleXXJungleGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> HHAcaciaGate = ITEMS.register("hhacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHAcaciaGate = ITEMS.register("hhhacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHAcaciaVVAcaciaGate = ITEMS.register("hhacacia_vvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHAcaciaVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHAcaciaXXAcaciaGate = ITEMS.register("hhacacia_xxacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHAcaciaXXAcaciaGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> HHDarkoakGate = ITEMS.register("hhdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHDarkoakGate = ITEMS.register("hhhdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHDarkoakVVDarkoakGate = ITEMS.register("hhdark_oak_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHDarkoakVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHDarkoakXXDarkoakGate = ITEMS.register("hhdark_oak_xxdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHDarkoakXXDarkoakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> HHWarpedGate = ITEMS.register("hhwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHWarpedGate = ITEMS.register("hhhwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHWarpedVVWarpedGate = ITEMS.register("hhwarped_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHWarpedVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHWarpedXXWarpedGate = ITEMS.register("hhwarped_xxwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHWarpedXXWarpedGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> HHCrimsonGate = ITEMS.register("hhcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHCrimsonGate = ITEMS.register("hhhcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHCrimsonVVCrimsonGate = ITEMS.register("hhcrimson_vvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHCrimsonVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHCrimsonXXCrimsonGate = ITEMS.register("hhcrimson_xxcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHCrimsonXXCrimsonGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> HHMangroveGate = ITEMS.register("hhmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHMangroveGate = ITEMS.register("hhhmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHMangroveVVMangroveGate = ITEMS.register("hhmangrove_vvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHMangroveVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHMangroveXXMangroveGate = ITEMS.register("hhmangrove_xxmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHMangroveXXMangroveGate.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> HHBambooGate = ITEMS.register("hhbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHHBambooGate = ITEMS.register("hhhbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHHBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHBambooVVBambooGate = ITEMS.register("hhbamboo_vvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHBambooVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> HHBambooXXBambooGate = ITEMS.register("hhbamboo_xxbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.HHBambooXXBambooGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> spruceHHOak = ITEMS.register("spruce_hhoak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHOak = ITEMS.register("spruce_hhhoak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHOakVSpruce = ITEMS.register("spruce_hhoak_vspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHOakVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHOakVSpruceGate = ITEMS.register("spruce_hhoak_vspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHOakVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHOakVVOak = ITEMS.register("spruce_hhoak_vvoak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHOakVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVOak = ITEMS.register("spruce_hhspruce_vvvoak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVOakGate = ITEMS.register("spruce_hhspruce_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVOak = ITEMS.register("spruce_hhspruce_vvoak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVOakGate = ITEMS.register("spruce_hhspruce_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHOakVVVVSpruceVVVVSpruce = ITEMS.register("spruce_hhhoak_vvvvspruce_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHOakVVVVSpruceVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHOakVVVVSpruceVVVVSpruceGate = ITEMS.register("spruce_hhhoak_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHOakVVVVSpruceVVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHOakXXOak = ITEMS.register("spruce_hhoak_xxoak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHOakXXOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVOak = ITEMS.register("spruce_hhspruce_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVOakGate = ITEMS.register("spruce_hhspruce_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVOakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> oakHHSpruce = ITEMS.register("oak_hhspruce", () -> new BlockItem(ModBlocksWoodenFence.oakHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHSpruce = ITEMS.register("oak_hhhspruce", () -> new BlockItem(ModBlocksWoodenFence.oakHHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHSpruceVOak = ITEMS.register("oak_hhspruce_voak", () -> new BlockItem(ModBlocksWoodenFence.oakHHSpruceVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHSpruceVOakGate = ITEMS.register("oak_hhspruce_voak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHSpruceVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHSpruceVVSpruce = ITEMS.register("oak_hhspruce_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.oakHHSpruceVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVSpruce = ITEMS.register("oak_hhoak_vvvspruce", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVSpruceGate = ITEMS.register("oak_hhoak_vvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVSpruce = ITEMS.register("oak_hhoak_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVSpruceGate = ITEMS.register("oak_hhoak_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHSpruceVVVVOakVVVVOak = ITEMS.register("oak_hhhspruce_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.oakHHHSpruceVVVVOakVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHSpruceVVVVOakVVVVOakGate = ITEMS.register("oak_hhhspruce_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHHSpruceVVVVOakVVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHSpruceXXSpruce = ITEMS.register("oak_hhspruce_xxspruce", () -> new BlockItem(ModBlocksWoodenFence.oakHHSpruceXXSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVSpruce = ITEMS.register("oak_hhoak_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVSpruceGate = ITEMS.register("oak_hhoak_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVSpruceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> oakHHBirch = ITEMS.register("oak_hhbirch", () -> new BlockItem(ModBlocksWoodenFence.oakHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHBirch = ITEMS.register("oak_hhhbirch", () -> new BlockItem(ModBlocksWoodenFence.oakHHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHBirchVOak = ITEMS.register("oak_hhbirch_voak", () -> new BlockItem(ModBlocksWoodenFence.oakHHBirchVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHBirchVOakGate = ITEMS.register("oak_hhbirch_voak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHBirchVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHBirchVVBirch = ITEMS.register("oak_hhbirch_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.oakHHBirchVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVBirch = ITEMS.register("oak_hhoak_vvvbirch", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVBirchGate = ITEMS.register("oak_hhoak_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVBirch = ITEMS.register("oak_hhoak_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVBirchGate = ITEMS.register("oak_hhoak_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHBirchVVVVOakVVVVOak = ITEMS.register("oak_hhhbirch_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.oakHHHBirchVVVVOakVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHBirchVVVVOakVVVVOakGate = ITEMS.register("oak_hhhbirch_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHHBirchVVVVOakVVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHBirchXXBirch = ITEMS.register("oak_hhbirch_xxbirch", () -> new BlockItem(ModBlocksWoodenFence.oakHHBirchXXBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVBirch = ITEMS.register("oak_hhoak_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVBirchGate = ITEMS.register("oak_hhoak_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVBirchGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> birchHHOak = ITEMS.register("birch_hhoak", () -> new BlockItem(ModBlocksWoodenFence.birchHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHOak = ITEMS.register("birch_hhhoak", () -> new BlockItem(ModBlocksWoodenFence.birchHHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHOakVBirch = ITEMS.register("birch_hhoak_vbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHOakVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHOakVBirchGate = ITEMS.register("birch_hhoak_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHOakVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHOakVVOak = ITEMS.register("birch_hhoak_vvoak", () -> new BlockItem(ModBlocksWoodenFence.birchHHOakVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVOak = ITEMS.register("birch_hhbirch_vvvoak", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVOakGate = ITEMS.register("birch_hhbirch_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVOak = ITEMS.register("birch_hhbirch_vvoak", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVOakGate = ITEMS.register("birch_hhbirch_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHOakVVVVBirchVVVVBirch = ITEMS.register("birch_hhhoak_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHHOakVVVVBirchVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHOakVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhoak_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHHOakVVVVBirchVVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHOakXXOak = ITEMS.register("birch_hhoak_xxoak", () -> new BlockItem(ModBlocksWoodenFence.birchHHOakXXOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVOak = ITEMS.register("birch_hhbirch_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVOakGate = ITEMS.register("birch_hhbirch_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVOakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> spruceHHBirch = ITEMS.register("spruce_hhbirch", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHBirch = ITEMS.register("spruce_hhhbirch", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHBirchVSpruce = ITEMS.register("spruce_hhbirch_vspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBirchVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHBirchVSpruceGate = ITEMS.register("spruce_hhbirch_vspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBirchVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHBirchVVBirch = ITEMS.register("spruce_hhbirch_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBirchVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVBirch = ITEMS.register("spruce_hhspruce_vvvbirch", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVBirchGate = ITEMS.register("spruce_hhspruce_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVBirch = ITEMS.register("spruce_hhspruce_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVBirchGate = ITEMS.register("spruce_hhspruce_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHBirchVVVVSpruceVVVVSpruce = ITEMS.register("spruce_hhhbirch_vvvvspruce_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHBirchVVVVSpruceVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHBirchVVVVSpruceVVVVSpruceGate = ITEMS.register("spruce_hhhbirch_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHBirchVVVVSpruceVVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHBirchXXBirch = ITEMS.register("spruce_hhbirch_xxbirch", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBirchXXBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVBirch = ITEMS.register("spruce_hhspruce_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVBirchGate = ITEMS.register("spruce_hhspruce_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVBirchGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> birchHHSpruce = ITEMS.register("birch_hhspruce", () -> new BlockItem(ModBlocksWoodenFence.birchHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHSpruce = ITEMS.register("birch_hhhspruce", () -> new BlockItem(ModBlocksWoodenFence.birchHHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHSpruceVBirch = ITEMS.register("birch_hhspruce_vbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHSpruceVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHSpruceVBirchGate = ITEMS.register("birch_hhspruce_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHSpruceVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHSpruceVVSpruce = ITEMS.register("birch_hhspruce_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.birchHHSpruceVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVSpruce = ITEMS.register("birch_hhbirch_vvvspruce", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVSpruceGate = ITEMS.register("birch_hhbirch_vvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVSpruce = ITEMS.register("birch_hhbirch_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVSpruceGate = ITEMS.register("birch_hhbirch_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHSpruceVVVVBirchVVVVBirch = ITEMS.register("birch_hhhspruce_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHHSpruceVVVVBirchVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHSpruceVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhspruce_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHHSpruceVVVVBirchVVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHSpruceXXSpruce = ITEMS.register("birch_hhspruce_xxspruce", () -> new BlockItem(ModBlocksWoodenFence.birchHHSpruceXXSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVSpruce = ITEMS.register("birch_hhbirch_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVSpruceGate = ITEMS.register("birch_hhbirch_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVSpruceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> darkoakHHSpruce = ITEMS.register("dark_oak_hhspruce", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHSpruce = ITEMS.register("dark_oak_hhhspruce", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHSpruceVDarkoak = ITEMS.register("dark_oak_hhspruce_vdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHSpruceVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHSpruceVDarkoakGate = ITEMS.register("dark_oak_hhspruce_vdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHSpruceVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHSpruceVVSpruce = ITEMS.register("dark_oak_hhspruce_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHSpruceVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVSpruce = ITEMS.register("dark_oak_hhdark_oak_vvvspruce", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVSpruceGate = ITEMS.register("dark_oak_hhdark_oak_vvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVSpruce = ITEMS.register("dark_oak_hhdark_oak_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVSpruceGate = ITEMS.register("dark_oak_hhdark_oak_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHSpruceVVVVDarkoakVVVVDarkoak = ITEMS.register("dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHSpruceVVVVDarkoakVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate = ITEMS.register("dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHSpruceXXSpruce = ITEMS.register("dark_oak_hhspruce_xxspruce", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHSpruceXXSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVSpruce = ITEMS.register("dark_oak_hhdark_oak_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVSpruceGate = ITEMS.register("dark_oak_hhdark_oak_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVSpruceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> spruceHHDarkoak = ITEMS.register("spruce_hhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHDarkoak = ITEMS.register("spruce_hhhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHDarkoakVSpruce = ITEMS.register("spruce_hhdark_oak_vspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHDarkoakVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHDarkoakVSpruceGate = ITEMS.register("spruce_hhdark_oak_vspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHDarkoakVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHDarkoakVVDarkoak = ITEMS.register("spruce_hhdark_oak_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHDarkoakVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVDarkoak = ITEMS.register("spruce_hhspruce_vvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVDarkoakGate = ITEMS.register("spruce_hhspruce_vvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVDarkoak = ITEMS.register("spruce_hhspruce_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVDarkoakGate = ITEMS.register("spruce_hhspruce_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHDarkoakVVVVSpruceVVVVSpruce = ITEMS.register("spruce_hhhdark_oak_vvvvspruce_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHDarkoakVVVVSpruceVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHDarkoakVVVVSpruceVVVVSpruceGate = ITEMS.register("spruce_hhhdark_oak_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHDarkoakVVVVSpruceVVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHDarkoakXXDarkoak = ITEMS.register("spruce_hhdark_oak_xxdark_oak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHDarkoakXXDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVDarkoak = ITEMS.register("spruce_hhspruce_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVDarkoakGate = ITEMS.register("spruce_hhspruce_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVDarkoakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> darkoakHHOak = ITEMS.register("dark_oak_hhoak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHOak = ITEMS.register("dark_oak_hhhoak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHOakVDarkoak = ITEMS.register("dark_oak_hhoak_vdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHOakVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHOakVDarkoakGate = ITEMS.register("dark_oak_hhoak_vdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHOakVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHOakVVOak = ITEMS.register("dark_oak_hhoak_vvoak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHOakVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVOak = ITEMS.register("dark_oak_hhdark_oak_vvvoak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVOakGate = ITEMS.register("dark_oak_hhdark_oak_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVOak = ITEMS.register("dark_oak_hhdark_oak_vvoak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVOakGate = ITEMS.register("dark_oak_hhdark_oak_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHOakVVVVDarkoakVVVVDarkoak = ITEMS.register("dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHOakVVVVDarkoakVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHOakVVVVDarkoakVVVVDarkoakGate = ITEMS.register("dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHOakVVVVDarkoakVVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHOakXXOak = ITEMS.register("dark_oak_hhoak_xxoak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHOakXXOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVOak = ITEMS.register("dark_oak_hhdark_oak_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVOakGate = ITEMS.register("dark_oak_hhdark_oak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVOakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> oakHHDarkoak = ITEMS.register("oak_hhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.oakHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHDarkoak = ITEMS.register("oak_hhhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.oakHHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHDarkoakVOak = ITEMS.register("oak_hhdark_oak_voak", () -> new BlockItem(ModBlocksWoodenFence.oakHHDarkoakVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHDarkoakVOakGate = ITEMS.register("oak_hhdark_oak_voak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHDarkoakVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHDarkoakVVDarkoak = ITEMS.register("oak_hhdark_oak_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.oakHHDarkoakVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVDarkoak = ITEMS.register("oak_hhoak_vvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVDarkoakGate = ITEMS.register("oak_hhoak_vvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVDarkoak = ITEMS.register("oak_hhoak_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVDarkoakGate = ITEMS.register("oak_hhoak_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHDarkoakVVVVOakVVVVOak = ITEMS.register("oak_hhhdark_oak_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.oakHHHDarkoakVVVVOakVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHDarkoakVVVVOakVVVVOakGate = ITEMS.register("oak_hhhdark_oak_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHHDarkoakVVVVOakVVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHDarkoakXXDarkoak = ITEMS.register("oak_hhdark_oak_xxdark_oak", () -> new BlockItem(ModBlocksWoodenFence.oakHHDarkoakXXDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVDarkoak = ITEMS.register("oak_hhoak_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVDarkoakGate = ITEMS.register("oak_hhoak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVDarkoakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> darkoakHHJungle = ITEMS.register("dark_oak_hhjungle", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHJungle = ITEMS.register("dark_oak_hhhjungle", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHJungleVDarkoak = ITEMS.register("dark_oak_hhjungle_vdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHJungleVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHJungleVDarkoakGate = ITEMS.register("dark_oak_hhjungle_vdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHJungleVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHJungleVVJungle = ITEMS.register("dark_oak_hhjungle_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHJungleVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVJungle = ITEMS.register("dark_oak_hhdark_oak_vvvjungle", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVJungleGate = ITEMS.register("dark_oak_hhdark_oak_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVJungle = ITEMS.register("dark_oak_hhdark_oak_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVJungleGate = ITEMS.register("dark_oak_hhdark_oak_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHJungleVVVVDarkoakVVVVDarkoak = ITEMS.register("dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHJungleVVVVDarkoakVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate = ITEMS.register("dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHJungleXXJungle = ITEMS.register("dark_oak_hhjungle_xxjungle", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHJungleXXJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVJungle = ITEMS.register("dark_oak_hhdark_oak_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVJungleGate = ITEMS.register("dark_oak_hhdark_oak_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVJungleGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> jungleHHDarkoak = ITEMS.register("jungle_hhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.jungleHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHDarkoak = ITEMS.register("jungle_hhhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHDarkoakVJungle = ITEMS.register("jungle_hhdark_oak_vjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHDarkoakVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHDarkoakVJungleGate = ITEMS.register("jungle_hhdark_oak_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHDarkoakVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHDarkoakVVDarkoak = ITEMS.register("jungle_hhdark_oak_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.jungleHHDarkoakVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVDarkoak = ITEMS.register("jungle_hhjungle_vvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVDarkoakGate = ITEMS.register("jungle_hhjungle_vvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVDarkoak = ITEMS.register("jungle_hhjungle_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVDarkoakGate = ITEMS.register("jungle_hhjungle_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHDarkoakVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhdark_oak_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHDarkoakVVVVJungleVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHDarkoakVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhdark_oak_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHDarkoakVVVVJungleVVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHDarkoakXXDarkoak = ITEMS.register("jungle_hhdark_oak_xxdark_oak", () -> new BlockItem(ModBlocksWoodenFence.jungleHHDarkoakXXDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVDarkoak = ITEMS.register("jungle_hhjungle_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVDarkoakGate = ITEMS.register("jungle_hhjungle_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVDarkoakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> acaciaHHJungle = ITEMS.register("acacia_hhjungle", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHHJungle = ITEMS.register("acacia_hhhjungle", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHJungleVAcacia = ITEMS.register("acacia_hhjungle_vacacia", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHJungleVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHJungleVAcaciaGate = ITEMS.register("acacia_hhjungle_vacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHJungleVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHJungleVVJungle = ITEMS.register("acacia_hhjungle_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHJungleVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVJungle = ITEMS.register("acacia_hhacacia_vvvjungle", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVJungleGate = ITEMS.register("acacia_hhacacia_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVJungle = ITEMS.register("acacia_hhacacia_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVJungleGate = ITEMS.register("acacia_hhacacia_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHHJungleVVVVAcaciaVVVVAcacia = ITEMS.register("acacia_hhhjungle_vvvvacacia_vvvvacacia", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHHJungleVVVVAcaciaVVVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate = ITEMS.register("acacia_hhhjungle_vvvvacacia_vvvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHJungleXXJungle = ITEMS.register("acacia_hhjungle_xxjungle", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHJungleXXJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVVJungle = ITEMS.register("acacia_hhacacia_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVVJungleGate = ITEMS.register("acacia_hhacacia_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVVJungleGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> jungleHHAcacia = ITEMS.register("jungle_hhacacia", () -> new BlockItem(ModBlocksWoodenFence.jungleHHAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHAcacia = ITEMS.register("jungle_hhhacacia", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHAcaciaVJungle = ITEMS.register("jungle_hhacacia_vjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHAcaciaVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHAcaciaVJungleGate = ITEMS.register("jungle_hhacacia_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHAcaciaVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHAcaciaVVAcacia = ITEMS.register("jungle_hhacacia_vvacacia", () -> new BlockItem(ModBlocksWoodenFence.jungleHHAcaciaVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVAcacia = ITEMS.register("jungle_hhjungle_vvvacacia", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVAcaciaGate = ITEMS.register("jungle_hhjungle_vvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVAcacia = ITEMS.register("jungle_hhjungle_vvacacia", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVAcaciaGate = ITEMS.register("jungle_hhjungle_vvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHAcaciaVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhacacia_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHAcaciaVVVVJungleVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHAcaciaVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhacacia_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHAcaciaVVVVJungleVVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHAcaciaXXAcacia = ITEMS.register("jungle_hhacacia_xxacacia", () -> new BlockItem(ModBlocksWoodenFence.jungleHHAcaciaXXAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVAcacia = ITEMS.register("jungle_hhjungle_vvvvacacia", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVAcaciaGate = ITEMS.register("jungle_hhjungle_vvvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVAcaciaGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> acaciaHHBirch = ITEMS.register("acacia_hhbirch", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHHBirch = ITEMS.register("acacia_hhhbirch", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHBirchVAcacia = ITEMS.register("acacia_hhbirch_vacacia", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBirchVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHBirchVAcaciaGate = ITEMS.register("acacia_hhbirch_vacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBirchVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHBirchVVBirch = ITEMS.register("acacia_hhbirch_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBirchVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVBirch = ITEMS.register("acacia_hhacacia_vvvbirch", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVBirchGate = ITEMS.register("acacia_hhacacia_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVBirch = ITEMS.register("acacia_hhacacia_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVBirchGate = ITEMS.register("acacia_hhacacia_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHHBirchVVVVAcaciaVVVVAcacia = ITEMS.register("acacia_hhhbirch_vvvvacacia_vvvvacacia", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHHBirchVVVVAcaciaVVVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate = ITEMS.register("acacia_hhhbirch_vvvvacacia_vvvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHBirchXXBirch = ITEMS.register("acacia_hhbirch_xxbirch", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBirchXXBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVVBirch = ITEMS.register("acacia_hhacacia_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVVBirchGate = ITEMS.register("acacia_hhacacia_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVVBirchGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> birchHHAcacia = ITEMS.register("birch_hhacacia", () -> new BlockItem(ModBlocksWoodenFence.birchHHAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHAcacia = ITEMS.register("birch_hhhacacia", () -> new BlockItem(ModBlocksWoodenFence.birchHHHAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHAcaciaVBirch = ITEMS.register("birch_hhacacia_vbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHAcaciaVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHAcaciaVBirchGate = ITEMS.register("birch_hhacacia_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHAcaciaVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHAcaciaVVAcacia = ITEMS.register("birch_hhacacia_vvacacia", () -> new BlockItem(ModBlocksWoodenFence.birchHHAcaciaVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVAcacia = ITEMS.register("birch_hhbirch_vvvacacia", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVAcaciaGate = ITEMS.register("birch_hhbirch_vvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVAcacia = ITEMS.register("birch_hhbirch_vvacacia", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVAcaciaGate = ITEMS.register("birch_hhbirch_vvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHAcaciaVVVVBirchVVVVBirch = ITEMS.register("birch_hhhacacia_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHHAcaciaVVVVBirchVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHAcaciaVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhacacia_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHHAcaciaVVVVBirchVVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHAcaciaXXAcacia = ITEMS.register("birch_hhacacia_xxacacia", () -> new BlockItem(ModBlocksWoodenFence.birchHHAcaciaXXAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVAcacia = ITEMS.register("birch_hhbirch_vvvvacacia", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVAcaciaGate = ITEMS.register("birch_hhbirch_vvvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVAcaciaGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> jungleHHBirch = ITEMS.register("jungle_hhbirch", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHBirch = ITEMS.register("jungle_hhhbirch", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHBirchVJungle = ITEMS.register("jungle_hhbirch_vjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBirchVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHBirchVJungleGate = ITEMS.register("jungle_hhbirch_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBirchVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHBirchVVBirch = ITEMS.register("jungle_hhbirch_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBirchVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVBirch = ITEMS.register("jungle_hhjungle_vvvbirch", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVBirchGate = ITEMS.register("jungle_hhjungle_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVBirch = ITEMS.register("jungle_hhjungle_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVBirchGate = ITEMS.register("jungle_hhjungle_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHBirchVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhbirch_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHBirchVVVVJungleVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHBirchVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhbirch_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHBirchVVVVJungleVVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHBirchXXBirch = ITEMS.register("jungle_hhbirch_xxbirch", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBirchXXBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVBirch = ITEMS.register("jungle_hhjungle_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVBirchGate = ITEMS.register("jungle_hhjungle_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVBirchGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> birchHHJungle = ITEMS.register("birch_hhjungle", () -> new BlockItem(ModBlocksWoodenFence.birchHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHJungle = ITEMS.register("birch_hhhjungle", () -> new BlockItem(ModBlocksWoodenFence.birchHHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHJungleVBirch = ITEMS.register("birch_hhjungle_vbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHJungleVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHJungleVBirchGate = ITEMS.register("birch_hhjungle_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHJungleVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHJungleVVJungle = ITEMS.register("birch_hhjungle_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.birchHHJungleVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVJungle = ITEMS.register("birch_hhbirch_vvvjungle", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVJungleGate = ITEMS.register("birch_hhbirch_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVJungle = ITEMS.register("birch_hhbirch_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVJungleGate = ITEMS.register("birch_hhbirch_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHJungleVVVVBirchVVVVBirch = ITEMS.register("birch_hhhjungle_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHHJungleVVVVBirchVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHJungleVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhjungle_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHHJungleVVVVBirchVVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHJungleXXJungle = ITEMS.register("birch_hhjungle_xxjungle", () -> new BlockItem(ModBlocksWoodenFence.birchHHJungleXXJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVJungle = ITEMS.register("birch_hhbirch_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVJungleGate = ITEMS.register("birch_hhbirch_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVJungleGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> warpedHHBirch = ITEMS.register("warped_hhbirch", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHBirch = ITEMS.register("warped_hhhbirch", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHBirchVWarped = ITEMS.register("warped_hhbirch_vwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBirchVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHBirchVWarpedGate = ITEMS.register("warped_hhbirch_vwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBirchVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHBirchVVBirch = ITEMS.register("warped_hhbirch_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBirchVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVBirch = ITEMS.register("warped_hhwarped_vvvbirch", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVBirchGate = ITEMS.register("warped_hhwarped_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVBirch = ITEMS.register("warped_hhwarped_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVBirchGate = ITEMS.register("warped_hhwarped_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHBirchVVVVWarpedVVVVWarped = ITEMS.register("warped_hhhbirch_vvvvwarped_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHBirchVVVVWarpedVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHBirchVVVVWarpedVVVVWarpedGate = ITEMS.register("warped_hhhbirch_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHBirchVVVVWarpedVVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHBirchXXBirch = ITEMS.register("warped_hhbirch_xxbirch", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBirchXXBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVBirch = ITEMS.register("warped_hhwarped_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVBirchGate = ITEMS.register("warped_hhwarped_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVBirchGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> birchHHWarped = ITEMS.register("birch_hhwarped", () -> new BlockItem(ModBlocksWoodenFence.birchHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHWarped = ITEMS.register("birch_hhhwarped", () -> new BlockItem(ModBlocksWoodenFence.birchHHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHWarpedVBirch = ITEMS.register("birch_hhwarped_vbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHWarpedVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHWarpedVBirchGate = ITEMS.register("birch_hhwarped_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHWarpedVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHWarpedVVWarped = ITEMS.register("birch_hhwarped_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.birchHHWarpedVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVWarped = ITEMS.register("birch_hhbirch_vvvwarped", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVWarpedGate = ITEMS.register("birch_hhbirch_vvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVWarped = ITEMS.register("birch_hhbirch_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVWarpedGate = ITEMS.register("birch_hhbirch_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHWarpedVVVVBirchVVVVBirch = ITEMS.register("birch_hhhwarped_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHHWarpedVVVVBirchVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHWarpedVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhwarped_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHHWarpedVVVVBirchVVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHWarpedXXWarped = ITEMS.register("birch_hhwarped_xxwarped", () -> new BlockItem(ModBlocksWoodenFence.birchHHWarpedXXWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVWarped = ITEMS.register("birch_hhbirch_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVWarpedGate = ITEMS.register("birch_hhbirch_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVWarpedGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> warpedHHOak = ITEMS.register("warped_hhoak", () -> new BlockItem(ModBlocksWoodenFence.warpedHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHOak = ITEMS.register("warped_hhhoak", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHOakVWarped = ITEMS.register("warped_hhoak_vwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHOakVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHOakVWarpedGate = ITEMS.register("warped_hhoak_vwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHOakVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHOakVVOak = ITEMS.register("warped_hhoak_vvoak", () -> new BlockItem(ModBlocksWoodenFence.warpedHHOakVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVOak = ITEMS.register("warped_hhwarped_vvvoak", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVOakGate = ITEMS.register("warped_hhwarped_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVOak = ITEMS.register("warped_hhwarped_vvoak", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVOakGate = ITEMS.register("warped_hhwarped_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHOakVVVVWarpedVVVVWarped = ITEMS.register("warped_hhhoak_vvvvwarped_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHOakVVVVWarpedVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHOakVVVVWarpedVVVVWarpedGate = ITEMS.register("warped_hhhoak_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHOakVVVVWarpedVVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHOakXXOak = ITEMS.register("warped_hhoak_xxoak", () -> new BlockItem(ModBlocksWoodenFence.warpedHHOakXXOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVOak = ITEMS.register("warped_hhwarped_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVOakGate = ITEMS.register("warped_hhwarped_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVOakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> oakHHWarped = ITEMS.register("oak_hhwarped", () -> new BlockItem(ModBlocksWoodenFence.oakHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHWarped = ITEMS.register("oak_hhhwarped", () -> new BlockItem(ModBlocksWoodenFence.oakHHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHWarpedVOak = ITEMS.register("oak_hhwarped_voak", () -> new BlockItem(ModBlocksWoodenFence.oakHHWarpedVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHWarpedVOakGate = ITEMS.register("oak_hhwarped_voak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHWarpedVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHWarpedVVWarped = ITEMS.register("oak_hhwarped_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.oakHHWarpedVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVWarped = ITEMS.register("oak_hhoak_vvvwarped", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVWarpedGate = ITEMS.register("oak_hhoak_vvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVWarped = ITEMS.register("oak_hhoak_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVWarpedGate = ITEMS.register("oak_hhoak_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHWarpedVVVVOakVVVVOak = ITEMS.register("oak_hhhwarped_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.oakHHHWarpedVVVVOakVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHWarpedVVVVOakVVVVOakGate = ITEMS.register("oak_hhhwarped_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHHWarpedVVVVOakVVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHWarpedXXWarped = ITEMS.register("oak_hhwarped_xxwarped", () -> new BlockItem(ModBlocksWoodenFence.oakHHWarpedXXWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVWarped = ITEMS.register("oak_hhoak_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVWarpedGate = ITEMS.register("oak_hhoak_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVWarpedGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> warpedHHSpruce = ITEMS.register("warped_hhspruce", () -> new BlockItem(ModBlocksWoodenFence.warpedHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHSpruce = ITEMS.register("warped_hhhspruce", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHSpruceVWarped = ITEMS.register("warped_hhspruce_vwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHSpruceVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHSpruceVWarpedGate = ITEMS.register("warped_hhspruce_vwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHSpruceVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHSpruceVVSpruce = ITEMS.register("warped_hhspruce_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.warpedHHSpruceVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVSpruce = ITEMS.register("warped_hhwarped_vvvspruce", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVSpruceGate = ITEMS.register("warped_hhwarped_vvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVSpruce = ITEMS.register("warped_hhwarped_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVSpruceGate = ITEMS.register("warped_hhwarped_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHSpruceVVVVWarpedVVVVWarped = ITEMS.register("warped_hhhspruce_vvvvwarped_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHSpruceVVVVWarpedVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHSpruceVVVVWarpedVVVVWarpedGate = ITEMS.register("warped_hhhspruce_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHSpruceVVVVWarpedVVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHSpruceXXSpruce = ITEMS.register("warped_hhspruce_xxspruce", () -> new BlockItem(ModBlocksWoodenFence.warpedHHSpruceXXSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVSpruce = ITEMS.register("warped_hhwarped_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVSpruceGate = ITEMS.register("warped_hhwarped_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVSpruceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> spruceHHWarped = ITEMS.register("spruce_hhwarped", () -> new BlockItem(ModBlocksWoodenFence.spruceHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHWarped = ITEMS.register("spruce_hhhwarped", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHWarpedVSpruce = ITEMS.register("spruce_hhwarped_vspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHWarpedVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHWarpedVSpruceGate = ITEMS.register("spruce_hhwarped_vspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHWarpedVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHWarpedVVWarped = ITEMS.register("spruce_hhwarped_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.spruceHHWarpedVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVWarped = ITEMS.register("spruce_hhspruce_vvvwarped", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVWarpedGate = ITEMS.register("spruce_hhspruce_vvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVWarped = ITEMS.register("spruce_hhspruce_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVWarpedGate = ITEMS.register("spruce_hhspruce_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHWarpedVVVVSpruceVVVVSpruce = ITEMS.register("spruce_hhhwarped_vvvvspruce_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHWarpedVVVVSpruceVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHWarpedVVVVSpruceVVVVSpruceGate = ITEMS.register("spruce_hhhwarped_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHWarpedVVVVSpruceVVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHWarpedXXWarped = ITEMS.register("spruce_hhwarped_xxwarped", () -> new BlockItem(ModBlocksWoodenFence.spruceHHWarpedXXWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVWarped = ITEMS.register("spruce_hhspruce_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVWarpedGate = ITEMS.register("spruce_hhspruce_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVWarpedGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> crimsonHHJungle = ITEMS.register("crimson_hhjungle", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHHJungle = ITEMS.register("crimson_hhhjungle", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHJungleVCrimson = ITEMS.register("crimson_hhjungle_vcrimson", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHJungleVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHJungleVCrimsonGate = ITEMS.register("crimson_hhjungle_vcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHJungleVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHJungleVVJungle = ITEMS.register("crimson_hhjungle_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHJungleVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVJungle = ITEMS.register("crimson_hhcrimson_vvvjungle", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVJungleGate = ITEMS.register("crimson_hhcrimson_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVJungle = ITEMS.register("crimson_hhcrimson_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVJungleGate = ITEMS.register("crimson_hhcrimson_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHHJungleVVVVCrimsonVVVVCrimson = ITEMS.register("crimson_hhhjungle_vvvvcrimson_vvvvcrimson", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHHJungleVVVVCrimsonVVVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate = ITEMS.register("crimson_hhhjungle_vvvvcrimson_vvvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHJungleXXJungle = ITEMS.register("crimson_hhjungle_xxjungle", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHJungleXXJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVVJungle = ITEMS.register("crimson_hhcrimson_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVVJungleGate = ITEMS.register("crimson_hhcrimson_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVVJungleGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> jungleHHCrimson = ITEMS.register("jungle_hhcrimson", () -> new BlockItem(ModBlocksWoodenFence.jungleHHCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHCrimson = ITEMS.register("jungle_hhhcrimson", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHCrimsonVJungle = ITEMS.register("jungle_hhcrimson_vjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHCrimsonVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHCrimsonVJungleGate = ITEMS.register("jungle_hhcrimson_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHCrimsonVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHCrimsonVVCrimson = ITEMS.register("jungle_hhcrimson_vvcrimson", () -> new BlockItem(ModBlocksWoodenFence.jungleHHCrimsonVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVCrimson = ITEMS.register("jungle_hhjungle_vvvcrimson", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVCrimsonGate = ITEMS.register("jungle_hhjungle_vvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVCrimson = ITEMS.register("jungle_hhjungle_vvcrimson", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVCrimsonGate = ITEMS.register("jungle_hhjungle_vvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHCrimsonVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhcrimson_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHCrimsonVVVVJungleVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHCrimsonVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhcrimson_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHCrimsonVVVVJungleVVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHCrimsonXXCrimson = ITEMS.register("jungle_hhcrimson_xxcrimson", () -> new BlockItem(ModBlocksWoodenFence.jungleHHCrimsonXXCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVCrimson = ITEMS.register("jungle_hhjungle_vvvvcrimson", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVCrimsonGate = ITEMS.register("jungle_hhjungle_vvvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVCrimsonGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> crimsonHHOak = ITEMS.register("crimson_hhoak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHHOak = ITEMS.register("crimson_hhhoak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHOakVCrimson = ITEMS.register("crimson_hhoak_vcrimson", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHOakVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHOakVCrimsonGate = ITEMS.register("crimson_hhoak_vcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHOakVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHOakVVOak = ITEMS.register("crimson_hhoak_vvoak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHOakVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVOak = ITEMS.register("crimson_hhcrimson_vvvoak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVOakGate = ITEMS.register("crimson_hhcrimson_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVOak = ITEMS.register("crimson_hhcrimson_vvoak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVOakGate = ITEMS.register("crimson_hhcrimson_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHHOakVVVVCrimsonVVVVCrimson = ITEMS.register("crimson_hhhoak_vvvvcrimson_vvvvcrimson", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHHOakVVVVCrimsonVVVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHHOakVVVVCrimsonVVVVCrimsonGate = ITEMS.register("crimson_hhhoak_vvvvcrimson_vvvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHHOakVVVVCrimsonVVVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHOakXXOak = ITEMS.register("crimson_hhoak_xxoak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHOakXXOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVVOak = ITEMS.register("crimson_hhcrimson_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVVOakGate = ITEMS.register("crimson_hhcrimson_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVVOakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> oakHHCrimson = ITEMS.register("oak_hhcrimson", () -> new BlockItem(ModBlocksWoodenFence.oakHHCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHCrimson = ITEMS.register("oak_hhhcrimson", () -> new BlockItem(ModBlocksWoodenFence.oakHHHCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHCrimsonVOak = ITEMS.register("oak_hhcrimson_voak", () -> new BlockItem(ModBlocksWoodenFence.oakHHCrimsonVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHCrimsonVOakGate = ITEMS.register("oak_hhcrimson_voak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHCrimsonVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHCrimsonVVCrimson = ITEMS.register("oak_hhcrimson_vvcrimson", () -> new BlockItem(ModBlocksWoodenFence.oakHHCrimsonVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVCrimson = ITEMS.register("oak_hhoak_vvvcrimson", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVCrimsonGate = ITEMS.register("oak_hhoak_vvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVCrimson = ITEMS.register("oak_hhoak_vvcrimson", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVCrimsonGate = ITEMS.register("oak_hhoak_vvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHCrimsonVVVVOakVVVVOak = ITEMS.register("oak_hhhcrimson_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.oakHHHCrimsonVVVVOakVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHCrimsonVVVVOakVVVVOakGate = ITEMS.register("oak_hhhcrimson_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHHCrimsonVVVVOakVVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHCrimsonXXCrimson = ITEMS.register("oak_hhcrimson_xxcrimson", () -> new BlockItem(ModBlocksWoodenFence.oakHHCrimsonXXCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVCrimson = ITEMS.register("oak_hhoak_vvvvcrimson", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVCrimsonGate = ITEMS.register("oak_hhoak_vvvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVCrimsonGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> crimsonHHDarkoak = ITEMS.register("crimson_hhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHHDarkoak = ITEMS.register("crimson_hhhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHDarkoakVCrimson = ITEMS.register("crimson_hhdark_oak_vcrimson", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHDarkoakVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHDarkoakVCrimsonGate = ITEMS.register("crimson_hhdark_oak_vcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHDarkoakVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHDarkoakVVDarkoak = ITEMS.register("crimson_hhdark_oak_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHDarkoakVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVDarkoak = ITEMS.register("crimson_hhcrimson_vvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVDarkoakGate = ITEMS.register("crimson_hhcrimson_vvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVDarkoak = ITEMS.register("crimson_hhcrimson_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVDarkoakGate = ITEMS.register("crimson_hhcrimson_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHHDarkoakVVVVCrimsonVVVVCrimson = ITEMS.register("crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHHDarkoakVVVVCrimsonVVVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate = ITEMS.register("crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHDarkoakXXDarkoak = ITEMS.register("crimson_hhdark_oak_xxdark_oak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHDarkoakXXDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVVDarkoak = ITEMS.register("crimson_hhcrimson_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVVDarkoakGate = ITEMS.register("crimson_hhcrimson_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.crimsonHHCrimsonVVVVDarkoakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> darkoakHHCrimson = ITEMS.register("dark_oak_hhcrimson", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHCrimson = ITEMS.register("dark_oak_hhhcrimson", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHCrimsonVDarkoak = ITEMS.register("dark_oak_hhcrimson_vdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHCrimsonVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHCrimsonVDarkoakGate = ITEMS.register("dark_oak_hhcrimson_vdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHCrimsonVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHCrimsonVVCrimson = ITEMS.register("dark_oak_hhcrimson_vvcrimson", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHCrimsonVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVCrimson = ITEMS.register("dark_oak_hhdark_oak_vvvcrimson", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVCrimsonGate = ITEMS.register("dark_oak_hhdark_oak_vvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVCrimson = ITEMS.register("dark_oak_hhdark_oak_vvcrimson", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVCrimsonGate = ITEMS.register("dark_oak_hhdark_oak_vvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVCrimsonGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak = ITEMS.register("dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate = ITEMS.register("dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHCrimsonXXCrimson = ITEMS.register("dark_oak_hhcrimson_xxcrimson", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHCrimsonXXCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVCrimson = ITEMS.register("dark_oak_hhdark_oak_vvvvcrimson", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVCrimson.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVCrimsonGate = ITEMS.register("dark_oak_hhdark_oak_vvvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVCrimsonGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> mangroveHHOak = ITEMS.register("mangrove_hhoak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHOak = ITEMS.register("mangrove_hhhoak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHOakVMangrove = ITEMS.register("mangrove_hhoak_vmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHOakVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHOakVMangroveGate = ITEMS.register("mangrove_hhoak_vmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHOakVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHOakVVOak = ITEMS.register("mangrove_hhoak_vvoak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHOakVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVOak = ITEMS.register("mangrove_hhmangrove_vvvoak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVOakGate = ITEMS.register("mangrove_hhmangrove_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVOak = ITEMS.register("mangrove_hhmangrove_vvoak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVOakGate = ITEMS.register("mangrove_hhmangrove_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHOakVVVVMangroveVVVVMangrove = ITEMS.register("mangrove_hhhoak_vvvvmangrove_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHOakVVVVMangroveVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHOakVVVVMangroveVVVVMangroveGate = ITEMS.register("mangrove_hhhoak_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHOakVVVVMangroveVVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHOakXXOak = ITEMS.register("mangrove_hhoak_xxoak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHOakXXOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVOak = ITEMS.register("mangrove_hhmangrove_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVOakGate = ITEMS.register("mangrove_hhmangrove_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVOakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> oakHHMangrove = ITEMS.register("oak_hhmangrove", () -> new BlockItem(ModBlocksWoodenFence.oakHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHMangrove = ITEMS.register("oak_hhhmangrove", () -> new BlockItem(ModBlocksWoodenFence.oakHHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHMangroveVOak = ITEMS.register("oak_hhmangrove_voak", () -> new BlockItem(ModBlocksWoodenFence.oakHHMangroveVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHMangroveVOakGate = ITEMS.register("oak_hhmangrove_voak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHMangroveVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHMangroveVVMangrove = ITEMS.register("oak_hhmangrove_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.oakHHMangroveVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVMangrove = ITEMS.register("oak_hhoak_vvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVMangroveGate = ITEMS.register("oak_hhoak_vvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVMangrove = ITEMS.register("oak_hhoak_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVMangroveGate = ITEMS.register("oak_hhoak_vvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHMangroveVVVVOakVVVVOak = ITEMS.register("oak_hhhmangrove_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.oakHHHMangroveVVVVOakVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHMangroveVVVVOakVVVVOakGate = ITEMS.register("oak_hhhmangrove_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHHMangroveVVVVOakVVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHMangroveXXMangrove = ITEMS.register("oak_hhmangrove_xxmangrove", () -> new BlockItem(ModBlocksWoodenFence.oakHHMangroveXXMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVMangrove = ITEMS.register("oak_hhoak_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVMangroveGate = ITEMS.register("oak_hhoak_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVMangroveGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> mangroveHHBirch = ITEMS.register("mangrove_hhbirch", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHBirch = ITEMS.register("mangrove_hhhbirch", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHBirchVMangrove = ITEMS.register("mangrove_hhbirch_vmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHBirchVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHBirchVMangroveGate = ITEMS.register("mangrove_hhbirch_vmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHBirchVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHBirchVVBirch = ITEMS.register("mangrove_hhbirch_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHBirchVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVBirch = ITEMS.register("mangrove_hhmangrove_vvvbirch", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVBirchGate = ITEMS.register("mangrove_hhmangrove_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVBirch = ITEMS.register("mangrove_hhmangrove_vvbirch", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVBirchGate = ITEMS.register("mangrove_hhmangrove_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHBirchVVVVMangroveVVVVMangrove = ITEMS.register("mangrove_hhhbirch_vvvvmangrove_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHBirchVVVVMangroveVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHBirchVVVVMangroveVVVVMangroveGate = ITEMS.register("mangrove_hhhbirch_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHBirchVVVVMangroveVVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHBirchXXBirch = ITEMS.register("mangrove_hhbirch_xxbirch", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHBirchXXBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVBirch = ITEMS.register("mangrove_hhmangrove_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVBirchGate = ITEMS.register("mangrove_hhmangrove_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVBirchGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> birchHHMangrove = ITEMS.register("birch_hhmangrove", () -> new BlockItem(ModBlocksWoodenFence.birchHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHMangrove = ITEMS.register("birch_hhhmangrove", () -> new BlockItem(ModBlocksWoodenFence.birchHHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHMangroveVBirch = ITEMS.register("birch_hhmangrove_vbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHMangroveVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHMangroveVBirchGate = ITEMS.register("birch_hhmangrove_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHMangroveVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHMangroveVVMangrove = ITEMS.register("birch_hhmangrove_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.birchHHMangroveVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVMangrove = ITEMS.register("birch_hhbirch_vvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVMangroveGate = ITEMS.register("birch_hhbirch_vvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVMangrove = ITEMS.register("birch_hhbirch_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVMangroveGate = ITEMS.register("birch_hhbirch_vvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHMangroveVVVVBirchVVVVBirch = ITEMS.register("birch_hhhmangrove_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocksWoodenFence.birchHHHMangroveVVVVBirchVVVVBirch.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHHMangroveVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhmangrove_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHHMangroveVVVVBirchVVVVBirchGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHMangroveXXMangrove = ITEMS.register("birch_hhmangrove_xxmangrove", () -> new BlockItem(ModBlocksWoodenFence.birchHHMangroveXXMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVMangrove = ITEMS.register("birch_hhbirch_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchHHBirchVVVVMangroveGate = ITEMS.register("birch_hhbirch_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.birchHHBirchVVVVMangroveGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> mangroveHHJungle = ITEMS.register("mangrove_hhjungle", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHJungle = ITEMS.register("mangrove_hhhjungle", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHJungleVMangrove = ITEMS.register("mangrove_hhjungle_vmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHJungleVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHJungleVMangroveGate = ITEMS.register("mangrove_hhjungle_vmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHJungleVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHJungleVVJungle = ITEMS.register("mangrove_hhjungle_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHJungleVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVJungle = ITEMS.register("mangrove_hhmangrove_vvvjungle", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVJungleGate = ITEMS.register("mangrove_hhmangrove_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVJungle = ITEMS.register("mangrove_hhmangrove_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVJungleGate = ITEMS.register("mangrove_hhmangrove_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHJungleVVVVMangroveVVVVMangrove = ITEMS.register("mangrove_hhhjungle_vvvvmangrove_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHJungleVVVVMangroveVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHJungleVVVVMangroveVVVVMangroveGate = ITEMS.register("mangrove_hhhjungle_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHJungleVVVVMangroveVVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHJungleXXJungle = ITEMS.register("mangrove_hhjungle_xxjungle", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHJungleXXJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVJungle = ITEMS.register("mangrove_hhmangrove_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVJungleGate = ITEMS.register("mangrove_hhmangrove_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVJungleGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> jungleHHMangrove = ITEMS.register("jungle_hhmangrove", () -> new BlockItem(ModBlocksWoodenFence.jungleHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHMangrove = ITEMS.register("jungle_hhhmangrove", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHMangroveVJungle = ITEMS.register("jungle_hhmangrove_vjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHMangroveVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHMangroveVJungleGate = ITEMS.register("jungle_hhmangrove_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHMangroveVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHMangroveVVMangrove = ITEMS.register("jungle_hhmangrove_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.jungleHHMangroveVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVMangrove = ITEMS.register("jungle_hhjungle_vvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVMangroveGate = ITEMS.register("jungle_hhjungle_vvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVMangrove = ITEMS.register("jungle_hhjungle_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVMangroveGate = ITEMS.register("jungle_hhjungle_vvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHMangroveVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhmangrove_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHMangroveVVVVJungleVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHMangroveVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhmangrove_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHMangroveVVVVJungleVVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHMangroveXXMangrove = ITEMS.register("jungle_hhmangrove_xxmangrove", () -> new BlockItem(ModBlocksWoodenFence.jungleHHMangroveXXMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVMangrove = ITEMS.register("jungle_hhjungle_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVMangroveGate = ITEMS.register("jungle_hhjungle_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVMangroveGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> mangroveHHDarkoak = ITEMS.register("mangrove_hhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHDarkoak = ITEMS.register("mangrove_hhhdark_oak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHDarkoakVMangrove = ITEMS.register("mangrove_hhdark_oak_vmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHDarkoakVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHDarkoakVMangroveGate = ITEMS.register("mangrove_hhdark_oak_vmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHDarkoakVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHDarkoakVVDarkoak = ITEMS.register("mangrove_hhdark_oak_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHDarkoakVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVDarkoak = ITEMS.register("mangrove_hhmangrove_vvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVDarkoakGate = ITEMS.register("mangrove_hhmangrove_vvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVDarkoak = ITEMS.register("mangrove_hhmangrove_vvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVDarkoakGate = ITEMS.register("mangrove_hhmangrove_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHDarkoakVVVVMangroveVVVVMangrove = ITEMS.register("mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHDarkoakVVVVMangroveVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHDarkoakVVVVMangroveVVVVMangroveGate = ITEMS.register("mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHDarkoakVVVVMangroveVVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHDarkoakXXDarkoak = ITEMS.register("mangrove_hhdark_oak_xxdark_oak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHDarkoakXXDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVDarkoak = ITEMS.register("mangrove_hhmangrove_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVDarkoakGate = ITEMS.register("mangrove_hhmangrove_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVDarkoakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> darkoakHHMangrove = ITEMS.register("dark_oak_hhmangrove", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHMangrove = ITEMS.register("dark_oak_hhhmangrove", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHMangroveVDarkoak = ITEMS.register("dark_oak_hhmangrove_vdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHMangroveVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHMangroveVDarkoakGate = ITEMS.register("dark_oak_hhmangrove_vdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHMangroveVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHMangroveVVMangrove = ITEMS.register("dark_oak_hhmangrove_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHMangroveVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVMangrove = ITEMS.register("dark_oak_hhdark_oak_vvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVMangroveGate = ITEMS.register("dark_oak_hhdark_oak_vvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVMangrove = ITEMS.register("dark_oak_hhdark_oak_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVMangroveGate = ITEMS.register("dark_oak_hhdark_oak_vvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHMangroveVVVVDarkoakVVVVDarkoak = ITEMS.register("dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHMangroveVVVVDarkoakVVVVDarkoak.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHHMangroveVVVVDarkoakVVVVDarkoakGate = ITEMS.register("dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHHMangroveVVVVDarkoakVVVVDarkoakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHMangroveXXMangrove = ITEMS.register("dark_oak_hhmangrove_xxmangrove", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHMangroveXXMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVMangrove = ITEMS.register("dark_oak_hhdark_oak_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVVMangroveGate = ITEMS.register("dark_oak_hhdark_oak_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.darkoakHHDarkoakVVVVMangroveGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> mangroveHHWarped = ITEMS.register("mangrove_hhwarped", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHWarped = ITEMS.register("mangrove_hhhwarped", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHWarpedVMangrove = ITEMS.register("mangrove_hhwarped_vmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHWarpedVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHWarpedVMangroveGate = ITEMS.register("mangrove_hhwarped_vmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHWarpedVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHWarpedVVWarped = ITEMS.register("mangrove_hhwarped_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHWarpedVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVWarped = ITEMS.register("mangrove_hhmangrove_vvvwarped", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVWarpedGate = ITEMS.register("mangrove_hhmangrove_vvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVWarped = ITEMS.register("mangrove_hhmangrove_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVWarpedGate = ITEMS.register("mangrove_hhmangrove_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHWarpedVVVVMangroveVVVVMangrove = ITEMS.register("mangrove_hhhwarped_vvvvmangrove_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHWarpedVVVVMangroveVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHHWarpedVVVVMangroveVVVVMangroveGate = ITEMS.register("mangrove_hhhwarped_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHHWarpedVVVVMangroveVVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHWarpedXXWarped = ITEMS.register("mangrove_hhwarped_xxwarped", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHWarpedXXWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVWarped = ITEMS.register("mangrove_hhmangrove_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveHHMangroveVVVVWarpedGate = ITEMS.register("mangrove_hhmangrove_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.mangroveHHMangroveVVVVWarpedGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> warpedHHMangrove = ITEMS.register("warped_hhmangrove", () -> new BlockItem(ModBlocksWoodenFence.warpedHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHMangrove = ITEMS.register("warped_hhhmangrove", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHMangroveVWarped = ITEMS.register("warped_hhmangrove_vwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHMangroveVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHMangroveVWarpedGate = ITEMS.register("warped_hhmangrove_vwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHMangroveVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHMangroveVVMangrove = ITEMS.register("warped_hhmangrove_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.warpedHHMangroveVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVMangrove = ITEMS.register("warped_hhwarped_vvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVMangroveGate = ITEMS.register("warped_hhwarped_vvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVMangrove = ITEMS.register("warped_hhwarped_vvmangrove", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVMangroveGate = ITEMS.register("warped_hhwarped_vvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVMangroveGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHMangroveVVVVWarpedVVVVWarped = ITEMS.register("warped_hhhmangrove_vvvvwarped_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHMangroveVVVVWarpedVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHMangroveVVVVWarpedVVVVWarpedGate = ITEMS.register("warped_hhhmangrove_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHMangroveVVVVWarpedVVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHMangroveXXMangrove = ITEMS.register("warped_hhmangrove_xxmangrove", () -> new BlockItem(ModBlocksWoodenFence.warpedHHMangroveXXMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVMangrove = ITEMS.register("warped_hhwarped_vvvvmangrove", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVMangrove.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVMangroveGate = ITEMS.register("warped_hhwarped_vvvvmangrove_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVMangroveGate.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> bambooHHOak = ITEMS.register("bamboo_hhoak", () -> new BlockItem(ModBlocksWoodenFence.bambooHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHOak = ITEMS.register("bamboo_hhhoak", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHOakVBamboo = ITEMS.register("bamboo_hhoak_vbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHOakVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHOakVBambooGate = ITEMS.register("bamboo_hhoak_vbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHOakVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHOakVVOak = ITEMS.register("bamboo_hhoak_vvoak", () -> new BlockItem(ModBlocksWoodenFence.bambooHHOakVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVOak = ITEMS.register("bamboo_hhbamboo_vvvoak", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVOakGate = ITEMS.register("bamboo_hhbamboo_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVOak = ITEMS.register("bamboo_hhbamboo_vvoak", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVOakGate = ITEMS.register("bamboo_hhbamboo_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHOakVVVVBambooVVVVBamboo = ITEMS.register("bamboo_hhhoak_vvvvbamboo_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHOakVVVVBambooVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHOakVVVVBambooVVVVBambooGate = ITEMS.register("bamboo_hhhoak_vvvvbamboo_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHOakVVVVBambooVVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHOakXXOak = ITEMS.register("bamboo_hhoak_xxoak", () -> new BlockItem(ModBlocksWoodenFence.bambooHHOakXXOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVOak = ITEMS.register("bamboo_hhbamboo_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVOakGate = ITEMS.register("bamboo_hhbamboo_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVOakGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> oakHHBamboo = ITEMS.register("oak_hhbamboo", () -> new BlockItem(ModBlocksWoodenFence.oakHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHBamboo = ITEMS.register("oak_hhhbamboo", () -> new BlockItem(ModBlocksWoodenFence.oakHHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHBambooVOak = ITEMS.register("oak_hhbamboo_voak", () -> new BlockItem(ModBlocksWoodenFence.oakHHBambooVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHBambooVOakGate = ITEMS.register("oak_hhbamboo_voak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHBambooVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHBambooVVBamboo = ITEMS.register("oak_hhbamboo_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.oakHHBambooVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVBamboo = ITEMS.register("oak_hhoak_vvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVBambooGate = ITEMS.register("oak_hhoak_vvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVBamboo = ITEMS.register("oak_hhoak_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVBambooGate = ITEMS.register("oak_hhoak_vvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHBambooVVVVOakVVVVOak = ITEMS.register("oak_hhhbamboo_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocksWoodenFence.oakHHHBambooVVVVOakVVVVOak.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHHBambooVVVVOakVVVVOakGate = ITEMS.register("oak_hhhbamboo_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHHBambooVVVVOakVVVVOakGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHBambooXXBamboo = ITEMS.register("oak_hhbamboo_xxbamboo", () -> new BlockItem(ModBlocksWoodenFence.oakHHBambooXXBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVBamboo = ITEMS.register("oak_hhoak_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> oakHHOakVVVVBambooGate = ITEMS.register("oak_hhoak_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.oakHHOakVVVVBambooGate.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> bambooHHSpruce = ITEMS.register("bamboo_hhspruce", () -> new BlockItem(ModBlocksWoodenFence.bambooHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHSpruce = ITEMS.register("bamboo_hhhspruce", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHSpruceVBamboo = ITEMS.register("bamboo_hhspruce_vbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHSpruceVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHSpruceVBambooGate = ITEMS.register("bamboo_hhspruce_vbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHSpruceVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHSpruceVVSpruce = ITEMS.register("bamboo_hhspruce_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.bambooHHSpruceVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVSpruce = ITEMS.register("bamboo_hhbamboo_vvvspruce", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVSpruceGate = ITEMS.register("bamboo_hhbamboo_vvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVSpruce = ITEMS.register("bamboo_hhbamboo_vvspruce", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVSpruceGate = ITEMS.register("bamboo_hhbamboo_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHSpruceVVVVBambooVVVVBamboo = ITEMS.register("bamboo_hhhspruce_vvvvbamboo_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHSpruceVVVVBambooVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHSpruceVVVVBambooVVVVBambooGate = ITEMS.register("bamboo_hhhspruce_vvvvbamboo_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHSpruceVVVVBambooVVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHSpruceXXSpruce = ITEMS.register("bamboo_hhspruce_xxspruce", () -> new BlockItem(ModBlocksWoodenFence.bambooHHSpruceXXSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVSpruce = ITEMS.register("bamboo_hhbamboo_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVSpruceGate = ITEMS.register("bamboo_hhbamboo_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVSpruceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> spruceHHBamboo = ITEMS.register("spruce_hhbamboo", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHBamboo = ITEMS.register("spruce_hhhbamboo", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHBambooVSpruce = ITEMS.register("spruce_hhbamboo_vspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBambooVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHBambooVSpruceGate = ITEMS.register("spruce_hhbamboo_vspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBambooVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHBambooVVBamboo = ITEMS.register("spruce_hhbamboo_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBambooVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVBamboo = ITEMS.register("spruce_hhspruce_vvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVBambooGate = ITEMS.register("spruce_hhspruce_vvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVBamboo = ITEMS.register("spruce_hhspruce_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVBambooGate = ITEMS.register("spruce_hhspruce_vvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHBambooVVVVSpruceVVVVSpruce = ITEMS.register("spruce_hhhbamboo_vvvvspruce_vvvvspruce", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHBambooVVVVSpruceVVVVSpruce.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHHBambooVVVVSpruceVVVVSpruceGate = ITEMS.register("spruce_hhhbamboo_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHHBambooVVVVSpruceVVVVSpruceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHBambooXXBamboo = ITEMS.register("spruce_hhbamboo_xxbamboo", () -> new BlockItem(ModBlocksWoodenFence.spruceHHBambooXXBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVBamboo = ITEMS.register("spruce_hhspruce_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceHHSpruceVVVVBambooGate = ITEMS.register("spruce_hhspruce_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.spruceHHSpruceVVVVBambooGate.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> bambooHHJungle = ITEMS.register("bamboo_hhjungle", () -> new BlockItem(ModBlocksWoodenFence.bambooHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHJungle = ITEMS.register("bamboo_hhhjungle", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHJungleVBamboo = ITEMS.register("bamboo_hhjungle_vbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHJungleVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHJungleVBambooGate = ITEMS.register("bamboo_hhjungle_vbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHJungleVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHJungleVVJungle = ITEMS.register("bamboo_hhjungle_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.bambooHHJungleVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVJungle = ITEMS.register("bamboo_hhbamboo_vvvjungle", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVJungleGate = ITEMS.register("bamboo_hhbamboo_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVJungle = ITEMS.register("bamboo_hhbamboo_vvjungle", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVJungleGate = ITEMS.register("bamboo_hhbamboo_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHJungleVVVVBambooVVVVBamboo = ITEMS.register("bamboo_hhhjungle_vvvvbamboo_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHJungleVVVVBambooVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHJungleVVVVBambooVVVVBambooGate = ITEMS.register("bamboo_hhhjungle_vvvvbamboo_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHJungleVVVVBambooVVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHJungleXXJungle = ITEMS.register("bamboo_hhjungle_xxjungle", () -> new BlockItem(ModBlocksWoodenFence.bambooHHJungleXXJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVJungle = ITEMS.register("bamboo_hhbamboo_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVJungleGate = ITEMS.register("bamboo_hhbamboo_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVJungleGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> jungleHHBamboo = ITEMS.register("jungle_hhbamboo", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHBamboo = ITEMS.register("jungle_hhhbamboo", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHBambooVJungle = ITEMS.register("jungle_hhbamboo_vjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBambooVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHBambooVJungleGate = ITEMS.register("jungle_hhbamboo_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBambooVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHBambooVVBamboo = ITEMS.register("jungle_hhbamboo_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBambooVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVBamboo = ITEMS.register("jungle_hhjungle_vvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVBambooGate = ITEMS.register("jungle_hhjungle_vvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVBamboo = ITEMS.register("jungle_hhjungle_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVBambooGate = ITEMS.register("jungle_hhjungle_vvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHBambooVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhbamboo_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHBambooVVVVJungleVVVVJungle.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHHBambooVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhbamboo_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHHBambooVVVVJungleVVVVJungleGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHBambooXXBamboo = ITEMS.register("jungle_hhbamboo_xxbamboo", () -> new BlockItem(ModBlocksWoodenFence.jungleHHBambooXXBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVBamboo = ITEMS.register("jungle_hhjungle_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleHHJungleVVVVBambooGate = ITEMS.register("jungle_hhjungle_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.jungleHHJungleVVVVBambooGate.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> bambooHHAcacia = ITEMS.register("bamboo_hhacacia", () -> new BlockItem(ModBlocksWoodenFence.bambooHHAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHAcacia = ITEMS.register("bamboo_hhhacacia", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHAcaciaVBamboo = ITEMS.register("bamboo_hhacacia_vbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHAcaciaVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHAcaciaVBambooGate = ITEMS.register("bamboo_hhacacia_vbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHAcaciaVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHAcaciaVVAcacia = ITEMS.register("bamboo_hhacacia_vvacacia", () -> new BlockItem(ModBlocksWoodenFence.bambooHHAcaciaVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVAcacia = ITEMS.register("bamboo_hhbamboo_vvvacacia", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVAcaciaGate = ITEMS.register("bamboo_hhbamboo_vvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVAcacia = ITEMS.register("bamboo_hhbamboo_vvacacia", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVAcaciaGate = ITEMS.register("bamboo_hhbamboo_vvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHAcaciaVVVVBambooVVVVBamboo = ITEMS.register("bamboo_hhhacacia_vvvvbamboo_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHAcaciaVVVVBambooVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHAcaciaVVVVBambooVVVVBambooGate = ITEMS.register("bamboo_hhhacacia_vvvvbamboo_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHAcaciaVVVVBambooVVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHAcaciaXXAcacia = ITEMS.register("bamboo_hhacacia_xxacacia", () -> new BlockItem(ModBlocksWoodenFence.bambooHHAcaciaXXAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVAcacia = ITEMS.register("bamboo_hhbamboo_vvvvacacia", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVAcaciaGate = ITEMS.register("bamboo_hhbamboo_vvvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVAcaciaGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> acaciaHHBamboo = ITEMS.register("acacia_hhbamboo", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHHBamboo = ITEMS.register("acacia_hhhbamboo", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHBambooVAcacia = ITEMS.register("acacia_hhbamboo_vacacia", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBambooVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHBambooVAcaciaGate = ITEMS.register("acacia_hhbamboo_vacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBambooVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHBambooVVBamboo = ITEMS.register("acacia_hhbamboo_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBambooVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVBamboo = ITEMS.register("acacia_hhacacia_vvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVBambooGate = ITEMS.register("acacia_hhacacia_vvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVBamboo = ITEMS.register("acacia_hhacacia_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVBambooGate = ITEMS.register("acacia_hhacacia_vvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHHBambooVVVVAcaciaVVVVAcacia = ITEMS.register("acacia_hhhbamboo_vvvvacacia_vvvvacacia", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHHBambooVVVVAcaciaVVVVAcacia.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHHBambooVVVVAcaciaVVVVAcaciaGate = ITEMS.register("acacia_hhhbamboo_vvvvacacia_vvvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHHBambooVVVVAcaciaVVVVAcaciaGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHBambooXXBamboo = ITEMS.register("acacia_hhbamboo_xxbamboo", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHBambooXXBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVVBamboo = ITEMS.register("acacia_hhacacia_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVVBambooGate = ITEMS.register("acacia_hhacacia_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.acaciaHHAcaciaVVVVBambooGate.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> bambooHHWarped = ITEMS.register("bamboo_hhwarped", () -> new BlockItem(ModBlocksWoodenFence.bambooHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHWarped = ITEMS.register("bamboo_hhhwarped", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHWarpedVBamboo = ITEMS.register("bamboo_hhwarped_vbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHWarpedVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHWarpedVBambooGate = ITEMS.register("bamboo_hhwarped_vbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHWarpedVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHWarpedVVWarped = ITEMS.register("bamboo_hhwarped_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.bambooHHWarpedVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVWarped = ITEMS.register("bamboo_hhbamboo_vvvwarped", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVWarpedGate = ITEMS.register("bamboo_hhbamboo_vvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVWarped = ITEMS.register("bamboo_hhbamboo_vvwarped", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVWarpedGate = ITEMS.register("bamboo_hhbamboo_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHWarpedVVVVBambooVVVVBamboo = ITEMS.register("bamboo_hhhwarped_vvvvbamboo_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHWarpedVVVVBambooVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHHWarpedVVVVBambooVVVVBambooGate = ITEMS.register("bamboo_hhhwarped_vvvvbamboo_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHHWarpedVVVVBambooVVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHWarpedXXWarped = ITEMS.register("bamboo_hhwarped_xxwarped", () -> new BlockItem(ModBlocksWoodenFence.bambooHHWarpedXXWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVWarped = ITEMS.register("bamboo_hhbamboo_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooHHBambooVVVVWarpedGate = ITEMS.register("bamboo_hhbamboo_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.bambooHHBambooVVVVWarpedGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> warpedHHBamboo = ITEMS.register("warped_hhbamboo", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHBamboo = ITEMS.register("warped_hhhbamboo", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHBambooVWarped = ITEMS.register("warped_hhbamboo_vwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBambooVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHBambooVWarpedGate = ITEMS.register("warped_hhbamboo_vwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBambooVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHBambooVVBamboo = ITEMS.register("warped_hhbamboo_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBambooVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVBamboo = ITEMS.register("warped_hhwarped_vvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVBambooGate = ITEMS.register("warped_hhwarped_vvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVBamboo = ITEMS.register("warped_hhwarped_vvbamboo", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVBambooGate = ITEMS.register("warped_hhwarped_vvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVBambooGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHBambooVVVVWarpedVVVVWarped = ITEMS.register("warped_hhhbamboo_vvvvwarped_vvvvwarped", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHBambooVVVVWarpedVVVVWarped.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHHBambooVVVVWarpedVVVVWarpedGate = ITEMS.register("warped_hhhbamboo_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHHBambooVVVVWarpedVVVVWarpedGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHBambooXXBamboo = ITEMS.register("warped_hhbamboo_xxbamboo", () -> new BlockItem(ModBlocksWoodenFence.warpedHHBambooXXBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVBamboo = ITEMS.register("warped_hhwarped_vvvvbamboo", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVBamboo.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedHHWarpedVVVVBambooGate = ITEMS.register("warped_hhwarped_vvvvbamboo_fence_gate_closed", () -> new BlockItem(ModBlocksWoodenFence.warpedHHWarpedVVVVBambooGate.get(), new Item.Properties()));
    

    public static final RegistryObject<Item> cobblestoneModern = ITEMS.register("cobblestone_modern", () -> new BlockItem(ModBlocksWall.cobblestoneModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneBuilding = ITEMS.register("cobblestone_building", () -> new BlockItem(ModBlocksWall.cobblestoneBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneCastle = ITEMS.register("cobblestone_castle", () -> new BlockItem(ModBlocksWall.cobblestoneCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> mossyCobblestoneModern = ITEMS.register("mossy_cobblestone_modern", () -> new BlockItem(ModBlocksWall.mossyCobblestoneModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> mossyCobblestoneBuilding = ITEMS.register("mossy_cobblestone_building", () -> new BlockItem(ModBlocksWall.mossyCobblestoneBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> mossyCobblestoneCastle = ITEMS.register("mossy_cobblestone_castle", () -> new BlockItem(ModBlocksWall.mossyCobblestoneCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> stoneModern = ITEMS.register("stone_modern", () -> new BlockItem(ModBlocksWall.stoneModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> stoneBuilding = ITEMS.register("stone_building", () -> new BlockItem(ModBlocksWall.stoneBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> stoneCastle = ITEMS.register("stone_castle", () -> new BlockItem(ModBlocksWall.stoneCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> stoneBrickModern = ITEMS.register("stone_bricks_modern", () -> new BlockItem(ModBlocksWall.stoneBrickModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> stoneBrickBuilding = ITEMS.register("stone_bricks_building", () -> new BlockItem(ModBlocksWall.stoneBrickBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> stoneBrickCastle = ITEMS.register("stone_bricks_castle", () -> new BlockItem(ModBlocksWall.stoneBrickCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> mossyStoneBrickModern = ITEMS.register("mossy_stone_bricks_modern", () -> new BlockItem(ModBlocksWall.mossyStoneBrickModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> mossyStoneBrickBuilding = ITEMS.register("mossy_stone_bricks_building", () -> new BlockItem(ModBlocksWall.mossyStoneBrickBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> mossyStoneBrickCastle = ITEMS.register("mossy_stone_bricks_castle", () -> new BlockItem(ModBlocksWall.mossyStoneBrickCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> andesiteModern = ITEMS.register("andesite_modern", () -> new BlockItem(ModBlocksWall.andesiteModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> andesiteBuilding = ITEMS.register("andesite_building", () -> new BlockItem(ModBlocksWall.andesiteBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> andesiteCastle = ITEMS.register("andesite_castle", () -> new BlockItem(ModBlocksWall.andesiteCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> dioriteModern = ITEMS.register("diorite_modern", () -> new BlockItem(ModBlocksWall.dioriteModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> dioriteBuilding = ITEMS.register("diorite_building", () -> new BlockItem(ModBlocksWall.dioriteBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> dioriteCastle = ITEMS.register("diorite_castle", () -> new BlockItem(ModBlocksWall.dioriteCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> graniteModern = ITEMS.register("granite_modern", () -> new BlockItem(ModBlocksWall.graniteModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> graniteBuilding = ITEMS.register("granite_building", () -> new BlockItem(ModBlocksWall.graniteBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> graniteCastle = ITEMS.register("granite_castle", () -> new BlockItem(ModBlocksWall.graniteCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> sandstoneModern = ITEMS.register("sandstone_modern", () -> new BlockItem(ModBlocksWall.sandstoneModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> sandstoneBuilding = ITEMS.register("sandstone_building", () -> new BlockItem(ModBlocksWall.sandstoneBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> sandstoneCastle = ITEMS.register("sandstone_castle", () -> new BlockItem(ModBlocksWall.sandstoneCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> redSandstoneModern = ITEMS.register("red_sandstone_modern", () -> new BlockItem(ModBlocksWall.redSandstoneModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> redSandstoneBuilding = ITEMS.register("red_sandstone_building", () -> new BlockItem(ModBlocksWall.redSandstoneBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> redSandstoneCastle = ITEMS.register("red_sandstone_castle", () -> new BlockItem(ModBlocksWall.redSandstoneCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> bricksModern = ITEMS.register("bricks_modern", () -> new BlockItem(ModBlocksWall.bricksModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> bricksBuilding = ITEMS.register("bricks_building", () -> new BlockItem(ModBlocksWall.bricksBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> bricksCastle = ITEMS.register("bricks_castle", () -> new BlockItem(ModBlocksWall.bricksCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> prismarineModern = ITEMS.register("prismarine_modern", () -> new BlockItem(ModBlocksWall.prismarineModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> prismarineBuilding = ITEMS.register("prismarine_building", () -> new BlockItem(ModBlocksWall.prismarineBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> prismarineCastle = ITEMS.register("prismarine_castle", () -> new BlockItem(ModBlocksWall.prismarineCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> netherBrickModern = ITEMS.register("nether_bricks_modern", () -> new BlockItem(ModBlocksWall.netherBrickModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> netherBrickBuilding = ITEMS.register("nether_bricks_building", () -> new BlockItem(ModBlocksWall.netherBrickBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> netherBrickCastle = ITEMS.register("nether_bricks_castle", () -> new BlockItem(ModBlocksWall.netherBrickCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> redNetherBrickModern = ITEMS.register("red_nether_bricks_modern", () -> new BlockItem(ModBlocksWall.redNetherBrickModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> redNetherBrickBuilding = ITEMS.register("red_nether_bricks_building", () -> new BlockItem(ModBlocksWall.redNetherBrickBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> redNetherBrickCastle = ITEMS.register("red_nether_bricks_castle", () -> new BlockItem(ModBlocksWall.redNetherBrickCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> endStoneBrickModern = ITEMS.register("end_stone_bricks_modern", () -> new BlockItem(ModBlocksWall.endStoneBrickModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> endStoneBrickBuilding = ITEMS.register("end_stone_bricks_building", () -> new BlockItem(ModBlocksWall.endStoneBrickBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> endStoneBrickCastle = ITEMS.register("end_stone_bricks_castle", () -> new BlockItem(ModBlocksWall.endStoneBrickCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> blackstoneModern = ITEMS.register("blackstone_modern", () -> new BlockItem(ModBlocksWall.blackstoneModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> blackstoneBuilding = ITEMS.register("blackstone_building", () -> new BlockItem(ModBlocksWall.blackstoneBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> blackstoneCastle = ITEMS.register("blackstone_castle", () -> new BlockItem(ModBlocksWall.blackstoneCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> polishedBlackstoneModern = ITEMS.register("polished_blackstone_modern", () -> new BlockItem(ModBlocksWall.polishedBlackstoneModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> polishedBlackstoneBuilding = ITEMS.register("polished_blackstone_building", () -> new BlockItem(ModBlocksWall.polishedBlackstoneBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> polishedBlackstoneCastle = ITEMS.register("polished_blackstone_castle", () -> new BlockItem(ModBlocksWall.polishedBlackstoneCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> polishedBlackstoneBrickModern = ITEMS.register("polished_blackstone_bricks_modern", () -> new BlockItem(ModBlocksWall.polishedBlackstoneBrickModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> polishedBlackstoneBrickBuilding = ITEMS.register("polished_blackstone_bricks_building", () -> new BlockItem(ModBlocksWall.polishedBlackstoneBrickBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> polishedBlackstoneBrickCastle = ITEMS.register("polished_blackstone_bricks_castle", () -> new BlockItem(ModBlocksWall.polishedBlackstoneBrickCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> cobbledDeepslateModern = ITEMS.register("cobbled_deepslate_modern", () -> new BlockItem(ModBlocksWall.cobbledDeepslateModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobbledDeepslateBuilding = ITEMS.register("cobbled_deepslate_building", () -> new BlockItem(ModBlocksWall.cobbledDeepslateBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobbledDeepslateCastle = ITEMS.register("cobbled_deepslate_castle", () -> new BlockItem(ModBlocksWall.cobbledDeepslateCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> polishedDeepslateModern = ITEMS.register("polished_deepslate_modern", () -> new BlockItem(ModBlocksWall.polishedDeepslateModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> polishedDeepslateBuilding = ITEMS.register("polished_deepslate_building", () -> new BlockItem(ModBlocksWall.polishedDeepslateBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> polishedDeepslateCastle = ITEMS.register("polished_deepslate_castle", () -> new BlockItem(ModBlocksWall.polishedDeepslateCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> deepslateBrickModern = ITEMS.register("deepslate_brick_modern", () -> new BlockItem(ModBlocksWall.deepslateBrickModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> deepslateBrickBuilding = ITEMS.register("deepslate_brick_building", () -> new BlockItem(ModBlocksWall.deepslateBrickBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> deepslateBrickCastle = ITEMS.register("deepslate_brick_castle", () -> new BlockItem(ModBlocksWall.deepslateBrickCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> deepslateTileModern = ITEMS.register("deepslate_tile_modern", () -> new BlockItem(ModBlocksWall.deepslateTileModern.get(), new Item.Properties()));
    public static final RegistryObject<Item> deepslateTileBuilding = ITEMS.register("deepslate_tile_building", () -> new BlockItem(ModBlocksWall.deepslateTileBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> deepslateTileCastle = ITEMS.register("deepslate_tile_castle", () -> new BlockItem(ModBlocksWall.deepslateTileCastle.get(), new Item.Properties()));

    public static final RegistryObject<Item> oakWallBuilding = ITEMS.register("oak_wall_building", () -> new BlockItem(ModBlocksWall.oakWallBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> birchWallBuilding = ITEMS.register("birch_wall_building", () -> new BlockItem(ModBlocksWall.birchWallBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> spruceWallBuilding = ITEMS.register("spruce_wall_building", () -> new BlockItem(ModBlocksWall.spruceWallBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> acaciaWallBuilding = ITEMS.register("acacia_wall_building", () -> new BlockItem(ModBlocksWall.acaciaWallBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> jungleWallBuilding = ITEMS.register("jungle_wall_building", () -> new BlockItem(ModBlocksWall.jungleWallBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> darkoakWallBuilding = ITEMS.register("dark_oak_wall_building", () -> new BlockItem(ModBlocksWall.darkoakWallBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> crimsonWallBuilding = ITEMS.register("crimson_wall_building", () -> new BlockItem(ModBlocksWall.crimsonWallBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> warpedWallBuilding = ITEMS.register("warped_wall_building", () -> new BlockItem(ModBlocksWall.warpedWallBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> mangroveWallBuilding = ITEMS.register("mangrove_wall_building", () -> new BlockItem(ModBlocksWall.mangroveWallBuilding.get(), new Item.Properties()));
    public static final RegistryObject<Item> bambooWallBuilding = ITEMS.register("bamboo_wall_building", () -> new BlockItem(ModBlocksWall.bambooWallBuilding.get(), new Item.Properties()));

    public static final RegistryObject<Item> cobblestoneCopperFence = ITEMS.register("cobblestone_copper_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneCopperFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneExposedCopperFence = ITEMS.register("cobblestone_exposed_copper_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneExposedCopperFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneWeatheredCopperFence = ITEMS.register("cobblestone_weathered_copper_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWeatheredCopperFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneOxidizedCopperFence = ITEMS.register("cobblestone_oxidized_copper_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneOxidizedCopperFence.get(), new Item.Properties()));

    public static final RegistryObject<Item> copperFenceGate = ITEMS.register("copper_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.copperFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> exposedCopperFenceGate = ITEMS.register("exposed_copper_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.exposedCopperFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> weatheredCopperFenceGate = ITEMS.register("weathered_copper_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.weatheredCopperFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oxidizedCopperFenceGate = ITEMS.register("oxidized_copper_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.oxidizedCopperFenceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> cobblestoneWaxedCopperFence = ITEMS.register("cobblestone_waxed_copper_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWaxedCopperFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneWaxedExposedCopperFence = ITEMS.register("cobblestone_waxed_exposed_copper_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWaxedExposedCopperFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneWaxedWeatheredCopperFence = ITEMS.register("cobblestone_waxed_weathered_copper_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWaxedWeatheredCopperFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneWaxedOxidizedCopperFence = ITEMS.register("cobblestone_waxed_oxidized_copper_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWaxedOxidizedCopperFence.get(), new Item.Properties()));

    public static final RegistryObject<Item> waxedCopperFenceGate = ITEMS.register("waxed_copper_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.waxedCopperFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> waxedExposedCopperFenceGate = ITEMS.register("waxed_exposed_copper_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.waxedExposedCopperFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> waxedWeatheredCopperFenceGate = ITEMS.register("waxed_weathered_copper_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.waxedWeatheredCopperFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> waxedOxidizedCopperFenceGate = ITEMS.register("waxed_oxidized_copper_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.waxedOxidizedCopperFenceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> cobblestoneIronFence = ITEMS.register("cobblestone_iron_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneIronFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneExposedIronFence = ITEMS.register("cobblestone_exposed_iron_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneExposedIronFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneWeatheredIronFence = ITEMS.register("cobblestone_weathered_iron_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWeatheredIronFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneOxidizedIronFence = ITEMS.register("cobblestone_oxidized_iron_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneOxidizedIronFence.get(), new Item.Properties()));

    public static final RegistryObject<Item> ironFenceGate = ITEMS.register("iron_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.ironFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> exposedIronFenceGate = ITEMS.register("exposed_iron_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.exposedIronFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> weatheredIronFenceGate = ITEMS.register("weathered_iron_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.weatheredIronFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> oxidizedIronFenceGate = ITEMS.register("oxidized_iron_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.oxidizedIronFenceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> cobblestoneWaxedIronFence = ITEMS.register("cobblestone_waxed_iron_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWaxedIronFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneWaxedExposedIronFence = ITEMS.register("cobblestone_waxed_exposed_iron_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWaxedExposedIronFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneWaxedWeatheredIronFence = ITEMS.register("cobblestone_waxed_weathered_iron_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWaxedWeatheredIronFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> cobblestoneWaxedOxidizedIronFence = ITEMS.register("cobblestone_waxed_oxidized_iron_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneWaxedOxidizedIronFence.get(), new Item.Properties()));

    public static final RegistryObject<Item> waxedIronFenceGate = ITEMS.register("waxed_iron_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.waxedIronFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> waxedExposedIronFenceGate = ITEMS.register("waxed_exposed_iron_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.waxedExposedIronFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> waxedWeatheredIronFenceGate = ITEMS.register("waxed_weathered_iron_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.waxedWeatheredIronFenceGate.get(), new Item.Properties()));
    public static final RegistryObject<Item> waxedOxidizedIronFenceGate = ITEMS.register("waxed_oxidized_iron_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.waxedOxidizedIronFenceGate.get(), new Item.Properties()));

    public static final RegistryObject<Item> cobblestoneGoldFence = ITEMS.register("cobblestone_gold_fence", () -> new BlockItem(ModBlocksMetalFence.cobblestoneGoldFence.get(), new Item.Properties()));
    public static final RegistryObject<Item> goldFenceGate = ITEMS.register("gold_fence_gate_closed", () -> new BlockItem(ModBlocksMetalFence.goldFenceGate.get(), new Item.Properties()));

}
