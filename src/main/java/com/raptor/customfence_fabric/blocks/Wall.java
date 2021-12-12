package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.init.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Properties;

public class Wall extends WallBlock {

    VoxelShape MODERN_POST_BB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape MODERN_NORTH_BB_LOW = Block.createCuboidShape(5.0F, 0.0F, 0.0F, 11.0F, 15.0F, 4.0F);
    VoxelShape MODERN_EAST_BB_LOW = Block.createCuboidShape(12.0F, 0.0F, 5.0F, 16.0F, 15.0F, 11.0F);
    VoxelShape MODERN_SOUTH_BB_LOW = Block.createCuboidShape(5.0F, 0.0F, 12.0F, 11.0F, 15.0F, 16.0F);
    VoxelShape MODERN_WEST_BB_LOW = Block.createCuboidShape(0.0F, 0.0F, 5.0F, 4.0F, 15.0F, 11.0F);
    VoxelShape MODERN_NORTH_BB_TALL = Block.createCuboidShape(5.0F, 0.0F, 0.0F, 11.0F, 16.0F, 4.0F);
    VoxelShape MODERN_EAST_BB_TALL = Block.createCuboidShape(12.0F, 0.0F, 5.0F, 16.0F, 16.0F, 11.0F);
    VoxelShape MODERN_SOUTH_BB_TALL = Block.createCuboidShape(5.0F, 0.0F, 12.0F, 11.0F, 16.0F, 16.0F);
    VoxelShape MODERN_WEST_BB_TALL = Block.createCuboidShape(0.0F, 0.0F, 5.0F, 4.0F, 16.0F, 11.0F);
    VoxelShape MODERN_POST_NORTH_SOUTH_CB = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 16.0F);
    VoxelShape MODERN_POST_EAST_WEST_CB = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);

    VoxelShape CASTLE_POST_BB = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_NORTH_BB_LOW = Block.createCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 8.0F, 3.0F);
    VoxelShape CASTLE_EAST_BB_LOW = Block.createCuboidShape(13.0F, 0.0F, 3.0F, 16.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_BB_LOW = Block.createCuboidShape(3.0F, 0.0F, 13.0F, 13.0F, 8.0F, 16.0F);
    VoxelShape CASTLE_WEST_BB_LOW = Block.createCuboidShape(0.0F, 0.0F, 3.0F, 3.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_NORTH_BB_TALL = Block.createCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 16.0F, 3.0F);
    VoxelShape CASTLE_EAST_BB_TALL = Block.createCuboidShape(13.0F, 0.0F, 3.0F, 16.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_BB_TALL = Block.createCuboidShape(3.0F, 0.0F, 13.0F, 13.0F, 16.0F, 16.0F);
    VoxelShape CASTLE_WEST_BB_TALL = Block.createCuboidShape(0.0F, 0.0F, 3.0F, 3.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_POST_CB = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_NORTH_CB = Block.createCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 24.0F, 3.0F);
    VoxelShape CASTLE_EAST_CB = Block.createCuboidShape(13.0F, 0.0F, 3.0F, 16.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_CB = Block.createCuboidShape(3.0F, 0.0F, 13.0F, 13.0F, 24.0F, 16.0F);
    VoxelShape CASTLE_WEST_CB = Block.createCuboidShape(0.0F, 0.0F, 3.0F, 3.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_POST_NORTH_CB = Block.createCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_POST_EAST_CB = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 16.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_POST_SOUTH_CB = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 24.0F, 16.0F);
    VoxelShape CASTLE_POST_WEST_CB = Block.createCuboidShape(0.0F, 0.0F, 3.0F, 13.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_POST_NORTH_SOUTH_CB = Block.createCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 24.0F, 16.0F);
    VoxelShape CASTLE_POST_EAST_WEST_CB = Block.createCuboidShape(0.0F, 0.0F, 3.0F, 16.0F, 24.0F, 13.0F);

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


    public Wall(Settings setting) {
        super(setting);

    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.toString().contains("modern")) {
            if (state.toString().contains("north=tall")) {
                if (state.toString().contains("east=tall")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.toString().contains("east=low")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_TALL);
                        }
                    }
                }

            }
            else if (state.toString().contains("north=low")) {
                if (state.toString().contains("east=tall")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.toString().contains("east=low")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_NORTH_BB_LOW);
                        }
                    }
                }
            }
            else {
                if (state.toString().contains("east=tall")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.toString().contains("east=low")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_SOUTH_BB_TALL,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_SOUTH_BB_LOW,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(MODERN_POST_BB,MODERN_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(MODERN_POST_BB);
                        }
                    }
                }
            }
        }

        else if (state.toString().contains("building")) {
            if (state.toString().contains("north=none")) {
                if (state.toString().contains("east=none")) {
                    if (state.toString().contains("south=none")) {
                        if (state.toString().contains("west=none")) {
                            return BUILD_POST_BB;
                        } else {
                            return BUILD_POST_WEST_BB;
                        }
                    } else {
                        if (state.toString().contains("west=none")) {
                            return BUILD_POST_SOUTH_BB;
                        } else {
                            return VoxelShapes.union(BUILD_POST_SOUTH_BB, BUILD_WEST_BB);
                        }
                    }
                } else {
                    if (state.toString().contains("south=none")) {
                        if (state.toString().contains("west=none")) {
                            return BUILD_POST_EAST_BB;
                        } else {
                            return BUILD_POST_EAST_WEST_BB;
                        }
                    } else {
                        if (state.toString().contains("west=none")) {
                            return VoxelShapes.union(BUILD_POST_EAST_BB, BUILD_SOUTH_BB);
                        } else {
                            return VoxelShapes.union(BUILD_POST_EAST_WEST_BB, BUILD_SOUTH_BB);
                        }
                    }
                }
            } else {
                if (state.toString().contains("east=none")) {
                    if (state.toString().contains("south=none")) {
                        if (state.toString().contains("west=none")) {
                            return BUILD_POST_NORTH_BB;
                        } else {
                            return VoxelShapes.union(BUILD_POST_NORTH_BB, BUILD_WEST_BB);
                        }
                    } else {
                        if (state.toString().contains("west=none")) {
                            return BUILD_POST_NORTH_SOUTH_BB;
                        } else {
                            return VoxelShapes.union(BUILD_POST_NORTH_SOUTH_BB, BUILD_WEST_BB);
                        }
                    }
                } else {
                    if (state.toString().contains("south=none")) {
                        if (state.toString().contains("west=none")) {
                            return VoxelShapes.union(BUILD_POST_NORTH_BB, BUILD_EAST_BB);
                        } else {
                            return VoxelShapes.union(BUILD_POST_EAST_WEST_BB, BUILD_NORTH_BB);
                        }
                    } else {
                        if (state.toString().contains("west=none")) {
                            return VoxelShapes.union(BUILD_POST_NORTH_SOUTH_BB, BUILD_EAST_BB);
                        } else {
                            return VoxelShapes.union(BUILD_POST_NORTH_SOUTH_BB, BUILD_EAST_BB, BUILD_WEST_BB);
                        }
                    }
                }
            }
        }

        else if (state.toString().contains("castle")) {
            if (state.toString().contains("north=tall")) {
                if (state.toString().contains("east=tall")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.toString().contains("east=low")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_TALL);
                        }
                    }
                }

            }
            else if (state.toString().contains("north=low")) {
                if (state.toString().contains("east=tall")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.toString().contains("east=low")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_NORTH_BB_LOW);
                        }
                    }
                }
            }
            else {
                if (state.toString().contains("east=tall")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_TALL);
                        }
                    }
                }
                else if (state.toString().contains("east=low")) {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_EAST_BB_LOW);
                        }
                    }
                }
                else {
                    if (state.toString().contains("south=tall")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_SOUTH_BB_TALL,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_SOUTH_BB_TALL);
                        }
                    }
                    else if (state.toString().contains("south=low")) {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_SOUTH_BB_LOW,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_SOUTH_BB_LOW);
                        }
                    }
                    else {
                        if (state.toString().contains("west=tall")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_WEST_BB_TALL);
                        }
                        else if (state.toString().contains("west=low")) {
                            return VoxelShapes.union(CASTLE_POST_BB,CASTLE_WEST_BB_LOW);
                        }
                        else {
                            return VoxelShapes.union(CASTLE_POST_BB);
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

        if (state.toString().contains("modern")) {
            if (!state.toString().contains("north=none") && state.toString().contains("east=none") && !state.toString().contains("south=none") && state.toString().contains("west=none") ) {
                return MODERN_POST_NORTH_SOUTH_CB;
            }
            else if (state.toString().contains("north=none") && !state.toString().contains("east=none") && state.toString().contains("south=none") && !state.toString().contains("west=none")) {
                return MODERN_POST_EAST_WEST_CB;
            }
            else {
                return super.getCollisionShape(state, world, pos, context);
            }
        }
        else if (state.toString().contains("building")) {
            if (!state.toString().contains("north=none") && state.toString().contains("east=none") && !state.toString().contains("south=none") && state.toString().contains("west=none") ) {
                return BUILD_POST_NORTH_SOUTH_CB;
            }
            else if (state.toString().contains("north=none") && !state.toString().contains("east=none") && state.toString().contains("south=none") && !state.toString().contains("west=none")) {
                return BUILD_POST_EAST_WEST_CB;
            }
            else {
                return super.getCollisionShape(state, world, pos, context);
            }
        }
        else if (state.toString().contains("castle")) {
            if (state.toString().contains("north=none")) {
                if (state.toString().contains("east=none")) {
                    if (state.toString().contains("south=none")) {
                        if (state.toString().contains("west=none")) {
                            return CASTLE_POST_CB;
                        } else {
                            return CASTLE_POST_WEST_CB;
                        }
                    } else {
                        if (state.toString().contains("west=none")) {
                            return CASTLE_POST_SOUTH_CB;
                        } else {
                            return VoxelShapes.union(CASTLE_POST_SOUTH_CB, CASTLE_WEST_CB);
                        }
                    }
                } else {
                    if (state.toString().contains("south=none")) {
                        if (state.toString().contains("west=none")) {
                            return CASTLE_POST_EAST_CB;
                        } else {
                            return CASTLE_POST_EAST_WEST_CB;
                        }
                    } else {
                        if (state.toString().contains("west=none")) {
                            return VoxelShapes.union(CASTLE_POST_EAST_CB, CASTLE_SOUTH_CB);
                        } else {
                            return VoxelShapes.union(CASTLE_POST_EAST_WEST_CB, CASTLE_SOUTH_CB);
                        }
                    }
                }
            } else {
                if (state.toString().contains("east=none")) {
                    if (state.toString().contains("south=none")) {
                        if (state.toString().contains("west=none")) {
                            return CASTLE_POST_NORTH_CB;
                        } else {
                            return VoxelShapes.union(CASTLE_POST_NORTH_CB, CASTLE_WEST_CB);
                        }
                    } else {
                        if (state.toString().contains("west=none")) {
                            return CASTLE_POST_NORTH_SOUTH_CB;
                        } else {
                            return VoxelShapes.union(CASTLE_POST_NORTH_SOUTH_CB, CASTLE_WEST_CB);
                        }
                    }
                } else {
                    if (state.toString().contains("south=none")) {
                        if (state.toString().contains("west=none")) {
                            return VoxelShapes.union(CASTLE_POST_NORTH_CB, CASTLE_EAST_CB);
                        } else {
                            return VoxelShapes.union(CASTLE_POST_EAST_WEST_CB, CASTLE_NORTH_CB);
                        }
                    } else {
                        if (state.toString().contains("west=none")) {
                            return VoxelShapes.union(CASTLE_POST_NORTH_SOUTH_CB, CASTLE_EAST_CB);
                        } else {
                            return VoxelShapes.union(CASTLE_POST_NORTH_SOUTH_CB, CASTLE_EAST_CB, CASTLE_WEST_CB);
                        }
                    }
                }
            }
        }
        else {
            return super.getCollisionShape(state, world, pos, context);
        }
    }


}


