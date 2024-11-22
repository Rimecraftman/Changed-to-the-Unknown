/*package com.personj.changedttu.meanly.ithwights;

import java.util.List;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.ltxprogrammer.changed.client.renderer.animate.AnimatorPresets;
import net.ltxprogrammer.changed.client.renderer.animate.LatexAnimator;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.HumanoidArm;

public class HirstDelverLike extends LatexHumanoidModel<HirstDelver> implements LatexHumanoidModelInterface<HirstDelver, HirstDelverLike> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hirstdelver"), "main");
	private final ModelPart heafod;
	private final ModelPart bodig;
	private final ModelPart w_scanca;
	private final ModelPart r_scanca;
	private final ModelPart taegel;
	private final ModelPart w_earm;
	private final ModelPart r_earm;
	private final LatexAnimator<HirstDelver, HirstDelverLike> livener;

	public HirstDelverLike(ModelPart root) {
		super(root);
		this.heafod = root.getChild("heafod");
		this.bodig = root.getChild("bodig");
		this.w_scanca = root.getChild("w_scanca");
		this.r_scanca = root.getChild("r_scanca");
		this.taegel = root.getChild("taegel");
		this.w_earm = root.getChild("w_earm");
		this.r_earm = root.getChild("r_earm");
		
		var tailPrimary = taegel.getChild("TaegelFore");
        var tailSecondary = tailPrimary.getChild("TailOther");
        var tailTertiary = tailSecondary.getChild("TailThird");

        var u_w_fot = w_scanca.getChild("LeftLowerLeg");
        var leftFoot = u_w_fot.getChild("w_fot");
        var u_r_fot = r_scanca.getChild("u_r_fot");
        var rightFoot = u_r_fot.getChild("r_fot");
		
		 livener = LatexAnimator.of(this).hipOffset(-1.5f)
	                .addPreset(AnimatorPresets.wolfLike(
	                        heafod, heafod.getChild("w_eare"), heafod.getChild("r_eare"),
	                        bodig, w_earm, r_earm,
	                        taegel, List.of(tailPrimary, tailSecondary, tailTertiary),
	                        w_scanca, u_w_fot, leftFoot, leftFoot.getChild("w_fot"), r_scanca, u_r_fot, rightFoot, rightFoot.getChild("RightPad")));
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition heafod = partdefinition.addOrReplaceChild("heafod", CubeListBuilder.create().texOffs(0, 17).addBox(-7.0F, 0.0F, -3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(14, 51).addBox(-5.0F, 4.0F, -6.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 8).addBox(-5.0F, 6.0F, -5.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -8.0F, 0.0F));

		heafod.addOrReplaceChild("r_eare", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(0.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 51).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 0).addBox(1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 1.0F, 1.0F, 0.0F, -0.3054F, -0.3054F));

		heafod.addOrReplaceChild("w_eare", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 17).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 51).addBox(-2.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 17).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 0.0F, 0.3054F, 0.3054F));

		PartDefinition bodig = partdefinition.addOrReplaceChild("bodig", CubeListBuilder.create().texOffs(28, 29).addBox(-5.0F, -24.0F, -1.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(38, 0).addBox(-4.0F, -31.0F, -4.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		bodig.addOrReplaceChild("bosm_r1", CubeListBuilder.create().texOffs(16, 45).addBox(-7.0F, -3.0F, -1.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -21.0F, -2.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition w_scanca = partdefinition.addOrReplaceChild("w_scanca", CubeListBuilder.create().texOffs(50, 50).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		 w_scanca.addOrReplaceChild("u_w_fot", CubeListBuilder.create().texOffs(16, 33).addBox(-3.0F, -7.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 1.0F, -0.2618F, 0.0F, 0.0F));

		w_scanca.addOrReplaceChild("w_scanca", CubeListBuilder.create().texOffs(38, 45).addBox(-3.0F, -6.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -8.0F, -2.0F, -0.3491F, 0.0F, 0.0F));

		 w_scanca.addOrReplaceChild("n_w_scanca", CubeListBuilder.create().texOffs(48, 22).addBox(-3.0F, -7.0F, 0.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -4.0F, 3.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition r_scanca = partdefinition.addOrReplaceChild("r_scanca", CubeListBuilder.create().texOffs(50, 41).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		r_scanca.addOrReplaceChild("u_r_fot", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -7.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 1.0F, -0.2618F, 0.0F, 0.0F));

		r_scanca.addOrReplaceChild("n_r_scanca", CubeListBuilder.create().texOffs(0, 49).addBox(-3.0F, -7.0F, 0.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -4.0F, 3.0F, 1.2217F, 0.0F, 0.0F));

		r_scanca.addOrReplaceChild("r_scanca", CubeListBuilder.create().texOffs(48, 13).addBox(-3.0F, -6.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, -2.0F, -0.3493F, 0.0033F, 0.0027F));

		PartDefinition taegel = partdefinition.addOrReplaceChild("taegel", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		taegel.addOrReplaceChild("t_wyrte", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, 2.0F, -0.5842F, 0.0F, 0.0F));

		taegel.addOrReplaceChild("t_ende", CubeListBuilder.create().texOffs(38, 4).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 14.0F, -0.3491F, 0.0F, 0.0F));

		taegel.addOrReplaceChild("t_bodig", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -1.0F, 6.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -0.4363F, 0.0F, 0.0F));

		partdefinition.addOrReplaceChild("w_earm", CubeListBuilder.create().texOffs(0, 33).addBox(3.0F, -24.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		partdefinition.addOrReplaceChild("r_earm", CubeListBuilder.create().texOffs(32, 13).addBox(-9.0F, -24.0F, -1.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		heafod.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bodig.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		w_scanca.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_scanca.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		taegel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		w_earm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r_earm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getHead() {
		return this.heafod;
	}

	@Override
	public ModelPart getTorso() {
		return bodig;
	}

	@Override
	public LatexAnimator<HirstDelver, HirstDelverLike> getAnimator() {
		return livener;
	}

	@Override
	public ModelPart getArm(HumanoidArm earm) {
		return earm == HumanoidArm.LEFT ? this.w_earm : this.r_earm;
	}

	@Override
	public void setupHand() {
		livener.setupHand();
	}

	@Override
	public void setupAnim(HirstDelver wight, float limbSwing, float limbSwingAmount, float eldInTicks, float netHeadYaw, float headPitch) {
		livener.setupAnim(wight, limbSwing, limbSwingAmount, eldInTicks, netHeadYaw, headPitch);
	}
}*/