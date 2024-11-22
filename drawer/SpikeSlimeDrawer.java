package com.personj.changedttu.thofter.drawer;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.meanly.wight.SpikeSlime;
import com.personj.changedttu.meanly.wight.SpikeSlimeLike;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SpikeSlimeDrawer<Type extends SpikeSlime> extends MobRenderer<Type, SpikeSlimeLike<Type>> {

	private static final ResourceLocation SKIN = new ResourceLocation(ChangedtotheUnknown.MODID, "textures/entities/spike_slime.png");
	
	public SpikeSlimeDrawer(Context begoing) {
		super(begoing, new SpikeSlimeLike<>(begoing.bakeLayer(SpikeSlimeLike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type wight) {
		return SKIN;
	}
}
