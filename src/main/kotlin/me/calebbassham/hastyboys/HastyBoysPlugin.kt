package me.calebbassham.hastyboys

import me.calebbassham.scenariomanager.plugin.ScenarioManagerPlugin
import org.bukkit.plugin.java.JavaPlugin

class HastyBoysPlugin : JavaPlugin() {

    override fun onEnable() {
        ScenarioManagerPlugin.scenarioManager?.registerScenario(HastyBoys(this))
    }

}