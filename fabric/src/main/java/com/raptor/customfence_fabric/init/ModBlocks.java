package com.raptor.customfence_fabric.init;

import com.google.common.collect.ImmutableMap;
import com.raptor.customfence_fabric.Main;
import com.raptor.customfence_fabric.blocks.*;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.*;


@SuppressWarnings({"WeakerAccess", "unused"})
public class ModBlocks {

    public static final Block HHOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHOakVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHOakXXOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block HHBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHBirchVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHBirchXXBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block HHSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHSpruceVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHSpruceXXSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block HHJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHJungleVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHJungleXXJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block HHAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHAcaciaVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHAcaciaXXAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block HHDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHDarkoakVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHDarkoakXXDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block HHWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHWarpedVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHWarpedXXWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block HHCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHCrimsonVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHCrimsonXXCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block HHMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHMangroveVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHMangroveXXMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block HHBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHHBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHBambooVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block HHBambooXXBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block spruceHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHOakVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHOakVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHSpruceVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHHOakVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHOakVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block oakHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHSpruceVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHSpruceVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHSpruceVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHOakVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHHSpruceVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHSpruceVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHSpruceXXSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block oakHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHBirchVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHBirchVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHOakVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHHBirchVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHBirchVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block birchHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHOakVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHOakVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHBirchVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHHOakVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHOakVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block spruceHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHBirchVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHBirchVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHSpruceVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHHBirchVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHBirchVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block birchHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHSpruceVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHSpruceVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHSpruceVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHBirchVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHHSpruceVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHSpruceVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHSpruceXXSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block darkoakHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHSpruceVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHSpruceVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHSpruceVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHDarkoakVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHHSpruceVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHSpruceXXSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block spruceHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHDarkoakVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHDarkoakVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHSpruceVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHHDarkoakVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHDarkoakVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block darkoakHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHOakVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHOakVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHDarkoakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHHOakVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHOakVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block oakHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHDarkoakVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHDarkoakVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHOakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHHDarkoakVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHDarkoakVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block darkoakHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHJungleVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHJungleVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHDarkoakVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHHJungleVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block jungleHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHDarkoakVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHDarkoakVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHJungleVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHHDarkoakVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHDarkoakVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block acaciaHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHJungleVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHJungleVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHAcaciaVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHHJungleVVVVAcaciaVVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block jungleHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHAcaciaVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHAcaciaVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHAcaciaVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHJungleVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHHAcaciaVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHAcaciaVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHAcaciaXXAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block acaciaHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHBirchVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHBirchVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHAcaciaVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHHBirchVVVVAcaciaVVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block birchHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHAcaciaVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHAcaciaVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHAcaciaVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHBirchVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHHAcaciaVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHAcaciaVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHAcaciaXXAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block jungleHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHBirchVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHBirchVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHJungleVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHHBirchVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHBirchVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block birchHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHJungleVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHJungleVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHBirchVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHHJungleVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHJungleVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block warpedHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHBirchVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHBirchVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHWarpedVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHHBirchVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHBirchVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block birchHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHWarpedVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHWarpedVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHWarpedVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHBirchVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHHWarpedVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHWarpedVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHWarpedXXWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block warpedHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHOakVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHOakVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHWarpedVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHHOakVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHOakVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block oakHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHWarpedVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHWarpedVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHWarpedVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHOakVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHHWarpedVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHWarpedVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHWarpedXXWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block warpedHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHSpruceVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHSpruceVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHSpruceVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHWarpedVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHHSpruceVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHSpruceVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHSpruceXXSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block spruceHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHWarpedVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHWarpedVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHWarpedVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHSpruceVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHHWarpedVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHWarpedVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHWarpedXXWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block crimsonHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHJungleVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHJungleVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHCrimsonVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHHJungleVVVVCrimsonVVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block jungleHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHCrimsonVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHCrimsonVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHCrimsonVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHJungleVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHHCrimsonVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHCrimsonVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHCrimsonXXCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block crimsonHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHOakVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHOakVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHCrimsonVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHHOakVVVVCrimsonVVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHOakVVVVCrimsonVVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block oakHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHCrimsonVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHCrimsonVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHCrimsonVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHOakVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHHCrimsonVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHCrimsonVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHCrimsonXXCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block crimsonHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHDarkoakVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHDarkoakVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHCrimsonVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHHDarkoakVVVVCrimsonVVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block crimsonHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block crimsonHHCrimsonVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block darkoakHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHCrimsonVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHCrimsonVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHCrimsonVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHDarkoakVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHCrimsonXXCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVCrimson = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVCrimsonGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block mangroveHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHOakVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHOakVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHMangroveVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHHOakVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHOakVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block oakHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHMangroveVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHMangroveVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHMangroveVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHOakVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHHMangroveVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHMangroveVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHMangroveXXMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block mangroveHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHBirchVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHBirchVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHBirchVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHMangroveVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHHBirchVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHBirchVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHBirchXXBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block birchHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHMangroveVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHMangroveVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHMangroveVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHBirchVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHHMangroveVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHHMangroveVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block birchHHMangroveXXMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block birchHHBirchVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block mangroveHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHJungleVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHJungleVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHMangroveVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHHJungleVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHJungleVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block jungleHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHMangroveVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHMangroveVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHMangroveVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHJungleVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHHMangroveVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHMangroveVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHMangroveXXMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block mangroveHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHDarkoakVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHDarkoakVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHMangroveVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHHDarkoakVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHDarkoakVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block darkoakHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHMangroveVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHMangroveVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHMangroveVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHDarkoakVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHHMangroveVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHHMangroveVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block darkoakHHMangroveXXMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block darkoakHHDarkoakVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block mangroveHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHWarpedVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHWarpedVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHWarpedVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHMangroveVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHHWarpedVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHHWarpedVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block mangroveHHWarpedXXWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block mangroveHHMangroveVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block warpedHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHMangroveVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHMangroveVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHMangroveVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHWarpedVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHHMangroveVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHMangroveVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHMangroveXXMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVMangrove = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVMangroveGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block bambooHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHOakVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHOakVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHOakVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHBambooVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHHOakVVVVBambooVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHOakVVVVBambooVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHOakXXOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block oakHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHBambooVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHBambooVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHBambooVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHOakVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHHBambooVVVVOakVVVVOak = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHHBambooVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block oakHHBambooXXBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block oakHHOakVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block bambooHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHSpruceVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHSpruceVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHSpruceVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHBambooVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHHSpruceVVVVBambooVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHSpruceVVVVBambooVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHSpruceXXSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block spruceHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHBambooVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHBambooVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHBambooVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHSpruceVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHHBambooVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHHBambooVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block spruceHHBambooXXBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block spruceHHSpruceVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block bambooHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHJungleVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHJungleVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHJungleVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHBambooVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHHJungleVVVVBambooVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHJungleVVVVBambooVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHJungleXXJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block jungleHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHBambooVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHBambooVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHBambooVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHJungleVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHHBambooVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHHBambooVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block jungleHHBambooXXBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block jungleHHJungleVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block bambooHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHAcaciaVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHAcaciaVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHAcaciaVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHBambooVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHHAcaciaVVVVBambooVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHAcaciaVVVVBambooVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHAcaciaXXAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block acaciaHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHBambooVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHBambooVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHBambooVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHAcaciaVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHHBambooVVVVAcaciaVVVVAcacia = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHHBambooVVVVAcaciaVVVVAcaciaGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block acaciaHHBambooXXBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block acaciaHHAcaciaVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block bambooHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHWarpedVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHWarpedVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHWarpedVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHBambooVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHHWarpedVVVVBambooVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHHWarpedVVVVBambooVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block bambooHHWarpedXXWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooHHBambooVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

    public static final Block warpedHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHBambooVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHBambooVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHBambooVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHWarpedVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHHBambooVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHHBambooVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);
    public static final Block warpedHHBambooXXBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVBamboo = new Fence(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block warpedHHWarpedVVVVBambooGate = new FenceGate(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN);

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
    public static final Block mangroveWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block bambooWallBuilding = new WoodWall(FabricBlockSettings.of(Material.WOOD).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    public static final Block cobblestoneCopperFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneExposedCopperFence = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneWeatheredCopperFence = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneOxidizedCopperFence = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block copperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block exposedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block weatheredCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block oxidizedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);

    public static final Block cobblestoneWaxedCopperFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneWaxedExposedCopperFence = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneWaxedWeatheredCopperFence = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneWaxedOxidizedCopperFence = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block waxedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block waxedExposedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block waxedWeatheredCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block waxedOxidizedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);

    public static final Block cobblestoneIronFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneExposedIronFence = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneWeatheredIronFence = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneOxidizedIronFence = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block ironFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block exposedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block weatheredIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block oxidizedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);

    public static final Block cobblestoneWaxedIronFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneWaxedExposedIronFence = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneWaxedWeatheredIronFence = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block cobblestoneWaxedOxidizedIronFence = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block waxedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block waxedExposedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block waxedWeatheredIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);
    public static final Block waxedOxidizedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);

    public static final Block cobblestoneGoldFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block goldFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), SoundEvents.BLOCK_IRON_DOOR_CLOSE, SoundEvents.BLOCK_IRON_DOOR_OPEN);

    public static void registerBlocks() {

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhoak_fence_gate_closed"), HHOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhoak_fence_gate_closed"), HHHOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhoak_vvoak_fence_gate_closed"), HHOakVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhoak_xxoak_fence_gate_closed"), HHOakXXOakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhbirch_fence_gate_closed"), HHBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhbirch_fence_gate_closed"), HHHBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhbirch_vvbirch_fence_gate_closed"), HHBirchVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhbirch_xxbirch_fence_gate_closed"), HHBirchXXBirchGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhspruce_fence_gate_closed"), HHSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhspruce_fence_gate_closed"), HHHSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhspruce_vvspruce_fence_gate_closed"), HHSpruceVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhspruce_xxspruce_fence_gate_closed"), HHSpruceXXSpruceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhjungle_fence_gate_closed"), HHJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhjungle_fence_gate_closed"), HHHJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhjungle_vvjungle_fence_gate_closed"), HHJungleVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhjungle_xxjungle_fence_gate_closed"), HHJungleXXJungleGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhacacia_fence_gate_closed"), HHAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhacacia_fence_gate_closed"), HHHAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhacacia_vvacacia_fence_gate_closed"), HHAcaciaVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhacacia_xxacacia_fence_gate_closed"), HHAcaciaXXAcaciaGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhdark_oak_fence_gate_closed"), HHDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhdark_oak_fence_gate_closed"), HHHDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhdark_oak_vvdark_oak_fence_gate_closed"), HHDarkoakVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhdark_oak_xxdark_oak_fence_gate_closed"), HHDarkoakXXDarkoakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhwarped_fence_gate_closed"), HHWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhwarped_fence_gate_closed"), HHHWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhwarped_vvwarped_fence_gate_closed"), HHWarpedVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhwarped_xxwarped_fence_gate_closed"), HHWarpedXXWarpedGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhcrimson_fence_gate_closed"), HHCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhcrimson_fence_gate_closed"), HHHCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhcrimson_vvcrimson_fence_gate_closed"), HHCrimsonVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhcrimson_xxcrimson_fence_gate_closed"), HHCrimsonXXCrimsonGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhmangrove_fence_gate_closed"), HHMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhmangrove_fence_gate_closed"), HHHMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhmangrove_vvmangrove_fence_gate_closed"), HHMangroveVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhmangrove_xxmangrove_fence_gate_closed"), HHMangroveXXMangroveGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhbamboo_fence_gate_closed"), HHBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhhbamboo_fence_gate_closed"), HHHBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhbamboo_vvbamboo_fence_gate_closed"), HHBambooVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "hhbamboo_xxbamboo_fence_gate_closed"), HHBambooXXBambooGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak"), spruceHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhoak"), spruceHHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak_vspruce"), spruceHHOakVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak_vspruce_fence_gate_closed"), spruceHHOakVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak_vvoak"), spruceHHOakVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvoak"), spruceHHSpruceVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvoak_fence_gate_closed"), spruceHHSpruceVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvoak"), spruceHHSpruceVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvoak_fence_gate_closed"), spruceHHSpruceVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhoak_vvvvspruce_vvvvspruce"), spruceHHHOakVVVVSpruceVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhoak_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHOakVVVVSpruceVVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhoak_xxoak"), spruceHHOakXXOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvoak"), spruceHHSpruceVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvoak_fence_gate_closed"), spruceHHSpruceVVVVOakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce"), oakHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhspruce"), oakHHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce_voak"), oakHHSpruceVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce_voak_fence_gate_closed"), oakHHSpruceVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce_vvspruce"), oakHHSpruceVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvspruce"), oakHHOakVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvspruce_fence_gate_closed"), oakHHOakVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvspruce"), oakHHOakVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvspruce_fence_gate_closed"), oakHHOakVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhspruce_vvvvoak_vvvvoak"), oakHHHSpruceVVVVOakVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhspruce_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHSpruceVVVVOakVVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhspruce_xxspruce"), oakHHSpruceXXSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvspruce"), oakHHOakVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvspruce_fence_gate_closed"), oakHHOakVVVVSpruceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch"), oakHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhbirch"), oakHHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch_voak"), oakHHBirchVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch_voak_fence_gate_closed"), oakHHBirchVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch_vvbirch"), oakHHBirchVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvbirch"), oakHHOakVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvbirch_fence_gate_closed"), oakHHOakVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvbirch"), oakHHOakVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvbirch_fence_gate_closed"), oakHHOakVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhbirch_vvvvoak_vvvvoak"), oakHHHBirchVVVVOakVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhbirch_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHBirchVVVVOakVVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbirch_xxbirch"), oakHHBirchXXBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvbirch"), oakHHOakVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvbirch_fence_gate_closed"), oakHHOakVVVVBirchGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak"), birchHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhoak"), birchHHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak_vbirch"), birchHHOakVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak_vbirch_fence_gate_closed"), birchHHOakVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak_vvoak"), birchHHOakVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvoak"), birchHHBirchVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvoak_fence_gate_closed"), birchHHBirchVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvoak"), birchHHBirchVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvoak_fence_gate_closed"), birchHHBirchVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhoak_vvvvbirch_vvvvbirch"), birchHHHOakVVVVBirchVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhoak_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHOakVVVVBirchVVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhoak_xxoak"), birchHHOakXXOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvoak"), birchHHBirchVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvoak_fence_gate_closed"), birchHHBirchVVVVOakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch"), spruceHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhbirch"), spruceHHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch_vspruce"), spruceHHBirchVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch_vspruce_fence_gate_closed"), spruceHHBirchVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch_vvbirch"), spruceHHBirchVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvbirch"), spruceHHSpruceVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvbirch_fence_gate_closed"), spruceHHSpruceVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvbirch"), spruceHHSpruceVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvbirch_fence_gate_closed"), spruceHHSpruceVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhbirch_vvvvspruce_vvvvspruce"), spruceHHHBirchVVVVSpruceVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhbirch_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHBirchVVVVSpruceVVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbirch_xxbirch"), spruceHHBirchXXBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvbirch"), spruceHHSpruceVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvbirch_fence_gate_closed"), spruceHHSpruceVVVVBirchGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce"), birchHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhspruce"), birchHHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce_vbirch"), birchHHSpruceVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce_vbirch_fence_gate_closed"), birchHHSpruceVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce_vvspruce"), birchHHSpruceVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvspruce"), birchHHBirchVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvspruce_fence_gate_closed"), birchHHBirchVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvspruce"), birchHHBirchVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvspruce_fence_gate_closed"), birchHHBirchVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhspruce_vvvvbirch_vvvvbirch"), birchHHHSpruceVVVVBirchVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhspruce_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHSpruceVVVVBirchVVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhspruce_xxspruce"), birchHHSpruceXXSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvspruce"), birchHHBirchVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvspruce_fence_gate_closed"), birchHHBirchVVVVSpruceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce"), darkoakHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhspruce"), darkoakHHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_vdark_oak"), darkoakHHSpruceVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_vdark_oak_fence_gate_closed"), darkoakHHSpruceVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_vvspruce"), darkoakHHSpruceVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvspruce"), darkoakHHDarkoakVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvspruce_fence_gate_closed"), darkoakHHDarkoakVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvspruce"), darkoakHHDarkoakVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvspruce_fence_gate_closed"), darkoakHHDarkoakVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak"), darkoakHHHSpruceVVVVDarkoakVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhspruce_xxspruce"), darkoakHHSpruceXXSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvspruce"), darkoakHHDarkoakVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvspruce_fence_gate_closed"), darkoakHHDarkoakVVVVSpruceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak"), spruceHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhdark_oak"), spruceHHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_vspruce"), spruceHHDarkoakVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_vspruce_fence_gate_closed"), spruceHHDarkoakVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_vvdark_oak"), spruceHHDarkoakVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvdark_oak"), spruceHHSpruceVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvdark_oak_fence_gate_closed"), spruceHHSpruceVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvdark_oak"), spruceHHSpruceVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvdark_oak_fence_gate_closed"), spruceHHSpruceVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhdark_oak_vvvvspruce_vvvvspruce"), spruceHHHDarkoakVVVVSpruceVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhdark_oak_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHDarkoakVVVVSpruceVVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhdark_oak_xxdark_oak"), spruceHHDarkoakXXDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvdark_oak"), spruceHHSpruceVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvdark_oak_fence_gate_closed"), spruceHHSpruceVVVVDarkoakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak"), darkoakHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhoak"), darkoakHHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak_vdark_oak"), darkoakHHOakVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak_vdark_oak_fence_gate_closed"), darkoakHHOakVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak_vvoak"), darkoakHHOakVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvoak"), darkoakHHDarkoakVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvoak_fence_gate_closed"), darkoakHHDarkoakVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvoak"), darkoakHHDarkoakVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvoak_fence_gate_closed"), darkoakHHDarkoakVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak"), darkoakHHHOakVVVVDarkoakVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHOakVVVVDarkoakVVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhoak_xxoak"), darkoakHHOakXXOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvoak"), darkoakHHDarkoakVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvoak_fence_gate_closed"), darkoakHHDarkoakVVVVOakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak"), oakHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhdark_oak"), oakHHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak_voak"), oakHHDarkoakVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak_voak_fence_gate_closed"), oakHHDarkoakVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak_vvdark_oak"), oakHHDarkoakVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvdark_oak"), oakHHOakVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvdark_oak_fence_gate_closed"), oakHHOakVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvdark_oak"), oakHHOakVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvdark_oak_fence_gate_closed"), oakHHOakVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhdark_oak_vvvvoak_vvvvoak"), oakHHHDarkoakVVVVOakVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhdark_oak_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHDarkoakVVVVOakVVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhdark_oak_xxdark_oak"), oakHHDarkoakXXDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvdark_oak"), oakHHOakVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvdark_oak_fence_gate_closed"), oakHHOakVVVVDarkoakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle"), darkoakHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhjungle"), darkoakHHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_vdark_oak"), darkoakHHJungleVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_vdark_oak_fence_gate_closed"), darkoakHHJungleVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_vvjungle"), darkoakHHJungleVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvjungle"), darkoakHHDarkoakVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvjungle_fence_gate_closed"), darkoakHHDarkoakVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvjungle"), darkoakHHDarkoakVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvjungle_fence_gate_closed"), darkoakHHDarkoakVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak"), darkoakHHHJungleVVVVDarkoakVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhjungle_xxjungle"), darkoakHHJungleXXJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvjungle"), darkoakHHDarkoakVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvjungle_fence_gate_closed"), darkoakHHDarkoakVVVVJungleGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak"), jungleHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhdark_oak"), jungleHHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_vjungle"), jungleHHDarkoakVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_vjungle_fence_gate_closed"), jungleHHDarkoakVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_vvdark_oak"), jungleHHDarkoakVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvdark_oak"), jungleHHJungleVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvdark_oak_fence_gate_closed"), jungleHHJungleVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvdark_oak"), jungleHHJungleVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvdark_oak_fence_gate_closed"), jungleHHJungleVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhdark_oak_vvvvjungle_vvvvjungle"), jungleHHHDarkoakVVVVJungleVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhdark_oak_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHDarkoakVVVVJungleVVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhdark_oak_xxdark_oak"), jungleHHDarkoakXXDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvdark_oak"), jungleHHJungleVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvdark_oak_fence_gate_closed"), jungleHHJungleVVVVDarkoakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle"), acaciaHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhjungle"), acaciaHHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle_vacacia"), acaciaHHJungleVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle_vacacia_fence_gate_closed"), acaciaHHJungleVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle_vvjungle"), acaciaHHJungleVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvjungle"), acaciaHHAcaciaVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvjungle_fence_gate_closed"), acaciaHHAcaciaVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvjungle"), acaciaHHAcaciaVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvjungle_fence_gate_closed"), acaciaHHAcaciaVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhjungle_vvvvacacia_vvvvacacia"), acaciaHHHJungleVVVVAcaciaVVVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhjungle_vvvvacacia_vvvvacacia_fence_gate_closed"), acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhjungle_xxjungle"), acaciaHHJungleXXJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvjungle"), acaciaHHAcaciaVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvjungle_fence_gate_closed"), acaciaHHAcaciaVVVVJungleGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia"), jungleHHAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhacacia"), jungleHHHAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia_vjungle"), jungleHHAcaciaVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia_vjungle_fence_gate_closed"), jungleHHAcaciaVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia_vvacacia"), jungleHHAcaciaVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvacacia"), jungleHHJungleVVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvacacia_fence_gate_closed"), jungleHHJungleVVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvacacia"), jungleHHJungleVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvacacia_fence_gate_closed"), jungleHHJungleVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhacacia_vvvvjungle_vvvvjungle"), jungleHHHAcaciaVVVVJungleVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhacacia_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHAcaciaVVVVJungleVVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhacacia_xxacacia"), jungleHHAcaciaXXAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvacacia"), jungleHHJungleVVVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvacacia_fence_gate_closed"), jungleHHJungleVVVVAcaciaGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch"), acaciaHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhbirch"), acaciaHHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch_vacacia"), acaciaHHBirchVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch_vacacia_fence_gate_closed"), acaciaHHBirchVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch_vvbirch"), acaciaHHBirchVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvbirch"), acaciaHHAcaciaVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvbirch_fence_gate_closed"), acaciaHHAcaciaVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvbirch"), acaciaHHAcaciaVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvbirch_fence_gate_closed"), acaciaHHAcaciaVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhbirch_vvvvacacia_vvvvacacia"), acaciaHHHBirchVVVVAcaciaVVVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhbirch_vvvvacacia_vvvvacacia_fence_gate_closed"), acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbirch_xxbirch"), acaciaHHBirchXXBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvbirch"), acaciaHHAcaciaVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvbirch_fence_gate_closed"), acaciaHHAcaciaVVVVBirchGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia"), birchHHAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhacacia"), birchHHHAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia_vbirch"), birchHHAcaciaVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia_vbirch_fence_gate_closed"), birchHHAcaciaVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia_vvacacia"), birchHHAcaciaVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvacacia"), birchHHBirchVVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvacacia_fence_gate_closed"), birchHHBirchVVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvacacia"), birchHHBirchVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvacacia_fence_gate_closed"), birchHHBirchVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhacacia_vvvvbirch_vvvvbirch"), birchHHHAcaciaVVVVBirchVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhacacia_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHAcaciaVVVVBirchVVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhacacia_xxacacia"), birchHHAcaciaXXAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvacacia"), birchHHBirchVVVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvacacia_fence_gate_closed"), birchHHBirchVVVVAcaciaGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch"), jungleHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhbirch"), jungleHHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch_vjungle"), jungleHHBirchVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch_vjungle_fence_gate_closed"), jungleHHBirchVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch_vvbirch"), jungleHHBirchVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvbirch"), jungleHHJungleVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvbirch_fence_gate_closed"), jungleHHJungleVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvbirch"), jungleHHJungleVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvbirch_fence_gate_closed"), jungleHHJungleVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhbirch_vvvvjungle_vvvvjungle"), jungleHHHBirchVVVVJungleVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhbirch_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHBirchVVVVJungleVVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbirch_xxbirch"), jungleHHBirchXXBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvbirch"), jungleHHJungleVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvbirch_fence_gate_closed"), jungleHHJungleVVVVBirchGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle"), birchHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhjungle"), birchHHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle_vbirch"), birchHHJungleVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle_vbirch_fence_gate_closed"), birchHHJungleVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle_vvjungle"), birchHHJungleVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvjungle"), birchHHBirchVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvjungle_fence_gate_closed"), birchHHBirchVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvjungle"), birchHHBirchVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvjungle_fence_gate_closed"), birchHHBirchVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhjungle_vvvvbirch_vvvvbirch"), birchHHHJungleVVVVBirchVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhjungle_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHJungleVVVVBirchVVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhjungle_xxjungle"), birchHHJungleXXJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvjungle"), birchHHBirchVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvjungle_fence_gate_closed"), birchHHBirchVVVVJungleGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch"), warpedHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhbirch"), warpedHHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch_vwarped"), warpedHHBirchVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch_vwarped_fence_gate_closed"), warpedHHBirchVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch_vvbirch"), warpedHHBirchVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvbirch"), warpedHHWarpedVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvbirch_fence_gate_closed"), warpedHHWarpedVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvbirch"), warpedHHWarpedVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvbirch_fence_gate_closed"), warpedHHWarpedVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhbirch_vvvvwarped_vvvvwarped"), warpedHHHBirchVVVVWarpedVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhbirch_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHBirchVVVVWarpedVVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbirch_xxbirch"), warpedHHBirchXXBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvbirch"), warpedHHWarpedVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvbirch_fence_gate_closed"), warpedHHWarpedVVVVBirchGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped"), birchHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhwarped"), birchHHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped_vbirch"), birchHHWarpedVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped_vbirch_fence_gate_closed"), birchHHWarpedVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped_vvwarped"), birchHHWarpedVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvwarped"), birchHHBirchVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvwarped_fence_gate_closed"), birchHHBirchVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvwarped"), birchHHBirchVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvwarped_fence_gate_closed"), birchHHBirchVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhwarped_vvvvbirch_vvvvbirch"), birchHHHWarpedVVVVBirchVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhwarped_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHWarpedVVVVBirchVVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhwarped_xxwarped"), birchHHWarpedXXWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvwarped"), birchHHBirchVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvwarped_fence_gate_closed"), birchHHBirchVVVVWarpedGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak"), warpedHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhoak"), warpedHHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak_vwarped"), warpedHHOakVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak_vwarped_fence_gate_closed"), warpedHHOakVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak_vvoak"), warpedHHOakVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvoak"), warpedHHWarpedVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvoak_fence_gate_closed"), warpedHHWarpedVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvoak"), warpedHHWarpedVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvoak_fence_gate_closed"), warpedHHWarpedVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhoak_vvvvwarped_vvvvwarped"), warpedHHHOakVVVVWarpedVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhoak_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHOakVVVVWarpedVVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhoak_xxoak"), warpedHHOakXXOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvoak"), warpedHHWarpedVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvoak_fence_gate_closed"), warpedHHWarpedVVVVOakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped"), oakHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhwarped"), oakHHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped_voak"), oakHHWarpedVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped_voak_fence_gate_closed"), oakHHWarpedVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped_vvwarped"), oakHHWarpedVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvwarped"), oakHHOakVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvwarped_fence_gate_closed"), oakHHOakVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvwarped"), oakHHOakVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvwarped_fence_gate_closed"), oakHHOakVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhwarped_vvvvoak_vvvvoak"), oakHHHWarpedVVVVOakVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhwarped_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHWarpedVVVVOakVVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhwarped_xxwarped"), oakHHWarpedXXWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvwarped"), oakHHOakVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvwarped_fence_gate_closed"), oakHHOakVVVVWarpedGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce"), warpedHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhspruce"), warpedHHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce_vwarped"), warpedHHSpruceVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce_vwarped_fence_gate_closed"), warpedHHSpruceVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce_vvspruce"), warpedHHSpruceVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvspruce"), warpedHHWarpedVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvspruce_fence_gate_closed"), warpedHHWarpedVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvspruce"), warpedHHWarpedVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvspruce_fence_gate_closed"), warpedHHWarpedVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhspruce_vvvvwarped_vvvvwarped"), warpedHHHSpruceVVVVWarpedVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhspruce_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHSpruceVVVVWarpedVVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhspruce_xxspruce"), warpedHHSpruceXXSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvspruce"), warpedHHWarpedVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvspruce_fence_gate_closed"), warpedHHWarpedVVVVSpruceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped"), spruceHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhwarped"), spruceHHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped_vspruce"), spruceHHWarpedVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped_vspruce_fence_gate_closed"), spruceHHWarpedVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped_vvwarped"), spruceHHWarpedVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvwarped"), spruceHHSpruceVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvwarped_fence_gate_closed"), spruceHHSpruceVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvwarped"), spruceHHSpruceVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvwarped_fence_gate_closed"), spruceHHSpruceVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhwarped_vvvvspruce_vvvvspruce"), spruceHHHWarpedVVVVSpruceVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhwarped_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHWarpedVVVVSpruceVVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhwarped_xxwarped"), spruceHHWarpedXXWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvwarped"), spruceHHSpruceVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvwarped_fence_gate_closed"), spruceHHSpruceVVVVWarpedGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle"), crimsonHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhjungle"), crimsonHHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle_vcrimson"), crimsonHHJungleVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle_vcrimson_fence_gate_closed"), crimsonHHJungleVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle_vvjungle"), crimsonHHJungleVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvjungle"), crimsonHHCrimsonVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvjungle_fence_gate_closed"), crimsonHHCrimsonVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvjungle"), crimsonHHCrimsonVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvjungle_fence_gate_closed"), crimsonHHCrimsonVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhjungle_vvvvcrimson_vvvvcrimson"), crimsonHHHJungleVVVVCrimsonVVVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhjungle_vvvvcrimson_vvvvcrimson_fence_gate_closed"), crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhjungle_xxjungle"), crimsonHHJungleXXJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvjungle"), crimsonHHCrimsonVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvjungle_fence_gate_closed"), crimsonHHCrimsonVVVVJungleGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson"), jungleHHCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhcrimson"), jungleHHHCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson_vjungle"), jungleHHCrimsonVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson_vjungle_fence_gate_closed"), jungleHHCrimsonVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson_vvcrimson"), jungleHHCrimsonVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvcrimson"), jungleHHJungleVVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvcrimson_fence_gate_closed"), jungleHHJungleVVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvcrimson"), jungleHHJungleVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvcrimson_fence_gate_closed"), jungleHHJungleVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhcrimson_vvvvjungle_vvvvjungle"), jungleHHHCrimsonVVVVJungleVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhcrimson_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHCrimsonVVVVJungleVVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhcrimson_xxcrimson"), jungleHHCrimsonXXCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvcrimson"), jungleHHJungleVVVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvcrimson_fence_gate_closed"), jungleHHJungleVVVVCrimsonGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak"), crimsonHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhoak"), crimsonHHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak_vcrimson"), crimsonHHOakVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak_vcrimson_fence_gate_closed"), crimsonHHOakVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak_vvoak"), crimsonHHOakVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvoak"), crimsonHHCrimsonVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvoak_fence_gate_closed"), crimsonHHCrimsonVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvoak"), crimsonHHCrimsonVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvoak_fence_gate_closed"), crimsonHHCrimsonVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhoak_vvvvcrimson_vvvvcrimson"), crimsonHHHOakVVVVCrimsonVVVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhoak_vvvvcrimson_vvvvcrimson_fence_gate_closed"), crimsonHHHOakVVVVCrimsonVVVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhoak_xxoak"), crimsonHHOakXXOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvoak"), crimsonHHCrimsonVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvoak_fence_gate_closed"), crimsonHHCrimsonVVVVOakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson"), oakHHCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhcrimson"), oakHHHCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson_voak"), oakHHCrimsonVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson_voak_fence_gate_closed"), oakHHCrimsonVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson_vvcrimson"), oakHHCrimsonVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvcrimson"), oakHHOakVVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvcrimson_fence_gate_closed"), oakHHOakVVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvcrimson"), oakHHOakVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvcrimson_fence_gate_closed"), oakHHOakVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhcrimson_vvvvoak_vvvvoak"), oakHHHCrimsonVVVVOakVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhcrimson_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHCrimsonVVVVOakVVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhcrimson_xxcrimson"), oakHHCrimsonXXCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvcrimson"), oakHHOakVVVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvcrimson_fence_gate_closed"), oakHHOakVVVVCrimsonGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak"), crimsonHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhdark_oak"), crimsonHHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_vcrimson"), crimsonHHDarkoakVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_vcrimson_fence_gate_closed"), crimsonHHDarkoakVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_vvdark_oak"), crimsonHHDarkoakVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvdark_oak"), crimsonHHCrimsonVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvdark_oak_fence_gate_closed"), crimsonHHCrimsonVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvdark_oak"), crimsonHHCrimsonVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvdark_oak_fence_gate_closed"), crimsonHHCrimsonVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson"), crimsonHHHDarkoakVVVVCrimsonVVVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson_fence_gate_closed"), crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhdark_oak_xxdark_oak"), crimsonHHDarkoakXXDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvdark_oak"), crimsonHHCrimsonVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_hhcrimson_vvvvdark_oak_fence_gate_closed"), crimsonHHCrimsonVVVVDarkoakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson"), darkoakHHCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhcrimson"), darkoakHHHCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_vdark_oak"), darkoakHHCrimsonVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_vdark_oak_fence_gate_closed"), darkoakHHCrimsonVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_vvcrimson"), darkoakHHCrimsonVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvcrimson"), darkoakHHDarkoakVVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvcrimson_fence_gate_closed"), darkoakHHDarkoakVVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvcrimson"), darkoakHHDarkoakVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvcrimson_fence_gate_closed"), darkoakHHDarkoakVVCrimsonGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak"), darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhcrimson_xxcrimson"), darkoakHHCrimsonXXCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvcrimson"), darkoakHHDarkoakVVVVCrimson);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvcrimson_fence_gate_closed"), darkoakHHDarkoakVVVVCrimsonGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhoak"), mangroveHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhoak"), mangroveHHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhoak_vmangrove"), mangroveHHOakVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhoak_vmangrove_fence_gate_closed"), mangroveHHOakVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhoak_vvoak"), mangroveHHOakVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvoak"), mangroveHHMangroveVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvoak_fence_gate_closed"), mangroveHHMangroveVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvoak"), mangroveHHMangroveVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvoak_fence_gate_closed"), mangroveHHMangroveVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhoak_vvvvmangrove_vvvvmangrove"), mangroveHHHOakVVVVMangroveVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhoak_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHOakVVVVMangroveVVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhoak_xxoak"), mangroveHHOakXXOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvoak"), mangroveHHMangroveVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvoak_fence_gate_closed"), mangroveHHMangroveVVVVOakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhmangrove"), oakHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhmangrove"), oakHHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhmangrove_voak"), oakHHMangroveVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhmangrove_voak_fence_gate_closed"), oakHHMangroveVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhmangrove_vvmangrove"), oakHHMangroveVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvmangrove"), oakHHOakVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvmangrove_fence_gate_closed"), oakHHOakVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvmangrove"), oakHHOakVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvmangrove_fence_gate_closed"), oakHHOakVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhmangrove_vvvvoak_vvvvoak"), oakHHHMangroveVVVVOakVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhmangrove_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHMangroveVVVVOakVVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhmangrove_xxmangrove"), oakHHMangroveXXMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvmangrove"), oakHHOakVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvmangrove_fence_gate_closed"), oakHHOakVVVVMangroveGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhbirch"), mangroveHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhbirch"), mangroveHHHBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhbirch_vmangrove"), mangroveHHBirchVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhbirch_vmangrove_fence_gate_closed"), mangroveHHBirchVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhbirch_vvbirch"), mangroveHHBirchVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvbirch"), mangroveHHMangroveVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvbirch_fence_gate_closed"), mangroveHHMangroveVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvbirch"), mangroveHHMangroveVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvbirch_fence_gate_closed"), mangroveHHMangroveVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhbirch_vvvvmangrove_vvvvmangrove"), mangroveHHHBirchVVVVMangroveVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhbirch_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHBirchVVVVMangroveVVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhbirch_xxbirch"), mangroveHHBirchXXBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvbirch"), mangroveHHMangroveVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvbirch_fence_gate_closed"), mangroveHHMangroveVVVVBirchGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhmangrove"), birchHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhmangrove"), birchHHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhmangrove_vbirch"), birchHHMangroveVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhmangrove_vbirch_fence_gate_closed"), birchHHMangroveVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhmangrove_vvmangrove"), birchHHMangroveVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvmangrove"), birchHHBirchVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvmangrove_fence_gate_closed"), birchHHBirchVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvmangrove"), birchHHBirchVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvmangrove_fence_gate_closed"), birchHHBirchVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhmangrove_vvvvbirch_vvvvbirch"), birchHHHMangroveVVVVBirchVVVVBirch);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhhmangrove_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHMangroveVVVVBirchVVVVBirchGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhmangrove_xxmangrove"), birchHHMangroveXXMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvmangrove"), birchHHBirchVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_hhbirch_vvvvmangrove_fence_gate_closed"), birchHHBirchVVVVMangroveGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhjungle"), mangroveHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhjungle"), mangroveHHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhjungle_vmangrove"), mangroveHHJungleVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhjungle_vmangrove_fence_gate_closed"), mangroveHHJungleVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhjungle_vvjungle"), mangroveHHJungleVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvjungle"), mangroveHHMangroveVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvjungle_fence_gate_closed"), mangroveHHMangroveVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvjungle"), mangroveHHMangroveVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvjungle_fence_gate_closed"), mangroveHHMangroveVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhjungle_vvvvmangrove_vvvvmangrove"), mangroveHHHJungleVVVVMangroveVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhjungle_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHJungleVVVVMangroveVVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhjungle_xxjungle"), mangroveHHJungleXXJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvjungle"), mangroveHHMangroveVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvjungle_fence_gate_closed"), mangroveHHMangroveVVVVJungleGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhmangrove"), jungleHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhmangrove"), jungleHHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhmangrove_vjungle"), jungleHHMangroveVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhmangrove_vjungle_fence_gate_closed"), jungleHHMangroveVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhmangrove_vvmangrove"), jungleHHMangroveVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvmangrove"), jungleHHJungleVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvmangrove_fence_gate_closed"), jungleHHJungleVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvmangrove"), jungleHHJungleVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvmangrove_fence_gate_closed"), jungleHHJungleVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhmangrove_vvvvjungle_vvvvjungle"), jungleHHHMangroveVVVVJungleVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhmangrove_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHMangroveVVVVJungleVVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhmangrove_xxmangrove"), jungleHHMangroveXXMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvmangrove"), jungleHHJungleVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvmangrove_fence_gate_closed"), jungleHHJungleVVVVMangroveGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak"), mangroveHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhdark_oak"), mangroveHHHDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak_vmangrove"), mangroveHHDarkoakVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak_vmangrove_fence_gate_closed"), mangroveHHDarkoakVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak_vvdark_oak"), mangroveHHDarkoakVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvdark_oak"), mangroveHHMangroveVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvdark_oak_fence_gate_closed"), mangroveHHMangroveVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvdark_oak"), mangroveHHMangroveVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvdark_oak_fence_gate_closed"), mangroveHHMangroveVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove"), mangroveHHHDarkoakVVVVMangroveVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHDarkoakVVVVMangroveVVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhdark_oak_xxdark_oak"), mangroveHHDarkoakXXDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvdark_oak"), mangroveHHMangroveVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvdark_oak_fence_gate_closed"), mangroveHHMangroveVVVVDarkoakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove"), darkoakHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhmangrove"), darkoakHHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove_vdark_oak"), darkoakHHMangroveVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove_vdark_oak_fence_gate_closed"), darkoakHHMangroveVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove_vvmangrove"), darkoakHHMangroveVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvmangrove"), darkoakHHDarkoakVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvmangrove_fence_gate_closed"), darkoakHHDarkoakVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvmangrove"), darkoakHHDarkoakVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvmangrove_fence_gate_closed"), darkoakHHDarkoakVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak"), darkoakHHHMangroveVVVVDarkoakVVVVDarkoak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHMangroveVVVVDarkoakVVVVDarkoakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhmangrove_xxmangrove"), darkoakHHMangroveXXMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvmangrove"), darkoakHHDarkoakVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvmangrove_fence_gate_closed"), darkoakHHDarkoakVVVVMangroveGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhwarped"), mangroveHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhwarped"), mangroveHHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhwarped_vmangrove"), mangroveHHWarpedVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhwarped_vmangrove_fence_gate_closed"), mangroveHHWarpedVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhwarped_vvwarped"), mangroveHHWarpedVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvwarped"), mangroveHHMangroveVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvwarped_fence_gate_closed"), mangroveHHMangroveVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvwarped"), mangroveHHMangroveVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvwarped_fence_gate_closed"), mangroveHHMangroveVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhwarped_vvvvmangrove_vvvvmangrove"), mangroveHHHWarpedVVVVMangroveVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhhwarped_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHWarpedVVVVMangroveVVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhwarped_xxwarped"), mangroveHHWarpedXXWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvwarped"), mangroveHHMangroveVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_hhmangrove_vvvvwarped_fence_gate_closed"), mangroveHHMangroveVVVVWarpedGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhmangrove"), warpedHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhmangrove"), warpedHHHMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhmangrove_vwarped"), warpedHHMangroveVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhmangrove_vwarped_fence_gate_closed"), warpedHHMangroveVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhmangrove_vvmangrove"), warpedHHMangroveVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvmangrove"), warpedHHWarpedVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvmangrove_fence_gate_closed"), warpedHHWarpedVVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvmangrove"), warpedHHWarpedVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvmangrove_fence_gate_closed"), warpedHHWarpedVVMangroveGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhmangrove_vvvvwarped_vvvvwarped"), warpedHHHMangroveVVVVWarpedVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhmangrove_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHMangroveVVVVWarpedVVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhmangrove_xxmangrove"), warpedHHMangroveXXMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvmangrove"), warpedHHWarpedVVVVMangrove);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvmangrove_fence_gate_closed"), warpedHHWarpedVVVVMangroveGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_modern"), cobblestoneModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_building"), cobblestoneBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_castle"), cobblestoneCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_cobblestone_modern"), mossyCobblestoneModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_cobblestone_building"), mossyCobblestoneBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_cobblestone_castle"), mossyCobblestoneCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_modern"), stoneModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_building"), stoneBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_castle"), stoneCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_bricks_modern"), stoneBrickModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_bricks_building"), stoneBrickBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_bricks_castle"), stoneBrickCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_stone_bricks_modern"), mossyStoneBrickModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_stone_bricks_building"), mossyStoneBrickBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_stone_bricks_castle"), mossyStoneBrickCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "andesite_modern"), andesiteModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "andesite_building"), andesiteBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "andesite_castle"), andesiteCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "diorite_modern"), dioriteModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "diorite_building"), dioriteBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "diorite_castle"), dioriteCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "granite_modern"), graniteModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "granite_building"), graniteBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "granite_castle"), graniteCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "sandstone_modern"), sandstoneModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "sandstone_building"), sandstoneBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "sandstone_castle"), sandstoneCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_sandstone_modern"), redSandstoneModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_sandstone_building"), redSandstoneBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_sandstone_castle"), redSandstoneCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bricks_modern"), bricksModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bricks_building"), bricksBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bricks_castle"), bricksCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "prismarine_modern"), prismarineModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "prismarine_building"), prismarineBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "prismarine_castle"), prismarineCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "nether_bricks_modern"), netherBrickModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "nether_bricks_building"), netherBrickBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "nether_bricks_castle"), netherBrickCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_nether_bricks_modern"), redNetherBrickModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_nether_bricks_building"), redNetherBrickBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_nether_bricks_castle"), redNetherBrickCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "end_stone_bricks_modern"), endStoneBrickModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "end_stone_bricks_building"), endStoneBrickBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "end_stone_bricks_castle"), endStoneBrickCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "blackstone_modern"), blackstoneModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "blackstone_building"), blackstoneBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "blackstone_castle"), blackstoneCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_modern"), polishedBlackstoneModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_building"), polishedBlackstoneBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_castle"), polishedBlackstoneCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_modern"), polishedBlackstoneBrickModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_building"), polishedBlackstoneBrickBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_castle"), polishedBlackstoneBrickCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobbled_deepslate_modern"), cobbledDeepslateModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobbled_deepslate_building"), cobbledDeepslateBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobbled_deepslate_castle"), cobbledDeepslateCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_deepslate_modern"), polishedDeepslateModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_deepslate_building"), polishedDeepslateBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_deepslate_castle"), polishedDeepslateCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_brick_modern"), deepslateBrickModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_brick_building"), deepslateBrickBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_brick_castle"), deepslateBrickCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_tile_modern"), deepslateTileModern);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_tile_building"), deepslateTileBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_tile_castle"), deepslateTileCastle);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhoak"), bambooHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhoak"), bambooHHHOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhoak_vbamboo"), bambooHHOakVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhoak_vbamboo_fence_gate_closed"), bambooHHOakVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhoak_vvoak"), bambooHHOakVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvoak"), bambooHHBambooVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvoak_fence_gate_closed"), bambooHHBambooVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvoak"), bambooHHBambooVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvoak_fence_gate_closed"), bambooHHBambooVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhoak_vvvvbamboo_vvvvbamboo"), bambooHHHOakVVVVBambooVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhoak_vvvvbamboo_vvvvbamboo_fence_gate_closed"), bambooHHHOakVVVVBambooVVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhoak_xxoak"), bambooHHOakXXOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvoak"), bambooHHBambooVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvoak_fence_gate_closed"), bambooHHBambooVVVVOakGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbamboo"), oakHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhbamboo"), oakHHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbamboo_voak"), oakHHBambooVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbamboo_voak_fence_gate_closed"), oakHHBambooVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbamboo_vvbamboo"), oakHHBambooVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvbamboo"), oakHHOakVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvbamboo_fence_gate_closed"), oakHHOakVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvbamboo"), oakHHOakVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvbamboo_fence_gate_closed"), oakHHOakVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhbamboo_vvvvoak_vvvvoak"), oakHHHBambooVVVVOakVVVVOak);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhhbamboo_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHBambooVVVVOakVVVVOakGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhbamboo_xxbamboo"), oakHHBambooXXBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvbamboo"), oakHHOakVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_hhoak_vvvvbamboo_fence_gate_closed"), oakHHOakVVVVBambooGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhspruce"), bambooHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhspruce"), bambooHHHSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhspruce_vbamboo"), bambooHHSpruceVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhspruce_vbamboo_fence_gate_closed"), bambooHHSpruceVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhspruce_vvspruce"), bambooHHSpruceVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvspruce"), bambooHHBambooVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvspruce_fence_gate_closed"), bambooHHBambooVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvspruce"), bambooHHBambooVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvspruce_fence_gate_closed"), bambooHHBambooVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhspruce_vvvvbamboo_vvvvbamboo"), bambooHHHSpruceVVVVBambooVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhspruce_vvvvbamboo_vvvvbamboo_fence_gate_closed"), bambooHHHSpruceVVVVBambooVVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhspruce_xxspruce"), bambooHHSpruceXXSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvspruce"), bambooHHBambooVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvspruce_fence_gate_closed"), bambooHHBambooVVVVSpruceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbamboo"), spruceHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhbamboo"), spruceHHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbamboo_vspruce"), spruceHHBambooVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbamboo_vspruce_fence_gate_closed"), spruceHHBambooVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbamboo_vvbamboo"), spruceHHBambooVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvbamboo"), spruceHHSpruceVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvbamboo_fence_gate_closed"), spruceHHSpruceVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvbamboo"), spruceHHSpruceVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvbamboo_fence_gate_closed"), spruceHHSpruceVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhbamboo_vvvvspruce_vvvvspruce"), spruceHHHBambooVVVVSpruceVVVVSpruce);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhhbamboo_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHBambooVVVVSpruceVVVVSpruceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhbamboo_xxbamboo"), spruceHHBambooXXBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvbamboo"), spruceHHSpruceVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_hhspruce_vvvvbamboo_fence_gate_closed"), spruceHHSpruceVVVVBambooGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhjungle"), bambooHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhjungle"), bambooHHHJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhjungle_vbamboo"), bambooHHJungleVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhjungle_vbamboo_fence_gate_closed"), bambooHHJungleVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhjungle_vvjungle"), bambooHHJungleVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvjungle"), bambooHHBambooVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvjungle_fence_gate_closed"), bambooHHBambooVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvjungle"), bambooHHBambooVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvjungle_fence_gate_closed"), bambooHHBambooVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhjungle_vvvvbamboo_vvvvbamboo"), bambooHHHJungleVVVVBambooVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhjungle_vvvvbamboo_vvvvbamboo_fence_gate_closed"), bambooHHHJungleVVVVBambooVVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhjungle_xxjungle"), bambooHHJungleXXJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvjungle"), bambooHHBambooVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvjungle_fence_gate_closed"), bambooHHBambooVVVVJungleGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbamboo"), jungleHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhbamboo"), jungleHHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbamboo_vjungle"), jungleHHBambooVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbamboo_vjungle_fence_gate_closed"), jungleHHBambooVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbamboo_vvbamboo"), jungleHHBambooVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvbamboo"), jungleHHJungleVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvbamboo_fence_gate_closed"), jungleHHJungleVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvbamboo"), jungleHHJungleVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvbamboo_fence_gate_closed"), jungleHHJungleVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhbamboo_vvvvjungle_vvvvjungle"), jungleHHHBambooVVVVJungleVVVVJungle);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhhbamboo_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHBambooVVVVJungleVVVVJungleGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhbamboo_xxbamboo"), jungleHHBambooXXBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvbamboo"), jungleHHJungleVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_hhjungle_vvvvbamboo_fence_gate_closed"), jungleHHJungleVVVVBambooGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhacacia"), bambooHHAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhacacia"), bambooHHHAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhacacia_vbamboo"), bambooHHAcaciaVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhacacia_vbamboo_fence_gate_closed"), bambooHHAcaciaVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhacacia_vvacacia"), bambooHHAcaciaVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvacacia"), bambooHHBambooVVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvacacia_fence_gate_closed"), bambooHHBambooVVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvacacia"), bambooHHBambooVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvacacia_fence_gate_closed"), bambooHHBambooVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhacacia_vvvvbamboo_vvvvbamboo"), bambooHHHAcaciaVVVVBambooVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhacacia_vvvvbamboo_vvvvbamboo_fence_gate_closed"), bambooHHHAcaciaVVVVBambooVVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhacacia_xxacacia"), bambooHHAcaciaXXAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvacacia"), bambooHHBambooVVVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvacacia_fence_gate_closed"), bambooHHBambooVVVVAcaciaGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbamboo"), acaciaHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhbamboo"), acaciaHHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbamboo_vacacia"), acaciaHHBambooVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbamboo_vacacia_fence_gate_closed"), acaciaHHBambooVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbamboo_vvbamboo"), acaciaHHBambooVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvbamboo"), acaciaHHAcaciaVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvbamboo_fence_gate_closed"), acaciaHHAcaciaVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvbamboo"), acaciaHHAcaciaVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvbamboo_fence_gate_closed"), acaciaHHAcaciaVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhbamboo_vvvvacacia_vvvvacacia"), acaciaHHHBambooVVVVAcaciaVVVVAcacia);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhhbamboo_vvvvacacia_vvvvacacia_fence_gate_closed"), acaciaHHHBambooVVVVAcaciaVVVVAcaciaGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhbamboo_xxbamboo"), acaciaHHBambooXXBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvbamboo"), acaciaHHAcaciaVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_hhacacia_vvvvbamboo_fence_gate_closed"), acaciaHHAcaciaVVVVBambooGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhwarped"), bambooHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhwarped"), bambooHHHWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhwarped_vbamboo"), bambooHHWarpedVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhwarped_vbamboo_fence_gate_closed"), bambooHHWarpedVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhwarped_vvwarped"), bambooHHWarpedVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvwarped"), bambooHHBambooVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvwarped_fence_gate_closed"), bambooHHBambooVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvwarped"), bambooHHBambooVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvwarped_fence_gate_closed"), bambooHHBambooVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhwarped_vvvvbamboo_vvvvbamboo"), bambooHHHWarpedVVVVBambooVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhhwarped_vvvvbamboo_vvvvbamboo_fence_gate_closed"), bambooHHHWarpedVVVVBambooVVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhwarped_xxwarped"), bambooHHWarpedXXWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvwarped"), bambooHHBambooVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_hhbamboo_vvvvwarped_fence_gate_closed"), bambooHHBambooVVVVWarpedGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbamboo"), warpedHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhbamboo"), warpedHHHBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbamboo_vwarped"), warpedHHBambooVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbamboo_vwarped_fence_gate_closed"), warpedHHBambooVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbamboo_vvbamboo"), warpedHHBambooVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvbamboo"), warpedHHWarpedVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvbamboo_fence_gate_closed"), warpedHHWarpedVVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvbamboo"), warpedHHWarpedVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvbamboo_fence_gate_closed"), warpedHHWarpedVVBambooGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhbamboo_vvvvwarped_vvvvwarped"), warpedHHHBambooVVVVWarpedVVVVWarped);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhhbamboo_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHBambooVVVVWarpedVVVVWarpedGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhbamboo_xxbamboo"), warpedHHBambooXXBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvbamboo"), warpedHHWarpedVVVVBamboo);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_hhwarped_vvvvbamboo_fence_gate_closed"), warpedHHWarpedVVVVBambooGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_wall_building"), oakWallBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_wall_building"), birchWallBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_wall_building"), spruceWallBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_wall_building"), acaciaWallBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_wall_building"), jungleWallBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "dark_oak_wall_building"), darkoakWallBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_wall_building"), crimsonWallBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_wall_building"), warpedWallBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_wall_building"), mangroveWallBuilding);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_wall_building"), bambooWallBuilding);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_copper_fence"), cobblestoneCopperFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_exposed_copper_fence"), cobblestoneExposedCopperFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_weathered_copper_fence"), cobblestoneWeatheredCopperFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_oxidized_copper_fence"), cobblestoneOxidizedCopperFence);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "copper_fence_gate_closed"), copperFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "exposed_copper_fence_gate_closed"), exposedCopperFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "weathered_copper_fence_gate_closed"), weatheredCopperFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oxidized_copper_fence_gate_closed"), oxidizedCopperFenceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_copper_fence"), cobblestoneWaxedCopperFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_exposed_copper_fence"), cobblestoneWaxedExposedCopperFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_weathered_copper_fence"), cobblestoneWaxedWeatheredCopperFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_oxidized_copper_fence"), cobblestoneWaxedOxidizedCopperFence);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_copper_fence_gate_closed"), waxedCopperFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_exposed_copper_fence_gate_closed"), waxedExposedCopperFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_weathered_copper_fence_gate_closed"), waxedWeatheredCopperFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_oxidized_copper_fence_gate_closed"), waxedOxidizedCopperFenceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_iron_fence"), cobblestoneIronFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_exposed_iron_fence"), cobblestoneExposedIronFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_weathered_iron_fence"), cobblestoneWeatheredIronFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_oxidized_iron_fence"), cobblestoneOxidizedIronFence);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "iron_fence_gate_closed"), ironFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "exposed_iron_fence_gate_closed"), exposedIronFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "weathered_iron_fence_gate_closed"), weatheredIronFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oxidized_iron_fence_gate_closed"), oxidizedIronFenceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_iron_fence"), cobblestoneWaxedIronFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_exposed_iron_fence"), cobblestoneWaxedExposedIronFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_weathered_iron_fence"), cobblestoneWaxedWeatheredIronFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_oxidized_iron_fence"), cobblestoneWaxedOxidizedIronFence);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_iron_fence_gate_closed"), waxedIronFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_exposed_iron_fence_gate_closed"), waxedExposedIronFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_weathered_iron_fence_gate_closed"), waxedWeatheredIronFenceGate);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_oxidized_iron_fence_gate_closed"), waxedOxidizedIronFenceGate);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_gold_fence"), cobblestoneGoldFence);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "gold_fence_gate_closed"), goldFenceGate);

    }

}
