package com.raptor.customfence_neoforge.init;

import com.raptor.customfence_neoforge.Main;
import com.raptor.customfence_neoforge.blocks.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.item.AxeItem;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Function;
import java.util.function.Supplier;

@EventBusSubscriber(modid = Main.MOD_ID)
public class ModBlocksMetalFence {

    public static final DeferredRegister.Blocks METAL_FENCE_BLOCKS = DeferredRegister.createBlocks(Main.MOD_ID);

    public static final DeferredBlock<Block> COBBLESTONE_COPPER_MANSION_FENCE = registerBlock("cobblestone_copper_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE = registerBlock("cobblestone_exposed_copper_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE = registerBlock("cobblestone_weathered_copper_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE = registerBlock("cobblestone_oxidized_copper_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final DeferredBlock<Block> COPPER_MANSION_FENCE_GATE = registerBlock("copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> EXPOSED_COPPER_MANSION_FENCE_GATE = registerBlock("exposed_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> WEATHERED_COPPER_MANSION_FENCE_GATE = registerBlock("weathered_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_MANSION_FENCE_GATE = registerBlock("oxidized_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final DeferredBlock<Block> COBBLESTONE_WAXED_COPPER_MANSION_FENCE = registerBlock("cobblestone_waxed_copper_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_EXPOSED_COPPER_MANSION_FENCE = registerBlock("cobblestone_waxed_exposed_copper_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_WEATHERED_COPPER_MANSION_FENCE = registerBlock("cobblestone_waxed_weathered_copper_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_OXIDIZED_COPPER_MANSION_FENCE = registerBlock("cobblestone_waxed_oxidized_copper_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final DeferredBlock<Block> WAXED_COPPER_MANSION_FENCE_GATE = registerBlock("waxed_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_MANSION_FENCE_GATE = registerBlock("waxed_exposed_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_MANSION_FENCE_GATE = registerBlock("waxed_weathered_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_MANSION_FENCE_GATE = registerBlock("waxed_oxidized_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));


    public static final DeferredBlock<Block> COBBLESTONE_IRON_MANSION_FENCE = registerBlock("cobblestone_iron_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_EXPOSED_IRON_MANSION_FENCE = registerBlock("cobblestone_exposed_iron_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_WEATHERED_IRON_MANSION_FENCE = registerBlock("cobblestone_weathered_iron_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE = registerBlock("cobblestone_oxidized_iron_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final DeferredBlock<Block> IRON_MANSION_FENCE_GATE = registerBlock("iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> EXPOSED_IRON_MANSION_FENCE_GATE = registerBlock("exposed_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> WEATHERED_IRON_MANSION_FENCE_GATE = registerBlock("weathered_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> OXIDIZED_IRON_MANSION_FENCE_GATE = registerBlock("oxidized_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final DeferredBlock<Block> COBBLESTONE_WAXED_IRON_MANSION_FENCE = registerBlock("cobblestone_waxed_iron_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_EXPOSED_IRON_MANSION_FENCE = registerBlock("cobblestone_waxed_exposed_iron_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_WEATHERED_IRON_MANSION_FENCE = registerBlock("cobblestone_waxed_weathered_iron_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_OXIDIZED_IRON_MANSION_FENCE = registerBlock("cobblestone_waxed_oxidized_iron_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final DeferredBlock<Block> WAXED_IRON_MANSION_FENCE_GATE = registerBlock("waxed_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> WAXED_EXPOSED_IRON_MANSION_FENCE_GATE = registerBlock("waxed_exposed_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> WAXED_WEATHERED_IRON_MANSION_FENCE_GATE = registerBlock("waxed_weathered_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_IRON_MANSION_FENCE_GATE = registerBlock("waxed_oxidized_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));


    public static final DeferredBlock<Block> COBBLESTONE_GOLD_MANSION_FENCE = registerBlock("cobblestone_gold_mansion_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> GOLD_MANSION_FENCE_GATE = registerBlock("gold_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeGold("gold_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.METAL));


    public static final DeferredBlock<Block> COBBLESTONE_COPPER_MESH_FENCE = registerBlock("cobblestone_copper_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_EXPOSED_COPPER_MESH_FENCE = registerBlock("cobblestone_exposed_copper_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_WEATHERED_COPPER_MESH_FENCE = registerBlock("cobblestone_weathered_copper_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE = registerBlock("cobblestone_oxidized_copper_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final DeferredBlock<Block> COPPER_MESH_FENCE_GATE = registerBlock("copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> EXPOSED_COPPER_MESH_FENCE_GATE = registerBlock("exposed_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> WEATHERED_COPPER_MESH_FENCE_GATE = registerBlock("weathered_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_MESH_FENCE_GATE = registerBlock("oxidized_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final DeferredBlock<Block> COBBLESTONE_WAXED_COPPER_MESH_FENCE = registerBlock("cobblestone_waxed_copper_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_EXPOSED_COPPER_MESH_FENCE = registerBlock("cobblestone_waxed_exposed_copper_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_WEATHERED_COPPER_MESH_FENCE = registerBlock("cobblestone_waxed_weathered_copper_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_OXIDIZED_COPPER_MESH_FENCE = registerBlock("cobblestone_waxed_oxidized_copper_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final DeferredBlock<Block> WAXED_COPPER_MESH_FENCE_GATE = registerBlock("waxed_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_MESH_FENCE_GATE = registerBlock("waxed_exposed_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_MESH_FENCE_GATE = registerBlock("waxed_weathered_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_MESH_FENCE_GATE = registerBlock("waxed_oxidized_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, p, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));


    public static final DeferredBlock<Block> COBBLESTONE_IRON_MESH_FENCE = registerBlock("cobblestone_iron_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_EXPOSED_IRON_MESH_FENCE = registerBlock("cobblestone_exposed_iron_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_WEATHERED_IRON_MESH_FENCE = registerBlock("cobblestone_weathered_iron_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_OXIDIZED_IRON_MESH_FENCE = registerBlock("cobblestone_oxidized_iron_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final DeferredBlock<Block> IRON_MESH_FENCE_GATE = registerBlock("iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> EXPOSED_IRON_MESH_FENCE_GATE = registerBlock("exposed_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> WEATHERED_IRON_MESH_FENCE_GATE = registerBlock("weathered_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> OXIDIZED_IRON_MESH_FENCE_GATE = registerBlock("oxidized_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final DeferredBlock<Block> COBBLESTONE_WAXED_IRON_MESH_FENCE = registerBlock("cobblestone_waxed_iron_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_EXPOSED_IRON_MESH_FENCE = registerBlock("cobblestone_waxed_exposed_iron_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_WEATHERED_IRON_MESH_FENCE = registerBlock("cobblestone_waxed_weathered_iron_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> COBBLESTONE_WAXED_OXIDIZED_IRON_MESH_FENCE = registerBlock("cobblestone_waxed_oxidized_iron_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final DeferredBlock<Block> WAXED_IRON_MESH_FENCE_GATE = registerBlock("waxed_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> WAXED_EXPOSED_IRON_MESH_FENCE_GATE = registerBlock("waxed_exposed_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> WAXED_WEATHERED_IRON_MESH_FENCE_GATE = registerBlock("waxed_weathered_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_IRON_MESH_FENCE_GATE = registerBlock("waxed_oxidized_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, p, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));


    public static final DeferredBlock<Block> COBBLESTONE_GOLD_MESH_FENCE = registerBlock("cobblestone_gold_mesh_fence", (p) -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final DeferredBlock<Block> GOLD_MESH_FENCE_GATE = registerBlock("gold_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, p, MetalType.WoodTypeGold("gold_fence", BlockSetType.COPPER)), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.METAL));


    public static BlockBehaviour.Properties metalFenceProperties() {
        return BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava();
    }

    public static <T extends Block> DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        DeferredBlock<Block> defblock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, defblock);
        return defblock;
    }

    public static <T extends Block> DeferredItem<Item> registerBlockItem(String name, DeferredBlock<Block> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }


    public static <T extends Block> DeferredBlock<Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        DeferredBlock<Block> defblock = register(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        return defblock;
    }

    public static <T extends Block> DeferredBlock<Block> register(String name, Function<BlockBehaviour.Properties, Block> block, BlockBehaviour.Properties properties) {
        return METAL_FENCE_BLOCKS.register(name, () -> block.apply(properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void register(IEventBus eventBus) {
        METAL_FENCE_BLOCKS.register(eventBus);
    }


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
                event.setCancellationResult(InteractionResult.SUCCESS);
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
                        event.getLevel().playSound(event.getEntity(), event.getPos(), SoundEvents.ITEM_BREAK.value(), SoundSource.BLOCKS, 1.0f, 1.0f);
                    }
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.SUCCESS);
            }
            else if (WeatheringFence.getPrevious(event.getLevel().getBlockState(event.getPos())).orElse(null) != null) {
                event.getLevel().levelEvent(event.getEntity(), 3005, event.getPos(), 0);
                event.getLevel().playSound(event.getEntity(), event.getPos(), SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0f, 1.0f);
                event.getLevel().setBlockAndUpdate(event.getPos(), WeatheringFence.getPrevious(event.getLevel().getBlockState(event.getPos())).orElse(null));
                if (event.getEntity() != null && !event.getEntity().isCreative()) {
                    event.getItemStack().setDamageValue(event.getItemStack().getDamageValue()+1);
                    if (event.getItemStack().getDamageValue() == event.getItemStack().getMaxDamage()) {
                        event.getItemStack().setCount(0);
                        event.getLevel().playSound(event.getEntity(), event.getPos(), SoundEvents.ITEM_BREAK.value(), SoundSource.BLOCKS, 1.0f, 1.0f);
                    }
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.SUCCESS);
            }
        }
    }


}
