package com.raptor.customfence.init;

import com.google.common.collect.ImmutableBiMap;
import com.raptor.customfence.Main;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.state.StateContainer;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Locale;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> HHOakGate = ITEMS.register("hhoak_fence_gate_closed", () -> new BlockItem(ModBlocks.HHOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHHOakGate = ITEMS.register("hhhoak_fence_gate_closed", () -> new BlockItem(ModBlocks.HHHOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHOakVVOakGate = ITEMS.register("hhoak_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.HHOakVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> HHBirchGate = ITEMS.register("hhbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.HHBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHHBirchGate = ITEMS.register("hhhbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.HHHBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHBirchVVBirchGate = ITEMS.register("hhbirch_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.HHBirchVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> HHSpruceGate = ITEMS.register("hhspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.HHSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHHSpruceGate = ITEMS.register("hhhspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.HHHSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHSpruceVVSpruceGate = ITEMS.register("hhspruce_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.HHSpruceVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> HHJungleGate = ITEMS.register("hhjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.HHJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHHJungleGate = ITEMS.register("hhhjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.HHHJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHJungleVVJungleGate = ITEMS.register("hhjungle_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.HHJungleVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> HHAcaciaGate = ITEMS.register("hhacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.HHAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHHAcaciaGate = ITEMS.register("hhhacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.HHHAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHAcaciaVVAcaciaGate = ITEMS.register("hhacacia_vvacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.HHAcaciaVVAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> HHDarkoakGate = ITEMS.register("hhdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.HHDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHHDarkoakGate = ITEMS.register("hhhdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.HHHDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHDarkoakVVDarkoakGate = ITEMS.register("hhdark_oak_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.HHDarkoakVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> HHWarpedGate = ITEMS.register("hhwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.HHWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHHWarpedGate = ITEMS.register("hhhwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.HHHWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHWarpedVVWarpedGate = ITEMS.register("hhwarped_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.HHWarpedVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> HHCrimsonGate = ITEMS.register("hhcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.HHCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHHCrimsonGate = ITEMS.register("hhhcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.HHHCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> HHCrimsonVVCrimsonGate = ITEMS.register("hhcrimson_vvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.HHCrimsonVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> spruceHHOak = ITEMS.register("spruce_hhoak", () -> new BlockItem(ModBlocks.spruceHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHHOak = ITEMS.register("spruce_hhhoak", () -> new BlockItem(ModBlocks.spruceHHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHOakVSpruce = ITEMS.register("spruce_hhoak_vspruce", () -> new BlockItem(ModBlocks.spruceHHOakVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHOakVSpruceGate = ITEMS.register("spruce_hhoak_vspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHOakVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHOakVVOak = ITEMS.register("spruce_hhoak_vvoak", () -> new BlockItem(ModBlocks.spruceHHOakVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVVOak = ITEMS.register("spruce_hhspruce_vvvoak", () -> new BlockItem(ModBlocks.spruceHHSpruceVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVVOakGate = ITEMS.register("spruce_hhspruce_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHSpruceVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHSpruceVVOak = ITEMS.register("spruce_hhspruce_vvoak", () -> new BlockItem(ModBlocks.spruceHHSpruceVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVOakGate = ITEMS.register("spruce_hhspruce_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHSpruceVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHHOakVVVVSpruceVVVVSpruce = ITEMS.register("spruce_hhhoak_vvvvspruce_vvvvspruce", () -> new BlockItem(ModBlocks.spruceHHHOakVVVVSpruceVVVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHHOakVVVVSpruceVVVVSpruceGate = ITEMS.register("spruce_hhhoak_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHHOakVVVVSpruceVVVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> oakHHSpruce = ITEMS.register("oak_hhspruce", () -> new BlockItem(ModBlocks.oakHHSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHSpruce = ITEMS.register("oak_hhhspruce", () -> new BlockItem(ModBlocks.oakHHHSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHSpruceVOak = ITEMS.register("oak_hhspruce_voak", () -> new BlockItem(ModBlocks.oakHHSpruceVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHSpruceVOakGate = ITEMS.register("oak_hhspruce_voak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHSpruceVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHSpruceVVSpruce = ITEMS.register("oak_hhspruce_vvspruce", () -> new BlockItem(ModBlocks.oakHHSpruceVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVSpruce = ITEMS.register("oak_hhoak_vvvspruce", () -> new BlockItem(ModBlocks.oakHHOakVVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVSpruceGate = ITEMS.register("oak_hhoak_vvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHOakVVSpruce = ITEMS.register("oak_hhoak_vvspruce", () -> new BlockItem(ModBlocks.oakHHOakVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVSpruceGate = ITEMS.register("oak_hhoak_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHHSpruceVVVVOakVVVVOak = ITEMS.register("oak_hhhspruce_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocks.oakHHHSpruceVVVVOakVVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHSpruceVVVVOakVVVVOakGate = ITEMS.register("oak_hhhspruce_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHHSpruceVVVVOakVVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> oakHHBirch = ITEMS.register("oak_hhbirch", () -> new BlockItem(ModBlocks.oakHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHBirch = ITEMS.register("oak_hhhbirch", () -> new BlockItem(ModBlocks.oakHHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHBirchVOak = ITEMS.register("oak_hhbirch_voak", () -> new BlockItem(ModBlocks.oakHHBirchVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHBirchVOakGate = ITEMS.register("oak_hhbirch_voak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHBirchVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHBirchVVBirch = ITEMS.register("oak_hhbirch_vvbirch", () -> new BlockItem(ModBlocks.oakHHBirchVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVBirch = ITEMS.register("oak_hhoak_vvvbirch", () -> new BlockItem(ModBlocks.oakHHOakVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVBirchGate = ITEMS.register("oak_hhoak_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHOakVVBirch = ITEMS.register("oak_hhoak_vvbirch", () -> new BlockItem(ModBlocks.oakHHOakVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVBirchGate = ITEMS.register("oak_hhoak_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHHBirchVVVVOakVVVVOak = ITEMS.register("oak_hhhbirch_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocks.oakHHHBirchVVVVOakVVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHBirchVVVVOakVVVVOakGate = ITEMS.register("oak_hhhbirch_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHHBirchVVVVOakVVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> birchHHOak = ITEMS.register("birch_hhoak", () -> new BlockItem(ModBlocks.birchHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHOak = ITEMS.register("birch_hhhoak", () -> new BlockItem(ModBlocks.birchHHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHOakVBirch = ITEMS.register("birch_hhoak_vbirch", () -> new BlockItem(ModBlocks.birchHHOakVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHOakVBirchGate = ITEMS.register("birch_hhoak_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHOakVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHOakVVOak = ITEMS.register("birch_hhoak_vvoak", () -> new BlockItem(ModBlocks.birchHHOakVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVOak = ITEMS.register("birch_hhbirch_vvvoak", () -> new BlockItem(ModBlocks.birchHHBirchVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVOakGate = ITEMS.register("birch_hhbirch_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHBirchVVOak = ITEMS.register("birch_hhbirch_vvoak", () -> new BlockItem(ModBlocks.birchHHBirchVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVOakGate = ITEMS.register("birch_hhbirch_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHHOakVVVVBirchVVVVBirch = ITEMS.register("birch_hhhoak_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocks.birchHHHOakVVVVBirchVVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHOakVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhoak_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHHOakVVVVBirchVVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> spruceHHBirch = ITEMS.register("spruce_hhbirch", () -> new BlockItem(ModBlocks.spruceHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHHBirch = ITEMS.register("spruce_hhhbirch", () -> new BlockItem(ModBlocks.spruceHHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHBirchVSpruce = ITEMS.register("spruce_hhbirch_vspruce", () -> new BlockItem(ModBlocks.spruceHHBirchVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHBirchVSpruceGate = ITEMS.register("spruce_hhbirch_vspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHBirchVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHBirchVVBirch = ITEMS.register("spruce_hhbirch_vvbirch", () -> new BlockItem(ModBlocks.spruceHHBirchVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVVBirch = ITEMS.register("spruce_hhspruce_vvvbirch", () -> new BlockItem(ModBlocks.spruceHHSpruceVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVVBirchGate = ITEMS.register("spruce_hhspruce_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHSpruceVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHSpruceVVBirch = ITEMS.register("spruce_hhspruce_vvbirch", () -> new BlockItem(ModBlocks.spruceHHSpruceVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVBirchGate = ITEMS.register("spruce_hhspruce_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHSpruceVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHHBirchVVVVSpruceVVVVSpruce = ITEMS.register("spruce_hhhbirch_vvvvspruce_vvvvspruce", () -> new BlockItem(ModBlocks.spruceHHHBirchVVVVSpruceVVVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHHBirchVVVVSpruceVVVVSpruceGate = ITEMS.register("spruce_hhhbirch_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHHBirchVVVVSpruceVVVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> birchHHSpruce = ITEMS.register("birch_hhspruce", () -> new BlockItem(ModBlocks.birchHHSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHSpruce = ITEMS.register("birch_hhhspruce", () -> new BlockItem(ModBlocks.birchHHHSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHSpruceVBirch = ITEMS.register("birch_hhspruce_vbirch", () -> new BlockItem(ModBlocks.birchHHSpruceVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHSpruceVBirchGate = ITEMS.register("birch_hhspruce_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHSpruceVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHSpruceVVSpruce = ITEMS.register("birch_hhspruce_vvspruce", () -> new BlockItem(ModBlocks.birchHHSpruceVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVSpruce = ITEMS.register("birch_hhbirch_vvvspruce", () -> new BlockItem(ModBlocks.birchHHBirchVVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVSpruceGate = ITEMS.register("birch_hhbirch_vvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHBirchVVSpruce = ITEMS.register("birch_hhbirch_vvspruce", () -> new BlockItem(ModBlocks.birchHHBirchVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVSpruceGate = ITEMS.register("birch_hhbirch_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHHSpruceVVVVBirchVVVVBirch = ITEMS.register("birch_hhhspruce_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocks.birchHHHSpruceVVVVBirchVVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHSpruceVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhspruce_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHHSpruceVVVVBirchVVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> darkoakHHSpruce = ITEMS.register("dark_oak_hhspruce", () -> new BlockItem(ModBlocks.darkoakHHSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHHSpruce = ITEMS.register("dark_oak_hhhspruce", () -> new BlockItem(ModBlocks.darkoakHHHSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHSpruceVDarkoak = ITEMS.register("dark_oak_hhspruce_vdark_oak", () -> new BlockItem(ModBlocks.darkoakHHSpruceVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHSpruceVDarkoakGate = ITEMS.register("dark_oak_hhspruce_vdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHSpruceVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHSpruceVVSpruce = ITEMS.register("dark_oak_hhspruce_vvspruce", () -> new BlockItem(ModBlocks.darkoakHHSpruceVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVSpruce = ITEMS.register("dark_oak_hhdark_oak_vvvspruce", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVSpruceGate = ITEMS.register("dark_oak_hhdark_oak_vvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVSpruce = ITEMS.register("dark_oak_hhdark_oak_vvspruce", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVSpruceGate = ITEMS.register("dark_oak_hhdark_oak_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHHSpruceVVVVDarkoakVVVVDarkoak = ITEMS.register("dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak", () -> new BlockItem(ModBlocks.darkoakHHHSpruceVVVVDarkoakVVVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate = ITEMS.register("dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> spruceHHDarkoak = ITEMS.register("spruce_hhdark_oak", () -> new BlockItem(ModBlocks.spruceHHDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHHDarkoak = ITEMS.register("spruce_hhhdark_oak", () -> new BlockItem(ModBlocks.spruceHHHDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHDarkoakVSpruce = ITEMS.register("spruce_hhdark_oak_vspruce", () -> new BlockItem(ModBlocks.spruceHHDarkoakVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHDarkoakVSpruceGate = ITEMS.register("spruce_hhdark_oak_vspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHDarkoakVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHDarkoakVVDarkoak = ITEMS.register("spruce_hhdark_oak_vvdark_oak", () -> new BlockItem(ModBlocks.spruceHHDarkoakVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVVDarkoak = ITEMS.register("spruce_hhspruce_vvvdark_oak", () -> new BlockItem(ModBlocks.spruceHHSpruceVVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVVDarkoakGate = ITEMS.register("spruce_hhspruce_vvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHSpruceVVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHSpruceVVDarkoak = ITEMS.register("spruce_hhspruce_vvdark_oak", () -> new BlockItem(ModBlocks.spruceHHSpruceVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVDarkoakGate = ITEMS.register("spruce_hhspruce_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHSpruceVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHHDarkoakVVVVSpruceVVVVSpruce = ITEMS.register("spruce_hhhdark_oak_vvvvspruce_vvvvspruce", () -> new BlockItem(ModBlocks.spruceHHHDarkoakVVVVSpruceVVVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHHDarkoakVVVVSpruceVVVVSpruceGate = ITEMS.register("spruce_hhhdark_oak_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHHDarkoakVVVVSpruceVVVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> darkoakHHOak = ITEMS.register("dark_oak_hhoak", () -> new BlockItem(ModBlocks.darkoakHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHHOak = ITEMS.register("dark_oak_hhhoak", () -> new BlockItem(ModBlocks.darkoakHHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHOakVDarkoak = ITEMS.register("dark_oak_hhoak_vdark_oak", () -> new BlockItem(ModBlocks.darkoakHHOakVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHOakVDarkoakGate = ITEMS.register("dark_oak_hhoak_vdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHOakVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHOakVVOak = ITEMS.register("dark_oak_hhoak_vvoak", () -> new BlockItem(ModBlocks.darkoakHHOakVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVOak = ITEMS.register("dark_oak_hhdark_oak_vvvoak", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVOakGate = ITEMS.register("dark_oak_hhdark_oak_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVOak = ITEMS.register("dark_oak_hhdark_oak_vvoak", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVOakGate = ITEMS.register("dark_oak_hhdark_oak_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHHOakVVVVDarkoakVVVVDarkoak = ITEMS.register("dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak", () -> new BlockItem(ModBlocks.darkoakHHHOakVVVVDarkoakVVVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHHOakVVVVDarkoakVVVVDarkoakGate = ITEMS.register("dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHHOakVVVVDarkoakVVVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
 
    public static final RegistryObject<Item> oakHHDarkoak = ITEMS.register("oak_hhdark_oak", () -> new BlockItem(ModBlocks.oakHHDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHDarkoak = ITEMS.register("oak_hhhdark_oak", () -> new BlockItem(ModBlocks.oakHHHDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHDarkoakVOak = ITEMS.register("oak_hhdark_oak_voak", () -> new BlockItem(ModBlocks.oakHHDarkoakVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHDarkoakVOakGate = ITEMS.register("oak_hhdark_oak_voak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHDarkoakVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHDarkoakVVDarkoak = ITEMS.register("oak_hhdark_oak_vvdark_oak", () -> new BlockItem(ModBlocks.oakHHDarkoakVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVDarkoak = ITEMS.register("oak_hhoak_vvvdark_oak", () -> new BlockItem(ModBlocks.oakHHOakVVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVDarkoakGate = ITEMS.register("oak_hhoak_vvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHOakVVDarkoak = ITEMS.register("oak_hhoak_vvdark_oak", () -> new BlockItem(ModBlocks.oakHHOakVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVDarkoakGate = ITEMS.register("oak_hhoak_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHHDarkoakVVVVOakVVVVOak = ITEMS.register("oak_hhhdark_oak_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocks.oakHHHDarkoakVVVVOakVVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHDarkoakVVVVOakVVVVOakGate = ITEMS.register("oak_hhhdark_oak_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHHDarkoakVVVVOakVVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> darkoakHHJungle = ITEMS.register("dark_oak_hhjungle", () -> new BlockItem(ModBlocks.darkoakHHJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHHJungle = ITEMS.register("dark_oak_hhhjungle", () -> new BlockItem(ModBlocks.darkoakHHHJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHJungleVDarkoak = ITEMS.register("dark_oak_hhjungle_vdark_oak", () -> new BlockItem(ModBlocks.darkoakHHJungleVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHJungleVDarkoakGate = ITEMS.register("dark_oak_hhjungle_vdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHJungleVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHJungleVVJungle = ITEMS.register("dark_oak_hhjungle_vvjungle", () -> new BlockItem(ModBlocks.darkoakHHJungleVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVJungle = ITEMS.register("dark_oak_hhdark_oak_vvvjungle", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVJungleGate = ITEMS.register("dark_oak_hhdark_oak_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVJungle = ITEMS.register("dark_oak_hhdark_oak_vvjungle", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVJungleGate = ITEMS.register("dark_oak_hhdark_oak_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHHJungleVVVVDarkoakVVVVDarkoak = ITEMS.register("dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak", () -> new BlockItem(ModBlocks.darkoakHHHJungleVVVVDarkoakVVVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate = ITEMS.register("dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> jungleHHDarkoak = ITEMS.register("jungle_hhdark_oak", () -> new BlockItem(ModBlocks.jungleHHDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHHDarkoak = ITEMS.register("jungle_hhhdark_oak", () -> new BlockItem(ModBlocks.jungleHHHDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHDarkoakVJungle = ITEMS.register("jungle_hhdark_oak_vjungle", () -> new BlockItem(ModBlocks.jungleHHDarkoakVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHDarkoakVJungleGate = ITEMS.register("jungle_hhdark_oak_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHDarkoakVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHDarkoakVVDarkoak = ITEMS.register("jungle_hhdark_oak_vvdark_oak", () -> new BlockItem(ModBlocks.jungleHHDarkoakVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVVDarkoak = ITEMS.register("jungle_hhjungle_vvvdark_oak", () -> new BlockItem(ModBlocks.jungleHHJungleVVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVVDarkoakGate = ITEMS.register("jungle_hhjungle_vvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHJungleVVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHJungleVVDarkoak = ITEMS.register("jungle_hhjungle_vvdark_oak", () -> new BlockItem(ModBlocks.jungleHHJungleVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVDarkoakGate = ITEMS.register("jungle_hhjungle_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHJungleVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHHDarkoakVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhdark_oak_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocks.jungleHHHDarkoakVVVVJungleVVVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHHDarkoakVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhdark_oak_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHHDarkoakVVVVJungleVVVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> acaciaHHJungle = ITEMS.register("acacia_hhjungle", () -> new BlockItem(ModBlocks.acaciaHHJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHHJungle = ITEMS.register("acacia_hhhjungle", () -> new BlockItem(ModBlocks.acaciaHHHJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHJungleVAcacia = ITEMS.register("acacia_hhjungle_vacacia", () -> new BlockItem(ModBlocks.acaciaHHJungleVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHJungleVAcaciaGate = ITEMS.register("acacia_hhjungle_vacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.acaciaHHJungleVAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> acaciaHHJungleVVJungle = ITEMS.register("acacia_hhjungle_vvjungle", () -> new BlockItem(ModBlocks.acaciaHHJungleVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVJungle = ITEMS.register("acacia_hhacacia_vvvjungle", () -> new BlockItem(ModBlocks.acaciaHHAcaciaVVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVJungleGate = ITEMS.register("acacia_hhacacia_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.acaciaHHAcaciaVVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> acaciaHHAcaciaVVJungle = ITEMS.register("acacia_hhacacia_vvjungle", () -> new BlockItem(ModBlocks.acaciaHHAcaciaVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHAcaciaVVJungleGate = ITEMS.register("acacia_hhacacia_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.acaciaHHAcaciaVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> acaciaHHHJungleVVVVAcaciaVVVVAcacia = ITEMS.register("acacia_hhhjungle_vvvvacacia_vvvvacacia", () -> new BlockItem(ModBlocks.acaciaHHHJungleVVVVAcaciaVVVVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate = ITEMS.register("acacia_hhhjungle_vvvvacacia_vvvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> jungleHHAcacia = ITEMS.register("jungle_hhacacia", () -> new BlockItem(ModBlocks.jungleHHAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHHAcacia = ITEMS.register("jungle_hhhacacia", () -> new BlockItem(ModBlocks.jungleHHHAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHAcaciaVJungle = ITEMS.register("jungle_hhacacia_vjungle", () -> new BlockItem(ModBlocks.jungleHHAcaciaVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHAcaciaVJungleGate = ITEMS.register("jungle_hhacacia_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHAcaciaVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHAcaciaVVAcacia = ITEMS.register("jungle_hhacacia_vvacacia", () -> new BlockItem(ModBlocks.jungleHHAcaciaVVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVVAcacia = ITEMS.register("jungle_hhjungle_vvvacacia", () -> new BlockItem(ModBlocks.jungleHHJungleVVVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVVAcaciaGate = ITEMS.register("jungle_hhjungle_vvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHJungleVVVAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHJungleVVAcacia = ITEMS.register("jungle_hhjungle_vvacacia", () -> new BlockItem(ModBlocks.jungleHHJungleVVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVAcaciaGate = ITEMS.register("jungle_hhjungle_vvacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHJungleVVAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHHAcaciaVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhacacia_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocks.jungleHHHAcaciaVVVVJungleVVVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHHAcaciaVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhacacia_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHHAcaciaVVVVJungleVVVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> acaciaHHBirch = ITEMS.register("acacia_hhbirch", () -> new BlockItem(ModBlocks.acaciaHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHHBirch = ITEMS.register("acacia_hhhbirch", () -> new BlockItem(ModBlocks.acaciaHHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHBirchVAcacia = ITEMS.register("acacia_hhbirch_vacacia", () -> new BlockItem(ModBlocks.acaciaHHBirchVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHBirchVAcaciaGate = ITEMS.register("acacia_hhbirch_vacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.acaciaHHBirchVAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> acaciaHHBirchVVBirch = ITEMS.register("acacia_hhbirch_vvbirch", () -> new BlockItem(ModBlocks.acaciaHHBirchVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVBirch = ITEMS.register("acacia_hhacacia_vvvbirch", () -> new BlockItem(ModBlocks.acaciaHHAcaciaVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHAcaciaVVVBirchGate = ITEMS.register("acacia_hhacacia_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.acaciaHHAcaciaVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> acaciaHHAcaciaVVBirch = ITEMS.register("acacia_hhacacia_vvbirch", () -> new BlockItem(ModBlocks.acaciaHHAcaciaVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHAcaciaVVBirchGate = ITEMS.register("acacia_hhacacia_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.acaciaHHAcaciaVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> acaciaHHHBirchVVVVAcaciaVVVVAcacia = ITEMS.register("acacia_hhhbirch_vvvvacacia_vvvvacacia", () -> new BlockItem(ModBlocks.acaciaHHHBirchVVVVAcaciaVVVVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate = ITEMS.register("acacia_hhhbirch_vvvvacacia_vvvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> birchHHAcacia = ITEMS.register("birch_hhacacia", () -> new BlockItem(ModBlocks.birchHHAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHAcacia = ITEMS.register("birch_hhhacacia", () -> new BlockItem(ModBlocks.birchHHHAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHAcaciaVBirch = ITEMS.register("birch_hhacacia_vbirch", () -> new BlockItem(ModBlocks.birchHHAcaciaVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHAcaciaVBirchGate = ITEMS.register("birch_hhacacia_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHAcaciaVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHAcaciaVVAcacia = ITEMS.register("birch_hhacacia_vvacacia", () -> new BlockItem(ModBlocks.birchHHAcaciaVVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVAcacia = ITEMS.register("birch_hhbirch_vvvacacia", () -> new BlockItem(ModBlocks.birchHHBirchVVVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVAcaciaGate = ITEMS.register("birch_hhbirch_vvvacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVVAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHBirchVVAcacia = ITEMS.register("birch_hhbirch_vvacacia", () -> new BlockItem(ModBlocks.birchHHBirchVVAcacia.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVAcaciaGate = ITEMS.register("birch_hhbirch_vvacacia_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVAcaciaGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHHAcaciaVVVVBirchVVVVBirch = ITEMS.register("birch_hhhacacia_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocks.birchHHHAcaciaVVVVBirchVVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHAcaciaVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhacacia_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHHAcaciaVVVVBirchVVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> jungleHHBirch = ITEMS.register("jungle_hhbirch", () -> new BlockItem(ModBlocks.jungleHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHHBirch = ITEMS.register("jungle_hhhbirch", () -> new BlockItem(ModBlocks.jungleHHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHBirchVJungle = ITEMS.register("jungle_hhbirch_vjungle", () -> new BlockItem(ModBlocks.jungleHHBirchVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHBirchVJungleGate = ITEMS.register("jungle_hhbirch_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHBirchVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHBirchVVBirch = ITEMS.register("jungle_hhbirch_vvbirch", () -> new BlockItem(ModBlocks.jungleHHBirchVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVVBirch = ITEMS.register("jungle_hhjungle_vvvbirch", () -> new BlockItem(ModBlocks.jungleHHJungleVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVVBirchGate = ITEMS.register("jungle_hhjungle_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHJungleVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHJungleVVBirch = ITEMS.register("jungle_hhjungle_vvbirch", () -> new BlockItem(ModBlocks.jungleHHJungleVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVBirchGate = ITEMS.register("jungle_hhjungle_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHJungleVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHHBirchVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhbirch_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocks.jungleHHHBirchVVVVJungleVVVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHHBirchVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhbirch_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHHBirchVVVVJungleVVVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> birchHHJungle = ITEMS.register("birch_hhjungle", () -> new BlockItem(ModBlocks.birchHHJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHJungle = ITEMS.register("birch_hhhjungle", () -> new BlockItem(ModBlocks.birchHHHJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHJungleVBirch = ITEMS.register("birch_hhjungle_vbirch", () -> new BlockItem(ModBlocks.birchHHJungleVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHJungleVBirchGate = ITEMS.register("birch_hhjungle_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHJungleVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHJungleVVJungle = ITEMS.register("birch_hhjungle_vvjungle", () -> new BlockItem(ModBlocks.birchHHJungleVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVJungle = ITEMS.register("birch_hhbirch_vvvjungle", () -> new BlockItem(ModBlocks.birchHHBirchVVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVJungleGate = ITEMS.register("birch_hhbirch_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHBirchVVJungle = ITEMS.register("birch_hhbirch_vvjungle", () -> new BlockItem(ModBlocks.birchHHBirchVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVJungleGate = ITEMS.register("birch_hhbirch_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHHJungleVVVVBirchVVVVBirch = ITEMS.register("birch_hhhjungle_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocks.birchHHHJungleVVVVBirchVVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHJungleVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhjungle_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHHJungleVVVVBirchVVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> warpedHHBirch = ITEMS.register("warped_hhbirch", () -> new BlockItem(ModBlocks.warpedHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHHBirch = ITEMS.register("warped_hhhbirch", () -> new BlockItem(ModBlocks.warpedHHHBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHBirchVWarped = ITEMS.register("warped_hhbirch_vwarped", () -> new BlockItem(ModBlocks.warpedHHBirchVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHBirchVWarpedGate = ITEMS.register("warped_hhbirch_vwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHBirchVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> warpedHHBirchVVBirch = ITEMS.register("warped_hhbirch_vvbirch", () -> new BlockItem(ModBlocks.warpedHHBirchVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHWarpedVVVBirch = ITEMS.register("warped_hhwarped_vvvbirch", () -> new BlockItem(ModBlocks.warpedHHWarpedVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHWarpedVVVBirchGate = ITEMS.register("warped_hhwarped_vvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHWarpedVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> warpedHHWarpedVVBirch = ITEMS.register("warped_hhwarped_vvbirch", () -> new BlockItem(ModBlocks.warpedHHWarpedVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHWarpedVVBirchGate = ITEMS.register("warped_hhwarped_vvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHWarpedVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> warpedHHHBirchVVVVWarpedVVVVWarped = ITEMS.register("warped_hhhbirch_vvvvwarped_vvvvwarped", () -> new BlockItem(ModBlocks.warpedHHHBirchVVVVWarpedVVVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHHBirchVVVVWarpedVVVVWarpedGate = ITEMS.register("warped_hhhbirch_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHHBirchVVVVWarpedVVVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> birchHHWarped = ITEMS.register("birch_hhwarped", () -> new BlockItem(ModBlocks.birchHHWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHWarped = ITEMS.register("birch_hhhwarped", () -> new BlockItem(ModBlocks.birchHHHWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHWarpedVBirch = ITEMS.register("birch_hhwarped_vbirch", () -> new BlockItem(ModBlocks.birchHHWarpedVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHWarpedVBirchGate = ITEMS.register("birch_hhwarped_vbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHWarpedVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHWarpedVVWarped = ITEMS.register("birch_hhwarped_vvwarped", () -> new BlockItem(ModBlocks.birchHHWarpedVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVWarped = ITEMS.register("birch_hhbirch_vvvwarped", () -> new BlockItem(ModBlocks.birchHHBirchVVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVVWarpedGate = ITEMS.register("birch_hhbirch_vvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHBirchVVWarped = ITEMS.register("birch_hhbirch_vvwarped", () -> new BlockItem(ModBlocks.birchHHBirchVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHBirchVVWarpedGate = ITEMS.register("birch_hhbirch_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHBirchVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> birchHHHWarpedVVVVBirchVVVVBirch = ITEMS.register("birch_hhhwarped_vvvvbirch_vvvvbirch", () -> new BlockItem(ModBlocks.birchHHHWarpedVVVVBirchVVVVBirch.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> birchHHHWarpedVVVVBirchVVVVBirchGate = ITEMS.register("birch_hhhwarped_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new BlockItem(ModBlocks.birchHHHWarpedVVVVBirchVVVVBirchGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> warpedHHOak = ITEMS.register("warped_hhoak", () -> new BlockItem(ModBlocks.warpedHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHHOak = ITEMS.register("warped_hhhoak", () -> new BlockItem(ModBlocks.warpedHHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHOakVWarped = ITEMS.register("warped_hhoak_vwarped", () -> new BlockItem(ModBlocks.warpedHHOakVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHOakVWarpedGate = ITEMS.register("warped_hhoak_vwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHOakVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> warpedHHOakVVOak = ITEMS.register("warped_hhoak_vvoak", () -> new BlockItem(ModBlocks.warpedHHOakVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHWarpedVVVOak = ITEMS.register("warped_hhwarped_vvvoak", () -> new BlockItem(ModBlocks.warpedHHWarpedVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHWarpedVVVOakGate = ITEMS.register("warped_hhwarped_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHWarpedVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> warpedHHWarpedVVOak = ITEMS.register("warped_hhwarped_vvoak", () -> new BlockItem(ModBlocks.warpedHHWarpedVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHWarpedVVOakGate = ITEMS.register("warped_hhwarped_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHWarpedVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> warpedHHHOakVVVVWarpedVVVVWarped = ITEMS.register("warped_hhhoak_vvvvwarped_vvvvwarped", () -> new BlockItem(ModBlocks.warpedHHHOakVVVVWarpedVVVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHHOakVVVVWarpedVVVVWarpedGate = ITEMS.register("warped_hhhoak_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHHOakVVVVWarpedVVVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> oakHHWarped = ITEMS.register("oak_hhwarped", () -> new BlockItem(ModBlocks.oakHHWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHWarped = ITEMS.register("oak_hhhwarped", () -> new BlockItem(ModBlocks.oakHHHWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHWarpedVOak = ITEMS.register("oak_hhwarped_voak", () -> new BlockItem(ModBlocks.oakHHWarpedVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHWarpedVOakGate = ITEMS.register("oak_hhwarped_voak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHWarpedVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHWarpedVVWarped = ITEMS.register("oak_hhwarped_vvwarped", () -> new BlockItem(ModBlocks.oakHHWarpedVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVWarped = ITEMS.register("oak_hhoak_vvvwarped", () -> new BlockItem(ModBlocks.oakHHOakVVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVWarpedGate = ITEMS.register("oak_hhoak_vvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHOakVVWarped = ITEMS.register("oak_hhoak_vvwarped", () -> new BlockItem(ModBlocks.oakHHOakVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVWarpedGate = ITEMS.register("oak_hhoak_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHHWarpedVVVVOakVVVVOak = ITEMS.register("oak_hhhwarped_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocks.oakHHHWarpedVVVVOakVVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHWarpedVVVVOakVVVVOakGate = ITEMS.register("oak_hhhwarped_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHHWarpedVVVVOakVVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> warpedHHSpruce = ITEMS.register("warped_hhspruce", () -> new BlockItem(ModBlocks.warpedHHSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHHSpruce = ITEMS.register("warped_hhhspruce", () -> new BlockItem(ModBlocks.warpedHHHSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHSpruceVWarped = ITEMS.register("warped_hhspruce_vwarped", () -> new BlockItem(ModBlocks.warpedHHSpruceVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHSpruceVWarpedGate = ITEMS.register("warped_hhspruce_vwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHSpruceVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> warpedHHSpruceVVSpruce = ITEMS.register("warped_hhspruce_vvspruce", () -> new BlockItem(ModBlocks.warpedHHSpruceVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHWarpedVVVSpruce = ITEMS.register("warped_hhwarped_vvvspruce", () -> new BlockItem(ModBlocks.warpedHHWarpedVVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHWarpedVVVSpruceGate = ITEMS.register("warped_hhwarped_vvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHWarpedVVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> warpedHHWarpedVVSpruce = ITEMS.register("warped_hhwarped_vvspruce", () -> new BlockItem(ModBlocks.warpedHHWarpedVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHWarpedVVSpruceGate = ITEMS.register("warped_hhwarped_vvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHWarpedVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> warpedHHHSpruceVVVVWarpedVVVVWarped = ITEMS.register("warped_hhhspruce_vvvvwarped_vvvvwarped", () -> new BlockItem(ModBlocks.warpedHHHSpruceVVVVWarpedVVVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> warpedHHHSpruceVVVVWarpedVVVVWarpedGate = ITEMS.register("warped_hhhspruce_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.warpedHHHSpruceVVVVWarpedVVVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> spruceHHWarped = ITEMS.register("spruce_hhwarped", () -> new BlockItem(ModBlocks.spruceHHWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHHWarped = ITEMS.register("spruce_hhhwarped", () -> new BlockItem(ModBlocks.spruceHHHWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHWarpedVSpruce = ITEMS.register("spruce_hhwarped_vspruce", () -> new BlockItem(ModBlocks.spruceHHWarpedVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHWarpedVSpruceGate = ITEMS.register("spruce_hhwarped_vspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHWarpedVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHWarpedVVWarped = ITEMS.register("spruce_hhwarped_vvwarped", () -> new BlockItem(ModBlocks.spruceHHWarpedVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVVWarped = ITEMS.register("spruce_hhspruce_vvvwarped", () -> new BlockItem(ModBlocks.spruceHHSpruceVVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVVWarpedGate = ITEMS.register("spruce_hhspruce_vvvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHSpruceVVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHSpruceVVWarped = ITEMS.register("spruce_hhspruce_vvwarped", () -> new BlockItem(ModBlocks.spruceHHSpruceVVWarped.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHSpruceVVWarpedGate = ITEMS.register("spruce_hhspruce_vvwarped_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHSpruceVVWarpedGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> spruceHHHWarpedVVVVSpruceVVVVSpruce = ITEMS.register("spruce_hhhwarped_vvvvspruce_vvvvspruce", () -> new BlockItem(ModBlocks.spruceHHHWarpedVVVVSpruceVVVVSpruce.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> spruceHHHWarpedVVVVSpruceVVVVSpruceGate = ITEMS.register("spruce_hhhwarped_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new BlockItem(ModBlocks.spruceHHHWarpedVVVVSpruceVVVVSpruceGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> crimsonHHJungle = ITEMS.register("crimson_hhjungle", () -> new BlockItem(ModBlocks.crimsonHHJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHHJungle = ITEMS.register("crimson_hhhjungle", () -> new BlockItem(ModBlocks.crimsonHHHJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHJungleVCrimson = ITEMS.register("crimson_hhjungle_vcrimson", () -> new BlockItem(ModBlocks.crimsonHHJungleVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHJungleVCrimsonGate = ITEMS.register("crimson_hhjungle_vcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHJungleVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> crimsonHHJungleVVJungle = ITEMS.register("crimson_hhjungle_vvjungle", () -> new BlockItem(ModBlocks.crimsonHHJungleVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVJungle = ITEMS.register("crimson_hhcrimson_vvvjungle", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVJungleGate = ITEMS.register("crimson_hhcrimson_vvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVJungle = ITEMS.register("crimson_hhcrimson_vvjungle", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVJungleGate = ITEMS.register("crimson_hhcrimson_vvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> crimsonHHHJungleVVVVCrimsonVVVVCrimson = ITEMS.register("crimson_hhhjungle_vvvvcrimson_vvvvcrimson", () -> new BlockItem(ModBlocks.crimsonHHHJungleVVVVCrimsonVVVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate = ITEMS.register("crimson_hhhjungle_vvvvcrimson_vvvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> jungleHHCrimson = ITEMS.register("jungle_hhcrimson", () -> new BlockItem(ModBlocks.jungleHHCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHHCrimson = ITEMS.register("jungle_hhhcrimson", () -> new BlockItem(ModBlocks.jungleHHHCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHCrimsonVJungle = ITEMS.register("jungle_hhcrimson_vjungle", () -> new BlockItem(ModBlocks.jungleHHCrimsonVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHCrimsonVJungleGate = ITEMS.register("jungle_hhcrimson_vjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHCrimsonVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHCrimsonVVCrimson = ITEMS.register("jungle_hhcrimson_vvcrimson", () -> new BlockItem(ModBlocks.jungleHHCrimsonVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVVCrimson = ITEMS.register("jungle_hhjungle_vvvcrimson", () -> new BlockItem(ModBlocks.jungleHHJungleVVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVVCrimsonGate = ITEMS.register("jungle_hhjungle_vvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHJungleVVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHJungleVVCrimson = ITEMS.register("jungle_hhjungle_vvcrimson", () -> new BlockItem(ModBlocks.jungleHHJungleVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHJungleVVCrimsonGate = ITEMS.register("jungle_hhjungle_vvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHJungleVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> jungleHHHCrimsonVVVVJungleVVVVJungle = ITEMS.register("jungle_hhhcrimson_vvvvjungle_vvvvjungle", () -> new BlockItem(ModBlocks.jungleHHHCrimsonVVVVJungleVVVVJungle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> jungleHHHCrimsonVVVVJungleVVVVJungleGate = ITEMS.register("jungle_hhhcrimson_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new BlockItem(ModBlocks.jungleHHHCrimsonVVVVJungleVVVVJungleGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> crimsonHHOak = ITEMS.register("crimson_hhoak", () -> new BlockItem(ModBlocks.crimsonHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHHOak = ITEMS.register("crimson_hhhoak", () -> new BlockItem(ModBlocks.crimsonHHHOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHOakVCrimson = ITEMS.register("crimson_hhoak_vcrimson", () -> new BlockItem(ModBlocks.crimsonHHOakVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHOakVCrimsonGate = ITEMS.register("crimson_hhoak_vcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHOakVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> crimsonHHOakVVOak = ITEMS.register("crimson_hhoak_vvoak", () -> new BlockItem(ModBlocks.crimsonHHOakVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVOak = ITEMS.register("crimson_hhcrimson_vvvoak", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVOakGate = ITEMS.register("crimson_hhcrimson_vvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVOak = ITEMS.register("crimson_hhcrimson_vvoak", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVOakGate = ITEMS.register("crimson_hhcrimson_vvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> crimsonHHHOakVVVVCrimsonVVVVCrimson = ITEMS.register("crimson_hhhoak_vvvvcrimson_vvvvcrimson", () -> new BlockItem(ModBlocks.crimsonHHHOakVVVVCrimsonVVVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHHOakVVVVCrimsonVVVVCrimsonGate = ITEMS.register("crimson_hhhoak_vvvvcrimson_vvvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHHOakVVVVCrimsonVVVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> oakHHCrimson = ITEMS.register("oak_hhcrimson", () -> new BlockItem(ModBlocks.oakHHCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHCrimson = ITEMS.register("oak_hhhcrimson", () -> new BlockItem(ModBlocks.oakHHHCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHCrimsonVOak = ITEMS.register("oak_hhcrimson_voak", () -> new BlockItem(ModBlocks.oakHHCrimsonVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHCrimsonVOakGate = ITEMS.register("oak_hhcrimson_voak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHCrimsonVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHCrimsonVVCrimson = ITEMS.register("oak_hhcrimson_vvcrimson", () -> new BlockItem(ModBlocks.oakHHCrimsonVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVCrimson = ITEMS.register("oak_hhoak_vvvcrimson", () -> new BlockItem(ModBlocks.oakHHOakVVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVVCrimsonGate = ITEMS.register("oak_hhoak_vvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHOakVVCrimson = ITEMS.register("oak_hhoak_vvcrimson", () -> new BlockItem(ModBlocks.oakHHOakVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHOakVVCrimsonGate = ITEMS.register("oak_hhoak_vvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHOakVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> oakHHHCrimsonVVVVOakVVVVOak = ITEMS.register("oak_hhhcrimson_vvvvoak_vvvvoak", () -> new BlockItem(ModBlocks.oakHHHCrimsonVVVVOakVVVVOak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> oakHHHCrimsonVVVVOakVVVVOakGate = ITEMS.register("oak_hhhcrimson_vvvvoak_vvvvoak_fence_gate_closed", () -> new BlockItem(ModBlocks.oakHHHCrimsonVVVVOakVVVVOakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    
    public static final RegistryObject<Item> crimsonHHDarkoak = ITEMS.register("crimson_hhdark_oak", () -> new BlockItem(ModBlocks.crimsonHHDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHHDarkoak = ITEMS.register("crimson_hhhdark_oak", () -> new BlockItem(ModBlocks.crimsonHHHDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHDarkoakVCrimson = ITEMS.register("crimson_hhdark_oak_vcrimson", () -> new BlockItem(ModBlocks.crimsonHHDarkoakVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHDarkoakVCrimsonGate = ITEMS.register("crimson_hhdark_oak_vcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHDarkoakVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> crimsonHHDarkoakVVDarkoak = ITEMS.register("crimson_hhdark_oak_vvdark_oak", () -> new BlockItem(ModBlocks.crimsonHHDarkoakVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVDarkoak = ITEMS.register("crimson_hhcrimson_vvvdark_oak", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVVDarkoakGate = ITEMS.register("crimson_hhcrimson_vvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVDarkoak = ITEMS.register("crimson_hhcrimson_vvdark_oak", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHCrimsonVVDarkoakGate = ITEMS.register("crimson_hhcrimson_vvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHCrimsonVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> crimsonHHHDarkoakVVVVCrimsonVVVVCrimson = ITEMS.register("crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson", () -> new BlockItem(ModBlocks.crimsonHHHDarkoakVVVVCrimsonVVVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate = ITEMS.register("crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> darkoakHHCrimson = ITEMS.register("dark_oak_hhcrimson", () -> new BlockItem(ModBlocks.darkoakHHCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHHCrimson = ITEMS.register("dark_oak_hhhcrimson", () -> new BlockItem(ModBlocks.darkoakHHHCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHCrimsonVDarkoak = ITEMS.register("dark_oak_hhcrimson_vdark_oak", () -> new BlockItem(ModBlocks.darkoakHHCrimsonVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHCrimsonVDarkoakGate = ITEMS.register("dark_oak_hhcrimson_vdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHCrimsonVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHCrimsonVVCrimson = ITEMS.register("dark_oak_hhcrimson_vvcrimson", () -> new BlockItem(ModBlocks.darkoakHHCrimsonVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVCrimson = ITEMS.register("dark_oak_hhdark_oak_vvvcrimson", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVVCrimsonGate = ITEMS.register("dark_oak_hhdark_oak_vvvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVCrimson = ITEMS.register("dark_oak_hhdark_oak_vvcrimson", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVCrimson.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHDarkoakVVCrimsonGate = ITEMS.register("dark_oak_hhdark_oak_vvcrimson_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHDarkoakVVCrimsonGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));
    public static final RegistryObject<Item> darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak = ITEMS.register("dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak", () -> new BlockItem(ModBlocks.darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate = ITEMS.register("dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new BlockItem(ModBlocks.darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> cobblestoneModern = ITEMS.register("cobblestone_modern", () -> new BlockItem(ModBlocks.cobblestoneModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> cobblestoneBuilding = ITEMS.register("cobblestone_building", () -> new BlockItem(ModBlocks.cobblestoneBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> cobblestoneCastle = ITEMS.register("cobblestone_castle", () -> new BlockItem(ModBlocks.cobblestoneCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));

    public static final RegistryObject<Item> mossyCobblestoneModern = ITEMS.register("mossy_cobblestone_modern", () -> new BlockItem(ModBlocks.mossyCobblestoneModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> mossyCobblestoneBuilding = ITEMS.register("mossy_cobblestone_building", () -> new BlockItem(ModBlocks.mossyCobblestoneBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> mossyCobblestoneCastle = ITEMS.register("mossy_cobblestone_castle", () -> new BlockItem(ModBlocks.mossyCobblestoneCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> stoneModern = ITEMS.register("stone_modern", () -> new BlockItem(ModBlocks.stoneModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> stoneBuilding = ITEMS.register("stone_building", () -> new BlockItem(ModBlocks.stoneBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> stoneCastle = ITEMS.register("stone_castle", () -> new BlockItem(ModBlocks.stoneCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> stoneBrickModern = ITEMS.register("stone_bricks_modern", () -> new BlockItem(ModBlocks.stoneBrickModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> stoneBrickBuilding = ITEMS.register("stone_bricks_building", () -> new BlockItem(ModBlocks.stoneBrickBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> stoneBrickCastle = ITEMS.register("stone_bricks_castle", () -> new BlockItem(ModBlocks.stoneBrickCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> mossyStoneBrickModern = ITEMS.register("mossy_stone_bricks_modern", () -> new BlockItem(ModBlocks.mossyStoneBrickModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> mossyStoneBrickBuilding = ITEMS.register("mossy_stone_bricks_building", () -> new BlockItem(ModBlocks.mossyStoneBrickBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> mossyStoneBrickCastle = ITEMS.register("mossy_stone_bricks_castle", () -> new BlockItem(ModBlocks.mossyStoneBrickCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> andesiteModern = ITEMS.register("andesite_modern", () -> new BlockItem(ModBlocks.andesiteModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> andesiteBuilding = ITEMS.register("andesite_building", () -> new BlockItem(ModBlocks.andesiteBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> andesiteCastle = ITEMS.register("andesite_castle", () -> new BlockItem(ModBlocks.andesiteCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> dioriteModern = ITEMS.register("diorite_modern", () -> new BlockItem(ModBlocks.dioriteModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> dioriteBuilding = ITEMS.register("diorite_building", () -> new BlockItem(ModBlocks.dioriteBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> dioriteCastle = ITEMS.register("diorite_castle", () -> new BlockItem(ModBlocks.dioriteCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> graniteModern = ITEMS.register("granite_modern", () -> new BlockItem(ModBlocks.graniteModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> graniteBuilding = ITEMS.register("granite_building", () -> new BlockItem(ModBlocks.graniteBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> graniteCastle = ITEMS.register("granite_castle", () -> new BlockItem(ModBlocks.graniteCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> sandstoneModern = ITEMS.register("sandstone_modern", () -> new BlockItem(ModBlocks.sandstoneModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> sandstoneBuilding = ITEMS.register("sandstone_building", () -> new BlockItem(ModBlocks.sandstoneBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> sandstoneCastle = ITEMS.register("sandstone_castle", () -> new BlockItem(ModBlocks.sandstoneCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> redSandstoneModern = ITEMS.register("red_sandstone_modern", () -> new BlockItem(ModBlocks.redSandstoneModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> redSandstoneBuilding = ITEMS.register("red_sandstone_building", () -> new BlockItem(ModBlocks.redSandstoneBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> redSandstoneCastle = ITEMS.register("red_sandstone_castle", () -> new BlockItem(ModBlocks.redSandstoneCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> brickModern = ITEMS.register("brick_modern", () -> new BlockItem(ModBlocks.brickModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> brickBuilding = ITEMS.register("brick_building", () -> new BlockItem(ModBlocks.brickBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> brickCastle = ITEMS.register("brick_castle", () -> new BlockItem(ModBlocks.brickCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> prismarineModern = ITEMS.register("prismarine_modern", () -> new BlockItem(ModBlocks.prismarineModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> prismarineBuilding = ITEMS.register("prismarine_building", () -> new BlockItem(ModBlocks.prismarineBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> prismarineCastle = ITEMS.register("prismarine_castle", () -> new BlockItem(ModBlocks.prismarineCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> netherBrickModern = ITEMS.register("nether_bricks_modern", () -> new BlockItem(ModBlocks.netherBrickModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> netherBrickBuilding = ITEMS.register("nether_bricks_building", () -> new BlockItem(ModBlocks.netherBrickBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> netherBrickCastle = ITEMS.register("nether_bricks_castle", () -> new BlockItem(ModBlocks.netherBrickCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> redNetherBrickModern = ITEMS.register("red_nether_bricks_modern", () -> new BlockItem(ModBlocks.redNetherBrickModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> redNetherBrickBuilding = ITEMS.register("red_nether_bricks_building", () -> new BlockItem(ModBlocks.redNetherBrickBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> redNetherBrickCastle = ITEMS.register("red_nether_bricks_castle", () -> new BlockItem(ModBlocks.redNetherBrickCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> endStoneBrickModern = ITEMS.register("end_stone_bricks_modern", () -> new BlockItem(ModBlocks.endStoneBrickModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> endStoneBrickBuilding = ITEMS.register("end_stone_bricks_building", () -> new BlockItem(ModBlocks.endStoneBrickBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> endStoneBrickCastle = ITEMS.register("end_stone_bricks_castle", () -> new BlockItem(ModBlocks.endStoneBrickCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> blackstoneModern = ITEMS.register("blackstone_modern", () -> new BlockItem(ModBlocks.blackstoneModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> blackstoneBuilding = ITEMS.register("blackstone_building", () -> new BlockItem(ModBlocks.blackstoneBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> blackstoneCastle = ITEMS.register("blackstone_castle", () -> new BlockItem(ModBlocks.blackstoneCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> polishedBlackstoneModern = ITEMS.register("polished_blackstone_modern", () -> new BlockItem(ModBlocks.polishedBlackstoneModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> polishedBlackstoneBuilding = ITEMS.register("polished_blackstone_building", () -> new BlockItem(ModBlocks.polishedBlackstoneBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> polishedBlackstoneCastle = ITEMS.register("polished_blackstone_castle", () -> new BlockItem(ModBlocks.polishedBlackstoneCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    
    public static final RegistryObject<Item> polishedBlackstoneBrickModern = ITEMS.register("polished_blackstone_bricks_modern", () -> new BlockItem(ModBlocks.polishedBlackstoneBrickModern.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> polishedBlackstoneBrickBuilding = ITEMS.register("polished_blackstone_bricks_building", () -> new BlockItem(ModBlocks.polishedBlackstoneBrickBuilding.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> polishedBlackstoneBrickCastle = ITEMS.register("polished_blackstone_bricks_castle", () -> new BlockItem(ModBlocks.polishedBlackstoneBrickCastle.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));

}
