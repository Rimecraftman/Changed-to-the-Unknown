package com.personj.changedttu.thofter.drawer;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.meanly.wight.DwellerGhost;
import com.personj.changedttu.meanly.wight.DwellerGhostLike;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DwellerGhostDrawer<Type extends DwellerGhost> extends MobRenderer<Type, DwellerGhostLike<Type>> {

	private static final ResourceLocation SKIN = new ResourceLocation(ChangedtotheUnknown.MODID, "textures/entities/dweller_ghost.png");
	
	public DwellerGhostDrawer(Context begoing) {
		super(begoing, new DwellerGhostLike<>(begoing.bakeLayer(DwellerGhostLike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type wight) {
		return SKIN;
	}

}
