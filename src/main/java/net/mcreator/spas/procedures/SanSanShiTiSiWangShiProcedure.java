package net.mcreator.spas.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import net.mcreator.spas.SpasModElements;
import net.mcreator.spas.SpasMod;

import java.util.Map;

@SpasModElements.ModElement.Tag
public class SanSanShiTiSiWangShiProcedure extends SpasModElements.ModElement {
	public SanSanShiTiSiWangShiProcedure(SpasModElements instance) {
		super(instance, 62);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SpasMod.LOGGER.warn("Failed to load dependency world for procedure SanSanShiTiSiWangShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("<33> \u4F60\u53F7\u6CA1\u4E86!"), ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}