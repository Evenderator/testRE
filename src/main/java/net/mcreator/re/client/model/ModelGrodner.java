package net.mcreator.re.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelGrodner<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("re", "model_grodner"), "main");
	public final ModelPart leg;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart Head;
	public final ModelPart RightHand;
	public final ModelPart Lefthand;
	public final ModelPart bb_main;

	public ModelGrodner(ModelPart root) {
		this.leg = root.getChild("leg");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.Head = root.getChild("Head");
		this.RightHand = root.getChild("RightHand");
		this.Lefthand = root.getChild("Lefthand");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leg = partdefinition.addOrReplaceChild("leg",
				CubeListBuilder.create().texOffs(12, 14).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 27)
						.addBox(-1.0F, -0.5F, -1.0F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-1.0F, -8.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 10)
						.addBox(-1.5F, -12.0F, -0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 27).addBox(-0.75F, -5.0F, 0.25F, 0.5F, 3.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0257F, 12.0F, -1.8276F, 0.25F, 0.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -12.0F, 0.6F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r2 = leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0417F, 12.0F, -1.944F, 0.25F, 0.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -12.0F, 0.6F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r3 = leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0073F, 12.0F, -1.9219F, 0.25F, 0.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -12.0F, 0.6F, 0.0F, 0.3054F, 0.0F));
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 27).addBox(-7.0F, -33.0F, -5.0F, 13.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(4, 5)
				.addBox(1.0F, -31.0F, -7.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 0).addBox(-5.0F, -31.0F, -7.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition RightHand = partdefinition.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r4 = RightHand.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 10).addBox(-6.3692F, -0.9119F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -22.8F, -0.5F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r5 = RightHand.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5052F, -11.7854F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -22.8F, -0.5F, 0.0F, 0.0F, -0.7418F));
		PartDefinition Lefthand = partdefinition.addOrReplaceChild("Lefthand", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r6 = Lefthand.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(13, 4).addBox(1.4017F, 0.6136F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -21.0F, -0.3F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r7 = Lefthand.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 4).addBox(2.7078F, -4.645F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -21.0F, -0.3F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r8 = Lefthand.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 27).addBox(-0.7861F, -7.8374F, -0.7F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -21.0F, -0.3F, 0.0F, 0.0F, 1.309F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(42, 37).addBox(-4.5F, -17.0F, -3.5F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.5F, -27.0F, -7.5F, 16.0F, 10.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightHand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Lefthand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Lefthand.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightHand.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
