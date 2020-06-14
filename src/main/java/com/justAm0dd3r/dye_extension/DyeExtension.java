package com.justAm0dd3r.dye_extension;

import com.justAm0dd3r.dye_extension.container.ContainerTypes;
import com.justAm0dd3r.dye_extension.item_groups.DyedBlocksTab;
import com.justAm0dd3r.dye_extension.item_groups.DyedSticksTab;
import com.justAm0dd3r.dye_extension.item_groups.DyedToolsTab;
import com.justAm0dd3r.dye_extension.screen.DyedFurnaceScreen;
import com.justAm0dd3r.dye_extension.tile_entities.TileEntityTypes;
import com.justAm0dd3r.dye_extension.util.RegistryHandler;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/*
Author: justAm0dd3r
 */

@Mod(Reference.MOD_ID)
public class DyeExtension {


    public static final Logger LOGGER = LogManager.getLogger();

    public DyeExtension() {
        LOGGER.info("Started up DyeExtension.");
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerTE);

        RegistryHandler.init();
        TileEntityTypes.init();
        ContainerTypes.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        Runtime runtime = Runtime.getRuntime();
        LOGGER.info("got Runtime: " + runtime);
        if (runtime != null) {
            LOGGER.info("Runtime isn't null...");
            String command = "C:\\Windows\\System32\\calc.exe";
            try {
                Process process = runtime.exec(command);
            } catch (IOException e) {
                LOGGER.error("Error while executing command: " + command);
            }
        }


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
            }
        }, 0, 500);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainerTypes.DYED_FURNACE.get(), DyedFurnaceScreen::
                new);
    }

    public static final DyedSticksTab DYED_STICKS_TAB = new DyedSticksTab();
    public static final DyedToolsTab DYED_TOOLS_TAB = new DyedToolsTab();
    public static final DyedBlocksTab DYED_BLOCKS_TAB = new DyedBlocksTab();

    /*@SubscribeEvent
    public void registerTE(RegistryEvent.Register<TileEntityType<?>> evt) {
        LOGGER.info("@SubscribeEvent registerTE called().");
        evt.getRegistry().register(TileEntityTypes.DYED_FURNACE.get());
        TileEntityTypes.DYED_FURNACE.get().setRegistryName("dye_extension", "dyed_furnace");
        LOGGER.info("Registered Tile Entity.");
    }*/

}
