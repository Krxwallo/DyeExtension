package com.justAm0dd3r.dye_extension.data_gen;

import com.justAm0dd3r.dye_extension.DyeExtension;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(@Nonnull Consumer<IFinishedRecipe> consumer) {
        DyeExtension.LOGGER.debug("registerRecipes() called.");
        ShapedRecipeBuilder.shapedRecipe(Blocks.DIAMOND_BLOCK, 64)
                .patternLine("XXX")
                .patternLine("XXX")
                .patternLine("XXX")
                .key('X', Blocks.DIRT)
                .setGroup("")
                .addCriterion("has_dirt", hasItem(Blocks.DIRT))
                .build(consumer);
    }
}
