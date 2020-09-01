package com.justAm0dd3r.dye_extension.data_gen;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.util.ReflectionUtil;
import com.justAm0dd3r.dye_extension.util.StringUtils;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Block;
import net.minecraft.data.*;
import net.minecraft.util.IItemProvider;

import javax.annotation.Nonnull;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(@Nonnull Consumer<IFinishedRecipe> consumer) {
        DyeExtension.LOGGER.debug("registerRecipes() called.");
        for (DataGenerationProperty property : DataGenerationProperties.getProperties()) {
            DyeExtension.LOGGER.debug("Adding a recipe for name: " + property.getDyedName() + ".");
            final RecipePattern pattern;
            final int count;
            switch (property.getType()) {
                case DataGenerationProperty.Type.BLOCK:
                    pattern = RecipePatterns.DYED_BLOCK;
                    count = 8;
                    break;
                case DataGenerationProperty.Type.STAIRS:
                    pattern = RecipePatterns.DYED_STAIRS;
                    count = 6;
                    break;
                case DataGenerationProperty.Type.SLAB:
                    pattern = RecipePatterns.DYED_SLAB;
                    count = 6;
                    break;
                case DataGenerationProperty.Type.BUTTON:
                    ShapelessRecipeBuilder
                            .shapelessRecipe(getByProperty(property))
                            .addIngredient(ReflectionUtil.requireBlockHolderByName(StringUtils.getDyedBaseName(property.getDyedName())).getBlock().get())
                            .addCriterion(property.getDyedName(), InventoryChangeTrigger.Instance.forItems(getByProperty(property)))
                            .setGroup(Reference.MOD_ID)
                            .build(consumer);
                    continue;
                default:
                    pattern = null;
                    count = 0; // Doesn't matter - will continue anyways...
            }
            if (pattern == null) {
                DyeExtension.LOGGER.warn("Pattern is null.");
                continue;
            }
            final ShapedRecipeBuilder shapedRecipeBuilder = ShapedRecipeBuilder.shapedRecipe(getByProperty(property), count);
            if (!pattern.isOnlyOneLine()) {
                shapedRecipeBuilder
                        .patternLine(pattern.getPattern1())
                        .patternLine(pattern.getPattern2())
                        .patternLine(pattern.getPattern3());
            }
            else {
                shapedRecipeBuilder.patternLine(pattern.getPattern1());
            }
            for (int x = 0; x < pattern.getRecipeIngredients().length; x++) {
                shapedRecipeBuilder.key(getKey(x), getByResult(property.getDyedName(), pattern.getRecipeIngredients()[x]));
            }
            shapedRecipeBuilder.addCriterion(property.getDyedName(),
                    InventoryChangeTrigger.Instance.forItems(getByProperty(property)))
                    .setGroup(Reference.MOD_ID)
                    .build(consumer);
        }
    }

    private Character getKey(int x) {
        if (x == 0) return RecipePatterns.RECIPE_PATTERN_KEY_1;
        else if (x == 1) return RecipePatterns.RECIPE_PATTERN_KEY_2;
        else throw new UnsupportedOperationException("unknown int x");
    }

    @SuppressWarnings("ConstantConditions")
    private Block getByProperty(DataGenerationProperty property) {
        switch (property.getType()) {
            case DataGenerationProperty.Type.STAIRS:
                return ReflectionUtil.requireDyedBlockHolderByName(property.getDyedName()).getBlockFromColor(property.getDyeColor()).getStairsBlock().get();
            case DataGenerationProperty.Type.SLAB:
                return ReflectionUtil.requireDyedBlockHolderByName(property.getDyedName()).getBlockFromColor(property.getDyeColor()).getSlabBlock().get();
            case DataGenerationProperty.Type.BUTTON:
                return ReflectionUtil.requireDyedBlockHolderByName(property.getDyedName()).getBlockFromColor(property.getDyeColor()).getButtonBlock().get();
            default:
                return ReflectionUtil.requireDyedBlockHolderByName(property.getDyedName()).getBlockFromColor(property.getDyeColor()).getBlock().get();
        }
    }

    private IItemProvider getByResult(String result, int ingredient) {
        switch (ingredient) {
            case RecipeIngredients.DYE:
                return ReflectionUtil.requireItemByName(StringUtils.getDye(result));
            case RecipeIngredients.DYED_BLOCK:
                return ReflectionUtil.requireDyedBlockByName(result);
            default:
                // Block
                return ReflectionUtil.getBlockByName(StringUtils.getBaseName(result));
        }
    }
}
