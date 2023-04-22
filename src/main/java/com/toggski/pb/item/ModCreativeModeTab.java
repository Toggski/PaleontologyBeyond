package com.toggski.pb.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab PB_TAB = new CreativeModeTab("pb_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMBER.get());
        }
    };

}
