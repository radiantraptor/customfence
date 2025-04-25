package com.raptor.customfence_fabric.blocks;

import com.raptor.customfence_fabric.Main;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Fence extends FenceBlock {

    public Fence(String string) {
        super(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, string))).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD));
    }

}
