package ru.lion;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main plugin;
    public static Main instance() {
        return plugin;
    }

    public void onEnabled() {
        plugin = this;

        Bukkit.getPluginManager().registerEvents(new GUI(), arg1);
    }
}
