package events;

import developer.fireroz.linkit.LinkIt;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SocialsJoin implements Listener {

    private LinkIt plugin;

    public SocialsJoin(LinkIt pl) {
        plugin = pl;
    }

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String message = plugin.getConfig().getString("joinmessage");
        message = message.replace("%discord%", plugin.getConfig().getString("discord-link"));
        message = message.replace("%store%", plugin.getConfig().getString("store-link"));
        message = message.replace("%teamspeak%", plugin.getConfig().getString("teamspeak-link"));
        message = message.replace("%twitter%", plugin.getConfig().getString("twitter-link"));
        message = message.replace("%instagram%", plugin.getConfig().getString("instagram-link"));
        message = message.replace("%forums%", plugin.getConfig().getString("forums-link"));
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }
}
