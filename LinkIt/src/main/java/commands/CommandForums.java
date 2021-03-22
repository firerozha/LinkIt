package commands;

import developer.fireroz.linkit.LinkIt;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandForums implements CommandExecutor {

    private LinkIt plugin;

    public CommandForums(LinkIt pl) {
        plugin = pl;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!plugin.getConfig().getBoolean("forums-enabled")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("notenabled")));
        } else if(plugin.getConfig().getBoolean("forums-enabled") && sender.hasPermission("linkit.forums")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("forums-link")));

        }









        return true;
    }
}
