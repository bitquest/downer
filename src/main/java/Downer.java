package co.bitquest.downer;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by cristian on 1/29/16.
 */
public class Downer extends JavaPlugin {
    @Override
    public void onEnable() {
        Boolean pluginenabled = true;
        System.out.println("Downer started...");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        Boolean pluginenabled = false;
    }

}
