
package net.mcreator.spab.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.spab.procedures.RedArmorSummonerDangYouJianDianJiFangKuaiShiProcedure;
import net.mcreator.spab.init.SpabModTabs;

public class RedArmorSummonerItem extends Item {
	public RedArmorSummonerItem() {
		super(new Item.Properties().tab(SpabModTabs.TAB_SPAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("red_armor_summoner");
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

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RedArmorSummonerDangYouJianDianJiFangKuaiShiProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
