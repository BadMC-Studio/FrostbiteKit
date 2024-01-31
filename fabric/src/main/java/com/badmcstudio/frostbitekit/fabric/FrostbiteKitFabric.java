package com.badmcstudio.frostbitekit.fabric;

import com.badmcstudio.frostbitekit.FrostbiteKit;
import net.fabricmc.api.ModInitializer;

public class FrostbiteKitFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FrostbiteKit.init();
    }
}