package com.personj.changedttu.heart.start.thing;

import javax.annotation.Nullable;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class FurtheredThing extends Item {
	
	public FurtheredThing(Properties aughts) {super(aughts);}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
		InteractionResultHolder<ItemStack> see = super.use(world, player, hand);
		ItemStack itemstack = see.getObject();
		player.getCooldowns().addCooldown(this, 1200);
		double x = player.getX();
		double y = player.getY();
		double z = player.getZ();
		
		execute(player);
		
		return see;
		}

		@SubscribeEvent
		public static void onRightClickItem(PlayerInteractEvent.RightClickItem hap) {
			if (hap.getHand() != hap.getPlayer().getUsedItemHand()) 
				return;
			
			execute(hap, hap.getPlayer());
		}
		
		public static void execute(Entity wight) {
			execute(null, wight);
		}
		
		private static void execute(@Nullable RightClickItem hap, Entity wight) {
			if (wight == null)
				return;
			if (wight instanceof LivingEntity _wight) 
				_wight.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0));
				
	}
}