package me.bronzzze.wardrobe;

import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ArmourGUI {
   private Main main;

   public ArmourGUI(Main main) {
      this.main = main;
   }

   public void openInventory(Player p) {
      Inventory inv = Bukkit.getServer().createInventory((InventoryHolder)null, 54, ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ArmourSelectorMenuName")));
      ItemStack item1;
      LeatherArmorMeta itemM1;
      ArrayList converted1;
      String s1;
      Iterator var7;
      ArrayList converted2;
      String s2;
      Iterator var10;
      ArrayList converted3;
      String s3;
      Iterator var13;
      ArrayList converted4;
      String s4;
      Iterator var16;
      ArrayList converted5;
      String s5;
      Iterator var19;
      ArrayList converted6;
      String s6;
      Iterator var22;
      ArrayList converted7;
      String s7;
      Iterator var25;
      ArrayList converted8;
      String s8;
      Iterator var28;
      ArrayList converted9;
      String s9;
      Iterator var31;
      ArrayList converted10;
      String s10;
      Iterator var34;
      ArrayList converted11;
      String s11;
      Iterator var37;
      ArrayList converted12;
      String s12;
      Iterator var40;
      ArrayList converted13;
      String s13;
      Iterator var43;
      ArrayList converted14;
      String s14;
      Iterator var46;
      ArrayList converted15;
      String s15;
      Iterator var49;
      ArrayList converted16;
      String s16;
      Iterator var52;
      ArrayList converted17;
      String s17;
      Iterator var55;
      ArrayList converted18;
      String s18;
      Iterator var58;
      ArrayList converted19;
      String s19;
      Iterator var61;
      ArrayList converted20;
      String s20;
      Iterator var64;
      ArrayList converted21;
      String s21;
      Iterator var67;
      ArrayList converted22;
      String s22;
      Iterator var70;
      ArrayList converted23;
      String s23;
      Iterator var73;
      ArrayList converted24;
      String s24;
      Iterator var76;
      ArrayList converted25;
      String s25;
      Iterator var79;
      ArrayList converted26;
      String s26;
      Iterator var82;
      ArrayList converted27;
      String s27;
      Iterator var85;
      ArrayList converted28;
      String s28;
      Iterator var88;
      ArrayList backl;
      String b1;
      Iterator var91;
      ArrayList nextl;
      String n1;
      Iterator var94;
      ItemStack item2;
      LeatherArmorMeta itemM2;
      ItemStack item3;
      LeatherArmorMeta itemM3;
      ItemStack item4;
      LeatherArmorMeta itemM4;
      ItemStack item5;
      LeatherArmorMeta itemM5;
      ItemStack item6;
      LeatherArmorMeta itemM6;
      ItemStack item7;
      LeatherArmorMeta itemM7;
      ItemStack item8;
      LeatherArmorMeta itemM8;
      ItemStack item9;
      LeatherArmorMeta itemM9;
      ItemStack item10;
      LeatherArmorMeta itemM10;
      ItemStack item11;
      LeatherArmorMeta itemM11;
      ItemStack item12;
      LeatherArmorMeta itemM12;
      ItemStack item13;
      LeatherArmorMeta itemM13;
      ItemStack item14;
      LeatherArmorMeta itemM14;
      ItemStack item15;
      LeatherArmorMeta itemM15;
      ItemStack item16;
      LeatherArmorMeta itemM16;
      ItemStack item17;
      LeatherArmorMeta itemM17;
      ItemStack item18;
      LeatherArmorMeta itemM18;
      ItemStack item19;
      LeatherArmorMeta itemM19;
      ItemStack item20;
      LeatherArmorMeta itemM20;
      ItemStack item21;
      LeatherArmorMeta itemM21;
      ItemStack item22;
      LeatherArmorMeta itemM22;
      ItemStack item23;
      LeatherArmorMeta itemM23;
      ItemStack item24;
      LeatherArmorMeta itemM24;
      ItemStack item25;
      LeatherArmorMeta itemM25;
      ItemStack item26;
      LeatherArmorMeta itemM26;
      ItemStack item27;
      LeatherArmorMeta itemM27;
      ItemStack item28;
      LeatherArmorMeta itemM28;
      ItemStack back;
      ItemMeta backm;
      ItemStack next;
      ItemMeta nextM;
      if (this.main.getConfig().getBoolean("Enchantments")) {
         item1 = new ItemStack(Material.LEATHER_HELMET, 1);
         item1.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM1 = (LeatherArmorMeta)item1.getItemMeta();
         itemM1.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Helmet.Name")));
         converted1 = new ArrayList();
         var7 = this.main.getStatsFile().getStringList("Yellow.Helmet.Lore").iterator();

         while(var7.hasNext()) {
            s1 = (String)var7.next();
            converted1.add(ChatColor.translateAlternateColorCodes('&', s1));
         }

         itemM1.setLore(converted1);
         itemM1.setColor(Color.YELLOW);
         item1.setItemMeta(itemM1);
         item2 = new ItemStack(Material.LEATHER_HELMET, 1);
         item2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM2 = (LeatherArmorMeta)item2.getItemMeta();
         converted2 = new ArrayList();
         var10 = this.main.getStatsFile().getStringList("Black.Helmet.Lore").iterator();

         while(var10.hasNext()) {
            s2 = (String)var10.next();
            converted2.add(ChatColor.translateAlternateColorCodes('&', s2));
         }

         itemM2.setLore(converted2);
         itemM2.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Helmet.Name")));
         itemM2.setColor(Color.BLACK);
         item2.setItemMeta(itemM2);
         item3 = new ItemStack(Material.LEATHER_HELMET, 1);
         item3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM3 = (LeatherArmorMeta)item3.getItemMeta();
         converted3 = new ArrayList();
         var13 = this.main.getStatsFile().getStringList("Blue.Helmet.Lore").iterator();

         while(var13.hasNext()) {
            s3 = (String)var13.next();
            converted3.add(ChatColor.translateAlternateColorCodes('&', s3));
         }

         itemM3.setLore(converted3);
         itemM3.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Helmet.Name")));
         itemM3.setColor(Color.BLUE);
         item3.setItemMeta(itemM3);
         item4 = new ItemStack(Material.LEATHER_HELMET, 1);
         item4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM4 = (LeatherArmorMeta)item4.getItemMeta();
         converted4 = new ArrayList();
         var16 = this.main.getStatsFile().getStringList("Pink.Helmet.Lore").iterator();

         while(var16.hasNext()) {
            s4 = (String)var16.next();
            converted4.add(ChatColor.translateAlternateColorCodes('&', s4));
         }

         itemM4.setLore(converted4);
         itemM4.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Helmet.Name")));
         itemM4.setColor(Color.FUCHSIA);
         item4.setItemMeta(itemM4);
         item5 = new ItemStack(Material.LEATHER_HELMET, 1);
         item5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM5 = (LeatherArmorMeta)item5.getItemMeta();
         converted5 = new ArrayList();
         var19 = this.main.getStatsFile().getStringList("Gray.Helmet.Lore").iterator();

         while(var19.hasNext()) {
            s5 = (String)var19.next();
            converted5.add(ChatColor.translateAlternateColorCodes('&', s5));
         }

         itemM5.setLore(converted5);
         itemM5.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Helmet.Name")));
         itemM5.setColor(Color.GRAY);
         item5.setItemMeta(itemM5);
         item6 = new ItemStack(Material.LEATHER_HELMET, 1);
         item6.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM6 = (LeatherArmorMeta)item6.getItemMeta();
         converted6 = new ArrayList();
         var22 = this.main.getStatsFile().getStringList("Green.Helmet.Lore").iterator();

         while(var22.hasNext()) {
            s6 = (String)var22.next();
            converted6.add(ChatColor.translateAlternateColorCodes('&', s6));
         }

         itemM6.setLore(converted6);
         itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Helmet.Name")));
         itemM6.setColor(Color.GREEN);
         item6.setItemMeta(itemM6);
         item7 = new ItemStack(Material.LEATHER_HELMET, 1);
         item7.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM7 = (LeatherArmorMeta)item7.getItemMeta();
         converted7 = new ArrayList();
         var25 = this.main.getStatsFile().getStringList("Red.Helmet.Lore").iterator();

         while(var25.hasNext()) {
            s7 = (String)var25.next();
            converted7.add(ChatColor.translateAlternateColorCodes('&', s7));
         }

         itemM7.setLore(converted7);
         itemM7.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Helmet.Name")));
         itemM7.setColor(Color.RED);
         item7.setItemMeta(itemM7);
         item8 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         item8.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM8 = (LeatherArmorMeta)item8.getItemMeta();
         converted8 = new ArrayList();
         var28 = this.main.getStatsFile().getStringList("Yellow.Chestplate.Lore").iterator();

         while(var28.hasNext()) {
            s8 = (String)var28.next();
            converted8.add(ChatColor.translateAlternateColorCodes('&', s8));
         }

         itemM8.setLore(converted8);
         itemM8.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Chestplate.Name")));
         itemM8.setColor(Color.YELLOW);
         item8.setItemMeta(itemM8);
         item9 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         item9.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM9 = (LeatherArmorMeta)item9.getItemMeta();
         converted9 = new ArrayList();
         var31 = this.main.getStatsFile().getStringList("Pink.Chestplate.Lore").iterator();

         while(var31.hasNext()) {
            s9 = (String)var31.next();
            converted9.add(ChatColor.translateAlternateColorCodes('&', s9));
         }

         itemM9.setLore(converted9);
         itemM9.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Chestplate.Name")));
         itemM9.setColor(Color.FUCHSIA);
         item9.setItemMeta(itemM9);
         item10 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         item10.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM10 = (LeatherArmorMeta)item10.getItemMeta();
         converted10 = new ArrayList();
         var34 = this.main.getStatsFile().getStringList("Red.Chestplate.Lore").iterator();

         while(var34.hasNext()) {
            s10 = (String)var34.next();
            converted10.add(ChatColor.translateAlternateColorCodes('&', s10));
         }

         itemM10.setLore(converted10);
         itemM10.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Chestplate.Name")));
         itemM10.setColor(Color.RED);
         item10.setItemMeta(itemM10);
         item11 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         item11.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM11 = (LeatherArmorMeta)item11.getItemMeta();
         converted11 = new ArrayList();
         var37 = this.main.getStatsFile().getStringList("Blue.Chestplate.Lore").iterator();

         while(var37.hasNext()) {
            s11 = (String)var37.next();
            converted11.add(ChatColor.translateAlternateColorCodes('&', s11));
         }

         itemM11.setLore(converted11);
         itemM11.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Chestplate.Name")));
         itemM11.setColor(Color.BLUE);
         item11.setItemMeta(itemM11);
         item12 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         item12.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM12 = (LeatherArmorMeta)item12.getItemMeta();
         converted12 = new ArrayList();
         var40 = this.main.getStatsFile().getStringList("Green.Chestplate.Lore").iterator();

         while(var40.hasNext()) {
            s12 = (String)var40.next();
            converted12.add(ChatColor.translateAlternateColorCodes('&', s12));
         }

         itemM12.setLore(converted12);
         itemM12.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Chestplate.Name")));
         itemM12.setColor(Color.GREEN);
         item12.setItemMeta(itemM12);
         item13 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         item13.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM13 = (LeatherArmorMeta)item13.getItemMeta();
         converted13 = new ArrayList();
         var43 = this.main.getStatsFile().getStringList("Gray.Chestplate.Lore").iterator();

         while(var43.hasNext()) {
            s13 = (String)var43.next();
            converted13.add(ChatColor.translateAlternateColorCodes('&', s13));
         }

         itemM13.setLore(converted13);
         itemM13.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Chestplate.Name")));
         itemM13.setColor(Color.GRAY);
         item13.setItemMeta(itemM13);
         item14 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         item14.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM14 = (LeatherArmorMeta)item14.getItemMeta();
         converted14 = new ArrayList();
         var46 = this.main.getStatsFile().getStringList("Black.Chestplate.Lore").iterator();

         while(var46.hasNext()) {
            s14 = (String)var46.next();
            converted14.add(ChatColor.translateAlternateColorCodes('&', s14));
         }

         itemM14.setLore(converted14);
         itemM14.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Chestplate.Name")));
         itemM14.setColor(Color.BLACK);
         item14.setItemMeta(itemM14);
         item15 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         item15.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM15 = (LeatherArmorMeta)item15.getItemMeta();
         converted15 = new ArrayList();
         var49 = this.main.getStatsFile().getStringList("Yellow.Leggings.Lore").iterator();

         while(var49.hasNext()) {
            s15 = (String)var49.next();
            converted15.add(ChatColor.translateAlternateColorCodes('&', s15));
         }

         itemM15.setLore(converted15);
         itemM15.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Leggings.Name")));
         itemM15.setColor(Color.YELLOW);
         item15.setItemMeta(itemM15);
         item16 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         item16.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM16 = (LeatherArmorMeta)item16.getItemMeta();
         converted16 = new ArrayList();
         var52 = this.main.getStatsFile().getStringList("Pink.Leggings.Lore").iterator();

         while(var52.hasNext()) {
            s16 = (String)var52.next();
            converted16.add(ChatColor.translateAlternateColorCodes('&', s16));
         }

         itemM16.setLore(converted16);
         itemM16.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Leggings.Name")));
         itemM16.setColor(Color.FUCHSIA);
         item16.setItemMeta(itemM16);
         item17 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         item17.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM17 = (LeatherArmorMeta)item17.getItemMeta();
         converted17 = new ArrayList();
         var55 = this.main.getStatsFile().getStringList("Red.Leggings.Lore").iterator();

         while(var55.hasNext()) {
            s17 = (String)var55.next();
            converted17.add(ChatColor.translateAlternateColorCodes('&', s17));
         }

         itemM17.setLore(converted17);
         itemM17.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Leggings.Name")));
         itemM17.setColor(Color.RED);
         item17.setItemMeta(itemM17);
         item18 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         item18.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM18 = (LeatherArmorMeta)item18.getItemMeta();
         converted18 = new ArrayList();
         var58 = this.main.getStatsFile().getStringList("Blue.Leggings.Lore").iterator();

         while(var58.hasNext()) {
            s18 = (String)var58.next();
            converted18.add(ChatColor.translateAlternateColorCodes('&', s18));
         }

         itemM18.setLore(converted18);
         itemM18.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Leggings.Name")));
         itemM18.setColor(Color.BLUE);
         item18.setItemMeta(itemM18);
         item19 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         item19.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM19 = (LeatherArmorMeta)item19.getItemMeta();
         converted19 = new ArrayList();
         var61 = this.main.getStatsFile().getStringList("Green.Leggings.Lore").iterator();

         while(var61.hasNext()) {
            s19 = (String)var61.next();
            converted19.add(ChatColor.translateAlternateColorCodes('&', s19));
         }

         itemM19.setLore(converted19);
         itemM19.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Leggings.Name")));
         itemM19.setColor(Color.GREEN);
         item19.setItemMeta(itemM19);
         item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM20 = (LeatherArmorMeta)item20.getItemMeta();
         converted20 = new ArrayList();
         var64 = this.main.getStatsFile().getStringList("Gray.Leggings.Lore").iterator();

         while(var64.hasNext()) {
            s20 = (String)var64.next();
            converted20.add(ChatColor.translateAlternateColorCodes('&', s20));
         }

         itemM20.setLore(converted20);
         itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Leggings.Name")));
         itemM20.setColor(Color.GRAY);
         item20.setItemMeta(itemM20);
         item21 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         item21.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM21 = (LeatherArmorMeta)item21.getItemMeta();
         converted21 = new ArrayList();
         var67 = this.main.getStatsFile().getStringList("Black.Leggings.Lore").iterator();

         while(var67.hasNext()) {
            s21 = (String)var67.next();
            converted21.add(ChatColor.translateAlternateColorCodes('&', s21));
         }

         itemM21.setLore(converted21);
         itemM21.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Leggings.Name")));
         itemM21.setColor(Color.BLACK);
         item21.setItemMeta(itemM21);
         item22 = new ItemStack(Material.LEATHER_BOOTS, 1);
         item22.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM22 = (LeatherArmorMeta)item22.getItemMeta();
         converted22 = new ArrayList();
         var70 = this.main.getStatsFile().getStringList("Yellow.Boots.Lore").iterator();

         while(var70.hasNext()) {
            s22 = (String)var70.next();
            converted22.add(ChatColor.translateAlternateColorCodes('&', s22));
         }

         itemM22.setLore(converted22);
         itemM22.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Boots.Name")));
         itemM22.setColor(Color.YELLOW);
         item22.setItemMeta(itemM22);
         item23 = new ItemStack(Material.LEATHER_BOOTS, 1);
         item23.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM23 = (LeatherArmorMeta)item23.getItemMeta();
         converted23 = new ArrayList();
         var73 = this.main.getStatsFile().getStringList("Pink.Boots.Lore").iterator();

         while(var73.hasNext()) {
            s23 = (String)var73.next();
            converted23.add(ChatColor.translateAlternateColorCodes('&', s23));
         }

         itemM23.setLore(converted23);
         itemM23.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Boots.Name")));
         itemM23.setColor(Color.FUCHSIA);
         item23.setItemMeta(itemM23);
         item24 = new ItemStack(Material.LEATHER_BOOTS, 1);
         item24.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM24 = (LeatherArmorMeta)item24.getItemMeta();
         converted24 = new ArrayList();
         var76 = this.main.getStatsFile().getStringList("Red.Boots.Lore").iterator();

         while(var76.hasNext()) {
            s24 = (String)var76.next();
            converted24.add(ChatColor.translateAlternateColorCodes('&', s24));
         }

         itemM24.setLore(converted24);
         itemM24.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Boots.Name")));
         itemM24.setColor(Color.RED);
         item24.setItemMeta(itemM24);
         item25 = new ItemStack(Material.LEATHER_BOOTS, 1);
         item25.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM25 = (LeatherArmorMeta)item25.getItemMeta();
         converted25 = new ArrayList();
         var79 = this.main.getStatsFile().getStringList("Blue.Boots.Lore").iterator();

         while(var79.hasNext()) {
            s25 = (String)var79.next();
            converted25.add(ChatColor.translateAlternateColorCodes('&', s25));
         }

         itemM25.setLore(converted25);
         itemM25.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Boots.Name")));
         itemM25.setColor(Color.BLUE);
         item25.setItemMeta(itemM25);
         item26 = new ItemStack(Material.LEATHER_BOOTS, 1);
         item26.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM26 = (LeatherArmorMeta)item26.getItemMeta();
         converted26 = new ArrayList();
         var82 = this.main.getStatsFile().getStringList("Green.Boots.Lore").iterator();

         while(var82.hasNext()) {
            s26 = (String)var82.next();
            converted26.add(ChatColor.translateAlternateColorCodes('&', s26));
         }

         itemM26.setLore(converted26);
         itemM26.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Boots.Name")));
         itemM26.setColor(Color.GREEN);
         item26.setItemMeta(itemM26);
         item27 = new ItemStack(Material.LEATHER_BOOTS, 1);
         item27.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM27 = (LeatherArmorMeta)item27.getItemMeta();
         converted27 = new ArrayList();
         var85 = this.main.getStatsFile().getStringList("Gray.Boots.Lore").iterator();

         while(var85.hasNext()) {
            s27 = (String)var85.next();
            converted27.add(ChatColor.translateAlternateColorCodes('&', s27));
         }

         itemM27.setLore(converted27);
         itemM27.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Boots.Name")));
         itemM27.setColor(Color.GRAY);
         item27.setItemMeta(itemM27);
         item28 = new ItemStack(Material.LEATHER_BOOTS, 1);
         item28.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM28 = (LeatherArmorMeta)item28.getItemMeta();
         converted28 = new ArrayList();
         var88 = this.main.getStatsFile().getStringList("Back.Boots.Lore").iterator();

         while(var88.hasNext()) {
            s28 = (String)var88.next();
            converted28.add(ChatColor.translateAlternateColorCodes('&', s28));
         }

         itemM28.setLore(converted28);
         itemM28.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Boots.Name")));
         itemM28.setColor(Color.BLACK);
         item28.setItemMeta(itemM28);
         back = new ItemStack(Material.SLIME_BALL);
         backm = back.getItemMeta();
         backm.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Back.Name")));
         backl = new ArrayList();
         var91 = this.main.getStatsFile().getStringList("Back.Lore").iterator();

         while(var91.hasNext()) {
            b1 = (String)var91.next();
            backl.add(ChatColor.translateAlternateColorCodes('&', b1));
         }

         backm.setLore(backl);
         back.setItemMeta(backm);
         next = new ItemStack(Material.ARROW);
         nextM = next.getItemMeta();
         nextM.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Next.Name")));
         nextl = new ArrayList();
         var94 = this.main.getStatsFile().getStringList("Back.Lore").iterator();

         while(var94.hasNext()) {
            n1 = (String)var94.next();
            nextl.add(ChatColor.translateAlternateColorCodes('&', n1));
         }

         nextM.setLore(nextl);
         next.setItemMeta(nextM);
         inv.setItem(10, item1);
         inv.setItem(11, item4);
         inv.setItem(12, item7);
         inv.setItem(13, item3);
         inv.setItem(14, item6);
         inv.setItem(15, item5);
         inv.setItem(16, item2);
         inv.setItem(19, item8);
         inv.setItem(20, item9);
         inv.setItem(21, item10);
         inv.setItem(22, item11);
         inv.setItem(23, item12);
         inv.setItem(24, item13);
         inv.setItem(25, item14);
         inv.setItem(28, item15);
         inv.setItem(29, item16);
         inv.setItem(30, item17);
         inv.setItem(31, item18);
         inv.setItem(32, item19);
         inv.setItem(33, item20);
         inv.setItem(34, item21);
         inv.setItem(37, item22);
         inv.setItem(38, item23);
         inv.setItem(39, item24);
         inv.setItem(40, item25);
         inv.setItem(41, item26);
         inv.setItem(42, item27);
         inv.setItem(43, item28);
         inv.setItem(45, next);
         inv.setItem(53, back);
         p.openInventory(inv);
      } else {
         item1 = new ItemStack(Material.LEATHER_HELMET, 1);
         itemM1 = (LeatherArmorMeta)item1.getItemMeta();
         itemM1.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Helmet.Name")));
         converted1 = new ArrayList();
         var7 = this.main.getStatsFile().getStringList("Yellow.Helmet.Lore").iterator();

         while(var7.hasNext()) {
            s1 = (String)var7.next();
            converted1.add(ChatColor.translateAlternateColorCodes('&', s1));
         }

         itemM1.setLore(converted1);
         itemM1.setColor(Color.YELLOW);
         item1.setItemMeta(itemM1);
         item2 = new ItemStack(Material.LEATHER_HELMET, 1);
         itemM2 = (LeatherArmorMeta)item2.getItemMeta();
         converted2 = new ArrayList();
         var10 = this.main.getStatsFile().getStringList("Black.Helmet.Lore").iterator();

         while(var10.hasNext()) {
            s2 = (String)var10.next();
            converted2.add(ChatColor.translateAlternateColorCodes('&', s2));
         }

         itemM2.setLore(converted2);
         itemM2.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Helmet.Name")));
         itemM2.setColor(Color.BLACK);
         item2.setItemMeta(itemM2);
         item3 = new ItemStack(Material.LEATHER_HELMET, 1);
         itemM3 = (LeatherArmorMeta)item3.getItemMeta();
         converted3 = new ArrayList();
         var13 = this.main.getStatsFile().getStringList("Blue.Helmet.Lore").iterator();

         while(var13.hasNext()) {
            s3 = (String)var13.next();
            converted3.add(ChatColor.translateAlternateColorCodes('&', s3));
         }

         itemM3.setLore(converted3);
         itemM3.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Helmet.Name")));
         itemM3.setColor(Color.BLUE);
         item3.setItemMeta(itemM3);
         item4 = new ItemStack(Material.LEATHER_HELMET, 1);
         itemM4 = (LeatherArmorMeta)item4.getItemMeta();
         converted4 = new ArrayList();
         var16 = this.main.getStatsFile().getStringList("Pink.Helmet.Lore").iterator();

         while(var16.hasNext()) {
            s4 = (String)var16.next();
            converted4.add(ChatColor.translateAlternateColorCodes('&', s4));
         }

         itemM4.setLore(converted4);
         itemM4.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Helmet.Name")));
         itemM4.setColor(Color.FUCHSIA);
         item4.setItemMeta(itemM4);
         item5 = new ItemStack(Material.LEATHER_HELMET, 1);
         itemM5 = (LeatherArmorMeta)item5.getItemMeta();
         converted5 = new ArrayList();
         var19 = this.main.getStatsFile().getStringList("Gray.Helmet.Lore").iterator();

         while(var19.hasNext()) {
            s5 = (String)var19.next();
            converted5.add(ChatColor.translateAlternateColorCodes('&', s5));
         }

         itemM5.setLore(converted5);
         itemM5.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Helmet.Name")));
         itemM5.setColor(Color.GRAY);
         item5.setItemMeta(itemM5);
         item6 = new ItemStack(Material.LEATHER_HELMET, 1);
         itemM6 = (LeatherArmorMeta)item6.getItemMeta();
         converted6 = new ArrayList();
         var22 = this.main.getStatsFile().getStringList("Green.Helmet.Lore").iterator();

         while(var22.hasNext()) {
            s6 = (String)var22.next();
            converted6.add(ChatColor.translateAlternateColorCodes('&', s6));
         }

         itemM6.setLore(converted6);
         itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Helmet.Name")));
         itemM6.setColor(Color.GREEN);
         item6.setItemMeta(itemM6);
         item7 = new ItemStack(Material.LEATHER_HELMET, 1);
         itemM7 = (LeatherArmorMeta)item7.getItemMeta();
         converted7 = new ArrayList();
         var25 = this.main.getStatsFile().getStringList("Red.Helmet.Lore").iterator();

         while(var25.hasNext()) {
            s7 = (String)var25.next();
            converted7.add(ChatColor.translateAlternateColorCodes('&', s7));
         }

         itemM7.setLore(converted7);
         itemM7.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Helmet.Name")));
         itemM7.setColor(Color.RED);
         item7.setItemMeta(itemM7);
         item8 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         itemM8 = (LeatherArmorMeta)item8.getItemMeta();
         converted8 = new ArrayList();
         var28 = this.main.getStatsFile().getStringList("Yellow.Chestplate.Lore").iterator();

         while(var28.hasNext()) {
            s8 = (String)var28.next();
            converted8.add(ChatColor.translateAlternateColorCodes('&', s8));
         }

         itemM8.setLore(converted8);
         itemM8.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Chestplate.Name")));
         itemM8.setColor(Color.YELLOW);
         item8.setItemMeta(itemM8);
         item9 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         itemM9 = (LeatherArmorMeta)item9.getItemMeta();
         converted9 = new ArrayList();
         var31 = this.main.getStatsFile().getStringList("Pink.Chestplate.Lore").iterator();

         while(var31.hasNext()) {
            s9 = (String)var31.next();
            converted9.add(ChatColor.translateAlternateColorCodes('&', s9));
         }

         itemM9.setLore(converted9);
         itemM9.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Chestplate.Name")));
         itemM9.setColor(Color.FUCHSIA);
         item9.setItemMeta(itemM9);
         item10 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         itemM10 = (LeatherArmorMeta)item10.getItemMeta();
         converted10 = new ArrayList();
         var34 = this.main.getStatsFile().getStringList("Red.Chestplate.Lore").iterator();

         while(var34.hasNext()) {
            s10 = (String)var34.next();
            converted10.add(ChatColor.translateAlternateColorCodes('&', s10));
         }

         itemM10.setLore(converted10);
         itemM10.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Chestplate.Name")));
         itemM10.setColor(Color.RED);
         item10.setItemMeta(itemM10);
         item11 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         itemM11 = (LeatherArmorMeta)item11.getItemMeta();
         converted11 = new ArrayList();
         var37 = this.main.getStatsFile().getStringList("Blue.Chestplate.Lore").iterator();

         while(var37.hasNext()) {
            s11 = (String)var37.next();
            converted11.add(ChatColor.translateAlternateColorCodes('&', s11));
         }

         itemM11.setLore(converted11);
         itemM11.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Chestplate.Name")));
         itemM11.setColor(Color.BLUE);
         item11.setItemMeta(itemM11);
         item12 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         itemM12 = (LeatherArmorMeta)item12.getItemMeta();
         converted12 = new ArrayList();
         var40 = this.main.getStatsFile().getStringList("Green.Chestplate.Lore").iterator();

         while(var40.hasNext()) {
            s12 = (String)var40.next();
            converted12.add(ChatColor.translateAlternateColorCodes('&', s12));
         }

         itemM12.setLore(converted12);
         itemM12.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Chestplate.Name")));
         itemM12.setColor(Color.GREEN);
         item12.setItemMeta(itemM12);
         item13 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         itemM13 = (LeatherArmorMeta)item13.getItemMeta();
         converted13 = new ArrayList();
         var43 = this.main.getStatsFile().getStringList("Gray.Chestplate.Lore").iterator();

         while(var43.hasNext()) {
            s13 = (String)var43.next();
            converted13.add(ChatColor.translateAlternateColorCodes('&', s13));
         }

         itemM13.setLore(converted13);
         itemM13.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Chestplate.Name")));
         itemM13.setColor(Color.GRAY);
         item13.setItemMeta(itemM13);
         item14 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         itemM14 = (LeatherArmorMeta)item14.getItemMeta();
         converted14 = new ArrayList();
         var46 = this.main.getStatsFile().getStringList("Black.Chestplate.Lore").iterator();

         while(var46.hasNext()) {
            s14 = (String)var46.next();
            converted14.add(ChatColor.translateAlternateColorCodes('&', s14));
         }

         itemM14.setLore(converted14);
         itemM14.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Chestplate.Name")));
         itemM14.setColor(Color.BLACK);
         item14.setItemMeta(itemM14);
         item15 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         itemM15 = (LeatherArmorMeta)item15.getItemMeta();
         converted15 = new ArrayList();
         var49 = this.main.getStatsFile().getStringList("Yellow.Leggings.Lore").iterator();

         while(var49.hasNext()) {
            s15 = (String)var49.next();
            converted15.add(ChatColor.translateAlternateColorCodes('&', s15));
         }

         itemM15.setLore(converted15);
         itemM15.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Leggings.Name")));
         itemM15.setColor(Color.YELLOW);
         item15.setItemMeta(itemM15);
         item16 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         itemM16 = (LeatherArmorMeta)item16.getItemMeta();
         converted16 = new ArrayList();
         var52 = this.main.getStatsFile().getStringList("Pink.Leggings.Lore").iterator();

         while(var52.hasNext()) {
            s16 = (String)var52.next();
            converted16.add(ChatColor.translateAlternateColorCodes('&', s16));
         }

         itemM16.setLore(converted16);
         itemM16.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Leggings.Name")));
         itemM16.setColor(Color.FUCHSIA);
         item16.setItemMeta(itemM16);
         item17 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         itemM17 = (LeatherArmorMeta)item17.getItemMeta();
         converted17 = new ArrayList();
         var55 = this.main.getStatsFile().getStringList("Red.Leggings.Lore").iterator();

         while(var55.hasNext()) {
            s17 = (String)var55.next();
            converted17.add(ChatColor.translateAlternateColorCodes('&', s17));
         }

         itemM17.setLore(converted17);
         itemM17.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Leggings.Name")));
         itemM17.setColor(Color.RED);
         item17.setItemMeta(itemM17);
         item18 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         itemM18 = (LeatherArmorMeta)item18.getItemMeta();
         converted18 = new ArrayList();
         var58 = this.main.getStatsFile().getStringList("Blue.Leggings.Lore").iterator();

         while(var58.hasNext()) {
            s18 = (String)var58.next();
            converted18.add(ChatColor.translateAlternateColorCodes('&', s18));
         }

         itemM18.setLore(converted18);
         itemM18.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Leggings.Name")));
         itemM18.setColor(Color.BLUE);
         item18.setItemMeta(itemM18);
         item19 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         itemM19 = (LeatherArmorMeta)item19.getItemMeta();
         converted19 = new ArrayList();
         var61 = this.main.getStatsFile().getStringList("Green.Leggings.Lore").iterator();

         while(var61.hasNext()) {
            s19 = (String)var61.next();
            converted19.add(ChatColor.translateAlternateColorCodes('&', s19));
         }

         itemM19.setLore(converted19);
         itemM19.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Leggings.Name")));
         itemM19.setColor(Color.GREEN);
         item19.setItemMeta(itemM19);
         item20 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         itemM20 = (LeatherArmorMeta)item20.getItemMeta();
         converted20 = new ArrayList();
         var64 = this.main.getStatsFile().getStringList("Gray.Leggings.Lore").iterator();

         while(var64.hasNext()) {
            s20 = (String)var64.next();
            converted20.add(ChatColor.translateAlternateColorCodes('&', s20));
         }

         itemM20.setLore(converted20);
         itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Leggings.Name")));
         itemM20.setColor(Color.GRAY);
         item20.setItemMeta(itemM20);
         item21 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         itemM21 = (LeatherArmorMeta)item21.getItemMeta();
         converted21 = new ArrayList();
         var67 = this.main.getStatsFile().getStringList("Black.Leggings.Lore").iterator();

         while(var67.hasNext()) {
            s21 = (String)var67.next();
            converted21.add(ChatColor.translateAlternateColorCodes('&', s21));
         }

         itemM21.setLore(converted21);
         itemM21.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Leggings.Name")));
         itemM21.setColor(Color.BLACK);
         item21.setItemMeta(itemM21);
         item22 = new ItemStack(Material.LEATHER_BOOTS, 1);
         itemM22 = (LeatherArmorMeta)item22.getItemMeta();
         converted22 = new ArrayList();
         var70 = this.main.getStatsFile().getStringList("Yellow.Boots.Lore").iterator();

         while(var70.hasNext()) {
            s22 = (String)var70.next();
            converted22.add(ChatColor.translateAlternateColorCodes('&', s22));
         }

         itemM22.setLore(converted22);
         itemM22.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Yellow.Boots.Name")));
         itemM22.setColor(Color.YELLOW);
         item22.setItemMeta(itemM22);
         item23 = new ItemStack(Material.LEATHER_BOOTS, 1);
         itemM23 = (LeatherArmorMeta)item23.getItemMeta();
         converted23 = new ArrayList();
         var73 = this.main.getStatsFile().getStringList("Pink.Boots.Lore").iterator();

         while(var73.hasNext()) {
            s23 = (String)var73.next();
            converted23.add(ChatColor.translateAlternateColorCodes('&', s23));
         }

         itemM23.setLore(converted23);
         itemM23.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Pink.Boots.Name")));
         itemM23.setColor(Color.FUCHSIA);
         item23.setItemMeta(itemM23);
         item24 = new ItemStack(Material.LEATHER_BOOTS, 1);
         itemM24 = (LeatherArmorMeta)item24.getItemMeta();
         converted24 = new ArrayList();
         var76 = this.main.getStatsFile().getStringList("Red.Boots.Lore").iterator();

         while(var76.hasNext()) {
            s24 = (String)var76.next();
            converted24.add(ChatColor.translateAlternateColorCodes('&', s24));
         }

         itemM24.setLore(converted24);
         itemM24.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Red.Boots.Name")));
         itemM24.setColor(Color.RED);
         item24.setItemMeta(itemM24);
         item25 = new ItemStack(Material.LEATHER_BOOTS, 1);
         itemM25 = (LeatherArmorMeta)item25.getItemMeta();
         converted25 = new ArrayList();
         var79 = this.main.getStatsFile().getStringList("Blue.Boots.Lore").iterator();

         while(var79.hasNext()) {
            s25 = (String)var79.next();
            converted25.add(ChatColor.translateAlternateColorCodes('&', s25));
         }

         itemM25.setLore(converted25);
         itemM25.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Blue.Boots.Name")));
         itemM25.setColor(Color.BLUE);
         item25.setItemMeta(itemM25);
         item26 = new ItemStack(Material.LEATHER_BOOTS, 1);
         itemM26 = (LeatherArmorMeta)item26.getItemMeta();
         converted26 = new ArrayList();
         var82 = this.main.getStatsFile().getStringList("Green.Boots.Lore").iterator();

         while(var82.hasNext()) {
            s26 = (String)var82.next();
            converted26.add(ChatColor.translateAlternateColorCodes('&', s26));
         }

         itemM26.setLore(converted26);
         itemM26.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Green.Boots.Name")));
         itemM26.setColor(Color.GREEN);
         item26.setItemMeta(itemM26);
         item27 = new ItemStack(Material.LEATHER_BOOTS, 1);
         itemM27 = (LeatherArmorMeta)item27.getItemMeta();
         converted27 = new ArrayList();
         var85 = this.main.getStatsFile().getStringList("Gray.Boots.Lore").iterator();

         while(var85.hasNext()) {
            s27 = (String)var85.next();
            converted27.add(ChatColor.translateAlternateColorCodes('&', s27));
         }

         itemM27.setLore(converted27);
         itemM27.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gray.Boots.Name")));
         itemM27.setColor(Color.GRAY);
         item27.setItemMeta(itemM27);
         item28 = new ItemStack(Material.LEATHER_BOOTS, 1);
         itemM28 = (LeatherArmorMeta)item28.getItemMeta();
         converted28 = new ArrayList();
         var88 = this.main.getStatsFile().getStringList("Back.Boots.Lore").iterator();

         while(var88.hasNext()) {
            s28 = (String)var88.next();
            converted28.add(ChatColor.translateAlternateColorCodes('&', s28));
         }

         itemM28.setLore(converted28);
         itemM28.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Black.Boots.Name")));
         itemM28.setColor(Color.BLACK);
         item28.setItemMeta(itemM28);
         back = new ItemStack(Material.SLIME_BALL);
         backm = back.getItemMeta();
         backm.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Back.Name")));
         backl = new ArrayList();
         var91 = this.main.getStatsFile().getStringList("Back.Lore").iterator();

         while(var91.hasNext()) {
            b1 = (String)var91.next();
            backl.add(ChatColor.translateAlternateColorCodes('&', b1));
         }

         backm.setLore(backl);
         back.setItemMeta(backm);
         next = new ItemStack(Material.ARROW);
         nextM = next.getItemMeta();
         nextM.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Next.Name")));
         nextl = new ArrayList();
         var94 = this.main.getStatsFile().getStringList("Back.Lore").iterator();

         while(var94.hasNext()) {
            n1 = (String)var94.next();
            nextl.add(ChatColor.translateAlternateColorCodes('&', n1));
         }

         nextM.setLore(nextl);
         next.setItemMeta(nextM);
         inv.setItem(10, item1);
         inv.setItem(11, item4);
         inv.setItem(12, item7);
         inv.setItem(13, item3);
         inv.setItem(14, item6);
         inv.setItem(15, item5);
         inv.setItem(16, item2);
         inv.setItem(19, item8);
         inv.setItem(20, item9);
         inv.setItem(21, item10);
         inv.setItem(22, item11);
         inv.setItem(23, item12);
         inv.setItem(24, item13);
         inv.setItem(25, item14);
         inv.setItem(28, item15);
         inv.setItem(29, item16);
         inv.setItem(30, item17);
         inv.setItem(31, item18);
         inv.setItem(32, item19);
         inv.setItem(33, item20);
         inv.setItem(34, item21);
         inv.setItem(37, item22);
         inv.setItem(38, item23);
         inv.setItem(39, item24);
         inv.setItem(40, item25);
         inv.setItem(41, item26);
         inv.setItem(42, item27);
         inv.setItem(43, item28);
         inv.setItem(45, next);
         inv.setItem(53, back);
         p.openInventory(inv);
      }

   }
}
