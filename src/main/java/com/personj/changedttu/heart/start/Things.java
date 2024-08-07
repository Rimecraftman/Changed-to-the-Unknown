package com.personj.changedttu.heart.start;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.thing.FurtheredThing;
import com.personj.changedttu.heart.start.thing.RindFood;
import com.personj.changedttu.heart.start.thing.YellowredOoze;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Things {
	private Things() {}
	
	public static final DeferredRegister<Item> THINGS = DeferredRegister.create(ForgeRegistries.ITEMS, ChangedtotheUnknown.MODID);
	
	public static final RegistryObject<Item> STEEL_INGOT = THINGS.register("steel_ingot", 
			()-> new Item(new Item.Properties().tab(Breds.BRED_CTTU_THINGS)));
	public static final RegistryObject<Item> STEEL_SWORD = THINGS.register("steel_sword", 
			()-> new SwordItem(AmetesTool.STEEL, 4, -2.4f, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> STEEL_PIKE = THINGS.register("steel_pike", 
			()-> new PickaxeItem(AmetesTool.STEEL, 2, -2.8f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> STEEL_AXE = THINGS.register("steel_axe", 
			()-> new AxeItem(AmetesTool.STEEL, 6, -3.0f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> STEEL_SHOVEL = THINGS.register("steel_shovel", 
			()-> new ShovelItem(AmetesTool.STEEL, 2.5f, -3.0f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> STEEL_TILLER = THINGS.register("steel_tiller", 
			()-> new HoeItem(AmetesTool.STEEL, -2, 0.0f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	
	public static final RegistryObject<Item> ARE_SWORD = THINGS.register("are_sword", 
			()-> new SwordItem(AmetesTool.ARE, 2, -2.4f, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> ARE_PIKE = THINGS.register("are_pike", 
			()-> new PickaxeItem(AmetesTool.ARE, 0, -2.8f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> ARE_AXE = THINGS.register("are_axe", 
			()-> new AxeItem(AmetesTool.ARE, 5, -3.1f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> ARE_SHOVEL = THINGS.register("are_shovel", 
			()-> new ShovelItem(AmetesTool.ARE, 0.5f, -3.0f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> ARE_TILLER = THINGS.register("are_tiller", 
			()-> new HoeItem(AmetesTool.ARE, -3, -1.0f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> ARE_HELM = THINGS.register("are_helm",
			()-> new ArmorItem(AmetesHirstAre.ARE, EquipmentSlot.HEAD, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> ARE_BREASTDISH = THINGS.register("are_breastdish",
			()-> new ArmorItem(AmetesHirstAre.ARE, EquipmentSlot.CHEST, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> ARE_HOSEN = THINGS.register("are_hosen",
			()-> new ArmorItem(AmetesHirstAre.ARE, EquipmentSlot.LEGS, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> ARE_SHOES = THINGS.register("are_shoes",
			()-> new ArmorItem(AmetesHirstAre.ARE, EquipmentSlot.FEET, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	
	public static final RegistryObject<Item> THREE_M = THINGS.register("threem", 
			()-> new Item(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).fireResistant()));
	public static final RegistryObject<Item> TWO_M = THINGS.register("twom", 
			()-> new Item(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).fireResistant()));
	
	public static final RegistryObject<FurtheredThing> FURTHERED_THING = THINGS.register("furthered_thing", 
			()-> new FurtheredThing(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).fireResistant()));
	
	public static final RegistryObject<Item> YELLOWRED_OOZE = THINGS.register("yellowred_ooze", 
			()-> new YellowredOoze(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).food(new FoodProperties.Builder().alwaysEat().nutrition(4).saturationMod(1.0f).build())));
	public static final RegistryObject<Item> RIND_FOOD = THINGS.register("rind_food", 
			()-> new RindFood(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).food(new FoodProperties.Builder().nutrition(1).fast().build())));
	
	public static final RegistryObject<BlockItem> GLEAM_CLEAT = THINGS.register("gleam_cleat", 
			()-> new BlockItem(Cleats.GLEAM_CLEAT.get(), new Item.Properties().tab(Breds.BRED_CTTU_CLEATS)));
	public static final RegistryObject<BlockItem> UPWISE_HALFCLEAT_OAK = THINGS.register("uw_hc_oak",
			()-> new BlockItem(Cleats.UPWISE_HALFCLEAT_OAK.get(), new Item.Properties().tab(Breds.BRED_CTTU_CLEATS)));
}
