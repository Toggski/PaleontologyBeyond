package com.toggski.pb.world;

import com.toggski.pb.PaleontologyBeyond;
import com.toggski.pb.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PaleontologyBeyond.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

        ModOreGeneration.generateOres(event);
    }
}
