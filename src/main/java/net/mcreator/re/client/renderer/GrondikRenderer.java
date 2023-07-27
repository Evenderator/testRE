
package net.mcreator.re.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.re.entity.GrondikEntity;
import net.mcreator.re.client.model.ModelGrodner;

public class GrondikRenderer extends MobRenderer<GrondikEntity, ModelGrodner<GrondikEntity>> {
	public GrondikRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGrodner(context.bakeLayer(ModelGrodner.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GrondikEntity entity) {
		return new ResourceLocation("re:textures/entities/texture.png");
	}
}
