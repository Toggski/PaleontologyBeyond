package com.toggski.pb.block;

import com.toggski.pb.PaleontologyBeyond;
import com.toggski.pb.item.ModCreativeModeTab;
import com.toggski.pb.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PaleontologyBeyond.MOD_ID);


    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f,3.0f).requiresCorrectToolForDrops()), ModCreativeModeTab.PB_TAB);
    public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.0f, 3.0f).requiresCorrectToolForDrops()), ModCreativeModeTab.PB_TAB);
    public static final RegistryObject<Block> FOSSIL_ORE = registerBlock("fossil_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5f,3.0f).requiresCorrectToolForDrops()), ModCreativeModeTab.PB_TAB);
    public static final RegistryObject<Block> BUNDLE_OF_FIBROUS_LEAVES = registerBlock("bundle_of_fibrous_leaves", () -> new Block(BlockBehaviour.Properties.of(Material.MOSS).strength(4.5f,3.0f).requiresCorrectToolForDrops()), ModCreativeModeTab.PB_TAB);
    public static final RegistryObject<Block> CUBE_OF_RAW_MEAT = registerBlock("cube_of_raw_meat", () -> new Block(BlockBehaviour.Properties.of(Material.MOSS).strength(4.5f,3.0f).requiresCorrectToolForDrops()), ModCreativeModeTab.PB_TAB);
    public static final RegistryObject<Block> TROUGH = registerBlock("trough", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5f,3.0f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.PB_TAB);
    public static final RegistryObject<Block> STEGOSAURUS_PLUSHIE = registerBlock("stegosaurus_plushie", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).strength(0.8F).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.PB_TAB);
    public static final RegistryObject<Block> PALEONTOLOGISTS_WORKBENCH = registerBlock("paleontologists_workbench", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)), ModCreativeModeTab.PB_TAB);
    public static final RegistryObject<Block> DNA_INCUBATOR = registerBlock("dna_incubator", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).strength(2.5F).sound(SoundType.GLASS)), ModCreativeModeTab.PB_TAB);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
