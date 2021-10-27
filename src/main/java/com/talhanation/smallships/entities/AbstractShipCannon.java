package com.talhanation.smallships.entities;

import com.talhanation.smallships.Main;
import com.talhanation.smallships.network.MessageShootCannon;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;


public abstract class AbstractShipCannon extends AbstractShipDamage {
    private static final DataParameter<Integer> CANNON_COUNT = EntityDataManager.defineId(AbstractShipCannon.class, DataSerializers.INT);
    private static final DataParameter<Integer> SIDE = EntityDataManager.defineId(AbstractShipCannon.class, DataSerializers.INT);

    public float shootCounter;

    public AbstractShipCannon(EntityType<? extends TNBoatEntity> type, World world) {
        super(type, world);

    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(CANNON_COUNT, 2);
    }

    ////////////////////////////////////TICK////////////////////////////////////

    @Override
    public void tick() {
        super.tick();

    }

    ////////////////////////////////////SAVE////////////////////////////////////

    @Override
    protected void addAdditionalSaveData(CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
        nbt.putInt("CannonCount", getCannonCount());
    }



    @Override
    protected void readAdditionalSaveData(CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
        setCannonCount(nbt.getInt("CannonCount"));
    }

    ////////////////////////////////////GET////////////////////////////////////

    public int getCannonCount(){
        return entityData.get(CANNON_COUNT);
    }


    ////////////////////////////////////SET////////////////////////////////////

    public void setCannonCount(int count){
        entityData.set(CANNON_COUNT, count);
    }

    ////////////////////////////////////ON FUNCTIONS////////////////////////////////////

    public void onCannonKeyPressed(){
        Main.SIMPLE_CHANNEL.sendToServer(new MessageShootCannon(true));
    }


    public Vector3d getShootVector(){
        Vector3d forward = this.getForward();
        Vector3d right = forward.yRot(-3.14F/2);
        Vector3d left  = forward.yRot(3.14F/2);

        Direction shipDirection = this.getDirection();
        Direction playerDirection = this.getDriver().getDirection();

        switch (shipDirection){
            case NORTH:
                if (playerDirection == Direction.EAST) {
                    return right;
                }
                if (playerDirection == Direction.WEST){
                    return left;
                }
                break;
            case SOUTH:
                if (playerDirection == Direction.EAST) {
                    return left;
                }
                if (playerDirection == Direction.WEST){
                    return right;
                }
                break;
            case EAST:
                if (playerDirection == Direction.NORTH) {
                    return left;
                }
                if (playerDirection == Direction.SOUTH){
                    return right;
                }
                break;
            case WEST:
                if (playerDirection == Direction.NORTH) {
                    return right;
                }
                if (playerDirection == Direction.SOUTH){
                    return left;
                }
                break;
        }
        return null;
    }

    public void shootCannon(boolean s) {
        Vector3d vector3d = this.getShootVector();
        float speed = 5F;

        /*
        double d1 = this.getDriver().getX() - this.getX();
        double d2 = this.getDriver().getY(0.75) - this.getY();
        double d3 = this.getDriver().getZ() - this.getZ();
         */
        double d1 = this.getX() + 0;
        double d2 = this.getY() + 2.5;
        double d3 = this.getZ() + 1.5;

        double d4 = this.getX() + 2.5;
        double d5 = this.getY() + 2.5;
        double d6 = this.getZ() + 0;

        LlamaSpitEntity fireballentity = new LlamaSpitEntity(this.level, d1, d2, d3,  d1, d2, d3);
        fireballentity.shoot(vector3d.x(), vector3d.y(), vector3d.z(), speed, 10);
        this.level.addFreshEntity(fireballentity);

        this.level.playSound(null, this.getX(), this.getY() + 4, this.getZ(), SoundEvents.GENERIC_EXPLODE, this.getSoundSource(), 10.0F, 0.8F + 0.4F * this.random.nextFloat());

        /*
        LlamaSpitEntity fireballentity1 = new LlamaSpitEntity(this.level, d4, d5, d6,  d4, d5, d6);
        fireballentity1.shoot(vector3d.x(), vector3d.y(), vector3d.z(), speed, 10);
        this.level.addFreshEntity(fireballentity1);

        this.level.playSound(null, this.getX(), this.getY() + 4, this.getZ(), SoundEvents.GENERIC_EXPLODE, this.getSoundSource(), 10.0F, 0.8F + 0.4F * this.random.nextFloat());
        */
    }

    ////////////////////////////////////PARTICLE FUNCTIONS////////////////////////////////////



    ////////////////////////////////////OTHER FUNCTIONS////////////////////////////////////



}
