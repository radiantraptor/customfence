package com.raptor.customfence_fabric.blocks;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.*;
import net.minecraft.block.enums.WallShape;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.Map;

public class Wall extends WallBlock {

    VoxelShape MODERN_POST_BB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape MODERN_NORTH_BB_LOW = Block.createCuboidShape(5.0F, 0.0F, 0.0F, 11.0F, 15.0F, 11.0F);
    VoxelShape MODERN_EAST_BB_LOW = Block.createCuboidShape(5.0F, 0.0F, 5.0F, 16.0F, 15.0F, 11.0F);
    VoxelShape MODERN_SOUTH_BB_LOW = Block.createCuboidShape(5.0F, 0.0F, 5.0F, 11.0F, 15.0F, 16.0F);
    VoxelShape MODERN_WEST_BB_LOW = Block.createCuboidShape(0.0F, 0.0F, 5.0F, 11.0F, 15.0F, 11.0F);
    VoxelShape MODERN_NORTH_BB_TALL = Block.createCuboidShape(5.0F, 0.0F, 0.0F, 11.0F, 16.0F, 11.0F);
    VoxelShape MODERN_EAST_BB_TALL = Block.createCuboidShape(5.0F, 0.0F, 5.0F, 16.0F, 16.0F, 11.0F);
    VoxelShape MODERN_SOUTH_BB_TALL = Block.createCuboidShape(5.0F, 0.0F, 5.0F, 11.0F, 16.0F, 16.0F);
    VoxelShape MODERN_WEST_BB_TALL = Block.createCuboidShape(0.0F, 0.0F, 5.0F, 11.0F, 16.0F, 11.0F);

    VoxelShape MODERN_POST_CB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape MODERN_NORTH_CB_LOW = Block.createCuboidShape(5.0F, 0.0F, 0.0F, 11.0F, 24.0F, 11.0F);
    VoxelShape MODERN_EAST_CB_LOW = Block.createCuboidShape(5.0F, 0.0F, 5.0F, 16.0F, 24.0F, 11.0F);
    VoxelShape MODERN_SOUTH_CB_LOW = Block.createCuboidShape(5.0F, 0.0F, 5.0F, 11.0F, 24.0F, 16.0F);
    VoxelShape MODERN_WEST_CB_LOW = Block.createCuboidShape(0.0F, 0.0F, 5.0F, 11.0F, 24.0F, 11.0F);
    VoxelShape MODERN_NORTH_CB_TALL = Block.createCuboidShape(5.0F, 0.0F, 0.0F, 11.0F, 24.0F, 11.0F);
    VoxelShape MODERN_EAST_CB_TALL = Block.createCuboidShape(5.0F, 0.0F, 5.0F, 16.0F, 24.0F, 11.0F);
    VoxelShape MODERN_SOUTH_CB_TALL = Block.createCuboidShape(5.0F, 0.0F, 5.0F, 11.0F, 24.0F, 16.0F);
    VoxelShape MODERN_WEST_CB_TALL = Block.createCuboidShape(0.0F, 0.0F, 5.0F, 11.0F, 24.0F, 11.0F);


    VoxelShape CASTLE_POST_BB = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_NORTH_BB_LOW = Block.createCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_EAST_BB_LOW = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 16.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_BB_LOW = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 8.0F, 16.0F);
    VoxelShape CASTLE_WEST_BB_LOW = Block.createCuboidShape(0.0F, 0.0F, 3.0F, 13.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_NORTH_BB_TALL = Block.createCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_EAST_BB_TALL = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 16.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_BB_TALL = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 16.0F, 16.0F);
    VoxelShape CASTLE_WEST_BB_TALL = Block.createCuboidShape(0.0F, 0.0F, 3.0F, 13.0F, 16.0F, 13.0F);

    VoxelShape CASTLE_POST_CB = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_NORTH_CB_LOW = Block.createCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_EAST_CB_LOW = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 16.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_CB_LOW = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 8.0F, 16.0F);
    VoxelShape CASTLE_WEST_CB_LOW = Block.createCuboidShape(0.0F, 0.0F, 3.0F, 13.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_NORTH_CB_TALL = Block.createCuboidShape(3.0F, 0.0F, 0.0F, 13.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_EAST_CB_TALL = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 16.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_CB_TALL = Block.createCuboidShape(3.0F, 0.0F, 3.0F, 13.0F, 24.0F, 16.0F);
    VoxelShape CASTLE_WEST_CB_TALL = Block.createCuboidShape(0.0F, 0.0F, 3.0F, 13.0F, 24.0F, 13.0F);


    VoxelShape BUILD_POST_BB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_NORTH_BB_LOW = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_EAST_BB_LOW = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    VoxelShape BUILD_SOUTH_BB_LOW = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_WEST_BB_LOW = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_NORTH_BB_TALL = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_EAST_BB_TALL = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    VoxelShape BUILD_SOUTH_BB_TALL = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_WEST_BB_TALL = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);

    VoxelShape BUILD_POST_CB = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_NORTH_CB_LOW = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_EAST_CB_LOW = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    VoxelShape BUILD_SOUTH_CB_LOW = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 16.0F);
    VoxelShape BUILD_WEST_CB_LOW = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_NORTH_CB_TALL = Block.createCuboidShape(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_EAST_CB_TALL = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    VoxelShape BUILD_SOUTH_CB_TALL = Block.createCuboidShape(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 16.0F);
    VoxelShape BUILD_WEST_CB_TALL = Block.createCuboidShape(0.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);

    public static EnumProperty<WallShape> NORTH_WALL = NORTH_SHAPE;
    public static EnumProperty<WallShape> EAST_WALL = EAST_SHAPE;
    public static EnumProperty<WallShape> SOUTH_WALL = SOUTH_SHAPE;
    public static EnumProperty<WallShape> WEST_WALL = WEST_SHAPE;
    public final Map<BlockState, VoxelShape> modernShape;
    public final Map<BlockState, VoxelShape> castleShape;
    public final Map<BlockState, VoxelShape> buildShape;
    public final Map<BlockState, VoxelShape> modernCollisionShape;
    public final Map<BlockState, VoxelShape> castleCollisionShape;
    public final Map<BlockState, VoxelShape> buildCollisionShape;

    public Wall(Settings setting) {
        super(setting);
        this.modernShape = this.makeShapes(MODERN_POST_BB, MODERN_NORTH_BB_LOW, MODERN_EAST_BB_LOW, MODERN_SOUTH_BB_LOW, MODERN_WEST_BB_LOW, MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL, MODERN_SOUTH_BB_TALL, MODERN_WEST_BB_TALL);
        this.modernCollisionShape = this.makeShapes(MODERN_POST_CB, MODERN_NORTH_CB_LOW, MODERN_EAST_CB_LOW, MODERN_SOUTH_CB_LOW, MODERN_WEST_CB_LOW, MODERN_NORTH_CB_TALL,MODERN_EAST_CB_TALL, MODERN_SOUTH_CB_TALL, MODERN_WEST_CB_TALL);

        this.castleShape = this.makeShapes(CASTLE_POST_BB, CASTLE_NORTH_BB_LOW, CASTLE_EAST_BB_LOW, CASTLE_SOUTH_BB_LOW, CASTLE_WEST_BB_LOW, CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL, CASTLE_SOUTH_BB_TALL, CASTLE_WEST_BB_TALL);
        this.castleCollisionShape = this.makeShapes(CASTLE_POST_CB, CASTLE_NORTH_CB_LOW, CASTLE_EAST_CB_LOW, CASTLE_SOUTH_CB_LOW, CASTLE_WEST_CB_LOW, CASTLE_NORTH_CB_TALL,CASTLE_EAST_CB_TALL, CASTLE_SOUTH_CB_TALL, CASTLE_WEST_CB_TALL);

        this.buildShape = this.makeShapes(BUILD_POST_BB, BUILD_NORTH_BB_LOW, BUILD_EAST_BB_LOW, BUILD_SOUTH_BB_LOW, BUILD_WEST_BB_LOW, BUILD_NORTH_BB_TALL,BUILD_EAST_BB_TALL, BUILD_SOUTH_BB_TALL, BUILD_WEST_BB_TALL);
        this.buildCollisionShape = this.makeShapes(BUILD_POST_CB, BUILD_NORTH_CB_LOW, BUILD_EAST_CB_LOW, BUILD_SOUTH_CB_LOW, BUILD_WEST_CB_LOW, BUILD_NORTH_CB_TALL,BUILD_EAST_CB_TALL, BUILD_SOUTH_CB_TALL, BUILD_WEST_CB_TALL);

    }


    public Map<BlockState, VoxelShape> makeShapes(VoxelShape post, VoxelShape north_low, VoxelShape east_low, VoxelShape south_low, VoxelShape west_low, VoxelShape north_tall, VoxelShape east_tall, VoxelShape south_tall, VoxelShape west_tall) {
        ImmutableMap.Builder<BlockState, VoxelShape> builder = ImmutableMap.builder();
        for(Boolean is_up : UP.getValues()) {
            for (WallShape wall_north : NORTH_WALL.getValues()) {
                for (WallShape wall_east : EAST_WALL.getValues()) {
                    for (WallShape wall_south : SOUTH_WALL.getValues()) {
                        for (WallShape wall_west : WEST_WALL.getValues()) {

                            VoxelShape shape = post;
                            if (wall_north == WallShape.TALL) {
                                shape = VoxelShapes.union(shape, north_tall);
                            }
                            if (wall_north == WallShape.LOW) {
                                shape = VoxelShapes.union(shape, north_low);
                            }
                            if (wall_east == WallShape.TALL) {
                                shape = VoxelShapes.union(shape, east_tall);
                            }
                            if (wall_east == WallShape.LOW) {
                                shape = VoxelShapes.union(shape, east_low);
                            }
                            if (wall_south == WallShape.TALL) {
                                shape = VoxelShapes.union(shape, south_tall);
                            }
                            if (wall_south == WallShape.LOW) {
                                shape = VoxelShapes.union(shape, south_low);
                            }
                            if (wall_west == WallShape.TALL) {
                                shape = VoxelShapes.union(shape, west_tall);
                            }
                            if (wall_west == WallShape.LOW) {
                                shape = VoxelShapes.union(shape, west_low);
                            }
                            BlockState state = this.getDefaultState().with(UP, is_up).with(NORTH_WALL, wall_north).with(EAST_WALL, wall_east).with(SOUTH_WALL, wall_south).with(WEST_WALL, wall_west);
                            builder.put(state.with(WATERLOGGED, Boolean.valueOf(false)), shape);
                            builder.put(state.with(WATERLOGGED, Boolean.valueOf(true)), shape);
                        }
                    }
                }
            }
        }
        return builder.build();
    }


    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.toString().contains("modern")) {
            return this.modernShape.get(state);
        }
        else if (state.toString().contains("castle")) {
            return this.castleShape.get(state);
        }
        else {
            return this.buildShape.get(state);
        }
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.toString().contains("modern")) {
            return this.modernCollisionShape.get(state);
        }
        else if (state.toString().contains("castle")) {
            return this.castleCollisionShape.get(state);
        }
        else {
            return this.buildCollisionShape.get(state);
        }
    }


}


