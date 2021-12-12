package com.raptor.customfence_fabric.init;

import com.raptor.customfence_fabric.Main;
import com.raptor.customfence_fabric.blocks.Fence;
import com.raptor.customfence_fabric.blocks.FenceGate;
import com.raptor.customfence_fabric.blocks.Wall;
import com.raptor.customfence_fabric.blocks.WoodWall;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


@SuppressWarnings({"WeakerAccess", "unused"})
public class ModBlocks {

    public static final Block HHOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHHOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHOakVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHOakXXOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block HHBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHHBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHBirchVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHBirchXXBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block HHSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHHSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHSpruceVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHSpruceXXSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block HHJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHHJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHJungleVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHJungleXXJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block HHAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHHAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHAcaciaVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHAcaciaXXAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block HHDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHHDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHDarkoakVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHDarkoakXXDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block HHWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHHWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHWarpedVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHWarpedXXWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block HHCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHHCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHCrimsonVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block HHCrimsonXXCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block spruceHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHOakVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHOakVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHOakVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHOakVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block oakHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHSpruceVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHSpruceVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHSpruceVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHSpruceVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHSpruceVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHSpruceXXSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block oakHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHBirchVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHBirchVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHBirchVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHBirchVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block birchHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHOakVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHOakVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHOakVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHOakVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block spruceHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHBirchVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHBirchVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHBirchVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHBirchVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block birchHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHSpruceVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHSpruceVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHSpruceVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHSpruceVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHSpruceVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHSpruceXXSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block darkoakHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHSpruceVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHSpruceVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHSpruceVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHSpruceVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHSpruceXXSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block spruceHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHDarkoakVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHDarkoakVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHDarkoakVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHDarkoakVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block darkoakHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHOakVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHOakVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHOakVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHOakVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block oakHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHDarkoakVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHDarkoakVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHDarkoakVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHDarkoakVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block darkoakHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHJungleVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHJungleVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHJungleVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block jungleHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHDarkoakVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHDarkoakVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHDarkoakVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHDarkoakVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block acaciaHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHJungleVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHJungleVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHJungleVVVVAcaciaVVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block jungleHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHAcaciaVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHAcaciaVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHAcaciaVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHAcaciaVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHAcaciaVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHAcaciaXXAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block acaciaHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHBirchVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHBirchVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHBirchVVVVAcaciaVVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block birchHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHAcaciaVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHAcaciaVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHAcaciaVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHAcaciaVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHAcaciaVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHAcaciaXXAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block jungleHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHBirchVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHBirchVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHBirchVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHBirchVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block birchHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHJungleVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHJungleVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHJungleVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHJungleVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block warpedHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHBirchVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHBirchVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHBirchVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHBirchVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block birchHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHWarpedVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHWarpedVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHWarpedVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHWarpedVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHWarpedVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHWarpedXXWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block warpedHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHOakVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHOakVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHOakVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHOakVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block oakHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHWarpedVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHWarpedVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHWarpedVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHWarpedVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHWarpedVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHWarpedXXWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block warpedHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHSpruceVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHSpruceVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHSpruceVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHSpruceVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHSpruceVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHSpruceXXSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block spruceHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHWarpedVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHWarpedVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHWarpedVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHWarpedVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHWarpedVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHWarpedXXWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block crimsonHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHJungleVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHJungleVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHJungleVVVVCrimsonVVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block jungleHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHCrimsonVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHCrimsonVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHCrimsonVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHCrimsonVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHCrimsonVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHCrimsonXXCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block crimsonHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHOakVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHOakVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHOakVVVVCrimsonVVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHOakVVVVCrimsonVVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block oakHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHCrimsonVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHCrimsonVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHCrimsonVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHCrimsonVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHCrimsonVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHCrimsonXXCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block crimsonHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHDarkoakVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHDarkoakVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHDarkoakVVVVCrimsonVVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block darkoakHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHCrimsonVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHCrimsonVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHCrimsonVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHCrimsonXXCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block cobblestoneModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block mossyCobblestoneModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block mossyCobblestoneBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block mossyCobblestoneCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block stoneModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block stoneBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block stoneCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block stoneBrickModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block stoneBrickBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block stoneBrickCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block mossyStoneBrickModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block mossyStoneBrickBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block mossyStoneBrickCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block andesiteModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block andesiteBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block andesiteCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block dioriteModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block dioriteBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block dioriteCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block graniteModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block graniteBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block graniteCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block sandstoneModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));
    public static final Block sandstoneBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));
    public static final Block sandstoneCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));

    public static final Block redSandstoneModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));
    public static final Block redSandstoneBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));
    public static final Block redSandstoneCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));

    public static final Block bricksModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block bricksBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block bricksCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block prismarineModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block prismarineBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block prismarineCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block netherBrickModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));
    public static final Block netherBrickBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));
    public static final Block netherBrickCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));

    public static final Block redNetherBrickModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));
    public static final Block redNetherBrickBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));
    public static final Block redNetherBrickCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));

    public static final Block endStoneBrickModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE));
    public static final Block endStoneBrickBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE));
    public static final Block endStoneBrickCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE));

    public static final Block blackstoneModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block blackstoneBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block blackstoneCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block polishedBlackstoneModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block polishedBlackstoneBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block polishedBlackstoneCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block polishedBlackstoneBrickModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block polishedBlackstoneBrickBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block polishedBlackstoneBrickCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block cobbledDeepslateModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block cobbledDeepslateBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block cobbledDeepslateCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));

    public static final Block polishedDeepslateModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block polishedDeepslateBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block polishedDeepslateCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));

    public static final Block deepslateBrickModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block deepslateBrickBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block deepslateBrickCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));

    public static final Block deepslateTileModern = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    public static final Block deepslateTileBuilding = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    public static final Block deepslateTileCastle = new Wall(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES));

    public static final Block oakWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));


    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhoak_fence_gate_closed"), HHOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhhoak_fence_gate_closed"), HHHOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhoak_vvoak_fence_gate_closed"), HHOakVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhoak_xxoak_fence_gate_closed"), HHOakXXOakGate);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhbirch_fence_gate_closed"), HHBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhhbirch_fence_gate_closed"), HHHBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhbirch_vvbirch_fence_gate_closed"), HHBirchVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhbirch_xxbirch_fence_gate_closed"), HHBirchXXBirchGate);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhspruce_fence_gate_closed"), HHSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhhspruce_fence_gate_closed"), HHHSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhspruce_vvspruce_fence_gate_closed"), HHSpruceVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhspruce_xxspruce_fence_gate_closed"), HHSpruceXXSpruceGate);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhjungle_fence_gate_closed"), HHJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhhjungle_fence_gate_closed"), HHHJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhjungle_vvjungle_fence_gate_closed"), HHJungleVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhjungle_xxjungle_fence_gate_closed"), HHJungleXXJungleGate);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhacacia_fence_gate_closed"), HHAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhhacacia_fence_gate_closed"), HHHAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhacacia_vvacacia_fence_gate_closed"), HHAcaciaVVAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhacacia_xxacacia_fence_gate_closed"), HHAcaciaXXAcaciaGate);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhdark_oak_fence_gate_closed"), HHDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhhdark_oak_fence_gate_closed"), HHHDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhdark_oak_vvdark_oak_fence_gate_closed"), HHDarkoakVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhdark_oak_xxdark_oak_fence_gate_closed"), HHDarkoakXXDarkoakGate);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhwarped_fence_gate_closed"), HHWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhhwarped_fence_gate_closed"), HHHWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhwarped_vvwarped_fence_gate_closed"), HHWarpedVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhwarped_xxwarped_fence_gate_closed"), HHWarpedXXWarpedGate);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhcrimson_fence_gate_closed"), HHCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhhcrimson_fence_gate_closed"), HHHCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhcrimson_vvcrimson_fence_gate_closed"), HHCrimsonVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "hhcrimson_xxcrimson_fence_gate_closed"), HHCrimsonXXCrimsonGate);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak"), spruceHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhoak"), spruceHHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak_vspruce"), spruceHHOakVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak_vspruce_fence_gate_closed"), spruceHHOakVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak_vvoak"), spruceHHOakVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvoak"), spruceHHSpruceVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvoak_fence_gate_closed"), spruceHHSpruceVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvoak"), spruceHHSpruceVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvoak_fence_gate_closed"), spruceHHSpruceVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhoak_vvvvspruce_vvvvspruce"), spruceHHHOakVVVVSpruceVVVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhoak_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHOakVVVVSpruceVVVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak_xxoak"), spruceHHOakXXOak);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce"), oakHHSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhspruce"), oakHHHSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce_voak"), oakHHSpruceVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce_voak_fence_gate_closed"), oakHHSpruceVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce_vvspruce"), oakHHSpruceVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvspruce"), oakHHOakVVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvspruce_fence_gate_closed"), oakHHOakVVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvspruce"), oakHHOakVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvspruce_fence_gate_closed"), oakHHOakVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhspruce_vvvvoak_vvvvoak"), oakHHHSpruceVVVVOakVVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhspruce_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHSpruceVVVVOakVVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce_xxspruce"), oakHHSpruceXXSpruce);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch"), oakHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhbirch"), oakHHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch_voak"), oakHHBirchVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch_voak_fence_gate_closed"), oakHHBirchVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch_vvbirch"), oakHHBirchVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvbirch"), oakHHOakVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvbirch_fence_gate_closed"), oakHHOakVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvbirch"), oakHHOakVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvbirch_fence_gate_closed"), oakHHOakVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhbirch_vvvvoak_vvvvoak"), oakHHHBirchVVVVOakVVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhbirch_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHBirchVVVVOakVVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch_xxbirch"), oakHHBirchXXBirch);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak"), birchHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhoak"), birchHHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak_vbirch"), birchHHOakVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak_vbirch_fence_gate_closed"), birchHHOakVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak_vvoak"), birchHHOakVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvoak"), birchHHBirchVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvoak_fence_gate_closed"), birchHHBirchVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvoak"), birchHHBirchVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvoak_fence_gate_closed"), birchHHBirchVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhoak_vvvvbirch_vvvvbirch"), birchHHHOakVVVVBirchVVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhoak_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHOakVVVVBirchVVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak_xxoak"), birchHHOakXXOak);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch"), spruceHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhbirch"), spruceHHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch_vspruce"), spruceHHBirchVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch_vspruce_fence_gate_closed"), spruceHHBirchVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch_vvbirch"), spruceHHBirchVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvbirch"), spruceHHSpruceVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvbirch_fence_gate_closed"), spruceHHSpruceVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvbirch"), spruceHHSpruceVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvbirch_fence_gate_closed"), spruceHHSpruceVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhbirch_vvvvspruce_vvvvspruce"), spruceHHHBirchVVVVSpruceVVVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhbirch_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHBirchVVVVSpruceVVVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch_xxbirch"), spruceHHBirchXXBirch);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce"), birchHHSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhspruce"), birchHHHSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce_vbirch"), birchHHSpruceVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce_vbirch_fence_gate_closed"), birchHHSpruceVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce_vvspruce"), birchHHSpruceVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvspruce"), birchHHBirchVVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvspruce_fence_gate_closed"), birchHHBirchVVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvspruce"), birchHHBirchVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvspruce_fence_gate_closed"), birchHHBirchVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhspruce_vvvvbirch_vvvvbirch"), birchHHHSpruceVVVVBirchVVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhspruce_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHSpruceVVVVBirchVVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce_xxspruce"), birchHHSpruceXXSpruce);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce"), darkoakHHSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhspruce"), darkoakHHHSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_vdark_oak"), darkoakHHSpruceVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_vdark_oak_fence_gate_closed"), darkoakHHSpruceVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_vvspruce"), darkoakHHSpruceVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvspruce"), darkoakHHDarkoakVVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvspruce_fence_gate_closed"), darkoakHHDarkoakVVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvspruce"), darkoakHHDarkoakVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvspruce_fence_gate_closed"), darkoakHHDarkoakVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak"), darkoakHHHSpruceVVVVDarkoakVVVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_xxspruce"), darkoakHHSpruceXXSpruce);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak"), spruceHHDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhdark_oak"), spruceHHHDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_vspruce"), spruceHHDarkoakVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_vspruce_fence_gate_closed"), spruceHHDarkoakVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_vvdark_oak"), spruceHHDarkoakVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvdark_oak"), spruceHHSpruceVVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvdark_oak_fence_gate_closed"), spruceHHSpruceVVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvdark_oak"), spruceHHSpruceVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvdark_oak_fence_gate_closed"), spruceHHSpruceVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhdark_oak_vvvvspruce_vvvvspruce"), spruceHHHDarkoakVVVVSpruceVVVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhdark_oak_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHDarkoakVVVVSpruceVVVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_xxdark_oak"), spruceHHDarkoakXXDarkoak);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak"), darkoakHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhoak"), darkoakHHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak_vdark_oak"), darkoakHHOakVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak_vdark_oak_fence_gate_closed"), darkoakHHOakVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak_vvoak"), darkoakHHOakVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvoak"), darkoakHHDarkoakVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvoak_fence_gate_closed"), darkoakHHDarkoakVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvoak"), darkoakHHDarkoakVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvoak_fence_gate_closed"), darkoakHHDarkoakVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak"), darkoakHHHOakVVVVDarkoakVVVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHOakVVVVDarkoakVVVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak_xxoak"), darkoakHHOakXXOak);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak"), oakHHDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhdark_oak"), oakHHHDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak_voak"), oakHHDarkoakVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak_voak_fence_gate_closed"), oakHHDarkoakVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak_vvdark_oak"), oakHHDarkoakVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvdark_oak"), oakHHOakVVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvdark_oak_fence_gate_closed"), oakHHOakVVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvdark_oak"), oakHHOakVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvdark_oak_fence_gate_closed"), oakHHOakVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhdark_oak_vvvvoak_vvvvoak"), oakHHHDarkoakVVVVOakVVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhdark_oak_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHDarkoakVVVVOakVVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak_xxdark_oak"), oakHHDarkoakXXDarkoak);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle"), darkoakHHJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhjungle"), darkoakHHHJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_vdark_oak"), darkoakHHJungleVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_vdark_oak_fence_gate_closed"), darkoakHHJungleVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_vvjungle"), darkoakHHJungleVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvjungle"), darkoakHHDarkoakVVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvjungle_fence_gate_closed"), darkoakHHDarkoakVVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvjungle"), darkoakHHDarkoakVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvjungle_fence_gate_closed"), darkoakHHDarkoakVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak"), darkoakHHHJungleVVVVDarkoakVVVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_xxjungle"), darkoakHHJungleXXJungle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak"), jungleHHDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhdark_oak"), jungleHHHDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_vjungle"), jungleHHDarkoakVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_vjungle_fence_gate_closed"), jungleHHDarkoakVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_vvdark_oak"), jungleHHDarkoakVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvdark_oak"), jungleHHJungleVVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvdark_oak_fence_gate_closed"), jungleHHJungleVVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvdark_oak"), jungleHHJungleVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvdark_oak_fence_gate_closed"), jungleHHJungleVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhdark_oak_vvvvjungle_vvvvjungle"), jungleHHHDarkoakVVVVJungleVVVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhdark_oak_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHDarkoakVVVVJungleVVVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_xxdark_oak"), jungleHHDarkoakXXDarkoak);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle"), acaciaHHJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhjungle"), acaciaHHHJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle_vacacia"), acaciaHHJungleVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle_vacacia_fence_gate_closed"), acaciaHHJungleVAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle_vvjungle"), acaciaHHJungleVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvjungle"), acaciaHHAcaciaVVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvjungle_fence_gate_closed"), acaciaHHAcaciaVVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvjungle"), acaciaHHAcaciaVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvjungle_fence_gate_closed"), acaciaHHAcaciaVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhjungle_vvvvacacia_vvvvacacia"), acaciaHHHJungleVVVVAcaciaVVVVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhjungle_vvvvacacia_vvvvacacia_fence_gate_closed"), acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle_xxjungle"), acaciaHHJungleXXJungle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia"), jungleHHAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhacacia"), jungleHHHAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia_vjungle"), jungleHHAcaciaVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia_vjungle_fence_gate_closed"), jungleHHAcaciaVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia_vvacacia"), jungleHHAcaciaVVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvacacia"), jungleHHJungleVVVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvacacia_fence_gate_closed"), jungleHHJungleVVVAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvacacia"), jungleHHJungleVVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvacacia_fence_gate_closed"), jungleHHJungleVVAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhacacia_vvvvjungle_vvvvjungle"), jungleHHHAcaciaVVVVJungleVVVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhacacia_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHAcaciaVVVVJungleVVVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia_xxacacia"), jungleHHAcaciaXXAcacia);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch"), acaciaHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhbirch"), acaciaHHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch_vacacia"), acaciaHHBirchVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch_vacacia_fence_gate_closed"), acaciaHHBirchVAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch_vvbirch"), acaciaHHBirchVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvbirch"), acaciaHHAcaciaVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvbirch_fence_gate_closed"), acaciaHHAcaciaVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvbirch"), acaciaHHAcaciaVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvbirch_fence_gate_closed"), acaciaHHAcaciaVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhbirch_vvvvacacia_vvvvacacia"), acaciaHHHBirchVVVVAcaciaVVVVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhbirch_vvvvacacia_vvvvacacia_fence_gate_closed"), acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch_xxbirch"), acaciaHHBirchXXBirch);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia"), birchHHAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhacacia"), birchHHHAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia_vbirch"), birchHHAcaciaVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia_vbirch_fence_gate_closed"), birchHHAcaciaVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia_vvacacia"), birchHHAcaciaVVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvacacia"), birchHHBirchVVVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvacacia_fence_gate_closed"), birchHHBirchVVVAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvacacia"), birchHHBirchVVAcacia);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvacacia_fence_gate_closed"), birchHHBirchVVAcaciaGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhacacia_vvvvbirch_vvvvbirch"), birchHHHAcaciaVVVVBirchVVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhacacia_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHAcaciaVVVVBirchVVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia_xxacacia"), birchHHAcaciaXXAcacia);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch"), jungleHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhbirch"), jungleHHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch_vjungle"), jungleHHBirchVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch_vjungle_fence_gate_closed"), jungleHHBirchVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch_vvbirch"), jungleHHBirchVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvbirch"), jungleHHJungleVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvbirch_fence_gate_closed"), jungleHHJungleVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvbirch"), jungleHHJungleVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvbirch_fence_gate_closed"), jungleHHJungleVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhbirch_vvvvjungle_vvvvjungle"), jungleHHHBirchVVVVJungleVVVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhbirch_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHBirchVVVVJungleVVVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch_xxbirch"), jungleHHBirchXXBirch);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle"), birchHHJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhjungle"), birchHHHJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle_vbirch"), birchHHJungleVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle_vbirch_fence_gate_closed"), birchHHJungleVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle_vvjungle"), birchHHJungleVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvjungle"), birchHHBirchVVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvjungle_fence_gate_closed"), birchHHBirchVVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvjungle"), birchHHBirchVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvjungle_fence_gate_closed"), birchHHBirchVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhjungle_vvvvbirch_vvvvbirch"), birchHHHJungleVVVVBirchVVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhjungle_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHJungleVVVVBirchVVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle_xxjungle"), birchHHJungleXXJungle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch"), warpedHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhbirch"), warpedHHHBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch_vwarped"), warpedHHBirchVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch_vwarped_fence_gate_closed"), warpedHHBirchVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch_vvbirch"), warpedHHBirchVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvbirch"), warpedHHWarpedVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvbirch_fence_gate_closed"), warpedHHWarpedVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvbirch"), warpedHHWarpedVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvbirch_fence_gate_closed"), warpedHHWarpedVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhbirch_vvvvwarped_vvvvwarped"), warpedHHHBirchVVVVWarpedVVVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhbirch_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHBirchVVVVWarpedVVVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch_xxbirch"), warpedHHBirchXXBirch);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped"), birchHHWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhwarped"), birchHHHWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped_vbirch"), birchHHWarpedVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped_vbirch_fence_gate_closed"), birchHHWarpedVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped_vvwarped"), birchHHWarpedVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvwarped"), birchHHBirchVVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvwarped_fence_gate_closed"), birchHHBirchVVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvwarped"), birchHHBirchVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvwarped_fence_gate_closed"), birchHHBirchVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhwarped_vvvvbirch_vvvvbirch"), birchHHHWarpedVVVVBirchVVVVBirch);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhwarped_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHWarpedVVVVBirchVVVVBirchGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped_xxwarped"), birchHHWarpedXXWarped);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak"), warpedHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhoak"), warpedHHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak_vwarped"), warpedHHOakVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak_vwarped_fence_gate_closed"), warpedHHOakVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak_vvoak"), warpedHHOakVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvoak"), warpedHHWarpedVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvoak_fence_gate_closed"), warpedHHWarpedVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvoak"), warpedHHWarpedVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvoak_fence_gate_closed"), warpedHHWarpedVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhoak_vvvvwarped_vvvvwarped"), warpedHHHOakVVVVWarpedVVVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhoak_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHOakVVVVWarpedVVVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak_xxoak"), warpedHHOakXXOak);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped"), oakHHWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhwarped"), oakHHHWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped_voak"), oakHHWarpedVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped_voak_fence_gate_closed"), oakHHWarpedVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped_vvwarped"), oakHHWarpedVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvwarped"), oakHHOakVVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvwarped_fence_gate_closed"), oakHHOakVVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvwarped"), oakHHOakVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvwarped_fence_gate_closed"), oakHHOakVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhwarped_vvvvoak_vvvvoak"), oakHHHWarpedVVVVOakVVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhwarped_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHWarpedVVVVOakVVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped_xxwarped"), oakHHWarpedXXWarped);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce"), warpedHHSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhspruce"), warpedHHHSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce_vwarped"), warpedHHSpruceVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce_vwarped_fence_gate_closed"), warpedHHSpruceVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce_vvspruce"), warpedHHSpruceVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvspruce"), warpedHHWarpedVVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvspruce_fence_gate_closed"), warpedHHWarpedVVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvspruce"), warpedHHWarpedVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvspruce_fence_gate_closed"), warpedHHWarpedVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhspruce_vvvvwarped_vvvvwarped"), warpedHHHSpruceVVVVWarpedVVVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhspruce_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHSpruceVVVVWarpedVVVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce_xxspruce"), warpedHHSpruceXXSpruce);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped"), spruceHHWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhwarped"), spruceHHHWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped_vspruce"), spruceHHWarpedVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped_vspruce_fence_gate_closed"), spruceHHWarpedVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped_vvwarped"), spruceHHWarpedVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvwarped"), spruceHHSpruceVVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvwarped_fence_gate_closed"), spruceHHSpruceVVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvwarped"), spruceHHSpruceVVWarped);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvwarped_fence_gate_closed"), spruceHHSpruceVVWarpedGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhwarped_vvvvspruce_vvvvspruce"), spruceHHHWarpedVVVVSpruceVVVVSpruce);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhwarped_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHWarpedVVVVSpruceVVVVSpruceGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped_xxwarped"), spruceHHWarpedXXWarped);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle"), crimsonHHJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhjungle"), crimsonHHHJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle_vcrimson"), crimsonHHJungleVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle_vcrimson_fence_gate_closed"), crimsonHHJungleVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle_vvjungle"), crimsonHHJungleVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvjungle"), crimsonHHCrimsonVVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvjungle_fence_gate_closed"), crimsonHHCrimsonVVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvjungle"), crimsonHHCrimsonVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvjungle_fence_gate_closed"), crimsonHHCrimsonVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhjungle_vvvvcrimson_vvvvcrimson"), crimsonHHHJungleVVVVCrimsonVVVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhjungle_vvvvcrimson_vvvvcrimson_fence_gate_closed"), crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle_xxjungle"), crimsonHHJungleXXJungle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson"), jungleHHCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhcrimson"), jungleHHHCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson_vjungle"), jungleHHCrimsonVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson_vjungle_fence_gate_closed"), jungleHHCrimsonVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson_vvcrimson"), jungleHHCrimsonVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvcrimson"), jungleHHJungleVVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvcrimson_fence_gate_closed"), jungleHHJungleVVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvcrimson"), jungleHHJungleVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvcrimson_fence_gate_closed"), jungleHHJungleVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhcrimson_vvvvjungle_vvvvjungle"), jungleHHHCrimsonVVVVJungleVVVVJungle);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhcrimson_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHCrimsonVVVVJungleVVVVJungleGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson_xxcrimson"), jungleHHCrimsonXXCrimson);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak"), crimsonHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhoak"), crimsonHHHOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak_vcrimson"), crimsonHHOakVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak_vcrimson_fence_gate_closed"), crimsonHHOakVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak_vvoak"), crimsonHHOakVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvoak"), crimsonHHCrimsonVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvoak_fence_gate_closed"), crimsonHHCrimsonVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvoak"), crimsonHHCrimsonVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvoak_fence_gate_closed"), crimsonHHCrimsonVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhoak_vvvvcrimson_vvvvcrimson"), crimsonHHHOakVVVVCrimsonVVVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhoak_vvvvcrimson_vvvvcrimson_fence_gate_closed"), crimsonHHHOakVVVVCrimsonVVVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak_xxoak"), crimsonHHOakXXOak);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson"), oakHHCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhcrimson"), oakHHHCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson_voak"), oakHHCrimsonVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson_voak_fence_gate_closed"), oakHHCrimsonVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson_vvcrimson"), oakHHCrimsonVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvcrimson"), oakHHOakVVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvcrimson_fence_gate_closed"), oakHHOakVVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvcrimson"), oakHHOakVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvcrimson_fence_gate_closed"), oakHHOakVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhcrimson_vvvvoak_vvvvoak"), oakHHHCrimsonVVVVOakVVVVOak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhcrimson_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHCrimsonVVVVOakVVVVOakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson_xxcrimson"), oakHHCrimsonXXCrimson);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak"), crimsonHHDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhdark_oak"), crimsonHHHDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_vcrimson"), crimsonHHDarkoakVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_vcrimson_fence_gate_closed"), crimsonHHDarkoakVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_vvdark_oak"), crimsonHHDarkoakVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvdark_oak"), crimsonHHCrimsonVVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvdark_oak_fence_gate_closed"), crimsonHHCrimsonVVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvdark_oak"), crimsonHHCrimsonVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvdark_oak_fence_gate_closed"), crimsonHHCrimsonVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson"), crimsonHHHDarkoakVVVVCrimsonVVVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson_fence_gate_closed"), crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_xxdark_oak"), crimsonHHDarkoakXXDarkoak);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson"), darkoakHHCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhcrimson"), darkoakHHHCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_vdark_oak"), darkoakHHCrimsonVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_vdark_oak_fence_gate_closed"), darkoakHHCrimsonVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_vvcrimson"), darkoakHHCrimsonVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvcrimson"), darkoakHHDarkoakVVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvcrimson_fence_gate_closed"), darkoakHHDarkoakVVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvcrimson"), darkoakHHDarkoakVVCrimson);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvcrimson_fence_gate_closed"), darkoakHHDarkoakVVCrimsonGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak"), darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_xxcrimson"), darkoakHHCrimsonXXCrimson);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_modern"), cobblestoneModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_building"), cobblestoneBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_castle"), cobblestoneCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "mossy_cobblestone_modern"), mossyCobblestoneModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "mossy_cobblestone_building"), mossyCobblestoneBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "mossy_cobblestone_castle"), mossyCobblestoneCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "stone_modern"), stoneModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "stone_building"), stoneBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "stone_castle"), stoneCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "stone_bricks_modern"), stoneBrickModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "stone_bricks_building"), stoneBrickBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "stone_bricks_castle"), stoneBrickCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "mossy_stone_bricks_modern"), mossyStoneBrickModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "mossy_stone_bricks_building"), mossyStoneBrickBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "mossy_stone_bricks_castle"), mossyStoneBrickCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "andesite_modern"), andesiteModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "andesite_building"), andesiteBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "andesite_castle"), andesiteCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "diorite_modern"), dioriteModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "diorite_building"), dioriteBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "diorite_castle"), dioriteCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "granite_modern"), graniteModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "granite_building"), graniteBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "granite_castle"), graniteCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "sandstone_modern"), sandstoneModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "sandstone_building"), sandstoneBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "sandstone_castle"), sandstoneCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_sandstone_modern"), redSandstoneModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_sandstone_building"), redSandstoneBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_sandstone_castle"), redSandstoneCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "bricks_modern"), bricksModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "bricks_building"), bricksBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "bricks_castle"), bricksCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "prismarine_modern"), prismarineModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "prismarine_building"), prismarineBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "prismarine_castle"), prismarineCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "nether_bricks_modern"), netherBrickModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "nether_bricks_building"), netherBrickBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "nether_bricks_castle"), netherBrickCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_nether_bricks_modern"), redNetherBrickModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_nether_bricks_building"), redNetherBrickBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_nether_bricks_castle"), redNetherBrickCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "end_stone_bricks_modern"), endStoneBrickModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "end_stone_bricks_building"), endStoneBrickBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "end_stone_bricks_castle"), endStoneBrickCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blackstone_modern"), blackstoneModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blackstone_building"), blackstoneBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blackstone_castle"), blackstoneCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_modern"), polishedBlackstoneModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_building"), polishedBlackstoneBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_castle"), polishedBlackstoneCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_modern"), polishedBlackstoneBrickModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_building"), polishedBlackstoneBrickBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_castle"), polishedBlackstoneBrickCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cobbled_deepslate_modern"), cobbledDeepslateModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cobbled_deepslate_building"), cobbledDeepslateBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cobbled_deepslate_castle"), cobbledDeepslateCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "polished_deepslate_modern"), polishedDeepslateModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "polished_deepslate_building"), polishedDeepslateBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "polished_deepslate_castle"), polishedDeepslateCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "deepslate_brick_modern"), deepslateBrickModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "deepslate_brick_building"), deepslateBrickBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "deepslate_brick_castle"), deepslateBrickCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "deepslate_tile_modern"), deepslateTileModern);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "deepslate_tile_building"), deepslateTileBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "deepslate_tile_castle"), deepslateTileCastle);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "oak_wall_building"), oakWallBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "birch_wall_building"), birchWallBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "spruce_wall_building"), spruceWallBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "acacia_wall_building"), acaciaWallBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "jungle_wall_building"), jungleWallBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_wall_building"), darkoakWallBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "crimson_wall_building"), crimsonWallBuilding);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "warped_wall_building"), warpedWallBuilding);

    }


}
