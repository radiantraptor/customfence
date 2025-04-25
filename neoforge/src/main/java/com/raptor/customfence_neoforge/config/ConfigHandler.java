package com.raptor.customfence_neoforge.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.nio.file.Path;

public class ConfigHandler {

    public static final ModConfigSpec.Builder COMMON_BUILDER = new ModConfigSpec.Builder();
    public static final CustomFenceConfig COMMON = new CustomFenceConfig(COMMON_BUILDER);
    public static ModConfigSpec COMMON_CONFIG = COMMON_BUILDER.build();

    public static class CustomFenceConfig {

        public final ModConfigSpec.BooleanValue more_creative_tabs;
        public final ModConfigSpec.BooleanValue metal_oxidation;
        CustomFenceConfig(ModConfigSpec.Builder builder) {

            String description;
            builder.push("customfence-common.toml");

            description = "3 tabs instead of 1 in the creative inventory. Possible values: true or false (default: true)";
            more_creative_tabs = builder.comment(description).define("more_creative_tabs", true);

            description = "Metal fences will oxidize over time. Possible values: true or false (default: true)";
            metal_oxidation = builder.comment(description).define("metal_oxidation", true);

            builder.pop();

        }
    }


    public static String loadConfig(ModConfigSpec spec, Path file)
    {
        final CommentedFileConfig configData = CommentedFileConfig.builder(file).preserveInsertionOrder()
                .sync()
                .autosave()
                .autoreload()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        spec.correct(configData);
        return configData.toString();
    }

}

