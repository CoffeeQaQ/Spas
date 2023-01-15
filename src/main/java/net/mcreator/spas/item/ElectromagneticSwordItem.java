
package net.mcreator.spas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.spas.itemgroup.SpasItemGroup;
import net.mcreator.spas.SpasModElements;

@SpasModElements.ModElement.Tag
public class ElectromagneticSwordItem extends SpasModElements.ModElement {
	@ObjectHolder("spas:electromagnetic_sword")
	public static final Item block = null;
	public ElectromagneticSwordItem(SpasModElements instance) {
		super(instance, 22);
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
				return 998f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 96f, new Item.Properties().group(SpasItemGroup.tab)) {
		}.setRegistryName("electromagnetic_sword"));
	}
}
