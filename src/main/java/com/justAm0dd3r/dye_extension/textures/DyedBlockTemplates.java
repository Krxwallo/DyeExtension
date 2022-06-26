package com.justAm0dd3r.dye_extension.textures;

import com.justAm0dd3r.dye_extension.reference.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;

import java.util.HashMap;

public class DyedBlockTemplates extends HashMap<DyeColor, ResourceLocation>{
    public static final DyedBlockTemplates INSTANCE = new DyedBlockTemplates();
    public DyedBlockTemplates() {
        for (DyeColor color : DyeColor.values()) {
            put(color, new ResourceLocation(Reference.MOD_ID, "textures/templates/" + color.toString() + "_dye"));
        }
    }
}
