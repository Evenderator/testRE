package net.mcreator.re.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.re.entity.SinkyEntity;

public class SinkyModel extends GeoModel<SinkyEntity> {
	@Override
	public ResourceLocation getAnimationResource(SinkyEntity entity) {
		return new ResourceLocation("re", "animations/sinky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SinkyEntity entity) {
		return new ResourceLocation("re", "geo/sinky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SinkyEntity entity) {
		return new ResourceLocation("re", "textures/entities/" + entity.getTexture() + ".png");
	}

}
