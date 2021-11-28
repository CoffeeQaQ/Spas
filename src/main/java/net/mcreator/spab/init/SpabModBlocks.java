
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spab.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.spab.block.SpabRecipestationBlockBlock;
import net.mcreator.spab.block.RedWoodBlock;
import net.mcreator.spab.block.RedStoneBlock;
import net.mcreator.spab.block.RedStairsBlock;
import net.mcreator.spab.block.RedSlabBlock;
import net.mcreator.spab.block.RedPressurePlateBlock;
import net.mcreator.spab.block.RedPlanksBlock;
import net.mcreator.spab.block.RedObsidianBlock;
import net.mcreator.spab.block.RedLogBlock;
import net.mcreator.spab.block.RedLeavesBlock;
import net.mcreator.spab.block.RedFenceGateBlock;
import net.mcreator.spab.block.RedFenceBlock;
import net.mcreator.spab.block.RedDimensionPortalBlock;
import net.mcreator.spab.block.RedCobbleStoneBlock;
import net.mcreator.spab.block.RedButtonBlock;
import net.mcreator.spab.block.HanBlock;
import net.mcreator.spab.block.FaceBookBlockBlock;
import net.mcreator.spab.block.DragonOreBlock;
import net.mcreator.spab.block.DragonBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpabModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block RED_DIMENSION_PORTAL = register(new RedDimensionPortalBlock());
	public static final Block RED_STONE = register(new RedStoneBlock());
	public static final Block RED_COBBLE_STONE = register(new RedCobbleStoneBlock());
	public static final Block RED_OBSIDIAN = register(new RedObsidianBlock());
	public static final Block DRAGON_BLOCK = register(new DragonBlockBlock());
	public static final Block DRAGON_ORE = register(new DragonOreBlock());
	public static final Block RED_WOOD = register(new RedWoodBlock());
	public static final Block RED_PLANKS = register(new RedPlanksBlock());
	public static final Block RED_LOG = register(new RedLogBlock());
	public static final Block RED_LEAVES = register(new RedLeavesBlock());
	public static final Block SPAB_RECIPESTATION_BLOCK = register(new SpabRecipestationBlockBlock());
	public static final Block FACE_BOOK_BLOCK = register(new FaceBookBlockBlock());
	public static final Block HAN = register(new HanBlock());
	public static final Block RED_STAIRS = register(new RedStairsBlock());
	public static final Block RED_SLAB = register(new RedSlabBlock());
	public static final Block RED_FENCE = register(new RedFenceBlock());
	public static final Block RED_FENCE_GATE = register(new RedFenceGateBlock());
	public static final Block RED_PRESSURE_PLATE = register(new RedPressurePlateBlock());
	public static final Block RED_BUTTON = register(new RedButtonBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RedObsidianBlock.registerRenderLayer();
		}
	}
}
