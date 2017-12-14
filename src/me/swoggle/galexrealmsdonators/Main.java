package me.swoggle.galexrealmsdonators;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
        this.getCommand("dmenu").setExecutor(new CommandDMenu());
        loadconfig();


    }

    @Override
    public void onDisable() {


    }

    public void loadconfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}

