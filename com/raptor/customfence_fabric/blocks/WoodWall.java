package com.raptor.customfence_fabric.blocks;

import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2354;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3726;

public class WoodWall extends class_2354 {

    class_265 BUILD_POST_BB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);
    class_265 BUILD_NORTH_BB = class_2248.method_9541(4.0F, 0.0F, 0.0F, 12.0F, 16.0F, 12.0F);
    class_265 BUILD_EAST_BB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 16.0F, 16.0F, 12.0F);
    class_265 BUILD_SOUTH_BB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 16.0F, 16.0F);
    class_265 BUILD_WEST_BB = class_2248.method_9541(0.0F, 0.0F, 4.0F, 12.0F, 16.0F, 12.0F);

    class_265 BUILD_POST_CB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);
    class_265 BUILD_NORTH_CB = class_2248.method_9541(4.0F, 0.0F, 0.0F, 12.0F, 24.0F, 12.0F);
    class_265 BUILD_EAST_CB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 16.0F, 24.0F, 12.0F);
    class_265 BUILD_SOUTH_CB = class_2248.method_9541(4.0F, 0.0F, 4.0F, 12.0F, 24.0F, 16.0F);
    class_265 BUILD_WEST_CB = class_2248.method_9541(0.0F, 0.0F, 4.0F, 12.0F, 24.0F, 12.0F);


    public WoodWall(class_2251 setting) {
        super(setting);
    }


    public class_265 makebuildShapes (class_2680 state, class_265 post, class_265 north, class_265 east, class_265 south, class_265 west) {
        class_265 shape = post;
        if (state.toString().contains("north=true")) {
            shape = class_259.method_1084(shape, north);
        }
        if (state.toString().contains("east=true")) {
            shape = class_259.method_1084(shape, east);
        }
        if (state.toString().contains("south=true")) {
            shape = class_259.method_1084(shape, south);
        }
        if (state.toString().contains("west=true")) {
            shape = class_259.method_1084(shape, west);
        }
        return shape;
    }


    public class_265 method_9530(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        class_265 shape;
        shape = makebuildShapes(state, BUILD_POST_BB, BUILD_NORTH_BB, BUILD_EAST_BB, BUILD_SOUTH_BB, BUILD_WEST_BB);
        return shape;
    }

    public class_265 method_9549(class_2680 state, class_1922 world, class_2338 pos, class_3726 context) {
        class_265 shape;
        shape = makebuildShapes(state, BUILD_POST_CB, BUILD_NORTH_CB, BUILD_EAST_CB, BUILD_SOUTH_CB, BUILD_WEST_CB);
        return shape;
    }


}


