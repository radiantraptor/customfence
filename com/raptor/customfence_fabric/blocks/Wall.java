package com.raptor.customfence_fabric.blocks;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.*;
import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2544;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2754;
import net.minecraft.class_3726;
import net.minecraft.class_4778;
import java.util.Map;

public class Wall extends class_2544 {

    class_265 MODERN_POST_BB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    class_265 MODERN_NORTH_BB_LOW = class_2248.method_9541(5.0F, 0.0F, 0.0F, 11.0F, 15.0F, 11.0F);
    class_265 MODERN_EAST_BB_LOW = class_2248.method_9541(5.0F, 0.0F, 5.0F, 16.0F, 15.0F, 11.0F);
    class_265 MODERN_SOUTH_BB_LOW = class_2248.method_9541(5.0F, 0.0F, 5.0F, 11.0F, 15.0F, 16.0F);
    class_265 MODERN_WEST_BB_LOW = class_2248.method_9541(0.0F, 0.0F, 5.0F, 11.0F, 15.0F, 11.0F);
    class_265 MODERN_NORTH_BB_TALL = class_2248.method_9541(5.0F, 0.0F, 0.0F, 11.0F, 16.0F, 11.0F);
    class_265 MODERN_EAST_BB_TALL = class_2248.method_9541(5.0F, 0.0F, 5.0F, 16.0F, 16.0F, 11.0F);
    class_265 MODERN_SOUTH_BB_TALL = class_2248.method_9541(5.0F, 0.0F, 5.0F, 11.0F, 16.0F, 16.0F);
    class_265 MODERN_WEST_BB_TALL = class_2248.method_9541(0.0F, 0.0F, 5.0F, 11.0F, 16.0F, 11.0F);

    class_265 MODERN_POST_CB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    class_265 MODERN_NORTH_CB_LOW = class_2248.method_9541(5.0F, 0.0F, 0.0F, 11.0F, 24.0F, 11.0F);
    class_265 MODERN_EAST_CB_LOW = class_2248.method_9541(5.0F, 0.0F, 5.0F, 16.0F, 24.0F, 11.0F);
    class_265 MODERN_SOUTH_CB_LOW = class_2248.method_9541(5.0F, 0.0F, 5.0F, 11.0F, 24.0F, 16.0F);
    class_265 MODERN_WEST_CB_LOW = class_2248.method_9541(0.0F, 0.0F, 5.0F, 11.0F, 24.0F, 11.0F);
    class_265 MODERN_NORTH_CB_TALL = class_2248.method_9541(5.0F, 0.0F, 0.0F, 11.0F, 24.0F, 11.0F);
    class_265 MODERN_EAST_CB_TALL = class_2248.method_9541(5.0F, 0.0F, 5.0F, 16.0F, 24.0F, 11.0F);
    class_265 MODERN_SOUTH_CB_TALL = class_2248.method_9541(5.0F, 0.0F, 5.0F, 11.0F, 24.0F, 16.0F);
    class_265 MODERN_WEST_CB_TALL = class_2248.method_9541(0.0F, 0.0F, 5.0F, 11.0F, 24.0F, 11.0F);


    class_265 CASTLE_POST_BB = class_2248.method_9541(3.0F, 0.0F, 3.0F, 13.0F, 16.0F, 13.0F);
    class_265 CASTLE_NORTH_BB_LOW = class_2248.method_9541(3.0F, 0.0F, 0.0F, 13.0F, 8.0F, 13.0F);
    class_265 CASTLE_EAST_BB_LOW = class_2248.method_9541(3.0F, 0.0F, 3.0F, 16.0F, 8.0F, 13.0F);
    class_265 CASTLE_SOUTH_BB_LOW = class_2248.method_9541(3.0F, 0.0F, 3.0F, 13.0F, 8.0F, 16.0F);
    class_265 CASTLE_WEST_BB_LOW = class_2248.method_9541(0.0F, 0.0F, 3.0F, 13.0F, 8.0F, 13.0F);
    class_265 CASTLE_NORTH_BB_TALL = class_2248.method_9541(3.0F, 0.0F, 0.0F, 13.0F, 16.0F, 13.0F);
    class_265 CASTLE_EAST_BB_TALL = class_2248.method_9541(3.0F, 0.0F, 3.0F, 16.0F, 16.0F, 13.0F);
    class_265 CASTLE_SOUTH_BB_TALL = class_2248.method_9541(3.0F, 0.0F, 3.0F, 13.0F, 16.0F, 16.0F);
    class_265 CASTLE_WEST_BB_TALL = class_2248.method_9541(0.0F, 0.0F, 3.0F, 13.0F, 16.0F, 13.0F);

    class_265 CASTLE_POST_CB = class_2248.method_9541(3.0F, 0.0F, 3.0F, 13.0F, 24.0F, 13.0F);
    class_265 CASTLE_NORTH_CB_LOW = class_2248.method_9541(3.0F, 0.0F, 0.0F, 13.0F, 8.0F, 13.0F);
    class_265 CASTLE_EAST_CB_LOW = class_2248.method_9541(3.0F, 0.0F, 3.0F, 16.0F, 8.0F, 13.0F);
    class_265 CASTLE_SOUTH_CB_LOW = class_2248.method_9541(3.0F, 0.0F, 3.0F, 13.0F, 8.0F, 16.0F);
    class_265 CASTLE_WEST_CB_LOW = class_2248.method_9541(0.0F, 0.0F, 3.0F, 13.0F, 8.0F, 13.0F);
    class_265 CASTLE_NORTH_CB_TALL = class_2248.method_9541(3.0F, 0.0F, 0.0F, 13.0F, 24.0F, 13.0F);
    class_265 CASTLE_EAST_CB_TALL = class_2248.method_9541(3.0F, 0.0F, 3.0F, 16.0F, 24.0F, 13.0F);
    class_265 CASTLE_SOUTH_CB_TALL = class_2248.method_9541(3.0F, 0.0F, 3.0F, 13.0F, 24.0F, 16.0F);
    class_265 CASTLE_WEST_CB_TALL = class_2248.method_9541(0.0F, 0.0F, 3.0F, 13.0F, 24.0F, 13.0F);


    class_265 BUILD_POST_BB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    class_265 BUILD_NORTH_BB_LOW = class_2248.method_9541(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    class_265 BUILD_EAST_BB_LOW = class_2248.method_9541(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    class_265 BUILD_SOUTH_BB_LOW = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    class_265 BUILD_WEST_BB_LOW = class_2248.method_9541(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    class_265 BUILD_NORTH_BB_TALL = class_2248.method_9541(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    class_265 BUILD_EAST_BB_TALL = class_2248.method_9541(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    class_265 BUILD_SOUTH_BB_TALL = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    class_265 BUILD_WEST_BB_TALL = class_2248.method_9541(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);

    class_265 BUILD_POST_CB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    class_265 BUILD_NORTH_CB_LOW = class_2248.method_9541(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 12.0F);
    class_265 BUILD_EAST_CB_LOW = class_2248.method_9541(4.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    class_265 BUILD_SOUTH_CB_LOW = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 16.0F);
    class_265 BUILD_WEST_CB_LOW = class_2248.method_9541(0.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    class_265 BUILD_NORTH_CB_TALL = class_2248.method_9541(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 12.0F);
    class_265 BUILD_EAST_CB_TALL = class_2248.method_9541(4.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    class_265 BUILD_SOUTH_CB_TALL = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 16.0F);
    class_265 BUILD_WEST_CB_TALL = class_2248.method_9541(0.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);

    public static class_2754<class_4778> NORTH_WALL = field_22157;
    public static class_2754<class_4778> EAST_WALL = field_22156;
    public static class_2754<class_4778> SOUTH_WALL = field_22158;
    public static class_2754<class_4778> WEST_WALL = field_22159;
    public final Map<class_2680, class_265> modernShape;
    public final Map<class_2680, class_265> castleShape;
    public final Map<class_2680, class_265> buildShape;
    public final Map<class_2680, class_265> modernCollisionShape;
    public final Map<class_2680, class_265> castleCollisionShape;
    public final Map<class_2680, class_265> buildCollisionShape;

    public Wall(class_2251 setting) {
        super(setting);
        this.modernShape = this.makeShapes(MODERN_POST_BB, MODERN_NORTH_BB_LOW, MODERN_EAST_BB_LOW, MODERN_SOUTH_BB_LOW, MODERN_WEST_BB_LOW, MODERN_NORTH_BB_TALL,MODERN_EAST_BB_TALL, MODERN_SOUTH_BB_TALL, MODERN_WEST_BB_TALL);
        this.modernCollisionShape = this.makeShapes(MODERN_POST_CB, MODERN_NORTH_CB_LOW, MODERN_EAST_CB_LOW, MODERN_SOUTH_CB_LOW, MODERN_WEST_CB_LOW, MODERN_NORTH_CB_TALL,MODERN_EAST_CB_TALL, MODERN_SOUTH_CB_TALL, MODERN_WEST_CB_TALL);

        this.castleShape = this.makeShapes(CASTLE_POST_BB, CASTLE_NORTH_BB_LOW, CASTLE_EAST_BB_LOW, CASTLE_SOUTH_BB_LOW, CASTLE_WEST_BB_LOW, CASTLE_NORTH_BB_TALL,CASTLE_EAST_BB_TALL, CASTLE_SOUTH_BB_TALL, CASTLE_WEST_BB_TALL);
        this.castleCollisionShape = this.makeShapes(CASTLE_POST_CB, CASTLE_NORTH_CB_LOW, CASTLE_EAST_CB_LOW, CASTLE_SOUTH_CB_LOW, CASTLE_WEST_CB_LOW, CASTLE_NORTH_CB_TALL,CASTLE_EAST_CB_TALL, CASTLE_SOUTH_CB_TALL, CASTLE_WEST_CB_TALL);

        this.buildShape = this.makeShapes(BUILD_POST_BB, BUILD_NORTH_BB_LOW, BUILD_EAST_BB_LOW, BUILD_SOUTH_BB_LOW, BUILD_WEST_BB_LOW, BUILD_NORTH_BB_TALL,BUILD_EAST_BB_TALL, BUILD_SOUTH_BB_TALL, BUILD_WEST_BB_TALL);
        this.buildCollisionShape = this.makeShapes(BUILD_POST_CB, BUILD_NORTH_CB_LOW, BUILD_EAST_CB_LOW, BUILD_SOUTH_CB_LOW, BUILD_WEST_CB_LOW, BUILD_NORTH_CB_TALL,BUILD_EAST_CB_TALL, BUILD_SOUTH_CB_TALL, BUILD_WEST_CB_TALL);

    }


    public Map<class_2680, class_265> makeShapes(class_265 post, class_265 north_low, class_265 east_low, class_265 south_low, class_265 west_low, class_265 north_tall, class_265 east_tall, class_265 south_tall, class_265 west_tall) {
        ImmutableMap.Builder<class_2680, class_265> builder = ImmutableMap.builder();
        for(Boolean is_up : field_11717.method_11898()) {
            for (class_4778 wall_north : NORTH_WALL.method_11898()) {
                for (class_4778 wall_east : EAST_WALL.method_11898()) {
                    for (class_4778 wall_south : SOUTH_WALL.method_11898()) {
                        for (class_4778 wall_west : WEST_WALL.method_11898()) {

                            class_265 shape = post;
                            if (wall_north == class_4778.field_22180) {
                                shape = class_259.method_1084(shape, north_tall);
                            }
                            if (wall_north == class_4778.field_22179) {
                                shape = class_259.method_1084(shape, north_low);
                            }
                            if (wall_east == class_4778.field_22180) {
                                shape = class_259.method_1084(shape, east_tall);
                            }
                            if (wall_east == class_4778.field_22179) {
                                shape = class_259.method_1084(shape, east_low);
                            }
                            if (wall_south == class_4778.field_22180) {
                                shape = class_259.method_1084(shape, south_tall);
                            }
                            if (wall_south == class_4778.field_22179) {
                                shape = class_259.method_1084(shape, south_low);
                            }
                            if (wall_west == class_4778.field_22180) {
                                shape = class_259.method_1084(shape, west_tall);
                            }
                            if (wall_west == class_4778.field_22179) {
                                shape = class_259.method_1084(shape, west_low);
                            }
                            class_2680 state = this.method_9564().method_11657(field_11717, is_up).method_11657(NORTH_WALL, wall_north).method_11657(EAST_WALL, wall_east).method_11657(SOUTH_WALL, wall_south).method_11657(WEST_WALL, wall_west);
                            builder.put(state.method_11657(field_22160, Boolean.valueOf(false)), shape);
                            builder.put(state.method_11657(field_22160, Boolean.valueOf(true)), shape);
                        }
                    }
                }
            }
        }
        return builder.build();
    }


    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
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

    public class_265 method_9549(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
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


