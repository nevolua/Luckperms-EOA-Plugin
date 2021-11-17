package com.Sterix.ranks.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class ranksCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {return true;}
        Player player = (Player) sender;


        if (cmd.getName().equalsIgnoreCase("grole")) {
            if (player.hasPermission("grole")){
                if (args.length == 2) {
                    var user = args[0];
                    var role = args[1];

                    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

                    String command = "lp user " + user + " parent set " + role;

                    Bukkit.dispatchCommand(console, command);


                }
            }else {
                player.sendMessage("You don't have permission to use this command");
                return true;
            }
        }

        if (cmd.getName().equalsIgnoreCase("drole")) {
            if (player.hasPermission("drole")) {
                if (args.length == 2) {
                    var user = args[0];
                    var role = args[1];

                    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

                    String command = "lp user " + user + " parent remove " + role;

                    Bukkit.dispatchCommand(console, command);


                }
            }else {
                player.sendMessage("You don't have permission to use this command");
                return true;
            }
        }

        return true;
    }
}
