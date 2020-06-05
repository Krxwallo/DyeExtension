package com.justAm0dd3r.dye_extension.util;

import com.justAm0dd3r.dye_extension.util.registry_types.Blocks;
import com.justAm0dd3r.dye_extension.util.registry_types.Items;

public class RegistryHandler {
    public static void init() {
        Items.init();
        Blocks.init();
    }
}