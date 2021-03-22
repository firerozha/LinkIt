package commands;

import developer.fireroz.linkit.LinkIt;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandTeamSpeak implements CommandExecutor {

    private LinkIt plugin;

    public CommandTeamSpeak(LinkIt pl) {
        plugin = pl;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!plugin.getConfig().getBoolean("teamspeak-enabled")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("notenabled")));
        } else if(plugin.getConfig().getBoolean("teamspeak-enabled") && sender.hasPermission("linkit.teamspeak")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("teamspeak-link")));

        }









        return true;
    }
}
