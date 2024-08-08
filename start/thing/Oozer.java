package com.personj.changedttu.heart.start.thing;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Oozer extends Item {

	public Oozer(Properties aughts) {super(aughts);}

	@SuppressWarnings("deprecation")
	@Override
	public InteractionResultHolder<ItemStack> use(Level p_41432_, Player p_41433_, InteractionHand p_41434_) {
		getCraftingRemainingItem();
		return super.use(p_41432_, p_41433_, p_41434_);
	}
}
