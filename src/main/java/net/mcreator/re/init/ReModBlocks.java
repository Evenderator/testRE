
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.re.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.re.block.Wierd1Block;
import net.mcreator.re.block.W1testPortalBlock;
import net.mcreator.re.block.SusAlterOreBlock;
import net.mcreator.re.block.PelansiteoreBlock;
import net.mcreator.re.block.AlterOreDsBlock;
import net.mcreator.re.block.AlterOreBlock;
import net.mcreator.re.ReMod;

public class ReModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ReMod.MODID);
	public static final RegistryObject<Block> ALTER_ORE = REGISTRY.register("alter_ore", () -> new AlterOreBlock());
	public static final RegistryObject<Block> ALTER_ORE_DS = REGISTRY.register("alter_ore_ds", () -> new AlterOreDsBlock());
	public static final RegistryObject<Block> W_1TEST_PORTAL = REGISTRY.register("w_1test_portal", () -> new W1testPortalBlock());
	public static final RegistryObject<Block> WIERD_1 = REGISTRY.register("wierd_1", () -> new Wierd1Block());
	public static final RegistryObject<Block> PELANSITEORE = REGISTRY.register("pelansiteore", () -> new PelansiteoreBlock());
	public static final RegistryObject<Block> SUS_ALTER_ORE = REGISTRY.register("sus_alter_ore", () -> new SusAlterOreBlock());
}
