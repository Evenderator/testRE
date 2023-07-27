
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.re.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.re.client.model.Modeltest1;
import net.mcreator.re.client.model.Modelalter_squish;
import net.mcreator.re.client.model.ModelGrodner;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ReModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelalter_squish.LAYER_LOCATION, Modelalter_squish::createBodyLayer);
		event.registerLayerDefinition(Modeltest1.LAYER_LOCATION, Modeltest1::createBodyLayer);
		event.registerLayerDefinition(ModelGrodner.LAYER_LOCATION, ModelGrodner::createBodyLayer);
	}
}
