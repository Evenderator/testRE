
package net.mcreator.re.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SoriumItem extends Item {
	public SoriumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
