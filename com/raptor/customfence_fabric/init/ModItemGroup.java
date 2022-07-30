package com.raptor.customfence_fabric.init;

import com.raptor.customfence_fabric.Main;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.class_1761;
import net.minecraft.class_1799;
import net.minecraft.class_2960;

public class ModItemGroup {

    public static final class_1761 CUSTOMFENCE = FabricItemGroupBuilder.build(new class_2960(Main.MOD_ID, "tab_customfence_fence"), () -> new class_1799(ModBlocks.birchHHHSpruce));

}
