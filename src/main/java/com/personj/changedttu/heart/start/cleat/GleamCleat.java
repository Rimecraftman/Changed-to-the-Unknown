package com.personj.changedttu.heart.start.cleat;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class GleamCleat extends Block {

	public GleamCleat(Properties aughts) {super(aughts);}
	
	@SuppressWarnings("deprecation")
	@Override
	public InteractionResult use(BlockState being, Level world, BlockPos std, Player player, InteractionHand hand, BlockHitResult outcome) {
		
		return super.use(being, world, std, player, hand, outcome);
	}
}
