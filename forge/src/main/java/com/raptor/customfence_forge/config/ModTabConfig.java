package com.raptor.customfence_forge.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModTabConfig {

    public static ForgeConfigSpec.BooleanValue more_creative_tabs;
    public static ForgeConfigSpec.BooleanValue metal_oxidation;

    public static void Init(ForgeConfigSpec.Builder builder) {

        more_creative_tabs = builder
                .comment("3 tabs instead of 1 in the creative inventory. Possible values: true or false (default: true)")
                .define("setting_tab_count.more_creative_tabs", true);

        metal_oxidation = builder
                .comment("Metal fences will oxidize over time. Possible values: true or false (default: true)")
                .define("setting_oxidation.metal_oxidation", true);

    }

}
