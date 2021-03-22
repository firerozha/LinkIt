package commands;

import developer.fireroz.linkit.LinkIt;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandTwitter implements CommandExecutor {

    private LinkIt plugin;

    public CommandTwitter(LinkIt pl) {
        plugin = pl;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!plugin.getConfig().getBoolean("twitter-enabled")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("notenabled")));
        } else if(plugin.getConfig().getBoolean("twitter-enabled") && sender.hasPermission("linkit.twitter")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("twitter-link")));

        }









        return true;
    }
}
