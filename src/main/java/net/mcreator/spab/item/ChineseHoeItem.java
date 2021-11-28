
package net.mcreator.spab.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.spab.init.SpabModTabs;
import net.mcreator.spab.init.SpabModItems;

public class ChineseHoeItem extends HoeItem {
	public ChineseHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 0, -3f, new Item.Properties().tab(SpabModTabs.TAB_SPAB));
		setRegistryName("chinese_hoe");
	}
}
