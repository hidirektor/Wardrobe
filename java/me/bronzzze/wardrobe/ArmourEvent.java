package me.bronzzze.wardrobe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ArmourEvent implements Listener {
   private final Main main;

   public ArmourEvent(Main main) {
      this.main = main;
   }

   @EventHandler
   public void onClick(InventoryClickEvent e) {
      Player p = (Player)e.getWhoClicked();
      if (e.getInventory().getName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ArmourSelectorMenuName")))) {
         if (e.getCurrentItem() == null) {
            return;
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName()) {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Back.Name")))) {
               p.getLocation().getWorld().playSound(p.getLocation(), Sound.ENDERDRAGON_WINGS, 1.0F, 1.0F);
               this.main.mainGUI.openInventory(p);
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Next.Name")))) {
               p.getLocation().getWorld().playSound(p.getLocation(), Sound.PISTON_EXTEND, 1.0F, 1.0F);
               this.main.armourGUIpage2.openInventory(p);
            }

            ItemStack item20;
            LeatherArmorMeta itemM6;
            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Helmet.Name")));
               itemM6.setColor(Color.YELLOW);
               item20.setItemMeta(itemM6);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Helmet.Name")));
               itemM6.setColor(Color.FUCHSIA);
               item20.setItemMeta(itemM6);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Helmet.Name")));
               itemM6.setColor(Color.RED);
               item20.setItemMeta(itemM6);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Helmet.Name")));
               itemM6.setColor(Color.BLUE);
               item20.setItemMeta(itemM6);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Helmet.Name")));
               itemM6.setColor(Color.GREEN);
               item20.setItemMeta(itemM6);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Helmet.Name")));
               itemM6.setColor(Color.GRAY);
               item20.setItemMeta(itemM6);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Helmet.Name")));
               itemM6.setColor(Color.BLACK);
               item20.setItemMeta(itemM6);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Chestplate.Name")));
               itemM6.setColor(Color.YELLOW);
               item20.setItemMeta(itemM6);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Chestplate.Name")));
               itemM6.setColor(Color.FUCHSIA);
               item20.setItemMeta(itemM6);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Chestplate.Name")));
               itemM6.setColor(Color.RED);
               item20.setItemMeta(itemM6);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Chestplate.Name")));
               itemM6.setColor(Color.BLUE);
               item20.setItemMeta(itemM6);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Chestplate.Name")));
               itemM6.setColor(Color.GREEN);
               item20.setItemMeta(itemM6);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Chestplate.Name")));
               itemM6.setColor(Color.GRAY);
               item20.setItemMeta(itemM6);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Chestplate.Name")));
               itemM6.setColor(Color.BLACK);
               item20.setItemMeta(itemM6);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Leggings.Name")));
               itemM6.setColor(Color.YELLOW);
               item20.setItemMeta(itemM6);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Leggings.Name")));
               itemM6.setColor(Color.FUCHSIA);
               item20.setItemMeta(itemM6);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Leggings.Name")));
               itemM6.setColor(Color.RED);
               item20.setItemMeta(itemM6);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Leggings.Name")));
               itemM6.setColor(Color.BLUE);
               item20.setItemMeta(itemM6);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Leggings.Name")));
               itemM6.setColor(Color.GREEN);
               item20.setItemMeta(itemM6);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Leggings.Name")));
               itemM6.setColor(Color.GRAY);
               item20.setItemMeta(itemM6);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Leggings.Name")));
               itemM6.setColor(Color.BLACK);
               item20.setItemMeta(itemM6);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Boots.Name")));
               itemM6.setColor(Color.YELLOW);
               item20.setItemMeta(itemM6);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Boots.Name")));
               itemM6.setColor(Color.FUCHSIA);
               item20.setItemMeta(itemM6);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Boots.Name")));
               itemM6.setColor(Color.RED);
               item20.setItemMeta(itemM6);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Boots.Name")));
               itemM6.setColor(Color.BLUE);
               item20.setItemMeta(itemM6);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Boots.Name")));
               itemM6.setColor(Color.GREEN);
               item20.setItemMeta(itemM6);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Boots.Name")));
               itemM6.setColor(Color.GRAY);
               item20.setItemMeta(itemM6);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM6 = (LeatherArmorMeta)item20.getItemMeta();
               itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Boots.Name")));
               itemM6.setColor(Color.BLACK);
               item20.setItemMeta(itemM6);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            ItemMeta itemM20;
            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.DIAMOND_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Helmet.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.IRON_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Helmet.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.GOLD_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Helmet.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.CHAINMAIL_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Helmet.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Helmet.Name")))) {
               if (this.main.helmet.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
                  this.main.helmet.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_HELMET, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Helmet.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setHelmet(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Chestplate.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.IRON_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Chestplate.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.GOLD_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Chestplate.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Chestplate.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Chestplate.Name")))) {
               if (this.main.chestplate.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
                  this.main.chestplate.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Chestplate.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setChestplate(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Leggings.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.IRON_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Leggings.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.GOLD_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Leggings.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Leggings.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Leggings.Name")))) {
               if (this.main.leggings.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
                  this.main.leggings.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Leggings.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setLeggings(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.DIAMOND_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Boots.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.IRON_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Boots.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.GOLD_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Boots.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Boots.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Boots.Name")))) {
               if (this.main.boots.containsKey(p.getName())) {
                  Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
                  this.main.boots.remove(p.getName());
               }

               p.getLocation().getWorld().playSound(p.getLocation(), Sound.BAT_TAKEOFF, 1.0F, 1.0F);
               item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
               if (this.main.getConfig().getBoolean("Enchantments")) {
                  item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
               }

               itemM20 = item20.getItemMeta();
               itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Boots.Name")));
               item20.setItemMeta(itemM20);
               p.getInventory().setBoots(item20);
               if (this.main.getConfig().getBoolean("Inventory Close")) {
                  p.closeInventory();
               }
            }
         }
      }

   }
}
