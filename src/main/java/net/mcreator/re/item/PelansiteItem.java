
package net.mcreator.re.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PelansiteItem extends Item {
	public PelansiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
