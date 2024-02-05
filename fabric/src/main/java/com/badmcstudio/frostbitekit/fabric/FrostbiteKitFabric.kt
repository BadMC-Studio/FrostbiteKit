package com.badmcstudio.frostbitekit.fabric

import com.badmcstudio.frostbitekit.FrostbiteKit
import net.fabricmc.api.ModInitializer


class FrostbiteKitFabric : ModInitializer {
    override fun onInitialize() {
        FrostbiteKit.init()
    }
}