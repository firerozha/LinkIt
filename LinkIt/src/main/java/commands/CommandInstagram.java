package commands;

import developer.fireroz.linkit.LinkIt;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandInstagram implements CommandExecutor {

    private LinkIt plugin;

    public CommandInstagram(LinkIt pl) {
        plugin = pl;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!plugin.getConfig().getBoolean("instagram-enabled")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("notenabled")));
        } else if(plugin.getConfig().getBoolean("instagram-enabled") && sender.hasPermission("linkit.instagram")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("instagram-link")));

        }









        return true;
    }
}
