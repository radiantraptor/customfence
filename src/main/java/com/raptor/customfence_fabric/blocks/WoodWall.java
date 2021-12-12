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
    VoxelShape BUILD_NORTH_BB = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 4.0F);
    VoxelShape BUILD_EAST_BB = Block.createCuboidShape(12.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    VoxelShape BUILD_SOUTH_BB = Block.createCuboidShape(4.0F, 0.0F, 12.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_WEST_BB = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 4.0F, 16.0F, 12.0F);
    VoxelShape BUILD_POST_NORTH_BB = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_POST_EAST_BB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    VoxelShape BUILD_POST_SOUTH_BB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_POST_WEST_BB = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_POST_NORTH_SOUTH_BB = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_POST_EAST_WEST_BB = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);

    VoxelShape BUILD_POST_NORTH_SOUTH_CB = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 16.0F);
    VoxelShape BUILD_POST_EAST_WEST_CB = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);


    public WoodWall(Settings setting) {

        super(setting);
    }


    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.toString().contains("building")) {
            if (state.toString().contains("north=false")) {
                if (state.toString().contains("east=false")) {
                    if (state.toString().contains("south=false")) {
                        if (state.toString().contains("west=false")) {
                            return BUILD_POST_BB;
                        }
                        else {
                            return BUILD_POST_WEST_BB;
                        }
                    }
                    else {
                        if (state.toString().contains("west=false")) {
                            return BUILD_POST_SOUTH_BB;
                        }
                        else {
                            return VoxelShapes.union(BUILD_POST_SOUTH_BB, BUILD_WEST_BB);
                        }
                    }
                }
                else {
                    if (state.toString().contains("south=false")) {
                        if (state.toString().contains("west=false")) {
                            return BUILD_POST_EAST_BB;
                        }
                        else {
                            return BUILD_POST_EAST_WEST_BB;
                        }
                    }
                    else {
                        if (state.toString().contains("west=false")) {
                            return VoxelShapes.union(BUILD_POST_EAST_BB, BUILD_SOUTH_BB);
                        }
                        else {
                            return VoxelShapes.union(BUILD_POST_EAST_WEST_BB, BUILD_SOUTH_BB);
                        }
                    }
                }
            }
            else {
                if (state.toString().contains("east=false")) {
                    if (state.toString().contains("south=false")) {
                        if (state.toString().contains("west=false")) {
                            return BUILD_POST_NORTH_BB;
                        }
                        else {
                            return VoxelShapes.union(BUILD_POST_NORTH_BB, BUILD_WEST_BB);
                        }
                    }
                    else {
                        if (state.toString().contains("west=false")) {
                            return BUILD_POST_NORTH_SOUTH_BB;
                        }
                        else {
                            return VoxelShapes.union(BUILD_POST_NORTH_SOUTH_BB, BUILD_WEST_BB);
                        }
                    }
                }
                else {
                    if (state.toString().contains("south=false")) {
                        if (state.toString().contains("west=false")) {
                            return VoxelShapes.union(BUILD_POST_NORTH_BB, BUILD_EAST_BB);
                        }
                        else {
                            return VoxelShapes.union(BUILD_POST_EAST_WEST_BB, BUILD_NORTH_BB);
                        }
                    }
                    else {
                        if (state.toString().contains("west=false")) {
                            return VoxelShapes.union(BUILD_POST_NORTH_SOUTH_BB, BUILD_EAST_BB);
                        }
                        else {
                            return VoxelShapes.union(BUILD_POST_NORTH_SOUTH_BB, BUILD_EAST_BB, BUILD_WEST_BB);
                        }
                    }
                }
            }
        }
        else {
            return super.getOutlineShape(state, world, pos, context);
        }
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {

        if (state.toString().contains("building")) {
            if (!state.toString().contains("north=false") && state.toString().contains("east=false") && !state.toString().contains("south=false") && state.toString().contains("west=false") ) {
                return BUILD_POST_NORTH_SOUTH_CB;
            }
            else if (state.toString().contains("north=false") && !state.toString().contains("east=false") && state.toString().contains("south=false") && !state.toString().contains("west=false")) {
                return BUILD_POST_EAST_WEST_CB;
            }
            else {
                return super.getCollisionShape(state, world, pos, context);
            }
        }
        else {
            return super.getCollisionShape(state, world, pos, context);
        }
    }


}


