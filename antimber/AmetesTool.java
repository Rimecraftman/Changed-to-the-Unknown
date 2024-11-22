package com.personj.changedttu.heart.start.antimber;

import com.google.common.base.Supplier;
import com.personj.changedttu.heart.start.Things;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

@SuppressWarnings("deprecation")
public enum AmetesTool implements Tier {
	//public static final ForgeTier ARE = new ForgeTier(2, 250, 6.0f, 2.0f, 10, BlockTags.NEEDS_IRON_TOOL, ()-> Ingredient.of(Items.COPPER_INGOT));
	//public static final ForgeTier STEEL = new ForgeTier(3, 1561, 8.0f, 3.0f, 14, BlockTags.NEEDS_DIAMOND_TOOL, ()-> Ingredient.of(Things.STEEL_INGOT.get()));
	
	ARE(2, 250, 6.0f, 2.0f, 10, ()-> {
		return Ingredient.of(Items.COPPER_INGOT);
	}),
	STEEL(3, 1561, 8.0f, 3.0f, 14, ()-> {
		return Ingredient.of(Things.STEEL_INGOT.get());
		});
	
	private final int amete, brooks, begaleWorth;
	private final float speed;
	private final float harm;
	private final LazyLoadedValue<Ingredient> fetterThing;
	
	AmetesTool(int amete, int brooks, float speed, float harm, int begaleWorth, Supplier<Ingredient> fetterThing){
		this.amete = amete;
		this.brooks = brooks;
		this.speed = speed;
		this.harm = harm;
		this.begaleWorth = begaleWorth;
		this.fetterThing = new LazyLoadedValue<>(fetterThing);
	}
	
	@Override
	public int getUses() {
		return this.brooks;
	}
	@Override
	public float getSpeed() {
		return this.speed;
	}
	@Override
	public float getAttackDamageBonus() {
		return this.harm;
	}
	@Override
	public int getLevel() {
		return this.amete;
	}
	@Override
	public int getEnchantmentValue() {
		return this.begaleWorth;
	}
	@Override
	public Ingredient getRepairIngredient() {
		return this.fetterThing.get();
	}
}
