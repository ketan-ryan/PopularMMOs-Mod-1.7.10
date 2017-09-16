package com.popularmmos.entities.jenboss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import thehippomaster.AnimationAPI.IAnimatedEntity;
import thehippomaster.AnimationAPI.client.Animator;

/**
 * ModelBiped - TheMinecraftOverlord
 * Created using Tabula 4.1.1
 */
public class ModelJenBoss extends ModelBase {

    private Animator animator;

    public ModelRenderer BladeA;
    public ModelRenderer CrossGuardB;
    public ModelRenderer BladeB;
    public ModelRenderer BladeDesign1;
    public ModelRenderer BladeDesign2;
    public ModelRenderer BladeDesign3;
    public ModelRenderer BladeDesign4;
    public ModelRenderer BladeDesign5;
    public ModelRenderer BladeDesign6;
    public ModelRenderer BladeDesign7;
    public ModelRenderer BladeDesign8;
    public ModelRenderer BladeDesign9;
    public ModelRenderer BladeDesign10;
    public ModelRenderer BladeDesign11;
    public ModelRenderer BladeDesign12;
    public ModelRenderer BladeDesign13;
    public ModelRenderer BladeDesign14;
    public ModelRenderer BladeDesign15;
    public ModelRenderer BladeDesign16;
    public ModelRenderer BladeDesign17;
    public ModelRenderer BladeDesign18;
    public ModelRenderer BladeDesign19;
    public ModelRenderer BladeDesign20;
    public ModelRenderer BladeDesign21;
    public ModelRenderer CrossGuardA;
    public ModelRenderer CrossGuardC;
    public ModelRenderer CrossGuardD;
    public ModelRenderer HiltB;
    public ModelRenderer HiltC;
    public ModelRenderer HiltA;
    public ModelRenderer HiltJewelA;
    public ModelRenderer HiltJewelB;
    public ModelRenderer HiltJewelD;
    public ModelRenderer HiltJewelF;
    public ModelRenderer HiltJewelC;
    public ModelRenderer HiltJewelE;
    public ModelRenderer BladeC;
    public ModelRenderer BladeD;
    public ModelRenderer BladeE;
    public ModelRenderer BladeF;
    public ModelRenderer BladeG;
    public ModelRenderer BladeH;
    public ModelRenderer BladeI;
    public ModelRenderer BladeJ;
    public ModelRenderer Head;
    public ModelRenderer LArmA;
    public ModelRenderer RLegA;
    public ModelRenderer Chest;
    public ModelRenderer RArmA;
    public ModelRenderer LLegA;
    public ModelRenderer Circlet;
    public ModelRenderer CircletGem;
    public ModelRenderer LArmB;
    public ModelRenderer LShoulderpiece;
    public ModelRenderer GauntletBody;
    public ModelRenderer ThumbA;
    public ModelRenderer IndexFingA;
    public ModelRenderer MidFingA;
    public ModelRenderer RingFingA;
    public ModelRenderer PinkieA;
    public ModelRenderer MainGem;
    public ModelRenderer ThumbB;
    public ModelRenderer IndexFingB;
    public ModelRenderer IndexFingC;
    public ModelRenderer MidFingB;
    public ModelRenderer MidFingC;
    public ModelRenderer RingFingB;
    public ModelRenderer RingFingC;
    public ModelRenderer PinkieB;
    public ModelRenderer PinkieC;
    public ModelRenderer RLegB;
    public ModelRenderer RTopLeg;
    public ModelRenderer RBoot;
    public ModelRenderer RBottomLeg;
    public ModelRenderer Scabbard;
    public ModelRenderer Chestplate;
    public ModelRenderer RArmB;
    public ModelRenderer RShoulderpiece;
    public ModelRenderer LLegB;
    public ModelRenderer LTopLeg;
    public ModelRenderer LBoot;
    public ModelRenderer LBottomLeg;

    public ModelJenBoss()
    {
        this.textureWidth = 508;
        this.textureHeight = 508;
        this.IndexFingA = new ModelRenderer(this, 213, 192);
        this.IndexFingA.setRotationPoint(14.0F, 14.0F, -3.0F);
        this.IndexFingA.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.RTopLeg = new ModelRenderer(this, 70, 125);
        this.RTopLeg.setRotationPoint(-3.0F, 3.0F, 14.0F);
        this.RTopLeg.addBox(0.0F, -3.0F, -13.0F, 18, 25, 14, 0.0F);
        this.LLegB = new ModelRenderer(this, 0, 105);
        this.LLegB.setRotationPoint(0.0F, 24.0F, 0.1F);
        this.LLegB.addBox(-2.0F, 0.0F, -2.0F, 16, 24, 12, 0.0F);
        this.setRotateAngle(LLegB, 0.0F, 0.0F, -0.02897246558310587F);
        this.ThumbB = new ModelRenderer(this, 213, 200);
        this.ThumbB.setRotationPoint(0.0F, 3.8F, 0.0F);
        this.ThumbB.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(ThumbB, 0.2235766771804736F, 0.0F, 0.05305800926062762F);
        this.Chestplate = new ModelRenderer(this, 155, 103);
        this.Chestplate.setRotationPoint(-4.0F, -1.0F, 10.0F);
        this.Chestplate.addBox(-1.0F, 0.0F, -13.0F, 34, 49, 14, 0.0F);
        this.Circlet = new ModelRenderer(this, 1, 216);
        this.Circlet.setRotationPoint(-5.0F, 0.0F, -5.0F);
        this.Circlet.addBox(0.0F, -1.0F, 0.0F, 34, 3, 34, 0.0F);
        this.MidFingC = new ModelRenderer(this, 213, 183);
        this.MidFingC.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.MidFingC.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(MidFingC, 0.2649409804527392F, 0.0F, 0.0F);
        this.GauntletBody = new ModelRenderer(this, 189, 225);
        this.GauntletBody.setRotationPoint(-4.0F, 4.0F, 0.0F);
        this.GauntletBody.addBox(0.0F, 0.0F, -3.0F, 18, 14, 14, 0.0F);
        this.LTopLeg = new ModelRenderer(this, 70, 125);
        this.LTopLeg.setRotationPoint(-3.0F, 3.0F, 10.0F);
        this.LTopLeg.addBox(0.0F, -3.0F, -13.0F, 18, 25, 14, 0.0F);
        this.Scabbard = new ModelRenderer(this, 2, 180);
        this.Scabbard.setRotationPoint(-6.0F, 32.5F, 11.0F);
        this.Scabbard.addBox(0.0F, -4.0F, 0.0F, 13, 50, 2, 0.0F);
        this.setRotateAngle(Scabbard, 0.0F, 0.0F, -2.0018926520374962F);
        this.RBoot = new ModelRenderer(this, 45, 183);
        this.RBoot.setRotationPoint(-3.0F, 21.0F, 13.0F);
        this.RBoot.addBox(0.0F, -13.0F, -13.0F, 19, 16, 16, 0.0F);
        this.RingFingA = new ModelRenderer(this, 213, 175);
        this.RingFingA.setRotationPoint(5.4F, 14.0F, -3.0F);
        this.RingFingA.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.IndexFingC = new ModelRenderer(this, 213, 192);
        this.IndexFingC.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.IndexFingC.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(IndexFingC, 0.2649409804527392F, 0.0F, 0.0F);
        this.LArmB = new ModelRenderer(this, 198, 0);
        this.LArmB.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.LArmB.addBox(-3.0F, -2.0F, -2.0F, 16, 18, 12, 0.0F);
        this.LBoot = new ModelRenderer(this, 45, 183);
        this.LBoot.setRotationPoint(-4.0F, 21.0F, 9.0F);
        this.LBoot.addBox(0.0F, -13.0F, -13.0F, 19, 16, 16, 0.0F);
        this.ThumbA = new ModelRenderer(this, 213, 200);
        this.ThumbA.setRotationPoint(14.0F, 14.0F, 8.0F);
        this.ThumbA.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(ThumbA, 0.2235766771804736F, 0.0F, 0.05305800926062762F);
        this.RingFingB = new ModelRenderer(this, 213, 175);
        this.RingFingB.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.RingFingB.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(RingFingB, 0.2649409804527392F, 0.0F, 0.0F);
        this.LArmA = new ModelRenderer(this, 160, 70);
        this.LArmA.setRotationPoint(-24.0F, -59.0F, 0.0F);
        this.LArmA.addBox(-3.0F, -2.0F, -2.0F, 16, 18, 12, 0.0F);
        this.setRotateAngle(LArmA, 0.0F, 0.0F, 0.10000736613927509F);
        this.RLegB = new ModelRenderer(this, 0, 105);
        this.RLegB.mirror = true;
        this.RLegB.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.RLegB.addBox(-2.0F, 0.0F, 2.0F, 16, 24, 12, 0.0F);
        this.setRotateAngle(RLegB, -0.0F, 0.0F, 0.02897246558310587F);
        this.Chest = new ModelRenderer(this, 64, 64);
        this.Chest.setRotationPoint(-7.0F, -60.0F, 0.0F);
        this.Chest.addBox(-4.0F, 0.0F, -2.0F, 32, 48, 12, 0.0F);
        this.LBottomLeg = new ModelRenderer(this, 104, 173);
        this.LBottomLeg.setRotationPoint(-3.0F, 3.0F, 10.0F);
        this.LBottomLeg.addBox(0.0F, -3.0F, -13.0F, 18, 8, 14, 0.0F);
        this.RingFingC = new ModelRenderer(this, 213, 175);
        this.RingFingC.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.RingFingC.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(RingFingC, 0.2649409804527392F, 0.0F, 0.0F);
        this.RBottomLeg = new ModelRenderer(this, 104, 173);
        this.RBottomLeg.setRotationPoint(-3.0F, 3.0F, 14.0F);
        this.RBottomLeg.addBox(0.0F, -3.0F, -13.0F, 18, 8, 14, 0.0F);
        this.MainGem = new ModelRenderer(this, 206, 208);
        this.MainGem.setRotationPoint(11.0F, 2.0F, 2.0F);
        this.MainGem.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7, 0.0F);
        this.setRotateAngle(MainGem, -0.7853981633974483F, 0.7853981633974483F, 0.7853981633974483F);
        this.PinkieA = new ModelRenderer(this, 215, 168);
        this.PinkieA.setRotationPoint(1.0F, 14.0F, -3.0F);
        this.PinkieA.addBox(1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(PinkieA, 0.0017453292519943296F, 0.0F, -0.008377580409572781F);
        this.MidFingB = new ModelRenderer(this, 213, 183);
        this.MidFingB.setRotationPoint(0.0F, 4.0F, 0.1F);
        this.MidFingB.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(MidFingB, 0.2649409804527392F, 0.0F, 0.0F);
        this.CircletGem = new ModelRenderer(this, 8, 234);
        this.CircletGem.setRotationPoint(15.0F, 1.0F, -1.0F);
        this.CircletGem.addBox(0.0F, -3.0F, 0.0F, 4, 5, 1, 0.0F);
        this.RArmB = new ModelRenderer(this, 198, 0);
        this.RArmB.mirror = true;
        this.RArmB.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.RArmB.addBox(-1.0F, -2.0F, -2.0F, 16, 18, 12, 0.0F);
        this.IndexFingB = new ModelRenderer(this, 213, 192);
        this.IndexFingB.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.IndexFingB.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(IndexFingB, 0.2649409804527392F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 61, 0);
        this.Head.setRotationPoint(-7.0F, -85.0F, -8.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 32, 32, 32, 0.5F);
        this.MidFingA = new ModelRenderer(this, 213, 183);
        this.MidFingA.setRotationPoint(9.7F, 14.0F, -3.0F);
        this.MidFingA.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.RShoulderpiece = new ModelRenderer(this, 0, 145);
        this.RShoulderpiece.setRotationPoint(-2.0F, 9.0F, 10.0F);
        this.RShoulderpiece.addBox(0.0F, -13.0F, -13.0F, 18, 14, 14, 0.0F);
        this.RArmA = new ModelRenderer(this, 160, 70);
        this.RArmA.mirror = true;
        this.RArmA.setRotationPoint(22.0F, -57.0F, 0.0F);
        this.RArmA.addBox(-1.0F, -2.0F, -2.0F, 16, 18, 12, 0.0F);
        this.setRotateAngle(RArmA, 0.0F, 0.0F, -0.10000736613927509F);
        this.LShoulderpiece = new ModelRenderer(this, 0, 145);
        this.LShoulderpiece.setRotationPoint(-4.0F, 9.0F, 10.0F);
        this.LShoulderpiece.addBox(0.0F, -13.0F, -13.0F, 18, 14, 14, 0.0F);
        this.PinkieC = new ModelRenderer(this, 215, 168);
        this.PinkieC.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.PinkieC.addBox(1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(PinkieC, 0.2649409804527392F, 0.0F, 0.0F);
        this.PinkieB = new ModelRenderer(this, 215, 168);
        this.PinkieB.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.PinkieB.addBox(1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(PinkieB, 0.2649409804527392F, 0.0F, 0.0F);
        this.RLegA = new ModelRenderer(this, 0, 64);
        this.RLegA.mirror = true;
        this.RLegA.setRotationPoint(6.9F, -12.0F, -3.9F);
        this.RLegA.addBox(-2.0F, 0.0F, 2.0F, 16, 24, 12, 0.0F);
        this.setRotateAngle(RLegA, -0.0F, 0.0F, -0.02897246558310587F);
        this.LLegA = new ModelRenderer(this, 0, 67);
        this.LLegA.setRotationPoint(-8.9F, -12.0F, 0.1F);
        this.LLegA.addBox(-2.0F, 0.0F, -2.0F, 16, 24, 12, 0.0F);
        this.setRotateAngle(LLegA, 0.0F, 0.0F, 0.02897246558310587F);
        this.GauntletBody.addChild(this.IndexFingA);
        this.RLegA.addChild(this.RTopLeg);
        this.LLegA.addChild(this.LLegB);
        this.ThumbA.addChild(this.ThumbB);
        this.Chest.addChild(this.Chestplate);
        this.Head.addChild(this.Circlet);
        this.MidFingB.addChild(this.MidFingC);
        this.LArmB.addChild(this.GauntletBody);
        this.LLegA.addChild(this.LTopLeg);
        this.Chest.addChild(this.Scabbard);
        this.RLegB.addChild(this.RBoot);
        this.GauntletBody.addChild(this.RingFingA);
        this.IndexFingB.addChild(this.IndexFingC);
        this.LArmA.addChild(this.LArmB);
        this.LLegB.addChild(this.LBoot);
        this.GauntletBody.addChild(this.ThumbA);
        this.RingFingA.addChild(this.RingFingB);
        this.RLegA.addChild(this.RLegB);
        this.LLegB.addChild(this.LBottomLeg);
        this.RingFingB.addChild(this.RingFingC);
        this.RLegB.addChild(this.RBottomLeg);
        this.GauntletBody.addChild(this.MainGem);
        this.GauntletBody.addChild(this.PinkieA);
        this.MidFingA.addChild(this.MidFingB);
        this.Circlet.addChild(this.CircletGem);
        this.RArmA.addChild(this.RArmB);
        this.IndexFingA.addChild(this.IndexFingB);
        this.GauntletBody.addChild(this.MidFingA);
        this.RArmA.addChild(this.RShoulderpiece);
        this.LArmA.addChild(this.LShoulderpiece);
        this.PinkieB.addChild(this.PinkieC);
        this.PinkieA.addChild(this.PinkieB);
        this.BladeDesign3 = new ModelRenderer(this, 0, 0);
        this.BladeDesign3.setRotationPoint(-3.5F, -4.0F, -0.5F);
        this.BladeDesign3.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign3, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeD = new ModelRenderer(this, 47, 20);
        this.BladeD.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.BladeD.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.BladeDesign9 = new ModelRenderer(this, 0, 0);
        this.BladeDesign9.setRotationPoint(-3.5F, -16.0F, -0.5F);
        this.BladeDesign9.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign9, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign20 = new ModelRenderer(this, 0, 0);
        this.BladeDesign20.setRotationPoint(-3.5F, -38.0F, -0.5F);
        this.BladeDesign20.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign20, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign17 = new ModelRenderer(this, 0, 0);
        this.BladeDesign17.setRotationPoint(-3.5F, -32.0F, -0.5F);
        this.BladeDesign17.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign17, 0.0F, 0.0F, -0.7853981633974483F);
        this.HiltJewelC = new ModelRenderer(this, 1, 43);
        this.HiltJewelC.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.HiltJewelC.addBox(0.0F, -4.0F, 0.0F, 1, 11, 1, 0.0F);
        this.BladeC = new ModelRenderer(this, 45, 23);
        this.BladeC.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.BladeC.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.BladeH = new ModelRenderer(this, 55, 8);
        this.BladeH.setRotationPoint(3.0F, -6.0F, 0.0F);
        this.BladeH.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.BladeG = new ModelRenderer(this, 53, 11);
        this.BladeG.setRotationPoint(2.5F, -5.0F, 0.0F);
        this.BladeG.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.BladeJ = new ModelRenderer(this, 59, 2);
        this.BladeJ.setRotationPoint(4.0F, -8.0F, 0.0F);
        this.BladeJ.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.BladeDesign19 = new ModelRenderer(this, 0, 0);
        this.BladeDesign19.setRotationPoint(-3.5F, -36.0F, -0.5F);
        this.BladeDesign19.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign19, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign5 = new ModelRenderer(this, 0, 0);
        this.BladeDesign5.setRotationPoint(-3.5F, -8.0F, -0.5F);
        this.BladeDesign5.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign5, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign14 = new ModelRenderer(this, 0, 0);
        this.BladeDesign14.setRotationPoint(-3.5F, -26.0F, -0.5F);
        this.BladeDesign14.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign14, 0.0F, 0.0F, -0.7853981633974483F);
        this.CrossGuardD = new ModelRenderer(this, 21, 3);
        this.CrossGuardD.setRotationPoint(22.5F, -0.7F, -3.5F);
        this.CrossGuardD.addBox(-5.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(CrossGuardD, 0.0F, 0.0F, -0.3162536604613725F);
        this.HiltJewelD = new ModelRenderer(this, 6, 47);
        this.HiltJewelD.setRotationPoint(-1.0F, 0.0F, -0.5F);
        this.HiltJewelD.addBox(0.0F, 0.0F, 0.0F, 3, 7, 1, 0.0F);
        this.setRotateAngle(HiltJewelD, 0.0F, 0.0F, -1.5707963267948966F);
        this.CrossGuardC = new ModelRenderer(this, 21, 3);
        this.CrossGuardC.setRotationPoint(2.0F, 1.0F, -3.5F);
        this.CrossGuardC.addBox(-5.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(CrossGuardC, 0.0F, 0.0F, 0.3162536604613725F);
        this.BladeDesign16 = new ModelRenderer(this, 0, 0);
        this.BladeDesign16.setRotationPoint(-3.5F, -30.0F, -0.5F);
        this.BladeDesign16.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign16, 0.0F, 0.0F, -0.7853981633974483F);
        this.HiltA = new ModelRenderer(this, 1, 27);
        this.HiltA.setRotationPoint(3.0F, 14.0F, -1.5F);
        this.HiltA.addBox(0.0F, -3.0F, -2.0F, 6, 4, 3, 0.0F);
        this.BladeDesign4 = new ModelRenderer(this, 0, 0);
        this.BladeDesign4.setRotationPoint(-3.5F, -6.0F, -0.5F);
        this.BladeDesign4.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign4, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeE = new ModelRenderer(this, 49, 17);
        this.BladeE.setRotationPoint(1.5F, -3.0F, 0.0F);
        this.BladeE.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.BladeDesign12 = new ModelRenderer(this, 0, 0);
        this.BladeDesign12.setRotationPoint(-3.5F, -22.0F, -0.5F);
        this.BladeDesign12.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign12, 0.0F, 0.0F, -0.7853981633974483F);
        this.HiltB = new ModelRenderer(this, 3, 17);
        this.HiltB.setRotationPoint(3.5F, 10.0F, -1.0F);
        this.HiltB.addBox(0.0F, -6.0F, -2.0F, 5, 7, 2, 0.0F);
        this.HiltC = new ModelRenderer(this, 1, 27);
        this.HiltC.setRotationPoint(3.0F, 3.0F, -1.5F);
        this.HiltC.addBox(0.0F, -1.0F, -2.0F, 6, 2, 3, 0.0F);
        this.BladeDesign18 = new ModelRenderer(this, 0, 0);
        this.BladeDesign18.setRotationPoint(-3.5F, -34.0F, -0.5F);
        this.BladeDesign18.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign18, 0.0F, 0.0F, -0.7853981633974483F);
        this.HiltJewelA = new ModelRenderer(this, 1, 35);
        this.HiltJewelA.setRotationPoint(0.5F, 5.0F, -0.5F);
        this.HiltJewelA.addBox(0.0F, -4.0F, -1.0F, 5, 5, 2, 0.0F);
        this.BladeDesign7 = new ModelRenderer(this, 0, 0);
        this.BladeDesign7.setRotationPoint(-3.5F, -12.0F, -0.5F);
        this.BladeDesign7.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign7, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign1 = new ModelRenderer(this, 0, 0);
        this.BladeDesign1.setRotationPoint(-3.5F, 0.0F, -0.5F);
        this.BladeDesign1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign1, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign11 = new ModelRenderer(this, 0, 0);
        this.BladeDesign11.setRotationPoint(-3.5F, -20.0F, -0.5F);
        this.BladeDesign11.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign11, 0.0F, 0.0F, -0.7853981633974483F);
        this.HiltJewelE = new ModelRenderer(this, 1, 43);
        this.HiltJewelE.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.HiltJewelE.addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
        this.BladeDesign15 = new ModelRenderer(this, 0, 0);
        this.BladeDesign15.setRotationPoint(-3.5F, -28.0F, -0.5F);
        this.BladeDesign15.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign15, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign21 = new ModelRenderer(this, 0, 0);
        this.BladeDesign21.setRotationPoint(-3.5F, -40.0F, -0.5F);
        this.BladeDesign21.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign21, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign10 = new ModelRenderer(this, 0, 0);
        this.BladeDesign10.setRotationPoint(-3.5F, -18.0F, -0.5F);
        this.BladeDesign10.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign10, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign2 = new ModelRenderer(this, 0, 0);
        this.BladeDesign2.setRotationPoint(-3.5F, -2.0F, -0.5F);
        this.BladeDesign2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign2, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeDesign13 = new ModelRenderer(this, 0, 0);
        this.BladeDesign13.setRotationPoint(-3.5F, -24.0F, -0.5F);
        this.BladeDesign13.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign13, 0.0F, 0.0F, -0.7853981633974483F);
        this.HiltJewelB = new ModelRenderer(this, 6, 47);
        this.HiltJewelB.setRotationPoint(1.0F, -5.0F, -0.5F);
        this.HiltJewelB.addBox(0.0F, 0.0F, 0.0F, 3, 7, 1, 0.0F);
        this.BladeF = new ModelRenderer(this, 51, 14);
        this.BladeF.setRotationPoint(2.0F, -4.0F, 0.0F);
        this.BladeF.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        this.BladeDesign8 = new ModelRenderer(this, 0, 0);
        this.BladeDesign8.setRotationPoint(-3.5F, -14.0F, -0.5F);
        this.BladeDesign8.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign8, 0.0F, 0.0F, -0.7853981633974483F);
        this.CrossGuardB = new ModelRenderer(this, 16, 59);
        this.CrossGuardB.setRotationPoint(-8.0F, 1.0F, 3.5F);
        this.CrossGuardB.addBox(0.0F, 0.0F, -4.0F, 19, 2, 2, 0.0F);
        this.BladeDesign6 = new ModelRenderer(this, 0, 0);
        this.BladeDesign6.setRotationPoint(-3.5F, -10.0F, -0.5F);
        this.BladeDesign6.addBox(0.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(BladeDesign6, 0.0F, 0.0F, -0.7853981633974483F);
        this.BladeB = new ModelRenderer(this, 43, 26);
        this.BladeB.setRotationPoint(-3.5F, -42.0F, 0.0F);
        this.BladeB.addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        this.BladeA = new ModelRenderer(this, 20, 6);
        this.BladeA.setRotationPoint(-1.0F, -6.0F, 0.0F);
        this.BladeA.addBox(-4.0F, -41.0F, 0.0F, 10, 42, 1, 0.0F);
        this.CrossGuardA = new ModelRenderer(this, 17, 51);
        this.CrossGuardA.setRotationPoint(3.0F, 0.6F, -1.0F);
        this.CrossGuardA.addBox(0.0F, -1.0F, -4.0F, 12, 3, 4, 0.0F);
        this.HiltJewelF = new ModelRenderer(this, 1, 56);
        this.HiltJewelF.setRotationPoint(0.5F, 0.5F, -0.5F);
        this.HiltJewelF.addBox(0.0F, -4.0F, -1.0F, 4, 4, 3, 0.0F);
        this.BladeI = new ModelRenderer(this, 57, 5);
        this.BladeI.setRotationPoint(3.5F, -7.0F, 0.0F);
        this.BladeI.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.BladeA.addChild(this.BladeDesign3);
        this.BladeB.addChild(this.BladeD);
        this.BladeA.addChild(this.BladeDesign9);
        this.BladeA.addChild(this.BladeDesign20);
        this.BladeA.addChild(this.BladeDesign17);
        this.HiltJewelB.addChild(this.HiltJewelC);
        this.BladeB.addChild(this.BladeC);
        this.BladeB.addChild(this.BladeH);
        this.BladeB.addChild(this.BladeG);
        this.BladeB.addChild(this.BladeJ);
        this.BladeA.addChild(this.BladeDesign19);
        this.BladeA.addChild(this.BladeDesign5);
        this.BladeA.addChild(this.BladeDesign14);
        this.CrossGuardB.addChild(this.CrossGuardD);
        this.HiltJewelA.addChild(this.HiltJewelD);
        this.CrossGuardB.addChild(this.CrossGuardC);
        this.BladeA.addChild(this.BladeDesign16);
        this.CrossGuardA.addChild(this.HiltA);
        this.BladeA.addChild(this.BladeDesign4);
        this.BladeB.addChild(this.BladeE);
        this.BladeA.addChild(this.BladeDesign12);
        this.CrossGuardA.addChild(this.HiltB);
        this.CrossGuardA.addChild(this.HiltC);
        this.BladeA.addChild(this.BladeDesign18);
        this.HiltA.addChild(this.HiltJewelA);
        this.BladeA.addChild(this.BladeDesign7);
        this.BladeA.addChild(this.BladeDesign1);
        this.BladeA.addChild(this.BladeDesign11);
        this.HiltJewelD.addChild(this.HiltJewelE);
        this.BladeA.addChild(this.BladeDesign15);
        this.BladeA.addChild(this.BladeDesign21);
        this.BladeA.addChild(this.BladeDesign10);
        this.BladeA.addChild(this.BladeDesign2);
        this.BladeA.addChild(this.BladeDesign13);
        this.HiltJewelA.addChild(this.HiltJewelB);
        this.BladeB.addChild(this.BladeF);
        this.BladeA.addChild(this.BladeDesign8);
        this.BladeA.addChild(this.CrossGuardB);
        this.BladeA.addChild(this.BladeDesign6);
        this.BladeA.addChild(this.BladeB);
        this.CrossGuardB.addChild(this.CrossGuardA);
        this.HiltJewelA.addChild(this.HiltJewelF);
        this.BladeB.addChild(this.BladeI);
        this.GauntletBody.addChild(this.BladeA);
        this.Chest.addChild(LLegA);
        this.Chest.addChild(RLegA);
        animator = new Animator(this);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.LArmA.render(f5);
        this.Chest.render(f5);
        this.Head.render(f5);
        this.RArmA.render(f5);

    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        animator.update(entity);
        setAngles();

        this.Head.rotateAngleY = f5 / (180F / (float)Math.PI);
        this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);

        this.LLegA.rotateAngleX = MathHelper.cos(f * 0.66662F) * .4F * f1;
        this.LLegB.rotateAngleX = MathHelper.cos(f * 0.66662F + (float) Math.PI) * .4F * f1;

        this.RLegA.rotateAngleX = MathHelper.cos(f * 0.5F + (float) Math.PI) * .5F * f1;
        this.RLegB.rotateAngleX = MathHelper.cos(f * 0.0F) * .5F * f1;

       // Sword Slice: One forehand slice, one backhand slice, one double-fisted downwards slam, return sword to scabbard.
        animator.setAnim(1);
        animator.startPhase(15);
            animator.rotate(LArmA, -1.2F, 0F, 0F);
        animator.endPhase();
        animator.startPhase(10);
            animator.rotate(LLegA, -1F, 0F, 0F);
            animator.rotate(LLegB, .5F, 0F, 0F);
            animator.rotate(Chest, .4F, 0F, 0F);
            animator.rotate(LArmA, 0F, 0F, -.3F);
            animator.rotate(LArmB, 0F, 0F, -.7F);
            animator.rotate(BladeA, 0F, 0F, 1F);
        animator.endPhase();
        animator.startPhase(10);
            animator.rotate(RLegA, -1F, 0F, 0F);
            animator.rotate(RLegB, .5F, 0F, 0F);
            animator.rotate(Chest, .4F, 0F, 0F);
            animator.rotate(LArmA, 0F, 0F, .15F);
            animator.rotate(LArmB, 0F, 0F, .35F);
            animator.rotate(BladeA, 0F, 0F, -.5F);
        animator.endPhase();
        animator.startPhase(15);
            animator.rotate(LArmA, -2.4F, 0F, .7F);
            animator.rotate(RArmA, -2.4F, 0F, -.7F);
            animator.rotate(BladeA, .5F, 0F, 0F);
        animator.endPhase();
        animator.startPhase(20);
            animator.rotate(LArmA, 0F, 0F, -.7F);
            animator.rotate(RArmA, 0F, 0F, .7F);
            animator.rotate(BladeA, .6F, 0F, 2F);
            animator.rotate(Chest, .5F, 0, 0);
            animator.rotate(LLegA, -.5F, 0F, 0F);
            animator.rotate(RLegA, -.5F, 0F, 0F);
        animator.endPhase();
        animator.resetPhase(1);

        //Beam (simple arm lift)
        animator.setAnim(2);
        animator.startPhase(20);
            animator.rotate(LArmA, -1F, 0F, 0F);
            animator.rotate(BladeA, 1F, 0F, 0F);
        animator.endPhase();
        animator.resetPhase(1);
    }

    private void setAngles()
    {

        this.LLegA.rotationPointY = 48;
        this.LLegA.rotationPointX = -1F;
        this.RLegA.rotationPointY = 48;
        this.RLegA.rotationPointX = 13F;

        this.LArmB.rotateAngleY = 1.5F;
        this.LArmB.rotationPointZ = 8F;

        this.Scabbard.rotationPointY = .5F;
        this.Scabbard.rotationPointX = -10F;
        this.Scabbard.rotateAngleZ = -.7F;

        this.IndexFingB.rotateAngleX = .6F;
        this.IndexFingC.rotateAngleX = .6F;
        this.MidFingB.rotateAngleX = .6F;
        this.MidFingC.rotateAngleX = .6F;
        this.RingFingB.rotateAngleX = .6F;
        this.RingFingC.rotateAngleX = .6F;
        this.ThumbB.rotateAngleX = -.7F;
        this.PinkieB.rotateAngleX = .6F;
        this.PinkieC.rotateAngleX = .6F;

        this.RArmA.rotateAngleZ = -.1F;
        this.LArmA.rotateAngleZ = .1F;

        this.BladeA.rotateAngleX = 0F;
        this.BladeA.rotateAngleZ = 1.5F;
        this.BladeA.rotationPointX = 20F;
        this.BladeA.rotationPointY = 17F;
        this.BladeA.rotationPointZ = 3F;

        this.BladeDesign1.rotationPointX = 2F;
        this.BladeDesign1.rotateAngleZ = 1F;
        this.BladeDesign2.rotationPointX = 2F;
        this.BladeDesign2.rotateAngleZ = 1F;
        this.BladeDesign3.rotationPointX = 2F;
        this.BladeDesign3.rotateAngleZ = 1F;
        this.BladeDesign4.rotationPointX = 2F;
        this.BladeDesign4.rotateAngleZ = 1F;
        this.BladeDesign5.rotationPointX = 2F;
        this.BladeDesign5.rotateAngleZ = 1F;
        this.BladeDesign6.rotationPointX = 2F;
        this.BladeDesign6.rotateAngleZ = 1F;
        this.BladeDesign7.rotationPointX = 2F;
        this.BladeDesign7.rotateAngleZ = 1F;
        this.BladeDesign8.rotationPointX = 2F;
        this.BladeDesign8.rotateAngleZ = 1F;
        this.BladeDesign9.rotationPointX = 2F;
        this.BladeDesign9.rotateAngleZ = 1F;
        this.BladeDesign10.rotationPointX = 2F;
        this.BladeDesign10.rotateAngleZ = 1F;
        this.BladeDesign11.rotationPointX = 2F;
        this.BladeDesign11.rotateAngleZ = 1F;
        this.BladeDesign12.rotationPointX = 2F;
        this.BladeDesign12.rotateAngleZ = 1F;
        this.BladeDesign13.rotationPointX = 2F;
        this.BladeDesign13.rotateAngleZ = 1F;
        this.BladeDesign14.rotationPointX = 2F;
        this.BladeDesign14.rotateAngleZ = 1F;
        this.BladeDesign15.rotationPointX = 2F;
        this.BladeDesign15.rotateAngleZ = 1F;
        this.BladeDesign16.rotationPointX = 2F;
        this.BladeDesign16.rotateAngleZ = 1F;
        this.BladeDesign17.rotationPointX = 2F;
        this.BladeDesign17.rotateAngleZ = 1F;
        this.BladeDesign18.rotationPointX = 2F;
        this.BladeDesign18.rotateAngleZ = 1F;
        this.BladeDesign19.rotationPointX = 2F;
        this.BladeDesign19.rotateAngleZ = 1F;
        this.BladeDesign20.rotationPointX = 2F;
        this.BladeDesign20.rotateAngleZ = 1F;
        this.BladeDesign21.rotationPointX = 2F;
        this.BladeDesign21.rotateAngleZ = 1F;

        this.BladeDesign1.rotationPointY = -4F;
        this.BladeDesign2.rotationPointY = -6F;
        this.BladeDesign3.rotationPointY = -8F;
        this.BladeDesign4.rotationPointY = -10F;
        this.BladeDesign5.rotationPointY = -12F;
        this.BladeDesign6.rotationPointY = -14F;
        this.BladeDesign7.rotationPointY = -16F;
        this.BladeDesign8.rotationPointY = -18F;
        this.BladeDesign9.rotationPointY = -20F;
        this.BladeDesign10.rotationPointY = -22F;
        this.BladeDesign11.rotationPointY = -24F;
        this.BladeDesign12.rotationPointY = -26F;
        this.BladeDesign13.rotationPointY = -28F;
        this.BladeDesign14.rotationPointY = -30F;
        this.BladeDesign15.rotationPointY = -32F;
        this.BladeDesign16.rotationPointY = -34F;
        this.BladeDesign17.rotationPointY = -36F;
        this.BladeDesign18.rotationPointY = -38F;
        this.BladeDesign19.rotationPointY = -40F;
        this.BladeDesign20.rotationPointY = -42F;
        this.BladeDesign21.rotationPointY = -44F;

        this.HiltJewelD.rotateAngleZ = 1.6F;
        this.HiltJewelD.rotationPointY = -2.7F;
        this.HiltJewelD.rotationPointX = 6F;

        this.CrossGuardD.rotationPointY = .5F;
        this.CrossGuardC.rotationPointY = .5F;

        this.CrossGuardC.rotateAngleZ = .15F;
        this.CrossGuardD.rotateAngleZ = -.15F;
    }

}
