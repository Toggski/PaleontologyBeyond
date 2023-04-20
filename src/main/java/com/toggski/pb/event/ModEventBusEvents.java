package com.toggski.pb.event;

import com.toggski.pb.PaleontologyBeyond;
import com.toggski.pb.event.loot.FibrousLeavesFromLeavesAdditionModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = PaleontologyBeyond.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new FibrousLeavesFromLeavesAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(PaleontologyBeyond.MOD_ID,"fibrous_leaves_from_leaves"))
        );
    }
}
