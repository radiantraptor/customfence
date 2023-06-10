package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import com.raptor.customfence_forge.blocks.*;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@SuppressWarnings({"WeakerAccess", "unused"})
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModBlocksMetalFence {

    public static final DeferredRegister<Block> METAL_FENCE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
    
    //BEGIN METALLFENCES

    public static final RegistryObject<Block> COBBLESTONE_COPPER_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_EXPOSED_COPPER_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_exposed_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WEATHERED_COPPER_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_weathered_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_OXIDIZED_COPPER_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_oxidized_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> COPPER_FENCE_GATE = METAL_FENCE_BLOCKS.register("copper_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> EXPOSED_COPPER_FENCE_GATE = METAL_FENCE_BLOCKS.register("exposed_copper_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> WEATHERED_COPPER_FENCE_GATE = METAL_FENCE_BLOCKS.register("weathered_copper_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> OXIDIZED_COPPER_FENCE_GATE = METAL_FENCE_BLOCKS.register("oxidized_copper_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));

    public static final RegistryObject<Block> COBBLESTONE_WAXED_COPPER_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_EXPOSED_COPPER_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_exposed_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_WEATHERED_COPPER_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_weathered_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_OXIDIZED_COPPER_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_oxidized_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> WAXED_COPPER_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_copper_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_exposed_copper_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_weathered_copper_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_oxidized_copper_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));

    public static final RegistryObject<Block> COBBLESTONE_IRON_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_EXPOSED_IRON_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_exposed_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WEATHERED_IRON_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_weathered_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_OXIDIZED_IRON_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_oxidized_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> IRON_FENCE_GATE = METAL_FENCE_BLOCKS.register("iron_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> EXPOSED_IRON_FENCE_GATE = METAL_FENCE_BLOCKS.register("exposed_iron_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> WEATHERED_IRON_FENCE_GATE = METAL_FENCE_BLOCKS.register("weathered_iron_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> OXIDIZED_IRON_FENCE_GATE = METAL_FENCE_BLOCKS.register("oxidized_iron_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));

    public static final RegistryObject<Block> COBBLESTONE_WAXED_IRON_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_EXPOSED_IRON_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_exposed_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_WEATHERED_IRON_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_weathered_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_WAXED_OXIDIZED_IRON_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_waxed_oxidized_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> WAXED_IRON_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_iron_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> WAXED_EXPOSED_IRON_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_exposed_iron_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> WAXED_WEATHERED_IRON_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_weathered_iron_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    public static final RegistryObject<Block> WAXED_OXIDIZED_IRON_FENCE_GATE = METAL_FENCE_BLOCKS.register("waxed_oxidized_iron_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));

    public static final RegistryObject<Block> COBBLESTONE_GOLD_FENCE = METAL_FENCE_BLOCKS.register("cobblestone_gold_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOLD_FENCE_GATE = METAL_FENCE_BLOCKS.register("gold_fence_gate", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER), WoodType.BIRCH));
    
    //END METALLFENCES

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
