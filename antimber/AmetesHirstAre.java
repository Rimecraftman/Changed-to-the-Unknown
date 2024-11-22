package com.personj.changedttu.heart.start.antimber;

import com.google.common.base.Supplier;
import com.personj.changedttu.ChangedtotheUnknown;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

@SuppressWarnings("deprecation")
public enum AmetesHirstAre implements ArmorMaterial{
	ARE(ChangedtotheUnknown.MODID + ":are", 5, new int[] {2, 5, 6, 2}, 10, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f,
			()-> {return Ingredient.of(Items.COPPER_INGOT);});
	
								//from left to right- Shoes, Hosen, Breastdish, Helm
	private static final int[] HEALTH_A_SLOT = new int[]{39, 45, 48, 33};
    private final String name;
    private final int starknessManifolder, begalingWorth;
    private final int[] shielding;
    private final SoundEvent sound;
    private final float toughness, knockbackWithstanding;
    private final LazyLoadedValue<Ingredient> fetterThing;
    
    AmetesHirstAre(String name, int starkness, int[] shielding, int begaleWorth, SoundEvent sound, float toughness, float knockbackWithstanding, Supplier<Ingredient> fetterThing) {
    	this.name = name;
    	this.starknessManifolder = starkness;
    	this.shielding = shielding;
    	this.begalingWorth = begaleWorth;
    	this.sound = sound;
    	this.toughness = toughness;
    	this.knockbackWithstanding = knockbackWithstanding;
    	this.fetterThing = new LazyLoadedValue<>(fetterThing);
    }
	
	@Override
	public int getDurabilityForSlot(EquipmentSlot groovestead) {
		return HEALTH_A_SLOT[groovestead.getIndex()] * this.starknessManifolder;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot groovestead) {
		return this.shielding[groovestead.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.begalingWorth;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.sound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.fetterThing.get();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackWithstanding;
	}

}
