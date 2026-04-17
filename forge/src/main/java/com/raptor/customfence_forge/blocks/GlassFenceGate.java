package com.raptor.customfence_forge.blocks;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GlassFenceGate extends FenceGateBlock {

    public GlassFenceGate(BlockBehaviour.Properties properties, WoodType woodtype) {
        super(woodtype, properties);
    }

}
