package com.popularmmos.entities.pat;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import thehippomaster.AnimationAPI.IAnimatedEntity;
import thehippomaster.AnimationAPI.client.Animator;

/**
 * ModelPat - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelPat extends ModelBase {

    private Animator animator;

    public ModelRenderer TorsoC;
    public ModelRenderer TorsoDChest;
    public ModelRenderer BenchWeightBar;
    public ModelRenderer BenchWeightR4;
    public ModelRenderer WeightBar;
    public ModelRenderer TorsoB;
    public ModelRenderer TorsoA;
    public ModelRenderer LQuadB;
    public ModelRenderer RQuadB;
    public ModelRenderer LQuadA;
    public ModelRenderer LKnee;
    public ModelRenderer LThighD;
    public ModelRenderer LThighC;
    public ModelRenderer LThighB;
    public ModelRenderer LThighA;
    public ModelRenderer LFootMain;
    public ModelRenderer LFootRSide;
    public ModelRenderer LFootLSide;
    public ModelRenderer LFoot1stClawA;
    public ModelRenderer RQuadA;
    public ModelRenderer RKnee;
    public ModelRenderer RThighD;
    public ModelRenderer RThighC;
    public ModelRenderer RThighB;
    public ModelRenderer RThighA;
    public ModelRenderer RFootMain;
    public ModelRenderer LFootRSide_1;
    public ModelRenderer LFootLSide_1;
    public ModelRenderer RFoot1stClawA;
    public ModelRenderer NeckA;
    public ModelRenderer LShoulderA;
    public ModelRenderer RShoulderA;
    public ModelRenderer NeckB;
    public ModelRenderer NeckC;
    public ModelRenderer HeadCubeA;
    public ModelRenderer HeadCubeB;
    public ModelRenderer LShoulderB;
    public ModelRenderer LBicepA;
    public ModelRenderer LShoulderC;
    public ModelRenderer LShoulderD;
    public ModelRenderer LBicepB;
    public ModelRenderer LForearmA;
    public ModelRenderer LBicepC;
    public ModelRenderer LForearmB;
    public ModelRenderer WristBaseThangR;
    public ModelRenderer LForearmC;
    public ModelRenderer LThumbA;
    public ModelRenderer LPointFingA;
    public ModelRenderer LMidFingA;
    public ModelRenderer LRingFingA;
    public ModelRenderer LThumbB;
    public ModelRenderer LThumbC;
    public ModelRenderer LPointFingB;
    public ModelRenderer LPointFingC;
    public ModelRenderer LMidFingB;
    public ModelRenderer LMidFingC;
    public ModelRenderer LRingFingB;
    public ModelRenderer LRingFingC;
    public ModelRenderer RShoulderB;
    public ModelRenderer RBicepA;
    public ModelRenderer RShoulderC;
    public ModelRenderer RShoulderD;
    public ModelRenderer RBicepB;
    public ModelRenderer RForearmA;
    public ModelRenderer RBicepC;
    public ModelRenderer RForearmB;
    public ModelRenderer WristBaseThangR_1;
    public ModelRenderer RForearmC;
    public ModelRenderer RThumbA;
    public ModelRenderer RPointFingA;
    public ModelRenderer RMidFingA;
    public ModelRenderer RRingFingA;
    public ModelRenderer RThumbB;
    public ModelRenderer RThumbC;
    public ModelRenderer RPointFingB;
    public ModelRenderer RPointFingC;
    public ModelRenderer RMidFingB;
    public ModelRenderer RMidFingC;
    public ModelRenderer RRingFingB;
    public ModelRenderer RRingFingC;
    public ModelRenderer BenchWeightL1;
    public ModelRenderer BenchWeightR1;
    public ModelRenderer BenchWeightL4;
    public ModelRenderer BenchWeightL2;
    public ModelRenderer BenchWeightL3;
    public ModelRenderer BenchWeightR2;
    public ModelRenderer BenchWeightR3;
    public ModelRenderer BenchWeightL5;
    public ModelRenderer BenchWeightL6;
    public ModelRenderer BenchWeightR5;
    public ModelRenderer BenchWeightR6;
    public ModelRenderer WeightSideL;
    public ModelRenderer WeightSideR;

    public ModelPat() {
        this.textureWidth = 512;
        this.textureHeight = 512;
        this.LFootRSide = new ModelRenderer(this, 232, 223);
        this.LFootRSide.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.LFootRSide.addBox(-10.0F, -3.0F, 0.0F, 10, 4, 1, 0.0F);
        this.LShoulderA = new ModelRenderer(this, 1, 281);
        this.LShoulderA.setRotationPoint(6.9F, -31.0F, 20.0F);
        this.LShoulderA.addBox(-6.0F, 0.0F, 0.0F, 12, 10, 11, 0.0F);
        this.setRotateAngle(LShoulderA, 0.22759093446006054F, 0.0F, 0.0F);
        this.WristBaseThangR_1 = new ModelRenderer(this, 50, 288);
        this.WristBaseThangR_1.setRotationPoint(0.0F, 17.23F, 0.22F);
        this.WristBaseThangR_1.addBox(-5.0F, -2.0F, -4.0F, 10, 4, 8, 0.0F);
        this.setRotateAngle(WristBaseThangR_1, 0.0F, -3.1744909742529304F, 0.0F);
        this.WeightSideR = new ModelRenderer(this, 0, 0);
        this.WeightSideR.setRotationPoint(20.0F, 1.0F, -5.8F);
        this.WeightSideR.addBox(0.0F, 2.0F, -5.0F, 6, 8, 8, 0.0F);
        this.setRotateAngle(WeightSideR, 0.7853981633974483F, 0.0F, 0.0F);
        this.LRingFingB = new ModelRenderer(this, 50, 320);
        this.LRingFingB.setRotationPoint(0.0F, 3.01F, 0.0F);
        this.LRingFingB.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LRingFingB, 0.13055062804917586F, 5.235987755982988E-4F, -0.028623399732707F);
        this.BenchWeightL3 = new ModelRenderer(this, 100, 275);
        this.BenchWeightL3.setRotationPoint(-1.0F, -21.0F, -26.0F);
        this.BenchWeightL3.addBox(0.0F, 0.0F, 0.0F, 2, 11, 24, 0.0F);
        this.WeightBar = new ModelRenderer(this, 0, 22);
        this.WeightBar.setRotationPoint(-18.0F, -80.0F, 26.0F);
        this.WeightBar.addBox(0.0F, 4.0F, -5.0F, 20, 5, 5, 0.0F);
        this.LQuadA = new ModelRenderer(this, 181, 232);
        this.LQuadA.setRotationPoint(4.0F, 25.0F, 5.0F);
        this.LQuadA.addBox(-11.0F, -10.0F, -11.0F, 12, 11, 12, 0.0F);
        this.RPointFingA = new ModelRenderer(this, 50, 303);
        this.RPointFingA.setRotationPoint(-3.0F, 2.0F, -2.0F);
        this.RPointFingA.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RPointFingA, 0.0012217304763960308F, 0.0F, 0.0F);
        this.WeightSideL = new ModelRenderer(this, 0, 0);
        this.WeightSideL.setRotationPoint(-6.0F, 1.6F, -6.0F);
        this.WeightSideL.addBox(0.0F, 2.0F, -5.0F, 6, 8, 8, 0.0F);
        this.setRotateAngle(WeightSideL, 0.742986662573986F, 0.0F, 0.0F);
        this.RQuadB = new ModelRenderer(this, 2, 185);
        this.RQuadB.setRotationPoint(8.0F, 0.0F, -14.0F);
        this.RQuadB.addBox(-8.0F, 0.0F, -7.0F, 16, 20, 14, 0.0F);
        this.LBicepB = new ModelRenderer(this, 1, 382);
        this.LBicepB.setRotationPoint(-5.0F, 2.99F, -4.73F);
        this.LBicepB.addBox(0.0F, -2.0F, -2.0F, 10, 15, 15, 0.0F);
        this.setRotateAngle(LBicepB, 0.00767944870877505F, 0.0F, 0.0F);
        this.RThighC = new ModelRenderer(this, 226, 169);
        this.RThighC.setRotationPoint(0.34F, 2.97F, -0.55F);
        this.RThighC.addBox(-5.0F, 3.0F, -6.0F, 7, 10, 6, 0.0F);
        this.BenchWeightL4 = new ModelRenderer(this, 108, 278);
        this.BenchWeightL4.setRotationPoint(3.0F, -6.0F, -9.0F);
        this.BenchWeightL4.addBox(0.0F, 0.0F, 0.0F, 2, 15, 16, 0.0F);
        this.TorsoC = new ModelRenderer(this, 140, 83);
        this.TorsoC.setRotationPoint(-1.4F, -47.0F, 2.0F);
        this.TorsoC.addBox(0.0F, -2.0F, -23.0F, 15, 3, 42, 0.0F);
        this.setRotateAngle(TorsoC, 0.0F, -1.5707963267948966F, 0.0F);
        this.RPointFingC = new ModelRenderer(this, 50, 333);
        this.RPointFingC.setRotationPoint(0.0F, 1.56F, 0.0F);
        this.RPointFingC.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RPointFingC, 0.0010471975511965976F, -0.009773843811168246F, -0.21310470166850767F);
        this.TorsoB = new ModelRenderer(this, 2, 135);
        this.TorsoB.setRotationPoint(-0.6F, 6.0F, -2.5F);
        this.TorsoB.addBox(0.0F, -5.0F, -21.0F, 16, 6, 43, 0.0F);
        this.RMidFingC = new ModelRenderer(this, 55, 341);
        this.RMidFingC.setRotationPoint(0.0F, 1.86F, 0.0F);
        this.RMidFingC.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RMidFingC, 0.0010471975511965976F, -0.009773843811168246F, -0.21310470166850767F);
        this.LFootRSide_1 = new ModelRenderer(this, 232, 223);
        this.LFootRSide_1.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.LFootRSide_1.addBox(-10.0F, -3.0F, 0.0F, 10, 4, 1, 0.0F);
        this.BenchWeightL5 = new ModelRenderer(this, 103, 322);
        this.BenchWeightL5.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.BenchWeightL5.addBox(0.0F, 0.0F, 0.0F, 2, 20, 9, 0.0F);
        this.LThighC = new ModelRenderer(this, 226, 169);
        this.LThighC.setRotationPoint(0.34F, 2.97F, -0.55F);
        this.LThighC.addBox(-5.0F, 3.0F, -6.0F, 7, 10, 6, 0.0F);
        this.HeadCubeB = new ModelRenderer(this, 31, 2);
        this.HeadCubeB.setRotationPoint(-3.5F, -24.0F, -4.6F);
        this.HeadCubeB.addBox(-2.0F, 4.0F, -2.0F, 11, 5, 13, 0.0F);
        this.LBicepA = new ModelRenderer(this, 1, 350);
        this.LBicepA.setRotationPoint(0.0F, 11.13F, 4.61F);
        this.LBicepA.addBox(-6.0F, 0.0F, -5.5F, 12, 19, 11, 0.0F);
        this.setRotateAngle(LBicepA, -0.05759586531581287F, 0.0F, 0.0F);
        this.RThighD = new ModelRenderer(this, 224, 149);
        this.RThighD.setRotationPoint(-0.5F, 8.0F, 0.07F);
        this.RThighD.addBox(-5.0F, 2.0F, -7.0F, 8, 11, 7, 0.0F);
        this.setRotateAngle(RThighD, 0.018500490071139894F, -0.0012217304763960308F, 0.13543754995475996F);
        this.LRingFingC = new ModelRenderer(this, 50, 328);
        this.LRingFingC.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.LRingFingC.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LRingFingC, 0.20839231268812292F, 0.002617993877991494F, -0.04537856055185257F);
        this.RBicepA = new ModelRenderer(this, 1, 350);
        this.RBicepA.setRotationPoint(0.0F, 11.13F, 4.61F);
        this.RBicepA.addBox(-6.0F, 0.0F, -5.5F, 12, 19, 11, 0.0F);
        this.setRotateAngle(RBicepA, -0.05759586531581287F, 0.0F, 0.0F);
        this.BenchWeightR5 = new ModelRenderer(this, 102, 322);
        this.BenchWeightR5.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.BenchWeightR5.addBox(0.0F, 0.0F, 0.0F, 2, 20, 9, 0.0F);
        this.LPointFingC = new ModelRenderer(this, 50, 333);
        this.LPointFingC.setRotationPoint(0.0F, 1.56F, 0.0F);
        this.LPointFingC.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LPointFingC, 0.0010471975511965976F, -0.009773843811168246F, -0.21310470166850767F);
        this.LThighA = new ModelRenderer(this, 236, 205);
        this.LThighA.setRotationPoint(-0.6F, 7.14F, -0.42F);
        this.LThighA.addBox(-4.0F, -2.0F, -4.0F, 5, 12, 4, 0.0F);
        this.RThighB = new ModelRenderer(this, 232, 188);
        this.RThighB.setRotationPoint(0.47F, 3.96F, -0.57F);
        this.RThighB.addBox(-5.0F, 3.0F, -5.0F, 6, 10, 5, 0.0F);
        this.LForearmB = new ModelRenderer(this, 44, 262);
        this.LForearmB.setRotationPoint(-4.4F, -1.22F, -5.9F);
        this.LForearmB.addBox(-4.0F, 2.0F, 2.0F, 16, 14, 9, 0.0F);
        this.setRotateAngle(LForearmB, 0.0019198621771937625F, 0.0F, 0.0F);
        this.LFootMain = new ModelRenderer(this, 218, 230);
        this.LFootMain.setRotationPoint(1.75F, 12.88F, -0.24F);
        this.LFootMain.addBox(-11.0F, -4.0F, -5.0F, 12, 5, 6, 0.0F);
        this.setRotateAngle(LFootMain, -0.018500490071139894F, -0.0012217304763960308F, -0.13543754995475996F);
        this.NeckA = new ModelRenderer(this, 2, 91);
        this.NeckA.setRotationPoint(0.5F, -34.0F, 1.7F);
        this.NeckA.addBox(-1.0F, 1.0F, -24.0F, 15, 1, 41, 0.0F);
        this.RForearmA = new ModelRenderer(this, 1, 473);
        this.RForearmA.setRotationPoint(0.0F, 18.25F, -0.09F);
        this.RForearmA.addBox(-6.0F, 0.0F, -5.5F, 12, 16, 11, 0.0F);
        this.setRotateAngle(RForearmA, -0.1244419756671957F, 0.0F, 0.0F);
        this.LThumbA = new ModelRenderer(this, 50, 303);
        this.LThumbA.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.LThumbA.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(LThumbA, 0.0F, -0.23230332344044527F, 0.010821041362364843F);
        this.RBicepB = new ModelRenderer(this, 1, 382);
        this.RBicepB.setRotationPoint(-5.0F, 2.99F, -4.73F);
        this.RBicepB.addBox(0.0F, -2.0F, -2.0F, 10, 15, 15, 0.0F);
        this.setRotateAngle(RBicepB, 0.00767944870877505F, 0.0F, 0.0F);
        this.RMidFingB = new ModelRenderer(this, 50, 303);
        this.RMidFingB.setRotationPoint(0.0F, 3.29F, 0.0F);
        this.RMidFingB.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RMidFingB, 3.4906585039886593E-4F, -0.006283185307179587F, -0.14590952546672595F);
        this.RShoulderA = new ModelRenderer(this, 1, 281);
        this.RShoulderA.setRotationPoint(6.9F, -31.0F, -24.0F);
        this.RShoulderA.addBox(-6.0F, 0.0F, 0.0F, 12, 10, 11, 0.0F);
        this.setRotateAngle(RShoulderA, 0.22759093446006054F, -3.1464795754953774F, 0.0F);
        this.LThighB = new ModelRenderer(this, 232, 188);
        this.LThighB.setRotationPoint(0.47F, 3.96F, -0.57F);
        this.LThighB.addBox(-5.0F, 3.0F, -5.0F, 6, 10, 5, 0.0F);
        this.RRingFingA = new ModelRenderer(this, 50, 303);
        this.RRingFingA.setRotationPoint(-1.0F, 1.77F, 3.0F);
        this.RRingFingA.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RRingFingA, -0.16318828506146982F, 1.350535775193212F, -0.20507618710933373F);
        this.RBicepC = new ModelRenderer(this, 1, 415);
        this.RBicepC.mirror = true;
        this.RBicepC.setRotationPoint(0.0F, -2.0F, 0.22F);
        this.RBicepC.addBox(-2.0F, 0.0F, 0.0F, 14, 15, 11, 0.0F);
        this.setRotateAngle(RBicepC, -5.235987755982988E-4F, 0.0F, 0.0F);
        this.LPointFingA = new ModelRenderer(this, 50, 303);
        this.LPointFingA.setRotationPoint(-3.0F, 2.0F, -2.0F);
        this.LPointFingA.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(LPointFingA, 0.0012217304763960308F, 0.0F, 0.0F);
        this.BenchWeightR6 = new ModelRenderer(this, 100, 366);
        this.BenchWeightR6.setRotationPoint(0.0F, 3.0F, -2.0F);
        this.BenchWeightR6.addBox(0.0F, 0.0F, 0.0F, 2, 9, 20, 0.0F);
        this.TorsoDChest = new ModelRenderer(this, 136, 5);
        this.TorsoDChest.setRotationPoint(-1.5F, -50.0F, 2.0F);
        this.TorsoDChest.addBox(-1.0F, -32.0F, -24.0F, 16, 33, 44, 0.0F);
        this.setRotateAngle(TorsoDChest, 0.0F, -91.5707963267948966F, 0.0F);
        this.LBicepC = new ModelRenderer(this, 1, 415);
        this.LBicepC.setRotationPoint(0.0F, -2.0F, 0.22F);
        this.LBicepC.addBox(-2.0F, 0.0F, 0.0F, 14, 15, 11, 0.0F);
        this.setRotateAngle(LBicepC, -5.235987755982988E-4F, 0.0F, 0.0F);
        this.RShoulderB = new ModelRenderer(this, 1, 258);
        this.RShoulderB.setRotationPoint(-5.0F, 0.08F, 2.14F);
        this.RShoulderB.addBox(0.0F, -2.0F, 0.0F, 10, 13, 7, 0.0F);
        this.setRotateAngle(RShoulderB, 0.028448866807507567F, 0.0F, 0.0F);
        this.BenchWeightL2 = new ModelRenderer(this, 100, 315);
        this.BenchWeightL2.setRotationPoint(-1.0F, -24.0F, -29.0F);
        this.BenchWeightL2.addBox(0.0F, -4.0F, 9.0F, 2, 24, 12, 0.0F);
        this.RThumbA = new ModelRenderer(this, 50, 303);
        this.RThumbA.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.RThumbA.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(RThumbA, 0.0F, -0.23230332344044527F, 0.010821041362364843F);
        this.NeckC = new ModelRenderer(this, 81, 113);
        this.NeckC.setRotationPoint(2.6F, -2.0F, 2.7F);
        this.NeckC.addBox(-1.0F, -1.0F, -24.0F, 9, 2, 35, 0.0F);
        this.RMidFingA = new ModelRenderer(this, 50, 311);
        this.RMidFingA.setRotationPoint(-3.0F, 2.0F, 1.0F);
        this.RMidFingA.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(RMidFingA, 0.0012217304763960308F, 0.0F, 0.0F);
        this.BenchWeightL6 = new ModelRenderer(this, 102, 367);
        this.BenchWeightL6.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.BenchWeightL6.addBox(0.0F, 0.0F, 0.0F, 2, 9, 19, 0.0F);
        this.NeckB = new ModelRenderer(this, 1, 49);
        this.NeckB.setRotationPoint(1.1F, 0.0F, 0.7F);
        this.NeckB.addBox(-1.0F, -1.0F, -24.0F, 13, 2, 39, 0.0F);
        this.LShoulderC = new ModelRenderer(this, 1, 304);
        this.LShoulderC.setRotationPoint(0.0F, -0.93F, 1.17F);
        this.LShoulderC.addBox(0.0F, 2.0F, -5.0F, 10, 8, 14, 0.0F);
        this.setRotateAngle(LShoulderC, -0.028448866807507567F, 0.0F, 0.0F);
        this.LPointFingB = new ModelRenderer(this, 50, 320);
        this.LPointFingB.setRotationPoint(0.0F, 2.97F, 0.0F);
        this.LPointFingB.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LPointFingB, 3.4906585039886593E-4F, -0.006283185307179587F, -0.13351768777756623F);
        this.BenchWeightR4 = new ModelRenderer(this, 108, 278);
        this.BenchWeightR4.setRotationPoint(57.0F, -6F, -9F);
        this.BenchWeightR4.addBox(0.0F, 0.0F, 0.0F, 2, 15, 16, 0.0F);
        this.LThumbC = new ModelRenderer(this, 50, 358);
        this.LThumbC.setRotationPoint(0.0F, 1.47F, 0.0F);
        this.LThumbC.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LThumbC, 0.2659881780039358F, 0.0F, 0.0F);
        this.HeadCubeA = new ModelRenderer(this, 119, 18);
        this.HeadCubeA.setRotationPoint(5.8F, -3.0F, -3.4F);
        this.HeadCubeA.addBox(-7.5F, -15.0F, -7.5F, 15, 15, 15, 0.0F);
        this.RThumbB = new ModelRenderer(this, 54, 349);
        this.RThumbB.setRotationPoint(0.0F, 3.02F, 0.0F);
        this.RThumbB.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RThumbB, 0.1520181778487061F, 0.0F, -0.008203047484373348F);
        this.LThighD = new ModelRenderer(this, 224, 149);
        this.LThighD.setRotationPoint(-0.5F, 8.0F, 0.07F);
        this.LThighD.addBox(-5.0F, 2.0F, -7.0F, 8, 11, 7, 0.0F);
        this.setRotateAngle(LThighD, 0.018500490071139894F, -0.0012217304763960308F, 0.13543754995475996F);
        this.RForearmC = new ModelRenderer(this, 1, 443);
        this.RForearmC.setRotationPoint(-0.6F, 0.0F, 1.3F);
        this.RForearmC.addBox(-2.0F, 0.0F, 0.0F, 12, 16, 11, 0.0F);
        this.LFoot1stClawA = new ModelRenderer(this, 249, 242);
        this.LFoot1stClawA.setRotationPoint(-11.0F, 0.0F, -0.5F);
        this.LFoot1stClawA.addBox(-2.0F, -3.0F, -4.0F, 2, 4, 5, 0.0F);
        this.LForearmC = new ModelRenderer(this, 1, 443);
        this.LForearmC.setRotationPoint(-0.6F, 0.0F, 1.3F);
        this.LForearmC.addBox(-2.0F, 0.0F, 0.0F, 12, 16, 11, 0.0F);
        this.LKnee = new ModelRenderer(this, 216, 131);
        this.LKnee.setRotationPoint(-3.18F, -6.1F, -1.08F);
        this.LKnee.addBox(-7.0F, 7.0F, -8.0F, 10, 6, 9, 0.0F);
        this.RShoulderD = new ModelRenderer(this, 1, 329);
        this.RShoulderD.mirror = true;
        this.RShoulderD.setRotationPoint(3.0F, -0.22F, -2.72F);
        this.RShoulderD.addBox(-6.0F, 2.0F, 0.0F, 16, 9, 10, 0.0F);
        this.LFootLSide = new ModelRenderer(this, 232, 223);
        this.LFootLSide.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.LFootLSide.addBox(-10.0F, -3.0F, 0.0F, 10, 4, 1, 0.0F);
        this.LThumbB = new ModelRenderer(this, 54, 349);
        this.LThumbB.setRotationPoint(0.0F, 3.02F, 0.0F);
        this.LThumbB.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(LThumbB, 0.1520181778487061F, 0.0F, -0.008218893966333561F);
        this.LFootLSide_1 = new ModelRenderer(this, 232, 223);
        this.LFootLSide_1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.LFootLSide_1.addBox(-10.0F, -3.0F, 0.0F, 10, 4, 1, 0.0F);
        this.RFoot1stClawA = new ModelRenderer(this, 249, 242);
        this.RFoot1stClawA.setRotationPoint(-11.0F, 0.0F, -0.5F);
        this.RFoot1stClawA.addBox(-2.0F, -3.0F, -4.0F, 2, 4, 5, 0.0F);
        this.LMidFingB = new ModelRenderer(this, 50, 303);
        this.LMidFingB.setRotationPoint(0.0F, 3.29F, 0.0F);
        this.LMidFingB.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(LMidFingB, 3.4906585039886593E-4F, -0.006283185307179587F, -0.14586475897919746F);
        this.RShoulderC = new ModelRenderer(this, 1, 304);
        this.RShoulderC.setRotationPoint(0.0F, -0.93F, 1.17F);
        this.RShoulderC.addBox(0.0F, 2.0F, -5.0F, 10, 8, 14, 0.0F);
        this.setRotateAngle(RShoulderC, -0.028448866807507567F, 0.0F, 0.0F);
        this.TorsoA = new ModelRenderer(this, 81, 153);
        this.TorsoA.setRotationPoint(0.0F, 9.0F, 0.5F);
        this.TorsoA.addBox(0.0F, -8.0F, -21.0F, 16, 24, 42, 0.0F);
        this.LRingFingA = new ModelRenderer(this, 50, 303);
        this.LRingFingA.setRotationPoint(-1.0F, 1.77F, 3.0F);
        this.LRingFingA.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(LRingFingA, -0.16318828506146982F, 1.350535775193212F, -0.20507618710933373F);
        this.BenchWeightL1 = new ModelRenderer(this, 100, 355);
        this.BenchWeightL1.setRotationPoint(8.0F, 17.0F, 13.0F);
        this.BenchWeightL1.addBox(-1.0F, -26.0F, -24.0F, 2, 20, 20, 0.0F);
        this.BenchWeightR3 = new ModelRenderer(this, 100, 275);
        this.BenchWeightR3.setRotationPoint(-1.0F, -21.0F, -26.0F);
        this.BenchWeightR3.addBox(0.0F, 0.0F, 0.0F, 2, 11, 24, 0.0F);
        this.RRingFingC = new ModelRenderer(this, 50, 328);
        this.RRingFingC.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.RRingFingC.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RRingFingC, 0.20839231268812292F, 0.002617993877991494F, -0.04537856055185257F);
        this.WristBaseThangR = new ModelRenderer(this, 50, 288);
        this.WristBaseThangR.setRotationPoint(0.0F, 17.23F, 0.22F);
        this.WristBaseThangR.addBox(-5.0F, -2.0F, -4.0F, 10, 4, 8, 0.0F);
        this.LMidFingA = new ModelRenderer(this, 50, 311);
        this.LMidFingA.setRotationPoint(-3.0F, 2.0F, 1.0F);
        this.LMidFingA.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LMidFingA, 0.0012217304763960308F, 0.0F, 0.0F);
        this.RKnee = new ModelRenderer(this, 216, 131);
        this.RKnee.setRotationPoint(-3.18F, -6.1F, -1.08F);
        this.RKnee.addBox(-7.0F, 7.0F, -8.0F, 10, 6, 9, 0.0F);
        this.RThighA = new ModelRenderer(this, 236, 205);
        this.RThighA.setRotationPoint(-0.6F, 7.14F, -0.42F);
        this.RThighA.addBox(-4.0F, -2.0F, -4.0F, 5, 12, 4, 0.0F);
        this.LMidFingC = new ModelRenderer(this, 55, 341);
        this.LMidFingC.setRotationPoint(0.0F, 1.86F, 0.0F);
        this.LMidFingC.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(LMidFingC, 0.0010471975511965976F, -0.009773843811168246F, -0.21310470166850767F);
        this.RThumbC = new ModelRenderer(this, 50, 358);
        this.RThumbC.setRotationPoint(0.0F, 1.47F, 0.0F);
        this.RThumbC.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RThumbC, 0.2659881780039358F, 0.0F, 0.0F);
        this.LQuadB = new ModelRenderer(this, 2, 185);
        this.LQuadB.setRotationPoint(8.0F, 0.0F, 14.0F);
        this.LQuadB.addBox(-8.0F, 0.0F, -7.0F, 16, 20, 14, 0.0F);
        this.RQuadA = new ModelRenderer(this, 181, 232);
        this.RQuadA.setRotationPoint(4.0F, 25.0F, 5.0F);
        this.RQuadA.addBox(-11.0F, -10.0F, -11.0F, 12, 11, 12, 0.0F);
        this.RFootMain = new ModelRenderer(this, 218, 230);
        this.RFootMain.setRotationPoint(1.75F, 12.88F, -0.24F);
        this.RFootMain.addBox(-11.0F, -4.0F, -5.0F, 12, 5, 6, 0.0F);
        this.setRotateAngle(RFootMain, -0.018500490071139894F, -0.0012217304763960308F, -0.13543754995475996F);
        this.RForearmB = new ModelRenderer(this, 44, 262);
        this.RForearmB.mirror = true;
        this.RForearmB.setRotationPoint(-4.4F, -1.22F, -5.9F);
        this.RForearmB.addBox(-4.0F, 2.0F, 2.0F, 16, 14, 9, 0.0F);
        this.setRotateAngle(RForearmB, 0.0019198621771937625F, 0.0F, 0.0F);
        this.BenchWeightR1 = new ModelRenderer(this, 100, 355);
        this.BenchWeightR1.setRotationPoint(54.0F, 17.0F, 13.0F);
        this.BenchWeightR1.addBox(-1.0F, -26.0F, -24.0F, 2, 20, 20, 0.0F);
        this.RRingFingB = new ModelRenderer(this, 50, 320);
        this.RRingFingB.setRotationPoint(0.0F, 3.01F, 0.0F);
        this.RRingFingB.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RRingFingB, 0.13055062804917586F, 5.235987755982988E-4F, -0.028623399732707F);
        this.BenchWeightBar = new ModelRenderer(this, 100, 262);
        this.BenchWeightBar.setRotationPoint(-31.0F, 11.0F, -23.0F);
        this.BenchWeightBar.addBox(0.0F, 0.0F, -2.0F, 61, 3, 3, 0.0F);
        this.BenchWeightR2 = new ModelRenderer(this, 100, 315);
        this.BenchWeightR2.setRotationPoint(-1.0F, -24.0F, -29.0F);
        this.BenchWeightR2.addBox(0.0F, -4.0F, 9.0F, 2, 24, 12, 0.0F);
        this.LForearmA = new ModelRenderer(this, 1, 473);
        this.LForearmA.setRotationPoint(0.0F, 18.25F, -0.09F);
        this.LForearmA.addBox(-6.0F, 0.0F, -5.5F, 12, 16, 11, 0.0F);
        this.setRotateAngle(LForearmA, -0.1244419756671957F, 0.0F, 0.0F);
        this.LShoulderB = new ModelRenderer(this, 1, 258);
        this.LShoulderB.setRotationPoint(-5.0F, 0.08F, 2.14F);
        this.LShoulderB.addBox(0.0F, -2.0F, 0.0F, 10, 13, 7, 0.0F);
        this.setRotateAngle(LShoulderB, 0.028448866807507567F, 0.0F, 0.0F);
        this.RPointFingB = new ModelRenderer(this, 50, 320);
        this.RPointFingB.setRotationPoint(0.0F, 2.97F, 0.0F);
        this.RPointFingB.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(RPointFingB, 3.4906585039886593E-4F, -0.006283185307179587F, -0.13351768777756623F);
        this.LShoulderD = new ModelRenderer(this, 1, 329);
        this.LShoulderD.setRotationPoint(3.0F, -0.22F, -2.72F);
        this.LShoulderD.addBox(-6.0F, 2.0F, 0.0F, 16, 9, 10, 0.0F);
        this.LFootMain.addChild(this.LFootRSide);
        this.TorsoDChest.addChild(this.LShoulderA);
        this.RForearmA.addChild(this.WristBaseThangR_1);
        this.WeightBar.addChild(this.WeightSideR);
        this.LRingFingA.addChild(this.LRingFingB);
        this.BenchWeightL1.addChild(this.BenchWeightL3);
        this.LQuadB.addChild(this.LQuadA);
        this.WristBaseThangR_1.addChild(this.RPointFingA);
        this.WeightBar.addChild(this.WeightSideL);
        this.TorsoA.addChild(this.RQuadB);
        this.LBicepA.addChild(this.LBicepB);
        this.RThighD.addChild(this.RThighC);
        this.BenchWeightBar.addChild(this.BenchWeightL4);
        this.BenchWeightBar.addChild(this.BenchWeightR4);
        this.RPointFingB.addChild(this.RPointFingC);
        this.TorsoC.addChild(this.TorsoB);
        this.RMidFingB.addChild(this.RMidFingC);
        this.RFootMain.addChild(this.LFootRSide_1);
        this.BenchWeightL4.addChild(this.BenchWeightL5);
        this.LThighD.addChild(this.LThighC);
        this.HeadCubeA.addChild(this.HeadCubeB);
        this.LShoulderA.addChild(this.LBicepA);
        this.RKnee.addChild(this.RThighD);
        this.LRingFingB.addChild(this.LRingFingC);
        this.RShoulderA.addChild(this.RBicepA);
        this.BenchWeightR4.addChild(this.BenchWeightR5);
        this.LPointFingB.addChild(this.LPointFingC);
        this.LThighB.addChild(this.LThighA);
        this.RThighC.addChild(this.RThighB);
        this.LForearmA.addChild(this.LForearmB);
        this.LThighA.addChild(this.LFootMain);
        this.TorsoDChest.addChild(this.NeckA);
        this.RBicepA.addChild(this.RForearmA);
        this.WristBaseThangR.addChild(this.LThumbA);
        this.RBicepA.addChild(this.RBicepB);
        this.RMidFingA.addChild(this.RMidFingB);
        this.TorsoDChest.addChild(this.RShoulderA);
        this.LThighC.addChild(this.LThighB);
        this.WristBaseThangR_1.addChild(this.RRingFingA);
        this.RBicepB.addChild(this.RBicepC);
        this.WristBaseThangR.addChild(this.LPointFingA);
        this.BenchWeightR4.addChild(this.BenchWeightR6);
        this.LBicepB.addChild(this.LBicepC);
        this.RShoulderA.addChild(this.RShoulderB);
        this.BenchWeightL1.addChild(this.BenchWeightL2);
        this.WristBaseThangR_1.addChild(this.RThumbA);
        this.NeckA.addChild(this.NeckC);
        this.WristBaseThangR_1.addChild(this.RMidFingA);
        this.BenchWeightL4.addChild(this.BenchWeightL6);
        this.NeckA.addChild(this.NeckB);
        this.LShoulderB.addChild(this.LShoulderC);
        this.LPointFingA.addChild(this.LPointFingB);
        this.LThumbB.addChild(this.LThumbC);
        this.NeckA.addChild(this.HeadCubeA);
        this.RThumbA.addChild(this.RThumbB);
        this.LKnee.addChild(this.LThighD);
        this.RForearmB.addChild(this.RForearmC);
        this.LFootMain.addChild(this.LFoot1stClawA);
        this.LForearmB.addChild(this.LForearmC);
        this.LQuadA.addChild(this.LKnee);
        this.RShoulderC.addChild(this.RShoulderD);
        this.LFootMain.addChild(this.LFootLSide);
        this.LThumbA.addChild(this.LThumbB);
        this.RFootMain.addChild(this.LFootLSide_1);
        this.RFootMain.addChild(this.RFoot1stClawA);
        this.LMidFingA.addChild(this.LMidFingB);
        this.RShoulderB.addChild(this.RShoulderC);
        this.TorsoB.addChild(this.TorsoA);
        this.WristBaseThangR.addChild(this.LRingFingA);
        this.BenchWeightBar.addChild(this.BenchWeightL1);
        this.BenchWeightR1.addChild(this.BenchWeightR3);
        this.RRingFingB.addChild(this.RRingFingC);
        this.LForearmA.addChild(this.WristBaseThangR);
        this.WristBaseThangR.addChild(this.LMidFingA);
        this.RQuadA.addChild(this.RKnee);
        this.RThighB.addChild(this.RThighA);
        this.LMidFingB.addChild(this.LMidFingC);
        this.RThumbB.addChild(this.RThumbC);
        this.TorsoA.addChild(this.LQuadB);
        this.RQuadB.addChild(this.RQuadA);
        this.RThighA.addChild(this.RFootMain);
        this.RForearmA.addChild(this.RForearmB);
        this.BenchWeightBar.addChild(this.BenchWeightR1);
        this.RRingFingA.addChild(this.RRingFingB);
        this.BenchWeightR1.addChild(this.BenchWeightR2);
        this.LBicepA.addChild(this.LForearmA);
        this.LShoulderA.addChild(this.LShoulderB);
        this.RPointFingA.addChild(this.RPointFingB);
        this.LShoulderC.addChild(this.LShoulderD);

        animator = new Animator(this);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.WeightBar.render(f5);
        this.TorsoC.render(f5);
        this.TorsoDChest.render(f5);
        this.BenchWeightBar.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
        setAngles();

        this.HeadCubeA.rotateAngleX = f5 / (180F / (float)Math.PI);
        this.HeadCubeA.rotateAngleY = f4 / (180F / (float)Math.PI);

        this.LQuadB.rotateAngleZ = MathHelper.cos(f * 0.66662F) * .4F * f1;
        this.LThighD.rotateAngleZ = MathHelper.cos(f * 0.66662F + (float) Math.PI) * .4F * f1;

        this.RQuadA.rotateAngleZ = MathHelper.cos(f * 0.5F + (float) Math.PI) * .5F * f1;
        this.RQuadB.rotateAngleZ = MathHelper.cos(f * 0.0F) * .5F * f1;

        //Uppercut
        animator.setAnim(1);
        animator.startPhase(30);
            animator.rotate(RShoulderA, 0F, 0F, 2F);
            animator.rotate(RBicepA,0F, 0F, 1F);
            animator.rotate(RForearmA, 0F, 0F, .5F);
            animator.rotate(TorsoDChest, 0F, 0F, -1F);
            animator.rotate(HeadCubeA, 0F, 0F, .5F);
            animator.rotate(RQuadA, 0F, 0F, 1F);
            animator.move(RQuadA, -.001F, 0F, 0);
            animator.rotate(RThighA, 0F, 0F, -1F);
            animator.rotate(RMidFingA, 0F, 0F, -.1F);
                animator.rotate(RMidFingB, 0F, 0F, -.05F);
                animator.rotate(RMidFingC, 0F, 0F, -.025F);
            animator.rotate(RPointFingA, 0F, 0F, -.1F);
                animator.rotate(RPointFingB, 0F, 0F, -.05F);
                animator.rotate(RPointFingB, 0F, 0F, -.025F);
            animator.rotate(RRingFingA, 0F, 0F, -.1F);
                animator.rotate(RRingFingB, 0F, 0F, -.05F);
                animator.rotate(RRingFingC, 0F, 0F, -.025F);
        animator.endPhase();
        animator.setStationaryPhase(4);
        animator.resetPhase(1);

        //Weight throw (small)
        animator.setAnim(2);
        animator.startPhase(20);
            animator.rotate(LShoulderA, 0F, 0F, 3F);
            animator.rotate(LBicepA, 0F, 0F, 1F);
        animator.endPhase();
        animator.startPhase(30);
            animator.rotate(LForearmA, 0F, 0F, 1F);
            animator.move(WeightBar, 0F, -1F, 1F);
        animator.endPhase();
        animator.resetPhase(1);

        //Weight throw (large)
        animator.setAnim(3);
        animator.startPhase(20);
            animator.rotate(TorsoDChest, 0F, 0F, -1.7F);
            animator.rotate(LShoulderA, -.3F, 0F, 1.7F);
            animator.rotate(RShoulderA, .3F, 0F, 1.7F);
            animator.rotate(WristBaseThangR, 0F, 1.5F, 0F);
            animator.rotate(WristBaseThangR_1, 0F, 1.5F, 0F);
        animator.endPhase();
        animator.startPhase(20);
            animator.rotate(RShoulderA, 0F, 0F, 2F);
            animator.rotate(LShoulderA, 0F, 0F, 2F);
            animator.rotate(LShoulderA, 0F, 0F, 1F);
            animator.rotate(RShoulderA, 0F, 0F, 1F);
            animator.move(BenchWeightBar, 0F, -150F, 0F);
        animator.endPhase();
        animator.startPhase(10);
            animator.rotate(RShoulderA, 0F, 0F, -.5F);
            animator.rotate(LShoulderA, 0F, 0F, -.5F);
        animator.endPhase();
        animator.resetPhase(5);
    }

    private void setAngles() {
        this.RShoulderA.rotationPointZ = -35F;
        this.RShoulderA.rotateAngleX = -.1F;
        this.RBicepA.rotateAngleX = -.1F;
        this.RForearmA.rotateAngleX = .15F;

        this.LShoulderA.rotateAngleX = .1F;
        this.LBicepA.rotateAngleZ = -.1F;
        this.LForearmA.rotateAngleX = -.05F;

        this.LMidFingB.rotateAngleZ = -.1F;
        this.LPointFingB.rotateAngleZ = -.1F;
        this.LRingFingB.rotateAngleZ = -.1F;

        this.LMidFingC.rotateAngleZ = -.05F;
        this.LPointFingC.rotateAngleZ = -.05F;
        this.LRingFingC.rotateAngleZ = -.05F;

        this.RMidFingB.rotateAngleZ = -.1F;
        this.RPointFingB.rotateAngleZ = -.1F;
        this.RRingFingB.rotateAngleZ = -.1F;

        this.RMidFingC.rotateAngleZ = -.05F;
        this.RPointFingC.rotateAngleZ = -.05F;
        this.RRingFingC.rotateAngleZ = -.05F;

        this.BenchWeightBar.rotateAngleY = -80F;
        this.BenchWeightBar.rotationPointZ = 35F;

        this.BenchWeightBar.rotationPointY = 7F;
    }
}