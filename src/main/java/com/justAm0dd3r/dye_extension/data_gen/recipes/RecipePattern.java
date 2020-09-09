package com.justAm0dd3r.dye_extension.data_gen.recipes;

public class RecipePattern {
    private final boolean onlyOneLine;
    private final String pattern1;
    private String pattern2 = "";
    private String pattern3 = "";
    private final int[] recipeIngredients;

    public RecipePattern(String pattern1, String pattern2, String pattern3, int... recipeIngredients) {
        this.pattern1 = pattern1;
        this.pattern2 = pattern2;
        this.pattern3 = pattern3;
        this.onlyOneLine = false;
        this.recipeIngredients = recipeIngredients;
    }

    public RecipePattern(String pattern1, int... recipeIngredients) {
        this.pattern1 = pattern1;
        this.onlyOneLine = true;
        this.recipeIngredients = recipeIngredients;
    }

    public String getPattern1() {
        return pattern1;
    }

    public String getPattern2() {
        return pattern2;
    }

    public String getPattern3() {
        return pattern3;
    }

    public boolean isOnlyOneLine() {
        return onlyOneLine;
    }

    public int[] getRecipeIngredients() {
        return recipeIngredients;
    }
}
