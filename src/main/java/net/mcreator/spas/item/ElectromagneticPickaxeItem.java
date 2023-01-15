
package net.mcreator.spas.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.spas.itemgroup.SpasItemGroup;
import net.mcreator.spas.SpasModElements;

@SpasModElements.ModElement.Tag
public class ElectromagneticPickaxeItem extends SpasModElements.ModElement {
	@ObjectHolder("spas:electromagnetic_pickaxe")
	public static final Item block = null;
	public ElectromagneticPickaxeItem(SpasModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 100000f;
			}

			public float getAttackDamage() {
				return 98f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 102;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 96f, new Item.Properties().group(SpasItemGroup.tab)) {
		}.setRegistryName("electromagnetic_pickaxe"));
	}
}
