package com.justAm0dd3r.dye_extension.util;

import javax.annotation.Nullable;

public class ArrayUtils {
    @Nullable
    public static Object getNullable(@Nullable Object[] array, int index) {
        return array != null ? array[index] : null;
    }
}
