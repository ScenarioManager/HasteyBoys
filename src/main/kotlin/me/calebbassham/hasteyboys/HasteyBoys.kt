package me.calebbassham.hasteyboys

import me.calebbassham.scenariomanager.api.*
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.PrepareItemCraftEvent

class HasteyBoys : SimpleScenario(), Listener {

    private val tools = arrayOf(Material.WOOD_PICKAXE, Material.STONE_PICKAXE, Material.IRON_PICKAXE, Material.GOLD_PICKAXE, Material.DIAMOND_PICKAXE,
            Material.WOOD_SPADE, Material.STONE_SPADE, Material.IRON_SPADE, Material.GOLD_SPADE, Material.DIAMOND_SPADE,
            Material.WOOD_AXE, Material.STONE_AXE, Material.IRON_AXE, Material.GOLD_AXE, Material.DIAMOND_AXE)

    @EventHandler
    fun onCraftPrepare(e: PrepareItemCraftEvent) {
        val player = e.viewers.firstOrNull() as? Player ?: return
        val world = player.world

        if (!scenarioManager.gamePlayerProvider.isGamePlayer(player)) return
        if (!scenarioManager.gameWorldProvider.isGameWorld(world)) return

        val result = e.recipe?.result ?: return

        if (!tools.contains(result.type)) return

        val meta = e.inventory.result.itemMeta
        meta.addEnchant(Enchantment.DIG_SPEED, 3, false)
        e.inventory.result.itemMeta = meta
    }

}