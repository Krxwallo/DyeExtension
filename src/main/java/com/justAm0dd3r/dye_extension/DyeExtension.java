package com.justAm0dd3r.dye_extension;

import com.justAm0dd3r.dye_extension.item_groups.DyeExtensionTab;
import com.justAm0dd3r.dye_extension.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DyeExtension.MOD_ID)
public class DyeExtension {

    public static final String MOD_ID = "dye_extension";
    private static final Logger LOGGER = LogManager.getLogger();

    public DyeExtension() {
        LOGGER.info("Started up DyeExtension v0.0.9");
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

    public static final DyeExtensionTab TAB = new DyeExtensionTab();
}
