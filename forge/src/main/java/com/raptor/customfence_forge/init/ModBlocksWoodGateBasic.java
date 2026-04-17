package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import com.raptor.customfence_forge.blocks.FenceGate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings({"WeakerAccess", "unused"})
public class ModBlocksWoodGateBasic {

    public static final DeferredRegister<Block> WOOD_GATE_BASIC = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);


    public static final RegistryObject<Block> OAK_CLASSIC_GATE = registerBlock("oak_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("oak_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.OAK));
    public static final RegistryObject<Block> OAK_WILDLIFE_GATE = registerBlock("oak_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("oak_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.OAK));
    public static final RegistryObject<Block> OAK_PLANK_GATE = registerBlock("oak_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("oak_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.OAK));
    public static final RegistryObject<Block> OAK_CRISSCROSS_GATE = registerBlock("oak_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("oak_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.OAK));

    public static final RegistryObject<Block> BIRCH_CLASSIC_GATE = registerBlock("birch_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("birch_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BIRCH));
    public static final RegistryObject<Block> BIRCH_WILDLIFE_GATE = registerBlock("birch_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("birch_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BIRCH));
    public static final RegistryObject<Block> BIRCH_PLANK_GATE = registerBlock("birch_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("birch_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BIRCH));
    public static final RegistryObject<Block> BIRCH_CRISSCROSS_GATE = registerBlock("birch_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("birch_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BIRCH));

    public static final RegistryObject<Block> SPRUCE_CLASSIC_GATE = registerBlock("spruce_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("spruce_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.SPRUCE));
    public static final RegistryObject<Block> SPRUCE_WILDLIFE_GATE = registerBlock("spruce_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("spruce_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.SPRUCE));
    public static final RegistryObject<Block> SPRUCE_PLANK_GATE = registerBlock("spruce_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("spruce_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.SPRUCE));
    public static final RegistryObject<Block> SPRUCE_CRISSCROSS_GATE = registerBlock("spruce_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("spruce_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.SPRUCE));

    public static final RegistryObject<Block> JUNGLE_CLASSIC_GATE = registerBlock("jungle_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("jungle_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.JUNGLE));
    public static final RegistryObject<Block> JUNGLE_WILDLIFE_GATE = registerBlock("jungle_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("jungle_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.JUNGLE));
    public static final RegistryObject<Block> JUNGLE_PLANK_GATE = registerBlock("jungle_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("jungle_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.JUNGLE));
    public static final RegistryObject<Block> JUNGLE_CRISSCROSS_GATE = registerBlock("jungle_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("jungle_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.JUNGLE));

    public static final RegistryObject<Block> ACACIA_CLASSIC_GATE = registerBlock("acacia_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("acacia_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.ACACIA));
    public static final RegistryObject<Block> ACACIA_WILDLIFE_GATE = registerBlock("acacia_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("acacia_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.ACACIA));
    public static final RegistryObject<Block> ACACIA_PLANK_GATE = registerBlock("acacia_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("acacia_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.ACACIA));
    public static final RegistryObject<Block> ACACIA_CRISSCROSS_GATE = registerBlock("acacia_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("acacia_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.ACACIA));

    public static final RegistryObject<Block> DARKOAK_CLASSIC_GATE = registerBlock("darkoak_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("darkoak_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.DARK_OAK));
    public static final RegistryObject<Block> DARKOAK_WILDLIFE_GATE = registerBlock("darkoak_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("darkoak_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.DARK_OAK));
    public static final RegistryObject<Block> DARKOAK_PLANK_GATE = registerBlock("darkoak_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("darkoak_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.DARK_OAK));
    public static final RegistryObject<Block> DARKOAK_CRISSCROSS_GATE = registerBlock("darkoak_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("darkoak_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.DARK_OAK));

    public static final RegistryObject<Block> WARPED_CLASSIC_GATE = registerBlock("warped_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("warped_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.WARPED));
    public static final RegistryObject<Block> WARPED_WILDLIFE_GATE = registerBlock("warped_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("warped_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.WARPED));
    public static final RegistryObject<Block> WARPED_PLANK_GATE = registerBlock("warped_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("warped_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.WARPED));
    public static final RegistryObject<Block> WARPED_CRISSCROSS_GATE = registerBlock("warped_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("warped_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.WARPED));

    public static final RegistryObject<Block> CRIMSON_CLASSIC_GATE = registerBlock("crimson_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("crimson_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CRIMSON));
    public static final RegistryObject<Block> CRIMSON_WILDLIFE_GATE = registerBlock("crimson_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("crimson_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CRIMSON));
    public static final RegistryObject<Block> CRIMSON_PLANK_GATE = registerBlock("crimson_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("crimson_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CRIMSON));
    public static final RegistryObject<Block> CRIMSON_CRISSCROSS_GATE = registerBlock("crimson_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("crimson_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CRIMSON));

    public static final RegistryObject<Block> MANGROVE_CLASSIC_GATE = registerBlock("mangrove_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("mangrove_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.MANGROVE));
    public static final RegistryObject<Block> MANGROVE_WILDLIFE_GATE = registerBlock("mangrove_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("mangrove_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.MANGROVE));
    public static final RegistryObject<Block> MANGROVE_PLANK_GATE = registerBlock("mangrove_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("mangrove_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.MANGROVE));
    public static final RegistryObject<Block> MANGROVE_CRISSCROSS_GATE = registerBlock("mangrove_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("mangrove_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.MANGROVE));

    public static final RegistryObject<Block> BAMBOO_CLASSIC_GATE = registerBlock("bamboo_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("bamboo_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BAMBOO));
    public static final RegistryObject<Block> BAMBOO_WILDLIFE_GATE = registerBlock("bamboo_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("bamboo_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BAMBOO));
    public static final RegistryObject<Block> BAMBOO_PLANK_GATE = registerBlock("bamboo_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("bamboo_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BAMBOO));
    public static final RegistryObject<Block> BAMBOO_CRISSCROSS_GATE = registerBlock("bamboo_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("bamboo_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.BAMBOO));

    public static final RegistryObject<Block> CHERRY_CLASSIC_GATE = registerBlock("cherry_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("cherry_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CHERRY));
    public static final RegistryObject<Block> CHERRY_WILDLIFE_GATE = registerBlock("cherry_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("cherry_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CHERRY));
    public static final RegistryObject<Block> CHERRY_PLANK_GATE = registerBlock("cherry_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("cherry_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CHERRY));
    public static final RegistryObject<Block> CHERRY_CRISSCROSS_GATE = registerBlock("cherry_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("cherry_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.CHERRY));

    public static final RegistryObject<Block> PALE_OAK_CLASSIC_GATE = registerBlock("pale_oak_classic_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("pale_oak_classic_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.PALE_OAK));
    public static final RegistryObject<Block> PALE_OAK_WILDLIFE_GATE = registerBlock("pale_oak_wildlife_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("pale_oak_wildlife_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.PALE_OAK));
    public static final RegistryObject<Block> PALE_OAK_PLANK_GATE = registerBlock("pale_oak_plank_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("pale_oak_plank_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.PALE_OAK));
    public static final RegistryObject<Block> PALE_OAK_CRISSCROSS_GATE = registerBlock("pale_oak_crisscross_fence_gate", () -> new FenceGate(Block.Properties.of().setId((WOOD_GATE_BASIC.key("pale_oak_crisscross_fence_gate"))).strength(2.0f, 3.0f).sound(SoundType.WOOD), WoodType.PALE_OAK));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = WOOD_GATE_BASIC.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().useBlockDescriptionPrefix()
                .setId(ModItems.ITEMS.key(name))));
    }


    public static void register(BusGroup eventBus) {
        WOOD_GATE_BASIC.register(eventBus);
    }

}
