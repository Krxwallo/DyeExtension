package com.justAm0dd3r.dye_extension.textures;

import com.justAm0dd3r.dye_extension.DyeExtension;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Only works in a development environment.
 */
public abstract class TextureProvider<T extends File> implements IDataProvider {
    /** Get's filled by subclass */
    protected final List<T> textures = new ArrayList<>();
    private final String modId;
    protected static final String GENERATED_FOLDER = "generated";
    protected static final int TEXTURE_WIDTH = 16, TEXTURE_HEIGHT = 16;

    protected TextureProvider(String modId) {
        this.modId = modId;
    }

    protected abstract void registerTextures() throws IOException;

    @Override
    public void act(@Nonnull DirectoryCache cache) throws IOException{
        clear();
        registerTextures();
        generateAll();
    }

    private void generateAll() throws IOException{
        for (File file : this.textures) {
            final boolean created = file.createNewFile();
            if (created) DyeExtension.LOGGER.warn("File with path " + file.getPath() + " was not created.");
        }
    }

    private void clear() {
        textures.clear();
    }

    @Nonnull
    @Override
    public String getName() {
        return "DyeExtension TextureProvider";
    }

    /**
     * @param name e.g. "templates/red_dye" gives you a file with the location:
     *            <code>"[...]/src/main/resources/main/assets/MODID/textures/templates/red_dye.png"</code>
     */
    protected File modLoc(String name) {
        return new File(getResourceDirectory() + "/assets/" + modId + "/textures/" + name + ".png");
    }

    /**
     * @param name e.g. "templates/red_dye" gives you a file with the location:
     *            <code>"[...]/src/GENERATED_FOLDER/resources/main/assets/MODID/textures/templates/red_dye.png"</code>
     */
    protected File genLoc(String name) {
        return new File(getGenResourceDirectory() + "/assets/" + modId + "/textures/" + name + ".png");
    }

    private String getResourceDirectory() {
        return Objects.requireNonNull(getClass().getClassLoader().getResource(""))
                .getPath().replace("/build/classes/java/main", "").concat("src/main/resources");
    }

    private String getGenResourceDirectory() {
        return Objects.requireNonNull(getClass().getClassLoader().getResource(""))
                .getPath().replace("\\", "/").replace("/build/classes/java/main", "").concat("src/" + GENERATED_FOLDER + "/resources");
    }
}
