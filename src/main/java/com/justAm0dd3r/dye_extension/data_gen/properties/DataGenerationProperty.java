package com.justAm0dd3r.dye_extension.data_gen.properties;

import com.justAm0dd3r.dye_extension.util.StringUtils;
import net.minecraft.item.DyeColor;

public class DataGenerationProperty {
    private final String dyedName;
    private final int type;
    private final String unDyedName;
    private final String dyeName;
    private final DyeColor dyeColor;

    public String getDyedName() {
        return dyedName;
    }

    public int getType() {
        return type;
    }

    public String getUnDyedName() {
        return unDyedName;
    }

    public String getDyeName() {
        return dyeName;
    }

    public DyeColor getDyeColor() {
        return dyeColor;
    }

    public static class Type {
        public static final int BLOCK = 0;
        public static final int STAIRS = 1;
        public static final int SLAB = 2;
        public static final int BUTTON = 3;
    }

    /**
     * @param dyedName the block name, e.g.
     * @param type the type, e.g. {@link Type#BLOCK}
     */
    public DataGenerationProperty(String dyedName, int type) {
        this.dyedName = dyedName;
        this.type = type;
        this.unDyedName = StringUtils.getWithoutDye(dyedName);
        this.dyeName = StringUtils.getDye(dyedName);
        if (dyedName.contains("light_gray")) this.dyeColor = DyeColor.LIGHT_GRAY;
        else if (dyedName.contains("light_blue")) this.dyeColor = DyeColor.LIGHT_BLUE;
        else this.dyeColor = DyeColor.valueOf(dyeName.split("_")[0].toUpperCase());
    }
}
