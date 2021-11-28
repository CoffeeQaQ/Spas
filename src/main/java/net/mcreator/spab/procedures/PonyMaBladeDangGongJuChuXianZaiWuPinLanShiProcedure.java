package net.mcreator.spab.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.spab.init.SpabModEnchantments;

public class PonyMaBladeDangGongJuChuXianZaiWuPinLanShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(SpabModEnchantments.HARM,
				(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
			entity.hurt(DamageSource.GENERIC, (float) (5 + EnchantmentHelper.getItemEnchantmentLevel(SpabModEnchantments.HARM,
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) * 2));
		} else {
			entity.hurt(DamageSource.GENERIC, 1);
		}
	}
}
