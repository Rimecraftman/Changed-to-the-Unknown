package com.personj.changedttu.heart.start.happenings;

import java.util.List;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.Chapmen;
import com.personj.changedttu.heart.start.Wights;
//import com.personj.changedttu.meanly.ithwights.HirstDelver;
import com.personj.changedttu.meanly.wight.DwellerGhost;
import com.personj.changedttu.meanly.wight.SpikeSlime;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ChangedtotheUnknown.MODID, bus = Bus.MOD)
public class Happenings {

	@SubscribeEvent
	public static void atellCosts(EntityAttributeCreationEvent happening) {
		happening.put(Wights.SPIKE_SLIME.get(), SpikeSlime.createAttributes().build());
		happening.put(Wights.DWELLER_GHOST.get(), DwellerGhost.createAttributes().build());
		//happening.put(Wights.HIRST_DELVER.get(), HirstDelver.createLivingAttributes().build());
	}
	
	public static void ekeBespokeCheaps(VillagerTradesEvent happening) {
		if (happening.getType() == Chapmen.WORLDWISDOMMAN.get()) {
			Int2ObjectMap<List<VillagerTrades.ItemListing>> cheaps = happening.getTrades();

			int newling = 1, learner = 2, fareman = 3, cunningman = 4, frea = 5;
			
			cheaps.get(newling).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 2), new ItemStack(Items.IRON_SWORD, 1), new ItemStack(ChangedItems.WHITE_LATEX_GOO.get(), 3), 4, 8, 0.2F));
			cheaps.get(newling).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 2), new ItemStack(Items.IRON_AXE, 1), new ItemStack(ChangedItems.ORANGE.get(), 6), 4, 8, 0.2F));
			cheaps.get(newling).add((cheaper, hapt) -> new MerchantOffer(
				new ItemStack(Items.EMERALD, 2), new ItemStack(ChangedItems.DARK_LATEX_GOO.get(), 3), 4, 8, 0.2F));
			
			cheaps.get(learner).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 4), new ItemStack(ChangedItems.SYRINGE.get(), 3), 6, 8, 0.2F));
			cheaps.get(learner).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 2), new ItemStack(ChangedItems.COMPACT_DISC.get(), 3), 6, 8, 0.2F));
			
			cheaps.get(fareman).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_GOO.get(), 6), new ItemStack(Items.ICE), new ItemStack(ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get(), 2), 8, 8, 0.2F));
			cheaps.get(fareman).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_GOO.get(), 6), new ItemStack(Items.PHANTOM_MEMBRANE), new ItemStack(ChangedItems.DARK_LATEX_DRAGON_CRYSTAL_FRAGMENT.get(), 2), 8, 8, 0.2F));

			cheaps.get(cunningman).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.BUCKET, 2), new ItemStack(Items.GLASS_PANE, 8), new ItemStack(ChangedItems.GAS_MASK.get(), 1), 10, 8, 0.2F));
			
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.WHITE_LATEX_GOO.get(), 8), new ItemStack(Items.GLASS, 24), new ItemStack(ChangedItems.LATEX_BASE.get(), 8), 12, 8, 0.2F));
		}
		if (happening.getType() == Chapmen.ITH_TOOLSMITH.get()) {
			Int2ObjectMap<List<VillagerTrades.ItemListing>> cheaps = happening.getTrades();

			int newling = 1, learner = 2, fareman = 3, cunningman = 4, frea = 5;
			
			cheaps.get(newling).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 8), new ItemStack(ChangedItems.TSC_BATON.get(), 1), 4, 8, 0.2F));
			cheaps.get(newling).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 6), new ItemStack(Items.CHAINMAIL_CHESTPLATE), new ItemStack(ChangedItems.CHAINMAIL_UPPER_ABDOMEN_ARMOR.get(), 1), 4, 8, 0.2F));
			cheaps.get(newling).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 6), new ItemStack(Items.LEATHER_CHESTPLATE), new ItemStack(ChangedItems.LEATHER_UPPER_ABDOMEN_ARMOR.get(), 1), 4, 8, 0.2F));
			cheaps.get(newling).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 6), new ItemStack(Items.CHAINMAIL_LEGGINGS), new ItemStack(ChangedItems.CHAINMAIL_LOWER_ABDOMEN_ARMOR.get(), 1), 4, 8, 0.2F));
			cheaps.get(newling).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 6), new ItemStack(Items.LEATHER_LEGGINGS), new ItemStack(ChangedItems.LEATHER_LOWER_ABDOMEN_ARMOR.get(), 1), 4, 8, 0.2F));
			cheaps.get(newling).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 6), new ItemStack(Items.CHAINMAIL_LEGGINGS), new ItemStack(ChangedItems.CHAINMAIL_QUADRUPEDAL_LEGGINGS.get(), 1), 4, 8, 0.2F));
			cheaps.get(newling).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 6), new ItemStack(Items.LEATHER_LEGGINGS), new ItemStack(ChangedItems.LEATHER_QUADRUPEDAL_LEGGINGS.get(), 1), 4, 8, 0.2F));
			cheaps.get(newling).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 6), new ItemStack(Items.CHAINMAIL_BOOTS), new ItemStack(ChangedItems.CHAINMAIL_QUADRUPEDAL_BOOTS.get(), 1), 4, 8, 0.2F));
			cheaps.get(newling).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 6), new ItemStack(Items.LEATHER_BOOTS), new ItemStack(ChangedItems.LEATHER_QUADRUPEDAL_BOOTS.get(), 1), 4, 8, 0.2F));
			
			cheaps.get(learner).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 10), new ItemStack(ChangedItems.TSC_STAFF.get(), 1), 6, 8, 0.2F));
			cheaps.get(learner).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 8), new ItemStack(Items.GOLDEN_CHESTPLATE), new ItemStack(ChangedItems.GOLDEN_UPPER_ABDOMEN_ARMOR.get(), 1), 6, 8, 0.2F));
			cheaps.get(learner).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 8), new ItemStack(Items.GOLDEN_LEGGINGS), new ItemStack(ChangedItems.GOLDEN_LOWER_ABDOMEN_ARMOR.get(), 1), 6, 8, 0.2F));
			cheaps.get(learner).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 8), new ItemStack(Items.GOLDEN_LEGGINGS), new ItemStack(ChangedItems.GOLDEN_QUADRUPEDAL_LEGGINGS.get(), 1), 6, 8, 0.2F));
			cheaps.get(learner).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 8), new ItemStack(Items.GOLDEN_BOOTS), new ItemStack(ChangedItems.GOLDEN_QUADRUPEDAL_BOOTS.get(), 1), 6, 8, 0.2F));
			
			cheaps.get(fareman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 12), new ItemStack(ChangedBlocks.BEDSIDE_IV_RACK.get(), 1), 8, 8, 0.2F));
			cheaps.get(fareman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 10), new ItemStack(Items.IRON_CHESTPLATE), new ItemStack(ChangedItems.IRON_UPPER_ABDOMEN_ARMOR.get(), 1), 8, 8, 0.2F));
			cheaps.get(fareman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 10), new ItemStack(Items.IRON_LEGGINGS), new ItemStack(ChangedItems.IRON_LOWER_ABDOMEN_ARMOR.get(), 1), 8, 8, 0.2F));
			cheaps.get(fareman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 10), new ItemStack(Items.IRON_LEGGINGS), new ItemStack(ChangedItems.IRON_QUADRUPEDAL_LEGGINGS.get(), 1), 8, 8, 0.2F));
			cheaps.get(fareman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 10), new ItemStack(Items.IRON_BOOTS), new ItemStack(ChangedItems.IRON_QUADRUPEDAL_BOOTS.get(), 1), 8, 8, 0.2F));
		
			cheaps.get(cunningman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 10), new ItemStack(ChangedBlocks.INFUSER.get(), 1), 10, 8, 0.2F));
			cheaps.get(cunningman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 12), new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(ChangedItems.DIAMOND_UPPER_ABDOMEN_ARMOR.get(), 1), 10, 8, 0.2F));
			cheaps.get(cunningman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 12), new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(ChangedItems.DIAMOND_LOWER_ABDOMEN_ARMOR.get(), 1), 10, 8, 0.2F));
			cheaps.get(cunningman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 12), new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(ChangedItems.DIAMOND_QUADRUPEDAL_LEGGINGS.get(), 1), 10, 8, 0.2F));
			cheaps.get(cunningman).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 12), new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(ChangedItems.DIAMOND_QUADRUPEDAL_BOOTS.get(), 1), 10, 8, 0.2F));
			
			cheaps.get(frea).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 10), new ItemStack(ChangedBlocks.PURIFIER.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 14), new ItemStack(Items.NETHERITE_CHESTPLATE), new ItemStack(ChangedItems.NETHERITE_UPPER_ABDOMEN_ARMOR.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 14), new ItemStack(Items.NETHERITE_LEGGINGS), new ItemStack(ChangedItems.NETHERITE_LOWER_ABDOMEN_ARMOR.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 14), new ItemStack(Items.NETHERITE_LEGGINGS), new ItemStack(ChangedItems.NETHERITE_QUADRUPEDAL_LEGGINGS.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((chapman, hapt) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 14), new ItemStack(Items.NETHERITE_BOOTS), new ItemStack(ChangedItems.NETHERITE_QUADRUPEDAL_BOOTS.get(), 1), 12, 8, 0.2F));
		}
		
		if(happening.getType() == Chapmen.SONG_FREA.get()) {
			Int2ObjectMap<List<VillagerTrades.ItemListing>> cheaps = happening.getTrades();

			int newling = 1, learner = 2, fareman = 3, cunningman = 4, frea = 5;
			
			cheaps.get(newling).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.COBBLESTONE, 32), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(Items.MUSIC_DISC_BLOCKS, 1), 4, 8, 0.2F));
			
			cheaps.get(learner).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_GOO.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.BLACK_GOO_ZONE_RECORD.get(), 1), 6, 8, 0.2F));
			cheaps.get(learner).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.WHITE_LATEX_GOO.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.THE_WHITE_GOO_JUNGLE_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(learner).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.OAK_PLANKS, 16), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(Items.NOTE_BLOCK, 1), 6, 8, 0.2F));
			
			cheaps.get(fareman).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_GOO.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.BLACK_GOO_ZONE_RECORD.get(), 1), 8, 8, 0.2F));
			
			cheaps.get(cunningman).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_GOO.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.BLACK_GOO_ZONE_RECORD.get(), 1), 10, 8, 0.2F));
			
			
			cheaps.get(newling).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.COBBLESTONE, 32), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(Items.MUSIC_DISC_STAL, 1), 4, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_GOO.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.BLACK_GOO_ZONE_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.CRYSTAL_ZONE_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedBlocks.WOLF_GAS_CANISTER.get(), 1), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.GAS_ROOM_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.LAB_BOOK.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.LABORATORY_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.GRASS_BLOCK, 1), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.OUTSIDE_THE_TOWER_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_MASK.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.OWO_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_GOO.get(), 10), new ItemStack(ChangedItems.DARK_LATEX_MASK.get(), 1), new ItemStack(ChangedItems.PURO_THE_BLACK_GOO_RECORD.get(), 1), 12, 8, 0.2F));	
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.DARK_LATEX_MASK.get(), 1), new ItemStack(ChangedBlocks.WALL_VENT.get(), 1), new ItemStack(ChangedItems.PUROS_HOME_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.BOOK, 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.THE_LIBRARY_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.STRING, 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.THE_LION_CHASE_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedItems.LATEX_WOLF_CRYSTAL_FRAGMENT.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.THE_SCARLET_CRYSTAL_MINE_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.COD_BUCKET, 1), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.THE_SHARK_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.INK_SAC, 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.THE_SQUID_DOG_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(ChangedBlocks.WALL_VENT.get(), 10), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(ChangedItems.VENT_PIPE_RECORD.get(), 1), 12, 8, 0.2F));
			cheaps.get(frea).add((cheaper, hapt) -> new MerchantOffer(
					new ItemStack(Items.GOLD_INGOT, 16), new ItemStack(Items.IRON_INGOT, 4), new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1), 12, 8, 0.2F));
		}
	}
}