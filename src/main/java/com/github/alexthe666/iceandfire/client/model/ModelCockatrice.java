package com.github.alexthe666.iceandfire.client.model;

import com.github.alexthe666.iceandfire.entity.EntityCockatrice;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelCockatrice extends ModelDragonBase {

    public AdvancedModelRenderer lowerBody;
    public AdvancedModelRenderer leftThigh;
    public AdvancedModelRenderer rightThigh;
    public AdvancedModelRenderer upperBody;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer leftUpperArm;
    public AdvancedModelRenderer RightUpperArm;
    public AdvancedModelRenderer neck2;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer upperJaw;
    public AdvancedModelRenderer lowerJaw;
    public AdvancedModelRenderer Comb1;
    public AdvancedModelRenderer Comb2;
    public AdvancedModelRenderer Wattle;
    public AdvancedModelRenderer upperJaw_1;
    public AdvancedModelRenderer leftLowerArm;
    public AdvancedModelRenderer leftUpperArmWing;
    public AdvancedModelRenderer leftLowerArmWing;
    public AdvancedModelRenderer RightLowerArm;
    public AdvancedModelRenderer RightUpperArmWing;
    public AdvancedModelRenderer RightLowerArmWing;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer rightToeClaw2;
    public AdvancedModelRenderer tail4;
    public AdvancedModelRenderer TailPlume;
    public AdvancedModelRenderer TailPlume_1;
    public AdvancedModelRenderer leftLeg;
    public AdvancedModelRenderer leftFoot;
    public AdvancedModelRenderer rightLeg;
    public AdvancedModelRenderer rightFoot;
    private ModelAnimator animator;
    private static final ModelCockatriceChick CHICK_MODEL = new ModelCockatriceChick();

    public ModelCockatrice() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.lowerBody = new AdvancedModelRenderer(this, 65, 32);
        this.lowerBody.setRotationPoint(0.0F, 7.9F, -2.5F);
        this.lowerBody.addBox(-4.0F, -1.0F, 0.0F, 8, 8, 9, 0.0F);
        this.setRotateAngle(lowerBody, -0.15550883635269477F, 0.0F, 0.0F);
        this.Wattle = new AdvancedModelRenderer(this, 47, 9);
        this.Wattle.mirror = true;
        this.Wattle.setRotationPoint(-0.0F, -2.1F, -2.03F);
        this.Wattle.addBox(-0.5F, -1.5F, 0.6F, 1, 4, 5, 0.0F);
        this.setRotateAngle(Wattle, -1.593485607070823F, -0.0F, 0.0F);
        this.TailPlume = new AdvancedModelRenderer(this, 37, 31);
        this.TailPlume.setRotationPoint(0.0F, 0.9F, 7.3F);
        this.TailPlume.addBox(-0.5F, -9.1F, -0.2F, 1, 7, 5, 0.0F);
        this.setRotateAngle(TailPlume, -0.7740535232594852F, -0.0F, 0.0F);
        this.upperBody = new AdvancedModelRenderer(this, 67, 5);
        this.upperBody.setRotationPoint(0.0F, 1.1F, -2.0F);
        this.upperBody.addBox(-3.0F, -2.0F, -5.0F, 6, 7, 8, 0.0F);
        this.setRotateAngle(upperBody, 0.091106186954104F, -0.0F, 0.0F);
        this.leftLowerArmWing = new AdvancedModelRenderer(this, 20, 9);
        this.leftLowerArmWing.setRotationPoint(0.4F, 0.8F, 2.4F);
        this.leftLowerArmWing.addBox(-0.5F, 0.0F, -8.0F, 1, 12, 8, 0.0F);
        this.setRotateAngle(leftLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F);
        this.upperJaw = new AdvancedModelRenderer(this, 28, 0);
        this.upperJaw.setRotationPoint(0.0F, -1.0F, -4.93F);
        this.upperJaw.addBox(-1.5F, -2.4F, -4.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(upperJaw, -0.0017453292519943296F, -0.0F, 0.0F);
        this.rightFoot = new AdvancedModelRenderer(this, 0, 36);
        this.rightFoot.setRotationPoint(0.0F, 0.9F, -5.7F);
        this.rightFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rightFoot, -1.3089969389957472F, -0.0F, 0.0F);
        this.leftUpperArm = new AdvancedModelRenderer(this, 0, 20);
        this.leftUpperArm.mirror = true;
        this.leftUpperArm.setRotationPoint(2.5F, 1.3F, -3.3F);
        this.leftUpperArm.addBox(0.0F, -1.0F, -1.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(leftUpperArm, 0.0F, 0.22689280275926282F, -0.8726646259971648F);
        this.leftThigh = new AdvancedModelRenderer(this, 14, 35);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(3.0F, 14.0F, 3.0F);
        this.leftThigh.addBox(0.0F, -2.5F, -2.0F, 3, 6, 5, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 29, 51);
        this.neck.setRotationPoint(0.0F, 0.8F, -3.5F);
        this.neck.addBox(-2.0F, -2.0F, -6.5F, 4, 5, 7, 0.0F);
        this.setRotateAngle(neck, -0.4553564018453205F, -0.0F, 0.0F);
        this.neck2 = new AdvancedModelRenderer(this, 0, 47);
        this.neck2.setRotationPoint(0.0F, 0.3F, -5.6F);
        this.neck2.addBox(-2.02F, -2.0F, -8.0F, 4, 4, 8, 0.0F);
        this.setRotateAngle(neck2, -0.31869712141416456F, -0.0F, 0.0F);
        this.RightUpperArm = new AdvancedModelRenderer(this, 0, 20);
        this.RightUpperArm.mirror = true;
        this.RightUpperArm.setRotationPoint(-2.5F, 1.3F, -3.3F);
        this.RightUpperArm.addBox(-2.0F, -1.0F, -1.0F, 2, 5, 3, 0.0F);
        this.setRotateAngle(RightUpperArm, 0.0F, -0.22689280275926282F, 0.8726646259971648F);
        this.rightThigh = new AdvancedModelRenderer(this, 14, 35);
        this.rightThigh.setRotationPoint(-3.0F, 14.0F, 3.0F);
        this.rightThigh.addBox(-3.0F, -2.5F, -2.0F, 3, 6, 5, 0.0F);
        this.Comb1 = new AdvancedModelRenderer(this, 38, 15);
        this.Comb1.mirror = true;
        this.Comb1.setRotationPoint(-0.0F, -2.5F, -2.03F);
        this.Comb1.addBox(-0.5F, -1.5F, 0.6F, 1, 4, 5, 0.0F);
        this.setRotateAngle(Comb1, 1.2292353921796064F, -0.0F, 0.0F);
        this.rightToeClaw2 = new AdvancedModelRenderer(this, 0, 40);
        this.rightToeClaw2.setRotationPoint(0.0F, 0.2F, -2.5F);
        this.rightToeClaw2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rightToeClaw2, -1.7627825445142729F, -0.0F, 0.0F);
        this.RightLowerArm = new AdvancedModelRenderer(this, 0, 12);
        this.RightLowerArm.setRotationPoint(-0.9F, 3.0F, 0.0F);
        this.RightLowerArm.addBox(-1.0F, 0.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(RightLowerArm, 0.704240353179712F, -0.0F, 0.0F);
        this.RightUpperArmWing = new AdvancedModelRenderer(this, 22, 10);
        this.RightUpperArmWing.mirror = true;
        this.RightUpperArmWing.setRotationPoint(-1.0F, 2.7F, 1.1F);
        this.RightUpperArmWing.addBox(-0.5F, 0.0F, -3.5F, 1, 4, 7, 0.0F);
        this.setRotateAngle(RightUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.8F, -6.03F);
        this.head.addBox(-2.5F, -4.0F, -5.0F, 5, 5, 6, 0.0F);
        this.setRotateAngle(head, 1.1383037381507017F, 0.0F, 0.0F);
        this.rightLeg = new AdvancedModelRenderer(this, 2, 25);
        this.rightLeg.setRotationPoint(-1.2F, 2.9F, 1.1F);
        this.rightLeg.addBox(-1.0F, 0.4F, -6.7F, 2, 2, 8, 0.0F);
        this.setRotateAngle(rightLeg, 1.3089969389957472F, -0.0F, 0.0F);
        this.RightLowerArmWing = new AdvancedModelRenderer(this, 20, 9);
        this.RightLowerArmWing.mirror = true;
        this.RightLowerArmWing.setRotationPoint(0.4F, 0.8F, 2.4F);
        this.RightLowerArmWing.addBox(-0.5F, 0.0F, -8.0F, 1, 12, 8, 0.0F);
        this.setRotateAngle(RightLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F);
        this.tail3 = new AdvancedModelRenderer(this, 49, 16);
        this.tail3.setRotationPoint(0.0F, 0.3F, 7.2F);
        this.tail3.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 12, 0.0F);
        this.setRotateAngle(tail3, -0.05253441048502932F, -0.0F, 0.0F);
        this.tail4 = new AdvancedModelRenderer(this, 47, 40);
        this.tail4.setRotationPoint(0.0F, 0.6F, 10.0F);
        this.tail4.addBox(-1.02F, -0.2F, 0.1F, 2, 2, 12, 0.0F);
        this.setRotateAngle(tail4, -0.05253441048502932F, -0.0F, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 90, 13);
        this.tail2.setRotationPoint(0.0F, 0.2F, 6.7F);
        this.tail2.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 8, 0.0F);
        this.leftLowerArm = new AdvancedModelRenderer(this, 0, 12);
        this.leftLowerArm.mirror = true;
        this.leftLowerArm.setRotationPoint(0.9F, 3.0F, 0.0F);
        this.leftLowerArm.addBox(-1.0F, 0.0F, -6.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(leftLowerArm, 0.704240353179712F, -0.0F, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 91, 0);
        this.tail1.setRotationPoint(0.0F, -1.0F, 8.5F);
        this.tail1.addBox(-2.0F, 0.0F, 0.0F, 4, 5, 7, 0.0F);
        this.setRotateAngle(tail1, 0.11903145498601327F, -0.0F, 0.0F);
        this.TailPlume_1 = new AdvancedModelRenderer(this, 35, 29);
        this.TailPlume_1.setRotationPoint(0.0F, 1.2F, 3.5F);
        this.TailPlume_1.addBox(-0.5F, -11.5F, -0.4F, 1, 10, 6, 0.0F);
        this.setRotateAngle(TailPlume_1, -0.5009094953223726F, -0.0F, 0.0F);
        this.Comb2 = new AdvancedModelRenderer(this, 38, 15);
        this.Comb2.setRotationPoint(-0.0F, -0.7F, -1.03F);
        this.Comb2.addBox(-0.52F, -1.5F, 0.6F, 1, 4, 5, 0.0F);
        this.setRotateAngle(Comb2, 1.1383037381507017F, 0.0F, 0.0F);
        this.leftUpperArmWing = new AdvancedModelRenderer(this, 22, 10);
        this.leftUpperArmWing.setRotationPoint(1.4F, 2.7F, 1.1F);
        this.leftUpperArmWing.addBox(-0.5F, 0.0F, -3.5F, 1, 4, 7, 0.0F);
        this.setRotateAngle(leftUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F);
        this.leftFoot = new AdvancedModelRenderer(this, 0, 36);
        this.leftFoot.setRotationPoint(0.0F, 0.9F, -5.7F);
        this.leftFoot.addBox(-1.5F, 0.0F, -3.1F, 3, 2, 4, 0.0F);
        this.setRotateAngle(leftFoot, -1.3089969389957472F, -0.0F, 0.0F);
        this.lowerJaw = new AdvancedModelRenderer(this, 49, 0);
        this.lowerJaw.setRotationPoint(0.0F, 0.1F, -4.53F);
        this.lowerJaw.setScale(0.99F, 0.99F, 0.99F);
        this.lowerJaw.addBox(-1.5F, -0.5F, -4.3F, 3, 1, 4, 0.0F);
        this.setRotateAngle(lowerJaw, -0.091106186954104F, 0.0F, 0.0F);
        this.leftLeg = new AdvancedModelRenderer(this, 2, 25);
        this.leftLeg.mirror = true;
        this.leftLeg.setRotationPoint(1.2F, 2.9F, 1.1F);
        this.leftLeg.addBox(-1.0F, 0.4F, -6.7F, 2, 2, 8, 0.0F);
        this.setRotateAngle(leftLeg, 1.3089969389957472F, -0.0F, 0.0F);
        this.upperJaw_1 = new AdvancedModelRenderer(this, 20, 0);
        this.upperJaw_1.setRotationPoint(-0.0F, -1.0F, -3.83F);
        this.upperJaw_1.addBox(-0.5F, -0.5F, -2.9F, 1, 1, 3, 0.0F);
        this.setRotateAngle(upperJaw_1, 1.3658946726107624F, -0.0F, 0.0F);
        this.head.addChild(this.Wattle);
        this.tail4.addChild(this.TailPlume);
        this.lowerBody.addChild(this.upperBody);
        this.leftLowerArm.addChild(this.leftLowerArmWing);
        this.head.addChild(this.upperJaw);
        this.rightLeg.addChild(this.rightFoot);
        this.upperBody.addChild(this.leftUpperArm);
        this.upperBody.addChild(this.neck);
        this.neck.addChild(this.neck2);
        this.upperBody.addChild(this.RightUpperArm);
        this.head.addChild(this.Comb1);
        this.tail2.addChild(this.rightToeClaw2);
        this.RightUpperArm.addChild(this.RightLowerArm);
        this.RightUpperArm.addChild(this.RightUpperArmWing);
        this.neck2.addChild(this.head);
        this.rightThigh.addChild(this.rightLeg);
        this.RightLowerArm.addChild(this.RightLowerArmWing);
        this.tail2.addChild(this.tail3);
        this.tail3.addChild(this.tail4);
        this.tail1.addChild(this.tail2);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.lowerBody.addChild(this.tail1);
        this.tail4.addChild(this.TailPlume_1);
        this.head.addChild(this.Comb2);
        this.leftUpperArm.addChild(this.leftUpperArmWing);
        this.leftLeg.addChild(this.leftFoot);
        this.head.addChild(this.lowerJaw);
        this.leftThigh.addChild(this.leftLeg);
        this.upperJaw.addChild(this.upperJaw_1);
        animator = ModelAnimator.create();
        this.updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        if(this.isChild){
            CHICK_MODEL.render(entity, f, f1, f2, f3, f4, f5);
        }else{
            animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
            this.lowerBody.render(f5);
            this.leftThigh.render(f5);
            this.rightThigh.render(f5);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (EntityCockatrice) entity);
        animator.update(entity);
        animator.setAnimation(EntityCockatrice.ANIMATION_EAT);
        animator.startKeyframe(5);
        this.rotate(animator, neck2, 7, 0, 0);
        this.rotate(animator, head, 45, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        this.rotate(animator, upperBody, 15, 0, 0);
        this.rotate(animator, neck, 31, 0, 0);
        this.rotate(animator, neck2, 7, 0, 0);
        this.rotate(animator, head, 45, 0, 0);
        this.rotate(animator, lowerJaw, 15, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        this.rotate(animator, upperBody, 5, 0, 0);
        this.rotate(animator, neck, -10, 0, 0);
        this.rotate(animator, neck2, 1, 0, 0);
        this.rotate(animator, head, 45, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityCockatrice.ANIMATION_JUMPAT);
        animator.startKeyframe(10);
        this.rotate(animator, lowerBody, 18, 0, 0);
        this.rotate(animator, upperBody, 5, 0, 0);
        this.rotate(animator, neck, -23, 0, 0);
        this.rotate(animator, neck2, 18, 0, 0);
        this.rotate(animator, head, -27, 0, 0);
        this.rotate(animator, leftUpperArm, 0, 30, -50);
        this.rotate(animator, RightUpperArm, 0, -30, 50);
        animator.move(lowerBody, 0, 1.7F, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        jumpPos();
        animator.endKeyframe();
        animator.startKeyframe(2);
        jumpPos();
        this.rotate(animator, leftUpperArm, 0, 30, -75);
        this.rotate(animator, RightUpperArm, 0, -30, 75);
        animator.endKeyframe();
        animator.startKeyframe(2);
        jumpPos();
        this.rotate(animator, leftUpperArm, 0, 30, -19);
        this.rotate(animator, RightUpperArm, 0, -30, 19);
        animator.endKeyframe();
        animator.startKeyframe(2);
        jumpPos();
        this.rotate(animator, leftUpperArm, 0, 30, -75);
        this.rotate(animator, RightUpperArm, 0, -30, 75);
        animator.endKeyframe();
        animator.startKeyframe(2);
        jumpPos();
        this.rotate(animator, leftUpperArm, 0, 30, -19);
        this.rotate(animator, RightUpperArm, 0, -30, 19);
        animator.endKeyframe();
        animator.startKeyframe(2);
        jumpPos();
        this.rotate(animator, leftUpperArm, 0, 30, -75);
        this.rotate(animator, RightUpperArm, 0, -30, 75);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityCockatrice.ANIMATION_WATTLESHAKE);
        animator.startKeyframe(3);
        this.rotate(animator, neck, 0, 0, -23);
        this.rotate(animator, neck2, 0, 0, -13);
        this.rotate(animator, head, 5, 0, -15);
        this.rotate(animator, Comb1, 0, 0, -23);
        this.rotate(animator, Comb2, 0, 0, -27);
        this.rotate(animator, Wattle, 0, 0, -23);
        animator.endKeyframe();
        animator.startKeyframe(2);
        this.rotate(animator, neck, 0, 0, -23);
        this.rotate(animator, neck2, 0, 0, -13);
        this.rotate(animator, head, 5, 0, -15);
        this.rotate(animator, Comb1, 0, 0, -33);
        this.rotate(animator, Comb2, 0, 0, -37);
        this.rotate(animator, Wattle, 0, 0, -33);
        animator.endKeyframe();
        animator.startKeyframe(3);
        this.rotate(animator, neck, 0, 0, 23);
        this.rotate(animator, neck2, 0, 0, 13);
        this.rotate(animator, head, 5, 0, 15);
        this.rotate(animator, Comb1, 0, 0, 23);
        this.rotate(animator, Comb2, 0, 0, 27);
        this.rotate(animator, Wattle, 0, 0, 23);
        animator.endKeyframe();
        animator.startKeyframe(2);
        this.rotate(animator, neck, 0, 0, 23);
        this.rotate(animator, neck2, 0, 0, 13);
        this.rotate(animator, head, 5, 0, 15);
        this.rotate(animator, Comb1, 0, 0, 33);
        this.rotate(animator, Comb2, 0, 0, 37);
        this.rotate(animator, Wattle, 0, 0, 33);
        animator.endKeyframe();
        animator.startKeyframe(3);
        this.rotate(animator, neck, 0, 0, -23);
        this.rotate(animator, neck2, 0, 0, -13);
        this.rotate(animator, head, 5, 0, -15);
        this.rotate(animator, Comb1, 0, 0, -23);
        this.rotate(animator, Comb2, 0, 0, -27);
        this.rotate(animator, Wattle, 0, 0, -23);
        animator.endKeyframe();
        animator.startKeyframe(2);
        this.rotate(animator, neck, 0, 0, -23);
        this.rotate(animator, neck2, 0, 0, -13);
        this.rotate(animator, head, 5, 0, -15);
        this.rotate(animator, Comb1, 0, 0, -33);
        this.rotate(animator, Comb2, 0, 0, -37);
        this.rotate(animator, Wattle, 0, 0, -33);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityCockatrice.ANIMATION_BITE);
        animator.startKeyframe(5);
        this.rotate(animator, neck, -47, 0, 0);
        this.rotate(animator, neck2, 17, 0, 0);
        this.rotate(animator, head, 46, 0, 0);
        this.rotate(animator, lowerJaw, 10, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        this.rotate(animator, neck, 26, 0, 0);
        this.rotate(animator, neck2, -18, 0, 0);
        this.rotate(animator, head, 2, 0, 0);
        this.rotate(animator, lowerJaw, 33, 0, 0);
        this.rotate(animator, upperJaw, -20, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityCockatrice.ANIMATION_SPEAK);
        animator.startKeyframe(5);
        this.rotate(animator, lowerJaw, 25, 0, 0);
        animator.resetKeyframe(5);

    }

    private void jumpPos(){
        this.rotate(animator, lowerBody, -29, 0, 0);
        this.rotate(animator, upperBody, 10, 0, 0);
        this.rotate(animator, neck, 7, 0, 0);
        this.rotate(animator, neck2, 32, 0, 0);
        this.rotate(animator, head, 36, 0, 0);
        this.rotate(animator, lowerJaw, 28, 0, 0);
        this.rotate(animator, tail1, -18, 0, 0);
        animator.move(lowerBody, 0, -1.9F, 2.5F);
        this.rotate(animator, rightThigh, -74, 0, 10);
        this.rotate(animator, rightLeg, 0, 39, 0);
        this.rotate(animator, rightFoot, 50, -10, 0);
        this.rotate(animator, leftThigh, -74, 0, -10);
        this.rotate(animator, leftLeg, 0, -39, 0);
        this.rotate(animator, leftFoot, 50, 10, 0);
    }
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityCockatrice entity) {
        float speed_walk = 0.6F;
        float speed_idle = 0.05F;
        float degree_walk = 0.5F;
        float degree_idle = 0.5F;
        AdvancedModelRenderer[] NECK = new AdvancedModelRenderer[]{neck, neck2, head};
        AdvancedModelRenderer[] TAIL = new AdvancedModelRenderer[]{tail1, tail2, tail3, tail4};
        this.chainWave(NECK, speed_idle, degree_idle * 0.1F, 4, entity.ticksExisted, 1);
        this.chainSwing(TAIL, speed_idle, degree_idle * 0.5F, 0, entity.ticksExisted, 1);
        this.walk(lowerBody, speed_idle, degree_idle * 0.1F, false, 0, 0.1F, entity.ticksExisted, 1);
        this.walk(upperBody, speed_idle, degree_idle * 0.05F, true, 1, 0F, entity.ticksExisted, 1);

        this.walk(leftUpperArm, speed_idle, degree_idle * 0.2F, false, 1, 0.1F, entity.ticksExisted, 1);
        this.walk(RightUpperArm, speed_idle, degree_idle * 0.2F, false, 1, 0.1F, entity.ticksExisted, 1);
        this.walk(leftLowerArm, speed_idle, degree_idle * 0.2F, false, 1, 0.1F, entity.ticksExisted, 1);
        this.walk(RightLowerArm, speed_idle, degree_idle * 0.2F, false, 1, 0.1F, entity.ticksExisted, 1);

        this.flap(leftUpperArm, speed_idle, degree_idle * 0.2F, true, 2, -0.3F, entity.ticksExisted, 1);
        this.flap(RightUpperArm, speed_idle, degree_idle * 0.2F, false, 2, -0.3F, entity.ticksExisted, 1);
        this.faceTarget(f3, f4, 2, head);
        this.faceTarget(f3, f4, 2, neck);


        this.chainWave(NECK, speed_walk, degree_walk * 0.5F, 4, f, f1);
        this.walk(lowerBody, speed_walk, degree_walk * 0.1F, false, 0, 0F, f, f1);
        this.walk(upperBody, speed_walk, degree_walk * 0.05F, true, 1, 0F, f, f1);
        this.walk(leftThigh, speed_walk, degree_walk, true, 1, 0.1F, f, f1);
        this.walk(rightThigh, speed_walk, degree_walk, false, 1, 0.1F, f, f1);
        this.walk(leftLeg, speed_walk, degree_walk, true, 1, 0.1F, f, f1);
        this.walk(rightLeg, speed_walk, degree_walk, false, 1, 0.1F, f, f1);
        this.walk(leftFoot, speed_walk, degree_walk * -1.75F, true, 1, -0.1F, f, f1);
        this.walk(rightFoot, speed_walk, degree_walk * -1.75F, false, 1, -0.1F, f, f1);
        this.progressRotation(neck, entity.stareProgress, (float)Math.toRadians(10), 0.0F, 0.0F);
        this.progressRotation(neck2, entity.stareProgress, (float)Math.toRadians(-18), 0.0F, 0.0F);
        this.progressRotation(head, entity.stareProgress, (float)Math.toRadians(18), 0.0F, 0.0F);

        this.progressRotation(rightThigh, entity.sitProgress, (float)Math.toRadians(-15), 0.0F, 0.0F);
        this.progressRotation(leftThigh, entity.sitProgress, (float)Math.toRadians(-15), 0.0F, 0.0F);
        this.progressRotation(rightLeg, entity.sitProgress, (float)Math.toRadians(13), 0.0F, 0.0F);
        this.progressRotation(leftLeg, entity.sitProgress, (float)Math.toRadians(13), 0.0F, 0.0F);
        this.progressRotation(rightFoot, entity.sitProgress, 0.0F, 0.0F, 0.0F);
        this.progressRotation(leftFoot, entity.sitProgress, 0.0F, 0.0F, 0.0F);
        this.progressPosition(rightThigh, entity.sitProgress, -3.0F, 19F, 3.0F);
        this.progressPosition(leftThigh, entity.sitProgress, 3.0F, 19F, 3.0F);
        this.progressPosition(lowerBody, entity.sitProgress, 0.0F, 12.9F, -2.5F);
    }


    @Override
    public void renderStatue() {
        this.resetToDefaultPose();
        this.lowerBody.render(0.0625F);
        this.leftThigh.render(0.0625F);
        this.rightThigh.render(0.0625F);
    }
}
