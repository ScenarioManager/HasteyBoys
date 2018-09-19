package me.calebbassham.hastyboys

import me.calebbassham.scenariomanager.api.scenarioManager
import org.bukkit.plugin.java.JavaPlugin

class HastyBoysPlugin : JavaPlugin() {

    override fun onEnable() {
        scenarioManager?.registerScenario(HastyBoys(), this)
    }

}