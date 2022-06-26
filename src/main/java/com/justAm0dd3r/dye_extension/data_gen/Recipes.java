package com.justAm0dd3r.dye_extension.data_gen;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.util.ReflectionUtil;
import com.justAm0dd3r.dye_extension.util.StringUtils;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(@Nonnull Consumer<FinishedRecipe> consumer) {
        DyeExtension.LOGGER.debug("registerRecipes() called.");
        for (DataGenerationProperty property : DataGenerationProperties.getProperties()) {
            DyeExtension.LOGGER.debug("Adding a recipe for name: " + property.getDyedName() + ".");
            final RecipePattern pattern;
            final int count;
            switch (property.getType()) {
                case DataGenerationProperty.Type.BLOCK -> {
                    pattern = RecipePatterns.DYED_BLOCK;
                    count = 8;
                }
                case DataGenerationProperty.Type.STAIRS -> {
                    pattern = RecipePatterns.DYED_STAIRS;
                    count = 6;
                }
                case DataGenerationProperty.Type.SLAB -> {
                    pattern = RecipePatterns.DYED_SLAB;
                    count = 6;
                }
                case DataGenerationProperty.Type.BUTTON -> {
                    ShapelessRecipeBuilder
                            .shapeless(getByProperty(property))
                            .requires(ReflectionUtil.requireBlockHolderByName(StringUtils.getDyedBaseName(property.getDyedName())).getBlock().get())
                            .unlockedBy(property.getDyedName(), InventoryChangeTrigger.TriggerInstance.hasItems(getByProperty(property)))
                            .group(Reference.MOD_ID)
                            .save(consumer);
                    continue;
                }
                default -> {
                    pattern = null;
                    count = 0; // Doesn't matter - will continue anyways...
                }
            }
            if (pattern == null) {
                DyeExtension.LOGGER.warn("Pattern is null.");
                continue;
            }
            final ShapedRecipeBuilder shapedRecipeBuilder = ShapedRecipeBuilder.shaped(getByProperty(property), count);
            if (!pattern.isOnlyOneLine()) {
                shapedRecipeBuilder
                        .pattern(pattern.getPattern1())
                        .pattern(pattern.getPattern2())
                        .pattern(pattern.getPattern3());
            }
            else {
                shapedRecipeBuilder.pattern(pattern.getPattern1());
            }
            for (int x = 0; x < pattern.getRecipeIngredients().length; x++) {
                shapedRecipeBuilder.define(getKey(x), getByResult(property.getDyedName(), pattern.getRecipeIngredients()[x]));
            }
            shapedRecipeBuilder.unlockedBy(property.getDyedName(),
                    InventoryChangeTrigger.TriggerInstance.hasItems(getByProperty(property)))
                    .group(Reference.MOD_ID)
                    .save(consumer);
        }
    }

    private Character getKey(int x) {
        if (x == 0) return RecipePatterns.RECIPE_PATTERN_KEY_1;
        else if (x == 1) return RecipePatterns.RECIPE_PATTERN_KEY_2;
        else throw new UnsupportedOperationException("unknown int x");
    }

    @SuppressWarnings("ConstantConditions")
    private Block getByProperty(DataGenerationProperty property) {
        return switch (property.getType()) {
            case DataGenerationProperty.Type.STAIRS -> ReflectionUtil.requireDyedBlockHolderByName(property.getDyedName()).getBlockFromColor(property.getDyeColor()).getStairsBlock().get();
            case DataGenerationProperty.Type.SLAB -> ReflectionUtil.requireDyedBlockHolderByName(property.getDyedName()).getBlockFromColor(property.getDyeColor()).getSlabBlock().get();
            case DataGenerationProperty.Type.BUTTON -> ReflectionUtil.requireDyedBlockHolderByName(property.getDyedName()).getBlockFromColor(property.getDyeColor()).getButtonBlock().get();
            default -> ReflectionUtil.requireDyedBlockHolderByName(property.getDyedName()).getBlockFromColor(property.getDyeColor()).getBlock().get();
        };
    }

    private ItemLike getByResult(String result, int ingredient) {
        return switch (ingredient) {
            case RecipeIngredients.DYE -> ReflectionUtil.requireItemByName(StringUtils.getDye(result));
            case RecipeIngredients.DYED_BLOCK -> ReflectionUtil.requireDyedBlockByName(result);
            default ->
                    // Block
                    ReflectionUtil.getBlockByName(StringUtils.getBaseName(result));
        };
    }
}
