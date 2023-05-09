package com.toggski.pb.screen;

import com.toggski.pb.PaleontologyBeyond;
import com.toggski.pb.block.entity.custom.PlushieMakerBlockEntity;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, PaleontologyBeyond.MOD_ID);

    public static final RegistryObject<MenuType<DNAExtractorMenu>> DNA_EXTRACTOR_MENU =
            registerMenuType(DNAExtractorMenu::new, "dna_extractor_menu");

    public static final RegistryObject<MenuType<DNAIncubatorMenu>> DNA_INCUBATOR_MENU =
            registerMenuType(DNAIncubatorMenu::new, "dna_incubator_menu");

    public static final RegistryObject<MenuType<PlushieMakerMenu>> PLUSHIE_MAKER_MENU =
            registerMenuType(PlushieMakerMenu::new, "plushie_maker_menu");


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }




    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }

}
