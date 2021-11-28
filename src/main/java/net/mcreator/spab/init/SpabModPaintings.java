
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spab.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpabModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(194, 170).setRegistryName("pony_ma"));
		event.getRegistry().register(new Motive(186, 170).setRegistryName("soviet_flag"));
	}
}
