package net.mcreator.spab.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.spab.init.SpabModItems;

public class RedArmorSummonerDangYouJianDianJiFangKuaiShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double a = 0;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(SpabModItems.RED_ARMOR_SUMMONER);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		while (a < 4) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
						(entity instanceof LivingEntity _entGetArmor
								? _entGetArmor.getItemBySlot(EquipmentSlot.byTypeAndIndex(EquipmentSlot.Type.ARMOR, (int) a))
								: ItemStack.EMPTY));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
			a = (double) (a + 1);
		}
		if (entity instanceof LivingEntity _entity) {
			if (_entity instanceof Player _player)
				_player.getInventory().armor.set(0, new ItemStack(SpabModItems.CHINESE_BOOTS));
			else
				_entity.setItemSlot(EquipmentSlot.FEET, new ItemStack(SpabModItems.CHINESE_BOOTS));
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
		if (entity instanceof LivingEntity _entity) {
			if (_entity instanceof Player _player)
				_player.getInventory().armor.set(1, new ItemStack(SpabModItems.CHINESE_LEGGINGS));
			else
				_entity.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SpabModItems.CHINESE_LEGGINGS));
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
		if (entity instanceof LivingEntity _entity) {
			if (_entity instanceof Player _player)
				_player.getInventory().armor.set(2, new ItemStack(SpabModItems.CHINESE_CHESTPLATE));
			else
				_entity.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SpabModItems.CHINESE_CHESTPLATE));
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
		if (entity instanceof LivingEntity _entity) {
			if (_entity instanceof Player _player)
				_player.getInventory().armor.set(3, new ItemStack(SpabModItems.CHINESE_HELMET));
			else
				_entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SpabModItems.CHINESE_HELMET));
			if (_entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.getInventory().setChanged();
		}
	}
}
