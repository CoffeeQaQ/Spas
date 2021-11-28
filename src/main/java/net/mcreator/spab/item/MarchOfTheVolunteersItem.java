
package net.mcreator.spab.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.spab.init.SpabModTabs;
import net.mcreator.spab.init.SpabModSounds;

import java.util.List;

public class MarchOfTheVolunteersItem extends RecordItem {
	public MarchOfTheVolunteersItem() {
		super(0, SpabModSounds.REGISTRY.get(new ResourceLocation("spab:marchofthevolunteers")),
				new Item.Properties().tab(SpabModTabs.TAB_SPAB).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("march_of_the_volunteers");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u5E84\u4E25\u7684\u5BA3\u8A93"));
	}
}
