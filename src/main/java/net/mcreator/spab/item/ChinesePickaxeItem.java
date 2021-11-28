
package net.mcreator.spab.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.spab.init.SpabModTabs;
import net.mcreator.spab.init.SpabModItems;

public class ChinesePickaxeItem extends PickaxeItem {
	public ChinesePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 900;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SpabModItems.DRAGON_DEBRIS), new ItemStack(SpabModItems.DRAGON_BRICK));
			}
		}, 1, 8f, new Item.Properties().tab(SpabModTabs.TAB_SPAB));
		setRegistryName("chinese_pickaxe");
	}
}
