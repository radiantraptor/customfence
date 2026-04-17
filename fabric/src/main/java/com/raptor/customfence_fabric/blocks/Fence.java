package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.Main;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Function;


public class Fence extends FenceBlock {

    public Fence(Properties properties) {
        super(properties);
    }

}
