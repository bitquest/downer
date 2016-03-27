package co.bitquest.downer;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerLoginEvent;
/**
 * Created by cristian on 3/27/16.
 */
public class EventListener implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void playerLogin(PlayerLoginEvent event) {
        // Some code here
       // event.disallow(PlayerLoginEvent.Result.KICK_OTHER, "This server is under maintenance. Please come back later");
    }
    @EventHandler(priority = EventPriority.LOW)
    void onBlockBreak(BlockBreakEvent event) {
       event.setCancelled(true);
    }
    @EventHandler(priority = EventPriority.LOW)
    void onBlockPlace(BlockPlaceEvent event) {
        event.setCancelled(true);
    }

}
