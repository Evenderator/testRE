
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.re.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ReModItems.TEST_MOB_SW_SPAWN_EGG.get());
			tabData.accept(ReModItems.ALTERCREATURE_SPAWN_EGG.get());
			tabData.accept(ReModItems.GRONDIK_SPAWN_EGG.get());
			tabData.accept(ReModItems.SINKY_SPAWN_EGG.get());
			tabData.accept(ReModItems.TEST_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ReModItems.W_1TEST.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("re", "rem"), builder -> builder.title(Component.translatable("item_group.re.rem")).icon(() -> new ItemStack(ReModItems.ALTER_DIAMOND.get())).displayItems((parameters, tabData) -> {
			tabData.accept(ReModItems.ALTER_DIAMOND.get());
			tabData.accept(ReModItems.ALTER_SWORD.get());
			tabData.accept(ReModItems.ALTER_PICKAXE.get());
			tabData.accept(ReModBlocks.ALTER_ORE.get().asItem());
			tabData.accept(ReModItems.ALTER_AXE.get());
			tabData.accept(ReModItems.ALTER_SHOWEL.get());
			tabData.accept(ReModItems.ALTER_SHARD.get());
			tabData.accept(ReModBlocks.ALTER_ORE_DS.get().asItem());
			tabData.accept(ReModItems.ALTER_TRIDENT.get());
			tabData.accept(ReModItems.BETA_LASER_BLADE.get());
			tabData.accept(ReModItems.MECH.get());
			tabData.accept(ReModBlocks.WIERD_1.get().asItem());
			tabData.accept(ReModItems.PELANSITE.get());
			tabData.accept(ReModBlocks.PELANSITEORE.get().asItem());
			tabData.accept(ReModBlocks.SUS_ALTER_ORE.get().asItem());
			tabData.accept(ReModItems.PELANSITE_SWORD.get());
			tabData.accept(ReModItems.PELSANITEINGOT.get());
			tabData.accept(ReModItems.PELANSITEAXE.get());
			tabData.accept(ReModItems.WHIRDOMCRYSTALL.get());
			tabData.accept(ReModItems.PELANSITE_PICKAXE.get());
			tabData.accept(ReModItems.PELANSITE_SHOVEL.get());
			tabData.accept(ReModItems.TEST_1_HELMET.get());
			tabData.accept(ReModItems.TEST_1_CHESTPLATE.get());
			tabData.accept(ReModItems.TEST_1_LEGGINGS.get());
			tabData.accept(ReModItems.TEST_1_BOOTS.get());
			tabData.accept(ReModItems.ALTER_ARMOR_HELMET.get());
			tabData.accept(ReModItems.ALTER_ARMOR_CHESTPLATE.get());
			tabData.accept(ReModItems.ALTER_ARMOR_LEGGINGS.get());
			tabData.accept(ReModItems.ALTER_ARMOR_BOOTS.get());
			tabData.accept(ReModItems.PELANSITE_ARMOR_HELMET.get());
			tabData.accept(ReModItems.PELANSITE_ARMOR_CHESTPLATE.get());
			tabData.accept(ReModItems.PELANSITE_ARMOR_LEGGINGS.get());
			tabData.accept(ReModItems.PELANSITE_ARMOR_BOOTS.get());
			tabData.accept(ReModItems.SORIUM.get());
			tabData.accept(ReModItems.SORIUM_INGOT.get());
			tabData.accept(ReModItems.SORIUM_SWORD.get());
			tabData.accept(ReModItems.SORIUM_AXE.get());
			tabData.accept(ReModItems.SORIUM_PICKAXE.get());
			tabData.accept(ReModItems.SORIUM_SHOWEL.get());
			tabData.accept(ReModItems.GRUNDER_DROP.get());
		}).withSearchBar());
	}
}
