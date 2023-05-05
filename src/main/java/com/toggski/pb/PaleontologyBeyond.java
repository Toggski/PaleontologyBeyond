package com.toggski.pb;

import com.mojang.logging.LogUtils;
import com.toggski.pb.block.ModBlocks;
import com.toggski.pb.block.entity.ModBlockEntities;
import com.toggski.pb.item.ModItems;
import com.toggski.pb.screen.DNAExtractorScreen;
import com.toggski.pb.screen.ModMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(PaleontologyBeyond.MOD_ID)
public class PaleontologyBeyond
{

    public static final String MOD_ID = "pb";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PaleontologyBeyond()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void clientSetup(final FMLClientSetupEvent event) {

        MenuScreens.register(ModMenuTypes.DNA_EXTRACTOR_MENU.get(), DNAExtractorScreen::new);

    }

    private void setup(final FMLCommonSetupEvent event) {

        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PLUSHIE_MAKER.get(), RenderType.translucent());
    }
}
