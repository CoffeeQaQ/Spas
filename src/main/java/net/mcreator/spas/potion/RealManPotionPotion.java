
package net.mcreator.spas.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effect;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.spas.procedures.RealManPotionYaoShuiDaoQiShiProcedure;
import net.mcreator.spas.procedures.RealManPotionDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;
import net.mcreator.spas.SpasModElements;

import java.util.Map;
import java.util.HashMap;

@SpasModElements.ModElement.Tag
public class RealManPotionPotion extends SpasModElements.ModElement {
	@ObjectHolder("spas:real_man_potion")
	public static final Effect potion = null;
	@ObjectHolder("spas:real_man_potion")
	public static final Potion potionType = null;
	public RealManPotionPotion(SpasModElements instance) {
		super(instance, 37);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("real_man_potion");
		}
	}

	public static class EffectCustom extends Effect {
		private final ResourceLocation potionIcon;
		public EffectCustom() {
			super(EffectType.NEUTRAL, -154);
			setRegistryName("real_man_potion");
			potionIcon = new ResourceLocation("spas:textures/realman.png");
		}

		@Override
		public String getName() {
			return "effect.real_man_potion";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return true;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public void affectEntity(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				RealManPotionDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public void removeAttributesModifiersFromEntity(LivingEntity entity, AttributeModifierManager attributeMapIn, int amplifier) {
			super.removeAttributesModifiersFromEntity(entity, attributeMapIn, amplifier);
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				RealManPotionYaoShuiDaoQiShiProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
