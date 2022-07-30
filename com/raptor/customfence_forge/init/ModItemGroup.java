package com.raptor.customfence_forge.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {

    public static final CreativeModeTab CUSTOMFENCE = new CreativeModeTab("customfence.tab_customfence_fence") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.birchHHHSpruce.get());
        }
    };

}
