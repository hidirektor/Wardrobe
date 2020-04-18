package me.bronzzze.wardrobe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class RemoveEvent implements Listener {
   private final Main main;

   public RemoveEvent(Main main) {
      this.main = main;
   }

   @EventHandler
   public void onClick(InventoryClickEvent e) {
      Player p = (Player)e.getWhoClicked();
      if (e.getInventory().getName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("RemoveMenuName")))) {
         if (e.getCurrentItem() == null) {
            return;
         }

         e.setCancelled(true);
         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName()) {
            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.Helmet.Name")))) {
               p.getInventory().setHelmet((ItemStack)null);
               p.getLocation().getWorld().playSound(p.getLocation(), Sound.FIZZ, 5.0F, 1.0F);
               p.closeInventory();
               Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.Chestplate.Name")))) {
               p.getInventory().setChestplate((ItemStack)null);
               p.getLocation().getWorld().playSound(p.getLocation(), Sound.FIZZ, 5.0F, 1.0F);
               p.closeInventory();
               Bukkit.getScheduler().cancelTask(DiscoArmourEvent.chestplate);
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.Leggings.Name")))) {
               p.getInventory().setLeggings((ItemStack)null);
               p.getLocation().getWorld().playSound(p.getLocation(), Sound.FIZZ, 5.0F, 1.0F);
               p.closeInventory();
               Bukkit.getScheduler().cancelTask(DiscoArmourEvent.leggings);
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.Boots.Name")))) {
               p.getInventory().setBoots((ItemStack)null);
               p.getLocation().getWorld().playSound(p.getLocation(), Sound.FIZZ, 5.0F, 1.0F);
               p.closeInventory();
               Bukkit.getScheduler().cancelTask(DiscoArmourEvent.boots);
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.ALL.Name")))) {
               p.getInventory().setHelmet((ItemStack)null);
               p.getInventory().setChestplate((ItemStack)null);
               p.getInventory().setLeggings((ItemStack)null);
               p.getInventory().setBoots((ItemStack)null);
               p.getLocation().getWorld().playSound(p.getLocation(), Sound.FIZZ, 5.0F, 1.0F);
               Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
               Bukkit.getScheduler().cancelTask(DiscoArmourEvent.chestplate);
               Bukkit.getScheduler().cancelTask(DiscoArmourEvent.leggings);
               Bukkit.getScheduler().cancelTask(DiscoArmourEvent.boots);
               p.closeInventory();
            }
         }
      }

   }
}
