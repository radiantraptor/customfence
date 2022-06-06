package com.raptor.customfence_fabric.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class WoodWall extends FenceBlock {

    VoxelShape BUILD_POST_BB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_NORTH_BB = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_EAST_BB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    VoxelShape BUILD_SOUTH_BB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_WEST_BB = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);

    VoxelShape BUILD_POST_CB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_NORTH_CB = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_EAST_CB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    VoxelShape BUILD_SOUTH_CB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 16.0F);
    VoxelShape BUILD_WEST_CB = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);


    public WoodWall(Settings setting) {
        super(setting);
    }


    public VoxelShape makebuildShapes (BlockState state, VoxelShape post, VoxelShape north, VoxelShape east, VoxelShape south, VoxelShape west) {
        VoxelShape shape = post;
        if (state.toString().contains("north=true")) {
            shape = VoxelShapes.union(shape, north);
        }
        if (state.toString().contains("east=true")) {
            shape = VoxelShapes.union(shape, east);
        }
        if (state.toString().contains("south=true")) {
            shape = VoxelShapes.union(shape, south);
        }
        if (state.toString().contains("west=true")) {
            shape = VoxelShapes.union(shape, west);
        }
        return shape;
    }


    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape;
        shape = makebuildShapes(state, BUILD_POST_BB, BUILD_NORTH_BB, BUILD_EAST_BB, BUILD_SOUTH_BB, BUILD_WEST_BB);
        return shape;
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape;
        shape = makebuildShapes(state, BUILD_POST_CB, BUILD_NORTH_CB, BUILD_EAST_CB, BUILD_SOUTH_CB, BUILD_WEST_CB);
        return shape;
    }


}


