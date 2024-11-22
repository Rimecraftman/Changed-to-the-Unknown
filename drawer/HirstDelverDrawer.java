/*package com.personj.changedttu.thofter.drawer;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.meanly.ithwights.HirstDelver;
import com.personj.changedttu.meanly.ithwights.HirstDelverLike;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.LatexParticlesLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorLatexFemaleWolfModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class HirstDelverDrawer extends LatexHumanoidRenderer<HirstDelver, HirstDelverLike, ArmorLatexFemaleWolfModel<HirstDelver>>{

private static final ResourceLocation SKIN = new ResourceLocation(ChangedtotheUnknown.MODID, "textures/entities/dweller_ghost.png");
	
	public HirstDelverDrawer(EntityRendererProvider.Context begoing) {
		super(begoing, new HirstDelverLike(begoing.bakeLayer(HirstDelverLike.LAYER_LOCATION)), ArmorLatexFemaleWolfModel::new, 
				ArmorLatexFemaleWolfModel.INNER_ARMOR, ArmorLatexFemaleWolfModel.OUTER_ARMOR, 0.5f);
		this.addLayer(new LatexParticlesLayer<>(this, getModel()));
	}

	@Override
	public ResourceLocation getTextureLocation(HirstDelver wight) {
		return SKIN;
	}
}
*/