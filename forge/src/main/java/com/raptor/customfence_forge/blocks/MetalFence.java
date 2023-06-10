package com.raptor.customfence_forge.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class MetalFence extends FenceBlock implements WeatheringFence {
    private final WeatheringFence.WeatherState weatherState;

    public MetalFence(WeatherState weatherstate, BlockBehaviour.Properties properties) {
        super(properties);
        this.weatherState = weatherstate;
    }


    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.onRandomTick(state, level, pos, random);
    }

    //public void onRandomTick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
    //    float f = 0.05688889F;
    //    if (random.nextFloat() < 0.05688889F) {
    //       this.applyChangeOverTime(state, level, pos, random);
    //    }
    //}

    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean istrue)
    {
        if(ToolActions.AXE_SCRAPE.equals(toolAction)) {
            return WeatheringFence.getPrevious(state).orElse(null);
        }
        else if(ToolActions.AXE_WAX_OFF.equals(toolAction)) {
            if (WaxedMetal.getUnWaxed(state).isPresent()) {
                return WaxedMetal.getUnWaxed(state).get();
            }
        }
        return super.getToolModifiedState(state, context, toolAction, istrue);
    }

    public boolean isRandomlyTicking(BlockState state) {
        return WeatheringFence.getNext(state.getBlock()).isPresent();
    }

    public WeatheringFence.WeatherState getAge() {
        return this.weatherState;
    }
}