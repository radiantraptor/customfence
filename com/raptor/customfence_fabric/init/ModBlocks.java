package com.raptor.customfence_fabric.init;

import com.google.common.collect.ImmutableMap;
import com.raptor.customfence_fabric.Main;
import com.raptor.customfence_fabric.blocks.*;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.class_2248;
import net.minecraft.class_2378;
import net.minecraft.class_2498;
import net.minecraft.class_2960;
import net.minecraft.class_3614;
import net.minecraft.item.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;


@SuppressWarnings({"WeakerAccess", "unused"})
public class ModBlocks {

    public static final class_2248 HHOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHHOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHOakVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHOakXXOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 HHBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHHBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHBirchVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHBirchXXBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 HHSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHHSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHSpruceVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHSpruceXXSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 HHJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHHJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHJungleVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHJungleXXJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 HHAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHHAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHAcaciaVVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHAcaciaXXAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 HHDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHHDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHDarkoakVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHDarkoakXXDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 HHWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHHWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHWarpedVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHWarpedXXWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 HHCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHHCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHCrimsonVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHCrimsonXXCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 HHMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHHMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHMangroveVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 HHMangroveXXMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 spruceHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHOakVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHOakVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHOakVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHOakVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHOakVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHOakXXOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 oakHHSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHSpruceVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHSpruceVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHSpruceVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHSpruceVVVVOakVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHSpruceVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHSpruceXXSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 oakHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHBirchVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHBirchVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHBirchVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHBirchVVVVOakVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHBirchVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHBirchXXBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 birchHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHOakVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHOakVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHOakVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHOakVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHOakVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHOakXXOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 spruceHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHBirchVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHBirchVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHBirchVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHBirchVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHBirchVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHBirchXXBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 birchHHSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHSpruceVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHSpruceVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHSpruceVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHSpruceVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHSpruceVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHSpruceXXSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 darkoakHHSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHSpruceVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHSpruceVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHSpruceVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHSpruceVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHSpruceXXSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 spruceHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHDarkoakVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHDarkoakVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHDarkoakVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHDarkoakVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 darkoakHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHOakVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHOakVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHOakVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHOakVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHOakVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHOakXXOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 oakHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHDarkoakVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHDarkoakVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHDarkoakVVVVOakVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHDarkoakVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 darkoakHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHJungleVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHJungleVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHJungleVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHJungleVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHJungleXXJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 jungleHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHDarkoakVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHDarkoakVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHDarkoakVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHDarkoakVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 acaciaHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHJungleVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHJungleVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHJungleVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHHJungleVVVVAcaciaVVVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHJungleXXJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 jungleHHAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHAcaciaVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHAcaciaVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHAcaciaVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHAcaciaVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHAcaciaVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHAcaciaXXAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 acaciaHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHBirchVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHBirchVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHBirchVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHHBirchVVVVAcaciaVVVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHBirchXXBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaHHAcaciaVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 birchHHAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHAcaciaVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHAcaciaVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHAcaciaVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHAcaciaVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHAcaciaVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHAcaciaXXAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVAcacia = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVAcaciaGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 jungleHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHBirchVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHBirchVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHBirchVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHBirchVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHBirchVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHBirchXXBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 birchHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHJungleVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHJungleVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHJungleVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHJungleVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHJungleVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHJungleXXJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 warpedHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHBirchVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHBirchVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHBirchVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHBirchVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHBirchVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHBirchXXBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 birchHHWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHWarpedVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHWarpedVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHWarpedVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHWarpedVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHWarpedVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHWarpedXXWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 warpedHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHOakVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHOakVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHOakVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHOakVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHOakVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHOakXXOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 oakHHWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHWarpedVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHWarpedVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHWarpedVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHWarpedVVVVOakVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHWarpedVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHWarpedXXWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 warpedHHSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHSpruceVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHSpruceVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHSpruceVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHSpruceVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHSpruceVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHSpruceXXSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 spruceHHWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHWarpedVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHWarpedVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHWarpedVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHWarpedVVVVSpruceVVVVSpruce = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHHWarpedVVVVSpruceVVVVSpruceGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHWarpedXXWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceHHSpruceVVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 crimsonHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHJungleVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHJungleVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHJungleVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHHJungleVVVVCrimsonVVVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHJungleXXJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 jungleHHCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHCrimsonVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHCrimsonVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHCrimsonVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHCrimsonVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHCrimsonVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHCrimsonXXCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 crimsonHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHOakVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHOakVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHOakVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHHOakVVVVCrimsonVVVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHHOakVVVVCrimsonVVVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHOakXXOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 oakHHCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHCrimsonVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHCrimsonVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHCrimsonVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHCrimsonVVVVOakVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHCrimsonVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHCrimsonXXCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 crimsonHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHDarkoakVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHDarkoakVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHHDarkoakVVVVCrimsonVVVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonHHCrimsonVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 darkoakHHCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHCrimsonVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHCrimsonVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHCrimsonVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHCrimsonXXCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVCrimson = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVCrimsonGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 mangroveHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHOakVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHOakVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHOakVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHOakVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHOakVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHOakXXOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 oakHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHMangroveVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHMangroveVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHMangroveVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHMangroveVVVVOakVVVVOak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHHMangroveVVVVOakVVVVOakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHMangroveXXMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 oakHHOakVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 mangroveHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHBirchVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHBirchVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHBirchVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHBirchVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHBirchVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHBirchXXBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 birchHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHMangroveVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHMangroveVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHMangroveVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHMangroveVVVVBirchVVVVBirch = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHHMangroveVVVVBirchVVVVBirchGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHMangroveXXMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchHHBirchVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 mangroveHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHJungleVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHJungleVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHJungleVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHJungleVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHJungleVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHJungleXXJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 jungleHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHMangroveVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHMangroveVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHMangroveVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHMangroveVVVVJungleVVVVJungle = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHHMangroveVVVVJungleVVVVJungleGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHMangroveXXMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleHHJungleVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 mangroveHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHDarkoakVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHDarkoakVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHDarkoakVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHDarkoakVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHDarkoakVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHDarkoakXXDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 darkoakHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHMangroveVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHMangroveVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHMangroveVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHMangroveVVVVDarkoakVVVVDarkoak = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHHMangroveVVVVDarkoakVVVVDarkoakGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHMangroveXXMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakHHDarkoakVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 mangroveHHWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHWarpedVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHWarpedVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHWarpedVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHWarpedVVVVMangroveVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHHWarpedVVVVMangroveVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHWarpedXXWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 mangroveHHMangroveVVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 warpedHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHMangroveVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHMangroveVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHMangroveVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHMangroveVVVVWarpedVVVVWarped = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHHMangroveVVVVWarpedVVVVWarpedGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHMangroveXXMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVVMangrove = new Fence(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedHHWarpedVVVVMangroveGate = new FenceGate(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 cobblestoneModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 mossyCobblestoneModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 mossyCobblestoneBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 mossyCobblestoneCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 stoneModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 stoneBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 stoneCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 stoneBrickModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 stoneBrickBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 stoneBrickCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 mossyStoneBrickModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 mossyStoneBrickBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 mossyStoneBrickCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 andesiteModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 andesiteBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 andesiteCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 dioriteModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 dioriteBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 dioriteCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 graniteModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 graniteBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 graniteCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 sandstoneModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(0.8F, 0.8F).method_9626(class_2498.field_11544));
    public static final class_2248 sandstoneBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(0.8F, 0.8F).method_9626(class_2498.field_11544));
    public static final class_2248 sandstoneCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(0.8F, 0.8F).method_9626(class_2498.field_11544));

    public static final class_2248 redSandstoneModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(0.8F, 0.8F).method_9626(class_2498.field_11544));
    public static final class_2248 redSandstoneBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(0.8F, 0.8F).method_9626(class_2498.field_11544));
    public static final class_2248 redSandstoneCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(0.8F, 0.8F).method_9626(class_2498.field_11544));

    public static final class_2248 bricksModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 bricksBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 bricksCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 prismarineModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 prismarineBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 prismarineCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 netherBrickModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_22146));
    public static final class_2248 netherBrickBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_22146));
    public static final class_2248 netherBrickCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_22146));

    public static final class_2248 redNetherBrickModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_22146));
    public static final class_2248 redNetherBrickBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_22146));
    public static final class_2248 redNetherBrickCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_22146));

    public static final class_2248 endStoneBrickModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.0F, 9.0F).method_9626(class_2498.field_11544));
    public static final class_2248 endStoneBrickBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.0F, 9.0F).method_9626(class_2498.field_11544));
    public static final class_2248 endStoneBrickCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.0F, 9.0F).method_9626(class_2498.field_11544));

    public static final class_2248 blackstoneModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 blackstoneBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 blackstoneCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 polishedBlackstoneModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 polishedBlackstoneBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 polishedBlackstoneCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(2.0F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 polishedBlackstoneBrickModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 polishedBlackstoneBrickBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 polishedBlackstoneBrickCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(1.5F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 cobbledDeepslateModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29033));
    public static final class_2248 cobbledDeepslateBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29033));
    public static final class_2248 cobbledDeepslateCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29033));

    public static final class_2248 polishedDeepslateModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29033));
    public static final class_2248 polishedDeepslateBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29033));
    public static final class_2248 polishedDeepslateCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29033));

    public static final class_2248 deepslateBrickModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29034));
    public static final class_2248 deepslateBrickBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29034));
    public static final class_2248 deepslateBrickCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29034));

    public static final class_2248 deepslateTileModern = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29035));
    public static final class_2248 deepslateTileBuilding = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29035));
    public static final class_2248 deepslateTileCastle = new Wall(FabricBlockSettings.method_9637(class_3614.field_15914).method_29292().method_9629(3.5F, 6.0F).method_9626(class_2498.field_29035));

    public static final class_2248 oakWallBuilding = new WoodWall(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 birchWallBuilding = new WoodWall(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 spruceWallBuilding = new WoodWall(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 acaciaWallBuilding = new WoodWall(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 jungleWallBuilding = new WoodWall(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 darkoakWallBuilding = new WoodWall(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 crimsonWallBuilding = new WoodWall(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));
    public static final class_2248 warpedWallBuilding = new WoodWall(FabricBlockSettings.method_9637(class_3614.field_15932).method_9629(2.0F, 3.0F).method_9626(class_2498.field_11547));

    public static final class_2248 cobblestoneCopperFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneExposedCopperFence = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneWeatheredCopperFence = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneOxidizedCopperFence = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 copperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 exposedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 weatheredCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 oxidizedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));

    public static final class_2248 cobblestoneWaxedCopperFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneWaxedExposedCopperFence = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneWaxedWeatheredCopperFence = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneWaxedOxidizedCopperFence = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 waxedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 waxedExposedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 waxedWeatheredCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 waxedOxidizedCopperFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));

    public static final class_2248 cobblestoneIronFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneExposedIronFence = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneWeatheredIronFence = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneOxidizedIronFence = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 ironFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 exposedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 weatheredIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 oxidizedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));

    public static final class_2248 cobblestoneWaxedIronFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneWaxedExposedIronFence = new MetalFence(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneWaxedWeatheredIronFence = new MetalFence(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 cobblestoneWaxedOxidizedIronFence = new MetalFence(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));

    public static final class_2248 waxedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 waxedExposedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.EXPOSED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 waxedWeatheredIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.WEATHERED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));
    public static final class_2248 waxedOxidizedIronFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.OXIDIZED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));

    public static final class_2248 cobblestoneGoldFence = new MetalFence(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_11544));
    public static final class_2248 goldFenceGate = new MetalFenceGate(WeatheringFence.WeatherState.UNAFFECTED, FabricBlockSettings.method_9637(class_3614.field_15953).method_9629(3.0F, 6.0F).method_9626(class_2498.field_27204));

    public static void registerBlocks() {

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhoak_fence_gate_closed"), HHOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhhoak_fence_gate_closed"), HHHOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhoak_vvoak_fence_gate_closed"), HHOakVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhoak_xxoak_fence_gate_closed"), HHOakXXOakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhbirch_fence_gate_closed"), HHBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhhbirch_fence_gate_closed"), HHHBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhbirch_vvbirch_fence_gate_closed"), HHBirchVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhbirch_xxbirch_fence_gate_closed"), HHBirchXXBirchGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhspruce_fence_gate_closed"), HHSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhhspruce_fence_gate_closed"), HHHSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhspruce_vvspruce_fence_gate_closed"), HHSpruceVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhspruce_xxspruce_fence_gate_closed"), HHSpruceXXSpruceGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhjungle_fence_gate_closed"), HHJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhhjungle_fence_gate_closed"), HHHJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhjungle_vvjungle_fence_gate_closed"), HHJungleVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhjungle_xxjungle_fence_gate_closed"), HHJungleXXJungleGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhacacia_fence_gate_closed"), HHAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhhacacia_fence_gate_closed"), HHHAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhacacia_vvacacia_fence_gate_closed"), HHAcaciaVVAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhacacia_xxacacia_fence_gate_closed"), HHAcaciaXXAcaciaGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhdark_oak_fence_gate_closed"), HHDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhhdark_oak_fence_gate_closed"), HHHDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhdark_oak_vvdark_oak_fence_gate_closed"), HHDarkoakVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhdark_oak_xxdark_oak_fence_gate_closed"), HHDarkoakXXDarkoakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhwarped_fence_gate_closed"), HHWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhhwarped_fence_gate_closed"), HHHWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhwarped_vvwarped_fence_gate_closed"), HHWarpedVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhwarped_xxwarped_fence_gate_closed"), HHWarpedXXWarpedGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhcrimson_fence_gate_closed"), HHCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhhcrimson_fence_gate_closed"), HHHCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhcrimson_vvcrimson_fence_gate_closed"), HHCrimsonVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhcrimson_xxcrimson_fence_gate_closed"), HHCrimsonXXCrimsonGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhmangrove_fence_gate_closed"), HHMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhhmangrove_fence_gate_closed"), HHHMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhmangrove_vvmangrove_fence_gate_closed"), HHMangroveVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "hhmangrove_xxmangrove_fence_gate_closed"), HHMangroveXXMangroveGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhoak"), spruceHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhoak"), spruceHHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhoak_vspruce"), spruceHHOakVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhoak_vspruce_fence_gate_closed"), spruceHHOakVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhoak_vvoak"), spruceHHOakVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvoak"), spruceHHSpruceVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvoak_fence_gate_closed"), spruceHHSpruceVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvoak"), spruceHHSpruceVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvoak_fence_gate_closed"), spruceHHSpruceVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhoak_vvvvspruce_vvvvspruce"), spruceHHHOakVVVVSpruceVVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhoak_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHOakVVVVSpruceVVVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhoak_xxoak"), spruceHHOakXXOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvvoak"), spruceHHSpruceVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvvoak_fence_gate_closed"), spruceHHSpruceVVVVOakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhspruce"), oakHHSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhspruce"), oakHHHSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhspruce_voak"), oakHHSpruceVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhspruce_voak_fence_gate_closed"), oakHHSpruceVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhspruce_vvspruce"), oakHHSpruceVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvspruce"), oakHHOakVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvspruce_fence_gate_closed"), oakHHOakVVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvspruce"), oakHHOakVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvspruce_fence_gate_closed"), oakHHOakVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhspruce_vvvvoak_vvvvoak"), oakHHHSpruceVVVVOakVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhspruce_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHSpruceVVVVOakVVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhspruce_xxspruce"), oakHHSpruceXXSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvspruce"), oakHHOakVVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvspruce_fence_gate_closed"), oakHHOakVVVVSpruceGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhbirch"), oakHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhbirch"), oakHHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhbirch_voak"), oakHHBirchVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhbirch_voak_fence_gate_closed"), oakHHBirchVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhbirch_vvbirch"), oakHHBirchVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvbirch"), oakHHOakVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvbirch_fence_gate_closed"), oakHHOakVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvbirch"), oakHHOakVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvbirch_fence_gate_closed"), oakHHOakVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhbirch_vvvvoak_vvvvoak"), oakHHHBirchVVVVOakVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhbirch_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHBirchVVVVOakVVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhbirch_xxbirch"), oakHHBirchXXBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvbirch"), oakHHOakVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvbirch_fence_gate_closed"), oakHHOakVVVVBirchGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhoak"), birchHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhoak"), birchHHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhoak_vbirch"), birchHHOakVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhoak_vbirch_fence_gate_closed"), birchHHOakVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhoak_vvoak"), birchHHOakVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvoak"), birchHHBirchVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvoak_fence_gate_closed"), birchHHBirchVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvoak"), birchHHBirchVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvoak_fence_gate_closed"), birchHHBirchVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhoak_vvvvbirch_vvvvbirch"), birchHHHOakVVVVBirchVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhoak_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHOakVVVVBirchVVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhoak_xxoak"), birchHHOakXXOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvoak"), birchHHBirchVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvoak_fence_gate_closed"), birchHHBirchVVVVOakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhbirch"), spruceHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhbirch"), spruceHHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhbirch_vspruce"), spruceHHBirchVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhbirch_vspruce_fence_gate_closed"), spruceHHBirchVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhbirch_vvbirch"), spruceHHBirchVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvbirch"), spruceHHSpruceVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvbirch_fence_gate_closed"), spruceHHSpruceVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvbirch"), spruceHHSpruceVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvbirch_fence_gate_closed"), spruceHHSpruceVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhbirch_vvvvspruce_vvvvspruce"), spruceHHHBirchVVVVSpruceVVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhbirch_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHBirchVVVVSpruceVVVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhbirch_xxbirch"), spruceHHBirchXXBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvvbirch"), spruceHHSpruceVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvvbirch_fence_gate_closed"), spruceHHSpruceVVVVBirchGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhspruce"), birchHHSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhspruce"), birchHHHSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhspruce_vbirch"), birchHHSpruceVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhspruce_vbirch_fence_gate_closed"), birchHHSpruceVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhspruce_vvspruce"), birchHHSpruceVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvspruce"), birchHHBirchVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvspruce_fence_gate_closed"), birchHHBirchVVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvspruce"), birchHHBirchVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvspruce_fence_gate_closed"), birchHHBirchVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhspruce_vvvvbirch_vvvvbirch"), birchHHHSpruceVVVVBirchVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhspruce_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHSpruceVVVVBirchVVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhspruce_xxspruce"), birchHHSpruceXXSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvspruce"), birchHHBirchVVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvspruce_fence_gate_closed"), birchHHBirchVVVVSpruceGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhspruce"), darkoakHHSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhspruce"), darkoakHHHSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhspruce_vdark_oak"), darkoakHHSpruceVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhspruce_vdark_oak_fence_gate_closed"), darkoakHHSpruceVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhspruce_vvspruce"), darkoakHHSpruceVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvspruce"), darkoakHHDarkoakVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvspruce_fence_gate_closed"), darkoakHHDarkoakVVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvspruce"), darkoakHHDarkoakVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvspruce_fence_gate_closed"), darkoakHHDarkoakVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak"), darkoakHHHSpruceVVVVDarkoakVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhspruce_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHSpruceVVVVDarkoakVVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhspruce_xxspruce"), darkoakHHSpruceXXSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvspruce"), darkoakHHDarkoakVVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvspruce_fence_gate_closed"), darkoakHHDarkoakVVVVSpruceGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhdark_oak"), spruceHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhdark_oak"), spruceHHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhdark_oak_vspruce"), spruceHHDarkoakVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhdark_oak_vspruce_fence_gate_closed"), spruceHHDarkoakVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhdark_oak_vvdark_oak"), spruceHHDarkoakVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvdark_oak"), spruceHHSpruceVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvdark_oak_fence_gate_closed"), spruceHHSpruceVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvdark_oak"), spruceHHSpruceVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvdark_oak_fence_gate_closed"), spruceHHSpruceVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhdark_oak_vvvvspruce_vvvvspruce"), spruceHHHDarkoakVVVVSpruceVVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhdark_oak_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHDarkoakVVVVSpruceVVVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhdark_oak_xxdark_oak"), spruceHHDarkoakXXDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvvdark_oak"), spruceHHSpruceVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvvdark_oak_fence_gate_closed"), spruceHHSpruceVVVVDarkoakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhoak"), darkoakHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhoak"), darkoakHHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhoak_vdark_oak"), darkoakHHOakVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhoak_vdark_oak_fence_gate_closed"), darkoakHHOakVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhoak_vvoak"), darkoakHHOakVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvoak"), darkoakHHDarkoakVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvoak_fence_gate_closed"), darkoakHHDarkoakVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvoak"), darkoakHHDarkoakVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvoak_fence_gate_closed"), darkoakHHDarkoakVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak"), darkoakHHHOakVVVVDarkoakVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhoak_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHOakVVVVDarkoakVVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhoak_xxoak"), darkoakHHOakXXOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvoak"), darkoakHHDarkoakVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvoak_fence_gate_closed"), darkoakHHDarkoakVVVVOakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhdark_oak"), oakHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhdark_oak"), oakHHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhdark_oak_voak"), oakHHDarkoakVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhdark_oak_voak_fence_gate_closed"), oakHHDarkoakVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhdark_oak_vvdark_oak"), oakHHDarkoakVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvdark_oak"), oakHHOakVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvdark_oak_fence_gate_closed"), oakHHOakVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvdark_oak"), oakHHOakVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvdark_oak_fence_gate_closed"), oakHHOakVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhdark_oak_vvvvoak_vvvvoak"), oakHHHDarkoakVVVVOakVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhdark_oak_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHDarkoakVVVVOakVVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhdark_oak_xxdark_oak"), oakHHDarkoakXXDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvdark_oak"), oakHHOakVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvdark_oak_fence_gate_closed"), oakHHOakVVVVDarkoakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhjungle"), darkoakHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhjungle"), darkoakHHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhjungle_vdark_oak"), darkoakHHJungleVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhjungle_vdark_oak_fence_gate_closed"), darkoakHHJungleVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhjungle_vvjungle"), darkoakHHJungleVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvjungle"), darkoakHHDarkoakVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvjungle_fence_gate_closed"), darkoakHHDarkoakVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvjungle"), darkoakHHDarkoakVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvjungle_fence_gate_closed"), darkoakHHDarkoakVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak"), darkoakHHHJungleVVVVDarkoakVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhjungle_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHJungleVVVVDarkoakVVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhjungle_xxjungle"), darkoakHHJungleXXJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvjungle"), darkoakHHDarkoakVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvjungle_fence_gate_closed"), darkoakHHDarkoakVVVVJungleGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhdark_oak"), jungleHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhdark_oak"), jungleHHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhdark_oak_vjungle"), jungleHHDarkoakVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhdark_oak_vjungle_fence_gate_closed"), jungleHHDarkoakVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhdark_oak_vvdark_oak"), jungleHHDarkoakVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvdark_oak"), jungleHHJungleVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvdark_oak_fence_gate_closed"), jungleHHJungleVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvdark_oak"), jungleHHJungleVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvdark_oak_fence_gate_closed"), jungleHHJungleVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhdark_oak_vvvvjungle_vvvvjungle"), jungleHHHDarkoakVVVVJungleVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhdark_oak_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHDarkoakVVVVJungleVVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhdark_oak_xxdark_oak"), jungleHHDarkoakXXDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvdark_oak"), jungleHHJungleVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvdark_oak_fence_gate_closed"), jungleHHJungleVVVVDarkoakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhjungle"), acaciaHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhhjungle"), acaciaHHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhjungle_vacacia"), acaciaHHJungleVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhjungle_vacacia_fence_gate_closed"), acaciaHHJungleVAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhjungle_vvjungle"), acaciaHHJungleVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvvjungle"), acaciaHHAcaciaVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvvjungle_fence_gate_closed"), acaciaHHAcaciaVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvjungle"), acaciaHHAcaciaVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvjungle_fence_gate_closed"), acaciaHHAcaciaVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhhjungle_vvvvacacia_vvvvacacia"), acaciaHHHJungleVVVVAcaciaVVVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhhjungle_vvvvacacia_vvvvacacia_fence_gate_closed"), acaciaHHHJungleVVVVAcaciaVVVVAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhjungle_xxjungle"), acaciaHHJungleXXJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvvvjungle"), acaciaHHAcaciaVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvvvjungle_fence_gate_closed"), acaciaHHAcaciaVVVVJungleGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhacacia"), jungleHHAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhacacia"), jungleHHHAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhacacia_vjungle"), jungleHHAcaciaVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhacacia_vjungle_fence_gate_closed"), jungleHHAcaciaVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhacacia_vvacacia"), jungleHHAcaciaVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvacacia"), jungleHHJungleVVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvacacia_fence_gate_closed"), jungleHHJungleVVVAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvacacia"), jungleHHJungleVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvacacia_fence_gate_closed"), jungleHHJungleVVAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhacacia_vvvvjungle_vvvvjungle"), jungleHHHAcaciaVVVVJungleVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhacacia_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHAcaciaVVVVJungleVVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhacacia_xxacacia"), jungleHHAcaciaXXAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvacacia"), jungleHHJungleVVVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvacacia_fence_gate_closed"), jungleHHJungleVVVVAcaciaGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhbirch"), acaciaHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhhbirch"), acaciaHHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhbirch_vacacia"), acaciaHHBirchVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhbirch_vacacia_fence_gate_closed"), acaciaHHBirchVAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhbirch_vvbirch"), acaciaHHBirchVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvvbirch"), acaciaHHAcaciaVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvvbirch_fence_gate_closed"), acaciaHHAcaciaVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvbirch"), acaciaHHAcaciaVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvbirch_fence_gate_closed"), acaciaHHAcaciaVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhhbirch_vvvvacacia_vvvvacacia"), acaciaHHHBirchVVVVAcaciaVVVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhhbirch_vvvvacacia_vvvvacacia_fence_gate_closed"), acaciaHHHBirchVVVVAcaciaVVVVAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhbirch_xxbirch"), acaciaHHBirchXXBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvvvbirch"), acaciaHHAcaciaVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_hhacacia_vvvvbirch_fence_gate_closed"), acaciaHHAcaciaVVVVBirchGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhacacia"), birchHHAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhacacia"), birchHHHAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhacacia_vbirch"), birchHHAcaciaVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhacacia_vbirch_fence_gate_closed"), birchHHAcaciaVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhacacia_vvacacia"), birchHHAcaciaVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvacacia"), birchHHBirchVVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvacacia_fence_gate_closed"), birchHHBirchVVVAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvacacia"), birchHHBirchVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvacacia_fence_gate_closed"), birchHHBirchVVAcaciaGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhacacia_vvvvbirch_vvvvbirch"), birchHHHAcaciaVVVVBirchVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhacacia_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHAcaciaVVVVBirchVVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhacacia_xxacacia"), birchHHAcaciaXXAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvacacia"), birchHHBirchVVVVAcacia);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvacacia_fence_gate_closed"), birchHHBirchVVVVAcaciaGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhbirch"), jungleHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhbirch"), jungleHHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhbirch_vjungle"), jungleHHBirchVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhbirch_vjungle_fence_gate_closed"), jungleHHBirchVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhbirch_vvbirch"), jungleHHBirchVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvbirch"), jungleHHJungleVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvbirch_fence_gate_closed"), jungleHHJungleVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvbirch"), jungleHHJungleVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvbirch_fence_gate_closed"), jungleHHJungleVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhbirch_vvvvjungle_vvvvjungle"), jungleHHHBirchVVVVJungleVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhbirch_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHBirchVVVVJungleVVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhbirch_xxbirch"), jungleHHBirchXXBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvbirch"), jungleHHJungleVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvbirch_fence_gate_closed"), jungleHHJungleVVVVBirchGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhjungle"), birchHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhjungle"), birchHHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhjungle_vbirch"), birchHHJungleVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhjungle_vbirch_fence_gate_closed"), birchHHJungleVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhjungle_vvjungle"), birchHHJungleVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvjungle"), birchHHBirchVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvjungle_fence_gate_closed"), birchHHBirchVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvjungle"), birchHHBirchVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvjungle_fence_gate_closed"), birchHHBirchVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhjungle_vvvvbirch_vvvvbirch"), birchHHHJungleVVVVBirchVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhjungle_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHJungleVVVVBirchVVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhjungle_xxjungle"), birchHHJungleXXJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvjungle"), birchHHBirchVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvjungle_fence_gate_closed"), birchHHBirchVVVVJungleGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhbirch"), warpedHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhbirch"), warpedHHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhbirch_vwarped"), warpedHHBirchVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhbirch_vwarped_fence_gate_closed"), warpedHHBirchVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhbirch_vvbirch"), warpedHHBirchVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvbirch"), warpedHHWarpedVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvbirch_fence_gate_closed"), warpedHHWarpedVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvbirch"), warpedHHWarpedVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvbirch_fence_gate_closed"), warpedHHWarpedVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhbirch_vvvvwarped_vvvvwarped"), warpedHHHBirchVVVVWarpedVVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhbirch_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHBirchVVVVWarpedVVVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhbirch_xxbirch"), warpedHHBirchXXBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvvbirch"), warpedHHWarpedVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvvbirch_fence_gate_closed"), warpedHHWarpedVVVVBirchGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhwarped"), birchHHWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhwarped"), birchHHHWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhwarped_vbirch"), birchHHWarpedVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhwarped_vbirch_fence_gate_closed"), birchHHWarpedVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhwarped_vvwarped"), birchHHWarpedVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvwarped"), birchHHBirchVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvwarped_fence_gate_closed"), birchHHBirchVVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvwarped"), birchHHBirchVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvwarped_fence_gate_closed"), birchHHBirchVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhwarped_vvvvbirch_vvvvbirch"), birchHHHWarpedVVVVBirchVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhwarped_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHWarpedVVVVBirchVVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhwarped_xxwarped"), birchHHWarpedXXWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvwarped"), birchHHBirchVVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvwarped_fence_gate_closed"), birchHHBirchVVVVWarpedGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhoak"), warpedHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhoak"), warpedHHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhoak_vwarped"), warpedHHOakVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhoak_vwarped_fence_gate_closed"), warpedHHOakVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhoak_vvoak"), warpedHHOakVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvoak"), warpedHHWarpedVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvoak_fence_gate_closed"), warpedHHWarpedVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvoak"), warpedHHWarpedVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvoak_fence_gate_closed"), warpedHHWarpedVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhoak_vvvvwarped_vvvvwarped"), warpedHHHOakVVVVWarpedVVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhoak_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHOakVVVVWarpedVVVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhoak_xxoak"), warpedHHOakXXOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvvoak"), warpedHHWarpedVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvvoak_fence_gate_closed"), warpedHHWarpedVVVVOakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhwarped"), oakHHWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhwarped"), oakHHHWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhwarped_voak"), oakHHWarpedVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhwarped_voak_fence_gate_closed"), oakHHWarpedVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhwarped_vvwarped"), oakHHWarpedVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvwarped"), oakHHOakVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvwarped_fence_gate_closed"), oakHHOakVVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvwarped"), oakHHOakVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvwarped_fence_gate_closed"), oakHHOakVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhwarped_vvvvoak_vvvvoak"), oakHHHWarpedVVVVOakVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhwarped_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHWarpedVVVVOakVVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhwarped_xxwarped"), oakHHWarpedXXWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvwarped"), oakHHOakVVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvwarped_fence_gate_closed"), oakHHOakVVVVWarpedGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhspruce"), warpedHHSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhspruce"), warpedHHHSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhspruce_vwarped"), warpedHHSpruceVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhspruce_vwarped_fence_gate_closed"), warpedHHSpruceVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhspruce_vvspruce"), warpedHHSpruceVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvspruce"), warpedHHWarpedVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvspruce_fence_gate_closed"), warpedHHWarpedVVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvspruce"), warpedHHWarpedVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvspruce_fence_gate_closed"), warpedHHWarpedVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhspruce_vvvvwarped_vvvvwarped"), warpedHHHSpruceVVVVWarpedVVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhspruce_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHSpruceVVVVWarpedVVVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhspruce_xxspruce"), warpedHHSpruceXXSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvvspruce"), warpedHHWarpedVVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvvspruce_fence_gate_closed"), warpedHHWarpedVVVVSpruceGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhwarped"), spruceHHWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhwarped"), spruceHHHWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhwarped_vspruce"), spruceHHWarpedVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhwarped_vspruce_fence_gate_closed"), spruceHHWarpedVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhwarped_vvwarped"), spruceHHWarpedVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvwarped"), spruceHHSpruceVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvwarped_fence_gate_closed"), spruceHHSpruceVVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvwarped"), spruceHHSpruceVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvwarped_fence_gate_closed"), spruceHHSpruceVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhwarped_vvvvspruce_vvvvspruce"), spruceHHHWarpedVVVVSpruceVVVVSpruce);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhhwarped_vvvvspruce_vvvvspruce_fence_gate_closed"), spruceHHHWarpedVVVVSpruceVVVVSpruceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhwarped_xxwarped"), spruceHHWarpedXXWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvvwarped"), spruceHHSpruceVVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_hhspruce_vvvvwarped_fence_gate_closed"), spruceHHSpruceVVVVWarpedGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhjungle"), crimsonHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhhjungle"), crimsonHHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhjungle_vcrimson"), crimsonHHJungleVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhjungle_vcrimson_fence_gate_closed"), crimsonHHJungleVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhjungle_vvjungle"), crimsonHHJungleVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvjungle"), crimsonHHCrimsonVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvjungle_fence_gate_closed"), crimsonHHCrimsonVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvjungle"), crimsonHHCrimsonVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvjungle_fence_gate_closed"), crimsonHHCrimsonVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhhjungle_vvvvcrimson_vvvvcrimson"), crimsonHHHJungleVVVVCrimsonVVVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhhjungle_vvvvcrimson_vvvvcrimson_fence_gate_closed"), crimsonHHHJungleVVVVCrimsonVVVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhjungle_xxjungle"), crimsonHHJungleXXJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvvjungle"), crimsonHHCrimsonVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvvjungle_fence_gate_closed"), crimsonHHCrimsonVVVVJungleGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhcrimson"), jungleHHCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhcrimson"), jungleHHHCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhcrimson_vjungle"), jungleHHCrimsonVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhcrimson_vjungle_fence_gate_closed"), jungleHHCrimsonVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhcrimson_vvcrimson"), jungleHHCrimsonVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvcrimson"), jungleHHJungleVVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvcrimson_fence_gate_closed"), jungleHHJungleVVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvcrimson"), jungleHHJungleVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvcrimson_fence_gate_closed"), jungleHHJungleVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhcrimson_vvvvjungle_vvvvjungle"), jungleHHHCrimsonVVVVJungleVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhcrimson_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHCrimsonVVVVJungleVVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhcrimson_xxcrimson"), jungleHHCrimsonXXCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvcrimson"), jungleHHJungleVVVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvcrimson_fence_gate_closed"), jungleHHJungleVVVVCrimsonGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhoak"), crimsonHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhhoak"), crimsonHHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhoak_vcrimson"), crimsonHHOakVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhoak_vcrimson_fence_gate_closed"), crimsonHHOakVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhoak_vvoak"), crimsonHHOakVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvoak"), crimsonHHCrimsonVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvoak_fence_gate_closed"), crimsonHHCrimsonVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvoak"), crimsonHHCrimsonVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvoak_fence_gate_closed"), crimsonHHCrimsonVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhhoak_vvvvcrimson_vvvvcrimson"), crimsonHHHOakVVVVCrimsonVVVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhhoak_vvvvcrimson_vvvvcrimson_fence_gate_closed"), crimsonHHHOakVVVVCrimsonVVVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhoak_xxoak"), crimsonHHOakXXOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvvoak"), crimsonHHCrimsonVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvvoak_fence_gate_closed"), crimsonHHCrimsonVVVVOakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhcrimson"), oakHHCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhcrimson"), oakHHHCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhcrimson_voak"), oakHHCrimsonVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhcrimson_voak_fence_gate_closed"), oakHHCrimsonVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhcrimson_vvcrimson"), oakHHCrimsonVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvcrimson"), oakHHOakVVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvcrimson_fence_gate_closed"), oakHHOakVVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvcrimson"), oakHHOakVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvcrimson_fence_gate_closed"), oakHHOakVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhcrimson_vvvvoak_vvvvoak"), oakHHHCrimsonVVVVOakVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhcrimson_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHCrimsonVVVVOakVVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhcrimson_xxcrimson"), oakHHCrimsonXXCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvcrimson"), oakHHOakVVVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvcrimson_fence_gate_closed"), oakHHOakVVVVCrimsonGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhdark_oak"), crimsonHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhhdark_oak"), crimsonHHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhdark_oak_vcrimson"), crimsonHHDarkoakVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhdark_oak_vcrimson_fence_gate_closed"), crimsonHHDarkoakVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhdark_oak_vvdark_oak"), crimsonHHDarkoakVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvdark_oak"), crimsonHHCrimsonVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvdark_oak_fence_gate_closed"), crimsonHHCrimsonVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvdark_oak"), crimsonHHCrimsonVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvdark_oak_fence_gate_closed"), crimsonHHCrimsonVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson"), crimsonHHHDarkoakVVVVCrimsonVVVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhhdark_oak_vvvvcrimson_vvvvcrimson_fence_gate_closed"), crimsonHHHDarkoakVVVVCrimsonVVVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhdark_oak_xxdark_oak"), crimsonHHDarkoakXXDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvvdark_oak"), crimsonHHCrimsonVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_hhcrimson_vvvvdark_oak_fence_gate_closed"), crimsonHHCrimsonVVVVDarkoakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhcrimson"), darkoakHHCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhcrimson"), darkoakHHHCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhcrimson_vdark_oak"), darkoakHHCrimsonVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhcrimson_vdark_oak_fence_gate_closed"), darkoakHHCrimsonVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhcrimson_vvcrimson"), darkoakHHCrimsonVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvcrimson"), darkoakHHDarkoakVVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvcrimson_fence_gate_closed"), darkoakHHDarkoakVVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvcrimson"), darkoakHHDarkoakVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvcrimson_fence_gate_closed"), darkoakHHDarkoakVVCrimsonGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak"), darkoakHHHCrimsonVVVVDarkoakVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhcrimson_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHCrimsonVVVVDarkoakVVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhcrimson_xxcrimson"), darkoakHHCrimsonXXCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvcrimson"), darkoakHHDarkoakVVVVCrimson);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvcrimson_fence_gate_closed"), darkoakHHDarkoakVVVVCrimsonGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhoak"), mangroveHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhoak"), mangroveHHHOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhoak_vmangrove"), mangroveHHOakVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhoak_vmangrove_fence_gate_closed"), mangroveHHOakVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhoak_vvoak"), mangroveHHOakVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvoak"), mangroveHHMangroveVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvoak_fence_gate_closed"), mangroveHHMangroveVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvoak"), mangroveHHMangroveVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvoak_fence_gate_closed"), mangroveHHMangroveVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhoak_vvvvmangrove_vvvvmangrove"), mangroveHHHOakVVVVMangroveVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhoak_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHOakVVVVMangroveVVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhoak_xxoak"), mangroveHHOakXXOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvoak"), mangroveHHMangroveVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvoak_fence_gate_closed"), mangroveHHMangroveVVVVOakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhmangrove"), oakHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhmangrove"), oakHHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhmangrove_voak"), oakHHMangroveVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhmangrove_voak_fence_gate_closed"), oakHHMangroveVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhmangrove_vvmangrove"), oakHHMangroveVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvmangrove"), oakHHOakVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvmangrove_fence_gate_closed"), oakHHOakVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvmangrove"), oakHHOakVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvmangrove_fence_gate_closed"), oakHHOakVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhmangrove_vvvvoak_vvvvoak"), oakHHHMangroveVVVVOakVVVVOak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhhmangrove_vvvvoak_vvvvoak_fence_gate_closed"), oakHHHMangroveVVVVOakVVVVOakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhmangrove_xxmangrove"), oakHHMangroveXXMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvmangrove"), oakHHOakVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_hhoak_vvvvmangrove_fence_gate_closed"), oakHHOakVVVVMangroveGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhbirch"), mangroveHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhbirch"), mangroveHHHBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhbirch_vmangrove"), mangroveHHBirchVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhbirch_vmangrove_fence_gate_closed"), mangroveHHBirchVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhbirch_vvbirch"), mangroveHHBirchVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvbirch"), mangroveHHMangroveVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvbirch_fence_gate_closed"), mangroveHHMangroveVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvbirch"), mangroveHHMangroveVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvbirch_fence_gate_closed"), mangroveHHMangroveVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhbirch_vvvvmangrove_vvvvmangrove"), mangroveHHHBirchVVVVMangroveVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhbirch_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHBirchVVVVMangroveVVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhbirch_xxbirch"), mangroveHHBirchXXBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvbirch"), mangroveHHMangroveVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvbirch_fence_gate_closed"), mangroveHHMangroveVVVVBirchGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhmangrove"), birchHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhmangrove"), birchHHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhmangrove_vbirch"), birchHHMangroveVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhmangrove_vbirch_fence_gate_closed"), birchHHMangroveVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhmangrove_vvmangrove"), birchHHMangroveVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvmangrove"), birchHHBirchVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvmangrove_fence_gate_closed"), birchHHBirchVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvmangrove"), birchHHBirchVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvmangrove_fence_gate_closed"), birchHHBirchVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhmangrove_vvvvbirch_vvvvbirch"), birchHHHMangroveVVVVBirchVVVVBirch);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhhmangrove_vvvvbirch_vvvvbirch_fence_gate_closed"), birchHHHMangroveVVVVBirchVVVVBirchGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhmangrove_xxmangrove"), birchHHMangroveXXMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvmangrove"), birchHHBirchVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_hhbirch_vvvvmangrove_fence_gate_closed"), birchHHBirchVVVVMangroveGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhjungle"), mangroveHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhjungle"), mangroveHHHJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhjungle_vmangrove"), mangroveHHJungleVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhjungle_vmangrove_fence_gate_closed"), mangroveHHJungleVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhjungle_vvjungle"), mangroveHHJungleVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvjungle"), mangroveHHMangroveVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvjungle_fence_gate_closed"), mangroveHHMangroveVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvjungle"), mangroveHHMangroveVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvjungle_fence_gate_closed"), mangroveHHMangroveVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhjungle_vvvvmangrove_vvvvmangrove"), mangroveHHHJungleVVVVMangroveVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhjungle_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHJungleVVVVMangroveVVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhjungle_xxjungle"), mangroveHHJungleXXJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvjungle"), mangroveHHMangroveVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvjungle_fence_gate_closed"), mangroveHHMangroveVVVVJungleGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhmangrove"), jungleHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhmangrove"), jungleHHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhmangrove_vjungle"), jungleHHMangroveVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhmangrove_vjungle_fence_gate_closed"), jungleHHMangroveVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhmangrove_vvmangrove"), jungleHHMangroveVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvmangrove"), jungleHHJungleVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvmangrove_fence_gate_closed"), jungleHHJungleVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvmangrove"), jungleHHJungleVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvmangrove_fence_gate_closed"), jungleHHJungleVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhmangrove_vvvvjungle_vvvvjungle"), jungleHHHMangroveVVVVJungleVVVVJungle);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhhmangrove_vvvvjungle_vvvvjungle_fence_gate_closed"), jungleHHHMangroveVVVVJungleVVVVJungleGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhmangrove_xxmangrove"), jungleHHMangroveXXMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvmangrove"), jungleHHJungleVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_hhjungle_vvvvmangrove_fence_gate_closed"), jungleHHJungleVVVVMangroveGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhdark_oak"), mangroveHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhdark_oak"), mangroveHHHDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhdark_oak_vmangrove"), mangroveHHDarkoakVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhdark_oak_vmangrove_fence_gate_closed"), mangroveHHDarkoakVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhdark_oak_vvdark_oak"), mangroveHHDarkoakVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvdark_oak"), mangroveHHMangroveVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvdark_oak_fence_gate_closed"), mangroveHHMangroveVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvdark_oak"), mangroveHHMangroveVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvdark_oak_fence_gate_closed"), mangroveHHMangroveVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove"), mangroveHHHDarkoakVVVVMangroveVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhdark_oak_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHDarkoakVVVVMangroveVVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhdark_oak_xxdark_oak"), mangroveHHDarkoakXXDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvdark_oak"), mangroveHHMangroveVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvdark_oak_fence_gate_closed"), mangroveHHMangroveVVVVDarkoakGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhmangrove"), darkoakHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhmangrove"), darkoakHHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhmangrove_vdark_oak"), darkoakHHMangroveVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhmangrove_vdark_oak_fence_gate_closed"), darkoakHHMangroveVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhmangrove_vvmangrove"), darkoakHHMangroveVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvmangrove"), darkoakHHDarkoakVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvmangrove_fence_gate_closed"), darkoakHHDarkoakVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvmangrove"), darkoakHHDarkoakVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvmangrove_fence_gate_closed"), darkoakHHDarkoakVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak"), darkoakHHHMangroveVVVVDarkoakVVVVDarkoak);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhhmangrove_vvvvdark_oak_vvvvdark_oak_fence_gate_closed"), darkoakHHHMangroveVVVVDarkoakVVVVDarkoakGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhmangrove_xxmangrove"), darkoakHHMangroveXXMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvmangrove"), darkoakHHDarkoakVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_hhdark_oak_vvvvmangrove_fence_gate_closed"), darkoakHHDarkoakVVVVMangroveGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhwarped"), mangroveHHWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhwarped"), mangroveHHHWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhwarped_vmangrove"), mangroveHHWarpedVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhwarped_vmangrove_fence_gate_closed"), mangroveHHWarpedVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhwarped_vvwarped"), mangroveHHWarpedVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvwarped"), mangroveHHMangroveVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvwarped_fence_gate_closed"), mangroveHHMangroveVVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvwarped"), mangroveHHMangroveVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvwarped_fence_gate_closed"), mangroveHHMangroveVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhwarped_vvvvmangrove_vvvvmangrove"), mangroveHHHWarpedVVVVMangroveVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhhwarped_vvvvmangrove_vvvvmangrove_fence_gate_closed"), mangroveHHHWarpedVVVVMangroveVVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhwarped_xxwarped"), mangroveHHWarpedXXWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvwarped"), mangroveHHMangroveVVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mangrove_hhmangrove_vvvvwarped_fence_gate_closed"), mangroveHHMangroveVVVVWarpedGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhmangrove"), warpedHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhmangrove"), warpedHHHMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhmangrove_vwarped"), warpedHHMangroveVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhmangrove_vwarped_fence_gate_closed"), warpedHHMangroveVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhmangrove_vvmangrove"), warpedHHMangroveVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvmangrove"), warpedHHWarpedVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvmangrove_fence_gate_closed"), warpedHHWarpedVVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvmangrove"), warpedHHWarpedVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvmangrove_fence_gate_closed"), warpedHHWarpedVVMangroveGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhmangrove_vvvvwarped_vvvvwarped"), warpedHHHMangroveVVVVWarpedVVVVWarped);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhhmangrove_vvvvwarped_vvvvwarped_fence_gate_closed"), warpedHHHMangroveVVVVWarpedVVVVWarpedGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhmangrove_xxmangrove"), warpedHHMangroveXXMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvvmangrove"), warpedHHWarpedVVVVMangrove);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_hhwarped_vvvvmangrove_fence_gate_closed"), warpedHHWarpedVVVVMangroveGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_modern"), cobblestoneModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_building"), cobblestoneBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_castle"), cobblestoneCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mossy_cobblestone_modern"), mossyCobblestoneModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mossy_cobblestone_building"), mossyCobblestoneBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mossy_cobblestone_castle"), mossyCobblestoneCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "stone_modern"), stoneModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "stone_building"), stoneBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "stone_castle"), stoneCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "stone_bricks_modern"), stoneBrickModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "stone_bricks_building"), stoneBrickBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "stone_bricks_castle"), stoneBrickCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mossy_stone_bricks_modern"), mossyStoneBrickModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mossy_stone_bricks_building"), mossyStoneBrickBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "mossy_stone_bricks_castle"), mossyStoneBrickCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "andesite_modern"), andesiteModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "andesite_building"), andesiteBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "andesite_castle"), andesiteCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "diorite_modern"), dioriteModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "diorite_building"), dioriteBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "diorite_castle"), dioriteCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "granite_modern"), graniteModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "granite_building"), graniteBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "granite_castle"), graniteCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "sandstone_modern"), sandstoneModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "sandstone_building"), sandstoneBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "sandstone_castle"), sandstoneCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "red_sandstone_modern"), redSandstoneModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "red_sandstone_building"), redSandstoneBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "red_sandstone_castle"), redSandstoneCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "bricks_modern"), bricksModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "bricks_building"), bricksBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "bricks_castle"), bricksCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "prismarine_modern"), prismarineModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "prismarine_building"), prismarineBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "prismarine_castle"), prismarineCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "nether_bricks_modern"), netherBrickModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "nether_bricks_building"), netherBrickBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "nether_bricks_castle"), netherBrickCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "red_nether_bricks_modern"), redNetherBrickModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "red_nether_bricks_building"), redNetherBrickBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "red_nether_bricks_castle"), redNetherBrickCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "end_stone_bricks_modern"), endStoneBrickModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "end_stone_bricks_building"), endStoneBrickBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "end_stone_bricks_castle"), endStoneBrickCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "blackstone_modern"), blackstoneModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "blackstone_building"), blackstoneBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "blackstone_castle"), blackstoneCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "polished_blackstone_modern"), polishedBlackstoneModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "polished_blackstone_building"), polishedBlackstoneBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "polished_blackstone_castle"), polishedBlackstoneCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "polished_blackstone_bricks_modern"), polishedBlackstoneBrickModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "polished_blackstone_bricks_building"), polishedBlackstoneBrickBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "polished_blackstone_bricks_castle"), polishedBlackstoneBrickCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobbled_deepslate_modern"), cobbledDeepslateModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobbled_deepslate_building"), cobbledDeepslateBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobbled_deepslate_castle"), cobbledDeepslateCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "polished_deepslate_modern"), polishedDeepslateModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "polished_deepslate_building"), polishedDeepslateBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "polished_deepslate_castle"), polishedDeepslateCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "deepslate_brick_modern"), deepslateBrickModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "deepslate_brick_building"), deepslateBrickBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "deepslate_brick_castle"), deepslateBrickCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "deepslate_tile_modern"), deepslateTileModern);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "deepslate_tile_building"), deepslateTileBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "deepslate_tile_castle"), deepslateTileCastle);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oak_wall_building"), oakWallBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "birch_wall_building"), birchWallBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "spruce_wall_building"), spruceWallBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "acacia_wall_building"), acaciaWallBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "jungle_wall_building"), jungleWallBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "dark_oak_wall_building"), darkoakWallBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "crimson_wall_building"), crimsonWallBuilding);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "warped_wall_building"), warpedWallBuilding);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_copper_fence"), cobblestoneCopperFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_exposed_copper_fence"), cobblestoneExposedCopperFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_weathered_copper_fence"), cobblestoneWeatheredCopperFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_oxidized_copper_fence"), cobblestoneOxidizedCopperFence);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "copper_fence_gate_closed"), copperFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "exposed_copper_fence_gate_closed"), exposedCopperFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "weathered_copper_fence_gate_closed"), weatheredCopperFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oxidized_copper_fence_gate_closed"), oxidizedCopperFenceGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_waxed_copper_fence"), cobblestoneWaxedCopperFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_waxed_exposed_copper_fence"), cobblestoneWaxedExposedCopperFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_waxed_weathered_copper_fence"), cobblestoneWaxedWeatheredCopperFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_waxed_oxidized_copper_fence"), cobblestoneWaxedOxidizedCopperFence);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "waxed_copper_fence_gate_closed"), waxedCopperFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "waxed_exposed_copper_fence_gate_closed"), waxedExposedCopperFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "waxed_weathered_copper_fence_gate_closed"), waxedWeatheredCopperFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "waxed_oxidized_copper_fence_gate_closed"), waxedOxidizedCopperFenceGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_iron_fence"), cobblestoneIronFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_exposed_iron_fence"), cobblestoneExposedIronFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_weathered_iron_fence"), cobblestoneWeatheredIronFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_oxidized_iron_fence"), cobblestoneOxidizedIronFence);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "iron_fence_gate_closed"), ironFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "exposed_iron_fence_gate_closed"), exposedIronFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "weathered_iron_fence_gate_closed"), weatheredIronFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "oxidized_iron_fence_gate_closed"), oxidizedIronFenceGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_waxed_iron_fence"), cobblestoneWaxedIronFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_waxed_exposed_iron_fence"), cobblestoneWaxedExposedIronFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_waxed_weathered_iron_fence"), cobblestoneWaxedWeatheredIronFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_waxed_oxidized_iron_fence"), cobblestoneWaxedOxidizedIronFence);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "waxed_iron_fence_gate_closed"), waxedIronFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "waxed_exposed_iron_fence_gate_closed"), waxedExposedIronFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "waxed_weathered_iron_fence_gate_closed"), waxedWeatheredIronFenceGate);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "waxed_oxidized_iron_fence_gate_closed"), waxedOxidizedIronFenceGate);

        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "cobblestone_gold_fence"), cobblestoneGoldFence);
        class_2378.method_10230(class_2378.field_11146, new class_2960(Main.MOD_ID, "gold_fence_gate_closed"), goldFenceGate);

    }

}
