
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.re.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.re.item.WhirdomcrystallItem;
import net.mcreator.re.item.W1testItem;
import net.mcreator.re.item.Test1Item;
import net.mcreator.re.item.SoriumSwordItem;
import net.mcreator.re.item.SoriumShowelItem;
import net.mcreator.re.item.SoriumPickaxeItem;
import net.mcreator.re.item.SoriumItem;
import net.mcreator.re.item.SoriumIngotItem;
import net.mcreator.re.item.SoriumAxeItem;
import net.mcreator.re.item.PelsaniteingotItem;
import net.mcreator.re.item.PelansiteaxeItem;
import net.mcreator.re.item.PelansiteSwordItem;
import net.mcreator.re.item.PelansiteShovelItem;
import net.mcreator.re.item.PelansitePickaxeItem;
import net.mcreator.re.item.PelansiteItem;
import net.mcreator.re.item.PelansiteArmorItem;
import net.mcreator.re.item.MechItem;
import net.mcreator.re.item.GrunderDropItem;
import net.mcreator.re.item.BetaLaserBladeItem;
import net.mcreator.re.item.AlterTridentItem;
import net.mcreator.re.item.AlterSwordItem;
import net.mcreator.re.item.AlterShowelItem;
import net.mcreator.re.item.AlterShardItem;
import net.mcreator.re.item.AlterPickaxeItem;
import net.mcreator.re.item.AlterDiamondItem;
import net.mcreator.re.item.AlterAxeItem;
import net.mcreator.re.item.AlterArmorItem;
import net.mcreator.re.ReMod;

public class ReModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ReMod.MODID);
	public static final RegistryObject<Item> ALTER_DIAMOND = REGISTRY.register("alter_diamond", () -> new AlterDiamondItem());
	public static final RegistryObject<Item> ALTER_SWORD = REGISTRY.register("alter_sword", () -> new AlterSwordItem());
	public static final RegistryObject<Item> ALTER_PICKAXE = REGISTRY.register("alter_pickaxe", () -> new AlterPickaxeItem());
	public static final RegistryObject<Item> ALTER_ORE = block(ReModBlocks.ALTER_ORE);
	public static final RegistryObject<Item> ALTER_AXE = REGISTRY.register("alter_axe", () -> new AlterAxeItem());
	public static final RegistryObject<Item> ALTER_SHOWEL = REGISTRY.register("alter_showel", () -> new AlterShowelItem());
	public static final RegistryObject<Item> ALTER_SHARD = REGISTRY.register("alter_shard", () -> new AlterShardItem());
	public static final RegistryObject<Item> ALTER_ORE_DS = block(ReModBlocks.ALTER_ORE_DS);
	public static final RegistryObject<Item> TEST_MOB_SW_SPAWN_EGG = REGISTRY.register("test_mob_sw_spawn_egg", () -> new ForgeSpawnEggItem(ReModEntities.TEST_MOB_SW, -13684945, -15132391, new Item.Properties()));
	public static final RegistryObject<Item> ALTER_TRIDENT = REGISTRY.register("alter_trident", () -> new AlterTridentItem());
	public static final RegistryObject<Item> W_1TEST = REGISTRY.register("w_1test", () -> new W1testItem());
	public static final RegistryObject<Item> BETA_LASER_BLADE = REGISTRY.register("beta_laser_blade", () -> new BetaLaserBladeItem());
	public static final RegistryObject<Item> MECH = REGISTRY.register("mech", () -> new MechItem());
	public static final RegistryObject<Item> WIERD_1 = block(ReModBlocks.WIERD_1);
	public static final RegistryObject<Item> PELANSITE = REGISTRY.register("pelansite", () -> new PelansiteItem());
	public static final RegistryObject<Item> PELANSITEORE = block(ReModBlocks.PELANSITEORE);
	public static final RegistryObject<Item> ALTERCREATURE_SPAWN_EGG = REGISTRY.register("altercreature_spawn_egg", () -> new ForgeSpawnEggItem(ReModEntities.ALTERCREATURE, -471809, -2064146, new Item.Properties()));
	public static final RegistryObject<Item> SUS_ALTER_ORE = block(ReModBlocks.SUS_ALTER_ORE);
	public static final RegistryObject<Item> PELANSITE_SWORD = REGISTRY.register("pelansite_sword", () -> new PelansiteSwordItem());
	public static final RegistryObject<Item> PELSANITEINGOT = REGISTRY.register("pelsaniteingot", () -> new PelsaniteingotItem());
	public static final RegistryObject<Item> PELANSITEAXE = REGISTRY.register("pelansiteaxe", () -> new PelansiteaxeItem());
	public static final RegistryObject<Item> WHIRDOMCRYSTALL = REGISTRY.register("whirdomcrystall", () -> new WhirdomcrystallItem());
	public static final RegistryObject<Item> PELANSITE_PICKAXE = REGISTRY.register("pelansite_pickaxe", () -> new PelansitePickaxeItem());
	public static final RegistryObject<Item> PELANSITE_SHOVEL = REGISTRY.register("pelansite_shovel", () -> new PelansiteShovelItem());
	public static final RegistryObject<Item> TEST_1_HELMET = REGISTRY.register("test_1_helmet", () -> new Test1Item.Helmet());
	public static final RegistryObject<Item> TEST_1_CHESTPLATE = REGISTRY.register("test_1_chestplate", () -> new Test1Item.Chestplate());
	public static final RegistryObject<Item> TEST_1_LEGGINGS = REGISTRY.register("test_1_leggings", () -> new Test1Item.Leggings());
	public static final RegistryObject<Item> TEST_1_BOOTS = REGISTRY.register("test_1_boots", () -> new Test1Item.Boots());
	public static final RegistryObject<Item> ALTER_ARMOR_HELMET = REGISTRY.register("alter_armor_helmet", () -> new AlterArmorItem.Helmet());
	public static final RegistryObject<Item> ALTER_ARMOR_CHESTPLATE = REGISTRY.register("alter_armor_chestplate", () -> new AlterArmorItem.Chestplate());
	public static final RegistryObject<Item> ALTER_ARMOR_LEGGINGS = REGISTRY.register("alter_armor_leggings", () -> new AlterArmorItem.Leggings());
	public static final RegistryObject<Item> ALTER_ARMOR_BOOTS = REGISTRY.register("alter_armor_boots", () -> new AlterArmorItem.Boots());
	public static final RegistryObject<Item> PELANSITE_ARMOR_HELMET = REGISTRY.register("pelansite_armor_helmet", () -> new PelansiteArmorItem.Helmet());
	public static final RegistryObject<Item> PELANSITE_ARMOR_CHESTPLATE = REGISTRY.register("pelansite_armor_chestplate", () -> new PelansiteArmorItem.Chestplate());
	public static final RegistryObject<Item> PELANSITE_ARMOR_LEGGINGS = REGISTRY.register("pelansite_armor_leggings", () -> new PelansiteArmorItem.Leggings());
	public static final RegistryObject<Item> PELANSITE_ARMOR_BOOTS = REGISTRY.register("pelansite_armor_boots", () -> new PelansiteArmorItem.Boots());
	public static final RegistryObject<Item> SORIUM = REGISTRY.register("sorium", () -> new SoriumItem());
	public static final RegistryObject<Item> SORIUM_INGOT = REGISTRY.register("sorium_ingot", () -> new SoriumIngotItem());
	public static final RegistryObject<Item> SORIUM_SWORD = REGISTRY.register("sorium_sword", () -> new SoriumSwordItem());
	public static final RegistryObject<Item> SORIUM_AXE = REGISTRY.register("sorium_axe", () -> new SoriumAxeItem());
	public static final RegistryObject<Item> SORIUM_PICKAXE = REGISTRY.register("sorium_pickaxe", () -> new SoriumPickaxeItem());
	public static final RegistryObject<Item> SORIUM_SHOWEL = REGISTRY.register("sorium_showel", () -> new SoriumShowelItem());
	public static final RegistryObject<Item> GRUNDER_DROP = REGISTRY.register("grunder_drop", () -> new GrunderDropItem());
	public static final RegistryObject<Item> GRONDIK_SPAWN_EGG = REGISTRY.register("grondik_spawn_egg", () -> new ForgeSpawnEggItem(ReModEntities.GRONDIK, -13369549, -16751104, new Item.Properties()));
	public static final RegistryObject<Item> SINKY_SPAWN_EGG = REGISTRY.register("sinky_spawn_egg", () -> new ForgeSpawnEggItem(ReModEntities.SINKY, -3368704, -1, new Item.Properties()));
	public static final RegistryObject<Item> TEST_SPAWN_EGG = REGISTRY.register("test_spawn_egg", () -> new ForgeSpawnEggItem(ReModEntities.TEST, -1, -1, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
