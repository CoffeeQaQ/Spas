
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spab.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SpabModTabs {
	public static CreativeModeTab TAB_SPAB;

	public static void load() {
		TAB_SPAB = new CreativeModeTab("tabspab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SpabModItems.AUTHOR_BILIBILI_AVATAR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
