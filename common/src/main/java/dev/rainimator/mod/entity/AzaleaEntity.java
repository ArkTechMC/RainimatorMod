package dev.rainimator.mod.entity;

import dev.rainimator.mod.RainimatorMod;
import dev.rainimator.mod.data.fraction.Fraction;
import dev.rainimator.mod.registry.util.MonsterEntityBase;
import dev.rainimator.mod.registry.RainimatorItems;
import dev.rainimator.mod.renderer.util.Stage;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class AzaleaEntity extends MonsterEntityBase {
    public static final Stage.StagedEntityTextureProvider texture = Stage.ofProvider(RainimatorMod.MOD_ID, "azalea");

    public AzaleaEntity(EntityType<AzaleaEntity> type, World world) {
        super(type, world, EntityGroup.UNDEAD);
        this.experiencePoints = 0;
        this.setPersistent();
        this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(RainimatorItems.DEEP_SICKLE.get()));
        this.equipStack(EquipmentSlot.OFFHAND, new ItemStack(RainimatorItems.DEEP_SICKLE.get()));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        DefaultAttributeContainer.Builder builder = MobEntity.createMobAttributes();
        builder = builder.add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3D);
        builder = builder.add(EntityAttributes.GENERIC_MAX_HEALTH, 80.0D);
        builder = builder.add(EntityAttributes.GENERIC_ARMOR, 20.0D);
        builder = builder.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0D);
        builder = builder.add(EntityAttributes.GENERIC_FOLLOW_RANGE, 64.0D);
        builder = builder.add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 5.0D);
        builder = builder.add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 1.0D);
        return builder;
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        Fraction.findAndAddTarget(this);
        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.2D, false) {
            protected double getSquaredMaxAttackDistance(LivingEntity entity) {
                return (this.mob.getWidth() * this.mob.getWidth() + entity.getWidth());
            }
        });
        this.goalSelector.add(3, new WanderAroundGoal(this, 1.0D));
        this.targetSelector.add(4, new RevengeGoal(this));
        this.goalSelector.add(5, new LookAroundGoal(this));
        this.goalSelector.add(6, new SwimGoal(this));
    }

    @Override
    public boolean canImmediatelyDespawn(double distanceToClosestPlayer) {
        return false;
    }


    @Override
    public SoundEvent getHurtSound(@NotNull DamageSource ds) {
        return Registries.SOUND_EVENT.get(Identifier.tryParse("entity.generic.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return Registries.SOUND_EVENT.get(Identifier.tryParse("entity.generic.death"));
    }

    @Override
    public boolean isInvulnerableTo(DamageSource damageSource) {
        if (damageSource.isOf(DamageTypes.DROWN))
            return true;
        return super.isInvulnerableTo(damageSource);
    }
}