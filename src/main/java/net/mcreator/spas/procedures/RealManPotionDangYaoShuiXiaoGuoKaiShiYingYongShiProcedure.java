package net.mcreator.spas.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.spas.SpasModElements;
import net.mcreator.spas.SpasMod;

import java.util.Map;
import java.util.Collection;

@SpasModElements.ModElement.Tag
public class RealManPotionDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure extends SpasModElements.ModElement {
	public RealManPotionDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure(SpasModElements instance) {
		super(instance, 35);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SpasMod.LOGGER.warn("Failed to load dependency entity for procedure RealManPotionDangYaoShuiXiaoGuoKaiShiYingYongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.SPEED)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity)) == 5)) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.allowFlying = (true);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		} else if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == Effects.SPEED)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity)) == 5)) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.allowFlying = (true);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
