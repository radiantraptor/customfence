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

public class ModTabConfig {

    private static Path configFilePath;
    private static Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    public static boolean more_creative_tabs = true;
    public static boolean metal_oxidation = true;

    public static void load() {
        Reader reader;
        if(getFilePath().toFile().exists()) {
            try {
                reader = Files.newBufferedReader(getFilePath());
                Data data = gson.fromJson(reader, Data.class);
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
            Data data = new Data(new Data.tabCount(more_creative_tabs), new Data.metalFenceOxidation(metal_oxidation));
            gson.toJson(data, writer);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static Path getFilePath() {
        if(configFilePath == null) {
            configFilePath = FabricLoader.getInstance().getConfigDir().resolve(Main.MOD_ID + "-settings-fabric.json");
        }
        return configFilePath;
    }


    private static class Data {

        private tabCount setting_tab_count;
        private metalFenceOxidation setting_oxidation;

        public Data(tabCount TAB_COUNT, metalFenceOxidation OXIDATION) {
            this.setting_tab_count = TAB_COUNT;
            this.setting_oxidation = OXIDATION;
        }

        private static class tabCount {

            private final String more_creative_tabs_comment = "3 tabs instead of 1 in the creative inventory. Possible values: true or false (default: true)";
            private final boolean more_creative_tabs;

            private tabCount() {
                more_creative_tabs = true;
            }

            private tabCount(boolean more_creative_tabs) {
                this.more_creative_tabs = more_creative_tabs;
            }
        }

        private static class metalFenceOxidation {

            private final String metal_oxidation_comment = "Metal fences will oxidize over time. Possible values: true or false (default: true)";
            private final boolean metal_oxidation;

            private metalFenceOxidation() {
                metal_oxidation = true;
            }

            private metalFenceOxidation(boolean metal_oxidation) {
                this.metal_oxidation = metal_oxidation;
            }
        }

    }

}
