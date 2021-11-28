
package net.mcreator.spab.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.spab.init.SpabModItems;
import net.mcreator.spab.init.SpabModEnchantments;

public class AvadaKedavraEnchantment extends Enchantment {
	public AvadaKedavraEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BOW, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == SpabModEnchantments.HARM)
			return true;
		return false;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == SpabModItems.SPAB_BOW)
			return true;
		if (stack.getItem() == Items.BOW)
			return true;
		if (stack.getItem() == Items.CROSSBOW)
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
