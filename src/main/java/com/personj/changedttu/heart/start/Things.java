package com.personj.changedttu.heart.start;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.thing.FurtheredThing;

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
			()-> new Item(new Item.Properties().tab(Breds.TAB_CTTU)));
	public static final RegistryObject<Item> STEEL_SWORD = THINGS.register("steel_sword", 
			()-> new SwordItem(Ametes.STEEL, 4, -2.4f, new Item.Properties().tab(Breds.TAB_CTTU)));
	public static final RegistryObject<Item> STEEL_PIKE = THINGS.register("steel_pike", 
			()-> new PickaxeItem(Ametes.STEEL, 2, -2.8f, new Item.Properties().tab(Breds.TAB_CTTU)));
	public static final RegistryObject<Item> STEEL_AXE = THINGS.register("steel_axe", 
			()-> new AxeItem(Ametes.STEEL, 6, -3.0f, new Item.Properties().tab(Breds.TAB_CTTU)));
	public static final RegistryObject<Item> STEEL_SHOVEL = THINGS.register("steel_shovel", 
			()-> new ShovelItem(Ametes.STEEL, 2.5f, -3.0f, new Item.Properties().tab(Breds.TAB_CTTU)));
	public static final RegistryObject<Item> STEEL_TILLER = THINGS.register("steel_tiller", 
			()-> new HoeItem(Ametes.STEEL, -2, 0.0f, new Item.Properties().tab(Breds.TAB_CTTU)));
	
	public static final RegistryObject<Item> ARE_SWORD = THINGS.register("are_sword", 
			()-> new SwordItem(Ametes.STEEL, 2, -2.4f, new Item.Properties().tab(Breds.TAB_CTTU)));
	public static final RegistryObject<Item> ARE_PIKE = THINGS.register("are_pike", 
			()-> new PickaxeItem(Ametes.STEEL, 0, -2.8f, new Item.Properties().tab(Breds.TAB_CTTU)));
	public static final RegistryObject<Item> ARE_AXE = THINGS.register("are_axe", 
			()-> new AxeItem(Ametes.STEEL, 5, -3.1f, new Item.Properties().tab(Breds.TAB_CTTU)));
	public static final RegistryObject<Item> ARE_SHOVEL = THINGS.register("are_shovel", 
			()-> new ShovelItem(Ametes.STEEL, 0.5f, -3.0f, new Item.Properties().tab(Breds.TAB_CTTU)));
	public static final RegistryObject<Item> ARE_TILLER = THINGS.register("are_tiller", 
			()-> new HoeItem(Ametes.STEEL, -3, -1.0f, new Item.Properties().tab(Breds.TAB_CTTU)));
	
	public static final RegistryObject<Item> THREE_M = THINGS.register("threem", 
			()-> new Item(new Item.Properties().tab(Breds.TAB_CTTU).fireResistant()));
	public static final RegistryObject<Item> TWO_M = THINGS.register("twom", 
			()-> new Item(new Item.Properties().tab(Breds.TAB_CTTU).fireResistant()));
	
	public static final RegistryObject<FurtheredThing> FURTHERED_THING = THINGS.register("furthered_thing", 
			()-> new FurtheredThing(new Item.Properties().tab(Breds.TAB_CTTU).fireResistant()));
	
	public static final RegistryObject<BlockItem> GLEAM_CLEAT = THINGS.register("gleam_cleat", 
			()-> new BlockItem(Cleats.GLEAM_CLEAT.get(), new Item.Properties().tab(Breds.TAB_CTTU)));
}
