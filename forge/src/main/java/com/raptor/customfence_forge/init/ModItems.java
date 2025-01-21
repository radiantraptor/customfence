package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


@SuppressWarnings({"WeakerAccess", "unused"})
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
