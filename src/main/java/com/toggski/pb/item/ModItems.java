package com.toggski.pb.item;

import com.toggski.pb.PaleontologyBeyond;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PaleontologyBeyond.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PB_TAB)));
    public static final RegistryObject<Item> CLEAN_AMBER = ITEMS.register("clean_amber", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PB_TAB)));
    public static final RegistryObject<Item> FOSSIL = ITEMS.register("fossil", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PB_TAB)));
    public static final RegistryObject<Item> FIBROUS_LEAVES = ITEMS.register("fibrous_leaves", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PB_TAB)));
    public static final RegistryObject<Item> ANKYLOSAURUS_DNA = ITEMS.register("ankylosaurus_dna", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PB_TAB)));
    public static final RegistryObject<Item> AMBER_CANE = ITEMS.register("amber_cane", () -> new SwordItem(ModTiers.AMBER, 3, -2.0f, new Item.Properties().tab(ModCreativeModeTab.PB_TAB)));
    public static final RegistryObject<Item> ANKYLOSAURUS_EGG = ITEMS.register("ankylosaurus_egg", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PB_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
