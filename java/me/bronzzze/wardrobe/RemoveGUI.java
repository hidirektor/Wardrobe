package me.bronzzze.wardrobe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RemoveGUI {
   private Main main;

   public RemoveGUI(Main main) {
      this.main = main;
   }

   public void openInventory(Player p) {
      Inventory inv = Bukkit.getServer().createInventory((InventoryHolder)null, 9, ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("RemoveMenuName")));
      ItemStack part1 = new ItemStack(Material.LEATHER_HELMET, 1);
      ItemMeta partM1 = part1.getItemMeta();
      partM1.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.Helmet.Name")));
      List<String> converted1 = new ArrayList();
      Iterator var7 = this.main.getStatsFile().getStringList("Remove.Helmet.Lore").iterator();

      while(var7.hasNext()) {
         String s1 = (String)var7.next();
         converted1.add(ChatColor.translateAlternateColorCodes('&', s1));
      }

      partM1.setLore(converted1);
      part1.setItemMeta(partM1);
      ItemStack part2 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      ItemMeta partM2 = part2.getItemMeta();
      partM2.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.Chestplate.Name")));
      List<String> converted2 = new ArrayList();
      Iterator var10 = this.main.getStatsFile().getStringList("Remove.Chestplate.Lore").iterator();

      while(var10.hasNext()) {
         String s2 = (String)var10.next();
         converted2.add(ChatColor.translateAlternateColorCodes('&', s2));
      }

      partM2.setLore(converted2);
      part2.setItemMeta(partM2);
      ItemStack part3 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      ItemMeta partM3 = part3.getItemMeta();
      partM3.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.Leggings.Name")));
      List<String> converted3 = new ArrayList();
      Iterator var13 = this.main.getStatsFile().getStringList("Remove.Leggings.Lore").iterator();

      while(var13.hasNext()) {
         String s3 = (String)var13.next();
         converted3.add(ChatColor.translateAlternateColorCodes('&', s3));
      }

      partM3.setLore(converted3);
      part3.setItemMeta(partM3);
      ItemStack part4 = new ItemStack(Material.LEATHER_BOOTS, 1);
      ItemMeta partM4 = part4.getItemMeta();
      partM4.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.Boots.Name")));
      List<String> converted4 = new ArrayList();
      Iterator var16 = this.main.getStatsFile().getStringList("Remove.Boots.Lore").iterator();

      while(var16.hasNext()) {
         String s4 = (String)var16.next();
         converted4.add(ChatColor.translateAlternateColorCodes('&', s4));
      }

      partM4.setLore(converted4);
      part4.setItemMeta(partM4);
      ItemStack part5 = new ItemStack(Material.BLAZE_POWDER, 1);
      ItemMeta partM5 = part5.getItemMeta();
      partM5.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Remove.ALL.Name")));
      List<String> converted5 = new ArrayList();
      Iterator var19 = this.main.getStatsFile().getStringList("Remove.ALL.Lore").iterator();

      while(var19.hasNext()) {
         String s5 = (String)var19.next();
         converted5.add(ChatColor.translateAlternateColorCodes('&', s5));
      }

      partM5.setLore(converted5);
      part5.setItemMeta(partM5);
      inv.setItem(0, part1);
      inv.setItem(2, part2);
      inv.setItem(4, part3);
      inv.setItem(6, part4);
      inv.setItem(8, part5);
      p.openInventory(inv);
   }
}
