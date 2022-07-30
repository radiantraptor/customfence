package com.raptor.customfence_fabric.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import net.minecraft.class_5547;
import com.raptor.customfence_fabric.init.ModBlocks;


public interface WeatheringFence extends class_5547<WeatheringFence.WeatherState> {
    Supplier<BiMap<class_2248, class_2248>> NEXT_BY_BLOCK = Suppliers.memoize(() -> ImmutableBiMap.<class_2248, class_2248>builder()

            .put(ModBlocks.cobblestoneCopperFence, ModBlocks.cobblestoneExposedCopperFence)
            .put(ModBlocks.cobblestoneExposedCopperFence, ModBlocks.cobblestoneWeatheredCopperFence)
            .put(ModBlocks.cobblestoneWeatheredCopperFence, ModBlocks.cobblestoneOxidizedCopperFence)
            .put(ModBlocks.copperFenceGate, ModBlocks.exposedCopperFenceGate)
            .put(ModBlocks.exposedCopperFenceGate, ModBlocks.weatheredCopperFenceGate)
            .put(ModBlocks.weatheredCopperFenceGate, ModBlocks.oxidizedCopperFenceGate)

            .put(ModBlocks.cobblestoneIronFence, ModBlocks.cobblestoneExposedIronFence)
            .put(ModBlocks.cobblestoneExposedIronFence, ModBlocks.cobblestoneWeatheredIronFence)
            .put(ModBlocks.cobblestoneWeatheredIronFence, ModBlocks.cobblestoneOxidizedIronFence)
            .put(ModBlocks.ironFenceGate, ModBlocks.exposedIronFenceGate)
            .put(ModBlocks.exposedIronFenceGate, ModBlocks.weatheredIronFenceGate)
            .put(ModBlocks.weatheredIronFenceGate, ModBlocks.oxidizedIronFenceGate)

            .build());

    static Optional<class_2248> getIncreasedOxidationBlock(class_2248 block) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
    }

    default Optional<class_2680> method_31639(class_2680 state) {
        return getIncreasedOxidationBlock(state.method_26204()).map(block ->
                block.method_34725(state));
    }

    default float method_33620() {
        return this.method_33622() == WeatheringFence.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    enum WeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;
    }
}