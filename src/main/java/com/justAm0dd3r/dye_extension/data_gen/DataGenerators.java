package com.justAm0dd3r.dye_extension.data_gen;

import com.justAm0dd3r.dye_extension.DyeExtension;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DyeExtension.LOGGER.debug("gatherData() called.");
        DataGenerator generator = event.getGenerator();

        // Recipes
        generator.addProvider(new Recipes(generator));
    }
}
