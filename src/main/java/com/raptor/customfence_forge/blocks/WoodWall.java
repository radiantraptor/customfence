package com.raptor.customfence_forge.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CrossCollisionBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.antlr.v4.runtime.Vocabulary;

import java.util.Map;

public class WoodWall extends FenceBlock {

    VoxelShape BUILD_POST_BB = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_NORTH_BB = Block.box(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    VoxelShape BUILD_EAST_BB = Block.box(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    VoxelShape BUILD_SOUTH_BB = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    VoxelShape BUILD_WEST_BB = Block.box(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);

    VoxelShape BUILD_POST_CB = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_NORTH_CB = Block.box(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 12.0F);
    VoxelShape BUILD_EAST_CB = Block.box(4.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    VoxelShape BUILD_SOUTH_CB = Block.box(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 16.0F);
    VoxelShape BUILD_WEST_CB = Block.box(0.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);

    //public final VoxelShape buildShape;
    //public final VoxelShape buildCollisionShape;
    //public final VoxelShape[] occlusionByIndex;

    public WoodWall(BlockBehaviour.Properties properties) {
        super(properties);
        //this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, Boolean.valueOf(false)).setValue(EAST, Boolean.valueOf(false)).setValue(SOUTH, Boolean.valueOf(false)).setValue(WEST, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)));
        //this.buildShape = makeShapes(BUILD_POST_BB, BUILD_NORTH_BB, BUILD_EAST_BB, BUILD_SOUTH_BB, BUILD_WEST_BB);
        //this.buildCollisionShape = this.makeShapes(BUILD_POST_CB, BUILD_NORTH_CB, BUILD_EAST_CB, BUILD_SOUTH_CB, BUILD_WEST_CB);
        //this.occlusionByIndex = this.makeShapes(4.0F, 4.0F, 16.0F, 0.0F, 16.0F);
    }

    public VoxelShape makebuildShapes (BlockState state, VoxelShape post, VoxelShape north, VoxelShape east, VoxelShape south, VoxelShape west) {
        VoxelShape shape = post;
        if (state.toString().contains("north=true")) {
            shape = Shapes.or(shape, north);
        }
        if (state.toString().contains("east=true")) {
            shape = Shapes.or(shape, east);
        }
        if (state.toString().contains("south=true")) {
            shape = Shapes.or(shape, south);
        }
        if (state.toString().contains("west=true")) {
            shape = Shapes.or(shape, west);
        }
        return shape;
    }

    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        VoxelShape shape = Shapes.empty();
        shape = makebuildShapes(state, BUILD_POST_BB, BUILD_NORTH_BB, BUILD_EAST_BB, BUILD_SOUTH_BB, BUILD_WEST_BB);
        return shape;
    }

    public VoxelShape getCollisionShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        VoxelShape shape = Shapes.empty();
        shape = makebuildShapes(state, BUILD_POST_CB, BUILD_NORTH_CB, BUILD_EAST_CB, BUILD_SOUTH_CB, BUILD_WEST_CB);
        return shape;
    }



}


