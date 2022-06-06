package com.raptor.customfence_forge.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.raptor.customfence_forge.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;

public class WaxedMetal {

    public static final Supplier<BiMap<Block, Block>> WAXABLES = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()

                .put(ModBlocks.cobblestoneCopperFence.get(), ModBlocks.cobblestoneWaxedCopperFence.get())
                .put(ModBlocks.cobblestoneExposedCopperFence.get(), ModBlocks.cobblestoneWaxedExposedCopperFence.get())
                .put(ModBlocks.cobblestoneWeatheredCopperFence.get(), ModBlocks.cobblestoneWaxedWeatheredCopperFence.get())
                .put(ModBlocks.cobblestoneOxidizedCopperFence.get(), ModBlocks.cobblestoneWaxedOxidizedCopperFence.get())
                .put(ModBlocks.copperFenceGate.get(), ModBlocks.waxedCopperFenceGate.get())
                .put(ModBlocks.exposedCopperFenceGate.get(), ModBlocks.waxedExposedCopperFenceGate.get())
                .put(ModBlocks.weatheredCopperFenceGate.get(), ModBlocks.waxedWeatheredCopperFenceGate.get())
                .put(ModBlocks.oxidizedCopperFenceGate.get(), ModBlocks.waxedOxidizedCopperFenceGate.get())

                .put(ModBlocks.cobblestoneIronFence.get(), ModBlocks.cobblestoneWaxedIronFence.get())
                .put(ModBlocks.cobblestoneExposedIronFence.get(), ModBlocks.cobblestoneWaxedExposedIronFence.get())
                .put(ModBlocks.cobblestoneWeatheredIronFence.get(), ModBlocks.cobblestoneWaxedWeatheredIronFence.get())
                .put(ModBlocks.cobblestoneOxidizedIronFence.get(), ModBlocks.cobblestoneWaxedOxidizedIronFence.get())
                .put(ModBlocks.ironFenceGate.get(), ModBlocks.waxedIronFenceGate.get())
                .put(ModBlocks.exposedIronFenceGate.get(), ModBlocks.waxedExposedIronFenceGate.get())
                .put(ModBlocks.weatheredIronFenceGate.get(), ModBlocks.waxedWeatheredIronFenceGate.get())
                .put(ModBlocks.oxidizedIronFenceGate.get(), ModBlocks.waxedOxidizedIronFenceGate.get())

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
