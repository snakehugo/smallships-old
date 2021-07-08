package com.talhanation.smallships.client.events;

import com.talhanation.smallships.Main;
import com.talhanation.smallships.entities.AbstractInventoryBoat;
import com.talhanation.smallships.entities.AbstractSailBoat;
import com.talhanation.smallships.entities.TNBoatEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class KeyEvents {

    private boolean wasSailPressed;
    private boolean wasInvPressed;
    private boolean wasDismountPressed;

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        Minecraft minecraft = Minecraft.getInstance();
        ClientPlayerEntity clientPlayerEntity = minecraft.player;
        if (clientPlayerEntity == null)
            return;

        Entity riding = clientPlayerEntity.getVehicle();
        if (!(riding instanceof TNBoatEntity)){
            return;
        }
        TNBoatEntity boat = (TNBoatEntity) riding;
        if (clientPlayerEntity.equals(boat.getDriver())) {
            if (Main.SAIL_KEY.isDown()) {
                boat.onKeyPressed();
                this.wasSailPressed = true;
            }
            else {
                this.wasSailPressed = false;
            }
        }
        if (boat.getPassengers().contains(clientPlayerEntity)) {
            if (Main.INV_KEY.isDown()) {
                boat.onInvPressed(clientPlayerEntity);
                this.wasInvPressed = true;
            }else {
                this.wasInvPressed = false;

            }
        }
        if (clientPlayerEntity.equals(boat.getDriver())) {
            if (Main.SAIL_L_KEY.isDown()) {
                boat.onKeyLowerPressed();
                this.wasSailPressed = true;
            }
            else {
                this.wasSailPressed = false;
            }
        }
        if (clientPlayerEntity.equals(boat.getDriver())) {
            if (Main.SAIL_H_KEY.isDown()) {
                boat.onKeyHigherPressed();
                this.wasSailPressed = true;
            }
            else {
                this.wasSailPressed = false;
            }
        }
        /*if (clientPlayerEntity.equals(boat.getDriver())) {
            if (Main.DISMOUNT_KEY.isDown()) {
                boat.onDismountPressed();
                this.wasDismountPressed = true;
            }
            else {
                this.wasDismountPressed = false;
            }
        }
    */
    }
}
