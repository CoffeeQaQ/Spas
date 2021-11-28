
package net.mcreator.spab.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.spab.procedures.ChineseSwordDangGongJuChuXianZaiWuPinLanShiProcedure;
import net.mcreator.spab.init.SpabModTabs;
import net.mcreator.spab.init.SpabModItems;

public class ChineseSwordItem extends SwordItem {
	public ChineseSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SpabModItems.DRAGON_BRICK), new ItemStack(SpabModItems.DRAGON_DEBRIS));
			}
		}, 3, 8f, new Item.Properties().tab(SpabModTabs.TAB_SPAB));
		setRegistryName("chinese_sword");
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ChineseSwordDangGongJuChuXianZaiWuPinLanShiProcedure.execute(entity);
	}
}
