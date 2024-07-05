package com.raptor.customfence_forge.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ConfigHandler {

    public static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    public static final CustomFenceConfig COMMON = new CustomFenceConfig(COMMON_BUILDER);
    public static ForgeConfigSpec COMMON_CONFIG = COMMON_BUILDER.build();

    public static class CustomFenceConfig {

        public final ForgeConfigSpec.BooleanValue more_creative_tabs;
        public final ForgeConfigSpec.BooleanValue metal_oxidation;
        CustomFenceConfig(ForgeConfigSpec.Builder builder) {

            String description;
            builder.push("customfence-common.toml");

            description = "3 tabs instead of 1 in the creative inventory. Possible values: true or false (default: true)";
            more_creative_tabs = builder.comment(description).define("more_creative_tabs", true);

            description = "Metal fences will oxidize over time. Possible values: true or false (default: true)";
            metal_oxidation = builder.comment(description).define("metal_oxidation", true);

            builder.pop();

        }
    }

    public static void loadConfig(ForgeConfigSpec spec, Path file)
    {
        final CommentedFileConfig configData = CommentedFileConfig.builder(file).preserveInsertionOrder()
                .sync()
                .autosave()
                .autoreload()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        spec.setConfig(configData);
    }

}
