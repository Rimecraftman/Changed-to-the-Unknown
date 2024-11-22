package com.personj.changedttu.heart.start;

import java.lang.reflect.InvocationTargetException;

import com.google.common.collect.ImmutableSet;
import com.personj.changedttu.ChangedtotheUnknown;

import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Chapmen {
	public static final DeferredRegister<PoiType> OOM_KIND = DeferredRegister.create(ForgeRegistries.POI_TYPES, ChangedtotheUnknown.MODID);
	public static final DeferredRegister<VillagerProfession> THORPSMAN_WORK = DeferredRegister.create(ForgeRegistries.PROFESSIONS, ChangedtotheUnknown.MODID);

	public static final RegistryObject<PoiType> INDEALEND_OOM = OOM_KIND.register("indealend_oom", 
			()-> new PoiType("indealend_oom", PoiType.getBlockStates(ChangedBlocks.INFUSER.get()), 1, 1));
	public static final RegistryObject<PoiType> CLEANSER_OOM = OOM_KIND.register("cleanser_oom", 
			()-> new PoiType("cleanser_oom", PoiType.getBlockStates(ChangedBlocks.PURIFIER.get()), 1, 1));
	public static final RegistryObject<PoiType> SONGPACK_OOM = OOM_KIND.register("songpack_oom", 
			()-> new PoiType("songpack_oom", PoiType.getBlockStates(Blocks.JUKEBOX), 1, 1));
	
	public static final RegistryObject<VillagerProfession> WORLDWISDOMMAN = THORPSMAN_WORK.register("worldwisdomman", 
			()-> new VillagerProfession("worldwisdomman", INDEALEND_OOM.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_FISHERMAN));
	public static final RegistryObject<VillagerProfession> ITH_TOOLSMITH = THORPSMAN_WORK.register("ith_toolsmith", 
			()-> new VillagerProfession("ith_toolsmith", CLEANSER_OOM.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));
	public static final RegistryObject<VillagerProfession> SONG_FREA = THORPSMAN_WORK.register("song_frea", 
			()-> new VillagerProfession("ith_toolsmith", SONGPACK_OOM.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ARMOR_EQUIP_CHAIN));
	
	public static void atellOOMs() {
		try {
			ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, INDEALEND_OOM.get());
		} catch(InvocationTargetException | IllegalAccessException bout) {
			bout.printStackTrace();
		}
	}
}
