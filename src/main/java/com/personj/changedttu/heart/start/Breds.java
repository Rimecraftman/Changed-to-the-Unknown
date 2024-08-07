package com.personj.changedttu.heart.start;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Breds {
	
	public static CreativeModeTab BRED_CTTU_THINGS;
	public static CreativeModeTab BRED_CTTU_CLEATS;
	public static CreativeModeTab BRED_CTTU_FIGHTING;
	public static CreativeModeTab BRED_CTTU_TOOLS;
	
	public static void load() {
		BRED_CTTU_THINGS = new CreativeModeTab("bred_changedttu_things") {
			@Override
			public ItemStack makeIcon() {
				return Things.FURTHERED_THING.get().getDefaultInstance();
			}
		};
		BRED_CTTU_CLEATS = new CreativeModeTab("bred_changedttu_cleats") {
			
			@Override
			public ItemStack makeIcon() {
				return Things.GLEAM_CLEAT.get().getDefaultInstance();
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
	}
}
