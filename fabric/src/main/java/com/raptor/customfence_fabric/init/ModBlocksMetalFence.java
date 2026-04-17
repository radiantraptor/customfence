package com.raptor.customfence_fabric.init;

import com.raptor.customfence_fabric.Main;
import com.raptor.customfence_fabric.blocks.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Function;


public class ModBlocksMetalFence {

    public static final Block COBBLESTONE_COPPER_MANSION_FENCE = registerBlock("cobblestone_copper_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_EXPOSED_COPPER_MANSION_FENCE = registerBlock("cobblestone_exposed_copper_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_WEATHERED_COPPER_MANSION_FENCE = registerBlock("cobblestone_weathered_copper_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_OXIDIZED_COPPER_MANSION_FENCE = registerBlock("cobblestone_oxidized_copper_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final Block COPPER_MANSION_FENCE_GATE = registerBlock("copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block EXPOSED_COPPER_MANSION_FENCE_GATE = registerBlock("exposed_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.EXPOSED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block WEATHERED_COPPER_MANSION_FENCE_GATE = registerBlock("weathered_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.WEATHERED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block OXIDIZED_COPPER_MANSION_FENCE_GATE = registerBlock("oxidized_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.OXIDIZED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final Block COBBLESTONE_WAXED_COPPER_MANSION_FENCE = registerBlock("cobblestone_waxed_copper_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_WAXED_EXPOSED_COPPER_MANSION_FENCE = registerBlock("cobblestone_waxed_exposed_copper_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_WAXED_WEATHERED_COPPER_MANSION_FENCE = registerBlock("cobblestone_waxed_weathered_copper_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_WAXED_OXIDIZED_COPPER_MANSION_FENCE = registerBlock("cobblestone_waxed_oxidized_copper_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final Block WAXED_COPPER_MANSION_FENCE_GATE = registerBlock("waxed_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block WAXED_EXPOSED_COPPER_MANSION_FENCE_GATE = registerBlock("waxed_exposed_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.EXPOSED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block WAXED_WEATHERED_COPPER_MANSION_FENCE_GATE = registerBlock("waxed_weathered_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.WEATHERED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_MANSION_FENCE_GATE = registerBlock("waxed_oxidized_copper_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.OXIDIZED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));


    public static final Block COBBLESTONE_IRON_MANSION_FENCE = registerBlock("cobblestone_iron_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_EXPOSED_IRON_MANSION_FENCE = registerBlock("cobblestone_exposed_iron_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_WEATHERED_IRON_MANSION_FENCE = registerBlock("cobblestone_weathered_iron_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_OXIDIZED_IRON_MANSION_FENCE = registerBlock("cobblestone_oxidized_iron_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final Block IRON_MANSION_FENCE_GATE = registerBlock("iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block EXPOSED_IRON_MANSION_FENCE_GATE = registerBlock("exposed_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.EXPOSED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block WEATHERED_IRON_MANSION_FENCE_GATE = registerBlock("weathered_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.WEATHERED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block OXIDIZED_IRON_MANSION_FENCE_GATE = registerBlock("oxidized_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.OXIDIZED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final Block COBBLESTONE_WAXED_IRON_MANSION_FENCE = registerBlock("cobblestone_waxed_iron_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_WAXED_EXPOSED_IRON_MANSION_FENCE = registerBlock("cobblestone_waxed_exposed_iron_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_WAXED_WEATHERED_IRON_MANSION_FENCE = registerBlock("cobblestone_waxed_weathered_iron_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_WAXED_OXIDIZED_IRON_MANSION_FENCE = registerBlock("cobblestone_waxed_oxidized_iron_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final Block WAXED_IRON_MANSION_FENCE_GATE = registerBlock("waxed_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block WAXED_EXPOSED_IRON_MANSION_FENCE_GATE = registerBlock("waxed_exposed_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.EXPOSED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block WAXED_WEATHERED_IRON_MANSION_FENCE_GATE = registerBlock("waxed_weathered_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.WEATHERED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block WAXED_OXIDIZED_IRON_MANSION_FENCE_GATE = registerBlock("waxed_oxidized_iron_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.OXIDIZED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));


    public static final Block COBBLESTONE_GOLD_MANSION_FENCE = registerBlock("cobblestone_gold_mansion_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block GOLD_MANSION_FENCE_GATE = registerBlock("gold_mansion_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeGold("gold_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));


    public static final Block COBBLESTONE_COPPER_MESH_FENCE = registerBlock("cobblestone_copper_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_EXPOSED_COPPER_MESH_FENCE = registerBlock("cobblestone_exposed_copper_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_WEATHERED_COPPER_MESH_FENCE = registerBlock("cobblestone_weathered_copper_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_OXIDIZED_COPPER_MESH_FENCE = registerBlock("cobblestone_oxidized_copper_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final Block COPPER_MESH_FENCE_GATE = registerBlock("copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block EXPOSED_COPPER_MESH_FENCE_GATE = registerBlock("exposed_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.EXPOSED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block WEATHERED_COPPER_MESH_FENCE_GATE = registerBlock("weathered_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.WEATHERED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block OXIDIZED_COPPER_MESH_FENCE_GATE = registerBlock("oxidized_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.OXIDIZED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final Block COBBLESTONE_WAXED_COPPER_MESH_FENCE = registerBlock("cobblestone_waxed_copper_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_WAXED_EXPOSED_COPPER_MESH_FENCE = registerBlock("cobblestone_waxed_exposed_copper_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_WAXED_WEATHERED_COPPER_MESH_FENCE = registerBlock("cobblestone_waxed_weathered_copper_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block COBBLESTONE_WAXED_OXIDIZED_COPPER_MESH_FENCE = registerBlock("cobblestone_waxed_oxidized_copper_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static final Block WAXED_COPPER_MESH_FENCE_GATE = registerBlock("waxed_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block WAXED_EXPOSED_COPPER_MESH_FENCE_GATE = registerBlock("waxed_exposed_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.EXPOSED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block WAXED_WEATHERED_COPPER_MESH_FENCE_GATE = registerBlock("waxed_weathered_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.WEATHERED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block WAXED_OXIDIZED_COPPER_MESH_FENCE_GATE = registerBlock("waxed_oxidized_copper_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.OXIDIZED, MetalType.WoodTypeCopper("copper_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.COPPER));


    public static final Block COBBLESTONE_IRON_MESH_FENCE = registerBlock("cobblestone_iron_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_EXPOSED_IRON_MESH_FENCE = registerBlock("cobblestone_exposed_iron_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_WEATHERED_IRON_MESH_FENCE = registerBlock("cobblestone_weathered_iron_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_OXIDIZED_IRON_MESH_FENCE = registerBlock("cobblestone_oxidized_iron_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final Block IRON_MESH_FENCE_GATE = registerBlock("iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block EXPOSED_IRON_MESH_FENCE_GATE = registerBlock("exposed_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.EXPOSED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block WEATHERED_IRON_MESH_FENCE_GATE = registerBlock("weathered_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.WEATHERED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block OXIDIZED_IRON_MESH_FENCE_GATE = registerBlock("oxidized_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.OXIDIZED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final Block COBBLESTONE_WAXED_IRON_MESH_FENCE = registerBlock("cobblestone_waxed_iron_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_WAXED_EXPOSED_IRON_MESH_FENCE = registerBlock("cobblestone_waxed_exposed_iron_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.EXPOSED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_WAXED_WEATHERED_IRON_MESH_FENCE = registerBlock("cobblestone_waxed_weathered_iron_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.WEATHERED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block COBBLESTONE_WAXED_OXIDIZED_IRON_MESH_FENCE = registerBlock("cobblestone_waxed_oxidized_iron_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.OXIDIZED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));

    public static final Block WAXED_IRON_MESH_FENCE_GATE = registerBlock("waxed_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block WAXED_EXPOSED_IRON_MESH_FENCE_GATE = registerBlock("waxed_exposed_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.EXPOSED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_EXPOSED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block WAXED_WEATHERED_IRON_MESH_FENCE_GATE = registerBlock("waxed_weathered_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.WEATHERED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_WEATHERED).strength(3.0F, 6.0F).sound(SoundType.IRON));
    public static final Block WAXED_OXIDIZED_IRON_MESH_FENCE_GATE = registerBlock("waxed_oxidized_iron_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.OXIDIZED, MetalType.WoodTypeIron("iron_fence", BlockSetType.IRON), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET_OXIDIZED).strength(3.0F, 6.0F).sound(SoundType.IRON));


    public static final Block COBBLESTONE_GOLD_MESH_FENCE = registerBlock("cobblestone_gold_mesh_fence", (p) -> new MetalFence(WeatheringCopper.WeatherState.UNAFFECTED, p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));
    public static final Block GOLD_MESH_FENCE_GATE = registerBlock("gold_mesh_fence_gate", (p) -> new MetalFenceGate(WeatheringCopper.WeatherState.UNAFFECTED, MetalType.WoodTypeGold("gold_fence", BlockSetType.COPPER), p), BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(3.0F, 6.0F).sound(SoundType.COPPER));

    public static BlockBehaviour.Properties metalFenceProperties() {
        return BlockBehaviour.Properties.of().forceSolidOn().instrument(NoteBlockInstrument.TRUMPET).strength(2.0F,3.0F).sound(SoundType.WOOD).ignitedByLava();
    }

    public static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties settings) {
        Block block = function.apply(settings.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void registerModBlocks() {

    }

}
