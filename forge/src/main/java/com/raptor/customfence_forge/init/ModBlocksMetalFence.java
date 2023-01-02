package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import com.raptor.customfence_forge.blocks.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Field;
import java.util.ArrayList;

@SuppressWarnings({"WeakerAccess", "unused"})
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModBlocksMetalFence {

    public static final DeferredRegister<Block> METAL_FENCE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> cobblestoneCopperFence = METAL_FENCE_BLOCKS.register("cobblestone_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneExposedCopperFence = METAL_FENCE_BLOCKS.register("cobblestone_exposed_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWeatheredCopperFence = METAL_FENCE_BLOCKS.register("cobblestone_weathered_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneOxidizedCopperFence = METAL_FENCE_BLOCKS.register("cobblestone_oxidized_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> copperFenceGate = METAL_FENCE_BLOCKS.register("copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> exposedCopperFenceGate = METAL_FENCE_BLOCKS.register("exposed_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> weatheredCopperFenceGate = METAL_FENCE_BLOCKS.register("weathered_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> oxidizedCopperFenceGate = METAL_FENCE_BLOCKS.register("oxidized_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));

    public static final RegistryObject<Block> cobblestoneWaxedCopperFence = METAL_FENCE_BLOCKS.register("cobblestone_waxed_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedExposedCopperFence = METAL_FENCE_BLOCKS.register("cobblestone_waxed_exposed_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedWeatheredCopperFence = METAL_FENCE_BLOCKS.register("cobblestone_waxed_weathered_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedOxidizedCopperFence = METAL_FENCE_BLOCKS.register("cobblestone_waxed_oxidized_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> waxedCopperFenceGate = METAL_FENCE_BLOCKS.register("waxed_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> waxedExposedCopperFenceGate = METAL_FENCE_BLOCKS.register("waxed_exposed_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> waxedWeatheredCopperFenceGate = METAL_FENCE_BLOCKS.register("waxed_weathered_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> waxedOxidizedCopperFenceGate = METAL_FENCE_BLOCKS.register("waxed_oxidized_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));

    public static final RegistryObject<Block> cobblestoneIronFence = METAL_FENCE_BLOCKS.register("cobblestone_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneExposedIronFence = METAL_FENCE_BLOCKS.register("cobblestone_exposed_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWeatheredIronFence = METAL_FENCE_BLOCKS.register("cobblestone_weathered_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneOxidizedIronFence = METAL_FENCE_BLOCKS.register("cobblestone_oxidized_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ironFenceGate = METAL_FENCE_BLOCKS.register("iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> exposedIronFenceGate = METAL_FENCE_BLOCKS.register("exposed_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> weatheredIronFenceGate = METAL_FENCE_BLOCKS.register("weathered_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> oxidizedIronFenceGate = METAL_FENCE_BLOCKS.register("oxidized_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));

    public static final RegistryObject<Block> cobblestoneWaxedIronFence = METAL_FENCE_BLOCKS.register("cobblestone_waxed_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedExposedIronFence = METAL_FENCE_BLOCKS.register("cobblestone_waxed_exposed_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedWeatheredIronFence = METAL_FENCE_BLOCKS.register("cobblestone_waxed_weathered_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedOxidizedIronFence = METAL_FENCE_BLOCKS.register("cobblestone_waxed_oxidized_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> waxedIronFenceGate = METAL_FENCE_BLOCKS.register("waxed_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> waxedExposedIronFenceGate = METAL_FENCE_BLOCKS.register("waxed_exposed_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> waxedWeatheredIronFenceGate = METAL_FENCE_BLOCKS.register("waxed_weathered_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));
    public static final RegistryObject<Block> waxedOxidizedIronFenceGate = METAL_FENCE_BLOCKS.register("waxed_oxidized_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));

    public static final RegistryObject<Block> cobblestoneGoldFence = METAL_FENCE_BLOCKS.register("cobblestone_gold_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> goldFenceGate = METAL_FENCE_BLOCKS.register("gold_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN));

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
    }




}
