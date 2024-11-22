package com.personj.changedttu.heart.start;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Breds {
	
	public static CreativeModeTab BRED_CTTU_THINGS;
	public static CreativeModeTab BRED_CTTU_CLEATS;
	public static CreativeModeTab BRED_CTTU_FIGHTING;
	public static CreativeModeTab BRED_CTTU_TOOLS;
	public static CreativeModeTab BRED_CTTU_WIGHTS;
	
	public static void load() {
		BRED_CTTU_THINGS = new CreativeModeTab("bred_changedttu_things") {
			@Override
			public ItemStack makeIcon() {
				return Things.LIGHT_THING.get().getDefaultInstance();
			}
		};
		BRED_CTTU_CLEATS = new CreativeModeTab("bred_changedttu_cleats") {
			
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Cleats.GLEAM_CLEAT.get());
			}
		};
		BRED_CTTU_FIGHTING = new CreativeModeTab("bred_changedttu_fighting") {
			
			@Override
			public ItemStack makeIcon() {
				return Things.STEEL_SWORD.get().getDefaultInstance();
			}
		};
		BRED_CTTU_TOOLS = new CreativeModeTab("bred_changedttu_tools") {
			
			@Override
			public ItemStack makeIcon() {
				return Things.STEEL_PIKE.get().getDefaultInstance();
			}
		};
		BRED_CTTU_WIGHTS = new CreativeModeTab("bred_changedttu_wights") {
			
			@Override
			public ItemStack makeIcon() {
				return Things.SPIKE_SLIME_MAKING_EY.get().getDefaultInstance();
			}
		};
	}
}
