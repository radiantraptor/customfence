package com.raptor.customfence_fabric.init;

import com.google.common.collect.ImmutableMap;
import com.raptor.customfence_fabric.Main;
import com.raptor.customfence_fabric.blocks.*;
import io.netty.util.Mapping;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.mapping.reader.v2.MappingGetter;
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
import org.spongepowered.tools.obfuscation.mapping.common.MappingProvider;

import java.util.*;


@SuppressWarnings({"WeakerAccess", "unused"})
public class ModBlocks {

    //BEGIN WOODENFENCEGATES

    public static final Block OAK_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BIRCH_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block SPRUCE_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block JUNGLE_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block ACACIA_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block DARKOAK_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block WARPED_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CRIMSON_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block MANGROVE_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BAMBOO_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CHERRY_CLASSIC_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_WILDLIFE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_PLANK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_CRISSCROSS_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    //END WOODENFENCEGATES AND BEGIN WOODENFENCES

    public static final Block SPRUCE_OAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_OAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_OAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_OAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_OAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_OAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_OAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_OAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_OAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_OAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_OAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_OAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_OAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_OAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block OAK_SPRUCE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_SPRUCE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_SPRUCE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_SPRUCE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_SPRUCE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_SPRUCE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_SPRUCE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_SPRUCE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_SPRUCE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_SPRUCE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_SPRUCE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_SPRUCE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_SPRUCE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_SPRUCE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block OAK_BIRCH_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BIRCH_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BIRCH_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BIRCH_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_BIRCH_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BIRCH_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BIRCH_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_BIRCH_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BIRCH_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_BIRCH_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BIRCH_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_BIRCH_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BIRCH_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BIRCH_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BIRCH_OAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_OAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_OAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_OAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_OAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_OAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_OAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_OAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_OAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_OAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_OAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_OAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_OAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_OAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block SPRUCE_BIRCH_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BIRCH_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BIRCH_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BIRCH_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_BIRCH_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BIRCH_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BIRCH_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_BIRCH_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BIRCH_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_BIRCH_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BIRCH_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_BIRCH_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BIRCH_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BIRCH_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BIRCH_SPRUCE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_SPRUCE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_SPRUCE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_SPRUCE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_SPRUCE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_SPRUCE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_SPRUCE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_SPRUCE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_SPRUCE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_SPRUCE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_SPRUCE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_SPRUCE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_SPRUCE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_SPRUCE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block DARKOAK_SPRUCE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_SPRUCE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_SPRUCE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_SPRUCE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_SPRUCE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_SPRUCE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_SPRUCE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_SPRUCE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_SPRUCE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_SPRUCE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_SPRUCE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_SPRUCE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_SPRUCE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_SPRUCE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block SPRUCE_DARKOAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DARKOAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DARKOAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DARKOAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_DARKOAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DARKOAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DARKOAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_DARKOAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DARKOAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_DARKOAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DARKOAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_DARKOAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DARKOAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_DARKOAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block DARKOAK_OAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_OAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_OAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_OAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_OAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_OAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_OAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_OAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_OAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_OAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_OAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_OAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_OAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_OAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block OAK_DARKOAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_DARKOAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_DARKOAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_DARKOAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_DARKOAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_DARKOAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_DARKOAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_DARKOAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_DARKOAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_DARKOAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_DARKOAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_DARKOAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_DARKOAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_DARKOAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block DARKOAK_JUNGLE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_JUNGLE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_JUNGLE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_JUNGLE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_JUNGLE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_JUNGLE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_JUNGLE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_JUNGLE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_JUNGLE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_JUNGLE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_JUNGLE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_JUNGLE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_JUNGLE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_JUNGLE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block JUNGLE_DARKOAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DARKOAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DARKOAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DARKOAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_DARKOAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DARKOAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DARKOAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_DARKOAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DARKOAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_DARKOAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DARKOAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_DARKOAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DARKOAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_DARKOAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block ACACIA_JUNGLE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_JUNGLE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_JUNGLE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_JUNGLE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_JUNGLE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_JUNGLE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_JUNGLE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_JUNGLE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_JUNGLE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_JUNGLE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_JUNGLE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_JUNGLE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_JUNGLE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_JUNGLE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block JUNGLE_ACACIA_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_ACACIA_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_ACACIA_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_ACACIA_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_ACACIA_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_ACACIA_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_ACACIA_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_ACACIA_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_ACACIA_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_ACACIA_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_ACACIA_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_ACACIA_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_ACACIA_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_ACACIA_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block ACACIA_BIRCH_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BIRCH_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BIRCH_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BIRCH_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_BIRCH_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BIRCH_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BIRCH_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_BIRCH_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BIRCH_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_BIRCH_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BIRCH_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_BIRCH_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BIRCH_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BIRCH_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BIRCH_ACACIA_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_ACACIA_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_ACACIA_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_ACACIA_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_ACACIA_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_ACACIA_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_ACACIA_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_ACACIA_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_ACACIA_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_ACACIA_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_ACACIA_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_ACACIA_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_ACACIA_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_ACACIA_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block JUNGLE_BIRCH_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BIRCH_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BIRCH_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BIRCH_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_BIRCH_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BIRCH_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BIRCH_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_BIRCH_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BIRCH_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_BIRCH_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BIRCH_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_BIRCH_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BIRCH_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BIRCH_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BIRCH_JUNGLE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_JUNGLE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_JUNGLE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_JUNGLE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_JUNGLE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_JUNGLE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_JUNGLE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_JUNGLE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_JUNGLE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_JUNGLE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_JUNGLE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_JUNGLE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_JUNGLE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_JUNGLE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block WARPED_BIRCH_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BIRCH_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BIRCH_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BIRCH_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_BIRCH_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BIRCH_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BIRCH_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_BIRCH_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BIRCH_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_BIRCH_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BIRCH_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_BIRCH_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BIRCH_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BIRCH_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BIRCH_WARPED_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WARPED_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WARPED_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WARPED_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_WARPED_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WARPED_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WARPED_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_WARPED_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WARPED_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_WARPED_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WARPED_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_WARPED_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WARPED_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WARPED_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block WARPED_OAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_OAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_OAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_OAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_OAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_OAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_OAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_OAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_OAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_OAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_OAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_OAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_OAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_OAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block OAK_WARPED_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WARPED_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WARPED_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WARPED_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_WARPED_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WARPED_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WARPED_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_WARPED_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WARPED_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_WARPED_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WARPED_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_WARPED_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WARPED_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WARPED_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block WARPED_SPRUCE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_SPRUCE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_SPRUCE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_SPRUCE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_SPRUCE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_SPRUCE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_SPRUCE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_SPRUCE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_SPRUCE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_SPRUCE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_SPRUCE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_SPRUCE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_SPRUCE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_SPRUCE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block SPRUCE_WARPED_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WARPED_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WARPED_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WARPED_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_WARPED_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WARPED_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WARPED_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_WARPED_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WARPED_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_WARPED_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WARPED_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_WARPED_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WARPED_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WARPED_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CRIMSON_JUNGLE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_JUNGLE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_JUNGLE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_JUNGLE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_JUNGLE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_JUNGLE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_JUNGLE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_JUNGLE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_JUNGLE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_JUNGLE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_JUNGLE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_JUNGLE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_JUNGLE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_JUNGLE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block JUNGLE_CRIMSON_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CRIMSON_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CRIMSON_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CRIMSON_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_CRIMSON_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CRIMSON_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CRIMSON_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_CRIMSON_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CRIMSON_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_CRIMSON_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CRIMSON_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_CRIMSON_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CRIMSON_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CRIMSON_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CRIMSON_OAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_OAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_OAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_OAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_OAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_OAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_OAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_OAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_OAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_OAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_OAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_OAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_OAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_OAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block OAK_CRIMSON_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_CRIMSON_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_CRIMSON_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_CRIMSON_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_CRIMSON_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_CRIMSON_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_CRIMSON_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_CRIMSON_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_CRIMSON_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_CRIMSON_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_CRIMSON_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_CRIMSON_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_CRIMSON_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_CRIMSON_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CRIMSON_DARKOAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DARKOAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DARKOAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DARKOAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_DARKOAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DARKOAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DARKOAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_DARKOAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DARKOAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_DARKOAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DARKOAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_DARKOAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DARKOAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_DARKOAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block DARKOAK_CRIMSON_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_CRIMSON_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_CRIMSON_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_CRIMSON_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_CRIMSON_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_CRIMSON_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_CRIMSON_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_CRIMSON_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_CRIMSON_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_CRIMSON_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_CRIMSON_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_CRIMSON_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_CRIMSON_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_CRIMSON_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block MANGROVE_OAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_OAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_OAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_OAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_OAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_OAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_OAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_OAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_OAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_OAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_OAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_OAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_OAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_OAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block OAK_MANGROVE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_MANGROVE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_MANGROVE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_MANGROVE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_MANGROVE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_MANGROVE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_MANGROVE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_MANGROVE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_MANGROVE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_MANGROVE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_MANGROVE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_MANGROVE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_MANGROVE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_MANGROVE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block MANGROVE_BIRCH_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_BIRCH_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_BIRCH_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_BIRCH_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_BIRCH_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_BIRCH_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_BIRCH_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_BIRCH_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_BIRCH_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_BIRCH_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_BIRCH_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_BIRCH_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_BIRCH_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_BIRCH_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BIRCH_MANGROVE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_MANGROVE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_MANGROVE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_MANGROVE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_MANGROVE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_MANGROVE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_MANGROVE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_MANGROVE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_MANGROVE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_MANGROVE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_MANGROVE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BIRCH_MANGROVE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_MANGROVE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_MANGROVE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block MANGROVE_JUNGLE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_JUNGLE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_JUNGLE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_JUNGLE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_JUNGLE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_JUNGLE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_JUNGLE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_JUNGLE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_JUNGLE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_JUNGLE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_JUNGLE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_JUNGLE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_JUNGLE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_JUNGLE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block JUNGLE_MANGROVE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_MANGROVE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_MANGROVE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_MANGROVE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_MANGROVE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_MANGROVE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_MANGROVE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_MANGROVE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_MANGROVE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_MANGROVE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_MANGROVE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_MANGROVE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_MANGROVE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_MANGROVE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block MANGROVE_DARKOAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DARKOAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DARKOAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DARKOAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_DARKOAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DARKOAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DARKOAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_DARKOAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DARKOAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_DARKOAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DARKOAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_DARKOAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DARKOAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_DARKOAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block DARKOAK_MANGROVE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_MANGROVE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_MANGROVE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_MANGROVE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_MANGROVE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_MANGROVE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_MANGROVE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_MANGROVE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_MANGROVE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_MANGROVE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_MANGROVE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block DARKOAK_MANGROVE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_MANGROVE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARKOAK_MANGROVE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block MANGROVE_WARPED_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_WARPED_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_WARPED_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_WARPED_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_WARPED_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_WARPED_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_WARPED_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_WARPED_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_WARPED_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_WARPED_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_WARPED_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_WARPED_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_WARPED_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_WARPED_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block WARPED_MANGROVE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_MANGROVE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_MANGROVE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_MANGROVE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_MANGROVE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_MANGROVE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_MANGROVE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_MANGROVE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_MANGROVE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_MANGROVE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_MANGROVE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_MANGROVE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_MANGROVE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_MANGROVE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BAMBOO_OAK_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_OAK_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_OAK_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_OAK_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_OAK_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_OAK_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_OAK_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_OAK_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_OAK_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_OAK_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_OAK_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_OAK_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_OAK_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_OAK_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block OAK_BAMBOO_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BAMBOO_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BAMBOO_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BAMBOO_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_BAMBOO_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BAMBOO_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BAMBOO_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_BAMBOO_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BAMBOO_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_BAMBOO_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BAMBOO_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block OAK_BAMBOO_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BAMBOO_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_BAMBOO_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BAMBOO_SPRUCE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_SPRUCE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_SPRUCE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_SPRUCE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_SPRUCE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_SPRUCE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_SPRUCE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_SPRUCE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_SPRUCE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_SPRUCE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_SPRUCE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_SPRUCE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_SPRUCE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_SPRUCE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block SPRUCE_BAMBOO_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BAMBOO_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BAMBOO_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BAMBOO_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_BAMBOO_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BAMBOO_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BAMBOO_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_BAMBOO_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BAMBOO_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_BAMBOO_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BAMBOO_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block SPRUCE_BAMBOO_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BAMBOO_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_BAMBOO_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BAMBOO_JUNGLE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_JUNGLE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_JUNGLE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_JUNGLE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_JUNGLE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_JUNGLE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_JUNGLE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_JUNGLE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_JUNGLE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_JUNGLE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_JUNGLE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_JUNGLE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_JUNGLE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_JUNGLE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block JUNGLE_BAMBOO_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BAMBOO_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BAMBOO_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BAMBOO_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_BAMBOO_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BAMBOO_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BAMBOO_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_BAMBOO_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BAMBOO_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_BAMBOO_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BAMBOO_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_BAMBOO_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BAMBOO_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_BAMBOO_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BAMBOO_ACACIA_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_ACACIA_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_ACACIA_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_ACACIA_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_ACACIA_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_ACACIA_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_ACACIA_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_ACACIA_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_ACACIA_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_ACACIA_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_ACACIA_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_ACACIA_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_ACACIA_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_ACACIA_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block ACACIA_BAMBOO_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BAMBOO_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BAMBOO_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BAMBOO_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_BAMBOO_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BAMBOO_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BAMBOO_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_BAMBOO_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BAMBOO_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_BAMBOO_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BAMBOO_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_BAMBOO_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BAMBOO_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_BAMBOO_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BAMBOO_WARPED_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_WARPED_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_WARPED_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_WARPED_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_WARPED_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_WARPED_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_WARPED_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_WARPED_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_WARPED_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_WARPED_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_WARPED_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_WARPED_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_WARPED_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_WARPED_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block WARPED_BAMBOO_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BAMBOO_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BAMBOO_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BAMBOO_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_BAMBOO_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BAMBOO_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BAMBOO_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_BAMBOO_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BAMBOO_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_BAMBOO_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BAMBOO_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block WARPED_BAMBOO_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BAMBOO_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block WARPED_BAMBOO_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CHERRY_JUNGLE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_JUNGLE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_JUNGLE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_JUNGLE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_JUNGLE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_JUNGLE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_JUNGLE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_JUNGLE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_JUNGLE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_JUNGLE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_JUNGLE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_JUNGLE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_JUNGLE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_JUNGLE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block JUNGLE_CHERRY_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CHERRY_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CHERRY_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CHERRY_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_CHERRY_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CHERRY_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CHERRY_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_CHERRY_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CHERRY_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_CHERRY_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CHERRY_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block JUNGLE_CHERRY_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CHERRY_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_CHERRY_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CHERRY_ACACIA_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_ACACIA_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_ACACIA_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_ACACIA_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_ACACIA_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_ACACIA_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_ACACIA_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_ACACIA_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_ACACIA_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_ACACIA_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_ACACIA_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_ACACIA_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_ACACIA_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_ACACIA_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block ACACIA_CHERRY_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_CHERRY_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_CHERRY_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_CHERRY_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_CHERRY_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_CHERRY_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_CHERRY_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_CHERRY_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_CHERRY_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_CHERRY_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_CHERRY_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block ACACIA_CHERRY_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_CHERRY_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_CHERRY_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CHERRY_MANGROVE_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_MANGROVE_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_MANGROVE_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_MANGROVE_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_MANGROVE_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_MANGROVE_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_MANGROVE_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_MANGROVE_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_MANGROVE_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_MANGROVE_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_MANGROVE_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_MANGROVE_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_MANGROVE_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_MANGROVE_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block MANGROVE_CHERRY_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_CHERRY_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_CHERRY_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_CHERRY_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_CHERRY_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_CHERRY_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_CHERRY_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_CHERRY_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_CHERRY_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_CHERRY_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_CHERRY_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block MANGROVE_CHERRY_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_CHERRY_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block MANGROVE_CHERRY_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CHERRY_BAMBOO_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_BAMBOO_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_BAMBOO_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_BAMBOO_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_BAMBOO_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_BAMBOO_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_BAMBOO_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_BAMBOO_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_BAMBOO_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_BAMBOO_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_BAMBOO_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_BAMBOO_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_BAMBOO_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_BAMBOO_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block BAMBOO_CHERRY_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_CHERRY_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_CHERRY_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_CHERRY_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_CHERRY_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_CHERRY_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_CHERRY_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_CHERRY_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_CHERRY_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_CHERRY_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_CHERRY_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block BAMBOO_CHERRY_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_CHERRY_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block BAMBOO_CHERRY_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CHERRY_CRIMSON_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_CRIMSON_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_CRIMSON_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_CRIMSON_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_CRIMSON_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_CRIMSON_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_CRIMSON_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_CRIMSON_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_CRIMSON_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_CRIMSON_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_CRIMSON_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CHERRY_CRIMSON_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_CRIMSON_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CHERRY_CRIMSON_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    public static final Block CRIMSON_CHERRY_CLASSIC = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_CHERRY_WILDLIFE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_CHERRY_DECORATION = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_CHERRY_DECORATION_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_CHERRY_PLANK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_CHERRY_GARDEN = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_CHERRY_GARDEN_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_CHERRY_BOLLARD = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_CHERRY_BOLLARD_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_CHERRY_STICK = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_CHERRY_STICK_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);
    public static final Block CRIMSON_CHERRY_CRISSCROSS = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_CHERRY_SPIRE = new Fence(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block CRIMSON_CHERRY_SPIRE_GATE = new FenceGate(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD), WoodType.OAK);

    //END WOODENFENCES AND BEGIN STONEWALLS

    public static final Block  COBBLESTONE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  MOSSY_COBBLESTONE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  MOSSY_COBBLESTONE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  MOSSY_COBBLESTONE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  STONE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  STONE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  STONE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  STONE_BRICKS_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  STONE_BRICKS_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  STONE_BRICKS_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  MOSSY_STONE_BRICKS_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  MOSSY_STONE_BRICKS_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  MOSSY_STONE_BRICKS_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  ANDESITE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  ANDESITE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  ANDESITE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  DIORITE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  DIORITE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  DIORITE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  GRANITE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  GRANITE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  GRANITE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  SANDSTONE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));
    public static final Block  SANDSTONE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));
    public static final Block  SANDSTONE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));

    public static final Block  RED_SANDSTONE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));
    public static final Block  RED_SANDSTONE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));
    public static final Block  RED_SANDSTONE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(0.8F, 0.8F).sounds(BlockSoundGroup.STONE));

    public static final Block  BRICKS_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  BRICKS_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  BRICKS_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  PRISMARINE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  PRISMARINE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  PRISMARINE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  NETHER_BRICKS_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));
    public static final Block  NETHER_BRICKS_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));
    public static final Block  NETHER_BRICKS_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));

    public static final Block  RED_NETHER_BRICKS_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));
    public static final Block  RED_NETHER_BRICKS_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));
    public static final Block  RED_NETHER_BRICKS_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS));

    public static final Block  END_STONE_BRICKS_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  END_STONE_BRICKS_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  END_STONE_BRICKS_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  BLACKSTONE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  BLACKSTONE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  BLACKSTONE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  POLISHED_BLACKSTONE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  POLISHED_BLACKSTONE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  POLISHED_BLACKSTONE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  POLISHED_BLACKSTONE_BRICKS_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  POLISHED_BLACKSTONE_BRICKS_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  POLISHED_BLACKSTONE_BRICKS_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  COBBLED_DEEPSLATE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block  COBBLED_DEEPSLATE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block  COBBLED_DEEPSLATE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));

    public static final Block  POLISHED_DEEPSLATE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block  POLISHED_DEEPSLATE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block  POLISHED_DEEPSLATE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE));

    public static final Block  DEEPSLATE_BRICK_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block  DEEPSLATE_BRICK_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block  DEEPSLATE_BRICK_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_BRICKS));

    public static final Block  DEEPSLATE_TILE_MODERN = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    public static final Block  DEEPSLATE_TILE_BUILDING = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    public static final Block  DEEPSLATE_TILE_CASTLE = new Wall(FabricBlockSettings.create().requiresTool().strength(3.5F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE_TILES));
    
    //END STONEWALLS AND BEGIN WOODENWALLS

    public static final Block  OAK_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  BIRCH_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  SPRUCE_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  ACACIA_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  JUNGLE_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  DARKOAK_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  CRIMSON_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  WARPED_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  MANGROVE_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  BAMBOO_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block  CHERRY_WALL_BUILDING = new WoodWall(FabricBlockSettings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));

    
    //END WOODENWALLS AND BEGIN METALLFENCES

    public static final Block  COBBLESTONE_COPPER_FENCE = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_EXPOSED_COPPER_FENCE = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_WEATHERED_COPPER_FENCE = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_OXIDIZED_COPPER_FENCE = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  COPPER_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  EXPOSED_COPPER_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  WEATHERED_COPPER_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  OXIDIZED_COPPER_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);

    public static final Block  COBBLESTONE_WAXED_COPPER_FENCE = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_WAXED_EXPOSED_COPPER_FENCE = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_WAXED_WEATHERED_COPPER_FENCE = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_WAXED_OXIDIZED_COPPER_FENCE = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  WAXED_COPPER_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  WAXED_EXPOSED_COPPER_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  WAXED_WEATHERED_COPPER_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  WAXED_OXIDIZED_COPPER_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);

    public static final Block  COBBLESTONE_IRON_FENCE = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_EXPOSED_IRON_FENCE = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_WEATHERED_IRON_FENCE = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_OXIDIZED_IRON_FENCE = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  IRON_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  EXPOSED_IRON_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  WEATHERED_IRON_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  OXIDIZED_IRON_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);

    public static final Block  COBBLESTONE_WAXED_IRON_FENCE = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_WAXED_EXPOSED_IRON_FENCE = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_WAXED_WEATHERED_IRON_FENCE = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  COBBLESTONE_WAXED_OXIDIZED_IRON_FENCE = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block  WAXED_IRON_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  WAXED_EXPOSED_IRON_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  WAXED_WEATHERED_IRON_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);
    public static final Block  WAXED_OXIDIZED_IRON_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);

    public static final Block  COBBLESTONE_GOLD_FENCE = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static final Block  GOLD_FENCE_GATE = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.create().strength(3.0F, 6.0F).sounds(BlockSoundGroup.COPPER), WoodType.BIRCH);


    //END METALLFENCES

    public static void registerBlocks() {
    
        //BEGIN WOODENFENCEGATES2

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_classic_fence_gate"), OAK_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_wildlife_fence_gate"), OAK_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_plank_fence_gate"), OAK_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crisscross_fence_gate"), OAK_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_classic_fence_gate"), BIRCH_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_wildlife_fence_gate"), BIRCH_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_plank_fence_gate"), BIRCH_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_crisscross_fence_gate"), BIRCH_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_classic_fence_gate"), SPRUCE_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_wildlife_fence_gate"), SPRUCE_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_plank_fence_gate"), SPRUCE_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_crisscross_fence_gate"), SPRUCE_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_classic_fence_gate"), JUNGLE_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_wildlife_fence_gate"), JUNGLE_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_plank_fence_gate"), JUNGLE_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crisscross_fence_gate"), JUNGLE_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_classic_fence_gate"), ACACIA_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_wildlife_fence_gate"), ACACIA_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_plank_fence_gate"), ACACIA_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_crisscross_fence_gate"), ACACIA_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_classic_fence_gate"), DARKOAK_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_wildlife_fence_gate"), DARKOAK_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_plank_fence_gate"), DARKOAK_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crisscross_fence_gate"), DARKOAK_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_classic_fence_gate"), WARPED_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_wildlife_fence_gate"), WARPED_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_plank_fence_gate"), WARPED_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_crisscross_fence_gate"), WARPED_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_classic_fence_gate"), CRIMSON_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_wildlife_fence_gate"), CRIMSON_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_plank_fence_gate"), CRIMSON_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_crisscross_fence_gate"), CRIMSON_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_classic_fence_gate"), MANGROVE_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_wildlife_fence_gate"), MANGROVE_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_plank_fence_gate"), MANGROVE_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_crisscross_fence_gate"), MANGROVE_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_classic_fence_gate"), BAMBOO_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_wildlife_fence_gate"), BAMBOO_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_plank_fence_gate"), BAMBOO_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_crisscross_fence_gate"), BAMBOO_CRISSCROSS_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_classic_fence_gate"), CHERRY_CLASSIC_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_wildlife_fence_gate"), CHERRY_WILDLIFE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_plank_fence_gate"), CHERRY_PLANK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crisscross_fence_gate"), CHERRY_CRISSCROSS_GATE);

        //END WOODENFENCEGATES2 AND BEGIN WOODENFENCES2

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_classic"), SPRUCE_OAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_wildlife"), SPRUCE_OAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_decoration"), SPRUCE_OAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_decoration_fence_gate"), SPRUCE_OAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_plank"), SPRUCE_OAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_garden"), SPRUCE_OAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_garden_fence_gate"), SPRUCE_OAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_bollard"), SPRUCE_OAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_bollard_fence_gate"), SPRUCE_OAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_stick"), SPRUCE_OAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_stick_fence_gate"), SPRUCE_OAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_crisscross"), SPRUCE_OAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_spire"), SPRUCE_OAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_oak_spire_fence_gate"), SPRUCE_OAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_classic"), OAK_SPRUCE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_wildlife"), OAK_SPRUCE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_decoration"), OAK_SPRUCE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_decoration_fence_gate"), OAK_SPRUCE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_plank"), OAK_SPRUCE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_garden"), OAK_SPRUCE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_garden_fence_gate"), OAK_SPRUCE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_bollard"), OAK_SPRUCE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_bollard_fence_gate"), OAK_SPRUCE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_stick"), OAK_SPRUCE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_stick_fence_gate"), OAK_SPRUCE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_crisscross"), OAK_SPRUCE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_spire"), OAK_SPRUCE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_spruce_spire_fence_gate"), OAK_SPRUCE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_classic"), OAK_BIRCH_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_wildlife"), OAK_BIRCH_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_decoration"), OAK_BIRCH_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_decoration_fence_gate"), OAK_BIRCH_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_plank"), OAK_BIRCH_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_garden"), OAK_BIRCH_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_garden_fence_gate"), OAK_BIRCH_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_bollard"), OAK_BIRCH_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_bollard_fence_gate"), OAK_BIRCH_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_stick"), OAK_BIRCH_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_stick_fence_gate"), OAK_BIRCH_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_crisscross"), OAK_BIRCH_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_spire"), OAK_BIRCH_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_birch_spire_fence_gate"), OAK_BIRCH_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_classic"), BIRCH_OAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_wildlife"), BIRCH_OAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_decoration"), BIRCH_OAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_decoration_fence_gate"), BIRCH_OAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_plank"), BIRCH_OAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_garden"), BIRCH_OAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_garden_fence_gate"), BIRCH_OAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_bollard"), BIRCH_OAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_bollard_fence_gate"), BIRCH_OAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_stick"), BIRCH_OAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_stick_fence_gate"), BIRCH_OAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_crisscross"), BIRCH_OAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_spire"), BIRCH_OAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_oak_spire_fence_gate"), BIRCH_OAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_classic"), SPRUCE_BIRCH_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_wildlife"), SPRUCE_BIRCH_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_decoration"), SPRUCE_BIRCH_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_decoration_fence_gate"), SPRUCE_BIRCH_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_plank"), SPRUCE_BIRCH_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_garden"), SPRUCE_BIRCH_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_garden_fence_gate"), SPRUCE_BIRCH_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_bollard"), SPRUCE_BIRCH_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_bollard_fence_gate"), SPRUCE_BIRCH_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_stick"), SPRUCE_BIRCH_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_stick_fence_gate"), SPRUCE_BIRCH_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_crisscross"), SPRUCE_BIRCH_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_spire"), SPRUCE_BIRCH_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_birch_spire_fence_gate"), SPRUCE_BIRCH_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_classic"), BIRCH_SPRUCE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_wildlife"), BIRCH_SPRUCE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_decoration"), BIRCH_SPRUCE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_decoration_fence_gate"), BIRCH_SPRUCE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_plank"), BIRCH_SPRUCE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_garden"), BIRCH_SPRUCE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_garden_fence_gate"), BIRCH_SPRUCE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_bollard"), BIRCH_SPRUCE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_bollard_fence_gate"), BIRCH_SPRUCE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_stick"), BIRCH_SPRUCE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_stick_fence_gate"), BIRCH_SPRUCE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_crisscross"), BIRCH_SPRUCE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_spire"), BIRCH_SPRUCE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_spruce_spire_fence_gate"), BIRCH_SPRUCE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_classic"), DARKOAK_SPRUCE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_wildlife"), DARKOAK_SPRUCE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_decoration"), DARKOAK_SPRUCE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_decoration_fence_gate"), DARKOAK_SPRUCE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_plank"), DARKOAK_SPRUCE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_garden"), DARKOAK_SPRUCE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_garden_fence_gate"), DARKOAK_SPRUCE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_bollard"), DARKOAK_SPRUCE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_bollard_fence_gate"), DARKOAK_SPRUCE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_stick"), DARKOAK_SPRUCE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_stick_fence_gate"), DARKOAK_SPRUCE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_crisscross"), DARKOAK_SPRUCE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_spire"), DARKOAK_SPRUCE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_spruce_spire_fence_gate"), DARKOAK_SPRUCE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_classic"), SPRUCE_DARKOAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_wildlife"), SPRUCE_DARKOAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_decoration"), SPRUCE_DARKOAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_decoration_fence_gate"), SPRUCE_DARKOAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_plank"), SPRUCE_DARKOAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_garden"), SPRUCE_DARKOAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_garden_fence_gate"), SPRUCE_DARKOAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_bollard"), SPRUCE_DARKOAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_bollard_fence_gate"), SPRUCE_DARKOAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_stick"), SPRUCE_DARKOAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_stick_fence_gate"), SPRUCE_DARKOAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_crisscross"), SPRUCE_DARKOAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_spire"), SPRUCE_DARKOAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_darkoak_spire_fence_gate"), SPRUCE_DARKOAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_classic"), DARKOAK_OAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_wildlife"), DARKOAK_OAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_decoration"), DARKOAK_OAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_decoration_fence_gate"), DARKOAK_OAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_plank"), DARKOAK_OAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_garden"), DARKOAK_OAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_garden_fence_gate"), DARKOAK_OAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_bollard"), DARKOAK_OAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_bollard_fence_gate"), DARKOAK_OAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_stick"), DARKOAK_OAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_stick_fence_gate"), DARKOAK_OAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_crisscross"), DARKOAK_OAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_spire"), DARKOAK_OAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_oak_spire_fence_gate"), DARKOAK_OAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_classic"), OAK_DARKOAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_wildlife"), OAK_DARKOAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_decoration"), OAK_DARKOAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_decoration_fence_gate"), OAK_DARKOAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_plank"), OAK_DARKOAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_garden"), OAK_DARKOAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_garden_fence_gate"), OAK_DARKOAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_bollard"), OAK_DARKOAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_bollard_fence_gate"), OAK_DARKOAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_stick"), OAK_DARKOAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_stick_fence_gate"), OAK_DARKOAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_crisscross"), OAK_DARKOAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_spire"), OAK_DARKOAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_darkoak_spire_fence_gate"), OAK_DARKOAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_classic"), DARKOAK_JUNGLE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_wildlife"), DARKOAK_JUNGLE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_decoration"), DARKOAK_JUNGLE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_decoration_fence_gate"), DARKOAK_JUNGLE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_plank"), DARKOAK_JUNGLE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_garden"), DARKOAK_JUNGLE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_garden_fence_gate"), DARKOAK_JUNGLE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_bollard"), DARKOAK_JUNGLE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_bollard_fence_gate"), DARKOAK_JUNGLE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_stick"), DARKOAK_JUNGLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_stick_fence_gate"), DARKOAK_JUNGLE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_crisscross"), DARKOAK_JUNGLE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_spire"), DARKOAK_JUNGLE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_jungle_spire_fence_gate"), DARKOAK_JUNGLE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_classic"), JUNGLE_DARKOAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_wildlife"), JUNGLE_DARKOAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_decoration"), JUNGLE_DARKOAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_decoration_fence_gate"), JUNGLE_DARKOAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_plank"), JUNGLE_DARKOAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_garden"), JUNGLE_DARKOAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_garden_fence_gate"), JUNGLE_DARKOAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_bollard"), JUNGLE_DARKOAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_bollard_fence_gate"), JUNGLE_DARKOAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_stick"), JUNGLE_DARKOAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_stick_fence_gate"), JUNGLE_DARKOAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_crisscross"), JUNGLE_DARKOAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_spire"), JUNGLE_DARKOAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_darkoak_spire_fence_gate"), JUNGLE_DARKOAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_classic"), ACACIA_JUNGLE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_wildlife"), ACACIA_JUNGLE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_decoration"), ACACIA_JUNGLE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_decoration_fence_gate"), ACACIA_JUNGLE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_plank"), ACACIA_JUNGLE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_garden"), ACACIA_JUNGLE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_garden_fence_gate"), ACACIA_JUNGLE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_bollard"), ACACIA_JUNGLE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_bollard_fence_gate"), ACACIA_JUNGLE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_stick"), ACACIA_JUNGLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_stick_fence_gate"), ACACIA_JUNGLE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_crisscross"), ACACIA_JUNGLE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_spire"), ACACIA_JUNGLE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_jungle_spire_fence_gate"), ACACIA_JUNGLE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_classic"), JUNGLE_ACACIA_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_wildlife"), JUNGLE_ACACIA_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_decoration"), JUNGLE_ACACIA_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_decoration_fence_gate"), JUNGLE_ACACIA_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_plank"), JUNGLE_ACACIA_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_garden"), JUNGLE_ACACIA_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_garden_fence_gate"), JUNGLE_ACACIA_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_bollard"), JUNGLE_ACACIA_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_bollard_fence_gate"), JUNGLE_ACACIA_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_stick"), JUNGLE_ACACIA_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_stick_fence_gate"), JUNGLE_ACACIA_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_crisscross"), JUNGLE_ACACIA_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_spire"), JUNGLE_ACACIA_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_acacia_spire_fence_gate"), JUNGLE_ACACIA_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_classic"), ACACIA_BIRCH_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_wildlife"), ACACIA_BIRCH_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_decoration"), ACACIA_BIRCH_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_decoration_fence_gate"), ACACIA_BIRCH_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_plank"), ACACIA_BIRCH_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_garden"), ACACIA_BIRCH_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_garden_fence_gate"), ACACIA_BIRCH_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_bollard"), ACACIA_BIRCH_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_bollard_fence_gate"), ACACIA_BIRCH_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_stick"), ACACIA_BIRCH_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_stick_fence_gate"), ACACIA_BIRCH_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_crisscross"), ACACIA_BIRCH_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_spire"), ACACIA_BIRCH_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_birch_spire_fence_gate"), ACACIA_BIRCH_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_classic"), BIRCH_ACACIA_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_wildlife"), BIRCH_ACACIA_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_decoration"), BIRCH_ACACIA_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_decoration_fence_gate"), BIRCH_ACACIA_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_plank"), BIRCH_ACACIA_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_garden"), BIRCH_ACACIA_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_garden_fence_gate"), BIRCH_ACACIA_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_bollard"), BIRCH_ACACIA_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_bollard_fence_gate"), BIRCH_ACACIA_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_stick"), BIRCH_ACACIA_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_stick_fence_gate"), BIRCH_ACACIA_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_crisscross"), BIRCH_ACACIA_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_spire"), BIRCH_ACACIA_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_acacia_spire_fence_gate"), BIRCH_ACACIA_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_classic"), JUNGLE_BIRCH_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_wildlife"), JUNGLE_BIRCH_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_decoration"), JUNGLE_BIRCH_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_decoration_fence_gate"), JUNGLE_BIRCH_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_plank"), JUNGLE_BIRCH_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_garden"), JUNGLE_BIRCH_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_garden_fence_gate"), JUNGLE_BIRCH_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_bollard"), JUNGLE_BIRCH_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_bollard_fence_gate"), JUNGLE_BIRCH_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_stick"), JUNGLE_BIRCH_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_stick_fence_gate"), JUNGLE_BIRCH_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_crisscross"), JUNGLE_BIRCH_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_spire"), JUNGLE_BIRCH_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_birch_spire_fence_gate"), JUNGLE_BIRCH_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_classic"), BIRCH_JUNGLE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_wildlife"), BIRCH_JUNGLE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_decoration"), BIRCH_JUNGLE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_decoration_fence_gate"), BIRCH_JUNGLE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_plank"), BIRCH_JUNGLE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_garden"), BIRCH_JUNGLE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_garden_fence_gate"), BIRCH_JUNGLE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_bollard"), BIRCH_JUNGLE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_bollard_fence_gate"), BIRCH_JUNGLE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_stick"), BIRCH_JUNGLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_stick_fence_gate"), BIRCH_JUNGLE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_crisscross"), BIRCH_JUNGLE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_spire"), BIRCH_JUNGLE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_jungle_spire_fence_gate"), BIRCH_JUNGLE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_classic"), WARPED_BIRCH_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_wildlife"), WARPED_BIRCH_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_decoration"), WARPED_BIRCH_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_decoration_fence_gate"), WARPED_BIRCH_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_plank"), WARPED_BIRCH_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_garden"), WARPED_BIRCH_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_garden_fence_gate"), WARPED_BIRCH_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_bollard"), WARPED_BIRCH_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_bollard_fence_gate"), WARPED_BIRCH_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_stick"), WARPED_BIRCH_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_stick_fence_gate"), WARPED_BIRCH_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_crisscross"), WARPED_BIRCH_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_spire"), WARPED_BIRCH_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_birch_spire_fence_gate"), WARPED_BIRCH_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_classic"), BIRCH_WARPED_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_wildlife"), BIRCH_WARPED_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_decoration"), BIRCH_WARPED_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_decoration_fence_gate"), BIRCH_WARPED_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_plank"), BIRCH_WARPED_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_garden"), BIRCH_WARPED_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_garden_fence_gate"), BIRCH_WARPED_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_bollard"), BIRCH_WARPED_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_bollard_fence_gate"), BIRCH_WARPED_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_stick"), BIRCH_WARPED_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_stick_fence_gate"), BIRCH_WARPED_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_crisscross"), BIRCH_WARPED_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_spire"), BIRCH_WARPED_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_warped_spire_fence_gate"), BIRCH_WARPED_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_classic"), WARPED_OAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_wildlife"), WARPED_OAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_decoration"), WARPED_OAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_decoration_fence_gate"), WARPED_OAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_plank"), WARPED_OAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_garden"), WARPED_OAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_garden_fence_gate"), WARPED_OAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_bollard"), WARPED_OAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_bollard_fence_gate"), WARPED_OAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_stick"), WARPED_OAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_stick_fence_gate"), WARPED_OAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_crisscross"), WARPED_OAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_spire"), WARPED_OAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_oak_spire_fence_gate"), WARPED_OAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_classic"), OAK_WARPED_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_wildlife"), OAK_WARPED_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_decoration"), OAK_WARPED_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_decoration_fence_gate"), OAK_WARPED_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_plank"), OAK_WARPED_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_garden"), OAK_WARPED_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_garden_fence_gate"), OAK_WARPED_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_bollard"), OAK_WARPED_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_bollard_fence_gate"), OAK_WARPED_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_stick"), OAK_WARPED_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_stick_fence_gate"), OAK_WARPED_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_crisscross"), OAK_WARPED_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_spire"), OAK_WARPED_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_warped_spire_fence_gate"), OAK_WARPED_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_classic"), WARPED_SPRUCE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_wildlife"), WARPED_SPRUCE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_decoration"), WARPED_SPRUCE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_decoration_fence_gate"), WARPED_SPRUCE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_plank"), WARPED_SPRUCE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_garden"), WARPED_SPRUCE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_garden_fence_gate"), WARPED_SPRUCE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_bollard"), WARPED_SPRUCE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_bollard_fence_gate"), WARPED_SPRUCE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_stick"), WARPED_SPRUCE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_stick_fence_gate"), WARPED_SPRUCE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_crisscross"), WARPED_SPRUCE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_spire"), WARPED_SPRUCE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_spruce_spire_fence_gate"), WARPED_SPRUCE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_classic"), SPRUCE_WARPED_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_wildlife"), SPRUCE_WARPED_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_decoration"), SPRUCE_WARPED_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_decoration_fence_gate"), SPRUCE_WARPED_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_plank"), SPRUCE_WARPED_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_garden"), SPRUCE_WARPED_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_garden_fence_gate"), SPRUCE_WARPED_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_bollard"), SPRUCE_WARPED_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_bollard_fence_gate"), SPRUCE_WARPED_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_stick"), SPRUCE_WARPED_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_stick_fence_gate"), SPRUCE_WARPED_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_crisscross"), SPRUCE_WARPED_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_spire"), SPRUCE_WARPED_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_warped_spire_fence_gate"), SPRUCE_WARPED_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_classic"), CRIMSON_JUNGLE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_wildlife"), CRIMSON_JUNGLE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_decoration"), CRIMSON_JUNGLE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_decoration_fence_gate"), CRIMSON_JUNGLE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_plank"), CRIMSON_JUNGLE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_garden"), CRIMSON_JUNGLE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_garden_fence_gate"), CRIMSON_JUNGLE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_bollard"), CRIMSON_JUNGLE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_bollard_fence_gate"), CRIMSON_JUNGLE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_stick"), CRIMSON_JUNGLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_stick_fence_gate"), CRIMSON_JUNGLE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_crisscross"), CRIMSON_JUNGLE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_spire"), CRIMSON_JUNGLE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_jungle_spire_fence_gate"), CRIMSON_JUNGLE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_classic"), JUNGLE_CRIMSON_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_wildlife"), JUNGLE_CRIMSON_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_decoration"), JUNGLE_CRIMSON_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_decoration_fence_gate"), JUNGLE_CRIMSON_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_plank"), JUNGLE_CRIMSON_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_garden"), JUNGLE_CRIMSON_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_garden_fence_gate"), JUNGLE_CRIMSON_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_bollard"), JUNGLE_CRIMSON_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_bollard_fence_gate"), JUNGLE_CRIMSON_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_stick"), JUNGLE_CRIMSON_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_stick_fence_gate"), JUNGLE_CRIMSON_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_crisscross"), JUNGLE_CRIMSON_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_spire"), JUNGLE_CRIMSON_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_crimson_spire_fence_gate"), JUNGLE_CRIMSON_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_classic"), CRIMSON_OAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_wildlife"), CRIMSON_OAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_decoration"), CRIMSON_OAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_decoration_fence_gate"), CRIMSON_OAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_plank"), CRIMSON_OAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_garden"), CRIMSON_OAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_garden_fence_gate"), CRIMSON_OAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_bollard"), CRIMSON_OAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_bollard_fence_gate"), CRIMSON_OAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_stick"), CRIMSON_OAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_stick_fence_gate"), CRIMSON_OAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_crisscross"), CRIMSON_OAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_spire"), CRIMSON_OAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_oak_spire_fence_gate"), CRIMSON_OAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_classic"), OAK_CRIMSON_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_wildlife"), OAK_CRIMSON_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_decoration"), OAK_CRIMSON_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_decoration_fence_gate"), OAK_CRIMSON_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_plank"), OAK_CRIMSON_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_garden"), OAK_CRIMSON_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_garden_fence_gate"), OAK_CRIMSON_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_bollard"), OAK_CRIMSON_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_bollard_fence_gate"), OAK_CRIMSON_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_stick"), OAK_CRIMSON_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_stick_fence_gate"), OAK_CRIMSON_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_crisscross"), OAK_CRIMSON_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_spire"), OAK_CRIMSON_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_crimson_spire_fence_gate"), OAK_CRIMSON_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_classic"), CRIMSON_DARKOAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_wildlife"), CRIMSON_DARKOAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_decoration"), CRIMSON_DARKOAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_decoration_fence_gate"), CRIMSON_DARKOAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_plank"), CRIMSON_DARKOAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_garden"), CRIMSON_DARKOAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_garden_fence_gate"), CRIMSON_DARKOAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_bollard"), CRIMSON_DARKOAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_bollard_fence_gate"), CRIMSON_DARKOAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_stick"), CRIMSON_DARKOAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_stick_fence_gate"), CRIMSON_DARKOAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_crisscross"), CRIMSON_DARKOAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_spire"), CRIMSON_DARKOAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_darkoak_spire_fence_gate"), CRIMSON_DARKOAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_classic"), DARKOAK_CRIMSON_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_wildlife"), DARKOAK_CRIMSON_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_decoration"), DARKOAK_CRIMSON_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_decoration_fence_gate"), DARKOAK_CRIMSON_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_plank"), DARKOAK_CRIMSON_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_garden"), DARKOAK_CRIMSON_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_garden_fence_gate"), DARKOAK_CRIMSON_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_bollard"), DARKOAK_CRIMSON_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_bollard_fence_gate"), DARKOAK_CRIMSON_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_stick"), DARKOAK_CRIMSON_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_stick_fence_gate"), DARKOAK_CRIMSON_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_crisscross"), DARKOAK_CRIMSON_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_spire"), DARKOAK_CRIMSON_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_crimson_spire_fence_gate"), DARKOAK_CRIMSON_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_classic"), MANGROVE_OAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_wildlife"), MANGROVE_OAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_decoration"), MANGROVE_OAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_decoration_fence_gate"), MANGROVE_OAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_plank"), MANGROVE_OAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_garden"), MANGROVE_OAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_garden_fence_gate"), MANGROVE_OAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_bollard"), MANGROVE_OAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_bollard_fence_gate"), MANGROVE_OAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_stick"), MANGROVE_OAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_stick_fence_gate"), MANGROVE_OAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_crisscross"), MANGROVE_OAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_spire"), MANGROVE_OAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_oak_spire_fence_gate"), MANGROVE_OAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_classic"), OAK_MANGROVE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_wildlife"), OAK_MANGROVE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_decoration"), OAK_MANGROVE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_decoration_fence_gate"), OAK_MANGROVE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_plank"), OAK_MANGROVE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_garden"), OAK_MANGROVE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_garden_fence_gate"), OAK_MANGROVE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_bollard"), OAK_MANGROVE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_bollard_fence_gate"), OAK_MANGROVE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_stick"), OAK_MANGROVE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_stick_fence_gate"), OAK_MANGROVE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_crisscross"), OAK_MANGROVE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_spire"), OAK_MANGROVE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_mangrove_spire_fence_gate"), OAK_MANGROVE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_classic"), MANGROVE_BIRCH_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_wildlife"), MANGROVE_BIRCH_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_decoration"), MANGROVE_BIRCH_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_decoration_fence_gate"), MANGROVE_BIRCH_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_plank"), MANGROVE_BIRCH_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_garden"), MANGROVE_BIRCH_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_garden_fence_gate"), MANGROVE_BIRCH_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_bollard"), MANGROVE_BIRCH_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_bollard_fence_gate"), MANGROVE_BIRCH_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_stick"), MANGROVE_BIRCH_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_stick_fence_gate"), MANGROVE_BIRCH_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_crisscross"), MANGROVE_BIRCH_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_spire"), MANGROVE_BIRCH_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_birch_spire_fence_gate"), MANGROVE_BIRCH_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_classic"), BIRCH_MANGROVE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_wildlife"), BIRCH_MANGROVE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_decoration"), BIRCH_MANGROVE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_decoration_fence_gate"), BIRCH_MANGROVE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_plank"), BIRCH_MANGROVE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_garden"), BIRCH_MANGROVE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_garden_fence_gate"), BIRCH_MANGROVE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_bollard"), BIRCH_MANGROVE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_bollard_fence_gate"), BIRCH_MANGROVE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_stick"), BIRCH_MANGROVE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_stick_fence_gate"), BIRCH_MANGROVE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_crisscross"), BIRCH_MANGROVE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_spire"), BIRCH_MANGROVE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_mangrove_spire_fence_gate"), BIRCH_MANGROVE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_classic"), MANGROVE_JUNGLE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_wildlife"), MANGROVE_JUNGLE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_decoration"), MANGROVE_JUNGLE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_decoration_fence_gate"), MANGROVE_JUNGLE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_plank"), MANGROVE_JUNGLE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_garden"), MANGROVE_JUNGLE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_garden_fence_gate"), MANGROVE_JUNGLE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_bollard"), MANGROVE_JUNGLE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_bollard_fence_gate"), MANGROVE_JUNGLE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_stick"), MANGROVE_JUNGLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_stick_fence_gate"), MANGROVE_JUNGLE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_crisscross"), MANGROVE_JUNGLE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_spire"), MANGROVE_JUNGLE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_jungle_spire_fence_gate"), MANGROVE_JUNGLE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_classic"), JUNGLE_MANGROVE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_wildlife"), JUNGLE_MANGROVE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_decoration"), JUNGLE_MANGROVE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_decoration_fence_gate"), JUNGLE_MANGROVE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_plank"), JUNGLE_MANGROVE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_garden"), JUNGLE_MANGROVE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_garden_fence_gate"), JUNGLE_MANGROVE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_bollard"), JUNGLE_MANGROVE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_bollard_fence_gate"), JUNGLE_MANGROVE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_stick"), JUNGLE_MANGROVE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_stick_fence_gate"), JUNGLE_MANGROVE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_crisscross"), JUNGLE_MANGROVE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_spire"), JUNGLE_MANGROVE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_mangrove_spire_fence_gate"), JUNGLE_MANGROVE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_classic"), MANGROVE_DARKOAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_wildlife"), MANGROVE_DARKOAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_decoration"), MANGROVE_DARKOAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_decoration_fence_gate"), MANGROVE_DARKOAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_plank"), MANGROVE_DARKOAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_garden"), MANGROVE_DARKOAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_garden_fence_gate"), MANGROVE_DARKOAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_bollard"), MANGROVE_DARKOAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_bollard_fence_gate"), MANGROVE_DARKOAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_stick"), MANGROVE_DARKOAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_stick_fence_gate"), MANGROVE_DARKOAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_crisscross"), MANGROVE_DARKOAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_spire"), MANGROVE_DARKOAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_darkoak_spire_fence_gate"), MANGROVE_DARKOAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_classic"), DARKOAK_MANGROVE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_wildlife"), DARKOAK_MANGROVE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_decoration"), DARKOAK_MANGROVE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_decoration_fence_gate"), DARKOAK_MANGROVE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_plank"), DARKOAK_MANGROVE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_garden"), DARKOAK_MANGROVE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_garden_fence_gate"), DARKOAK_MANGROVE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_bollard"), DARKOAK_MANGROVE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_bollard_fence_gate"), DARKOAK_MANGROVE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_stick"), DARKOAK_MANGROVE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_stick_fence_gate"), DARKOAK_MANGROVE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_crisscross"), DARKOAK_MANGROVE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_spire"), DARKOAK_MANGROVE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_mangrove_spire_fence_gate"), DARKOAK_MANGROVE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_classic"), MANGROVE_WARPED_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_wildlife"), MANGROVE_WARPED_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_decoration"), MANGROVE_WARPED_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_decoration_fence_gate"), MANGROVE_WARPED_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_plank"), MANGROVE_WARPED_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_garden"), MANGROVE_WARPED_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_garden_fence_gate"), MANGROVE_WARPED_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_bollard"), MANGROVE_WARPED_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_bollard_fence_gate"), MANGROVE_WARPED_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_stick"), MANGROVE_WARPED_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_stick_fence_gate"), MANGROVE_WARPED_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_crisscross"), MANGROVE_WARPED_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_spire"), MANGROVE_WARPED_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_warped_spire_fence_gate"), MANGROVE_WARPED_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_classic"), WARPED_MANGROVE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_wildlife"), WARPED_MANGROVE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_decoration"), WARPED_MANGROVE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_decoration_fence_gate"), WARPED_MANGROVE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_plank"), WARPED_MANGROVE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_garden"), WARPED_MANGROVE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_garden_fence_gate"), WARPED_MANGROVE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_bollard"), WARPED_MANGROVE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_bollard_fence_gate"), WARPED_MANGROVE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_stick"), WARPED_MANGROVE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_stick_fence_gate"), WARPED_MANGROVE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_crisscross"), WARPED_MANGROVE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_spire"), WARPED_MANGROVE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_mangrove_spire_fence_gate"), WARPED_MANGROVE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_classic"), BAMBOO_OAK_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_wildlife"), BAMBOO_OAK_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_decoration"), BAMBOO_OAK_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_decoration_fence_gate"), BAMBOO_OAK_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_plank"), BAMBOO_OAK_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_garden"), BAMBOO_OAK_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_garden_fence_gate"), BAMBOO_OAK_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_bollard"), BAMBOO_OAK_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_bollard_fence_gate"), BAMBOO_OAK_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_stick"), BAMBOO_OAK_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_stick_fence_gate"), BAMBOO_OAK_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_crisscross"), BAMBOO_OAK_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_spire"), BAMBOO_OAK_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_oak_spire_fence_gate"), BAMBOO_OAK_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_classic"), OAK_BAMBOO_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_wildlife"), OAK_BAMBOO_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_decoration"), OAK_BAMBOO_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_decoration_fence_gate"), OAK_BAMBOO_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_plank"), OAK_BAMBOO_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_garden"), OAK_BAMBOO_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_garden_fence_gate"), OAK_BAMBOO_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_bollard"), OAK_BAMBOO_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_bollard_fence_gate"), OAK_BAMBOO_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_stick"), OAK_BAMBOO_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_stick_fence_gate"), OAK_BAMBOO_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_crisscross"), OAK_BAMBOO_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_spire"), OAK_BAMBOO_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_bamboo_spire_fence_gate"), OAK_BAMBOO_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_classic"), BAMBOO_SPRUCE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_wildlife"), BAMBOO_SPRUCE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_decoration"), BAMBOO_SPRUCE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_decoration_fence_gate"), BAMBOO_SPRUCE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_plank"), BAMBOO_SPRUCE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_garden"), BAMBOO_SPRUCE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_garden_fence_gate"), BAMBOO_SPRUCE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_bollard"), BAMBOO_SPRUCE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_bollard_fence_gate"), BAMBOO_SPRUCE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_stick"), BAMBOO_SPRUCE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_stick_fence_gate"), BAMBOO_SPRUCE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_crisscross"), BAMBOO_SPRUCE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_spire"), BAMBOO_SPRUCE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_spruce_spire_fence_gate"), BAMBOO_SPRUCE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_classic"), SPRUCE_BAMBOO_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_wildlife"), SPRUCE_BAMBOO_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_decoration"), SPRUCE_BAMBOO_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_decoration_fence_gate"), SPRUCE_BAMBOO_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_plank"), SPRUCE_BAMBOO_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_garden"), SPRUCE_BAMBOO_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_garden_fence_gate"), SPRUCE_BAMBOO_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_bollard"), SPRUCE_BAMBOO_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_bollard_fence_gate"), SPRUCE_BAMBOO_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_stick"), SPRUCE_BAMBOO_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_stick_fence_gate"), SPRUCE_BAMBOO_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_crisscross"), SPRUCE_BAMBOO_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_spire"), SPRUCE_BAMBOO_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_bamboo_spire_fence_gate"), SPRUCE_BAMBOO_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_classic"), BAMBOO_JUNGLE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_wildlife"), BAMBOO_JUNGLE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_decoration"), BAMBOO_JUNGLE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_decoration_fence_gate"), BAMBOO_JUNGLE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_plank"), BAMBOO_JUNGLE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_garden"), BAMBOO_JUNGLE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_garden_fence_gate"), BAMBOO_JUNGLE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_bollard"), BAMBOO_JUNGLE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_bollard_fence_gate"), BAMBOO_JUNGLE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_stick"), BAMBOO_JUNGLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_stick_fence_gate"), BAMBOO_JUNGLE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_crisscross"), BAMBOO_JUNGLE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_spire"), BAMBOO_JUNGLE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_jungle_spire_fence_gate"), BAMBOO_JUNGLE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_classic"), JUNGLE_BAMBOO_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_wildlife"), JUNGLE_BAMBOO_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_decoration"), JUNGLE_BAMBOO_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_decoration_fence_gate"), JUNGLE_BAMBOO_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_plank"), JUNGLE_BAMBOO_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_garden"), JUNGLE_BAMBOO_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_garden_fence_gate"), JUNGLE_BAMBOO_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_bollard"), JUNGLE_BAMBOO_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_bollard_fence_gate"), JUNGLE_BAMBOO_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_stick"), JUNGLE_BAMBOO_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_stick_fence_gate"), JUNGLE_BAMBOO_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_crisscross"), JUNGLE_BAMBOO_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_spire"), JUNGLE_BAMBOO_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_bamboo_spire_fence_gate"), JUNGLE_BAMBOO_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_classic"), BAMBOO_ACACIA_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_wildlife"), BAMBOO_ACACIA_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_decoration"), BAMBOO_ACACIA_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_decoration_fence_gate"), BAMBOO_ACACIA_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_plank"), BAMBOO_ACACIA_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_garden"), BAMBOO_ACACIA_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_garden_fence_gate"), BAMBOO_ACACIA_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_bollard"), BAMBOO_ACACIA_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_bollard_fence_gate"), BAMBOO_ACACIA_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_stick"), BAMBOO_ACACIA_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_stick_fence_gate"), BAMBOO_ACACIA_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_crisscross"), BAMBOO_ACACIA_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_spire"), BAMBOO_ACACIA_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_acacia_spire_fence_gate"), BAMBOO_ACACIA_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_classic"), ACACIA_BAMBOO_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_wildlife"), ACACIA_BAMBOO_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_decoration"), ACACIA_BAMBOO_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_decoration_fence_gate"), ACACIA_BAMBOO_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_plank"), ACACIA_BAMBOO_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_garden"), ACACIA_BAMBOO_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_garden_fence_gate"), ACACIA_BAMBOO_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_bollard"), ACACIA_BAMBOO_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_bollard_fence_gate"), ACACIA_BAMBOO_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_stick"), ACACIA_BAMBOO_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_stick_fence_gate"), ACACIA_BAMBOO_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_crisscross"), ACACIA_BAMBOO_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_spire"), ACACIA_BAMBOO_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_bamboo_spire_fence_gate"), ACACIA_BAMBOO_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_classic"), BAMBOO_WARPED_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_wildlife"), BAMBOO_WARPED_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_decoration"), BAMBOO_WARPED_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_decoration_fence_gate"), BAMBOO_WARPED_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_plank"), BAMBOO_WARPED_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_garden"), BAMBOO_WARPED_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_garden_fence_gate"), BAMBOO_WARPED_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_bollard"), BAMBOO_WARPED_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_bollard_fence_gate"), BAMBOO_WARPED_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_stick"), BAMBOO_WARPED_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_stick_fence_gate"), BAMBOO_WARPED_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_crisscross"), BAMBOO_WARPED_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_spire"), BAMBOO_WARPED_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_warped_spire_fence_gate"), BAMBOO_WARPED_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_classic"), WARPED_BAMBOO_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_wildlife"), WARPED_BAMBOO_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_decoration"), WARPED_BAMBOO_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_decoration_fence_gate"), WARPED_BAMBOO_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_plank"), WARPED_BAMBOO_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_garden"), WARPED_BAMBOO_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_garden_fence_gate"), WARPED_BAMBOO_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_bollard"), WARPED_BAMBOO_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_bollard_fence_gate"), WARPED_BAMBOO_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_stick"), WARPED_BAMBOO_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_stick_fence_gate"), WARPED_BAMBOO_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_crisscross"), WARPED_BAMBOO_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_spire"), WARPED_BAMBOO_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_bamboo_spire_fence_gate"), WARPED_BAMBOO_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_classic"), CHERRY_JUNGLE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_wildlife"), CHERRY_JUNGLE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_decoration"), CHERRY_JUNGLE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_decoration_fence_gate"), CHERRY_JUNGLE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_plank"), CHERRY_JUNGLE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_garden"), CHERRY_JUNGLE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_garden_fence_gate"), CHERRY_JUNGLE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_bollard"), CHERRY_JUNGLE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_bollard_fence_gate"), CHERRY_JUNGLE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_stick"), CHERRY_JUNGLE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_stick_fence_gate"), CHERRY_JUNGLE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_crisscross"), CHERRY_JUNGLE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_spire"), CHERRY_JUNGLE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_jungle_spire_fence_gate"), CHERRY_JUNGLE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_classic"), JUNGLE_CHERRY_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_wildlife"), JUNGLE_CHERRY_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_decoration"), JUNGLE_CHERRY_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_decoration_fence_gate"), JUNGLE_CHERRY_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_plank"), JUNGLE_CHERRY_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_garden"), JUNGLE_CHERRY_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_garden_fence_gate"), JUNGLE_CHERRY_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_bollard"), JUNGLE_CHERRY_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_bollard_fence_gate"), JUNGLE_CHERRY_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_stick"), JUNGLE_CHERRY_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_stick_fence_gate"), JUNGLE_CHERRY_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_crisscross"), JUNGLE_CHERRY_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_spire"), JUNGLE_CHERRY_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_cherry_spire_fence_gate"), JUNGLE_CHERRY_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_classic"), CHERRY_ACACIA_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_wildlife"), CHERRY_ACACIA_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_decoration"), CHERRY_ACACIA_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_decoration_fence_gate"), CHERRY_ACACIA_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_plank"), CHERRY_ACACIA_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_garden"), CHERRY_ACACIA_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_garden_fence_gate"), CHERRY_ACACIA_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_bollard"), CHERRY_ACACIA_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_bollard_fence_gate"), CHERRY_ACACIA_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_stick"), CHERRY_ACACIA_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_stick_fence_gate"), CHERRY_ACACIA_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_crisscross"), CHERRY_ACACIA_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_spire"), CHERRY_ACACIA_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_acacia_spire_fence_gate"), CHERRY_ACACIA_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_classic"), ACACIA_CHERRY_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_wildlife"), ACACIA_CHERRY_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_decoration"), ACACIA_CHERRY_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_decoration_fence_gate"), ACACIA_CHERRY_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_plank"), ACACIA_CHERRY_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_garden"), ACACIA_CHERRY_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_garden_fence_gate"), ACACIA_CHERRY_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_bollard"), ACACIA_CHERRY_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_bollard_fence_gate"), ACACIA_CHERRY_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_stick"), ACACIA_CHERRY_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_stick_fence_gate"), ACACIA_CHERRY_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_crisscross"), ACACIA_CHERRY_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_spire"), ACACIA_CHERRY_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_cherry_spire_fence_gate"), ACACIA_CHERRY_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_classic"), CHERRY_MANGROVE_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_wildlife"), CHERRY_MANGROVE_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_decoration"), CHERRY_MANGROVE_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_decoration_fence_gate"), CHERRY_MANGROVE_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_plank"), CHERRY_MANGROVE_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_garden"), CHERRY_MANGROVE_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_garden_fence_gate"), CHERRY_MANGROVE_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_bollard"), CHERRY_MANGROVE_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_bollard_fence_gate"), CHERRY_MANGROVE_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_stick"), CHERRY_MANGROVE_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_stick_fence_gate"), CHERRY_MANGROVE_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_crisscross"), CHERRY_MANGROVE_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_spire"), CHERRY_MANGROVE_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_mangrove_spire_fence_gate"), CHERRY_MANGROVE_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_classic"), MANGROVE_CHERRY_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_wildlife"), MANGROVE_CHERRY_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_decoration"), MANGROVE_CHERRY_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_decoration_fence_gate"), MANGROVE_CHERRY_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_plank"), MANGROVE_CHERRY_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_garden"), MANGROVE_CHERRY_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_garden_fence_gate"), MANGROVE_CHERRY_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_bollard"), MANGROVE_CHERRY_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_bollard_fence_gate"), MANGROVE_CHERRY_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_stick"), MANGROVE_CHERRY_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_stick_fence_gate"), MANGROVE_CHERRY_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_crisscross"), MANGROVE_CHERRY_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_spire"), MANGROVE_CHERRY_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_cherry_spire_fence_gate"), MANGROVE_CHERRY_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_classic"), CHERRY_BAMBOO_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_wildlife"), CHERRY_BAMBOO_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_decoration"), CHERRY_BAMBOO_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_decoration_fence_gate"), CHERRY_BAMBOO_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_plank"), CHERRY_BAMBOO_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_garden"), CHERRY_BAMBOO_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_garden_fence_gate"), CHERRY_BAMBOO_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_bollard"), CHERRY_BAMBOO_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_bollard_fence_gate"), CHERRY_BAMBOO_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_stick"), CHERRY_BAMBOO_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_stick_fence_gate"), CHERRY_BAMBOO_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_crisscross"), CHERRY_BAMBOO_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_spire"), CHERRY_BAMBOO_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_bamboo_spire_fence_gate"), CHERRY_BAMBOO_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_classic"), BAMBOO_CHERRY_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_wildlife"), BAMBOO_CHERRY_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_decoration"), BAMBOO_CHERRY_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_decoration_fence_gate"), BAMBOO_CHERRY_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_plank"), BAMBOO_CHERRY_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_garden"), BAMBOO_CHERRY_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_garden_fence_gate"), BAMBOO_CHERRY_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_bollard"), BAMBOO_CHERRY_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_bollard_fence_gate"), BAMBOO_CHERRY_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_stick"), BAMBOO_CHERRY_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_stick_fence_gate"), BAMBOO_CHERRY_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_crisscross"), BAMBOO_CHERRY_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_spire"), BAMBOO_CHERRY_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_cherry_spire_fence_gate"), BAMBOO_CHERRY_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_classic"), CHERRY_CRIMSON_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_wildlife"), CHERRY_CRIMSON_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_decoration"), CHERRY_CRIMSON_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_decoration_fence_gate"), CHERRY_CRIMSON_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_plank"), CHERRY_CRIMSON_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_garden"), CHERRY_CRIMSON_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_garden_fence_gate"), CHERRY_CRIMSON_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_bollard"), CHERRY_CRIMSON_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_bollard_fence_gate"), CHERRY_CRIMSON_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_stick"), CHERRY_CRIMSON_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_stick_fence_gate"), CHERRY_CRIMSON_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_crisscross"), CHERRY_CRIMSON_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_spire"), CHERRY_CRIMSON_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_crimson_spire_fence_gate"), CHERRY_CRIMSON_SPIRE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_classic"), CRIMSON_CHERRY_CLASSIC);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_wildlife"), CRIMSON_CHERRY_WILDLIFE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_decoration"), CRIMSON_CHERRY_DECORATION);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_decoration_fence_gate"), CRIMSON_CHERRY_DECORATION_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_plank"), CRIMSON_CHERRY_PLANK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_garden"), CRIMSON_CHERRY_GARDEN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_garden_fence_gate"), CRIMSON_CHERRY_GARDEN_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_bollard"), CRIMSON_CHERRY_BOLLARD);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_bollard_fence_gate"), CRIMSON_CHERRY_BOLLARD_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_stick"), CRIMSON_CHERRY_STICK);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_stick_fence_gate"), CRIMSON_CHERRY_STICK_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_crisscross"), CRIMSON_CHERRY_CRISSCROSS);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_spire"), CRIMSON_CHERRY_SPIRE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_cherry_spire_fence_gate"), CRIMSON_CHERRY_SPIRE_GATE);

        //END WOODENFENCES2 AND BEGIN STONEWALLS2

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_modern"), COBBLESTONE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_building"), COBBLESTONE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_castle"), COBBLESTONE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_cobblestone_modern"), MOSSY_COBBLESTONE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_cobblestone_building"), MOSSY_COBBLESTONE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_cobblestone_castle"), MOSSY_COBBLESTONE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_modern"), STONE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_building"), STONE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_castle"), STONE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_bricks_modern"), STONE_BRICKS_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_bricks_building"), STONE_BRICKS_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "stone_bricks_castle"), STONE_BRICKS_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_stone_bricks_modern"), MOSSY_STONE_BRICKS_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_stone_bricks_building"), MOSSY_STONE_BRICKS_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mossy_stone_bricks_castle"), MOSSY_STONE_BRICKS_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "andesite_modern"), ANDESITE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "andesite_building"), ANDESITE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "andesite_castle"), ANDESITE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "diorite_modern"), DIORITE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "diorite_building"), DIORITE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "diorite_castle"), DIORITE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "granite_modern"), GRANITE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "granite_building"), GRANITE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "granite_castle"), GRANITE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "sandstone_modern"), SANDSTONE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "sandstone_building"), SANDSTONE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "sandstone_castle"), SANDSTONE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_sandstone_modern"), RED_SANDSTONE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_sandstone_building"), RED_SANDSTONE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_sandstone_castle"), RED_SANDSTONE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bricks_modern"), BRICKS_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bricks_building"), BRICKS_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bricks_castle"), BRICKS_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "prismarine_modern"), PRISMARINE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "prismarine_building"), PRISMARINE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "prismarine_castle"), PRISMARINE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "nether_bricks_modern"), NETHER_BRICKS_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "nether_bricks_building"), NETHER_BRICKS_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "nether_bricks_castle"), NETHER_BRICKS_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_nether_bricks_modern"), RED_NETHER_BRICKS_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_nether_bricks_building"), RED_NETHER_BRICKS_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "red_nether_bricks_castle"), RED_NETHER_BRICKS_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "end_stone_bricks_modern"), END_STONE_BRICKS_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "end_stone_bricks_building"), END_STONE_BRICKS_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "end_stone_bricks_castle"), END_STONE_BRICKS_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "blackstone_modern"), BLACKSTONE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "blackstone_building"), BLACKSTONE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "blackstone_castle"), BLACKSTONE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_modern"), POLISHED_BLACKSTONE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_building"), POLISHED_BLACKSTONE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_castle"), POLISHED_BLACKSTONE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_modern"), POLISHED_BLACKSTONE_BRICKS_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_building"), POLISHED_BLACKSTONE_BRICKS_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_blackstone_bricks_castle"), POLISHED_BLACKSTONE_BRICKS_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobbled_deepslate_modern"), COBBLED_DEEPSLATE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobbled_deepslate_building"), COBBLED_DEEPSLATE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobbled_deepslate_castle"), COBBLED_DEEPSLATE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_deepslate_modern"), POLISHED_DEEPSLATE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_deepslate_building"), POLISHED_DEEPSLATE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "polished_deepslate_castle"), POLISHED_DEEPSLATE_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_brick_modern"), DEEPSLATE_BRICK_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_brick_building"), DEEPSLATE_BRICK_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_brick_castle"), DEEPSLATE_BRICK_CASTLE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_tile_modern"), DEEPSLATE_TILE_MODERN);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_tile_building"), DEEPSLATE_TILE_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "deepslate_tile_castle"), DEEPSLATE_TILE_CASTLE);

        
        //END STONEWALLS2 AND BEGIN WOODENWALLS2

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oak_wall_building"), OAK_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "birch_wall_building"), BIRCH_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "spruce_wall_building"), SPRUCE_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "acacia_wall_building"), ACACIA_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "jungle_wall_building"), JUNGLE_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "darkoak_wall_building"), DARKOAK_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "crimson_wall_building"), CRIMSON_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "warped_wall_building"), WARPED_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "mangrove_wall_building"), MANGROVE_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "bamboo_wall_building"), BAMBOO_WALL_BUILDING);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cherry_wall_building"), CHERRY_WALL_BUILDING);

        
        //END WOODENWALLS2 AND BEGIN METALLFENCES2

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_copper_fence"), COBBLESTONE_COPPER_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_exposed_copper_fence"), COBBLESTONE_EXPOSED_COPPER_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_weathered_copper_fence"), COBBLESTONE_WEATHERED_COPPER_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_oxidized_copper_fence"), COBBLESTONE_OXIDIZED_COPPER_FENCE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "copper_fence_gate"), COPPER_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "exposed_copper_fence_gate"), EXPOSED_COPPER_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "weathered_copper_fence_gate"), WEATHERED_COPPER_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oxidized_copper_fence_gate"), OXIDIZED_COPPER_FENCE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_copper_fence"), COBBLESTONE_WAXED_COPPER_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_exposed_copper_fence"), COBBLESTONE_WAXED_EXPOSED_COPPER_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_weathered_copper_fence"), COBBLESTONE_WAXED_WEATHERED_COPPER_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_oxidized_copper_fence"), COBBLESTONE_WAXED_OXIDIZED_COPPER_FENCE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_copper_fence_gate"), WAXED_COPPER_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_exposed_copper_fence_gate"), WAXED_EXPOSED_COPPER_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_weathered_copper_fence_gate"), WAXED_WEATHERED_COPPER_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_oxidized_copper_fence_gate"), WAXED_OXIDIZED_COPPER_FENCE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_iron_fence"), COBBLESTONE_IRON_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_exposed_iron_fence"), COBBLESTONE_EXPOSED_IRON_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_weathered_iron_fence"), COBBLESTONE_WEATHERED_IRON_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_oxidized_iron_fence"), COBBLESTONE_OXIDIZED_IRON_FENCE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "iron_fence_gate"), IRON_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "exposed_iron_fence_gate"), EXPOSED_IRON_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "weathered_iron_fence_gate"), WEATHERED_IRON_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "oxidized_iron_fence_gate"), OXIDIZED_IRON_FENCE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_iron_fence"), COBBLESTONE_WAXED_IRON_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_exposed_iron_fence"), COBBLESTONE_WAXED_EXPOSED_IRON_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_weathered_iron_fence"), COBBLESTONE_WAXED_WEATHERED_IRON_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_waxed_oxidized_iron_fence"), COBBLESTONE_WAXED_OXIDIZED_IRON_FENCE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_iron_fence_gate"), WAXED_IRON_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_exposed_iron_fence_gate"), WAXED_EXPOSED_IRON_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_weathered_iron_fence_gate"), WAXED_WEATHERED_IRON_FENCE_GATE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "waxed_oxidized_iron_fence_gate"), WAXED_OXIDIZED_IRON_FENCE_GATE);

        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "cobblestone_gold_fence"), COBBLESTONE_GOLD_FENCE);
        Registry.register(Registries.BLOCK, new Identifier(Main.MOD_ID, "gold_fence_gate"), GOLD_FENCE_GATE);

        
        //END METALLFENCES2

    }

}
