package com.raptor.customfence_forge.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.raptor.customfence_forge.init.ModBlocksMetalFence;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public class WaxedMetal {

    public static final Supplier<BiMap<Block, Block>> WAXABLES = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()

                .put(ModBlocksMetalFence.cobblestoneCopperFence.get(), ModBlocksMetalFence.cobblestoneWaxedCopperFence.get())
                .put(ModBlocksMetalFence.cobblestoneExposedCopperFence.get(), ModBlocksMetalFence.cobblestoneWaxedExposedCopperFence.get())
                .put(ModBlocksMetalFence.cobblestoneWeatheredCopperFence.get(), ModBlocksMetalFence.cobblestoneWaxedWeatheredCopperFence.get())
                .put(ModBlocksMetalFence.cobblestoneOxidizedCopperFence.get(), ModBlocksMetalFence.cobblestoneWaxedOxidizedCopperFence.get())
                .put(ModBlocksMetalFence.copperFenceGate.get(), ModBlocksMetalFence.waxedCopperFenceGate.get())
                .put(ModBlocksMetalFence.exposedCopperFenceGate.get(), ModBlocksMetalFence.waxedExposedCopperFenceGate.get())
                .put(ModBlocksMetalFence.weatheredCopperFenceGate.get(), ModBlocksMetalFence.waxedWeatheredCopperFenceGate.get())
                .put(ModBlocksMetalFence.oxidizedCopperFenceGate.get(), ModBlocksMetalFence.waxedOxidizedCopperFenceGate.get())

                .put(ModBlocksMetalFence.cobblestoneIronFence.get(), ModBlocksMetalFence.cobblestoneWaxedIronFence.get())
                .put(ModBlocksMetalFence.cobblestoneExposedIronFence.get(), ModBlocksMetalFence.cobblestoneWaxedExposedIronFence.get())
                .put(ModBlocksMetalFence.cobblestoneWeatheredIronFence.get(), ModBlocksMetalFence.cobblestoneWaxedWeatheredIronFence.get())
                .put(ModBlocksMetalFence.cobblestoneOxidizedIronFence.get(), ModBlocksMetalFence.cobblestoneWaxedOxidizedIronFence.get())
                .put(ModBlocksMetalFence.ironFenceGate.get(), ModBlocksMetalFence.waxedIronFenceGate.get())
                .put(ModBlocksMetalFence.exposedIronFenceGate.get(), ModBlocksMetalFence.waxedExposedIronFenceGate.get())
                .put(ModBlocksMetalFence.weatheredIronFenceGate.get(), ModBlocksMetalFence.waxedWeatheredIronFenceGate.get())
                .put(ModBlocksMetalFence.oxidizedIronFenceGate.get(), ModBlocksMetalFence.waxedOxidizedIronFenceGate.get())

                .build();
        });
    public static final Supplier<BiMap<Block, Block>> WAX_OFF_BY_BLOCK = Suppliers.memoize(() -> {
        return WaxedMetal.WAXABLES.get().inverse();
    });


    public static Optional<BlockState> getWaxed(BlockState state) {
        return Optional.ofNullable(WaxedMetal.WAXABLES.get().get(state.getBlock())).map(block -> block.withPropertiesOf(state));
    }

    public static Optional<BlockState> getUnWaxed(BlockState state) {
        return Optional.ofNullable(WaxedMetal.WAXABLES.get().inverse().get(state.getBlock())).map(block -> block.withPropertiesOf(state));
    }

}
