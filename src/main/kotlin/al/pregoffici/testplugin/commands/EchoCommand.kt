package al.pregoffici.testplugin.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object EchoCommand: CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        args?.joinToString(separator=" ")?.let { println(it) }
        return true;
    }
}
