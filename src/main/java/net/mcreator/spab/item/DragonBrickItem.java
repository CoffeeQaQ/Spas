
package net.mcreator.spab.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.spab.init.SpabModTabs;

public class DragonBrickItem extends Item {
	public DragonBrickItem() {
		super(new Item.Properties().tab(SpabModTabs.TAB_SPAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("dragon_brick");
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 1F;
	}
}
