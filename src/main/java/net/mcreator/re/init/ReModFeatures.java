
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.re.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.re.world.features.ores.SusAlterOreFeature;
import net.mcreator.re.world.features.ores.PelansiteoreFeature;
import net.mcreator.re.world.features.ores.AlterOreFeature;
import net.mcreator.re.world.features.ores.AlterOreDsFeature;
import net.mcreator.re.ReMod;

@Mod.EventBusSubscriber
public class ReModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ReMod.MODID);
	public static final RegistryObject<Feature<?>> ALTER_ORE = REGISTRY.register("alter_ore", AlterOreFeature::new);
	public static final RegistryObject<Feature<?>> ALTER_ORE_DS = REGISTRY.register("alter_ore_ds", AlterOreDsFeature::new);
	public static final RegistryObject<Feature<?>> PELANSITEORE = REGISTRY.register("pelansiteore", PelansiteoreFeature::new);
	public static final RegistryObject<Feature<?>> SUS_ALTER_ORE = REGISTRY.register("sus_alter_ore", SusAlterOreFeature::new);
}
