package com.personj.changedttu.meanly.wight;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.common.ForgeMod;

public class CostForesets {
	public static void HD(AttributeMap sheet) {
		sheet.getInstance(Attributes.MOVEMENT_SPEED).setBaseValue(1.05D);
		sheet.getInstance(ForgeMod.SWIM_SPEED.get()).setBaseValue(1.05D);
		sheet.getInstance(Attributes.ARMOR).setBaseValue(4);
		sheet.getInstance(Attributes.ATTACK_DAMAGE).setBaseValue(4);
		sheet.getInstance(Attributes.MAX_HEALTH).setBaseValue(36);
	}
}
