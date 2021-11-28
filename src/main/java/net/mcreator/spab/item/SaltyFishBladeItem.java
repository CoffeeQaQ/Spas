
package net.mcreator.spab.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.spab.procedures.SaltyFishBladeToolInInventoryTickProcedure;
import net.mcreator.spab.init.SpabModTabs;

public class SaltyFishBladeItem extends SwordItem {
	public SaltyFishBladeItem() {
		super(new Tier() {
			public int getUses() {
				return 1009;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 997f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 96f, new Item.Properties().tab(SpabModTabs.TAB_SPAB));
		setRegistryName("salty_fish_blade");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		SaltyFishBladeToolInInventoryTickProcedure.execute(entity);
		return retval;
	}
}
