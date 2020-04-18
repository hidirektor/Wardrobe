package me.bronzzze.wardrobe;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;

public class MainEvent implements Listener {
   private final Main main;

   public MainEvent(Main main) {
      this.main = main;
   }

   @EventHandler
   public void onClick(InventoryClickEvent e) {
      Player p = (Player)e.getWhoClicked();
      if (e.getSlotType() == SlotType.ARMOR && !p.hasPermission("wardrobe.moveitems") && this.main.getConfig().getStringList("Worlds").contains(p.getWorld().getName())) {
         e.setCancelled(true);
      }

      if (e.getInventory().getName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("MainMenuName")))) {
         e.setCancelled(true);
         if (e.getCurrentItem() == null) {
            return;
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ArmourSelector.Name")))) {
            if (p.hasPermission("wardrobe.armourselector")) {
               p.closeInventory();
               this.main.armourGUI.openInventory(p);
            } else {
               p.closeInventory();
               p.sendMessage(ChatColor.DARK_RED + "No Permission!");
            }
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("HatSelector.Name")))) {
            if (p.hasPermission("wardrobe.hatselector")) {
               p.closeInventory();
               this.main.hatGUI.openInventory(p);
            } else {
               p.closeInventory();
               p.sendMessage(ChatColor.DARK_RED + "No Permission!");
            }
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ParticleMenu.Name")))) {
            if (p.hasPermission("wardrobe.particleselector")) {
               p.closeInventory();
               this.main.particleGUI.openInventory(p);
            } else {
               p.closeInventory();
               p.sendMessage(ChatColor.DARK_RED + "No Permission!");
            }
         }

         e.setCancelled(true);
         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("RemoveItem.Name")))) {
            this.main.removeGUI.openInventory(p);
         }
      }

   }
}
