package co.bitquest.downer;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
/**
 * Created by cristian on 3/27/16.
 */
public class EventListener implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void playerLogin(PlayerLoginEvent event) {
        // Some code here
        String message="This server is under maintenance. Please come back later";
       event.disallow(PlayerLoginEvent.Result.KICK_OTHER, message);



        for (Player currentPlayer : Bukkit.getOnlinePlayers()) {
            currentPlayer.kickPlayer(message);
        }

        Bukkit.shutdown();
    }
    @EventHandler(priority = EventPriority.LOW)
    void onBlockBreak(BlockBreakEvent event) {
       event.setCancelled(true);
    }
    @EventHandler(priority = EventPriority.LOW)
    void onBlockPlace(BlockPlaceEvent event) {
        event.setCancelled(true);
    }
    @EventHandler(priority = EventPriority.LOW)
    public void onInventoryOpen(InventoryOpenEvent event)
    {
        event.setCancelled(true);
    }
    @EventHandler(priority = EventPriority.LOW)
    public void onInventoryInteract(InventoryInteractEvent event) {
	event.setCancelled(true);
}
}
