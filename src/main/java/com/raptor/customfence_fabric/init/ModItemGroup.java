package com.raptor.customfence_fabric.init;

import com.raptor.customfence_fabric.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup CUSTOMFENCE = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "tab_customfence_fence"), () -> new ItemStack(ModBlocks.birchHHHSpruce));

}
