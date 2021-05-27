package org.projecttl.bungee.test.commands

import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.api.plugin.Command

class TestCommand(name: String?): Command(name) {

    override fun execute(sender: CommandSender?, args: Array<out String>?) {
        when (args?.size) {
            0 -> {
                sender?.sendMessage(TextComponent("${ChatColor.GREEN}TEST!"))
            }
        }
    }
}