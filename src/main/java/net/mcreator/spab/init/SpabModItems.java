
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spab.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.spab.item.SpabBowItem;
import net.mcreator.spab.item.SaltyFishBladeItem;
import net.mcreator.spab.item.RedDimensionItem;
import net.mcreator.spab.item.RedArmorSummonerItem;
import net.mcreator.spab.item.RainBowGunItem;
import net.mcreator.spab.item.QuickKnifeItem;
import net.mcreator.spab.item.PonyMaBladeItem;
import net.mcreator.spab.item.MarchOfTheVolunteersItem;
import net.mcreator.spab.item.KillGodThunderItem;
import net.mcreator.spab.item.DragonDebrisItem;
import net.mcreator.spab.item.DragonBrickItem;
import net.mcreator.spab.item.ChineseSwordItem;
import net.mcreator.spab.item.ChineseShovelItem;
import net.mcreator.spab.item.ChinesePickaxeItem;
import net.mcreator.spab.item.ChineseItem;
import net.mcreator.spab.item.ChineseHoeItem;
import net.mcreator.spab.item.ChineseAxeItem;
import net.mcreator.spab.item.BulletItem;
import net.mcreator.spab.item.AuthorBilibiliAvatarItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpabModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item AUTHOR_BILIBILI_AVATAR = register(new AuthorBilibiliAvatarItem());
	public static final Item CHINESE_HELMET = register(new ChineseItem.Helmet());
	public static final Item CHINESE_CHESTPLATE = register(new ChineseItem.Chestplate());
	public static final Item CHINESE_LEGGINGS = register(new ChineseItem.Leggings());
	public static final Item CHINESE_BOOTS = register(new ChineseItem.Boots());
	public static final Item CHINESE_PICKAXE = register(new ChinesePickaxeItem());
	public static final Item CHINESE_SHOVEL = register(new ChineseShovelItem());
	public static final Item CHINESE_SWORD = register(new ChineseSwordItem());
	public static final Item CHINESE_HOE = register(new ChineseHoeItem());
	public static final Item CHINESE_AXE = register(new ChineseAxeItem());
	public static final Item RED_DIMENSION = register(new RedDimensionItem());
	public static final Item MARCH_OF_THE_VOLUNTEERS = register(new MarchOfTheVolunteersItem());
	public static final Item RAIN_BOW_GUN = register(new RainBowGunItem());
	public static final Item SALTY_FISH_BLADE = register(new SaltyFishBladeItem());
	public static final Item PONY_MA_BLADE = register(new PonyMaBladeItem());
	public static final Item QUICK_KNIFE = register(new QuickKnifeItem());
	public static final Item SPAB_BOW = register(new SpabBowItem());
	public static final Item KILL_GOD_THUNDER = register(new KillGodThunderItem());
	public static final Item RED_ARMOR_SUMMONER = register(new RedArmorSummonerItem());
	public static final Item DRAGON_DEBRIS = register(new DragonDebrisItem());
	public static final Item DRAGON_BRICK = register(new DragonBrickItem());
	public static final Item RED_STONE = register(SpabModBlocks.RED_STONE, SpabModTabs.TAB_SPAB);
	public static final Item RED_COBBLE_STONE = register(SpabModBlocks.RED_COBBLE_STONE, SpabModTabs.TAB_SPAB);
	public static final Item RED_OBSIDIAN = register(SpabModBlocks.RED_OBSIDIAN, SpabModTabs.TAB_SPAB);
	public static final Item DRAGON_BLOCK = register(SpabModBlocks.DRAGON_BLOCK, SpabModTabs.TAB_SPAB);
	public static final Item DRAGON_ORE = register(SpabModBlocks.DRAGON_ORE, SpabModTabs.TAB_SPAB);
	public static final Item RED_WOOD = register(SpabModBlocks.RED_WOOD, SpabModTabs.TAB_SPAB);
	public static final Item RED_PLANKS = register(SpabModBlocks.RED_PLANKS, SpabModTabs.TAB_SPAB);
	public static final Item RED_LOG = register(SpabModBlocks.RED_LOG, SpabModTabs.TAB_SPAB);
	public static final Item RED_LEAVES = register(SpabModBlocks.RED_LEAVES, SpabModTabs.TAB_SPAB);
	public static final Item SPAB_RECIPESTATION_BLOCK = register(SpabModBlocks.SPAB_RECIPESTATION_BLOCK, SpabModTabs.TAB_SPAB);
	public static final Item FACE_BOOK_BLOCK = register(SpabModBlocks.FACE_BOOK_BLOCK, SpabModTabs.TAB_SPAB);
	public static final Item HAN = register(SpabModBlocks.HAN, SpabModTabs.TAB_SPAB);
	public static final Item RED_STAIRS = register(SpabModBlocks.RED_STAIRS, SpabModTabs.TAB_SPAB);
	public static final Item RED_SLAB = register(SpabModBlocks.RED_SLAB, SpabModTabs.TAB_SPAB);
	public static final Item RED_FENCE = register(SpabModBlocks.RED_FENCE, SpabModTabs.TAB_SPAB);
	public static final Item RED_FENCE_GATE = register(SpabModBlocks.RED_FENCE_GATE, SpabModTabs.TAB_SPAB);
	public static final Item RED_PRESSURE_PLATE = register(SpabModBlocks.RED_PRESSURE_PLATE, SpabModTabs.TAB_SPAB);
	public static final Item RED_BUTTON = register(SpabModBlocks.RED_BUTTON, SpabModTabs.TAB_SPAB);
	public static final Item BULLET = register(new BulletItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
