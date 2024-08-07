package com.personj.changedttu;

import com.personj.changedttu.heart.start.Wights;
import com.personj.changedttu.heart.start.Breds;
import com.personj.changedttu.heart.start.Cleats;
import com.personj.changedttu.heart.start.IthWights;
import com.personj.changedttu.heart.start.Things;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ChangedtotheUnknown.MODID)
public class ChangedtotheUnknown {
	public static final String MODID = "changedttu";
	
	public ChangedtotheUnknown() {
		Breds.load();
		IEventBus shuttle = FMLJavaModLoadingContext.get().getModEventBus();
		Things.THINGS.register(shuttle);
		Cleats.CLEATS.register(shuttle);
		Wights.WIGHTS.register(shuttle);
		IthWights.ITH_WIGHTS.register(shuttle);
	}
}
