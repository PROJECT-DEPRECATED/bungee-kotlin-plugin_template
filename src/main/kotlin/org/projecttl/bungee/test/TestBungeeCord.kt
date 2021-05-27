package org.projecttl.bungee.test

import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.plugin.Plugin
import org.projecttl.bungee.test.commands.TestCommand

class TestBungeeCord: Plugin() {

    override fun onEnable() {
        logger.info("${ChatColor.GREEN}Hello!")
        proxy.pluginManager.apply {
            registerCommand(this@TestBungeeCord, TestCommand("test"))
        }
    }

    override fun onDisable() {
        logger.info("${ChatColor.RED}Bye!")
    }
}