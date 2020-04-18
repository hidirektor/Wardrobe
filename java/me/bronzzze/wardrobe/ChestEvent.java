package me.bronzzze.wardrobe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ChestEvent implements Listener {
   private final Main main;

   public ChestEvent(Main main) {
      this.main = main;
   }

   @EventHandler
   public void onPlayerInteract(PlayerInteractEvent e) {
      Player p = e.getPlayer();
      World w = p.getWorld();
      if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
         ItemStack hand = p.getItemInHand();
         ItemStack chest = new ItemStack(Material.CHEST);
         ItemMeta chestm = chest.getItemMeta();
         chestm.setDisplayName(ChatColor.GOLD + "Dolap");
         chest.setItemMeta(chestm);
         if (hand != null && hand.hasItemMeta() && hand.getItemMeta().equals(chestm)) {
            if (!this.main.getConfig().getStringList("Worlds").contains(w.getName())) {
               p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.main.getConfig().getString("Chest Message on disabled world")));
            } else {
               if (this.main.getConfig().getBoolean("Main Menu Message")) {
                  p.sendMessage(this.main.prefix + ChatColor.translateAlternateColorCodes('&', this.main.getConfig().getString("Message when you open Main Menu")));
               }

               this.main.mainGUI.openInventory(p);
               e.setCancelled(true);
            }
         }
      }

   }
}
