
package net.mcreator.spab.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.spab.init.SpabModTabs;
import net.mcreator.spab.init.SpabModItems;

public class ChineseShovelItem extends ShovelItem {
	public ChineseShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SpabModItems.DRAGON_BRICK), new ItemStack(SpabModItems.DRAGON_DEBRIS));
			}
		}, 1, 9f, new Item.Properties().tab(SpabModTabs.TAB_SPAB));
		setRegistryName("chinese_shovel");
	}
}
