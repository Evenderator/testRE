
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.re.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.re.client.renderer.TestRenderer;
import net.mcreator.re.client.renderer.TestMobSwRenderer;
import net.mcreator.re.client.renderer.SinkyRenderer;
import net.mcreator.re.client.renderer.GrondikRenderer;
import net.mcreator.re.client.renderer.AltercreatureRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ReModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ReModEntities.TEST_MOB_SW.get(), TestMobSwRenderer::new);
		event.registerEntityRenderer(ReModEntities.ALTERCREATURE.get(), AltercreatureRenderer::new);
		event.registerEntityRenderer(ReModEntities.GRONDIK.get(), GrondikRenderer::new);
		event.registerEntityRenderer(ReModEntities.SINKY.get(), SinkyRenderer::new);
		event.registerEntityRenderer(ReModEntities.TEST.get(), TestRenderer::new);
	}
}
