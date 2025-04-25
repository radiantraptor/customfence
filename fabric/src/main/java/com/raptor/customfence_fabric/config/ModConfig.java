package com.raptor.customfence_fabric.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.raptor.customfence_fabric.Main;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class ModConfig {

    public static Path configFilePath;
    public static Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    public static boolean more_creative_tabs = true;
    public static boolean metal_oxidation = true;

    public static void load() {
        Reader reader;
        if(getFilePath().toFile().exists()) {
            try {
                reader = Files.newBufferedReader(getFilePath());
                ModConfig.Data data = gson.fromJson(reader, ModConfig.Data.class);
                more_creative_tabs = data.setting_tab_count.more_creative_tabs;
                metal_oxidation = data.setting_oxidation.metal_oxidation;
                reader.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        save();

    }

    public static void save() {
        try {
            Writer writer = Files.newBufferedWriter(getFilePath());
            ModConfig.Data data = new ModConfig.Data(new ModConfig.Data.tabCount(more_creative_tabs), new ModConfig.Data.metalFenceOxidation(metal_oxidation));
            gson.toJson(data, writer);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static Path getFilePath() {
        if(configFilePath == null) {
            configFilePath = FabricLoader.getInstance().getConfigDir().resolve(Main.MOD_ID + "-settings-fabric.json");
        }
        return configFilePath;
    }


    public static class Data {

        public ModConfig.Data.tabCount setting_tab_count;
        public ModConfig.Data.metalFenceOxidation setting_oxidation;

        public Data(ModConfig.Data.tabCount TAB_COUNT, ModConfig.Data.metalFenceOxidation OXIDATION) {
            this.setting_tab_count = TAB_COUNT;
            this.setting_oxidation = OXIDATION;
        }

        public static class tabCount {

            public final String more_creative_tabs_comment = "3 tabs instead of 1 in the creative inventory. Possible values: true or false (default: true)";
            public final boolean more_creative_tabs;

            public tabCount() {
                more_creative_tabs = true;
            }

            public tabCount(boolean more_creative_tabs) {
                this.more_creative_tabs = more_creative_tabs;
            }
        }

        public static class metalFenceOxidation {

            public final String metal_oxidation_comment = "Metal fences will oxidize over time. Possible values: true or false (default: true)";
            public final boolean metal_oxidation;

            public metalFenceOxidation() {
                metal_oxidation = true;
            }

            public metalFenceOxidation(boolean metal_oxidation) {
                this.metal_oxidation = metal_oxidation;
            }
        }

    }

}
