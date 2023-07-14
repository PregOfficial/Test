package al.pregoffici.testplugin

import al.pregoffici.testplugin.commands.EchoCommand
import al.pregoffici.testplugin.listeners.PlayerJoinListener
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class TestPlugin : JavaPlugin() {
    companion object {
        var instance: TestPlugin? = null
            private set;
    }

    override fun onEnable() {
        super.onEnable()

        getCommand("echo")?.setExecutor(EchoCommand)

        Bukkit.getPluginManager().registerEvents(PlayerJoinListener, this);

        println("[TestPlugin] enabled")

        instance = this
    }
}
