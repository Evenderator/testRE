package net.mcreator.re.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.re.entity.TestEntity;

public class TestModel extends GeoModel<TestEntity> {
	@Override
	public ResourceLocation getAnimationResource(TestEntity entity) {
		return new ResourceLocation("re", "animations/sexy_flesh.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestEntity entity) {
		return new ResourceLocation("re", "geo/sexy_flesh.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestEntity entity) {
		return new ResourceLocation("re", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TestEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
