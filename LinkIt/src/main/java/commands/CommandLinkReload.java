package commands;

import developer.fireroz.linkit.LinkIt;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandLinkReload implements CommandExecutor {
    private LinkIt plugin;

    public CommandLinkReload(LinkIt pl) {
        plugin = pl;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("linkit.reload")) {
            sender.sendMessage("Plugin reloaded");
            plugin.reloadConfig();
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("noperm")));
        }





        return true;
    }
}
