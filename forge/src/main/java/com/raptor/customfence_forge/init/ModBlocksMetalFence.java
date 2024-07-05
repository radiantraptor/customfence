package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import com.raptor.customfence_forge.blocks.*;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.AxeItem;

import java.sql.ResultSet;
import java.util.Optional;


@SuppressWarnings({"WeakerAccess", "unused"})
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModBlocksMetalFence {

    public static final DeferredRegister<Block> METAL_FENCE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
    
    //BEGIN METALLFENCES

    public static final RegistryObject<Block> COBBLESTONE_COPPER_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_copper_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_exposed_copper_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_weathered_copper_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_oxidized_copper_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> COPPER_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("copper_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> EXPOSED_COPPER_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("exposed_copper_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WEATHERED_COPPER_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("weathered_copper_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("oxidized_copper_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));

    public static final RegistryObject<Block> COBBLESTONE_WAXED_COPPER_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_copper_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_EXPOSED_COPPER_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_exposed_copper_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_WEATHERED_COPPER_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_weathered_copper_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_OXIDIZED_COPPER_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_oxidized_copper_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> WAXED_COPPER_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_copper_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_exposed_copper_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_weathered_copper_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_oxidized_copper_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));

    public static final RegistryObject<Block> COBBLESTONE_IRON_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_iron_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_EXPOSED_IRON_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_exposed_iron_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WEATHERED_IRON_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_weathered_iron_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_oxidized_iron_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> IRON_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("iron_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> EXPOSED_IRON_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("exposed_iron_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WEATHERED_IRON_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("weathered_iron_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> OXIDIZED_IRON_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("oxidized_iron_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));

    public static final RegistryObject<Block> COBBLESTONE_WAXED_IRON_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_iron_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_EXPOSED_IRON_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_exposed_iron_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_WEATHERED_IRON_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_weathered_iron_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_OXIDIZED_IRON_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_oxidized_iron_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> WAXED_IRON_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_iron_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_EXPOSED_IRON_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_exposed_iron_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_WEATHERED_IRON_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_weathered_iron_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_IRON_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_oxidized_iron_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));

    public static final RegistryObject<Block> COBBLESTONE_GOLD_MANSION_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_gold_mansion_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOLD_MANSION_FENCE_GATE = METAL_FENCE_BLOCKS.register("gold_mansion_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));


    public static final RegistryObject<Block> COBBLESTONE_COPPER_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_copper_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COBBLESTONE_EXPOSED_COPPER_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_exposed_copper_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WEATHERED_COPPER_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_weathered_copper_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_oxidized_copper_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> COPPER_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("copper_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));;
    public static final RegistryObject<Block> EXPOSED_COPPER_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("exposed_copper_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WEATHERED_COPPER_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("weathered_copper_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("oxidized_copper_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));

    public static final RegistryObject<Block> COBBLESTONE_WAXED_COPPER_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_copper_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_EXPOSED_COPPER_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_exposed_copper_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_WEATHERED_COPPER_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_weathered_copper_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_OXIDIZED_COPPER_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_oxidized_copper_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> WAXED_COPPER_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_copper_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_exposed_copper_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_weathered_copper_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_oxidized_copper_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));


    public static final RegistryObject<Block> COBBLESTONE_IRON_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_iron_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COBBLESTONE_EXPOSED_IRON_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_exposed_iron_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WEATHERED_IRON_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_weathered_iron_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_OXIDIZED_IRON_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_oxidized_iron_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> IRON_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("iron_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));;
    public static final RegistryObject<Block> EXPOSED_IRON_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("exposed_iron_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WEATHERED_IRON_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("weathered_iron_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> OXIDIZED_IRON_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("oxidized_iron_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));

    public static final RegistryObject<Block> COBBLESTONE_WAXED_IRON_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_iron_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_EXPOSED_IRON_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_exposed_iron_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_WEATHERED_IRON_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_weathered_iron_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_OXIDIZED_IRON_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_oxidized_iron_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> WAXED_IRON_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_iron_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_EXPOSED_IRON_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_exposed_iron_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_WEATHERED_IRON_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_weathered_iron_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));
    public static final RegistryObject<Block> WAXED_OXIDIZED_IRON_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_oxidized_iron_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));


    public static final RegistryObject<Block> COBBLESTONE_GOLD_MESH_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_gold_mesh_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOLD_MESH_FENCE_GATE = METAL_FENCE_BLOCKS.register("gold_mesh_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), new WoodType("metal", BlockSetType.IRON, SoundType.METAL, SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN)));


    //END METALLFENCES

    /*
    Constant field values can be found here:
    https://lexxie.dev/forge/1.20.4/constant-values.html#net.minecraft.world.level.block.LevelEvent.PARTICLES_WAX_OFF
    3003 - PARTICLES_AND_SOUND_WAX_ON
    3004 - PARTICLES_WAX_OFF
    3005 - PARTICLES_SCRAPE
    */

    @SubscribeEvent()
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getItemStack().getItem() instanceof HoneycombItem) {
            if (WaxedMetal.getWaxed(event.getLevel().getBlockState(event.getPos())).orElse(null) != null) {
                event.getLevel().levelEvent(event.getEntity(), 3003, event.getPos(), 0);
                event.getLevel().setBlockAndUpdate(event.getPos(), WaxedMetal.getWaxed(event.getLevel().getBlockState(event.getPos())).orElse(null));
                if (event.getEntity() != null && !event.getEntity().isCreative()) {
                    event.getItemStack().shrink(1);
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.sidedSuccess(event.getLevel().isClientSide));
            }
        }
        if (event.getItemStack().getItem() instanceof AxeItem) {
            if (WaxedMetal.getUnWaxed(event.getLevel().getBlockState(event.getPos())).orElse(null) != null) {
                event.getLevel().levelEvent(event.getEntity(), 3004, event.getPos(), 0);
                event.getLevel().playSound(event.getEntity(), event.getPos(), SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0f, 1.0f);
                event.getLevel().setBlockAndUpdate(event.getPos(), WaxedMetal.getUnWaxed(event.getLevel().getBlockState(event.getPos())).orElse(null));
                if (event.getEntity() != null && !event.getEntity().isCreative()) {
                    event.getItemStack().setDamageValue(event.getItemStack().getDamageValue()+1);
                    if (event.getItemStack().getDamageValue() == event.getItemStack().getMaxDamage()) {
                        event.getItemStack().setCount(0);
                        event.getLevel().playSound(event.getEntity(), event.getPos(), SoundEvents.ITEM_BREAK, SoundSource.BLOCKS, 1.0f, 1.0f);
                    }
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.sidedSuccess(event.getLevel().isClientSide));
            }
            else if (WeatheringFence.getPrevious(event.getLevel().getBlockState(event.getPos())).orElse(null) != null) {
                event.getLevel().levelEvent(event.getEntity(), 3005, event.getPos(), 0);
                event.getLevel().playSound(event.getEntity(), event.getPos(), SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0f, 1.0f);
                event.getLevel().setBlockAndUpdate(event.getPos(), WeatheringFence.getPrevious(event.getLevel().getBlockState(event.getPos())).orElse(null));
                if (event.getEntity() != null && !event.getEntity().isCreative()) {
                    event.getItemStack().setDamageValue(event.getItemStack().getDamageValue()+1);
                    if (event.getItemStack().getDamageValue() == event.getItemStack().getMaxDamage()) {
                        event.getItemStack().setCount(0);
                        event.getLevel().playSound(event.getEntity(), event.getPos(), SoundEvents.ITEM_BREAK, SoundSource.BLOCKS, 1.0f, 1.0f);
                    }
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.sidedSuccess(event.getLevel().isClientSide));
            }
        }
    }


}
