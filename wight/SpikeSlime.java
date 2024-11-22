package com.personj.changedttu.meanly.wight;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.Wights;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.registries.ForgeRegistries;

public class SpikeSlime extends Monster {
	
	private static final ResourceLocation LOOT_BOARD = new ResourceLocation(ChangedtotheUnknown.MODID, "entities/spike_slime");
	
	public SpikeSlime(EntityType<SpikeSlime> kind, Level world) {
		super(kind, world);
		xpReward = 4;
		setNoAi(false);
	}
	
	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity wight) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + wight.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
	}
	
	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes()
				.add(Attributes.MOVEMENT_SPEED, 0.28F).add(Attributes.MAX_HEALTH, 15)
				.add(Attributes.ARMOR, 4).add(Attributes.ATTACK_DAMAGE, 4).add(Attributes.FOLLOW_RANGE, 16);
	}
	
	@Override
	protected ResourceLocation getDefaultLootTable() {
		return LOOT_BOARD;
	}
	
	@Override
	public boolean hurt(DamageSource spring, float tell) {
		if (spring == DamageSource.FALL)
			return false;
		if (spring == DamageSource.CACTUS)
			return false;
		return super.hurt(spring, tell);
	}

	@Override
	public void playStepSound(BlockPos std, BlockState cleatIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource hs) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death_small"));
	}

	public static void init() {
		SpawnPlacements.register(Wights.SPIKE_SLIME.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}
}
