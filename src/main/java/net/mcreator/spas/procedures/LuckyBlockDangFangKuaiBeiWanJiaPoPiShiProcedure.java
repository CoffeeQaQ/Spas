package net.mcreator.spas.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.spas.item.LuckyPickaxeItem;
import net.mcreator.spas.SpasModElements;
import net.mcreator.spas.SpasMod;

import java.util.Map;

@SpasModElements.ModElement.Tag
public class LuckyBlockDangFangKuaiBeiWanJiaPoPiShiProcedure extends SpasModElements.ModElement {
	public LuckyBlockDangFangKuaiBeiWanJiaPoPiShiProcedure(SpasModElements instance) {
		super(instance, 38);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SpasMod.LOGGER.warn("Failed to load dependency entity for procedure LuckyBlockDangFangKuaiBeiWanJiaPoPiShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SpasMod.LOGGER.warn("Failed to load dependency x for procedure LuckyBlockDangFangKuaiBeiWanJiaPoPiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SpasMod.LOGGER.warn("Failed to load dependency y for procedure LuckyBlockDangFangKuaiBeiWanJiaPoPiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SpasMod.LOGGER.warn("Failed to load dependency z for procedure LuckyBlockDangFangKuaiBeiWanJiaPoPiShi!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SpasMod.LOGGER.warn("Failed to load dependency world for procedure LuckyBlockDangFangKuaiBeiWanJiaPoPiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(LuckyPickaxeItem.block, (int) (1)).getItem()))) {
			if ((Math.random() < 0.25)) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 5), z, new ItemStack(Items.GOLDEN_APPLE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 5), z, new ItemStack(Items.GOLDEN_APPLE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 5), z, new ItemStack(Items.GOLDEN_APPLE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 5), z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 5), z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 5), z, new ItemStack(Items.GOLDEN_APPLE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 5), z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 5), z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((Math.random() < 0.25)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
			}
		} else if ((Math.random() < 0.25)) {
			if (world instanceof ServerWorld) {
				LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
				_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
				_ent.setEffectOnly(true);
				((World) world).addEntity(_ent);
			}
		}
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(LuckyPickaxeItem.block, (int) (1)).getItem())) {
			if ((Math.random() < 0.25)) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.NETHERITE_HELMET, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.NETHERITE_CHESTPLATE, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.NETHERITE_LEGGINGS, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.NETHERITE_BOOTS, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.NETHERITE_BLOCK, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.NETHERITE_BLOCK, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.NETHERITE_BLOCK, (int) (1)));
					entityToSpawn.setPickupDelay((int) 0);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
