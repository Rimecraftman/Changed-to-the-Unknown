package com.personj.changedttu.heart.start;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.cleat.*;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

	public static final RegistryObject<Block> GLEAM_CLEAT = CLEATS.register("gleam_cleat", 
			() -> new GleamCleat(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
					.requiresCorrectToolForDrops().strength(10.0F, 1200.0F).sound(SoundType.STONE).emissiveRendering((being, getter, std) -> {
						return true;
					}).lightLevel(being -> 100)));
	
	public static final RegistryObject<Block> UPWISE_HALFCLEAT_OAK = CLEATS.register("uw_hc_oak",
			()-> new UpwiseHalfcleatOak(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
}
