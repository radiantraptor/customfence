package com.raptor.customfence.blocks;

import net.minecraft.block.*;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class Wall extends WallBlock {

    VoxelShape MODERN_POST_BB = makeCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape MODERN_NORTH_BB_LOW = makeCuboidShape(5.0F, 0.0F, 0.0F, 11.0F, 15.0F, 4.0F);
    VoxelShape MODERN_EAST_BB_LOW = makeCuboidShape(12.0F, 0.0F, 5.0F, 16.0F, 15.0F, 11.0F);
    VoxelShape MODERN_SOUTH_BB_LOW = makeCuboidShape(5.0F, 0.0F, 12.0F, 11.0F, 15.0F, 16.0F);
    VoxelShape MODERN_WEST_BB_LOW = makeCuboidShape(0.0F, 0.0F, 5.0F, 4.0F, 15.0F, 11.0F);
    VoxelShape MODERN_NORTH_BB_TALL = makeCuboidShape(5.0F, 0.0F, 0.0F, 11.0F, 16.0F, 4.0F);
    VoxelShape MODERN_EAST_BB_TALL = makeCuboidShape(12.0F, 0.0F, 5.0F, 16.0F, 16.0F, 11.0F);
    VoxelShape MODERN_SOUTH_BB_TALL = makeCuboidShape(5.0F, 0.0F, 12.0F, 11.0F, 16.0F, 16.0F);
    VoxelShape MODERN_WEST_BB_TALL = makeCuboidShape(0.0F, 0.0F, 5.0F, 4.0F, 16.0F, 11.0F);
    VoxelShape MODERN_POST_CB = makeCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape MODERN_NORTH_CB = makeCuboidShape(5.0F, 0.0F, 0.0F, 11.0F, 24.0F, 4.0F);
    VoxelShape MODERN_EAST_CB = makeCuboidShape(12.0F, 0.0F, 5.0F, 16.0F, 24.0F, 11.0F);
    VoxelShape MODERN_SOUTH_CB = makeCuboidShape(5.0F, 0.0F, 12.0F, 11.0F, 24.0F, 16.0F);
    VoxelShape MODERN_WEST_CB = makeCuboidShape(0.0F, 0.0F, 5.0F, 4.0F, 24.0F, 11.0F);

    VoxelShape CASTLE_POST_BB = makeCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_NORTH_BB_LOW = makeCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 8.0F, 3.0F);
    VoxelShape CASTLE_EAST_BB_LOW = makeCuboidShape(13.0F, 0.0F, 3.0F, 16.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_BB_LOW = makeCuboidShape(3.0F, 0.0F, 13.0F, 13.0F, 8.0F, 16.0F);
    VoxelShape CASTLE_WEST_BB_LOW = makeCuboidShape(0.0F, 0.0F, 3.0F, 3.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_NORTH_BB_TALL = makeCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 16.0F, 3.0F);
    VoxelShape CASTLE_EAST_BB_TALL = makeCuboidShape(13.0F, 0.0F, 3.0F, 16.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_BB_TALL = makeCuboidShape(3.0F, 0.0F, 13.0F, 13.0F, 16.0F, 16.0F);
    VoxelShape CASTLE_WEST_BB_TALL = makeCuboidShape(0.0F, 0.0F, 3.0F, 3.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_POST_CB = makeCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_NORTH_CB = makeCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 24.0F, 3.0F);
    VoxelShape CASTLE_EAST_CB = makeCuboidShape(13.0F, 0.0F, 3.0F, 16.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_CB = makeCuboidShape(3.0F, 0.0F, 13.0F, 13.0F, 24.0F, 16.0F);
    VoxelShape CASTLE_WEST_CB = makeCuboidShape(0.0F, 0.0F, 3.0F, 3.0F, 24.0F, 13.0F);

    VoxelShape BUILD_POST_BB = makeCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_NORTH_BB = makeCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 4.0F);
    VoxelShape BUILD_EAST_BB = makeCuboidShape(12.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    VoxelShape BUILD_SOUTH_BB = makeCuboidShape(4.0F, 0.0F, 12.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_WEST_BB = makeCuboidShape(0.0F, 0.0F, 4.0F, 4.0F, 16.0F, 12.0F);
    VoxelShape BUILD_POST_CB = makeCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_NORTH_CB = makeCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 4.0F);
    VoxelShape BUILD_EAST_CB = makeCuboidShape(12.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    VoxelShape BUILD_SOUTH_CB = makeCuboidShape(4.0F, 0.0F, 12.0F, 12.0F, 24.0F, 16.0F);
    VoxelShape BUILD_WEST_CB = makeCuboidShape(0.0F, 0.0F, 4.0F, 4.0F, 24.0F, 12.0F);



    public Wall(Properties properties) {
        super(properties);
        this.setDefaultState(stateContainer.getBaseState().with(BlockStateProperties.FACING,Direction.UP));

    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(WALL_HEIGHT_NORTH);
        builder.add(WALL_HEIGHT_EAST);
        builder.add(WALL_HEIGHT_SOUTH);
        builder.add(WALL_HEIGHT_WEST);
        builder.add(BlockStateProperties.UP);
        builder.add(BlockStateProperties.WATERLOGGED);
        builder.add(BlockStateProperties.FACING);

    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return super.getStateForPlacement(context);
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        if (getRegistryName().toString().contains("modern")) {
            if (state.getBlockState().toString().contains("north=tall")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_TALL);
                        }
                    }
                }

            }
            else if (state.getBlockState().toString().contains("north=low")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_NORTH_BB_LOW);
                        }
                    }
                }
            }
            else {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_BB,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_BB);
                        }
                    }
                }
            }
        }



        else if (getRegistryName().toString().contains("castle")) {
            if (state.getBlockState().toString().contains("north=tall")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL);
                        }
                    }
                }

            }
            else if (state.getBlockState().toString().contains("north=low")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW);
                        }
                    }
                }
            }
            else {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_BB,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_BB);
                        }
                    }
                }
            }
        }

        else if (getRegistryName().toString().contains("building")) {
            if (state.getBlockState().toString().contains("north=tall")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB);
                        }
                    }
                }

            }
            else if (state.getBlockState().toString().contains("north=low")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_EAST_BB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_NORTH_BB);
                        }
                    }
                }
            }
            else {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_EAST_BB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_SOUTH_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_SOUTH_BB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_WEST_BB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_BB,BUILD_WEST_BB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_BB);
                        }
                    }
                }
            }
        }

        else {
            return super.getShape(state, worldIn, pos, context);
        }
    }

    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {

        if (getRegistryName().toString().contains("modern")) {
            if (state.getBlockState().toString().contains("north=tall")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB);
                        }
                    }
                }

            }
            else if (state.getBlockState().toString().contains("north=low")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_EAST_CB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_NORTH_CB);
                        }
                    }
                }
            }
            else {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_EAST_CB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_SOUTH_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(MODERN_POST_CB,MODERN_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(MODERN_POST_CB);
                        }
                    }
                }
            }
        }

        else if (getRegistryName().toString().contains("castle")) {
            if (state.getBlockState().toString().contains("north=tall")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB);
                        }
                    }
                }

            }
            else if (state.getBlockState().toString().contains("north=low")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_EAST_CB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_NORTH_CB);
                        }
                    }
                }
            }
            else {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_EAST_CB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_SOUTH_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(CASTLE_POST_CB,CASTLE_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(CASTLE_POST_CB);
                        }
                    }
                }
            }
        }

        else if (getRegistryName().toString().contains("building")) {
            if (state.getBlockState().toString().contains("north=tall")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB);
                        }
                    }
                }

            }
            else if (state.getBlockState().toString().contains("north=low")) {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_EAST_CB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_NORTH_CB);
                        }
                    }
                }
            }
            else {
                if (state.getBlockState().toString().contains("east=tall")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB);
                        }
                    }
                }
                else if (state.getBlockState().toString().contains("east=low")) {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_EAST_CB);
                        }
                    }
                }
                else {
                    if (state.getBlockState().toString().contains("south=tall")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else if (state.getBlockState().toString().contains("south=low")) {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_SOUTH_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_SOUTH_CB);
                        }
                    }
                    else {
                        if (state.getBlockState().toString().contains("west=tall")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_WEST_CB);
                        }
                        else if (state.getBlockState().toString().contains("west=low")) {
                            return VoxelShapes.or(BUILD_POST_CB,BUILD_WEST_CB);
                        }
                        else {
                            return VoxelShapes.or(BUILD_POST_CB);
                        }
                    }
                }
            }
        }

        else {
            return super.getCollisionShape(state, worldIn, pos, context);
        }
    }

}


