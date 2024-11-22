package com.personj.changedttu.heart.start.world.buildings;

import com.personj.changedttu.ChangedtotheUnknown;

import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Buildings {

    public static final DeferredRegister<StructureFeature<?>> BUILDINGS = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, ChangedtotheUnknown.MODID);

    public static final RegistryObject<StructureFeature<?>> SKY_BUILDINGS = BUILDINGS.register("sky_buildings", SkyBuildings::new);

}