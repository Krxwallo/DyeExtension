package com.justAm0dd3r.dye_extension.util;

public class StringUtils {

    /**
     * Example: convert "red_andesite_stairs" to "andesite_stairs"
     */
    public static String getWithoutDye(String blockName) {
        return blockName.split("_", 2)[1].replace("blue_", "").replace("gray_", "");
    }

    /**
     * Example: convert "red_andesite_stairs" to "red_dye"
     */
    public static String getDye(String blockName) {
        return getDyeName(blockName).concat("_dye");
    }

    /**
     * Example: convert "red_andesite_stairs" to "red"
     */
    public static String getDyeName(String blockName) {
        if (blockName.contains("light_gray")) return "light_gray";
        if (blockName.contains("light_blue")) return "light_blue";
        return blockName.split("_")[0];
    }

    /**
     * Example: convert "red_andesite_stairs" to "andesite"
     */
    public static String getBaseName(String blockName) {
        return getWithoutDye(blockName)
                .replace("_stairs", "")
                .replace("_slab", "")
                .replace("_button", "");
    }

    /**
     * Example: convert "red_andesite_stairs" to "red_andesite"
     */
    public static String getDyedBaseName(String blockName) {
        return blockName
                .replace("_stairs", "")
                .replace("_slab", "")
                .replace("_button", "");
    }
}
