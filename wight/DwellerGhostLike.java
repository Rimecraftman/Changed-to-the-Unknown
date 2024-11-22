package com.personj.changedttu.meanly.wight;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.personj.changedttu.ChangedtotheUnknown;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

public class DwellerGhostLike<Type extends DwellerGhost> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(ChangedtotheUnknown.MODID, "dweller_ghost"), "main");
	private final ModelPart heafod;
	private final ModelPart bodig;
	private final ModelPart earan;

	public DwellerGhostLike(ModelPart root) {
		this.heafod = root.getChild("heafod");
		this.bodig = root.getChild("bodig");
		this.earan = root.getChild("earan");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("heafod", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(1.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 17).addBox(1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition bodig = partdefinition.addOrReplaceChild("bodig", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -1.0F, 6.0F, 7.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 10).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(-3.0F, 3.0F, -2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

		bodig.addOrReplaceChild("taegel_r1", CubeListBuilder.create().texOffs(16, 14).addBox(-1.0F, 3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 0.2182F, 0.0F, 0.0F));

		partdefinition.addOrReplaceChild("earan", CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 17).addBox(-2.0F, -27.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Type wight, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		heafod.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bodig.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		earan.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}