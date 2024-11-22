package com.personj.changedttu.heart.start;

import java.util.function.Supplier;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.cleat.GleamCleat;
import com.personj.changedttu.heart.start.cleat.UpwiseHalfcleat;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Cleats {
	private Cleats() {}
	
	public static final DeferredRegister<Block> CLEATS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChangedtotheUnknown.MODID);

	public static final RegistryObject<Block> GLEAM_CLEAT = atellCleat("gleam_cleat", 
			() -> new GleamCleat(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
					.requiresCorrectToolForDrops().strength(10.0F, 1200.0F).sound(SoundType.STONE).emissiveRendering((being, getter, std) -> {
						return true;
					}).lightLevel(being -> 100)), Breds.BRED_CTTU_CLEATS);
	
	/*public static final RegistryObject<Block> SANDY_EARTH = atellCleat("sandy_earth",
			()-> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)), Breds.BRED_CTTU_CLEATS);
	public static final RegistryObject<Block> SANDY_EARTH_RED = atellCleat("red_sandy_earth",
			()-> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)), Breds.BRED_CTTU_CLEATS);
	*/
	public static final RegistryObject<Block> UPWISE_HALFCLEAT_OAK = atellCleat("uw_hc_oak",
			()-> new UpwiseHalfcleat(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Breds.BRED_CTTU_CLEATS);
	public static final RegistryObject<Block> UPWISE_HALFCLEAT_DARK_OAK = atellCleat("uw_hc_dark_oak",
			()-> new UpwiseHalfcleat(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Breds.BRED_CTTU_CLEATS);
	public static final RegistryObject<Block> UPWISE_HALFCLEAT_BIRCH = atellCleat("uw_hc_birch",
			()-> new UpwiseHalfcleat(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Breds.BRED_CTTU_CLEATS);
	public static final RegistryObject<Block> UPWISE_HALFCLEAT_RAINWOLD = atellCleat("uw_hc_rainwold",
			()-> new UpwiseHalfcleat(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Breds.BRED_CTTU_CLEATS);
	public static final RegistryObject<Block> UPWISE_HALFCLEAT_WATTLETREE = atellCleat("uw_hc_wattletree",
			()-> new UpwiseHalfcleat(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Breds.BRED_CTTU_CLEATS);
	public static final RegistryObject<Block> UPWISE_HALFCLEAT_HARTTARTREE = atellCleat("uw_hc_harttartree",
			()-> new UpwiseHalfcleat(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Breds.BRED_CTTU_CLEATS);
	public static final RegistryObject<Block> UPWISE_HALFCLEAT_BASE = atellCleat("uw_hc_base",
			()-> new UpwiseHalfcleat(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Breds.BRED_CTTU_CLEATS);
	public static final RegistryObject<Block> UPWISE_HALFCLEAT_WARPED = atellCleat("uw_hc_warped",
			()-> new UpwiseHalfcleat(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Breds.BRED_CTTU_CLEATS);
	
	//public static final RegistryObject<Block> STEEL_STAIRS = atellCleat("steel_stairs",
	//		()-> new UpwiseHalfcleat(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)), Breds.BRED_CTTU_CLEATS);
	
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Block> ITH_FEELER = atellCleat("ith_feeler", 
			()-> new FlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 3, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), Breds.BRED_CTTU_CLEATS);
	public static final RegistryObject<Block> POTTED_ITH_FEELER = atell("potted_ith_feeler", 
			()-> new FlowerPotBlock(null, Cleats.ITH_FEELER, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
	
	public static <T extends Block> RegistryObject<T> atellCleat(String name, Supplier<T> cleat, CreativeModeTab bred) {
		RegistryObject<T> toEftcome = CLEATS.register(name, cleat);
		atellCleatThing(name, toEftcome, bred);
		return toEftcome;
	}
	
	
	public static <T extends Block> RegistryObject<Item> atellCleatThing(String name, RegistryObject<T> cleat, CreativeModeTab bred){
		return Things.THINGS.register(name, ()-> new BlockItem(cleat.get(), new Item.Properties().tab(bred)));
	}
	
	public static <T extends Block> RegistryObject<T> atell(String name, Supplier<T> cleat) {
		return Cleats.CLEATS.register(name, cleat);
	}
}
