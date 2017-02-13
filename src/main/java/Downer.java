package co.bitquest.downer;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by cristian on 1/29/16.
 */
public class Downer extends JavaPlugin {
    public boolean  pluginenabled;
    @Override
    public void onEnable() {
        pluginenabled = true;
        System.out.println("Downer started...");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        pluginenabled = false;
        System.out.println("Downer disabled...");
    }

}
