package com.personj.changedttu.heart.start;

import com.personj.changedttu.ChangedtotheUnknown;

import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Drawings {
	public static final DeferredRegister<Motive> DRAWINGS = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, ChangedtotheUnknown.MODID);
	
	//For drawings/tiverings, the first mark is for the width, the other, for the height
	public static final RegistryObject<Motive> THE_SEAL = DRAWINGS.register("the_seal", 
			()-> new Motive(32, 32));
	public static final RegistryObject<Motive> THE_ASKER = DRAWINGS.register("the_asker", 
			()-> new Motive(32, 16));
	public static final RegistryObject<Motive> ANGINN_S = DRAWINGS.register("anginn_s", 
			()-> new Motive(32, 16));
	public static final RegistryObject<Motive> ANGINN_G = DRAWINGS.register("anginn_g", 
			()-> new Motive(48, 32));
}
