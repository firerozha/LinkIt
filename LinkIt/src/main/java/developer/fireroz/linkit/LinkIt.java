package developer.fireroz.linkit;

import commands.*;
import events.SocialsJoin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class LinkIt extends JavaPlugin {

    @Override
    public void onEnable() {
        // Here I just define the variables i'm gonna use
        PluginManager pm = getServer().getPluginManager();


        // Here I make my config.yml
        getConfig().options().copyDefaults();
        saveDefaultConfig();


        // Here I register my events
        pm.registerEvents(new SocialsJoin(this), this);


        // here I register my commands
        getCommand("discord").setExecutor(new CommandDiscord(this));
        getCommand("forums").setExecutor(new CommandForums(this));
        getCommand("instagram").setExecutor(new CommandInstagram(this));
        getCommand("twitter").setExecutor(new CommandTwitter(this));
        getCommand("store").setExecutor(new CommandStore(this));
        getCommand("teamspeak").setExecutor(new CommandTeamSpeak(this));



    }
}
