package com.justAm0dd3r.dye_extension.data_gen;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.blockstates.BlockStates;
import com.justAm0dd3r.dye_extension.loot_tables.LootTables;
import com.justAm0dd3r.dye_extension.models.BlockModels;
import com.justAm0dd3r.dye_extension.models.ItemModels;
import com.justAm0dd3r.dye_extension.textures.Textures;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DyeExtension.LOGGER.debug("gatherData() called.");
        DataGenerator generator = event.getGenerator();
        // Recipes
        generator.addProvider(new Recipes(generator));

        // Loot Tables
        generator.addProvider(new LootTables(generator));

        if (event.includeClient()) {
            // Block Models
            generator.addProvider(new BlockModels(generator, event.getExistingFileHelper()));

            // Item Models
            generator.addProvider(new ItemModels(generator, event.getExistingFileHelper()));

            // Block States
            generator.addProvider(new BlockStates(generator, event.getExistingFileHelper()));

            // Textures
            generator.addProvider(new Textures());
        }
    }
}
