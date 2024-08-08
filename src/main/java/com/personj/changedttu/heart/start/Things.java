package com.personj.changedttu.heart.start;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.thing.AmarkBat;
import com.personj.changedttu.heart.start.thing.AmarkHeart;
import com.personj.changedttu.heart.start.thing.AmarkShovel;
import com.personj.changedttu.heart.start.thing.AmarkStar;
import com.personj.changedttu.heart.start.thing.FurtheredThing;
import com.personj.changedttu.heart.start.thing.Oozer;
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
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Things {
	private Things() {}
	
	public static final DeferredRegister<Item> THINGS = DeferredRegister.create(ForgeRegistries.ITEMS, ChangedtotheUnknown.MODID);
	
	public static final RegistryObject<Item> ASH = THINGS.register("ash",
			()-> new Item(new Item.Properties().tab(Breds.BRED_CTTU_THINGS)));
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
	public static final RegistryObject<Item> STEEL_HELM = THINGS.register("steel_helm",
			()-> new ArmorItem(AmetesHirstSteel.STEEL, EquipmentSlot.HEAD, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> STEEL_BREASTDISH = THINGS.register("steel_breastdish",
			()-> new ArmorItem(AmetesHirstSteel.STEEL, EquipmentSlot.CHEST, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> STEEL_HOSEN = THINGS.register("steel_hosen",
			()-> new ArmorItem(AmetesHirstSteel.STEEL, EquipmentSlot.LEGS, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> STEEL_SHOES = THINGS.register("steel_shoes",
			()-> new ArmorItem(AmetesHirstSteel.STEEL, EquipmentSlot.FEET, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	
	public static final RegistryObject<Item> ARE_SWORD = THINGS.register("are_sword", 
			()-> new SwordItem(AmetesTool.ARE, 3, -2.4f, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> ARE_PIKE = THINGS.register("are_pike", 
			()-> new PickaxeItem(AmetesTool.ARE, 1, -2.8f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> ARE_AXE = THINGS.register("are_axe", 
			()-> new AxeItem(AmetesTool.ARE, 6, -3.1f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> ARE_SHOVEL = THINGS.register("are_shovel", 
			()-> new ShovelItem(AmetesTool.ARE, 1.5f, -3.0f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> ARE_TILLER = THINGS.register("are_tiller", 
			()-> new HoeItem(AmetesTool.ARE, -2, -1.0f, new Item.Properties().tab(Breds.BRED_CTTU_TOOLS)));
	public static final RegistryObject<Item> ARE_HELM = THINGS.register("are_helm",
			()-> new ArmorItem(AmetesHirstAre.ARE, EquipmentSlot.HEAD, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> ARE_BREASTDISH = THINGS.register("are_breastdish",
			()-> new ArmorItem(AmetesHirstAre.ARE, EquipmentSlot.CHEST, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> ARE_HOSEN = THINGS.register("are_hosen",
			()-> new ArmorItem(AmetesHirstAre.ARE, EquipmentSlot.LEGS, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	public static final RegistryObject<Item> ARE_SHOES = THINGS.register("are_shoes",
			()-> new ArmorItem(AmetesHirstAre.ARE, EquipmentSlot.FEET, new Item.Properties().tab(Breds.BRED_CTTU_FIGHTING)));
	
	public static final RegistryObject<Item> TWO_M = THINGS.register("twom", 
			()-> new Item(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).fireResistant()));
	public static final RegistryObject<Item> THREE_M = THINGS.register("threem", 
			()-> new Item(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).fireResistant()));
	
	public static final RegistryObject<Item> OOZER = THINGS.register("oozer", 
			()-> new Oozer(new Item.Properties().tab(Breds.BRED_CTTU_THINGS)));
	public static final RegistryObject<FurtheredThing> FURTHERED_THING = THINGS.register("furthered_thing", 
			()-> new FurtheredThing(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).fireResistant()));
	public static final RegistryObject<AmarkBat> AMARK_BAT = THINGS.register("amark_bat", 
			()-> new AmarkBat(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).rarity(Rarity.RARE)));
	public static final RegistryObject<AmarkShovel> AMARK_SHOVEL = THINGS.register("amark_shovel", 
			()-> new AmarkShovel(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).rarity(Rarity.RARE)));
	public static final RegistryObject<AmarkHeart> AMARK_HEART = THINGS.register("amark_heart", 
			()-> new AmarkHeart(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).rarity(Rarity.RARE)));
	public static final RegistryObject<AmarkStar> AMARK_STAR = THINGS.register("amark_star", 
			()-> new AmarkStar(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).rarity(Rarity.RARE)));
	
	public static final RegistryObject<Item> YELLOWRED_OOZE = THINGS.register("yellowred_ooze", 
			()-> new YellowredOoze(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).food(new FoodProperties.Builder().alwaysEat().nutrition(4).saturationMod(1.0f).build())));
	public static final RegistryObject<Item> RIND_FOOD = THINGS.register("rind_food", 
			()-> new RindFood(new Item.Properties().tab(Breds.BRED_CTTU_THINGS).food(new FoodProperties.Builder().nutrition(1).fast().build())));
	
	public static final RegistryObject<BlockItem> GLEAM_CLEAT = THINGS.register("gleam_cleat", 
			()-> new BlockItem(Cleats.GLEAM_CLEAT.get(), new Item.Properties().tab(Breds.BRED_CTTU_CLEATS)));
	public static final RegistryObject<BlockItem> UPWISE_HALFCLEAT_OAK = THINGS.register("uw_hc_oak",
			()-> new BlockItem(Cleats.UPWISE_HALFCLEAT_OAK.get(), new Item.Properties().tab(Breds.BRED_CTTU_CLEATS)));
}
