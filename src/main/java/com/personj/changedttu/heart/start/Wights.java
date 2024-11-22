package com.personj.changedttu.heart.start;

import com.personj.changedttu.ChangedtotheUnknown;
//import com.personj.changedttu.meanly.ithwights.HirstDelver;
import com.personj.changedttu.meanly.wight.DwellerGhost;
import com.personj.changedttu.meanly.wight.SpikeSlime;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Wights {
	private Wights() {}
	
	//WONTED
	public static final DeferredRegister<EntityType<?>> WIGHTS = DeferredRegister.create(ForgeRegistries.ENTITIES, ChangedtotheUnknown.MODID);
	
	public static final RegistryObject<EntityType<SpikeSlime>> SPIKE_SLIME = WIGHTS.register("spike_slime", 
			()-> EntityType.Builder.of(SpikeSlime::new, MobCategory.MONSTER).fireImmune().sized(0.6F, 0.6F)
			.build(new ResourceLocation(ChangedtotheUnknown.MODID, "spike_slime").toString()));
	public static final RegistryObject<EntityType<DwellerGhost>> DWELLER_GHOST = WIGHTS.register("dweller_ghost",
			()-> EntityType.Builder.of(DwellerGhost::new, MobCategory.CREATURE).fireImmune().sized(1.0F, 2.0F)
			.build(new ResourceLocation(ChangedtotheUnknown.MODID, "dweller_ghost").toString()));
/*	//ITH
	public static final DeferredRegister<EntityType<?>> ITH_WIGHTS = DeferredRegister.create(ForgeRegistries.ENTITIES, ChangedtotheUnknown.MODID);

	public static final RegistryObject<EntityType<HirstDelver>> HIRST_DELVER = ITH_WIGHTS.register("hirst_delver", 
			()-> EntityType.Builder.of(HirstDelver::new, MobCategory.MONSTER).sized(1.0F, 2.25F)
			.build(new ResourceLocation(ChangedtotheUnknown.MODID, "hirst_delver").toString()));*/
}
