package com.justAm0dd3r.dye_extension.data_gen.textures;

import com.justAm0dd3r.dye_extension.reference.Reference;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;

public class DyedBlockTemplates extends HashMap<DyeColor, ResourceLocation>{
    public static final DyedBlockTemplates INSTANCE = new DyedBlockTemplates();
    public DyedBlockTemplates() {
        for (DyeColor color : DyeColor.values()) {
            put(color, new ResourceLocation(Reference.MOD_ID, "textures/templates/" + color.toString() + "_dye"));
        }
    }
}
