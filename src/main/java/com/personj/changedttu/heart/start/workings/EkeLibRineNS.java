/*
 * THIS WORKING HAS BEEN FORNIMEN ON THE GROUNDS THAT IT IS NOT ONEFOLDLY(IT WILL MAKE ANY THING DO THIS IF THE PLAYER'S HAND ISN'T EMPTY).
	Code is run through execute(wight);
	
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
			_wight.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 1));
	}
	
*/
