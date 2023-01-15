
package net.mcreator.spas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.spas.itemgroup.SpasItemGroup;
import net.mcreator.spas.SpasModElements;

@SpasModElements.ModElement.Tag
public class WhiteAxeItem extends SpasModElements.ModElement {
	@ObjectHolder("spas:white_axe")
	public static final Item block = null;
	public WhiteAxeItem(SpasModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 12;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(WhiteItem.block, (int) (1)));
			}
		}, 1, 7f, new Item.Properties().group(SpasItemGroup.tab)) {
		}.setRegistryName("white_axe"));
	}
}
