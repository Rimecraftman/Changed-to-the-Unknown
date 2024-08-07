package com.personj.changedttu.thofter;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.Cleats;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ChangedtotheUnknown.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ThofterHappeningShuttleUnderwriter {

	public static void ThofterSetup(FMLClientSetupEvent happening) {
		ItemBlockRenderTypes.setRenderLayer(Cleats.UPWISE_HALFCLEAT_OAK.get(), RenderType.cutout());
	}
	
}
