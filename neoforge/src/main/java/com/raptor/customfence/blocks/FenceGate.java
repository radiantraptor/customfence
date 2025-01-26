package com.raptor.customfence.blocks;

import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.properties.WoodType;

public class FenceGate extends FenceGateBlock {

    public FenceGate(Properties properties, WoodType woodtype) {
        super(woodtype, properties);
    }

}
