package com.raptor.customfence_fabric.blocks;

import java.util.function.Consumer;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_161;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_3218;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3965;
import net.minecraft.class_5819;

public class MetalFenceGate extends class_2349 implements WeatheringFence, Consumer<Consumer<class_161>> {
    private final WeatheringFence.WeatherState weatherState;

    public MetalFenceGate(WeatherState weatherstate, class_2251 settings) {
        super(settings);
        this.weatherState = weatherstate;
    }

    @Override
    public void method_9514(class_2680 state, class_3218 world, class_2338 pos, class_5819 random) {
        this.method_33621(state, world, pos, random);
    }

    public boolean method_9542(class_2680 state) {
        return WeatheringFence.getIncreasedOxidationBlock(state.method_26204()).isPresent();
    }

    public WeatheringFence.WeatherState method_33622() {
        return this.weatherState;
    }



    public class_1269 method_9534(class_2680 state, class_1937 world, class_2338 pos, class_1657 player, class_1268 hand, class_3965 result) {

        if (state.method_11654(field_11026)) {
            state = state.method_11657(field_11026, false);
            world.method_8652(pos, state, 10);
            world.method_8396(player, pos, class_3417.field_14819, class_3419.field_15245, 1.0f, 1.0f);

        } else {
            class_2350 direction = player.method_5735();
            if (state.method_11654(field_11177) == direction.method_10153()) {
                state = state.method_11657(field_11177, direction);
            }
            state = state.method_11657(field_11026, true);
            world.method_8652(pos, state, 10);
            world.method_8396(player, pos, class_3417.field_14567, class_3419.field_15245, 1.0f, 1.0f);
        }
        return class_1269.method_29236(world.field_9236);
    }

    public void method_9612(class_2680 state, class_1937 world, class_2338 pos, class_2248 block, class_2338 pos2, boolean istrue) {
        if (!world.field_9236) {
            if (state.method_11654(field_11021) != world.method_8479(pos)) {
                world.method_8652(pos, (state.method_11657(field_11021, world.method_8479(pos))).method_11657(field_11026, world.method_8479(pos)), 2);
                if (state.method_11654(field_11026) != world.method_8479(pos)) {
                    world.method_8444(null, openCloseSound(world.method_8479(pos)), pos, 0);
                    //world.emitGameEvent(world.isReceivingRedstonePower(pos) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
                }
            }
        }
    }

    public int openCloseSound(boolean isopen) {
        return isopen ? 1005 : 1011;
    }

    @Override
    public void accept(Consumer<class_161> advancementConsumer) {

    }

}
