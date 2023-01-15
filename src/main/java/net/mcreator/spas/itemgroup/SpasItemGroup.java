
package net.mcreator.spas.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.spas.item.ElectromagneticSwordItem;
import net.mcreator.spas.SpasModElements;

@SpasModElements.ModElement.Tag
public class SpasItemGroup extends SpasModElements.ModElement {
	public SpasItemGroup(SpasModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabspas") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ElectromagneticSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
