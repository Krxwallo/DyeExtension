package com.justAm0dd3r.dye_extension.tabs;

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
        String unformattedText = block.getNameTextComponent().getUnformattedComponentText();
        if (unformattedText.contains("stairs")) return DYED_STAIRS_TAB;
        else if(unformattedText.contains("slab")) return DYED_SLABS_TAB;
        else if(unformattedText.contains("button")) return DYED_BUTTONS_TAB;
        else {
            return DYED_BLOCKS_TAB;
        }
    }
}
