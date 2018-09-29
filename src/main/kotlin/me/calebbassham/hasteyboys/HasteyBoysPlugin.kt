package me.calebbassham.hasteyboys

import me.calebbassham.scenariomanager.api.scenarioManager
import org.bukkit.plugin.java.JavaPlugin

class HasteyBoysPlugin : JavaPlugin() {

    override fun onEnable() {
        scenarioManager.register(HasteyBoys(), this)
    }

}