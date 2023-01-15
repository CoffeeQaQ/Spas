
package net.mcreator.spas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.spas.itemgroup.SpasItemGroup;
import net.mcreator.spas.SpasModElements;

@SpasModElements.ModElement.Tag
public class WhiteSwordItem extends SpasModElements.ModElement {
	@ObjectHolder("spas:white_sword")
	public static final Item block = null;
	public WhiteSwordItem(SpasModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 118f;
			}

			public int getHarvestLevel() {
				return 12;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(WhiteItem.block, (int) (1)));
			}
		}, 3, 8f, new Item.Properties().group(SpasItemGroup.tab)) {
		}.setRegistryName("white_sword"));
	}
}
