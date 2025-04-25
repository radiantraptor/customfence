package com.raptor.customfence_neoforge.init;

import com.raptor.customfence_neoforge.Main;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MOD_ID);
    

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
