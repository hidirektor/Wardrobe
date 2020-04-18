package me.bronzzze.wardrobe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class MainGUI {
   private Main main;
   Inventory inv1;

   public MainGUI(Main main) {
      this.main = main;
   }

   public void openInventory(Player p) {
      this.inv1 = Bukkit.getServer().createInventory((InventoryHolder)null, 9, ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("MainMenuName")));
      ItemStack main1 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      if (this.main.getConfig().getBoolean("Enchantments")) {
         main1.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
      }

      LeatherArmorMeta mainM1 = (LeatherArmorMeta)main1.getItemMeta();
      mainM1.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ArmourSelector.Name")));
      List<String> converted1 = new ArrayList();
      Iterator var6 = this.main.getStatsFile().getStringList("ArmourSelector.Lore").iterator();

      while(var6.hasNext()) {
         String s1 = (String)var6.next();
         converted1.add(ChatColor.translateAlternateColorCodes('&', s1));
      }

      mainM1.setLore(converted1);
      main1.setItemMeta(mainM1);
      ItemStack main3 = new ItemStack(Material.SKULL_ITEM, 1);
      ItemMeta mainM3 = main3.getItemMeta();
      mainM3.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("HatSelector.Name")));
      List<String> converted2 = new ArrayList();
      Iterator var9 = this.main.getStatsFile().getStringList("HatSelector.Lore").iterator();

      while(var9.hasNext()) {
         String s2 = (String)var9.next();
         converted2.add(ChatColor.translateAlternateColorCodes('&', s2));
      }

      mainM3.setLore(converted2);
      main3.setItemMeta(mainM3);
      ItemStack main6 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
      main6.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
      ItemMeta mainM6 = main6.getItemMeta();
      mainM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("DiscoArmour.Name")));
      List<String> converted3 = new ArrayList();
      Iterator var12 = this.main.getStatsFile().getStringList("DiscoArmour.Lore").iterator();

      while(var12.hasNext()) {
         String s3 = (String)var12.next();
         converted3.add(ChatColor.translateAlternateColorCodes('&', s3));
      }

      mainM6.setLore(converted3);
      main6.setItemMeta(mainM6);
      ItemStack main5 = new ItemStack(Material.CHEST, 1);
      ItemMeta mainM5 = main5.getItemMeta();
      mainM5.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ParticleMenu.Name")));
      List<String> converted4 = new ArrayList();
      Iterator var15 = this.main.getStatsFile().getStringList("ParticleMenu.Lore").iterator();

      while(var15.hasNext()) {
         String s4 = (String)var15.next();
         converted4.add(ChatColor.translateAlternateColorCodes('&', s4));
      }

      mainM5.setLore(converted4);
      main5.setItemMeta(mainM5);
      ItemStack main4 = new ItemStack(Material.LAVA_BUCKET, 1);
      ItemMeta mainM4 = main4.getItemMeta();
      mainM4.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("RemoveItem.Name")));
      List<String> converted5 = new ArrayList();
      Iterator var18 = this.main.getStatsFile().getStringList("RemoveItem.Lore").iterator();

      while(var18.hasNext()) {
         String s5 = (String)var18.next();
         converted5.add(ChatColor.translateAlternateColorCodes('&', s5));
      }

      mainM4.setLore(converted5);
      main4.setItemMeta(mainM4);
      ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)7);
      ItemMeta emptyM = empty.getItemMeta();
      emptyM.setDisplayName(ChatColor.GRAY + " ");
      empty.setItemMeta(emptyM);
      this.inv1.setItem(0, main1);
      this.inv1.setItem(2, main3);
      this.inv1.setItem(4, main6);
      this.inv1.setItem(6, main5);
      this.inv1.setItem(8, main4);
      p.openInventory(this.inv1);
   }
}
