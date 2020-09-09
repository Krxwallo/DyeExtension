package com.justAm0dd3r.dye_extension.util;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.blocks.BlockHolder;
import com.justAm0dd3r.dye_extension.blocks.DyedBlockHolder;
import com.justAm0dd3r.dye_extension.items.ItemHolder;
import com.justAm0dd3r.dye_extension.registry.types.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

public class ReflectionUtils {
    @Nullable
    public static Block getBlockByName(String name) {
        try {
            return (Block) Blocks.class.getField(name.toUpperCase()).get(Blocks.class);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            DyeExtension.LOGGER.info("Exception while trying to get block from Blocks.class. " +
                    "Trying DefaultBlocks.class", e);
            try {
                return (Block) DefaultBlocks.class.getField(name.toUpperCase()).get(DefaultBlocks.class);
            } catch (IllegalAccessException | NoSuchFieldException e2) {
                DyeExtension.LOGGER.error("Exception while trying to get block from DefaultBlocks.class. ", e);
            }
            return null;
        }
    }

    @Nullable
    public static Item getItemByName(String name) {
        try {
            return (Item) Items.class.getField(name.toUpperCase()).get(Items.class);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            DyeExtension.LOGGER.warn("Exception while trying to get item from Items.class. " +
                    "Trying DefaultBlocks.class", e);
            try {
                return (Item) DefaultItems.class.getField(name.toUpperCase()).get(DefaultItems.class);
            } catch (IllegalAccessException | NoSuchFieldException e2) {
                DyeExtension.LOGGER.error("Exception while trying to get item from DefaultItems.class. ", e);
            }
            return null;
        }
    }

    @Nonnull
    public static Block requireBlockByName(String name) {
        try {
            return Objects.requireNonNull(getBlockByName(name));
        }
        catch (NullPointerException e) {
            DyeExtension.LOGGER.error("NullPointerException while trying to require block by name: " + name + ". | uppercase name: " + name.toUpperCase());
            throw e;
        }
    }

    @Nullable
    public static DyedBlockHolder getDyedBlockHolderByName(String name) {
        String fieldName = "";
        try {
            fieldName = "DYED_" + StringUtils.getBaseName(name).toUpperCase() + "_BLOCKS";
            return (DyedBlockHolder) ModBlocks.class.getField(fieldName).get(ModBlocks.class);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            DyeExtension.LOGGER.error("Exception while trying to get field with name: " + fieldName);
            return null;
        }
    }

    @Nonnull
    public static BlockHolder requireBlockHolderByName(String name) {
        return requireDyedBlockHolderByName(name).getBlockFromColor(DyeColor.valueOf(StringUtils.getDyeName(name).toUpperCase()));
    }

    @Nonnull
    public static DyedBlockHolder requireDyedBlockHolderByName(String name) {
        try {
            return Objects.requireNonNull(getDyedBlockHolderByName(name));
        }
        catch (NullPointerException e) {
            DyeExtension.LOGGER.error("NullPointerException while trying to require dyed block holder by name: " + name + ".");
            throw e;
        }
    }

    @Nonnull
    public static Block requireDyedBlockByName(String name) {
        return requireBlockHolderByName(name).getBlock().get();
    }

    @Nonnull
    public static Block requireCorrespondingDyedBlockByName(String name) {
        BlockHolder holder = requireBlockHolderByName(name);
        if (name.contains("stairs")) return holder.getStairsBlock().get();
        else if (name.contains("slab")) return holder.getSlabBlock().get();
        else if (name.contains("button")) return holder.getButtonBlock().get();
        else return holder.getBlock().get();
    }

    @Nonnull
    public static Item requireItemByName(String name) {
        try {
            return Objects.requireNonNull(getItemByName(name));
        }
        catch (NullPointerException e) {
            DyeExtension.LOGGER.error("NullPointerException while trying to require block by name: " + name + ". | uppercase name: " + name.toUpperCase());
            throw e;
        }
    }
}
