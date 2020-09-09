package com.justAm0dd3r.dye_extension.data_gen.recipes;

public class RecipePatterns {
    public static final Character RECIPE_PATTERN_KEY_1 = 'a';
    public static final Character RECIPE_PATTERN_KEY_2 = 'b';
    public static final RecipePattern DYED_BLOCK = new RecipePattern("aaa", "aba", "aaa", RecipeIngredients.BLOCK, RecipeIngredients.DYE);
    public static final RecipePattern DYED_STAIRS = new RecipePattern("a  ", "aa ", "aaa", RecipeIngredients.DYED_BLOCK);
    public static final RecipePattern DYED_SLAB = new RecipePattern("aaa", RecipeIngredients.DYED_BLOCK);
}
