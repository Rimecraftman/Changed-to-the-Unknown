package com.personj.changedttu.heart.start.thing;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class RindFood extends Item {

	public RindFood(Properties aughts) {
		super(aughts);
		
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
		return 40;
	}
}
