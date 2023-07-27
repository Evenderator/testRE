// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltest1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "test1"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart legl;
	private final ModelPart legr;
	private final ModelPart armr;
	private final ModelPart arml;

	public Modeltest1(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.legl = root.getChild("legl");
		this.legr = root.getChild("legr");
		this.armr = root.getChild("armr");
		this.arml = root.getChild("arml");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(12, 11)
				.addBox(-2.997F, -31.968F, -5.661F, 7.992F, 6.993F, 7.326F, new CubeDeformation(0.0F)).texOffs(4, 21)
				.addBox(-1.332F, -27.972F, -10.656F, 4.662F, 2.997F, 4.995F, new CubeDeformation(0.0F)).texOffs(0, 1)
				.addBox(-0.999F, -26.64F, -14.319F, 3.996F, 1.665F, 3.663F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.008F, -8.991F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 2).addBox(-2.331F, -0.999F, 4.995F, 4.662F, 0.666F, 3.33F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.999F, -22.977F, -18.981F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 9).addBox(-2.331F, -1.998F, -1.332F, 4.662F, 1.665F, 11.655F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.999F, -22.644F, -9.324F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, 1.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(12, 0).addBox(-3.33F, -9.99F, -6.66F, 6.66F, 9.99F, 9.99F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.68F, 14.651F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.995F, -9.99F, -6.66F, 9.99F, 9.99F, 9.99F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.303F, 0.332F, 1.2522F, -0.1451F, -0.413F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 9).addBox(-4.995F, -9.99F, -6.66F, 9.99F, 9.99F, 9.99F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.689F, 8.99F, 0.8091F, -0.2143F, -0.2194F));

		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(19, 0)
				.addBox(0.996F, 11.674F, -4.009F, 4.662F, 7.326F, 4.662F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 5.0F, 13.0F));

		PartDefinition cube_r6 = legl.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 15).addBox(-3.33F, -13.32F, -2.664F, 5.994F, 12.654F, 5.328F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.66F, 12.34F, -1.678F, -0.1745F, 0.0F, 0.0F));

		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create().texOffs(9, 0)
				.addBox(-5.658F, 11.674F, -3.676F, 4.662F, 7.326F, 4.662F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 5.0F, 13.0F));

		PartDefinition cube_r7 = legr.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(16, 15).addBox(-2.664F, -13.32F, -2.664F, 5.994F, 12.654F, 5.328F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.66F, 12.34F, -1.678F, -0.1745F, 0.0F, 0.0F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-7.658F, 25.328F, -3.672F, 4.662F, 1.332F, 3.996F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -2.66F, -7.65F));

		PartDefinition cube_r8 = armr.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 6).addBox(-1.332F, -1.998F, -1.665F, 3.33F, 1.332F, 3.33F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.66F, 25.994F, -1.674F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = armr.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 21).addBox(-1.998F, -13.32F, -1.998F, 4.662F, 12.654F, 3.996F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.66F, 24.662F, -1.674F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r10 = armr.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(8, 15).addBox(-2.664F, -13.32F, -2.664F, 5.994F, 12.654F, 5.328F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.66F, 12.341F, -0.009F, 0.1335F, 0.0302F, 0.1719F));

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create(),
				PartPose.offset(4.33F, -10.0F, -6.65F));

		PartDefinition cube_r11 = arml.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -10.656F, 0.0F, 0.999F, 3.33F, 27.306F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.323F, 8.026F, 15.974F, 3.1386F, 0.1924F, -0.2556F));

		PartDefinition cube_r12 = arml.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(14, 21).addBox(-0.999F, -10.656F, 0.0F, 3.33F, 4.995F, 3.996F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.323F, 7.027F, 16.64F, 3.1386F, 0.1924F, -0.2556F));

		PartDefinition cube_r13 = arml.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(18, 21).addBox(-1.332F, -11.655F, 0.0F, 3.663F, 5.994F, 3.33F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.991F, 2.365F, 14.642F, 3.1386F, 0.1924F, -0.2556F));

		PartDefinition cube_r14 = arml.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(10, 21).addBox(-1.665F, -11.655F, -0.333F, 4.329F, 5.994F, 3.996F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.993F, -3.296F, 11.645F, -2.8827F, 0.1924F, -0.2556F));

		PartDefinition cube_r15 = arml.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(20, 11).addBox(-2.331F, -11.655F, -0.999F, 4.995F, 5.994F, 4.662F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.329F, -5.96F, 3.986F, -2.324F, 0.2034F, -0.2987F));

		PartDefinition cube_r16 = arml.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(20, 4).addBox(-2.997F, -11.655F, -0.999F, 6.327F, 5.994F, 4.995F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.997F, -5.627F, -3.34F, -1.9051F, 0.2034F, -0.2987F));

		PartDefinition cube_r17 = arml.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(14, 7).addBox(-3.33F, -11.655F, -1.665F, 6.993F, 6.66F, 5.994F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.325F, 6.028F, 0.323F, 0.4178F, 0.1735F, -0.3504F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.legr.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armr.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legl.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arml.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}