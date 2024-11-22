package com.personj.changedttu.thofter.happening;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.Cleats;
import com.personj.changedttu.heart.start.Wights;
//import com.personj.changedttu.meanly.ithwights.HirstDelverLike;
import com.personj.changedttu.meanly.wight.DwellerGhostLike;
import com.personj.changedttu.meanly.wight.SpikeSlimeLike;
import com.personj.changedttu.thofter.drawer.DwellerGhostDrawer;
//import com.personj.changedttu.thofter.drawer.HirstDelverDrawer;
import com.personj.changedttu.thofter.drawer.SpikeSlimeDrawer;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ChangedtotheUnknown.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ThofterTweakHappenings {
	private ThofterTweakHappenings() {}
	
	@SubscribeEvent
	public static void thofterSetup(FMLClientSetupEvent happening) {
		ItemBlockRenderTypes.setRenderLayer(Cleats.UPWISE_HALFCLEAT_OAK.get(), RenderType.cutout());
	}
	
	@SubscribeEvent
	public static void atellLayers(EntityRenderersEvent.RegisterLayerDefinitions happening) {
		happening.registerLayerDefinition(SpikeSlimeLike.LAYER_LOCATION, SpikeSlimeLike::createBodyLayer);
		happening.registerLayerDefinition(DwellerGhostLike.LAYER_LOCATION, DwellerGhostLike::createBodyLayer);
		//happening.registerLayerDefinition(HirstDelverLike.LAYER_LOCATION, HirstDelverLike::createBodyLayer);
	}
	
	@SubscribeEvent
	public static void atellDrawers(EntityRenderersEvent.RegisterRenderers happening) {
		happening.registerEntityRenderer(Wights.SPIKE_SLIME.get(), SpikeSlimeDrawer::new);
		happening.registerEntityRenderer(Wights.DWELLER_GHOST.get(), DwellerGhostDrawer::new);
		//happening.registerEntityRenderer(Wights.HIRST_DELVER.get(), HirstDelverDrawer::new);
	}
}
