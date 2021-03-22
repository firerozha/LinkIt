package commands;

import developer.fireroz.linkit.LinkIt;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandDiscord implements CommandExecutor {

    private LinkIt plugin;

    public CommandDiscord(LinkIt pl) {
        plugin = pl;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!plugin.getConfig().getBoolean("discord-enabled")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("notenabled")));
        } else if(plugin.getConfig().getBoolean("discord-enabled") && sender.hasPermission("linkit.discord")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("discord-link")));

        }









        return true;
    }
}
