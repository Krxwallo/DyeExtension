package com.justAm0dd3r.dye_extension;

import com.justAm0dd3r.dye_extension.container.ContainerTypes;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.registry.Registries;
import com.justAm0dd3r.dye_extension.screen.DyedFurnaceScreen;
import com.justAm0dd3r.dye_extension.tile_entities.TileEntityTypes;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Author: justAm0dd3r
 */
@Mod(Reference.MOD_ID)
public class DyeExtension {

    public static final Logger LOGGER = LogManager.getLogger();

    public DyeExtension() {
        LOGGER.info(Reference.NAME + " Version " + Reference.VERSION + " by " + Reference.AUTHOR + " started up.");

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        Registries.init();
        TileEntityTypes.init();
        ContainerTypes.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}
    private void doClientStuff(final FMLClientSetupEvent event) {}

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainerTypes.DYED_FURNACE.get(), DyedFurnaceScreen::
                new);
    }

    /*@SubscribeEvent
    public void registerTE(RegistryEvent.Register<TileEntityType<?>> evt) {
        LOGGER.info("@SubscribeEvent registerTE called().");
        evt.getRegistry().register(TileEntityTypes.DYED_FURNACE.get());
        TileEntityTypes.DYED_FURNACE.get().setRegistryName("dye_extension", "dyed_furnace");
        LOGGER.info("Registered Tile Entity.");
    }*/

}
