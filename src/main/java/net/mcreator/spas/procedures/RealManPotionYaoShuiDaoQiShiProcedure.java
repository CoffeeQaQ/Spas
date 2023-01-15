package net.mcreator.spas.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.EntityType;

import net.mcreator.spas.SpasModElements;
import net.mcreator.spas.SpasMod;

import java.util.Map;

@SpasModElements.ModElement.Tag
public class RealManPotionYaoShuiDaoQiShiProcedure extends SpasModElements.ModElement {
	public RealManPotionYaoShuiDaoQiShiProcedure(SpasModElements instance) {
		super(instance, 36);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SpasMod.LOGGER.warn("Failed to load dependency x for procedure RealManPotionYaoShuiDaoQiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SpasMod.LOGGER.warn("Failed to load dependency y for procedure RealManPotionYaoShuiDaoQiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SpasMod.LOGGER.warn("Failed to load dependency z for procedure RealManPotionYaoShuiDaoQiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SpasMod.LOGGER.warn("Failed to load dependency world for procedure RealManPotionYaoShuiDaoQiShi!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
		}
		if (world instanceof ServerWorld) {
			LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
			_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
			_ent.setEffectOnly(true);
			((World) world).addEntity(_ent);
		}
	}
}
