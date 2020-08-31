package com.justAm0dd3r.dye_extension.util;

import com.justAm0dd3r.dye_extension.DyeExtension;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

public class ReflectionUtil {
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
}
