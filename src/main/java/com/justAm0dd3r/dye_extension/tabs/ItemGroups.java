package com.justAm0dd3r.dye_extension.tabs;

import com.justAm0dd3r.dye_extension.DyeExtension;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

public class ItemGroups {
    // Tabs
    public static final DyedSticksTab DYED_STICKS_TAB = new DyedSticksTab();
    public static final DyedToolsTab DYED_TOOLS_TAB = new DyedToolsTab();
    public static final DyedBlocksTab DYED_BLOCKS_TAB = new DyedBlocksTab();
    public static final DyedStairsTab DYED_STAIRS_TAB = new DyedStairsTab();
    public static final DyedSlabsTab DYED_SLABS_TAB = new DyedSlabsTab();
    public static final DyedButtonsTab DYED_BUTTONS_TAB = new DyedButtonsTab();

    public static ItemGroup getFromBlock(Block block) {
        DyeExtension.LOGGER.debug("ItemGroups.getFromBlock");
        String text = block.getTranslationKey();
        DyeExtension.LOGGER.debug("unformatted Text: " + text);
        if (text.contains("stairs")) {
            DyeExtension.LOGGER.debug("Stairs Tab");
            return DYED_STAIRS_TAB;
        } else if(text.contains("slab")) {
            DyeExtension.LOGGER.debug("Slab Tab");
            return DYED_SLABS_TAB;
        } else if(text.contains("button")) {
            DyeExtension.LOGGER.debug("Buttons Tab");
            return DYED_BUTTONS_TAB;
        } else {
            DyeExtension.LOGGER.debug("Blocks Tab");
            return DYED_BLOCKS_TAB;
        }
    }
}
