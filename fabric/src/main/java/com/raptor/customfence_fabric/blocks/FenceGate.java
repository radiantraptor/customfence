package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.Main;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.properties.WoodType;

public class FenceGate extends FenceGateBlock {

    WoodType woodtype;

    public FenceGate(WoodType woodtype, Properties properties) {

        super(woodtype, properties);
        this.woodtype = woodtype;
    }

}
