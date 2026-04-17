package com.raptor.customfence_neoforge.blocks;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public record MetalType(String name, BlockSetType setType, SoundType soundType, SoundType hangingSignSoundType, SoundEvent fenceGateClose, SoundEvent fenceGateOpen) {

    public static WoodType WoodTypeCopper(String name, BlockSetType setType) {
        WoodType type = new WoodType(name, setType, SoundType.COPPER, SoundType.HANGING_SIGN, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN);
        return type;
    }

    public static WoodType WoodTypeIron(String name, BlockSetType setType) {
        WoodType type = new WoodType(name, setType, SoundType.IRON, SoundType.HANGING_SIGN, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN);
        return type;
    }

    public static WoodType WoodTypeGold(String name, BlockSetType setType) {
        WoodType type = new WoodType(name, setType, SoundType.COPPER, SoundType.HANGING_SIGN, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN);
        return type;
    }

}
