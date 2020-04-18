package me.bronzzze.wardrobe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class HatEvent implements Listener {
   private final Main main;

   public HatEvent(Main main) {
      this.main = main;
   }

   @EventHandler
   public void onClick(InventoryClickEvent e) {
      Player p = (Player)e.getWhoClicked();
      if (e.getInventory().getName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("HatSelectorMenuName")))) {
         if (e.getCurrentItem() == null) {
            return;
         }

         e.setCancelled(true);
         if (e.getCurrentItem().getType() == Material.ENCHANTMENT_TABLE) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.ENCHANTMENT_TABLE));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.MOB_SPAWNER) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.MOB_SPAWNER));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.BRICK_STAIRS) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.BRICK_STAIRS));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.CACTUS) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.CACTUS));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.STAINED_GLASS) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.STAINED_GLASS));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.BEACON) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.BEACON));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.PUMPKIN) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.PUMPKIN));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.LEAVES) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.LEAVES));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.ICE) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.ICE));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.ENDER_CHEST) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.ENDER_CHEST));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.BEDROCK) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.BEDROCK));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.DIAMOND_BLOCK) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_BLOCK));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.PACKED_ICE) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.PACKED_ICE));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.TNT) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.TNT));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         if (e.getCurrentItem().getType() == Material.CHEST) {
            Bukkit.getScheduler().cancelTask(DiscoArmourEvent.helmet);
            p.getInventory().setHelmet(new ItemStack(Material.CHEST));
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            p.sendMessage(this.main.prefix + this.main.message);
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ITEM_PICKUP, 1.0F, 1.0F);
         }

         e.setCancelled(true);
         if (e.getCurrentItem().getType() == Material.SLIME_BALL) {
            p.getLocation().getWorld().playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1.0F, 1.0F);
            this.main.mainGUI.openInventory(p);
         }
      }

   }
}
