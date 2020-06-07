package com.justAm0dd3r.dye_extension.items;

import com.justAm0dd3r.dye_extension.DyeExtension;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Properties().group(DyeExtension.TAB));
        ResourceLocation myTagId = new ResourceLocation("mymod", "myitemgroup");
        ItemTags.getCollection().get(myTagId);

    }
}
