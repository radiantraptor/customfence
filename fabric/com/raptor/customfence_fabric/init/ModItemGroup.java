package com.raptor.customfence_fabric.init;

import com.raptor.customfence_fabric.Main;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ModItemGroup {

    private static ItemGroup CUSTOMFENCE_WOOD_FENCE;
    private static ItemGroup CUSTOMFENCE_WALL;
    private static ItemGroup CUSTOMFENCE_METAL_FENCE;
    private static ItemGroup CUSTOMFENCE;
    //private static final HashMap<ItemGroup, HashMap<ItemConvertible, ModGroupEntries>> CUSTOMFENCE;
    public static ArrayList<Block> WOOD_FENCE_BLOCKS = fillListWoodFenceBlocks();
    public static ArrayList<Block> WALL_BLOCKS = fillListWallBlocks();
    public static ArrayList<Block> METAL_FENCE_BLOCKS = fillListMetalFenceBlocks();

    public static ArrayList<Block> fillListWoodFenceBlocks() {

        ArrayList<Block> WOOD_FENCE_BLOCK_LIST = new ArrayList<Block>();

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHOakVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHOakXXOakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHBirchVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHBirchXXBirchGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHSpruceVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHSpruceXXSpruceGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHJungleVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHJungleXXJungleGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHAcaciaVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHAcaciaXXAcaciaGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHDarkoakVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHDarkoakXXDarkoakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHWarpedVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHWarpedXXWarpedGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHCrimsonVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHCrimsonXXCrimsonGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHMangroveVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHMangroveXXMangroveGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHHBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHBambooVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.HHBambooXXBambooGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHOakVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHOakVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHOakVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHOakVVVVSpruceVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHOakVVVVSpruceVVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHOakXXOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVOakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHSpruceVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHSpruceVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHSpruceVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHSpruceVVVVOakVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHSpruceVVVVOakVVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHSpruceXXSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVSpruceGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBirchVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBirchVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBirchVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHBirchVVVVOakVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHBirchVVVVOakVVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBirchXXBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVBirchGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHOakVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHOakVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHOakVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHOakVVVVBirchVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHOakVVVVBirchVVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHOakXXOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVOakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBirchVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBirchVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBirchVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHBirchVVVVSpruceVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHBirchVVVVSpruceVVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBirchXXBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVBirchGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHSpruceVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHSpruceVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHSpruceVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHSpruceVVVVBirchVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHSpruceVVVVBirchVVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHSpruceXXSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVSpruceGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHSpruceVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHSpruceVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHSpruceVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHSpruceVVVVDarkoakVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHSpruceXXSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVSpruceGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHDarkoakVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHDarkoakVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHDarkoakVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHDarkoakVVVVSpruceVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHDarkoakVVVVSpruceVVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHDarkoakXXDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVDarkoakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHOakVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHOakVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHOakVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHOakVVVVDarkoakVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHOakVVVVDarkoakVVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHOakXXOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVOakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHDarkoakVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHDarkoakVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHDarkoakVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHDarkoakVVVVOakVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHDarkoakVVVVOakVVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHDarkoakXXDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVDarkoakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHJungleVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHJungleVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHJungleVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHJungleVVVVDarkoakVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHJungleXXJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVJungleGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHDarkoakVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHDarkoakVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHDarkoakVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHDarkoakVVVVJungleVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHDarkoakVVVVJungleVVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHDarkoakXXDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVDarkoakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHJungleVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHJungleVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHJungleVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHHJungleVVVVAcaciaVVVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHJungleXXJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVVJungleGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHAcaciaVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHAcaciaVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHAcaciaVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHAcaciaVVVVJungleVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHAcaciaVVVVJungleVVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHAcaciaXXAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVAcaciaGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBirchVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBirchVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBirchVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHHBirchVVVVAcaciaVVVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBirchXXBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVVBirchGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHAcaciaVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHAcaciaVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHAcaciaVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHAcaciaVVVVBirchVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHAcaciaVVVVBirchVVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHAcaciaXXAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVAcaciaGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBirchVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBirchVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBirchVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHBirchVVVVJungleVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHBirchVVVVJungleVVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBirchXXBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVBirchGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHJungleVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHJungleVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHJungleVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHJungleVVVVBirchVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHJungleVVVVBirchVVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHJungleXXJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVJungleGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBirchVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBirchVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBirchVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHBirchVVVVWarpedVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHBirchVVVVWarpedVVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBirchXXBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVBirchGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHWarpedVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHWarpedVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHWarpedVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHWarpedVVVVBirchVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHWarpedVVVVBirchVVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHWarpedXXWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVWarpedGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHOakVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHOakVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHOakVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHOakVVVVWarpedVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHOakVVVVWarpedVVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHOakXXOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVOakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHWarpedVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHWarpedVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHWarpedVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHWarpedVVVVOakVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHWarpedVVVVOakVVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHWarpedXXWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVWarpedGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHSpruceVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHSpruceVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHSpruceVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHSpruceVVVVWarpedVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHSpruceVVVVWarpedVVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHSpruceXXSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVSpruceGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHWarpedVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHWarpedVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHWarpedVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHWarpedVVVVSpruceVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHWarpedVVVVSpruceVVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHWarpedXXWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVWarpedGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHJungleVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHJungleVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHJungleVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHHJungleVVVVCrimsonVVVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHJungleXXJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVVJungleGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHCrimsonVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHCrimsonVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHCrimsonVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHCrimsonVVVVJungleVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHCrimsonVVVVJungleVVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHCrimsonXXCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVCrimsonGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHOakVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHOakVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHOakVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHHOakVVVVCrimsonVVVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHHOakVVVVCrimsonVVVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHOakXXOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVVOakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHCrimsonVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHCrimsonVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHCrimsonVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHCrimsonVVVVOakVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHCrimsonVVVVOakVVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHCrimsonXXCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVCrimsonGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHDarkoakVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHDarkoakVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHDarkoakVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHHDarkoakVVVVCrimsonVVVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHDarkoakXXDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.crimsonHHCrimsonVVVVDarkoakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHCrimsonVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHCrimsonVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHCrimsonVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVCrimsonGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHCrimsonXXCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVCrimson);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVCrimsonGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHOakVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHOakVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHOakVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHOakVVVVMangroveVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHOakVVVVMangroveVVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHOakXXOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVOakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHMangroveVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHMangroveVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHMangroveVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHMangroveVVVVOakVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHMangroveVVVVOakVVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHMangroveXXMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVMangroveGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHBirchVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHBirchVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHBirchVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHBirchVVVVMangroveVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHBirchVVVVMangroveVVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHBirchXXBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVBirchGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHMangroveVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHMangroveVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHMangroveVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHMangroveVVVVBirchVVVVBirch);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHHMangroveVVVVBirchVVVVBirchGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHMangroveXXMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.birchHHBirchVVVVMangroveGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHJungleVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHJungleVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHJungleVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHJungleVVVVMangroveVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHJungleVVVVMangroveVVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHJungleXXJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVJungleGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHMangroveVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHMangroveVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHMangroveVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHMangroveVVVVJungleVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHMangroveVVVVJungleVVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHMangroveXXMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVMangroveGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHDarkoakVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHDarkoakVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHDarkoakVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHDarkoakVVVVMangroveVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHDarkoakVVVVMangroveVVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHDarkoakXXDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVDarkoakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHMangroveVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHMangroveVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHMangroveVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHMangroveVVVVDarkoakVVVVDarkoak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHHMangroveVVVVDarkoakVVVVDarkoakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHMangroveXXMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.darkoakHHDarkoakVVVVMangroveGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHWarpedVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHWarpedVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHWarpedVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHWarpedVVVVMangroveVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHHWarpedVVVVMangroveVVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHWarpedXXWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.mangroveHHMangroveVVVVWarpedGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHMangroveVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHMangroveVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHMangroveVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVMangroveGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHMangroveVVVVWarpedVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHMangroveVVVVWarpedVVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHMangroveXXMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVMangrove);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVMangroveGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHOakVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHOakVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHOakVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHOakVVVVBambooVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHOakVVVVBambooVVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHOakXXOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVOakGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBambooVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBambooVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBambooVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHBambooVVVVOakVVVVOak);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHHBambooVVVVOakVVVVOakGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHBambooXXBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.oakHHOakVVVVBambooGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHSpruceVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHSpruceVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHSpruceVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHSpruceVVVVBambooVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHSpruceVVVVBambooVVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHSpruceXXSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVSpruceGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBambooVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBambooVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBambooVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHBambooVVVVSpruceVVVVSpruce);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHHBambooVVVVSpruceVVVVSpruceGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHBambooXXBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.spruceHHSpruceVVVVBambooGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHJungleVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHJungleVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHJungleVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHJungleVVVVBambooVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHJungleVVVVBambooVVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHJungleXXJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVJungleGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBambooVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBambooVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBambooVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHBambooVVVVJungleVVVVJungle);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHHBambooVVVVJungleVVVVJungleGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHBambooXXBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.jungleHHJungleVVVVBambooGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHAcaciaVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHAcaciaVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHAcaciaVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHAcaciaVVVVBambooVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHAcaciaVVVVBambooVVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHAcaciaXXAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVAcaciaGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBambooVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBambooVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBambooVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHHBambooVVVVAcaciaVVVVAcacia);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHHBambooVVVVAcaciaVVVVAcaciaGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHBambooXXBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.acaciaHHAcaciaVVVVBambooGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHWarpedVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHWarpedVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHWarpedVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHWarpedVVVVBambooVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHHWarpedVVVVBambooVVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHWarpedXXWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.bambooHHBambooVVVVWarpedGate);

        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBambooVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBambooVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBambooVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVBambooGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHBambooVVVVWarpedVVVVWarped);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHHBambooVVVVWarpedVVVVWarpedGate);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHBambooXXBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVBamboo);
        WOOD_FENCE_BLOCK_LIST.add(ModBlocks.warpedHHWarpedVVVVBambooGate);

        return WOOD_FENCE_BLOCK_LIST;
    }

    public static ArrayList<Block> fillListWallBlocks() {

        ArrayList<Block> WALL_BLOCK_LIST = new ArrayList<Block>();

        WALL_BLOCK_LIST.add(ModBlocks.cobblestoneModern);
        WALL_BLOCK_LIST.add(ModBlocks.cobblestoneBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.cobblestoneCastle);

        WALL_BLOCK_LIST.add(ModBlocks.mossyCobblestoneModern);
        WALL_BLOCK_LIST.add(ModBlocks.mossyCobblestoneBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.mossyCobblestoneCastle);

        WALL_BLOCK_LIST.add(ModBlocks.stoneModern);
        WALL_BLOCK_LIST.add(ModBlocks.stoneBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.stoneCastle);

        WALL_BLOCK_LIST.add(ModBlocks.stoneBrickModern);
        WALL_BLOCK_LIST.add(ModBlocks.stoneBrickBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.stoneBrickCastle);

        WALL_BLOCK_LIST.add(ModBlocks.mossyStoneBrickModern);
        WALL_BLOCK_LIST.add(ModBlocks.mossyStoneBrickBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.mossyStoneBrickCastle);

        WALL_BLOCK_LIST.add(ModBlocks.andesiteModern);
        WALL_BLOCK_LIST.add(ModBlocks.andesiteBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.andesiteCastle);

        WALL_BLOCK_LIST.add(ModBlocks.dioriteModern);
        WALL_BLOCK_LIST.add(ModBlocks.dioriteBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.dioriteCastle);

        WALL_BLOCK_LIST.add(ModBlocks.graniteModern);
        WALL_BLOCK_LIST.add(ModBlocks.graniteBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.graniteCastle);

        WALL_BLOCK_LIST.add(ModBlocks.sandstoneModern);
        WALL_BLOCK_LIST.add(ModBlocks.sandstoneBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.sandstoneCastle);

        WALL_BLOCK_LIST.add(ModBlocks.redSandstoneModern);
        WALL_BLOCK_LIST.add(ModBlocks.redSandstoneBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.redSandstoneCastle);

        WALL_BLOCK_LIST.add(ModBlocks.bricksModern);
        WALL_BLOCK_LIST.add(ModBlocks.bricksBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.bricksCastle);

        WALL_BLOCK_LIST.add(ModBlocks.prismarineModern);
        WALL_BLOCK_LIST.add(ModBlocks.prismarineBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.prismarineCastle);

        WALL_BLOCK_LIST.add(ModBlocks.netherBrickModern);
        WALL_BLOCK_LIST.add(ModBlocks.netherBrickBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.netherBrickCastle);

        WALL_BLOCK_LIST.add(ModBlocks.redNetherBrickModern);
        WALL_BLOCK_LIST.add(ModBlocks.redNetherBrickBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.redNetherBrickCastle);

        WALL_BLOCK_LIST.add(ModBlocks.endStoneBrickModern);
        WALL_BLOCK_LIST.add(ModBlocks.endStoneBrickBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.endStoneBrickCastle);

        WALL_BLOCK_LIST.add(ModBlocks.blackstoneModern);
        WALL_BLOCK_LIST.add(ModBlocks.blackstoneBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.blackstoneCastle);

        WALL_BLOCK_LIST.add(ModBlocks.polishedBlackstoneModern);
        WALL_BLOCK_LIST.add(ModBlocks.polishedBlackstoneBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.polishedBlackstoneCastle);

        WALL_BLOCK_LIST.add(ModBlocks.polishedBlackstoneBrickModern);
        WALL_BLOCK_LIST.add(ModBlocks.polishedBlackstoneBrickBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.polishedBlackstoneBrickCastle);

        WALL_BLOCK_LIST.add(ModBlocks.cobbledDeepslateModern);
        WALL_BLOCK_LIST.add(ModBlocks.cobbledDeepslateBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.cobbledDeepslateCastle);

        WALL_BLOCK_LIST.add(ModBlocks.polishedDeepslateModern);
        WALL_BLOCK_LIST.add(ModBlocks.polishedDeepslateBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.polishedDeepslateCastle);

        WALL_BLOCK_LIST.add(ModBlocks.deepslateBrickModern);
        WALL_BLOCK_LIST.add(ModBlocks.deepslateBrickBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.deepslateBrickCastle);

        WALL_BLOCK_LIST.add(ModBlocks.deepslateTileModern);
        WALL_BLOCK_LIST.add(ModBlocks.deepslateTileBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.deepslateTileCastle);

        WALL_BLOCK_LIST.add(ModBlocks.oakWallBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.birchWallBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.spruceWallBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.acaciaWallBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.jungleWallBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.darkoakWallBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.crimsonWallBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.warpedWallBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.mangroveWallBuilding);
        WALL_BLOCK_LIST.add(ModBlocks.bambooWallBuilding);
        
        return WALL_BLOCK_LIST;
    }

    public static ArrayList<Block> fillListMetalFenceBlocks() {

        ArrayList<Block> METAL_FENCE_BLOCK_LIST = new ArrayList<Block>();

        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneCopperFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneExposedCopperFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWeatheredCopperFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneOxidizedCopperFence);

        METAL_FENCE_BLOCK_LIST.add(ModBlocks.copperFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.exposedCopperFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.weatheredCopperFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.oxidizedCopperFenceGate);

        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWaxedCopperFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWaxedExposedCopperFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWaxedWeatheredCopperFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWaxedOxidizedCopperFence);

        METAL_FENCE_BLOCK_LIST.add(ModBlocks.waxedCopperFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.waxedExposedCopperFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.waxedWeatheredCopperFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.waxedOxidizedCopperFenceGate);

        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneIronFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneExposedIronFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWeatheredIronFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneOxidizedIronFence);

        METAL_FENCE_BLOCK_LIST.add(ModBlocks.ironFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.exposedIronFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.weatheredIronFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.oxidizedIronFenceGate);

        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWaxedIronFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWaxedExposedIronFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWaxedWeatheredIronFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneWaxedOxidizedIronFence);

        METAL_FENCE_BLOCK_LIST.add(ModBlocks.waxedIronFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.waxedExposedIronFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.waxedWeatheredIronFenceGate);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.waxedOxidizedIronFenceGate);

        METAL_FENCE_BLOCK_LIST.add(ModBlocks.cobblestoneGoldFence);
        METAL_FENCE_BLOCK_LIST.add(ModBlocks.goldFenceGate);

        return METAL_FENCE_BLOCK_LIST;
    }


    public static void threeTabs() {

        CUSTOMFENCE_WOOD_FENCE = FabricItemGroup.builder(new Identifier(Main.MOD_ID, "customfence_1_wooden_fence"))
                .displayName(Text.translatable("itemGroup.customfence.tab_customfence_wooden_fence"))
                .icon(() -> new ItemStack(ModBlocks.spruceHHHOak))
                .entries((enabledFeatures, entries, operatorEnabled) -> {
                    for (Block block : WOOD_FENCE_BLOCKS) {
                        entries.add(block);
                    }
                })
                .build();

        CUSTOMFENCE_WALL = FabricItemGroup.builder(new Identifier(Main.MOD_ID, "customfence_2_wall"))
                .displayName(Text.translatable("itemGroup.customfence.tab_customfence_wall"))
                .icon(() -> new ItemStack(ModBlocks.stoneModern))
                .entries((enabledFeatures, entries, operatorEnabled) -> {
                    for (Block block : WALL_BLOCKS) {
                        entries.add(block);
                    }
                })
                .build();

        CUSTOMFENCE_METAL_FENCE = FabricItemGroup.builder(new Identifier(Main.MOD_ID, "customfence_3_metal_fence"))
                .displayName(Text.translatable("itemGroup.customfence.tab_customfence_metal_fence"))
                .icon(() -> new ItemStack(ModBlocks.cobblestoneIronFence))
                .entries((enabledFeatures, entries, operatorEnabled) -> {
                    for (Block block : METAL_FENCE_BLOCKS) {
                        entries.add(block);
                    }
                })
                .build();

    }

    public static void oneTab() {

        CUSTOMFENCE = FabricItemGroup.builder(new Identifier(Main.MOD_ID, "customfence"))
                .displayName(Text.translatable("itemGroup.customfence.tab_customfence"))
                .icon(() -> new ItemStack(ModBlocks.spruceHHHOak))
                .entries((enabledFeatures, entries, operatorEnabled) -> {
                    for (Block block : WOOD_FENCE_BLOCKS) {
                        entries.add(block);
                    }
                    for (Block block : WALL_BLOCKS) {
                        entries.add(block);
                    }
                    for (Block block : METAL_FENCE_BLOCKS) {
                        entries.add(block);
                    }
                })
                .build();
    }

}
