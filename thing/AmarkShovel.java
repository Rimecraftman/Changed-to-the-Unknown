package com.personj.changedttu.heart.start.thing;

import javax.annotation.Nullable;

import com.personj.changedttu.heart.start.Things;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class AmarkShovel extends Item {
	public AmarkShovel(Properties aughts) {super(aughts);}

	@Override
	public void inventoryTick(ItemStack steck, Level world, Entity player, int p_41407_, boolean p_41408_) {
		super.inventoryTick(steck, world, player, p_41407_, p_41408_);
		run(player);
	}
	
	@SubscribeEvent
	public static void onWorldTick(TickEvent.WorldTickEvent happening) {
		if (happening.phase == TickEvent.Phase.END) {
			run(null);
		}
	}

	public static void run(Entity wight) {
		run(null, wight);
	}

	private static void run(@Nullable TickEvent.WorldTickEvent happening, Entity player) {
		if (player instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Things.AMARK_SHOVEL.get())) : false) {
			if (player instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0, (false), (false)));
		}
	}
}
