
package net.mcreator.re.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SoriumIngotItem extends Item {
	public SoriumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
