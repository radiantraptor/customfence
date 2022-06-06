package com.raptor.customfence_forge.init;

import com.raptor.customfence_forge.Main;
import com.raptor.customfence_forge.blocks.*;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings({"WeakerAccess", "unused"})
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> HHOakGate = BLOCKS.register("hhoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHHOakGate = BLOCKS.register("hhhoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHOakVVOakGate = BLOCKS.register("hhoak_vvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHOakXXOakGate = BLOCKS.register("hhoak_xxoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> HHBirchGate = BLOCKS.register("hhbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHHBirchGate = BLOCKS.register("hhhbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHBirchVVBirchGate = BLOCKS.register("hhbirch_vvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHBirchXXBirchGate = BLOCKS.register("hhbirch_xxbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> HHSpruceGate = BLOCKS.register("hhspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHHSpruceGate = BLOCKS.register("hhhspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHSpruceVVSpruceGate = BLOCKS.register("hhspruce_vvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHSpruceXXSpruceGate = BLOCKS.register("hhspruce_xxspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> HHJungleGate = BLOCKS.register("hhjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHHJungleGate = BLOCKS.register("hhhjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHJungleVVJungleGate = BLOCKS.register("hhjungle_vvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHJungleXXJungleGate = BLOCKS.register("hhjungle_xxjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> HHAcaciaGate = BLOCKS.register("hhacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHHAcaciaGate = BLOCKS.register("hhhacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHAcaciaVVAcaciaGate = BLOCKS.register("hhacacia_vvacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHAcaciaXXAcaciaGate = BLOCKS.register("hhacacia_xxacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> HHDarkoakGate = BLOCKS.register("hhdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHHDarkoakGate = BLOCKS.register("hhhdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHDarkoakVVDarkoakGate = BLOCKS.register("hhdark_oak_vvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHDarkoakXXDarkoakGate = BLOCKS.register("hhdark_oak_xxdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> HHWarpedGate = BLOCKS.register("hhwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHHWarpedGate = BLOCKS.register("hhhwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHWarpedVVWarpedGate = BLOCKS.register("hhwarped_vvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHWarpedXXWarpedGate = BLOCKS.register("hhwarped_xxwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> HHCrimsonGate = BLOCKS.register("hhcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHHCrimsonGate = BLOCKS.register("hhhcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHCrimsonVVCrimsonGate = BLOCKS.register("hhcrimson_vvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHCrimsonXXCrimsonGate = BLOCKS.register("hhcrimson_xxcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> HHMangroveGate = BLOCKS.register("hhmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHHMangroveGate = BLOCKS.register("hhhmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHMangroveVVMangroveGate = BLOCKS.register("hhmangrove_vvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HHMangroveXXMangroveGate = BLOCKS.register("hhmangrove_xxmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> spruceHHOak = BLOCKS.register("spruce_hhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHOak = BLOCKS.register("spruce_hhhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHOakVSpruce = BLOCKS.register("spruce_hhoak_vspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHOakVSpruceGate = BLOCKS.register("spruce_hhoak_vspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHOakVVOak = BLOCKS.register("spruce_hhoak_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVOak = BLOCKS.register("spruce_hhspruce_vvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVOakGate = BLOCKS.register("spruce_hhspruce_vvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVOak = BLOCKS.register("spruce_hhspruce_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVOakGate = BLOCKS.register("spruce_hhspruce_vvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHOakVVVVSpruceVVVVSpruce = BLOCKS.register("spruce_hhhoak_vvvvspruce_vvvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHOakVVVVSpruceVVVVSpruceGate = BLOCKS.register("spruce_hhhoak_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHOakXXOak = BLOCKS.register("spruce_hhoak_xxoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVVOak = BLOCKS.register("spruce_hhspruce_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVVOakGate = BLOCKS.register("spruce_hhspruce_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> oakHHSpruce = BLOCKS.register("oak_hhspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHSpruce = BLOCKS.register("oak_hhhspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHSpruceVOak = BLOCKS.register("oak_hhspruce_voak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHSpruceVOakGate = BLOCKS.register("oak_hhspruce_voak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHSpruceVVSpruce = BLOCKS.register("oak_hhspruce_vvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVSpruce = BLOCKS.register("oak_hhoak_vvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVSpruceGate = BLOCKS.register("oak_hhoak_vvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVSpruce = BLOCKS.register("oak_hhoak_vvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVSpruceGate = BLOCKS.register("oak_hhoak_vvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHSpruceVVVVOakVVVVOak = BLOCKS.register("oak_hhhspruce_vvvvoak_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHSpruceVVVVOakVVVVOakGate = BLOCKS.register("oak_hhhspruce_vvvvoak_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHSpruceXXSpruce = BLOCKS.register("oak_hhspruce_xxspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVSpruce = BLOCKS.register("oak_hhoak_vvvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVSpruceGate = BLOCKS.register("oak_hhoak_vvvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> oakHHBirch = BLOCKS.register("oak_hhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHBirch = BLOCKS.register("oak_hhhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHBirchVOak = BLOCKS.register("oak_hhbirch_voak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHBirchVOakGate = BLOCKS.register("oak_hhbirch_voak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHBirchVVBirch = BLOCKS.register("oak_hhbirch_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVBirch = BLOCKS.register("oak_hhoak_vvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVBirchGate = BLOCKS.register("oak_hhoak_vvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVBirch = BLOCKS.register("oak_hhoak_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVBirchGate = BLOCKS.register("oak_hhoak_vvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHBirchVVVVOakVVVVOak = BLOCKS.register("oak_hhhbirch_vvvvoak_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHBirchVVVVOakVVVVOakGate = BLOCKS.register("oak_hhhbirch_vvvvoak_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHBirchXXBirch = BLOCKS.register("oak_hhbirch_xxbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVBirch = BLOCKS.register("oak_hhoak_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVBirchGate = BLOCKS.register("oak_hhoak_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> birchHHOak = BLOCKS.register("birch_hhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHOak = BLOCKS.register("birch_hhhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHOakVBirch = BLOCKS.register("birch_hhoak_vbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHOakVBirchGate = BLOCKS.register("birch_hhoak_vbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHOakVVOak = BLOCKS.register("birch_hhoak_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVOak = BLOCKS.register("birch_hhbirch_vvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVOakGate = BLOCKS.register("birch_hhbirch_vvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVOak = BLOCKS.register("birch_hhbirch_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVOakGate = BLOCKS.register("birch_hhbirch_vvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHOakVVVVBirchVVVVBirch = BLOCKS.register("birch_hhhoak_vvvvbirch_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHOakVVVVBirchVVVVBirchGate = BLOCKS.register("birch_hhhoak_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHOakXXOak = BLOCKS.register("birch_hhoak_xxoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVOak = BLOCKS.register("birch_hhbirch_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVOakGate = BLOCKS.register("birch_hhbirch_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> spruceHHBirch = BLOCKS.register("spruce_hhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHBirch = BLOCKS.register("spruce_hhhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHBirchVSpruce = BLOCKS.register("spruce_hhbirch_vspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHBirchVSpruceGate = BLOCKS.register("spruce_hhbirch_vspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHBirchVVBirch = BLOCKS.register("spruce_hhbirch_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVBirch = BLOCKS.register("spruce_hhspruce_vvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVBirchGate = BLOCKS.register("spruce_hhspruce_vvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVBirch = BLOCKS.register("spruce_hhspruce_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVBirchGate = BLOCKS.register("spruce_hhspruce_vvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHBirchVVVVSpruceVVVVSpruce = BLOCKS.register("spruce_hhhbirch_vvvvspruce_vvvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHBirchVVVVSpruceVVVVSpruceGate = BLOCKS.register("spruce_hhhbirch_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHBirchXXBirch = BLOCKS.register("spruce_hhbirch_xxbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVVBirch = BLOCKS.register("spruce_hhspruce_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVVBirchGate = BLOCKS.register("spruce_hhspruce_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> birchHHSpruce = BLOCKS.register("birch_hhspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHSpruce = BLOCKS.register("birch_hhhspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHSpruceVBirch = BLOCKS.register("birch_hhspruce_vbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHSpruceVBirchGate = BLOCKS.register("birch_hhspruce_vbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHSpruceVVSpruce = BLOCKS.register("birch_hhspruce_vvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVSpruce = BLOCKS.register("birch_hhbirch_vvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVSpruceGate = BLOCKS.register("birch_hhbirch_vvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVSpruce = BLOCKS.register("birch_hhbirch_vvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVSpruceGate = BLOCKS.register("birch_hhbirch_vvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHSpruceVVVVBirchVVVVBirch = BLOCKS.register("birch_hhhspruce_vvvvbirch_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHSpruceVVVVBirchVVVVBirchGate = BLOCKS.register("birch_hhhspruce_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHSpruceXXSpruce = BLOCKS.register("birch_hhspruce_xxspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVSpruce = BLOCKS.register("birch_hhbirch_vvvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVSpruceGate = BLOCKS.register("birch_hhbirch_vvvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> darkoakHHSpruce = BLOCKS.register("dark_oak_hhspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHSpruce = BLOCKS.register("dark_oak_hhhspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHSpruceVDarkoak = BLOCKS.register("dark_oak_hhspruce_vdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHSpruceVDarkoakGate = BLOCKS.register("dark_oak_hhspruce_vdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHSpruceVVSpruce = BLOCKS.register("dark_oak_hhspruce_vvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVSpruce = BLOCKS.register("dark_oak_hhdark_oak_vvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVSpruceGate = BLOCKS.register("dark_oak_hhdark_oak_vvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVSpruce = BLOCKS.register("dark_oak_hhdark_oak_vvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVSpruceGate = BLOCKS.register("dark_oak_hhdark_oak_vvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHSpruceVVVVDarkoakVVVVDarkoak = BLOCKS.register("dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate = BLOCKS.register("dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHSpruceXXSpruce = BLOCKS.register("dark_oak_hhspruce_xxspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVSpruce = BLOCKS.register("dark_oak_hhdark_oak_vvvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVSpruceGate = BLOCKS.register("dark_oak_hhdark_oak_vvvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> spruceHHDarkoak = BLOCKS.register("spruce_hhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHDarkoak = BLOCKS.register("spruce_hhhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHDarkoakVSpruce = BLOCKS.register("spruce_hhdark_oak_vspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHDarkoakVSpruceGate = BLOCKS.register("spruce_hhdark_oak_vspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHDarkoakVVDarkoak = BLOCKS.register("spruce_hhdark_oak_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVDarkoak = BLOCKS.register("spruce_hhspruce_vvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVDarkoakGate = BLOCKS.register("spruce_hhspruce_vvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVDarkoak = BLOCKS.register("spruce_hhspruce_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVDarkoakGate = BLOCKS.register("spruce_hhspruce_vvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHDarkoakVVVVSpruceVVVVSpruce = BLOCKS.register("spruce_hhhdark_oak_vvvvspruce_vvvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHDarkoakVVVVSpruceVVVVSpruceGate = BLOCKS.register("spruce_hhhdark_oak_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHDarkoakXXDarkoak = BLOCKS.register("spruce_hhdark_oak_xxdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVVDarkoak = BLOCKS.register("spruce_hhspruce_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVVDarkoakGate = BLOCKS.register("spruce_hhspruce_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> darkoakHHOak = BLOCKS.register("dark_oak_hhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHOak = BLOCKS.register("dark_oak_hhhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHOakVDarkoak = BLOCKS.register("dark_oak_hhoak_vdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHOakVDarkoakGate = BLOCKS.register("dark_oak_hhoak_vdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHOakVVOak = BLOCKS.register("dark_oak_hhoak_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVOak = BLOCKS.register("dark_oak_hhdark_oak_vvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVOakGate = BLOCKS.register("dark_oak_hhdark_oak_vvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVOak = BLOCKS.register("dark_oak_hhdark_oak_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVOakGate = BLOCKS.register("dark_oak_hhdark_oak_vvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHOakVVVVDarkoakVVVVDarkoak = BLOCKS.register("dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHOakVVVVDarkoakVVVVDarkoakGate = BLOCKS.register("dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHOakXXOak = BLOCKS.register("dark_oak_hhoak_xxoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVOak = BLOCKS.register("dark_oak_hhdark_oak_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVOakGate = BLOCKS.register("dark_oak_hhdark_oak_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> oakHHDarkoak = BLOCKS.register("oak_hhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHDarkoak = BLOCKS.register("oak_hhhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHDarkoakVOak = BLOCKS.register("oak_hhdark_oak_voak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHDarkoakVOakGate = BLOCKS.register("oak_hhdark_oak_voak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHDarkoakVVDarkoak = BLOCKS.register("oak_hhdark_oak_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVDarkoak = BLOCKS.register("oak_hhoak_vvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVDarkoakGate = BLOCKS.register("oak_hhoak_vvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVDarkoak = BLOCKS.register("oak_hhoak_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVDarkoakGate = BLOCKS.register("oak_hhoak_vvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHDarkoakVVVVOakVVVVOak = BLOCKS.register("oak_hhhdark_oak_vvvvoak_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHDarkoakVVVVOakVVVVOakGate = BLOCKS.register("oak_hhhdark_oak_vvvvoak_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHDarkoakXXDarkoak = BLOCKS.register("oak_hhdark_oak_xxdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVDarkoak = BLOCKS.register("oak_hhoak_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVDarkoakGate = BLOCKS.register("oak_hhoak_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> darkoakHHJungle = BLOCKS.register("dark_oak_hhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHJungle = BLOCKS.register("dark_oak_hhhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHJungleVDarkoak = BLOCKS.register("dark_oak_hhjungle_vdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHJungleVDarkoakGate = BLOCKS.register("dark_oak_hhjungle_vdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHJungleVVJungle = BLOCKS.register("dark_oak_hhjungle_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVJungle = BLOCKS.register("dark_oak_hhdark_oak_vvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVJungleGate = BLOCKS.register("dark_oak_hhdark_oak_vvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVJungle = BLOCKS.register("dark_oak_hhdark_oak_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVJungleGate = BLOCKS.register("dark_oak_hhdark_oak_vvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHJungleVVVVDarkoakVVVVDarkoak = BLOCKS.register("dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate = BLOCKS.register("dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHJungleXXJungle = BLOCKS.register("dark_oak_hhjungle_xxjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVJungle = BLOCKS.register("dark_oak_hhdark_oak_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVJungleGate = BLOCKS.register("dark_oak_hhdark_oak_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> jungleHHDarkoak = BLOCKS.register("jungle_hhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHDarkoak = BLOCKS.register("jungle_hhhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHDarkoakVJungle = BLOCKS.register("jungle_hhdark_oak_vjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHDarkoakVJungleGate = BLOCKS.register("jungle_hhdark_oak_vjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHDarkoakVVDarkoak = BLOCKS.register("jungle_hhdark_oak_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVDarkoak = BLOCKS.register("jungle_hhjungle_vvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVDarkoakGate = BLOCKS.register("jungle_hhjungle_vvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVDarkoak = BLOCKS.register("jungle_hhjungle_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVDarkoakGate = BLOCKS.register("jungle_hhjungle_vvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHDarkoakVVVVJungleVVVVJungle = BLOCKS.register("jungle_hhhdark_oak_vvvvjungle_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHDarkoakVVVVJungleVVVVJungleGate = BLOCKS.register("jungle_hhhdark_oak_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHDarkoakXXDarkoak = BLOCKS.register("jungle_hhdark_oak_xxdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVDarkoak = BLOCKS.register("jungle_hhjungle_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVDarkoakGate = BLOCKS.register("jungle_hhjungle_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> acaciaHHJungle = BLOCKS.register("acacia_hhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHHJungle = BLOCKS.register("acacia_hhhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHJungleVAcacia = BLOCKS.register("acacia_hhjungle_vacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHJungleVAcaciaGate = BLOCKS.register("acacia_hhjungle_vacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHJungleVVJungle = BLOCKS.register("acacia_hhjungle_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVVJungle = BLOCKS.register("acacia_hhacacia_vvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVVJungleGate = BLOCKS.register("acacia_hhacacia_vvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVJungle = BLOCKS.register("acacia_hhacacia_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVJungleGate = BLOCKS.register("acacia_hhacacia_vvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHHJungleVVVVAcaciaVVVVAcacia = BLOCKS.register("acacia_hhhjungle_vvvvacacia_vvvvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate = BLOCKS.register("acacia_hhhjungle_vvvvacacia_vvvvacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHJungleXXJungle = BLOCKS.register("acacia_hhjungle_xxjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVVVJungle = BLOCKS.register("acacia_hhacacia_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVVVJungleGate = BLOCKS.register("acacia_hhacacia_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> jungleHHAcacia = BLOCKS.register("jungle_hhacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHAcacia = BLOCKS.register("jungle_hhhacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHAcaciaVJungle = BLOCKS.register("jungle_hhacacia_vjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHAcaciaVJungleGate = BLOCKS.register("jungle_hhacacia_vjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHAcaciaVVAcacia = BLOCKS.register("jungle_hhacacia_vvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVAcacia = BLOCKS.register("jungle_hhjungle_vvvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVAcaciaGate = BLOCKS.register("jungle_hhjungle_vvvacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVAcacia = BLOCKS.register("jungle_hhjungle_vvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVAcaciaGate = BLOCKS.register("jungle_hhjungle_vvacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHAcaciaVVVVJungleVVVVJungle = BLOCKS.register("jungle_hhhacacia_vvvvjungle_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHAcaciaVVVVJungleVVVVJungleGate = BLOCKS.register("jungle_hhhacacia_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHAcaciaXXAcacia = BLOCKS.register("jungle_hhacacia_xxacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVAcacia = BLOCKS.register("jungle_hhjungle_vvvvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVAcaciaGate = BLOCKS.register("jungle_hhjungle_vvvvacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> acaciaHHBirch = BLOCKS.register("acacia_hhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHHBirch = BLOCKS.register("acacia_hhhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHBirchVAcacia = BLOCKS.register("acacia_hhbirch_vacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHBirchVAcaciaGate = BLOCKS.register("acacia_hhbirch_vacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHBirchVVBirch = BLOCKS.register("acacia_hhbirch_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVVBirch = BLOCKS.register("acacia_hhacacia_vvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVVBirchGate = BLOCKS.register("acacia_hhacacia_vvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVBirch = BLOCKS.register("acacia_hhacacia_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVBirchGate = BLOCKS.register("acacia_hhacacia_vvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHHBirchVVVVAcaciaVVVVAcacia = BLOCKS.register("acacia_hhhbirch_vvvvacacia_vvvvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate = BLOCKS.register("acacia_hhhbirch_vvvvacacia_vvvvacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHBirchXXBirch = BLOCKS.register("acacia_hhbirch_xxbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVVVBirch = BLOCKS.register("acacia_hhacacia_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaHHAcaciaVVVVBirchGate = BLOCKS.register("acacia_hhacacia_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> birchHHAcacia = BLOCKS.register("birch_hhacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHAcacia = BLOCKS.register("birch_hhhacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHAcaciaVBirch = BLOCKS.register("birch_hhacacia_vbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHAcaciaVBirchGate = BLOCKS.register("birch_hhacacia_vbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHAcaciaVVAcacia = BLOCKS.register("birch_hhacacia_vvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVAcacia = BLOCKS.register("birch_hhbirch_vvvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVAcaciaGate = BLOCKS.register("birch_hhbirch_vvvacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVAcacia = BLOCKS.register("birch_hhbirch_vvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVAcaciaGate = BLOCKS.register("birch_hhbirch_vvacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHAcaciaVVVVBirchVVVVBirch = BLOCKS.register("birch_hhhacacia_vvvvbirch_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHAcaciaVVVVBirchVVVVBirchGate = BLOCKS.register("birch_hhhacacia_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHAcaciaXXAcacia = BLOCKS.register("birch_hhacacia_xxacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVAcacia = BLOCKS.register("birch_hhbirch_vvvvacacia", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVAcaciaGate = BLOCKS.register("birch_hhbirch_vvvvacacia_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> jungleHHBirch = BLOCKS.register("jungle_hhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHBirch = BLOCKS.register("jungle_hhhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHBirchVJungle = BLOCKS.register("jungle_hhbirch_vjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHBirchVJungleGate = BLOCKS.register("jungle_hhbirch_vjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHBirchVVBirch = BLOCKS.register("jungle_hhbirch_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVBirch = BLOCKS.register("jungle_hhjungle_vvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVBirchGate = BLOCKS.register("jungle_hhjungle_vvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVBirch = BLOCKS.register("jungle_hhjungle_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVBirchGate = BLOCKS.register("jungle_hhjungle_vvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHBirchVVVVJungleVVVVJungle = BLOCKS.register("jungle_hhhbirch_vvvvjungle_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHBirchVVVVJungleVVVVJungleGate = BLOCKS.register("jungle_hhhbirch_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHBirchXXBirch = BLOCKS.register("jungle_hhbirch_xxbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVBirch = BLOCKS.register("jungle_hhjungle_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVBirchGate = BLOCKS.register("jungle_hhjungle_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> birchHHJungle = BLOCKS.register("birch_hhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHJungle = BLOCKS.register("birch_hhhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHJungleVBirch = BLOCKS.register("birch_hhjungle_vbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHJungleVBirchGate = BLOCKS.register("birch_hhjungle_vbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHJungleVVJungle = BLOCKS.register("birch_hhjungle_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVJungle = BLOCKS.register("birch_hhbirch_vvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVJungleGate = BLOCKS.register("birch_hhbirch_vvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVJungle = BLOCKS.register("birch_hhbirch_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVJungleGate = BLOCKS.register("birch_hhbirch_vvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHJungleVVVVBirchVVVVBirch = BLOCKS.register("birch_hhhjungle_vvvvbirch_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHJungleVVVVBirchVVVVBirchGate = BLOCKS.register("birch_hhhjungle_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHJungleXXJungle = BLOCKS.register("birch_hhjungle_xxjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVJungle = BLOCKS.register("birch_hhbirch_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVJungleGate = BLOCKS.register("birch_hhbirch_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> warpedHHBirch = BLOCKS.register("warped_hhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHBirch = BLOCKS.register("warped_hhhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHBirchVWarped = BLOCKS.register("warped_hhbirch_vwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHBirchVWarpedGate = BLOCKS.register("warped_hhbirch_vwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHBirchVVBirch = BLOCKS.register("warped_hhbirch_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVBirch = BLOCKS.register("warped_hhwarped_vvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVBirchGate = BLOCKS.register("warped_hhwarped_vvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVBirch = BLOCKS.register("warped_hhwarped_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVBirchGate = BLOCKS.register("warped_hhwarped_vvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHBirchVVVVWarpedVVVVWarped = BLOCKS.register("warped_hhhbirch_vvvvwarped_vvvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHBirchVVVVWarpedVVVVWarpedGate = BLOCKS.register("warped_hhhbirch_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHBirchXXBirch = BLOCKS.register("warped_hhbirch_xxbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVVBirch = BLOCKS.register("warped_hhwarped_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVVBirchGate = BLOCKS.register("warped_hhwarped_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> birchHHWarped = BLOCKS.register("birch_hhwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHWarped = BLOCKS.register("birch_hhhwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHWarpedVBirch = BLOCKS.register("birch_hhwarped_vbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHWarpedVBirchGate = BLOCKS.register("birch_hhwarped_vbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHWarpedVVWarped = BLOCKS.register("birch_hhwarped_vvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVWarped = BLOCKS.register("birch_hhbirch_vvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVWarpedGate = BLOCKS.register("birch_hhbirch_vvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVWarped = BLOCKS.register("birch_hhbirch_vvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVWarpedGate = BLOCKS.register("birch_hhbirch_vvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHWarpedVVVVBirchVVVVBirch = BLOCKS.register("birch_hhhwarped_vvvvbirch_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHWarpedVVVVBirchVVVVBirchGate = BLOCKS.register("birch_hhhwarped_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHWarpedXXWarped = BLOCKS.register("birch_hhwarped_xxwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVWarped = BLOCKS.register("birch_hhbirch_vvvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVWarpedGate = BLOCKS.register("birch_hhbirch_vvvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> warpedHHOak = BLOCKS.register("warped_hhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHOak = BLOCKS.register("warped_hhhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHOakVWarped = BLOCKS.register("warped_hhoak_vwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHOakVWarpedGate = BLOCKS.register("warped_hhoak_vwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHOakVVOak = BLOCKS.register("warped_hhoak_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVOak = BLOCKS.register("warped_hhwarped_vvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVOakGate = BLOCKS.register("warped_hhwarped_vvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVOak = BLOCKS.register("warped_hhwarped_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVOakGate = BLOCKS.register("warped_hhwarped_vvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHOakVVVVWarpedVVVVWarped = BLOCKS.register("warped_hhhoak_vvvvwarped_vvvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHOakVVVVWarpedVVVVWarpedGate = BLOCKS.register("warped_hhhoak_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHOakXXOak = BLOCKS.register("warped_hhoak_xxoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVVOak = BLOCKS.register("warped_hhwarped_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVVOakGate = BLOCKS.register("warped_hhwarped_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> oakHHWarped = BLOCKS.register("oak_hhwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHWarped = BLOCKS.register("oak_hhhwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHWarpedVOak = BLOCKS.register("oak_hhwarped_voak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHWarpedVOakGate = BLOCKS.register("oak_hhwarped_voak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHWarpedVVWarped = BLOCKS.register("oak_hhwarped_vvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVWarped = BLOCKS.register("oak_hhoak_vvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVWarpedGate = BLOCKS.register("oak_hhoak_vvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVWarped = BLOCKS.register("oak_hhoak_vvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVWarpedGate = BLOCKS.register("oak_hhoak_vvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHWarpedVVVVOakVVVVOak = BLOCKS.register("oak_hhhwarped_vvvvoak_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHWarpedVVVVOakVVVVOakGate = BLOCKS.register("oak_hhhwarped_vvvvoak_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHWarpedXXWarped = BLOCKS.register("oak_hhwarped_xxwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVWarped = BLOCKS.register("oak_hhoak_vvvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVWarpedGate = BLOCKS.register("oak_hhoak_vvvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> warpedHHSpruce = BLOCKS.register("warped_hhspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHSpruce = BLOCKS.register("warped_hhhspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHSpruceVWarped = BLOCKS.register("warped_hhspruce_vwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHSpruceVWarpedGate = BLOCKS.register("warped_hhspruce_vwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHSpruceVVSpruce = BLOCKS.register("warped_hhspruce_vvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVSpruce = BLOCKS.register("warped_hhwarped_vvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVSpruceGate = BLOCKS.register("warped_hhwarped_vvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVSpruce = BLOCKS.register("warped_hhwarped_vvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVSpruceGate = BLOCKS.register("warped_hhwarped_vvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHSpruceVVVVWarpedVVVVWarped = BLOCKS.register("warped_hhhspruce_vvvvwarped_vvvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHSpruceVVVVWarpedVVVVWarpedGate = BLOCKS.register("warped_hhhspruce_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHSpruceXXSpruce = BLOCKS.register("warped_hhspruce_xxspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVVSpruce = BLOCKS.register("warped_hhwarped_vvvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVVSpruceGate = BLOCKS.register("warped_hhwarped_vvvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> spruceHHWarped = BLOCKS.register("spruce_hhwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHWarped = BLOCKS.register("spruce_hhhwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHWarpedVSpruce = BLOCKS.register("spruce_hhwarped_vspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHWarpedVSpruceGate = BLOCKS.register("spruce_hhwarped_vspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHWarpedVVWarped = BLOCKS.register("spruce_hhwarped_vvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVWarped = BLOCKS.register("spruce_hhspruce_vvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVWarpedGate = BLOCKS.register("spruce_hhspruce_vvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVWarped = BLOCKS.register("spruce_hhspruce_vvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVWarpedGate = BLOCKS.register("spruce_hhspruce_vvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHWarpedVVVVSpruceVVVVSpruce = BLOCKS.register("spruce_hhhwarped_vvvvspruce_vvvvspruce", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHHWarpedVVVVSpruceVVVVSpruceGate = BLOCKS.register("spruce_hhhwarped_vvvvspruce_vvvvspruce_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHWarpedXXWarped = BLOCKS.register("spruce_hhwarped_xxwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVVWarped = BLOCKS.register("spruce_hhspruce_vvvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceHHSpruceVVVVWarpedGate = BLOCKS.register("spruce_hhspruce_vvvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> crimsonHHJungle = BLOCKS.register("crimson_hhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHHJungle = BLOCKS.register("crimson_hhhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHJungleVCrimson = BLOCKS.register("crimson_hhjungle_vcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHJungleVCrimsonGate = BLOCKS.register("crimson_hhjungle_vcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHJungleVVJungle = BLOCKS.register("crimson_hhjungle_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVJungle = BLOCKS.register("crimson_hhcrimson_vvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVJungleGate = BLOCKS.register("crimson_hhcrimson_vvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVJungle = BLOCKS.register("crimson_hhcrimson_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVJungleGate = BLOCKS.register("crimson_hhcrimson_vvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHHJungleVVVVCrimsonVVVVCrimson = BLOCKS.register("crimson_hhhjungle_vvvvcrimson_vvvvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate = BLOCKS.register("crimson_hhhjungle_vvvvcrimson_vvvvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHJungleXXJungle = BLOCKS.register("crimson_hhjungle_xxjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVVJungle = BLOCKS.register("crimson_hhcrimson_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVVJungleGate = BLOCKS.register("crimson_hhcrimson_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> jungleHHCrimson = BLOCKS.register("jungle_hhcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHCrimson = BLOCKS.register("jungle_hhhcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHCrimsonVJungle = BLOCKS.register("jungle_hhcrimson_vjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHCrimsonVJungleGate = BLOCKS.register("jungle_hhcrimson_vjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHCrimsonVVCrimson = BLOCKS.register("jungle_hhcrimson_vvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVCrimson = BLOCKS.register("jungle_hhjungle_vvvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVCrimsonGate = BLOCKS.register("jungle_hhjungle_vvvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVCrimson = BLOCKS.register("jungle_hhjungle_vvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVCrimsonGate = BLOCKS.register("jungle_hhjungle_vvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHCrimsonVVVVJungleVVVVJungle = BLOCKS.register("jungle_hhhcrimson_vvvvjungle_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHCrimsonVVVVJungleVVVVJungleGate = BLOCKS.register("jungle_hhhcrimson_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHCrimsonXXCrimson = BLOCKS.register("jungle_hhcrimson_xxcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVCrimson = BLOCKS.register("jungle_hhjungle_vvvvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVCrimsonGate = BLOCKS.register("jungle_hhjungle_vvvvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> crimsonHHOak = BLOCKS.register("crimson_hhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHHOak = BLOCKS.register("crimson_hhhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHOakVCrimson = BLOCKS.register("crimson_hhoak_vcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHOakVCrimsonGate = BLOCKS.register("crimson_hhoak_vcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHOakVVOak = BLOCKS.register("crimson_hhoak_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVOak = BLOCKS.register("crimson_hhcrimson_vvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVOakGate = BLOCKS.register("crimson_hhcrimson_vvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVOak = BLOCKS.register("crimson_hhcrimson_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVOakGate = BLOCKS.register("crimson_hhcrimson_vvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHHOakVVVVCrimsonVVVVCrimson = BLOCKS.register("crimson_hhhoak_vvvvcrimson_vvvvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHHOakVVVVCrimsonVVVVCrimsonGate = BLOCKS.register("crimson_hhhoak_vvvvcrimson_vvvvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHOakXXOak = BLOCKS.register("crimson_hhoak_xxoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVVOak = BLOCKS.register("crimson_hhcrimson_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVVOakGate = BLOCKS.register("crimson_hhcrimson_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> oakHHCrimson = BLOCKS.register("oak_hhcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHCrimson = BLOCKS.register("oak_hhhcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHCrimsonVOak = BLOCKS.register("oak_hhcrimson_voak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHCrimsonVOakGate = BLOCKS.register("oak_hhcrimson_voak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHCrimsonVVCrimson = BLOCKS.register("oak_hhcrimson_vvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVCrimson = BLOCKS.register("oak_hhoak_vvvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVCrimsonGate = BLOCKS.register("oak_hhoak_vvvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVCrimson = BLOCKS.register("oak_hhoak_vvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVCrimsonGate = BLOCKS.register("oak_hhoak_vvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHCrimsonVVVVOakVVVVOak = BLOCKS.register("oak_hhhcrimson_vvvvoak_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHCrimsonVVVVOakVVVVOakGate = BLOCKS.register("oak_hhhcrimson_vvvvoak_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHCrimsonXXCrimson = BLOCKS.register("oak_hhcrimson_xxcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVCrimson = BLOCKS.register("oak_hhoak_vvvvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVCrimsonGate = BLOCKS.register("oak_hhoak_vvvvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> crimsonHHDarkoak = BLOCKS.register("crimson_hhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHHDarkoak = BLOCKS.register("crimson_hhhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHDarkoakVCrimson = BLOCKS.register("crimson_hhdark_oak_vcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHDarkoakVCrimsonGate = BLOCKS.register("crimson_hhdark_oak_vcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHDarkoakVVDarkoak = BLOCKS.register("crimson_hhdark_oak_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVDarkoak = BLOCKS.register("crimson_hhcrimson_vvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVDarkoakGate = BLOCKS.register("crimson_hhcrimson_vvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVDarkoak = BLOCKS.register("crimson_hhcrimson_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVDarkoakGate = BLOCKS.register("crimson_hhcrimson_vvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHHDarkoakVVVVCrimsonVVVVCrimson = BLOCKS.register("crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate = BLOCKS.register("crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHDarkoakXXDarkoak = BLOCKS.register("crimson_hhdark_oak_xxdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVVDarkoak = BLOCKS.register("crimson_hhcrimson_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonHHCrimsonVVVVDarkoakGate = BLOCKS.register("crimson_hhcrimson_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> darkoakHHCrimson = BLOCKS.register("dark_oak_hhcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHCrimson = BLOCKS.register("dark_oak_hhhcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHCrimsonVDarkoak = BLOCKS.register("dark_oak_hhcrimson_vdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHCrimsonVDarkoakGate = BLOCKS.register("dark_oak_hhcrimson_vdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHCrimsonVVCrimson = BLOCKS.register("dark_oak_hhcrimson_vvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVCrimson = BLOCKS.register("dark_oak_hhdark_oak_vvvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVCrimsonGate = BLOCKS.register("dark_oak_hhdark_oak_vvvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVCrimson = BLOCKS.register("dark_oak_hhdark_oak_vvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVCrimsonGate = BLOCKS.register("dark_oak_hhdark_oak_vvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak = BLOCKS.register("dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate = BLOCKS.register("dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHCrimsonXXCrimson = BLOCKS.register("dark_oak_hhcrimson_xxcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVCrimson = BLOCKS.register("dark_oak_hhdark_oak_vvvvcrimson", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVCrimsonGate = BLOCKS.register("dark_oak_hhdark_oak_vvvvcrimson_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> mangroveHHOak = BLOCKS.register("mangrove_hhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHOak = BLOCKS.register("mangrove_hhhoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHOakVMangrove = BLOCKS.register("mangrove_hhoak_vmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHOakVMangroveGate = BLOCKS.register("mangrove_hhoak_vmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHOakVVOak = BLOCKS.register("mangrove_hhoak_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVOak = BLOCKS.register("mangrove_hhmangrove_vvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVOakGate = BLOCKS.register("mangrove_hhmangrove_vvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVOak = BLOCKS.register("mangrove_hhmangrove_vvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVOakGate = BLOCKS.register("mangrove_hhmangrove_vvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHOakVVVVMangroveVVVVMangrove = BLOCKS.register("mangrove_hhhoak_vvvvmangrove_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHOakVVVVMangroveVVVVMangroveGate = BLOCKS.register("mangrove_hhhoak_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHOakXXOak = BLOCKS.register("mangrove_hhoak_xxoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVOak = BLOCKS.register("mangrove_hhmangrove_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVOakGate = BLOCKS.register("mangrove_hhmangrove_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> oakHHMangrove = BLOCKS.register("oak_hhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHMangrove = BLOCKS.register("oak_hhhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHMangroveVOak = BLOCKS.register("oak_hhmangrove_voak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHMangroveVOakGate = BLOCKS.register("oak_hhmangrove_voak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHMangroveVVMangrove = BLOCKS.register("oak_hhmangrove_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVMangrove = BLOCKS.register("oak_hhoak_vvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVMangroveGate = BLOCKS.register("oak_hhoak_vvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVMangrove = BLOCKS.register("oak_hhoak_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVMangroveGate = BLOCKS.register("oak_hhoak_vvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHMangroveVVVVOakVVVVOak = BLOCKS.register("oak_hhhmangrove_vvvvoak_vvvvoak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHHMangroveVVVVOakVVVVOakGate = BLOCKS.register("oak_hhhmangrove_vvvvoak_vvvvoak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHMangroveXXMangrove = BLOCKS.register("oak_hhmangrove_xxmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVMangrove = BLOCKS.register("oak_hhoak_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> oakHHOakVVVVMangroveGate = BLOCKS.register("oak_hhoak_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> mangroveHHBirch = BLOCKS.register("mangrove_hhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHBirch = BLOCKS.register("mangrove_hhhbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHBirchVMangrove = BLOCKS.register("mangrove_hhbirch_vmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHBirchVMangroveGate = BLOCKS.register("mangrove_hhbirch_vmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHBirchVVBirch = BLOCKS.register("mangrove_hhbirch_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVBirch = BLOCKS.register("mangrove_hhmangrove_vvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVBirchGate = BLOCKS.register("mangrove_hhmangrove_vvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVBirch = BLOCKS.register("mangrove_hhmangrove_vvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVBirchGate = BLOCKS.register("mangrove_hhmangrove_vvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHBirchVVVVMangroveVVVVMangrove = BLOCKS.register("mangrove_hhhbirch_vvvvmangrove_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHBirchVVVVMangroveVVVVMangroveGate = BLOCKS.register("mangrove_hhhbirch_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHBirchXXBirch = BLOCKS.register("mangrove_hhbirch_xxbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVBirch = BLOCKS.register("mangrove_hhmangrove_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVBirchGate = BLOCKS.register("mangrove_hhmangrove_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> birchHHMangrove = BLOCKS.register("birch_hhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHMangrove = BLOCKS.register("birch_hhhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHMangroveVBirch = BLOCKS.register("birch_hhmangrove_vbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHMangroveVBirchGate = BLOCKS.register("birch_hhmangrove_vbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHMangroveVVMangrove = BLOCKS.register("birch_hhmangrove_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVMangrove = BLOCKS.register("birch_hhbirch_vvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVMangroveGate = BLOCKS.register("birch_hhbirch_vvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVMangrove = BLOCKS.register("birch_hhbirch_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVMangroveGate = BLOCKS.register("birch_hhbirch_vvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHMangroveVVVVBirchVVVVBirch = BLOCKS.register("birch_hhhmangrove_vvvvbirch_vvvvbirch", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHHMangroveVVVVBirchVVVVBirchGate = BLOCKS.register("birch_hhhmangrove_vvvvbirch_vvvvbirch_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHMangroveXXMangrove = BLOCKS.register("birch_hhmangrove_xxmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVMangrove = BLOCKS.register("birch_hhbirch_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchHHBirchVVVVMangroveGate = BLOCKS.register("birch_hhbirch_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> mangroveHHJungle = BLOCKS.register("mangrove_hhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHJungle = BLOCKS.register("mangrove_hhhjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHJungleVMangrove = BLOCKS.register("mangrove_hhjungle_vmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHJungleVMangroveGate = BLOCKS.register("mangrove_hhjungle_vmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHJungleVVJungle = BLOCKS.register("mangrove_hhjungle_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVJungle = BLOCKS.register("mangrove_hhmangrove_vvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVJungleGate = BLOCKS.register("mangrove_hhmangrove_vvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVJungle = BLOCKS.register("mangrove_hhmangrove_vvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVJungleGate = BLOCKS.register("mangrove_hhmangrove_vvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHJungleVVVVMangroveVVVVMangrove = BLOCKS.register("mangrove_hhhjungle_vvvvmangrove_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHJungleVVVVMangroveVVVVMangroveGate = BLOCKS.register("mangrove_hhhjungle_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHJungleXXJungle = BLOCKS.register("mangrove_hhjungle_xxjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVJungle = BLOCKS.register("mangrove_hhmangrove_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVJungleGate = BLOCKS.register("mangrove_hhmangrove_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> jungleHHMangrove = BLOCKS.register("jungle_hhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHMangrove = BLOCKS.register("jungle_hhhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHMangroveVJungle = BLOCKS.register("jungle_hhmangrove_vjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHMangroveVJungleGate = BLOCKS.register("jungle_hhmangrove_vjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHMangroveVVMangrove = BLOCKS.register("jungle_hhmangrove_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVMangrove = BLOCKS.register("jungle_hhjungle_vvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVMangroveGate = BLOCKS.register("jungle_hhjungle_vvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVMangrove = BLOCKS.register("jungle_hhjungle_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVMangroveGate = BLOCKS.register("jungle_hhjungle_vvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHMangroveVVVVJungleVVVVJungle = BLOCKS.register("jungle_hhhmangrove_vvvvjungle_vvvvjungle", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHHMangroveVVVVJungleVVVVJungleGate = BLOCKS.register("jungle_hhhmangrove_vvvvjungle_vvvvjungle_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHMangroveXXMangrove = BLOCKS.register("jungle_hhmangrove_xxmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVMangrove = BLOCKS.register("jungle_hhjungle_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleHHJungleVVVVMangroveGate = BLOCKS.register("jungle_hhjungle_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> mangroveHHDarkoak = BLOCKS.register("mangrove_hhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHDarkoak = BLOCKS.register("mangrove_hhhdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHDarkoakVMangrove = BLOCKS.register("mangrove_hhdark_oak_vmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHDarkoakVMangroveGate = BLOCKS.register("mangrove_hhdark_oak_vmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHDarkoakVVDarkoak = BLOCKS.register("mangrove_hhdark_oak_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVDarkoak = BLOCKS.register("mangrove_hhmangrove_vvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVDarkoakGate = BLOCKS.register("mangrove_hhmangrove_vvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVDarkoak = BLOCKS.register("mangrove_hhmangrove_vvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVDarkoakGate = BLOCKS.register("mangrove_hhmangrove_vvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHDarkoakVVVVMangroveVVVVMangrove = BLOCKS.register("mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHDarkoakVVVVMangroveVVVVMangroveGate = BLOCKS.register("mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHDarkoakXXDarkoak = BLOCKS.register("mangrove_hhdark_oak_xxdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVDarkoak = BLOCKS.register("mangrove_hhmangrove_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVDarkoakGate = BLOCKS.register("mangrove_hhmangrove_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> darkoakHHMangrove = BLOCKS.register("dark_oak_hhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHMangrove = BLOCKS.register("dark_oak_hhhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHMangroveVDarkoak = BLOCKS.register("dark_oak_hhmangrove_vdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHMangroveVDarkoakGate = BLOCKS.register("dark_oak_hhmangrove_vdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHMangroveVVMangrove = BLOCKS.register("dark_oak_hhmangrove_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVMangrove = BLOCKS.register("dark_oak_hhdark_oak_vvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVMangroveGate = BLOCKS.register("dark_oak_hhdark_oak_vvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVMangrove = BLOCKS.register("dark_oak_hhdark_oak_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVMangroveGate = BLOCKS.register("dark_oak_hhdark_oak_vvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHMangroveVVVVDarkoakVVVVDarkoak = BLOCKS.register("dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHHMangroveVVVVDarkoakVVVVDarkoakGate = BLOCKS.register("dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHMangroveXXMangrove = BLOCKS.register("dark_oak_hhmangrove_xxmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVMangrove = BLOCKS.register("dark_oak_hhdark_oak_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakHHDarkoakVVVVMangroveGate = BLOCKS.register("dark_oak_hhdark_oak_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> mangroveHHWarped = BLOCKS.register("mangrove_hhwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHWarped = BLOCKS.register("mangrove_hhhwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHWarpedVMangrove = BLOCKS.register("mangrove_hhwarped_vmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHWarpedVMangroveGate = BLOCKS.register("mangrove_hhwarped_vmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHWarpedVVWarped = BLOCKS.register("mangrove_hhwarped_vvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVWarped = BLOCKS.register("mangrove_hhmangrove_vvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVWarpedGate = BLOCKS.register("mangrove_hhmangrove_vvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVWarped = BLOCKS.register("mangrove_hhmangrove_vvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVWarpedGate = BLOCKS.register("mangrove_hhmangrove_vvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHWarpedVVVVMangroveVVVVMangrove = BLOCKS.register("mangrove_hhhwarped_vvvvmangrove_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHHWarpedVVVVMangroveVVVVMangroveGate = BLOCKS.register("mangrove_hhhwarped_vvvvmangrove_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHWarpedXXWarped = BLOCKS.register("mangrove_hhwarped_xxwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVWarped = BLOCKS.register("mangrove_hhmangrove_vvvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> mangroveHHMangroveVVVVWarpedGate = BLOCKS.register("mangrove_hhmangrove_vvvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> warpedHHMangrove = BLOCKS.register("warped_hhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHMangrove = BLOCKS.register("warped_hhhmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHMangroveVWarped = BLOCKS.register("warped_hhmangrove_vwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHMangroveVWarpedGate = BLOCKS.register("warped_hhmangrove_vwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHMangroveVVMangrove = BLOCKS.register("warped_hhmangrove_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVMangrove = BLOCKS.register("warped_hhwarped_vvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVMangroveGate = BLOCKS.register("warped_hhwarped_vvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVMangrove = BLOCKS.register("warped_hhwarped_vvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVMangroveGate = BLOCKS.register("warped_hhwarped_vvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHMangroveVVVVWarpedVVVVWarped = BLOCKS.register("warped_hhhmangrove_vvvvwarped_vvvvwarped", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHHMangroveVVVVWarpedVVVVWarpedGate = BLOCKS.register("warped_hhhmangrove_vvvvwarped_vvvvwarped_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHMangroveXXMangrove = BLOCKS.register("warped_hhmangrove_xxmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVVMangrove = BLOCKS.register("warped_hhwarped_vvvvmangrove", () -> new Fence(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedHHWarpedVVVVMangroveGate = BLOCKS.register("warped_hhwarped_vvvvmangrove_fence_gate_closed", () -> new FenceGate(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> cobblestoneModern = BLOCKS.register("cobblestone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneBuilding = BLOCKS.register("cobblestone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneCastle = BLOCKS.register("cobblestone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> mossyCobblestoneModern = BLOCKS.register("mossy_cobblestone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> mossyCobblestoneBuilding = BLOCKS.register("mossy_cobblestone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> mossyCobblestoneCastle = BLOCKS.register("mossy_cobblestone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> stoneModern = BLOCKS.register("stone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> stoneBuilding = BLOCKS.register("stone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> stoneCastle = BLOCKS.register("stone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> stoneBrickModern = BLOCKS.register("stone_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> stoneBrickBuilding = BLOCKS.register("stone_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> stoneBrickCastle = BLOCKS.register("stone_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> mossyStoneBrickModern = BLOCKS.register("mossy_stone_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> mossyStoneBrickBuilding = BLOCKS.register("mossy_stone_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> mossyStoneBrickCastle = BLOCKS.register("mossy_stone_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> andesiteModern = BLOCKS.register("andesite_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> andesiteBuilding = BLOCKS.register("andesite_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> andesiteCastle = BLOCKS.register("andesite_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> dioriteModern = BLOCKS.register("diorite_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dioriteBuilding = BLOCKS.register("diorite_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> dioriteCastle = BLOCKS.register("diorite_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> graniteModern = BLOCKS.register("granite_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> graniteBuilding = BLOCKS.register("granite_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> graniteCastle = BLOCKS.register("granite_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> sandstoneModern = BLOCKS.register("sandstone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> sandstoneBuilding = BLOCKS.register("sandstone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> sandstoneCastle = BLOCKS.register("sandstone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> redSandstoneModern = BLOCKS.register("red_sandstone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> redSandstoneBuilding = BLOCKS.register("red_sandstone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> redSandstoneCastle = BLOCKS.register("red_sandstone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(0.8f, 0.8f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> bricksModern = BLOCKS.register("bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> bricksBuilding = BLOCKS.register("bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> bricksCastle = BLOCKS.register("bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> prismarineModern = BLOCKS.register("prismarine_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> prismarineBuilding = BLOCKS.register("prismarine_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> prismarineCastle = BLOCKS.register("prismarine_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> netherBrickModern = BLOCKS.register("nether_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> netherBrickBuilding = BLOCKS.register("nether_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> netherBrickCastle = BLOCKS.register("nether_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> redNetherBrickModern = BLOCKS.register("red_nether_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> redNetherBrickBuilding = BLOCKS.register("red_nether_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> redNetherBrickCastle = BLOCKS.register("red_nether_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> endStoneBrickModern = BLOCKS.register("end_stone_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> endStoneBrickBuilding = BLOCKS.register("end_stone_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 9.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> endStoneBrickCastle = BLOCKS.register("end_stone_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0f, 9.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> blackstoneModern = BLOCKS.register("blackstone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> blackstoneBuilding = BLOCKS.register("blackstone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> blackstoneCastle = BLOCKS.register("blackstone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> polishedBlackstoneModern = BLOCKS.register("polished_blackstone_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polishedBlackstoneBuilding = BLOCKS.register("polished_blackstone_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polishedBlackstoneCastle = BLOCKS.register("polished_blackstone_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> polishedBlackstoneBrickModern = BLOCKS.register("polished_blackstone_bricks_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polishedBlackstoneBrickBuilding = BLOCKS.register("polished_blackstone_bricks_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));
    public static final RegistryObject<Block> polishedBlackstoneBrickCastle = BLOCKS.register("polished_blackstone_bricks_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5f, 6.0f).sound(SoundType.STONE)));

    public static final RegistryObject<Block> cobbledDeepslateModern = BLOCKS.register("cobbled_deepslate_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> cobbledDeepslateBuilding = BLOCKS.register("cobbled_deepslate_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> cobbledDeepslateCastle = BLOCKS.register("cobbled_deepslate_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> polishedDeepslateModern = BLOCKS.register("polished_deepslate_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> polishedDeepslateBuilding = BLOCKS.register("polished_deepslate_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> polishedDeepslateCastle = BLOCKS.register("polished_deepslate_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> deepslateBrickModern = BLOCKS.register("deepslate_brick_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> deepslateBrickBuilding = BLOCKS.register("deepslate_brick_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> deepslateBrickCastle = BLOCKS.register("deepslate_brick_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> deepslateTileModern = BLOCKS.register("deepslate_tile_modern", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> deepslateTileBuilding = BLOCKS.register("deepslate_tile_building", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));
    public static final RegistryObject<Block> deepslateTileCastle = BLOCKS.register("deepslate_tile_castle", () -> new Wall(Block.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5f, 6.0f).sound(SoundType.DEEPSLATE_TILES)));

    public static final RegistryObject<Block> oakWallBuilding = BLOCKS.register("oak_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> birchWallBuilding = BLOCKS.register("birch_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> spruceWallBuilding = BLOCKS.register("spruce_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> acaciaWallBuilding = BLOCKS.register("acacia_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> jungleWallBuilding = BLOCKS.register("jungle_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> darkoakWallBuilding = BLOCKS.register("dark_oak_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> crimsonWallBuilding = BLOCKS.register("crimson_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> warpedWallBuilding = BLOCKS.register("warped_wall_building", () -> new WoodWall(Block.Properties.of(Material.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> cobblestoneCopperFence = BLOCKS.register("cobblestone_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneExposedCopperFence = BLOCKS.register("cobblestone_exposed_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWeatheredCopperFence = BLOCKS.register("cobblestone_weathered_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneOxidizedCopperFence = BLOCKS.register("cobblestone_oxidized_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> copperFenceGate = BLOCKS.register("copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> exposedCopperFenceGate = BLOCKS.register("exposed_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> weatheredCopperFenceGate = BLOCKS.register("weathered_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> oxidizedCopperFenceGate = BLOCKS.register("oxidized_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> cobblestoneWaxedCopperFence = BLOCKS.register("cobblestone_waxed_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedExposedCopperFence = BLOCKS.register("cobblestone_waxed_exposed_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedWeatheredCopperFence = BLOCKS.register("cobblestone_waxed_weathered_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedOxidizedCopperFence = BLOCKS.register("cobblestone_waxed_oxidized_copper_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> waxedCopperFenceGate = BLOCKS.register("waxed_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> waxedExposedCopperFenceGate = BLOCKS.register("waxed_exposed_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> waxedWeatheredCopperFenceGate = BLOCKS.register("waxed_weathered_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> waxedOxidizedCopperFenceGate = BLOCKS.register("waxed_oxidized_copper_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> cobblestoneIronFence = BLOCKS.register("cobblestone_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneExposedIronFence = BLOCKS.register("cobblestone_exposed_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWeatheredIronFence = BLOCKS.register("cobblestone_weathered_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneOxidizedIronFence = BLOCKS.register("cobblestone_oxidized_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ironFenceGate = BLOCKS.register("iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> exposedIronFenceGate = BLOCKS.register("exposed_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> weatheredIronFenceGate = BLOCKS.register("weathered_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> oxidizedIronFenceGate = BLOCKS.register("oxidized_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> cobblestoneWaxedIronFence = BLOCKS.register("cobblestone_waxed_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedExposedIronFence = BLOCKS.register("cobblestone_waxed_exposed_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.EXPOSED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedWeatheredIronFence = BLOCKS.register("cobblestone_waxed_weathered_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.WEATHERED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> cobblestoneWaxedOxidizedIronFence = BLOCKS.register("cobblestone_waxed_oxidized_iron_fence", () -> new MetalFence(WeatheringFence.WeatherState.OXIDIZED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static final RegistryObject<Block> waxedIronFenceGate = BLOCKS.register("waxed_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> waxedExposedIronFenceGate = BLOCKS.register("waxed_exposed_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> waxedWeatheredIronFenceGate = BLOCKS.register("waxed_weathered_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> waxedOxidizedIronFenceGate = BLOCKS.register("waxed_oxidized_iron_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, Block.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> cobblestoneGoldFence = BLOCKS.register("cobblestone_gold_fence", () -> new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.STONE)));
    public static final RegistryObject<Block> goldFenceGate = BLOCKS.register("gold_fence_gate_closed", () -> new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));

    @SubscribeEvent()
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getItemStack().getItem() instanceof HoneycombItem) {
            if (WaxedMetal.getWaxed(event.getWorld().getBlockState(event.getPos())).orElse(null) != null) {
                event.getWorld().levelEvent(event.getPlayer(), 3003, event.getPos(), 0);
                event.getWorld().setBlockAndUpdate(event.getPos(), WaxedMetal.getWaxed(event.getWorld().getBlockState(event.getPos())).orElse(null));
                if (event.getPlayer() != null && !event.getPlayer().isCreative()) {
                    event.getItemStack().shrink(1);
                }
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.sidedSuccess(event.getWorld().isClientSide));
            }
        }
    }

}
