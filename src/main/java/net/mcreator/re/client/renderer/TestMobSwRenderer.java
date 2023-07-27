
package net.mcreator.re.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.re.entity.TestMobSwEntity;
import net.mcreator.re.client.model.Modeltest1;

public class TestMobSwRenderer extends MobRenderer<TestMobSwEntity, Modeltest1<TestMobSwEntity>> {
	public TestMobSwRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltest1(context.bakeLayer(Modeltest1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TestMobSwEntity entity) {
		return new ResourceLocation("re:textures/entities/why.png");
	}
}
