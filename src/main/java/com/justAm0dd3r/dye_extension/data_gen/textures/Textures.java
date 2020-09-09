package com.justAm0dd3r.dye_extension.data_gen.textures;

import com.justAm0dd3r.dye_extension.DyeExtension;
import com.justAm0dd3r.dye_extension.data_gen.properties.DataGenerationProperties;
import com.justAm0dd3r.dye_extension.data_gen.properties.DataGenerationProperty;
import com.justAm0dd3r.dye_extension.data_gen.HardCodedData;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.util.StringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.RasterOp;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;

public class Textures extends TextureProvider<File> {
    public Textures() {
        super(Reference.MOD_ID);
    }

    @Override
    protected void registerTextures() throws IOException {
        // TODO
        DyeExtension.LOGGER.debug("registerTextures() called on DyeExtension TextureProvider");
        for (DataGenerationProperty property : DataGenerationProperties.getProperties()) {

            String baseName = StringUtils.getBaseName(property.getDyedName());
            File output = genLoc("blocks/" + property.getDyeColor().name().toLowerCase() + "_" + baseName);
            ImageIO.write(createDyedImage(baseName, property.getDyeName()), "png", output);

            this.textures.add(output);
        }
    }

    /**
     * Create a simple dyed image, e.g. for red andesite.
     * Thirst create a new "buffered image" (16x16) which contains nothing. Then draw the fully opaque minecraft block texture,
     * e.g. [...]/andesite.png. After that draw the (almost) half transparent "dye block" (dye mask) over it. This should result
     * in a nice e.g. red andesite block texture.
     * @param baseName e.g. "andesite"
     * @param dyeName  e.g. "red_dye"
     * @return the created image e.g. "red_andesite.png"
     */
    private BufferedImage createDyedImage(String baseName, String dyeName) throws IOException {
        // Create image
        BufferedImage image = new BufferedImage(TEXTURE_WIDTH, TEXTURE_HEIGHT, BufferedImage.TYPE_INT_ARGB);

        
        // Get the graphics
        final Graphics2D graphics = image.createGraphics();

        // Draw the block image
        if (baseName.equals("leaves")) baseName = "oak_leaves";
        else if (baseName.equals("planks")) baseName = "oak_planks";
        File blockFile = new File(HardCodedData.MINECRAFT_ASSETS + "/textures/block/" + baseName + ".png");
        DyeExtension.LOGGER.debug("Block File Path: " + blockFile.getPath());
        final BufferedImage bufferedImage = ImageIO.read(blockFile);
        graphics.drawImage(bufferedImage, 0, 0, null);

        // Draw the transparent dye image
        graphics.drawImage(ImageIO.read(modLoc("templates/" + dyeName)), 0, 0, null);

        // Return the fully created image
        return image;
    }

    private Raster transform(Image img, float alpha) {
        BufferedImage bi = new BufferedImage(TEXTURE_WIDTH, TEXTURE_HEIGHT, BufferedImage.TYPE_INT_ARGB);
        bi.getGraphics().drawImage(img, 0, 0, null);
        RasterOp rop = new RescaleOp(new float[] { 1.0f, 1.0f, 1.0f, alpha }, new float[] { 0.0f, 0.0f, 0.0f, 0.0f }, null);
        Raster result;
        result = rop.filter(bi.getData(), null);
        return result;
    }
}
