package com.personj.changedttu.heart.start;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Ametes {
	public static final ForgeTier ARE = new ForgeTier(2, 250, 6.0f, 2.0f, 10, BlockTags.NEEDS_IRON_TOOL, ()-> Ingredient.of(Items.COPPER_INGOT));
	public static final ForgeTier STEEL = new ForgeTier(3, 1561, 8.0f, 3.0f, 14, BlockTags.NEEDS_DIAMOND_TOOL, ()-> Ingredient.of(Things.STEEL_INGOT.get()));
}
