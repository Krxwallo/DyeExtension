package com.justAm0dd3r.dye_extension;

import com.justAm0dd3r.dye_extension.filters.FiltersRebornManager;
import com.justAm0dd3r.dye_extension.reference.Reference;
import com.justAm0dd3r.dye_extension.registry.Registries;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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

        Registries.init();
        //TileEntityTypes.init();
        //ContainerTypes.init();

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        /*ScreenManager.registerFactory(ContainerTypes.DYED_FURNACE.get(), DyedFurnaceScreen::
                new);*/

        FiltersRebornManager.registerFiltersWhenLoaded();
    }
}
