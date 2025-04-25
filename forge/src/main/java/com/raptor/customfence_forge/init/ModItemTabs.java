package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import java.lang.reflect.Field;

//@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WOOD_GATE_BASIC = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WOOD_FENCE_BASIC = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WOOD_FENCE_GATE_ADVANCED = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_WALLS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_METAL_FENCES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_ALL = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static void registerTabWoodGateBasic() {
        CREATIVE_TAB_WOOD_GATE_BASIC.register("customfence_1_wood_gate_basic", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodGateBasic.OAK_CLASSIC_GATE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_wood_gate_basic"))
                        .displayItems((itemDisplayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksWoodGateBasic.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }


                        }).build()
        );
    }

    public static void registerTabWoodFenceBasic() {
        CREATIVE_TAB_WOOD_FENCE_BASIC.register("customfence_1_wood_fence_basic", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodFenceBasic.SPRUCE_OAK_WILDLIFE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_wood_fence_basic"))
                        .displayItems((itemDisplayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksWoodFenceBasic.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }


                        }).build()
        );
    }

    public static void registerTabWoodFenceGateAdvanced() {
        CREATIVE_TAB_WOOD_FENCE_GATE_ADVANCED.register("customfence_1_wood_fence_gate_advanced", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodFenceGateAdvanced.SPRUCE_OAK_DECORATION.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_wood_fence_gate_advanced"))
                        .displayItems((itemDisplayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksWoodFenceGateAdvanced.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }


                        }).build()
        );
    }

    public static void registerTabWall() {
        CREATIVE_TAB_WALLS.register("customfence_2_wall", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWall.STONE_MODERN.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_wall"))
                        .displayItems((itemDisplayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksWall.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }


                        }).build()
        );
    }

    public static void registerTabMetalFence() {
        CREATIVE_TAB_METAL_FENCES.register("customfence_3_metal_fence", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksMetalFence.COBBLESTONE_IRON_MANSION_FENCE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence_metal_fence"))
                        .displayItems((itemDisplayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksMetalFence.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }


                        }).build()
        );
    }


    public static void registerTabAll() {
        CREATIVE_TAB_ALL.register("customfence_all", () ->
                CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocksWoodFenceBasic.SPRUCE_OAK_WILDLIFE.get()))
                        .title(Component.translatable("itemGroup.customfence.tab_customfence"))
                        .displayItems((itemDisplayParameters, output) -> {
                            // Add blocks
                            for (Field field : ModBlocksWoodGateBasic.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }
                            for (Field field : ModBlocksWoodFenceBasic.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }
                            for (Field field : ModBlocksWoodFenceGateAdvanced.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }
                            for (Field field : ModBlocksWall.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }
                            for (Field field : ModBlocksMetalFence.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Block> block = (RegistryObject) field.get(null);
                                    output.accept(new ItemStack(block.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }


                        }).build()
        );
    }


}
