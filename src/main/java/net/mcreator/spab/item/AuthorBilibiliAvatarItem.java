
package net.mcreator.spab.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.spab.init.SpabModTabs;

public class AuthorBilibiliAvatarItem extends Item {
	public AuthorBilibiliAvatarItem() {
		super(new Item.Properties().tab(SpabModTabs.TAB_SPAB).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("author_bilibili_avatar");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
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
		return 0F;
	}
}
