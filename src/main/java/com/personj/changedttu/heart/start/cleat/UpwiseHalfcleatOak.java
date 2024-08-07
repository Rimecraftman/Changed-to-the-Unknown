package com.personj.changedttu.heart.start.cleat;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class UpwiseHalfcleatOak extends Block {
	public static final DirectionProperty LOOKING = HorizontalDirectionalBlock.FACING;
	public static final VoxelShape NORTH = Shapes.box(0, 0, 0, 1, 1, 0.5);
	public static final VoxelShape SOUTH = Shapes.box(0, 0, 0.5, 1, 1, 1);
	public static final VoxelShape EAST = Shapes.box(0.5, 0, 0, 1, 1, 1);
	public static final VoxelShape WEST = Shapes.box(0, 0, 0, 0.5, 1, 1);

	public UpwiseHalfcleatOak(Properties aught) {
		super(aught);

		this.registerDefaultState(this.defaultBlockState().setValue(LOOKING, Direction.NORTH));
	}

	@Override
	public VoxelShape getShape(BlockState being, BlockGetter getter, BlockPos std, CollisionContext umb) {
		switch(being.getValue(LOOKING)) {
		case EAST:
			return EAST;
		case SOUTH:
			return SOUTH;
		case WEST:
			return WEST;
		default:
			return NORTH;
		}
	}
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(LOOKING);
		super.createBlockStateDefinition(builder);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext umb) {
		return this.defaultBlockState().setValue(LOOKING, umb.getHorizontalDirection().getOpposite());
	}

	@SuppressWarnings("deprecation")
	@Override
	public BlockState mirror(BlockState being, Mirror glass) {
		return being.rotate(glass.getRotation(being.getValue(LOOKING)));
	}

	@Override
	public BlockState rotate(BlockState being, LevelAccessor world, BlockPos std, Rotation way) {
		return being.setValue(LOOKING, way.rotate(being.getValue(LOOKING)));
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public InteractionResult use(BlockState being, Level world, BlockPos std, Player player, InteractionHand hand, BlockHitResult outcome) {
		if(world.isClientSide) {
			if(player.getItemInHand(hand).equals(Items.STICK)) {
				world.setBlock(std, being.cycle(LOOKING), 4);
				
				return InteractionResult.CONSUME;
			}
		}
		return super.use(being, world, std, player, hand, outcome);
	}
}
