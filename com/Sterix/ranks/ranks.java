package com.Sterix.ranks;
import com.Sterix.ranks.commands.ranksCommands;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;


public class ranks extends JavaPlugin {

    @Override
    public void onEnable() {
        ranksCommands commands = new ranksCommands();
         Objects.requireNonNull(getCommand("grole")).setExecutor(commands);
         Objects.requireNonNull(getCommand("drole")).setExecutor(commands);
         getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Server] - Rank plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Server] - Rank plugin is disabled!");
    }



}
