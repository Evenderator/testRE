package net.mcreator.re.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class Wierd1PriShchielchkiePKMPoBlokuProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Blocks.LAVA);
			_setstack.setCount(999999);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
