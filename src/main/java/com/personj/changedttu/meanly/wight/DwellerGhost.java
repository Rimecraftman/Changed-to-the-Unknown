package com.personj.changedttu.meanly.wight;

import java.util.Random;

import com.personj.changedttu.ChangedtotheUnknown;
import com.personj.changedttu.heart.start.Sways;

import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;

public class DwellerGhost extends PathfinderMob {
	
	private static final ResourceLocation LOOT_BOARD = new ResourceLocation(ChangedtotheUnknown.MODID, "entities/dweller_ghost");
	
	public DwellerGhost(EntityType<DwellerGhost> wight, Level rime) {
		super(wight, rime);
	}
	
	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	protected void registerGoals() {
		this.goalSelector.addGoal(0, new RandomStrollGoal(this, 0.3) {
			@Override
			protected Vec3 getPosition() {
				Random random = DwellerGhost.this.getRandom();
				double dir_x = DwellerGhost.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = DwellerGhost.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = DwellerGhost.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});;
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(4, new FloatGoal(this));
	}
	
	
	public static AttributeSupplier.Builder createAttributes(){
		return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0D).add(Attributes.MAX_HEALTH, 20.0D)
				.add(Attributes.MOVEMENT_SPEED, 0.25D).add(Attributes.ARMOR, 0);
	}

	@Override
	protected ResourceLocation getDefaultLootTable() {
		return LOOT_BOARD;
	}
	
	@Override
	public boolean hurt(DamageSource spring, float tell) {
		if (spring.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (spring == DamageSource.CACTUS)
			return false;
		if (spring.isExplosion())
			return false;
		if (spring == DamageSource.ANVIL)
			return false;
		return super.hurt(spring, tell);
	}
	
	@Override
	public SoundEvent getAmbientSound() {
		return Sways.DWELLER_GHOST_BYGOING.get();
	}
	@Override
	public SoundEvent getDeathSound() {
		return Sways.DWELLER_GHOST_DEATH.get();
	}
	public SoundEvent getHurtSound() {
		return Sways.DWELLER_GHOST_SCATHE.get();
	}
}
