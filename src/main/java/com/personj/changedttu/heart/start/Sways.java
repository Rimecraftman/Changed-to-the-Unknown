package com.personj.changedttu.heart.start;

import com.personj.changedttu.ChangedtotheUnknown;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Sways {
private Sways() {}
	
	public static final DeferredRegister<SoundEvent> SWAYS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ChangedtotheUnknown.MODID);
	
	public static final RegistryObject<SoundEvent> DWELLER_GHOST_BYGOING = SWAYS.register("entity.dweller_ghost.bygoing", 
			()-> new SoundEvent(new ResourceLocation(ChangedtotheUnknown.MODID, "entity.dweller_ghost.bygoing")));
	public static final RegistryObject<SoundEvent> DWELLER_GHOST_SCATHE = SWAYS.register("entity.dweller_ghost.scathe", 
			()-> new SoundEvent(new ResourceLocation(ChangedtotheUnknown.MODID, "entity.dweller_ghost.scathe")));
	public static final RegistryObject<SoundEvent> DWELLER_GHOST_DEATH = SWAYS.register("entity.dweller_ghost.death", 
			()-> new SoundEvent(new ResourceLocation(ChangedtotheUnknown.MODID, "entity.dweller_ghost.death")));
	
	
}
