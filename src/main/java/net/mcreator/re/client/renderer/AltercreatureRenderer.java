
package net.mcreator.re.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.re.entity.AltercreatureEntity;
import net.mcreator.re.client.model.Modelalter_squish;

public class AltercreatureRenderer extends MobRenderer<AltercreatureEntity, Modelalter_squish<AltercreatureEntity>> {
	public AltercreatureRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelalter_squish(context.bakeLayer(Modelalter_squish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AltercreatureEntity entity) {
		return new ResourceLocation("re:textures/entities/alter_nadik.png");
	}
}
