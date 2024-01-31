package com.badmcstudio.frostbitekit.forge;

import dev.architectury.platform.forge.EventBuses;
import com.badmcstudio.frostbitekit.FrostbiteKit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FrostbiteKit.MOD_ID)
public class FrostbiteKitForge {
    public FrostbiteKitForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(FrostbiteKit.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        FrostbiteKit.init();
    }
}