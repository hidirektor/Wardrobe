package me.bronzzze.wardrobe;

import java.util.ArrayList;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ArmourGUIpage2 {
   private Main main;

   public ArmourGUIpage2(Main main) {
      this.main = main;
   }

   public void openInventory(Player p) {
      Inventory inv = Bukkit.getServer().createInventory((InventoryHolder)null, 54, ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ArmourSelectorMenuName")));
      ItemStack item1;
      ItemMeta itemM1;
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
      ArrayList backl;
      String b1;
      Iterator var67;
      ItemStack item2;
      ItemMeta itemM2;
      ItemStack item3;
      ItemMeta itemM3;
      ItemStack item4;
      ItemMeta itemM4;
      ItemStack item5;
      ItemMeta itemM5;
      ItemStack item6;
      ItemMeta itemM6;
      ItemStack item7;
      ItemMeta itemM7;
      ItemStack item8;
      ItemMeta itemM8;
      ItemStack item9;
      ItemMeta itemM9;
      ItemStack item10;
      ItemMeta itemM10;
      ItemStack item11;
      ItemMeta itemM11;
      ItemStack item12;
      ItemMeta itemM12;
      ItemStack item13;
      ItemMeta itemM13;
      ItemStack item14;
      ItemMeta itemM14;
      ItemStack item15;
      ItemMeta itemM15;
      ItemStack item16;
      ItemMeta itemM16;
      ItemStack item17;
      ItemMeta itemM17;
      ItemStack item18;
      ItemMeta itemM18;
      ItemStack item19;
      ItemMeta itemM19;
      ItemStack item20;
      ItemMeta itemM20;
      ItemStack back;
      ItemMeta backm;
      if (this.main.getConfig().getBoolean("Enchantments")) {
         item1 = new ItemStack(Material.DIAMOND_HELMET, 1);
         item1.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM1 = item1.getItemMeta();
         converted1 = new ArrayList();
         var7 = this.main.getStatsFile().getStringList("Diamond.Helmet.Lore").iterator();

         while(var7.hasNext()) {
            s1 = (String)var7.next();
            converted1.add(ChatColor.translateAlternateColorCodes('&', s1));
         }

         itemM1.setLore(converted1);
         itemM1.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Helmet.Name")));
         item1.setItemMeta(itemM1);
         item2 = new ItemStack(Material.IRON_HELMET, 1);
         item2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM2 = item2.getItemMeta();
         converted2 = new ArrayList();
         var10 = this.main.getStatsFile().getStringList("Iron.Helmet.Lore").iterator();

         while(var10.hasNext()) {
            s2 = (String)var10.next();
            converted2.add(ChatColor.translateAlternateColorCodes('&', s2));
         }

         itemM2.setLore(converted2);
         itemM2.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Helmet.Name")));
         item2.setItemMeta(itemM2);
         item3 = new ItemStack(Material.GOLD_HELMET, 1);
         item3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM3 = item3.getItemMeta();
         converted3 = new ArrayList();
         var13 = this.main.getStatsFile().getStringList("Gold.Helmet.Lore").iterator();

         while(var13.hasNext()) {
            s3 = (String)var13.next();
            converted3.add(ChatColor.translateAlternateColorCodes('&', s3));
         }

         itemM3.setLore(converted3);
         itemM3.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Helmet.Name")));
         item3.setItemMeta(itemM3);
         item4 = new ItemStack(Material.CHAINMAIL_HELMET, 1);
         item4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM4 = item4.getItemMeta();
         converted4 = new ArrayList();
         var16 = this.main.getStatsFile().getStringList("Chainmail.Helmet.Lore").iterator();

         while(var16.hasNext()) {
            s4 = (String)var16.next();
            converted4.add(ChatColor.translateAlternateColorCodes('&', s4));
         }

         itemM4.setLore(converted4);
         itemM4.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Helmet.Name")));
         item4.setItemMeta(itemM4);
         item5 = new ItemStack(Material.LEATHER_HELMET, 1);
         item5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM5 = item5.getItemMeta();
         converted5 = new ArrayList();
         var19 = this.main.getStatsFile().getStringList("Leather.Helmet.Lore").iterator();

         while(var19.hasNext()) {
            s5 = (String)var19.next();
            converted5.add(ChatColor.translateAlternateColorCodes('&', s5));
         }

         itemM5.setLore(converted5);
         itemM5.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Helmet.Name")));
         item5.setItemMeta(itemM5);
         item6 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
         item6.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM6 = item6.getItemMeta();
         converted6 = new ArrayList();
         var22 = this.main.getStatsFile().getStringList("Diamond.Chestplate.Lore").iterator();

         while(var22.hasNext()) {
            s6 = (String)var22.next();
            converted6.add(ChatColor.translateAlternateColorCodes('&', s6));
         }

         itemM6.setLore(converted6);
         itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Chestplate.Name")));
         item6.setItemMeta(itemM6);
         item7 = new ItemStack(Material.IRON_CHESTPLATE, 1);
         item7.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM7 = item7.getItemMeta();
         converted7 = new ArrayList();
         var25 = this.main.getStatsFile().getStringList("Iron.Chestplate.Lore").iterator();

         while(var25.hasNext()) {
            s7 = (String)var25.next();
            converted7.add(ChatColor.translateAlternateColorCodes('&', s7));
         }

         itemM7.setLore(converted7);
         itemM7.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Chestplate.Name")));
         item7.setItemMeta(itemM7);
         item8 = new ItemStack(Material.GOLD_CHESTPLATE, 1);
         item8.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM8 = item8.getItemMeta();
         converted8 = new ArrayList();
         var28 = this.main.getStatsFile().getStringList("Gold.Chestplate.Lore").iterator();

         while(var28.hasNext()) {
            s8 = (String)var28.next();
            converted8.add(ChatColor.translateAlternateColorCodes('&', s8));
         }

         itemM8.setLore(converted8);
         itemM8.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Chestplate.Name")));
         item8.setItemMeta(itemM8);
         item9 = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
         item9.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM9 = item9.getItemMeta();
         converted9 = new ArrayList();
         var31 = this.main.getStatsFile().getStringList("Chainmail.Chestplate.Lore").iterator();

         while(var31.hasNext()) {
            s9 = (String)var31.next();
            converted9.add(ChatColor.translateAlternateColorCodes('&', s9));
         }

         itemM9.setLore(converted9);
         itemM9.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Chestplate.Name")));
         item9.setItemMeta(itemM9);
         item10 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         item10.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM10 = item10.getItemMeta();
         converted10 = new ArrayList();
         var34 = this.main.getStatsFile().getStringList("Leather.Chestplate.Lore").iterator();

         while(var34.hasNext()) {
            s10 = (String)var34.next();
            converted10.add(ChatColor.translateAlternateColorCodes('&', s10));
         }

         itemM10.setLore(converted10);
         itemM10.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Chestplate.Name")));
         item10.setItemMeta(itemM10);
         item11 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
         item11.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM11 = item11.getItemMeta();
         converted11 = new ArrayList();
         var37 = this.main.getStatsFile().getStringList("Diamond.Leggings.Lore").iterator();

         while(var37.hasNext()) {
            s11 = (String)var37.next();
            converted11.add(ChatColor.translateAlternateColorCodes('&', s11));
         }

         itemM11.setLore(converted11);
         itemM11.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Leggings.Name")));
         item11.setItemMeta(itemM11);
         item12 = new ItemStack(Material.IRON_LEGGINGS, 1);
         item12.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM12 = item12.getItemMeta();
         converted12 = new ArrayList();
         var40 = this.main.getStatsFile().getStringList("Iron.Leggings.Lore").iterator();

         while(var40.hasNext()) {
            s12 = (String)var40.next();
            converted12.add(ChatColor.translateAlternateColorCodes('&', s12));
         }

         itemM12.setLore(converted12);
         itemM12.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Leggings.Name")));
         item12.setItemMeta(itemM12);
         item13 = new ItemStack(Material.GOLD_LEGGINGS, 1);
         item13.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM13 = item13.getItemMeta();
         converted13 = new ArrayList();
         var43 = this.main.getStatsFile().getStringList("Gold.Leggings.Lore").iterator();

         while(var43.hasNext()) {
            s13 = (String)var43.next();
            converted13.add(ChatColor.translateAlternateColorCodes('&', s13));
         }

         itemM13.setLore(converted13);
         itemM13.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Leggings.Name")));
         item13.setItemMeta(itemM13);
         item14 = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
         item14.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM14 = item14.getItemMeta();
         converted14 = new ArrayList();
         var46 = this.main.getStatsFile().getStringList("Chainmail.Leggings.Lore").iterator();

         while(var46.hasNext()) {
            s14 = (String)var46.next();
            converted14.add(ChatColor.translateAlternateColorCodes('&', s14));
         }

         itemM14.setLore(converted14);
         itemM14.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Leggings.Name")));
         item14.setItemMeta(itemM14);
         item15 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         item15.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM15 = item15.getItemMeta();
         converted15 = new ArrayList();
         var49 = this.main.getStatsFile().getStringList("Leather.Leggings.Lore").iterator();

         while(var49.hasNext()) {
            s15 = (String)var49.next();
            converted15.add(ChatColor.translateAlternateColorCodes('&', s15));
         }

         itemM15.setLore(converted15);
         itemM15.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Leggings.Name")));
         item15.setItemMeta(itemM15);
         item16 = new ItemStack(Material.DIAMOND_BOOTS, 1);
         item16.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM16 = item16.getItemMeta();
         converted16 = new ArrayList();
         var52 = this.main.getStatsFile().getStringList("Diamond.Boots.Lore").iterator();

         while(var52.hasNext()) {
            s16 = (String)var52.next();
            converted16.add(ChatColor.translateAlternateColorCodes('&', s16));
         }

         itemM16.setLore(converted16);
         itemM16.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Boots.Name")));
         item16.setItemMeta(itemM16);
         item17 = new ItemStack(Material.IRON_BOOTS, 1);
         item17.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM17 = item17.getItemMeta();
         converted17 = new ArrayList();
         var55 = this.main.getStatsFile().getStringList("Iron.Boots.Lore").iterator();

         while(var55.hasNext()) {
            s17 = (String)var55.next();
            converted17.add(ChatColor.translateAlternateColorCodes('&', s17));
         }

         itemM17.setLore(converted17);
         itemM17.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Boots.Name")));
         item17.setItemMeta(itemM17);
         item18 = new ItemStack(Material.GOLD_BOOTS, 1);
         item18.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM18 = item18.getItemMeta();
         converted18 = new ArrayList();
         var58 = this.main.getStatsFile().getStringList("Gold.Boots.Lore").iterator();

         while(var58.hasNext()) {
            s18 = (String)var58.next();
            converted18.add(ChatColor.translateAlternateColorCodes('&', s18));
         }

         itemM18.setLore(converted18);
         itemM18.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Boots.Name")));
         item18.setItemMeta(itemM18);
         item19 = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
         item19.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM19 = item19.getItemMeta();
         converted19 = new ArrayList();
         var61 = this.main.getStatsFile().getStringList("Chainmail.Boots.Lore").iterator();

         while(var61.hasNext()) {
            s19 = (String)var61.next();
            converted19.add(ChatColor.translateAlternateColorCodes('&', s19));
         }

         itemM19.setLore(converted19);
         itemM19.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Boots.Name")));
         item19.setItemMeta(itemM19);
         item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
         item20.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
         itemM20 = item20.getItemMeta();
         converted20 = new ArrayList();
         var64 = this.main.getStatsFile().getStringList("Leather.Boots.Lore").iterator();

         while(var64.hasNext()) {
            s20 = (String)var64.next();
            converted20.add(ChatColor.translateAlternateColorCodes('&', s20));
         }

         itemM20.setLore(converted20);
         itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Boots.Name")));
         item20.setItemMeta(itemM20);
         back = new ItemStack(Material.SLIME_BALL);
         backm = back.getItemMeta();
         backm.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Back.Name")));
         backl = new ArrayList();
         var67 = this.main.getStatsFile().getStringList("Back.Lore").iterator();

         while(var67.hasNext()) {
            b1 = (String)var67.next();
            backl.add(ChatColor.translateAlternateColorCodes('&', b1));
         }

         backm.setLore(backl);
         back.setItemMeta(backm);
         inv.setItem(11, item1);
         inv.setItem(12, item2);
         inv.setItem(13, item3);
         inv.setItem(14, item4);
         inv.setItem(15, item5);
         inv.setItem(20, item6);
         inv.setItem(21, item7);
         inv.setItem(22, item8);
         inv.setItem(23, item9);
         inv.setItem(24, item10);
         inv.setItem(29, item11);
         inv.setItem(30, item12);
         inv.setItem(31, item13);
         inv.setItem(32, item14);
         inv.setItem(33, item15);
         inv.setItem(38, item16);
         inv.setItem(39, item17);
         inv.setItem(40, item18);
         inv.setItem(41, item19);
         inv.setItem(42, item20);
         inv.setItem(53, back);
         p.openInventory(inv);
      } else {
         item1 = new ItemStack(Material.DIAMOND_HELMET, 1);
         itemM1 = item1.getItemMeta();
         converted1 = new ArrayList();
         var7 = this.main.getStatsFile().getStringList("Diamond.Helmet.Lore").iterator();

         while(var7.hasNext()) {
            s1 = (String)var7.next();
            converted1.add(ChatColor.translateAlternateColorCodes('&', s1));
         }

         itemM1.setLore(converted1);
         itemM1.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Helmet.Name")));
         item1.setItemMeta(itemM1);
         item2 = new ItemStack(Material.IRON_HELMET, 1);
         itemM2 = item2.getItemMeta();
         converted2 = new ArrayList();
         var10 = this.main.getStatsFile().getStringList("Iron.Helmet.Lore").iterator();

         while(var10.hasNext()) {
            s2 = (String)var10.next();
            converted2.add(ChatColor.translateAlternateColorCodes('&', s2));
         }

         itemM2.setLore(converted2);
         itemM2.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Helmet.Name")));
         item2.setItemMeta(itemM2);
         item3 = new ItemStack(Material.GOLD_HELMET, 1);
         itemM3 = item3.getItemMeta();
         converted3 = new ArrayList();
         var13 = this.main.getStatsFile().getStringList("Gold.Helmet.Lore").iterator();

         while(var13.hasNext()) {
            s3 = (String)var13.next();
            converted3.add(ChatColor.translateAlternateColorCodes('&', s3));
         }

         itemM3.setLore(converted3);
         itemM3.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Helmet.Name")));
         item3.setItemMeta(itemM3);
         item4 = new ItemStack(Material.CHAINMAIL_HELMET, 1);
         itemM4 = item4.getItemMeta();
         converted4 = new ArrayList();
         var16 = this.main.getStatsFile().getStringList("Chainmail.Helmet.Lore").iterator();

         while(var16.hasNext()) {
            s4 = (String)var16.next();
            converted4.add(ChatColor.translateAlternateColorCodes('&', s4));
         }

         itemM4.setLore(converted4);
         itemM4.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Helmet.Name")));
         item4.setItemMeta(itemM4);
         item5 = new ItemStack(Material.LEATHER_HELMET, 1);
         itemM5 = item5.getItemMeta();
         converted5 = new ArrayList();
         var19 = this.main.getStatsFile().getStringList("Leather.Helmet.Lore").iterator();

         while(var19.hasNext()) {
            s5 = (String)var19.next();
            converted5.add(ChatColor.translateAlternateColorCodes('&', s5));
         }

         itemM5.setLore(converted5);
         itemM5.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Helmet.Name")));
         item5.setItemMeta(itemM5);
         item6 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
         itemM6 = item6.getItemMeta();
         converted6 = new ArrayList();
         var22 = this.main.getStatsFile().getStringList("Diamond.Chestplate.Lore").iterator();

         while(var22.hasNext()) {
            s6 = (String)var22.next();
            converted6.add(ChatColor.translateAlternateColorCodes('&', s6));
         }

         itemM6.setLore(converted6);
         itemM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Chestplate.Name")));
         item6.setItemMeta(itemM6);
         item7 = new ItemStack(Material.IRON_CHESTPLATE, 1);
         itemM7 = item7.getItemMeta();
         converted7 = new ArrayList();
         var25 = this.main.getStatsFile().getStringList("Iron.Chestplate.Lore").iterator();

         while(var25.hasNext()) {
            s7 = (String)var25.next();
            converted7.add(ChatColor.translateAlternateColorCodes('&', s7));
         }

         itemM7.setLore(converted7);
         itemM7.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Chestplate.Name")));
         item7.setItemMeta(itemM7);
         item8 = new ItemStack(Material.GOLD_CHESTPLATE, 1);
         itemM8 = item8.getItemMeta();
         converted8 = new ArrayList();
         var28 = this.main.getStatsFile().getStringList("Gold.Chestplate.Lore").iterator();

         while(var28.hasNext()) {
            s8 = (String)var28.next();
            converted8.add(ChatColor.translateAlternateColorCodes('&', s8));
         }

         itemM8.setLore(converted8);
         itemM8.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Chestplate.Name")));
         item8.setItemMeta(itemM8);
         item9 = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
         itemM9 = item9.getItemMeta();
         converted9 = new ArrayList();
         var31 = this.main.getStatsFile().getStringList("Chainmail.Chestplate.Lore").iterator();

         while(var31.hasNext()) {
            s9 = (String)var31.next();
            converted9.add(ChatColor.translateAlternateColorCodes('&', s9));
         }

         itemM9.setLore(converted9);
         itemM9.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Chestplate.Name")));
         item9.setItemMeta(itemM9);
         item10 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
         itemM10 = item10.getItemMeta();
         converted10 = new ArrayList();
         var34 = this.main.getStatsFile().getStringList("Leather.Chestplate.Lore").iterator();

         while(var34.hasNext()) {
            s10 = (String)var34.next();
            converted10.add(ChatColor.translateAlternateColorCodes('&', s10));
         }

         itemM10.setLore(converted10);
         itemM10.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Chestplate.Name")));
         item10.setItemMeta(itemM10);
         item11 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
         itemM11 = item11.getItemMeta();
         converted11 = new ArrayList();
         var37 = this.main.getStatsFile().getStringList("Diamond.Leggings.Lore").iterator();

         while(var37.hasNext()) {
            s11 = (String)var37.next();
            converted11.add(ChatColor.translateAlternateColorCodes('&', s11));
         }

         itemM11.setLore(converted11);
         itemM11.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Leggings.Name")));
         item11.setItemMeta(itemM11);
         item12 = new ItemStack(Material.IRON_LEGGINGS, 1);
         itemM12 = item12.getItemMeta();
         converted12 = new ArrayList();
         var40 = this.main.getStatsFile().getStringList("Iron.Leggings.Lore").iterator();

         while(var40.hasNext()) {
            s12 = (String)var40.next();
            converted12.add(ChatColor.translateAlternateColorCodes('&', s12));
         }

         itemM12.setLore(converted12);
         itemM12.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Leggings.Name")));
         item12.setItemMeta(itemM12);
         item13 = new ItemStack(Material.GOLD_LEGGINGS, 1);
         itemM13 = item13.getItemMeta();
         converted13 = new ArrayList();
         var43 = this.main.getStatsFile().getStringList("Gold.Leggings.Lore").iterator();

         while(var43.hasNext()) {
            s13 = (String)var43.next();
            converted13.add(ChatColor.translateAlternateColorCodes('&', s13));
         }

         itemM13.setLore(converted13);
         itemM13.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Leggings.Name")));
         item13.setItemMeta(itemM13);
         item14 = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
         itemM14 = item14.getItemMeta();
         converted14 = new ArrayList();
         var46 = this.main.getStatsFile().getStringList("Chainmail.Leggings.Lore").iterator();

         while(var46.hasNext()) {
            s14 = (String)var46.next();
            converted14.add(ChatColor.translateAlternateColorCodes('&', s14));
         }

         itemM14.setLore(converted14);
         itemM14.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Leggings.Name")));
         item14.setItemMeta(itemM14);
         item15 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
         itemM15 = item15.getItemMeta();
         converted15 = new ArrayList();
         var49 = this.main.getStatsFile().getStringList("Leather.Leggings.Lore").iterator();

         while(var49.hasNext()) {
            s15 = (String)var49.next();
            converted15.add(ChatColor.translateAlternateColorCodes('&', s15));
         }

         itemM15.setLore(converted15);
         itemM15.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Leggings.Name")));
         item15.setItemMeta(itemM15);
         item16 = new ItemStack(Material.DIAMOND_BOOTS, 1);
         itemM16 = item16.getItemMeta();
         converted16 = new ArrayList();
         var52 = this.main.getStatsFile().getStringList("Diamond.Boots.Lore").iterator();

         while(var52.hasNext()) {
            s16 = (String)var52.next();
            converted16.add(ChatColor.translateAlternateColorCodes('&', s16));
         }

         itemM16.setLore(converted16);
         itemM16.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Diamond.Boots.Name")));
         item16.setItemMeta(itemM16);
         item17 = new ItemStack(Material.IRON_BOOTS, 1);
         itemM17 = item17.getItemMeta();
         converted17 = new ArrayList();
         var55 = this.main.getStatsFile().getStringList("Iron.Boots.Lore").iterator();

         while(var55.hasNext()) {
            s17 = (String)var55.next();
            converted17.add(ChatColor.translateAlternateColorCodes('&', s17));
         }

         itemM17.setLore(converted17);
         itemM17.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Iron.Boots.Name")));
         item17.setItemMeta(itemM17);
         item18 = new ItemStack(Material.GOLD_BOOTS, 1);
         itemM18 = item18.getItemMeta();
         converted18 = new ArrayList();
         var58 = this.main.getStatsFile().getStringList("Gold.Boots.Lore").iterator();

         while(var58.hasNext()) {
            s18 = (String)var58.next();
            converted18.add(ChatColor.translateAlternateColorCodes('&', s18));
         }

         itemM18.setLore(converted18);
         itemM18.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Gold.Boots.Name")));
         item18.setItemMeta(itemM18);
         item19 = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
         itemM19 = item19.getItemMeta();
         converted19 = new ArrayList();
         var61 = this.main.getStatsFile().getStringList("Chainmail.Boots.Lore").iterator();

         while(var61.hasNext()) {
            s19 = (String)var61.next();
            converted19.add(ChatColor.translateAlternateColorCodes('&', s19));
         }

         itemM19.setLore(converted19);
         itemM19.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Chainmail.Boots.Name")));
         item19.setItemMeta(itemM19);
         item20 = new ItemStack(Material.LEATHER_BOOTS, 1);
         itemM20 = item20.getItemMeta();
         converted20 = new ArrayList();
         var64 = this.main.getStatsFile().getStringList("Leather.Boots.Lore").iterator();

         while(var64.hasNext()) {
            s20 = (String)var64.next();
            converted20.add(ChatColor.translateAlternateColorCodes('&', s20));
         }

         itemM20.setLore(converted20);
         itemM20.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Leather.Boots.Name")));
         item20.setItemMeta(itemM20);
         back = new ItemStack(Material.SLIME_BALL);
         backm = back.getItemMeta();
         backm.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Back.Name")));
         backl = new ArrayList();
         var67 = this.main.getStatsFile().getStringList("Back.Lore").iterator();

         while(var67.hasNext()) {
            b1 = (String)var67.next();
            backl.add(ChatColor.translateAlternateColorCodes('&', b1));
         }

         backm.setLore(backl);
         back.setItemMeta(backm);
         inv.setItem(11, item1);
         inv.setItem(12, item2);
         inv.setItem(13, item3);
         inv.setItem(14, item4);
         inv.setItem(15, item5);
         inv.setItem(20, item6);
         inv.setItem(21, item7);
         inv.setItem(22, item8);
         inv.setItem(23, item9);
         inv.setItem(24, item10);
         inv.setItem(29, item11);
         inv.setItem(30, item12);
         inv.setItem(31, item13);
         inv.setItem(32, item14);
         inv.setItem(33, item15);
         inv.setItem(38, item16);
         inv.setItem(39, item17);
         inv.setItem(40, item18);
         inv.setItem(41, item19);
         inv.setItem(42, item20);
         inv.setItem(53, back);
         p.openInventory(inv);
      }

   }
}
