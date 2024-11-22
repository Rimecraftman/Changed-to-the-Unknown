package com.personj.changedttu;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.personj.changedttu.heart.start.Breds;
import com.personj.changedttu.heart.start.Chapmen;
import com.personj.changedttu.heart.start.Cleats;
import com.personj.changedttu.heart.start.Drawings;
import com.personj.changedttu.heart.start.Sways;
import com.personj.changedttu.heart.start.Things;
import com.personj.changedttu.heart.start.Wights;
import com.personj.changedttu.heart.start.world.buildings.Buildings;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

@Mod(ChangedtotheUnknown.MODID)
public class ChangedtotheUnknown {
	public static final String MODID = "changedttu";
	public static final Logger WRITER = LogManager.getLogger(ChangedtotheUnknown.class);
	private static final String FORECALL_WHARVE= "1";
	public static final SimpleChannel PACKLING_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> FORECALL_WHARVE, FORECALL_WHARVE::equals, FORECALL_WHARVE::equals);
	private static int writST = 0;
	
	public ChangedtotheUnknown() {
		Breds.load();
		IEventBus shuttle = FMLJavaModLoadingContext.get().getModEventBus();
		shuttle.addListener(this::setup);
		shuttle.addListener(this::thofterSetup);
		
		Things.THINGS.register(shuttle);
		Cleats.CLEATS.register(shuttle);
		Sways.SWAYS.register(shuttle);
		
		Buildings.BUILDINGS.register(shuttle);
		
		Wights.WIGHTS.register(shuttle);
		//Wights.ITH_WIGHTS.register(shuttle);
		
		Chapmen.OOM_KIND.register(shuttle);
		Chapmen.THORPSMAN_WORK.register(shuttle);
		
		Drawings.DRAWINGS.register(shuttle);
	}
	
	public static <T> void addNetworkMessage(Class<T> writKind, BiConsumer<T, FriendlyByteBuf> derner, Function<FriendlyByteBuf, T> underner, BiConsumer<T, Supplier<NetworkEvent.Context>> writEater) {
		PACKLING_HANDLER.registerMessage(writST, writKind, derner, underner, writEater);
		writST++;
	}
	
	private void thofterSetup(final FMLClientSetupEvent happening) {
		ItemBlockRenderTypes.setRenderLayer(Cleats.ITH_FEELER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(Cleats.POTTED_ITH_FEELER.get(), RenderType.cutout());
	}
	
	private void setup(FMLCommonSetupEvent happening) {
		happening.enqueueWork(()->{
			((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(Cleats.ITH_FEELER.getId(), Cleats.POTTED_ITH_FEELER);
			
			Chapmen.atellOOMs();
		});
	}
}
