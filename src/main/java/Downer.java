package co.bitquest.downer;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by cristian on 1/29/16.
 */
public class Downer extends JavaPlugin {
    @Override
    public void onEnable() {
        // TODO Insert logic to be performed when the plugin is enabled
        System.out.println("Downer started...");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    }

}
