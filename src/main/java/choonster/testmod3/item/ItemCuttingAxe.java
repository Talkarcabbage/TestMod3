package choonster.testmod3.item;

import choonster.testmod3.TestMod3;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

/**
 * An axe that loses durability when used in crafting recipes
 *
 * @author Choonster
 */
public class ItemCuttingAxe extends ItemAxe {

	public ItemCuttingAxe(ToolMaterial material, String itemName) {
		super(material);
		ItemTestMod3.setItemName(this, itemName);
		setCreativeTab(TestMod3.creativeTab);
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		stack = stack.copy();
		stack.attemptDamageItem(1, itemRand);
		return stack;
	}
}
