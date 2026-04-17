package com.raptor.customfence_fabric.blocks;

import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GlassFenceGate extends FenceGateBlock {

    public GlassFenceGate(BlockBehaviour.Properties properties, WoodType woodtype) {
        super(woodtype, properties);
    }

}
