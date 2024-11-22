package com.personj.changedttu.heart.start.tieins;

import com.personj.changedttu.ChangedtotheUnknown;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class JEICTTUPlugin implements IModPlugin{

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation(ChangedtotheUnknown.MODID, "changedttu_plugin");
	}

}
