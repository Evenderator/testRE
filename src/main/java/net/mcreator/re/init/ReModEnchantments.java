
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.re.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.re.enchantment.FunnySexEnchantment;
import net.mcreator.re.ReMod;

public class ReModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ReMod.MODID);
	public static final RegistryObject<Enchantment> FUNNY_SEX = REGISTRY.register("funny_sex", () -> new FunnySexEnchantment());
}
