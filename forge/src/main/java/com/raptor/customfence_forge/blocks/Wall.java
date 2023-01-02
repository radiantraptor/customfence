package com.raptor.customfence_forge.blocks;

import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;

public class Wall extends WallBlock {

    VoxelShape MODERN_POST_BB = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape MODERN_NORTH_BB_LOW = Block.box(5.0F, 0.0F, 0.0F, 11.0F, 15.0F, 11.0F);
    VoxelShape MODERN_EAST_BB_LOW = Block.box(5.0F, 0.0F, 5.0F, 16.0F, 15.0F, 11.0F);
    VoxelShape MODERN_SOUTH_BB_LOW = Block.box(5.0F, 0.0F, 5.0F, 11.0F, 15.0F, 16.0F);
    VoxelShape MODERN_WEST_BB_LOW = Block.box(0.0F, 0.0F, 5.0F, 11.0F, 15.0F, 11.0F);
    VoxelShape MODERN_NORTH_BB_TALL = Block.box(5.0F, 0.0F, 0.0F, 11.0F, 16.0F, 11.0F);
    VoxelShape MODERN_EAST_BB_TALL = Block.box(5.0F, 0.0F, 5.0F, 16.0F, 16.0F, 11.0F);
    VoxelShape MODERN_SOUTH_BB_TALL = Block.box(5.0F, 0.0F, 5.0F, 11.0F, 16.0F, 16.0F);
    VoxelShape MODERN_WEST_BB_TALL = Block.box(0.0F, 0.0F, 5.0F, 11.0F, 16.0F, 11.0F);

    VoxelShape MODERN_POST_CB = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape MODERN_NORTH_CB_LOW = Block.box(5.0F, 0.0F, 0.0F, 11.0F, 24.0F, 11.0F);
    VoxelShape MODERN_EAST_CB_LOW = Block.box(5.0F, 0.0F, 5.0F, 16.0F, 24.0F, 11.0F);
    VoxelShape MODERN_SOUTH_CB_LOW = Block.box(5.0F, 0.0F, 5.0F, 11.0F, 24.0F, 16.0F);
    VoxelShape MODERN_WEST_CB_LOW = Block.box(0.0F, 0.0F, 5.0F, 11.0F, 24.0F, 11.0F);
    VoxelShape MODERN_NORTH_CB_TALL = Block.box(5.0F, 0.0F, 0.0F, 11.0F, 24.0F, 11.0F);
    VoxelShape MODERN_EAST_CB_TALL = Block.box(5.0F, 0.0F, 5.0F, 16.0F, 24.0F, 11.0F);
    VoxelShape MODERN_SOUTH_CB_TALL = Block.box(5.0F, 0.0F, 5.0F, 11.0F, 24.0F, 16.0F);
    VoxelShape MODERN_WEST_CB_TALL = Block.box(0.0F, 0.0F, 5.0F, 11.0F, 24.0F, 11.0F);


    VoxelShape CASTLE_POST_BB = Block.box(3.0F, 0.0F, 3.0F, 13.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_NORTH_BB_LOW = Block.box(3.0F, 0.0F, 0.0F, 13.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_EAST_BB_LOW = Block.box(3.0F, 0.0F, 3.0F, 16.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_BB_LOW = Block.box(3.0F, 0.0F, 3.0F, 13.0F, 8.0F, 16.0F);
    VoxelShape CASTLE_WEST_BB_LOW = Block.box(0.0F, 0.0F, 3.0F, 13.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_NORTH_BB_TALL = Block.box(3.0F, 0.0F, 0.0F, 13.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_EAST_BB_TALL = Block.box(3.0F, 0.0F, 3.0F, 16.0F, 16.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_BB_TALL = Block.box(3.0F, 0.0F, 3.0F, 13.0F, 16.0F, 16.0F);
    VoxelShape CASTLE_WEST_BB_TALL = Block.box(0.0F, 0.0F, 3.0F, 13.0F, 16.0F, 13.0F);

    VoxelShape CASTLE_POST_CB = Block.box(3.0F, 0.0F, 3.0F, 13.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_NORTH_CB_LOW = Block.box(3.0F, 0.0F, 0.0F, 13.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_EAST_CB_LOW = Block.box(3.0F, 0.0F, 3.0F, 16.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_CB_LOW = Block.box(3.0F, 0.0F, 3.0F, 13.0F, 8.0F, 16.0F);
    VoxelShape CASTLE_WEST_CB_LOW = Block.box(0.0F, 0.0F, 3.0F, 13.0F, 8.0F, 13.0F);
    VoxelShape CASTLE_NORTH_CB_TALL = Block.box(3.0F, 0.0F, 0.0F, 13.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_EAST_CB_TALL = Block.box(3.0F, 0.0F, 3.0F, 16.0F, 24.0F, 13.0F);
    VoxelShape CASTLE_SOUTH_CB_TALL = Block.box(3.0F, 0.0F, 3.0F, 13.0F, 24.0F, 16.0F);
    VoxelShape CASTLE_WEST_CB_TALL = Block.box(0.0F, 0.0F, 3.0F, 13.0F, 24.0F, 13.0F);


    VoxelShape BUILD_POST_BB = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_NORTH_BB_LOW = Block.box(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_EAST_BB_LOW = Block.box(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    VoxelShape BUILD_SOUTH_BB_LOW = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_WEST_BB_LOW = Block.box(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_NORTH_BB_TALL = Block.box(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_EAST_BB_TALL = Block.box(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    VoxelShape BUILD_SOUTH_BB_TALL = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_WEST_BB_TALL = Block.box(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);

    VoxelShape BUILD_POST_CB = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_NORTH_CB_LOW = Block.box(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_EAST_CB_LOW = Block.box(4.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    VoxelShape BUILD_SOUTH_CB_LOW = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 16.0F);
    VoxelShape BUILD_WEST_CB_LOW = Block.box(0.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_NORTH_CB_TALL = Block.box(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_EAST_CB_TALL = Block.box(4.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    VoxelShape BUILD_SOUTH_CB_TALL = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 16.0F);
    VoxelShape BUILD_WEST_CB_TALL = Block.box(0.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);

    public static EnumProperty<WallSide> NORTH_WALL = BlockStateProperties.NORTH_WALL;
    public static EnumProperty<WallSide> EAST_WALL = BlockStateProperties.EAST_WALL;
    public static EnumProperty<WallSide> SOUTH_WALL = BlockStateProperties.SOUTH_WALL;
    public static EnumProperty<WallSide> WEST_WALL = BlockStateProperties.WEST_WALL;
    public final Map<BlockState, VoxelShape> modernShape;
    public final Map<BlockState, VoxelShape> castleShape;
    public final Map<BlockState, VoxelShape> buildShape;
    public final Map<BlockState, VoxelShape> modernCollisionShape;
    public final Map<BlockState, VoxelShape> castleCollisionShape;
    public final Map<BlockState, VoxelShape> buildCollisionShape;

    public Wall(Properties properties) {
        super(properties);

        this.modernShape = this.makeShapes(MODERN_POST_BB, MODERN_NORTH_BB_LOW, MODERN_EAST_BB_LOW, MODERN_SOUTH_BB_LOW, MODERN_WEST_BB_LOW, MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL, MODERN_SOUTH_BB_TALL, MODERN_WEST_BB_TALL);
        this.modernCollisionShape = this.makeShapes(MODERN_POST_CB, MODERN_NORTH_CB_LOW, MODERN_EAST_CB_LOW, MODERN_SOUTH_CB_LOW, MODERN_WEST_CB_LOW, MODERN_NORTH_CB_TALL,MODERN_EAST_CB_TALL, MODERN_SOUTH_CB_TALL, MODERN_WEST_CB_TALL);

        this.castleShape = this.makeShapes(CASTLE_POST_BB, CASTLE_NORTH_BB_LOW, CASTLE_EAST_BB_LOW, CASTLE_SOUTH_BB_LOW, CASTLE_WEST_BB_LOW, CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL, CASTLE_SOUTH_BB_TALL, CASTLE_WEST_BB_TALL);
        this.castleCollisionShape = this.makeShapes(CASTLE_POST_CB, CASTLE_NORTH_CB_LOW, CASTLE_EAST_CB_LOW, CASTLE_SOUTH_CB_LOW, CASTLE_WEST_CB_LOW, CASTLE_NORTH_CB_TALL,CASTLE_EAST_CB_TALL, CASTLE_SOUTH_CB_TALL, CASTLE_WEST_CB_TALL);

        this.buildShape = this.makeShapes(BUILD_POST_BB, BUILD_NORTH_BB_LOW, BUILD_EAST_BB_LOW, BUILD_SOUTH_BB_LOW, BUILD_WEST_BB_LOW, BUILD_NORTH_BB_TALL,BUILD_EAST_BB_TALL, BUILD_SOUTH_BB_TALL, BUILD_WEST_BB_TALL);
        this.buildCollisionShape = this.makeShapes(BUILD_POST_CB, BUILD_NORTH_CB_LOW, BUILD_EAST_CB_LOW, BUILD_SOUTH_CB_LOW, BUILD_WEST_CB_LOW, BUILD_NORTH_CB_TALL,BUILD_EAST_CB_TALL, BUILD_SOUTH_CB_TALL, BUILD_WEST_CB_TALL);
    }

    public Map<BlockState, VoxelShape> makeShapes(VoxelShape post, VoxelShape north_low, VoxelShape east_low, VoxelShape south_low, VoxelShape west_low, VoxelShape north_tall, VoxelShape east_tall, VoxelShape south_tall, VoxelShape west_tall) {
        ImmutableMap.Builder<BlockState, VoxelShape> builder = ImmutableMap.builder();
        for(Boolean is_up : UP.getPossibleValues()) {
            for (WallSide wall_north : NORTH_WALL.getPossibleValues()) {
                for (WallSide wall_east : EAST_WALL.getPossibleValues()) {
                    for (WallSide wall_south : SOUTH_WALL.getPossibleValues()) {
                        for (WallSide wall_west : WEST_WALL.getPossibleValues()) {

                            VoxelShape shape = post;
                            if (wall_north == WallSide.TALL) {
                                shape = Shapes.or(shape, north_tall);
                            }
                            if (wall_north == WallSide.LOW) {
                                shape = Shapes.or(shape, north_low);
                            }
                            if (wall_east == WallSide.TALL) {
                                shape = Shapes.or(shape, east_tall);
                            }
                            if (wall_east == WallSide.LOW) {
                                shape = Shapes.or(shape, east_low);
                            }
                            if (wall_south == WallSide.TALL) {
                                shape = Shapes.or(shape, south_tall);
                            }
                            if (wall_south == WallSide.LOW) {
                                shape = Shapes.or(shape, south_low);
                            }
                            if (wall_west == WallSide.TALL) {
                                shape = Shapes.or(shape, west_tall);
                            }
                            if (wall_west == WallSide.LOW) {
                                shape = Shapes.or(shape, west_low);
                            }
                            BlockState state = this.defaultBlockState().setValue(UP, is_up).setValue(NORTH_WALL, wall_north).setValue(EAST_WALL, wall_east).setValue(SOUTH_WALL, wall_south).setValue(WEST_WALL, wall_west);
                            builder.put(state.setValue(WATERLOGGED, Boolean.valueOf(false)), shape);
                            builder.put(state.setValue(WATERLOGGED, Boolean.valueOf(true)), shape);
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        if (getName().toString().contains("modern")) {
            return this.modernShape.get(state);
        }
        else if (getName().toString().contains("castle")) {
            return this.castleShape.get(state);
        }
        else {
            return this.buildShape.get(state);
        }
    }

    public VoxelShape getCollisionShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        if (getName().toString().contains("modern")) {
            return this.modernCollisionShape.get(state);
        }
        else if (getName().toString().contains("castle")) {
            return this.castleCollisionShape.get(state);
        }
        else {
            return this.buildCollisionShape.get(state);
        }
    }

}


