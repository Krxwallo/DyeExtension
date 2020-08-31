package com.justAm0dd3r.dye_extension.registry;

import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import com.justAm0dd3r.dye_extension.registry.types.ModItems;

public class Registries {
    public static void init() {
        ModItems.init();
        ModBlocks.init();
    }
}