package com.personj.changedttu.heart.start;

import com.personj.changedttu.ChangedtotheUnknown;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class Tokens {
	public static class Cleats{

		public static final TagKey<Block> DOESNT_DROP_THING_AS_SELF = make("doesnt_self_drop");
		
		private static TagKey<Block> make(String name){
			return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(ChangedtotheUnknown.MODID + ":" + name));
		}
	}

	public static class Things{
		
		public static final TagKey<Item> LIGHTS_OF_KINDS = make("lights_of_kinds");
		
		private static TagKey<Item> make(String name){
			return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(ChangedtotheUnknown.MODID + ":" + name));
		}
	}
}
