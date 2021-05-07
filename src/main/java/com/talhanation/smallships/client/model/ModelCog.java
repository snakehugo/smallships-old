package com.talhanation.smallships.client.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.talhanation.smallships.entities.CogEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModelCog<T extends CogEntity> extends EntityModel<T> {
    public ModelRenderer botom_1;
    public ModelRenderer side_1;
    public ModelRenderer side_3;
    public ModelRenderer botom_2;
    public ModelRenderer botom_3;
    public ModelRenderer botom_4;
    public ModelRenderer side_4;
    public ModelRenderer side_5;
    public ModelRenderer side_6;
    public ModelRenderer side_7;
    public ModelRenderer side_8;
    public ModelRenderer side_9;
    public ModelRenderer side_10;
    public ModelRenderer side_2;
    public ModelRenderer botom_1_1;
    public ModelRenderer botom_5;
    public ModelRenderer botom_6;
    public ModelRenderer side_11;
    public ModelRenderer side_12;
    public ModelRenderer steer;
    public ModelRenderer Cargo0;
    public ModelRenderer Cargo3;
    public ModelRenderer Cargo2;
    public ModelRenderer Cargo1;
    public ModelRenderer mast_1;
    public ModelRenderer seil_1_1;
    public ModelRenderer seil_3_1;
    public ModelRenderer seil_2_1;
    public ModelRenderer Sail_0;
    public ModelRenderer Sail_1;
    public ModelRenderer Cargo_0_1;
    public ModelRenderer Cargo_0_2;
    public ModelRenderer Cargo_3_1;
    public ModelRenderer Cargo_3_2;
    public ModelRenderer Cargo_2_1;
    public ModelRenderer Cargo_2_2;
    public ModelRenderer Cargo_1_1;
    public ModelRenderer Cargo_1_2;
    public ModelRenderer mast_2;
    public ModelRenderer side_10_1;
    public ModelRenderer side_11_1;
    public ModelRenderer side_12_1;
    public ModelRenderer side_13;
    public ModelRenderer side_14;
    public ModelRenderer side_15;
    public ModelRenderer side_16;
    public ModelRenderer side_17;
    public ModelRenderer seil_4_1;
    public ModelRenderer mast_3;
    public ModelRenderer mast_4;
    public ModelRenderer seil_4_2;
    public ModelRenderer seil_4_3;
    public ModelRenderer seil_4_4;
    public ModelRenderer seil_4_4_1;
    public ModelRenderer seil_1_2;
    public ModelRenderer seil_1_3;
    public ModelRenderer seil_1_4;
    public ModelRenderer seil_1_4_1;
    public ModelRenderer seil_1_4_2;
    public ModelRenderer seil_1_5;
    public ModelRenderer seil_1_6;
    public ModelRenderer seil_3_2;
    public ModelRenderer seil_3_3;
    public ModelRenderer seil_3_4;
    public ModelRenderer seil_3_5;
    public ModelRenderer seil_2_2;
    public ModelRenderer seil_2_3;
    public ModelRenderer seil_2_4;
    public ModelRenderer seil_2_5;
    public ModelRenderer Sail_1_2;
    public ModelRenderer Sail_1_2_1;
    public ModelRenderer Sail_1_2_2;
    public ModelRenderer Sail_1_2_3;
    public ModelRenderer Sail_1_2_4;
    public ModelRenderer Sail_1_2_5;
    public ModelRenderer Sail_1_2_6;

    public ModelCog() {
        this.texWidth = 128;
        this.texHeight = 64;
        this.Cargo3 = new ModelRenderer(this, 96, 38);
        this.Cargo3.mirror = true;
        this.Cargo3.setPos(8.5F, -5.0F, 21.8F);
        this.Cargo3.addBox(0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Cargo3, 0.0F, -3.141592653589793F, 0.0F);
        this.Cargo0 = new ModelRenderer(this, 96, 38);
        this.Cargo0.setPos(-13.0F, -5.0F, -5.0F);
        this.Cargo0.addBox(0.0F, 0.0F, -2.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.side_7 = new ModelRenderer(this, 0, 27);
        this.side_7.setPos(43.0F, 4.0F, 0.0F);
        this.side_7.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_7, 0.0F, 1.5707963267948966F, 0.0F);
        this.seil_1_4_1 = new ModelRenderer(this, 0, 0);
        this.seil_1_4_1.setPos(0.0F, 0.0F, 0.0F);
        this.seil_1_4_1.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.seil_3_5 = new ModelRenderer(this, 0, 0);
        this.seil_3_5.setPos(0.0F, 0.0F, 6.0F);
        this.seil_3_5.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.Cargo1 = new ModelRenderer(this, 50, 47);
        this.Cargo1.setPos(-0.8F, 0.0F, 15.8F);
        this.Cargo1.addBox(0.0F, 0.0F, 0.0F, 7.0F, 3.0F, 13.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Cargo1, 0.0F, -1.5707963267948966F, 0.0F);
        this.Cargo_2_1 = new ModelRenderer(this, 30, 55);
        this.Cargo_2_1.setPos(9.0F, 3.0F, -0.3F);
        this.Cargo_2_1.addBox(0.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.side_12 = new ModelRenderer(this, 0, 27);
        this.side_12.setPos(-19.0F, 0.0F, 8.0F);
        this.side_12.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_12, 0.0F, 1.5707963267948966F, 0.0F);
        this.Sail_0 = new ModelRenderer(this, 96, 0);
        this.Sail_0.setPos(8.4F, -50.0F, -24.0F);
        this.Sail_0.addBox(0.0F, 0.0F, 0.0F, 5.0F, 6.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_0.addBox(0.0F, 0.0F, 10.0F, 5.0F, 6.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_0.addBox(0.0F, 0.0F, 20.0F, 5.0F, 6.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_0.addBox(0.0F, 0.0F, 50.0F, 5.0F, 6.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_0.addBox(0.0F, 0.0F, 40.0F, 5.0F, 6.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_0.addBox(0.0F, 0.0F, 30.0F, 5.0F, 6.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_0.addBox(0.0F, 0.0F, 60.0F, 5.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_2 = new ModelRenderer(this, 96, 0);
        this.Sail_1_2_2.setPos(0.0F, 4.7F, 0.0F);
        this.Sail_1_2_2.addBox(0.0F, 0.0F, 10.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_2.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_2.addBox(0.0F, 0.0F, 20.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_2.addBox(0.0F, 0.0F, 30.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_2.addBox(0.0F, 0.0F, 40.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_2.addBox(0.0F, 0.0F, 50.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_2.addBox(0.0F, 0.0F, 60.0F, 1.0F, 5.0F, 3.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Sail_1_2_2, 0.0F, 0.0F, 0.2617993877991494F);
        this.seil_1_4 = new ModelRenderer(this, 0, 0);
        this.seil_1_4.setPos(0.0F, 0.0F, 0.0F);
        this.seil_1_4.texOffs(100, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.side_5 = new ModelRenderer(this, 0, 43);
        this.side_5.setPos(28.0F, 4.0F, 24.0F);
        this.side_5.addBox(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.side_4 = new ModelRenderer(this, 0, 35);
        this.side_4.setPos(28.0F, 4.0F, -9.0F);
        this.side_4.addBox(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_4, 0.0F, 3.141592653589793F, 0.0F);
        this.seil_1_1 = new ModelRenderer(this, 0, 0);
        this.seil_1_1.setPos(6.5F, -2.5F, -9.8F);
        this.seil_1_1.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(seil_1_1, 1.288053041235037F, 0.0F, 0.0F);
        this.seil_1_2 = new ModelRenderer(this, 0, 0);
        this.seil_1_2.setPos(0.0F, 0.0F, 14.0F);
        this.seil_1_2.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.steer = new ModelRenderer(this, 20, 10);
        this.steer.setPos(-15.0F, 3.0F, 8.0F);
        this.steer.addBox(-3.0F, 0.0F, -0.5F, 3.0F, 10.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_1 = new ModelRenderer(this, 96, 0);
        this.Sail_1_2_1.setPos(0.0F, 4.7F, 0.0F);
        this.Sail_1_2_1.addBox(0.0F, 0.0F, 10.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_1.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_1.addBox(0.0F, 0.0F, 20.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_1.addBox(0.0F, 0.0F, 30.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_1.addBox(0.0F, 0.0F, 40.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_1.addBox(0.0F, 0.0F, 50.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_1.addBox(0.0F, 0.0F, 60.0F, 1.0F, 5.0F, 3.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Sail_1_2_1, 0.0F, 0.0F, 0.2617993877991494F);
        this.side_9 = new ModelRenderer(this, 0, 27);
        this.side_9.setPos(-15.0F, 4.0F, 16.0F);
        this.side_9.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_9, 0.0F, 1.5707963267948966F, 0.0F);
        this.botom_3 = new ModelRenderer(this, 0, 0);
        this.botom_3.setPos(0.0F, 3.0F, 17.0F);
        this.botom_3.addBox(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(botom_3, 1.5707963267948966F, 0.0F, 0.0F);
        this.Cargo_3_1 = new ModelRenderer(this, 30, 55);
        this.Cargo_3_1.setPos(-8.1F, 3.0F, -0.4F);
        this.Cargo_3_1.addBox(0.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.seil_3_3 = new ModelRenderer(this, -1, 0);
        this.seil_3_3.setPos(0.0F, 0.0F, 14.0F);
        this.seil_3_3.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.Cargo2 = new ModelRenderer(this, 96, 38);
        this.Cargo2.setPos(3.8F, -5.0F, -6.9F);
        this.Cargo2.addBox(0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.seil_3_4 = new ModelRenderer(this, 0, 0);
        this.seil_3_4.setPos(0.0F, 0.0F, 14.0F);
        this.seil_3_4.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.Cargo_2_2 = new ModelRenderer(this, 30, 55);
        this.Cargo_2_2.setPos(2.0F, 3.0F, 8.5F);
        this.Cargo_2_2.addBox(0.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.seil_2_1 = new ModelRenderer(this, 0, 0);
        this.seil_2_1.setPos(46.5F, -6.5F, 7.5F);
        this.seil_2_1.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(seil_2_1, 1.5707963267948966F, 0.0F, -0.6544984694978736F);
        this.seil_4_4_1 = new ModelRenderer(this, 12, 2);
        this.seil_4_4_1.setPos(0.0F, 0.0F, 14.0F);
        this.seil_4_4_1.texOffs(100, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.seil_2_2 = new ModelRenderer(this, 0, 0);
        this.seil_2_2.setPos(0.0F, 0.0F, 14.0F);
        this.seil_2_2.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.seil_4_3 = new ModelRenderer(this, 0, 0);
        this.seil_4_3.setPos(0.0F, 0.0F, 14.0F);
        this.seil_4_3.texOffs(97, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.Cargo_1_2 = new ModelRenderer(this, 64, 29);
        this.Cargo_1_2.mirror = true;
        this.Cargo_1_2.setPos(0.5F, -5.0F, 7.0F);
        this.Cargo_1_2.addBox(0.0F, 0.0F, -2.0F, 6.0F, 5.0F, 8.0F, 0.0F, 0.0F, -0.0F);
        this.side_10_1 = new ModelRenderer(this, 0, 27);
        this.side_10_1.setPos(3.0F, -17.0F, -6.0F);
        this.side_10_1.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_10_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.side_11_1 = new ModelRenderer(this, 0, 27);
        this.side_11_1.setPos(3.0F, -17.0F, 10.0F);
        this.side_11_1.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_11_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.botom_1_1 = new ModelRenderer(this, 0, 0);
        this.botom_1_1.setPos(0.0F, 3.0F, 1.0F);
        this.botom_1_1.addBox(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(botom_1_1, 1.5707963267948966F, 0.0F, 0.0F);
        this.side_3 = new ModelRenderer(this, 0, 43);
        this.side_3.setPos(0.0F, 4.0F, 24.0F);
        this.side_3.addBox(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_4 = new ModelRenderer(this, 96, 0);
        this.Sail_1_2_4.setPos(0.0F, 4.7F, 0.0F);
        this.Sail_1_2_4.addBox(0.0F, 0.0F, 10.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_4.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_4.addBox(0.0F, 0.0F, 20.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_4.addBox(0.0F, 0.0F, 30.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_4.addBox(0.0F, 0.0F, 40.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_4.addBox(0.0F, 0.0F, 50.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_4.addBox(0.0F, 0.0F, 60.0F, 1.0F, 5.0F, 3.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Sail_1_2_4, 0.0F, 0.0F, 0.2617993877991494F);
        this.Sail_1 = new ModelRenderer(this, 96, 0);
        this.Sail_1.setPos(9.0F, -52.0F, -23.9F);
        this.Sail_1.addBox(0.0F, 0.0F, 10.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1.addBox(0.0F, 0.0F, 20.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1.addBox(0.0F, 0.0F, 30.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1.addBox(0.0F, 0.0F, 40.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1.addBox(0.0F, 0.0F, 50.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1.addBox(0.0F, 0.0F, 60.0F, 1.0F, 5.0F, 3.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Sail_1, 0.0F, 0.0F, -0.9075712110370513F);
        this.seil_1_3 = new ModelRenderer(this, 0, 0);
        this.seil_1_3.setPos(0.0F, 0.0F, 14.0F);
        this.seil_1_3.texOffs(100, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_5 = new ModelRenderer(this, 96, 0);
        this.Sail_1_2_5.setPos(0.0F, 4.7F, 0.0F);
        this.Sail_1_2_5.addBox(0.0F, 0.0F, 10.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_5.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_5.addBox(0.0F, 0.0F, 20.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_5.addBox(0.0F, 0.0F, 30.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_5.addBox(0.0F, 0.0F, 40.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_5.addBox(0.0F, 0.0F, 50.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_5.addBox(0.0F, 0.0F, 60.0F, 1.0F, 5.0F, 3.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Sail_1_2_5, 0.0F, 0.0F, 0.2617993877991494F);
        this.seil_2_5 = new ModelRenderer(this, 6, 0);
        this.seil_2_5.setPos(0.0F, 0.0F, 13.0F);
        this.seil_2_5.texOffs(97, 0).addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.mast_1 = new ModelRenderer(this, 11, 0);
        this.mast_1.setPos(6.0F, -30.0F, 6.0F);
        this.mast_1.addBox(0.0F, 0.0F, 0.0F, 3.0F, 18.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.seil_4_2 = new ModelRenderer(this, 0, 0);
        this.seil_4_2.setPos(0.0F, 0.0F, 14.0F);
        this.seil_4_2.texOffs(97, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.side_12_1 = new ModelRenderer(this, 0, 27);
        this.side_12_1.setPos(3.0F, -17.0F, -22.0F);
        this.side_12_1.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_12_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.botom_2 = new ModelRenderer(this, 0, 0);
        this.botom_2.setPos(28.0F, 3.0F, 1.0F);
        this.botom_2.addBox(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(botom_2, 1.5707963267948966F, 0.0F, 0.0F);
        this.side_2 = new ModelRenderer(this, 0, 35);
        this.side_2.setPos(0.0F, 4.0F, -9.0F);
        this.side_2.addBox(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_2, 0.0F, 3.141592653589793F, 0.0F);
        this.seil_2_4 = new ModelRenderer(this, -4, 0);
        this.seil_2_4.setPos(0.0F, 0.0F, 13.0F);
        this.seil_2_4.texOffs(97, 0).addBox(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.side_10 = new ModelRenderer(this, 0, 27);
        this.side_10.setPos(-17.0F, 4.0F, 8.0F);
        this.side_10.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_10, 0.0F, 1.5707963267948966F, 0.0F);
        this.mast_4 = new ModelRenderer(this, 11, 0);
        this.mast_4.setPos(0.0F, 36.0F, 0.0F);
        this.mast_4.addBox(0.0F, 0.0F, 0.0F, 3.0F, 18.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.seil_1_4_2 = new ModelRenderer(this, 0, 0);
        this.seil_1_4_2.setPos(0.0F, 0.0F, 14.0F);
        this.seil_1_4_2.texOffs(106, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.seil_4_1 = new ModelRenderer(this, 0, 0);
        this.seil_4_1.setPos(1.0F, -26.5F, 1.5F);
        this.seil_4_1.texOffs(97, 0).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(seil_4_1, 1.5707963267948966F, 0.0F, -2.747148136112631F);
        this.seil_4_4 = new ModelRenderer(this, 0, 0);
        this.seil_4_4.setPos(0.0F, 0.0F, 13.0F);
        this.seil_4_4.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.seil_1_5 = new ModelRenderer(this, 0, 0);
        this.seil_1_5.setPos(0.0F, 0.0F, 0.0F);
        this.seil_1_5.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.side_14 = new ModelRenderer(this, 0, 27);
        this.side_14.setPos(3.0F, 17.0F, -22.0F);
        this.side_14.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_14, 0.0F, 1.5707963267948966F, 0.0F);
        this.botom_1 = new ModelRenderer(this, 10, -8);
        this.botom_1.setPos(-8.0F, 15.0F, 14.0F);
        this.botom_1.addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(botom_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.side_13 = new ModelRenderer(this, 0, 27);
        this.side_13.setPos(3.0F, -17.0F, 26.0F);
        this.side_13.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_13, 0.0F, 1.5707963267948966F, 0.0F);
        this.seil_1_6 = new ModelRenderer(this, 0, 0);
        this.seil_1_6.setPos(0.0F, 0.0F, 6.0F);
        this.seil_1_6.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.side_8 = new ModelRenderer(this, 0, 27);
        this.side_8.setPos(-15.0F, 4.0F, 0.0F);
        this.side_8.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_8, 0.0F, 1.5707963267948966F, 0.0F);
        this.seil_3_1 = new ModelRenderer(this, 0, 0);
        this.seil_3_1.setPos(6.5F, -2.5F, 24.0F);
        this.seil_3_1.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(seil_3_1, 1.8413223608540177F, 0.0F, 0.0F);
        this.Sail_1_2_6 = new ModelRenderer(this, 96, 0);
        this.Sail_1_2_6.setPos(0.0F, 4.7F, 0.0F);
        this.Sail_1_2_6.addBox(0.0F, 0.0F, 10.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_6.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_6.addBox(0.0F, 0.0F, 20.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_6.addBox(0.0F, 0.0F, 30.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_6.addBox(0.0F, 0.0F, 40.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_6.addBox(0.0F, 0.0F, 50.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_6.addBox(0.0F, 0.0F, 60.0F, 1.0F, 5.0F, 3.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Sail_1_2_6, 0.0F, 0.0F, 0.2617993877991494F);
        this.side_6 = new ModelRenderer(this, 0, 27);
        this.side_6.setPos(43.0F, 4.0F, 16.0F);
        this.side_6.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_6, 0.0F, 1.5707963267948966F, 0.0F);
        this.Sail_1_2 = new ModelRenderer(this, 96, 0);
        this.Sail_1_2.setPos(0.0F, 4.7F, 0.0F);
        this.Sail_1_2.addBox(0.0F, 0.0F, 10.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2.addBox(0.0F, 0.0F, 20.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2.addBox(0.0F, 0.0F, 30.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2.addBox(0.0F, 0.0F, 40.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2.addBox(0.0F, 0.0F, 50.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2.addBox(0.0F, 0.0F, 60.0F, 1.0F, 5.0F, 3.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Sail_1_2, 0.0F, 0.0F, 0.2617993877991494F);
        this.Cargo_1_1 = new ModelRenderer(this, 30, 55);
        this.Cargo_1_1.setPos(2.0F, -5.0F, 1.0F);
        this.Cargo_1_1.addBox(0.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.botom_6 = new ModelRenderer(this, 0, 0);
        this.botom_6.setPos(26.0F, 6.0F, 9.0F);
        this.botom_6.addBox(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F, 4.0F, 0.0F);
        this.setRotateAngle(botom_6, 1.5707963267948966F, 0.0F, 0.0F);
        this.side_1 = new ModelRenderer(this, 0, 27);
        this.side_1.setPos(45.0F, 4.0F, 8.0F);
        this.side_1.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.Cargo_0_1 = new ModelRenderer(this, 30, 55);
        this.Cargo_0_1.setPos(12.3F, 3.0F, 1.0F);
        this.Cargo_0_1.addBox(0.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.Cargo_3_2 = new ModelRenderer(this, 30, 55);
        this.Cargo_3_2.setPos(-4.0F, 3.0F, 2.6F);
        this.Cargo_3_2.addBox(0.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.side_15 = new ModelRenderer(this, 0, 27);
        this.side_15.setPos(3.0F, 17.0F, -6.0F);
        this.side_15.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_15, 0.0F, 1.5707963267948966F, 0.0F);
        this.seil_3_2 = new ModelRenderer(this, 0, 0);
        this.seil_3_2.setPos(0.0F, 0.0F, 14.0F);
        this.seil_3_2.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.botom_4 = new ModelRenderer(this, 0, 0);
        this.botom_4.setPos(28.0F, 3.0F, 17.0F);
        this.botom_4.addBox(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(botom_4, 1.5707963267948966F, 0.0F, 0.0F);
        this.side_11 = new ModelRenderer(this, 0, 27);
        this.side_11.setPos(47.0F, 0.0F, 8.0F);
        this.side_11.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_11, 0.0F, 1.5707963267948966F, 0.0F);
        this.botom_5 = new ModelRenderer(this, 0, 0);
        this.botom_5.setPos(1.0F, 6.0F, 9.0F);
        this.botom_5.addBox(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F, 4.0F, 0.0F);
        this.setRotateAngle(botom_5, 1.5707963267948966F, 0.0F, 0.0F);
        this.mast_2 = new ModelRenderer(this, 10, 0);
        this.mast_2.setPos(0.0F, -18.0F, 0.0F);
        this.mast_2.addBox(0.0F, 0.0F, 0.0F, 3.0F, 18.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.Cargo_0_2 = new ModelRenderer(this, 30, 55);
        this.Cargo_0_2.setPos(8.0F, 3.0F, 0.0F);
        this.Cargo_0_2.addBox(0.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_3 = new ModelRenderer(this, 96, 0);
        this.Sail_1_2_3.setPos(0.0F, 4.7F, 0.0F);
        this.Sail_1_2_3.addBox(0.0F, 0.0F, 10.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_3.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_3.addBox(0.0F, 0.0F, 20.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_3.addBox(0.0F, 0.0F, 30.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_3.addBox(0.0F, 0.0F, 40.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_3.addBox(0.0F, 0.0F, 50.0F, 1.0F, 5.0F, 10.0F, 0.0F, 0.0F, 0.0F);
        this.Sail_1_2_3.addBox(0.0F, 0.0F, 60.0F, 1.0F, 5.0F, 3.7F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Sail_1_2_3, 0.0F, 0.0F, 0.2617993877991494F);
        this.side_17 = new ModelRenderer(this, 0, 27);
        this.side_17.setPos(3.0F, 17.0F, 26.0F);
        this.side_17.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_17, 0.0F, 1.5707963267948966F, 0.0F);
        this.mast_3 = new ModelRenderer(this, 10, 0);
        this.mast_3.setPos(0.0F, -18.0F, 0.0F);
        this.mast_3.addBox(0.0F, 0.0F, 0.0F, 3.0F, 18.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.side_16 = new ModelRenderer(this, 0, 27);
        this.side_16.setPos(3.0F, 17.0F, 10.0F);
        this.side_16.addBox(-8.0F, -7.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(side_16, 0.0F, 1.5707963267948966F, 0.0F);
        this.seil_2_3 = new ModelRenderer(this, 0, 0);
        this.seil_2_3.setPos(0.0F, 0.0F, 14.0F);
        this.seil_2_3.texOffs(97, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, 0.0F, 0.0F);
        this.botom_1.addChild(this.Cargo3);
        this.botom_1.addChild(this.Cargo0);
        this.botom_1.addChild(this.side_7);
        this.seil_1_4.addChild(this.seil_1_4_1);
        this.seil_3_4.addChild(this.seil_3_5);
        this.botom_1.addChild(this.Cargo1);
        this.Cargo2.addChild(this.Cargo_2_1);
        this.botom_1.addChild(this.side_12);
        this.botom_1.addChild(this.Sail_0);
        this.Sail_1_2_1.addChild(this.Sail_1_2_2);
        this.seil_1_3.addChild(this.seil_1_4);
        this.botom_1.addChild(this.side_5);
        this.botom_1.addChild(this.side_4);
        this.botom_1.addChild(this.seil_1_1);
        this.seil_1_1.addChild(this.seil_1_2);
        this.botom_1.addChild(this.steer);
        this.Sail_1_2.addChild(this.Sail_1_2_1);
        this.botom_1.addChild(this.side_9);
        this.botom_1.addChild(this.botom_3);
        this.Cargo3.addChild(this.Cargo_3_1);
        this.seil_3_2.addChild(this.seil_3_3);
        this.botom_1.addChild(this.Cargo2);
        this.seil_3_3.addChild(this.seil_3_4);
        this.Cargo2.addChild(this.Cargo_2_2);
        this.botom_1.addChild(this.seil_2_1);
        this.seil_4_4.addChild(this.seil_4_4_1);
        this.seil_2_1.addChild(this.seil_2_2);
        this.seil_4_2.addChild(this.seil_4_3);
        this.Cargo1.addChild(this.Cargo_1_2);
        this.mast_1.addChild(this.side_10_1);
        this.mast_1.addChild(this.side_11_1);
        this.botom_1.addChild(this.botom_1_1);
        this.botom_1.addChild(this.side_3);
        this.Sail_1_2_3.addChild(this.Sail_1_2_4);
        this.botom_1.addChild(this.Sail_1);
        this.seil_1_2.addChild(this.seil_1_3);
        this.Sail_1_2_4.addChild(this.Sail_1_2_5);
        this.seil_2_4.addChild(this.seil_2_5);
        this.botom_1.addChild(this.mast_1);
        this.seil_4_1.addChild(this.seil_4_2);
        this.mast_1.addChild(this.side_12_1);
        this.botom_1.addChild(this.botom_2);
        this.botom_1.addChild(this.side_2);
        this.seil_2_3.addChild(this.seil_2_4);
        this.botom_1.addChild(this.side_10);
        this.mast_2.addChild(this.mast_4);
        this.seil_1_4_1.addChild(this.seil_1_4_2);
        this.mast_1.addChild(this.seil_4_1);
        this.seil_4_3.addChild(this.seil_4_4);
        this.seil_1_4_2.addChild(this.seil_1_5);
        this.mast_1.addChild(this.side_14);
        this.mast_1.addChild(this.side_13);
        this.seil_1_4_2.addChild(this.seil_1_6);
        this.botom_1.addChild(this.side_8);
        this.botom_1.addChild(this.seil_3_1);
        this.Sail_1_2_5.addChild(this.Sail_1_2_6);
        this.botom_1.addChild(this.side_6);
        this.Sail_1.addChild(this.Sail_1_2);
        this.Cargo1.addChild(this.Cargo_1_1);
        this.botom_1.addChild(this.botom_6);
        this.botom_1.addChild(this.side_1);
        this.Cargo0.addChild(this.Cargo_0_1);
        this.Cargo3.addChild(this.Cargo_3_2);
        this.mast_1.addChild(this.side_15);
        this.seil_3_1.addChild(this.seil_3_2);
        this.botom_1.addChild(this.botom_4);
        this.botom_1.addChild(this.side_11);
        this.botom_1.addChild(this.botom_5);
        this.mast_1.addChild(this.mast_2);
        this.Cargo0.addChild(this.Cargo_0_2);
        this.Sail_1_2_2.addChild(this.Sail_1_2_3);
        this.mast_1.addChild(this.side_17);
        this.mast_2.addChild(this.mast_3);
        this.mast_1.addChild(this.side_16);
        this.seil_2_2.addChild(this.seil_2_3);
    }


    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.botom_1).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        if (entityIn.getSailState()) {
            this.Sail_0.visible = false;
            this.Sail_1.visible = true;
        } else {
            this.Sail_0.visible = true;
            this.Sail_1.visible = false;
        }

        this.Cargo0.visible = (entityIn).Cargo_0;
        this.Cargo1.visible = (entityIn).Cargo_1;
        this.Cargo2.visible = (entityIn).Cargo_2;
        this.Cargo3.visible = (entityIn).Cargo_3;

        if (entityIn.getSteerState(0)){
            this.steer.yRot = MathHelper.cos(3.1415927F);
            //this.Brigg.rotateAngleZ = -MathHelper.cos(3.1415927F * 2 );
        }
        else if (entityIn.getSteerState(1)) {
            this.steer.yRot = -MathHelper.cos(3.1415927F);
            //this.Brigg.rotateAngleZ = MathHelper.cos(3.1415927F * 2 );
        }
        else {
            this.steer.yRot = 0;
            //this.Brigg.rotateAngleZ = 0;
        }


    }
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;


    }
}
