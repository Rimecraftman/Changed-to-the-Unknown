package com.personj.changedttu.heart.start;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Breds {
	
	public static CreativeModeTab TAB_CTTU;

	public static void load() {
		TAB_CTTU = new CreativeModeTab("tab_things") {
			@Override
			public ItemStack makeIcon() {
				return Things.FURTHERED_THING.get().getDefaultInstance();
			}
		};
	}
}
