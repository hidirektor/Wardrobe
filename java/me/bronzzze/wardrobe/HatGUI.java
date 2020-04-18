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

public class HatGUI {
   private final Main main;

   public HatGUI(Main main) {
      this.main = main;
   }

   public void openInventory(Player p) {
      Inventory inv = Bukkit.getServer().createInventory((InventoryHolder)null, 27, ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("HatSelectorMenuName")));
      ItemStack hat1 = new ItemStack(Material.ENCHANTMENT_TABLE, 1);
      ItemMeta hatm1 = hat1.getItemMeta();
      hatm1.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ENCHANTMENT_TABLE.Name")));
      List<String> converted1 = new ArrayList();
      Iterator var7 = this.main.getStatsFile().getStringList("ENCHANTMENT_TABLE.Lore").iterator();

      while(var7.hasNext()) {
         String s1 = (String)var7.next();
         converted1.add(ChatColor.translateAlternateColorCodes('&', s1));
      }

      hatm1.setLore(converted1);
      hat1.setItemMeta(hatm1);
      ItemStack hat2 = new ItemStack(Material.MOB_SPAWNER, 1);
      ItemMeta hatm2 = hat2.getItemMeta();
      hatm2.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("MOB_SPAWNER.Name")));
      List<String> converted2 = new ArrayList();
      Iterator var10 = this.main.getStatsFile().getStringList("MOB_SPAWNER.Lore").iterator();

      while(var10.hasNext()) {
         String s2 = (String)var10.next();
         converted2.add(ChatColor.translateAlternateColorCodes('&', s2));
      }

      hatm2.setLore(converted2);
      hat2.setItemMeta(hatm2);
      ItemStack hat3 = new ItemStack(Material.BRICK_STAIRS, 1);
      ItemMeta hatm3 = hat3.getItemMeta();
      hatm3.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("BRICK_STAIRS.Name")));
      List<String> converted3 = new ArrayList();
      Iterator var13 = this.main.getStatsFile().getStringList("BRICK_STAIRS.Lore").iterator();

      while(var13.hasNext()) {
         String s3 = (String)var13.next();
         converted3.add(ChatColor.translateAlternateColorCodes('&', s3));
      }

      hatm3.setLore(converted3);
      hat3.setItemMeta(hatm3);
      ItemStack hat4 = new ItemStack(Material.CACTUS, 1);
      ItemMeta hatm4 = hat4.getItemMeta();
      hatm4.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("CACTUS.Name")));
      List<String> converted4 = new ArrayList();
      Iterator var16 = this.main.getStatsFile().getStringList("CACTUS.Lore").iterator();

      while(var16.hasNext()) {
         String s4 = (String)var16.next();
         converted4.add(ChatColor.translateAlternateColorCodes('&', s4));
      }

      hatm4.setLore(converted4);
      hat4.setItemMeta(hatm4);
      ItemStack hat5 = new ItemStack(Material.STAINED_GLASS, 1);
      ItemMeta hatm5 = hat5.getItemMeta();
      hatm5.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("STAINED_GLASS.Name")));
      List<String> converted5 = new ArrayList();
      Iterator var19 = this.main.getStatsFile().getStringList("STAINED_GLASS.Lore").iterator();

      while(var19.hasNext()) {
         String s5 = (String)var19.next();
         converted5.add(ChatColor.translateAlternateColorCodes('&', s5));
      }

      hatm5.setLore(converted5);
      hat5.setItemMeta(hatm5);
      ItemStack hat6 = new ItemStack(Material.BEACON, 1);
      ItemMeta hatm6 = hat6.getItemMeta();
      hatm6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("BEACON.Name")));
      List<String> converted6 = new ArrayList();
      Iterator var22 = this.main.getStatsFile().getStringList("BEACON.Lore").iterator();

      while(var22.hasNext()) {
         String s6 = (String)var22.next();
         converted6.add(ChatColor.translateAlternateColorCodes('&', s6));
      }

      hatm6.setLore(converted6);
      hat6.setItemMeta(hatm6);
      ItemStack hat7 = new ItemStack(Material.PUMPKIN, 1);
      ItemMeta hatm7 = hat7.getItemMeta();
      hatm7.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("PUMPKIN.Name")));
      List<String> converted7 = new ArrayList();
      Iterator var25 = this.main.getStatsFile().getStringList("PUMPKIN.Lore").iterator();

      while(var25.hasNext()) {
         String s7 = (String)var25.next();
         converted7.add(ChatColor.translateAlternateColorCodes('&', s7));
      }

      hatm7.setLore(converted7);
      hat7.setItemMeta(hatm7);
      ItemStack hat8 = new ItemStack(Material.LEAVES, 1);
      ItemMeta hatm8 = hat8.getItemMeta();
      hatm8.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("LEAVES.Name")));
      List<String> converted8 = new ArrayList();
      Iterator var28 = this.main.getStatsFile().getStringList("LEAVES.Lore").iterator();

      while(var28.hasNext()) {
         String s8 = (String)var28.next();
         converted8.add(ChatColor.translateAlternateColorCodes('&', s8));
      }

      hatm8.setLore(converted8);
      hat8.setItemMeta(hatm8);
      ItemStack hat9 = new ItemStack(Material.ICE, 1);
      ItemMeta hatm9 = hat9.getItemMeta();
      hatm9.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ICE.Name")));
      List<String> converted9 = new ArrayList();
      Iterator var31 = this.main.getStatsFile().getStringList("ICE.Lore").iterator();

      while(var31.hasNext()) {
         String s9 = (String)var31.next();
         converted9.add(ChatColor.translateAlternateColorCodes('&', s9));
      }

      hatm9.setLore(converted9);
      hat9.setItemMeta(hatm9);
      ItemStack hat10 = new ItemStack(Material.ENDER_CHEST, 1);
      ItemMeta hatm10 = hat10.getItemMeta();
      hatm10.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ENDER_CHEST.Name")));
      List<String> converted10 = new ArrayList();
      Iterator var34 = this.main.getStatsFile().getStringList("ENDER_CHEST.Lore").iterator();

      while(var34.hasNext()) {
         String s10 = (String)var34.next();
         converted10.add(ChatColor.translateAlternateColorCodes('&', s10));
      }

      hatm10.setLore(converted10);
      hat10.setItemMeta(hatm10);
      ItemStack hat11 = new ItemStack(Material.BEDROCK, 1);
      ItemMeta hatm11 = hat11.getItemMeta();
      hatm11.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("BEDROCK.Name")));
      List<String> converted11 = new ArrayList();
      Iterator var37 = this.main.getStatsFile().getStringList("BEDROCK.Lore").iterator();

      while(var37.hasNext()) {
         String s11 = (String)var37.next();
         converted11.add(ChatColor.translateAlternateColorCodes('&', s11));
      }

      hatm11.setLore(converted11);
      hat11.setItemMeta(hatm11);
      ItemStack hat12 = new ItemStack(Material.DIAMOND_BLOCK, 1);
      ItemMeta hatm12 = hat12.getItemMeta();
      hatm12.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("DIAMOND_BLOCK.Name")));
      List<String> converted12 = new ArrayList();
      Iterator var40 = this.main.getStatsFile().getStringList("DIAMOND_BLOCK.Lore").iterator();

      while(var40.hasNext()) {
         String s12 = (String)var40.next();
         converted12.add(ChatColor.translateAlternateColorCodes('&', s12));
      }

      hatm12.setLore(converted12);
      hat12.setItemMeta(hatm12);
      ItemStack hat13 = new ItemStack(Material.PACKED_ICE, 1);
      ItemMeta hatm13 = hat13.getItemMeta();
      hatm13.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("PACKED_ICE.Name")));
      List<String> converted13 = new ArrayList();
      Iterator var43 = this.main.getStatsFile().getStringList("PACKED_ICE.Lore").iterator();

      while(var43.hasNext()) {
         String s13 = (String)var43.next();
         converted13.add(ChatColor.translateAlternateColorCodes('&', s13));
      }

      hatm13.setLore(converted13);
      hat13.setItemMeta(hatm13);
      ItemStack hat14 = new ItemStack(Material.TNT, 1);
      ItemMeta hatm14 = hat14.getItemMeta();
      hatm14.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("TNT.Name")));
      List<String> converted14 = new ArrayList();
      Iterator var46 = this.main.getStatsFile().getStringList("TNT.Lore").iterator();

      while(var46.hasNext()) {
         String s14 = (String)var46.next();
         converted14.add(ChatColor.translateAlternateColorCodes('&', s14));
      }

      hatm14.setLore(converted14);
      hat14.setItemMeta(hatm14);
      ItemStack hat15 = new ItemStack(Material.CHEST, 1);
      ItemMeta hatm15 = hat15.getItemMeta();
      hatm15.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("CHEST.Name")));
      List<String> converted15 = new ArrayList();
      Iterator var49 = this.main.getStatsFile().getStringList("CHEST.Lore").iterator();

      while(var49.hasNext()) {
         String s15 = (String)var49.next();
         converted15.add(ChatColor.translateAlternateColorCodes('&', s15));
      }

      hatm15.setLore(converted15);
      hat15.setItemMeta(hatm15);
      ItemStack back = new ItemStack(Material.SLIME_BALL);
      ItemMeta backm = back.getItemMeta();
      backm.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Back.Name")));
      List<String> backl = new ArrayList();
      Iterator var52 = this.main.getStatsFile().getStringList("Back.Lore").iterator();

      while(var52.hasNext()) {
         String b1 = (String)var52.next();
         backl.add(ChatColor.translateAlternateColorCodes('&', b1));
      }

      backm.setLore(backl);
      back.setItemMeta(backm);
      inv.setItem(0, hat1);
      inv.setItem(1, hat2);
      inv.setItem(2, hat3);
      inv.setItem(3, hat4);
      inv.setItem(4, hat5);
      inv.setItem(5, hat6);
      inv.setItem(6, hat7);
      inv.setItem(7, hat8);
      inv.setItem(8, hat9);
      inv.setItem(9, hat10);
      inv.setItem(10, hat11);
      inv.setItem(11, hat12);
      inv.setItem(12, hat13);
      inv.setItem(13, hat14);
      inv.setItem(14, hat15);
      inv.setItem(26, back);
      p.openInventory(inv);
   }
}
