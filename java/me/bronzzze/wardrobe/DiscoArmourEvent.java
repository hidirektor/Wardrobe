package me.bronzzze.wardrobe;

import java.util.Random;
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
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class DiscoArmourEvent implements Listener {
   private final Main main;
   public static int helmet;
   public static int chestplate;
   public static int leggings;
   public static int boots;

   public DiscoArmourEvent(Main main) {
      this.main = main;
   }

   private ItemStack getColorArmor(Material m, Color c) {
      ItemStack i = new ItemStack(m, 1);
      if (this.main.getConfig().getBoolean("Enchantments on Discoarmour")) {
         i.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
      }

      LeatherArmorMeta meta = (LeatherArmorMeta)i.getItemMeta();
      meta.setColor(c);
      i.setItemMeta(meta);
      return i;
   }

   @EventHandler
   public void onClick(InventoryClickEvent e) {
      final Player p = (Player)e.getWhoClicked();
      if (e.getInventory().getName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("MainMenuName")))) {
         e.setCancelled(true);
         if (e.getCurrentItem() == null) {
            return;
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("DiscoArmour.Name")))) {
            if (!p.hasPermission("wardrobe.discoarmour")) {
               p.sendMessage(ChatColor.DARK_RED + "No permission!");
               return;
            }

            p.getWorld().playSound(p.getLocation(), Sound.FIREWORK_TWINKLE2, 1.0F, 1.0F);
            if (this.main.helmet.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.helmet.get(p.getName()));
               this.main.helmet.remove(p.getName());
            }

            if (this.main.chestplate.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.chestplate.get(p.getName()));
               this.main.chestplate.remove(p.getName());
            }

            if (this.main.leggings.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.leggings.get(p.getName()));
               this.main.leggings.remove(p.getName());
            }

            if (this.main.boots.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.boots.get(p.getName()));
               this.main.boots.remove(p.getName());
            }

            p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
            p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
            p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
            p.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
            p.closeInventory();
            helmet = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private Random r = new Random();

               public void run() {
                  Color c = Color.fromRGB(this.r.nextInt(255), this.r.nextInt(255), this.r.nextInt(255));
                  if (p.getInventory().getHelmet() != null && p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET) {
                     p.getInventory().setHelmet(DiscoArmourEvent.this.getColorArmor(Material.LEATHER_HELMET, c));
                  }

               }
            }, 1L, (long)this.main.getConfig().getInt("DiscoArmourSpeed"));
            this.main.helmet.put(p.getName(), helmet);
            chestplate = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private Random r = new Random();

               public void run() {
                  DiscoArmourEvent.this.main.chestplate.put(p.getName(), DiscoArmourEvent.chestplate);
                  Color c2 = Color.fromRGB(this.r.nextInt(255), this.r.nextInt(255), this.r.nextInt(255));
                  if (p.getInventory().getChestplate() != null && p.getInventory().getChestplate().getType() == Material.LEATHER_CHESTPLATE) {
                     p.getInventory().setChestplate(DiscoArmourEvent.this.getColorArmor(Material.LEATHER_CHESTPLATE, c2));
                  }

               }
            }, 1L, (long)this.main.getConfig().getInt("DiscoArmourSpeed"));
            this.main.chestplate.put(p.getName(), chestplate);
            leggings = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private Random r = new Random();

               public void run() {
                  Color c3 = Color.fromRGB(this.r.nextInt(255), this.r.nextInt(255), this.r.nextInt(255));
                  if (p.getInventory().getLeggings() != null && p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS) {
                     p.getInventory().setLeggings(DiscoArmourEvent.this.getColorArmor(Material.LEATHER_LEGGINGS, c3));
                  }

               }
            }, 1L, (long)this.main.getConfig().getInt("DiscoArmourSpeed"));
            this.main.leggings.put(p.getName(), leggings);
            boots = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private Random r = new Random();

               public void run() {
                  Color c4 = Color.fromRGB(this.r.nextInt(255), this.r.nextInt(255), this.r.nextInt(255));
                  if (p.getInventory().getBoots() != null && p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS) {
                     p.getInventory().setBoots(DiscoArmourEvent.this.getColorArmor(Material.LEATHER_BOOTS, c4));
                  }

               }
            }, 1L, (long)this.main.getConfig().getInt("DiscoArmourSpeed"));
            this.main.boots.put(p.getName(), boots);
         }
      }

   }
}
