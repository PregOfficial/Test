package al.pregoffici.testplugin.listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

object PlayerJoinListener: Listener {
    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        println(event.player.name)
    }
}
