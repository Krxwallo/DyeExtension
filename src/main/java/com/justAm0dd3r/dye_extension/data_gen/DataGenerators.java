package com.justAm0dd3r.dye_extension.data_gen;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.data_gen.blockstates.BlockStates;
import com.justAm0dd3r.dye_extension.data_gen.language.EnUsLanguage;
import com.justAm0dd3r.dye_extension.data_gen.loot_tables.LootTables;
import com.justAm0dd3r.dye_extension.data_gen.models.BlockModels;
import com.justAm0dd3r.dye_extension.data_gen.models.ItemModels;
import com.justAm0dd3r.dye_extension.data_gen.recipes.Recipes;
import com.justAm0dd3r.dye_extension.data_gen.textures.Textures;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

import java.io.IOException;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) throws IOException {
        DyeExtension.LOGGER.debug("gatherData() called.");
        DataGenerator generator = event.getGenerator();

        // Recipes
        generator.addProvider(new Recipes(generator));

        // Loot Tables
        generator.addProvider(new LootTables(generator));

        if (event.includeClient()) {
            // Textures
            generator.addProvider(new Textures());

            // Block Models
            generator.addProvider(new BlockModels(generator, event.getExistingFileHelper()));

            // Item Models
            generator.addProvider(new ItemModels(generator, event.getExistingFileHelper()));

            // Block States
            generator.addProvider(new BlockStates(generator, event.getExistingFileHelper()));

            // Language
            generator.addProvider(new EnUsLanguage(generator));
        }
    }
}
