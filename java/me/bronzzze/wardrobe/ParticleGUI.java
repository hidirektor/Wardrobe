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

public class ParticleGUI {
   private Main main;

   public ParticleGUI(Main main) {
      this.main = main;
   }

   public void openInventory(Player p) {
      Inventory inv = Bukkit.getServer().createInventory((InventoryHolder)null, 54, ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ParticleMenuName")));
      ItemStack part1 = new ItemStack(Material.NOTE_BLOCK, 1);
      ItemMeta partM1 = part1.getItemMeta();
      partM1.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Note Particle.Name")));
      List<String> converted1 = new ArrayList();
      Iterator var7 = this.main.getStatsFile().getStringList("Note Particle.Lore").iterator();

      while(var7.hasNext()) {
         String s1 = (String)var7.next();
         converted1.add(ChatColor.translateAlternateColorCodes('&', s1));
      }

      partM1.setLore(converted1);
      part1.setItemMeta(partM1);
      ItemStack part2 = new ItemStack(Material.REDSTONE, 1);
      ItemMeta partM2 = part2.getItemMeta();
      partM2.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Redstone Particle.Name")));
      List<String> converted2 = new ArrayList();
      Iterator var10 = this.main.getStatsFile().getStringList("Redstone Particle.Lore").iterator();

      while(var10.hasNext()) {
         String s2 = (String)var10.next();
         converted2.add(ChatColor.translateAlternateColorCodes('&', s2));
      }

      partM2.setLore(converted2);
      part2.setItemMeta(partM2);
      ItemStack part3 = new ItemStack(Material.WATER_BUCKET, 1);
      ItemMeta partM3 = part3.getItemMeta();
      partM3.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Water Particle.Name")));
      List<String> converted3 = new ArrayList();
      Iterator var13 = this.main.getStatsFile().getStringList("Water Particle.Lore").iterator();

      while(var13.hasNext()) {
         String s3 = (String)var13.next();
         converted3.add(ChatColor.translateAlternateColorCodes('&', s3));
      }

      partM3.setLore(converted3);
      part3.setItemMeta(partM3);
      ItemStack part4 = new ItemStack(Material.EMERALD, 1);
      ItemMeta partM4 = part4.getItemMeta();
      partM4.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("AngryVillager Particle.Name")));
      List<String> converted4 = new ArrayList();
      Iterator var16 = this.main.getStatsFile().getStringList("AngryVillager Particle.Lore").iterator();

      while(var16.hasNext()) {
         String s4 = (String)var16.next();
         converted4.add(ChatColor.translateAlternateColorCodes('&', s4));
      }

      partM4.setLore(converted4);
      part4.setItemMeta(partM4);
      ItemStack part5 = new ItemStack(Material.POTION, 1);
      ItemMeta partM5 = part5.getItemMeta();
      partM5.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Spell Particle.Name")));
      List<String> converted5 = new ArrayList();
      Iterator var19 = this.main.getStatsFile().getStringList("Spell Particle.Lore").iterator();

      while(var19.hasNext()) {
         String s5 = (String)var19.next();
         converted5.add(ChatColor.translateAlternateColorCodes('&', s5));
      }

      partM5.setLore(converted5);
      part5.setItemMeta(partM5);
      ItemStack part6 = new ItemStack(Material.RED_ROSE, 1);
      ItemMeta partM6 = part6.getItemMeta();
      partM6.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Heart Particle.Name")));
      List<String> converted6 = new ArrayList();
      Iterator var22 = this.main.getStatsFile().getStringList("Heart Particle.Lore").iterator();

      while(var22.hasNext()) {
         String s6 = (String)var22.next();
         converted6.add(ChatColor.translateAlternateColorCodes('&', s6));
      }

      partM6.setLore(converted6);
      part6.setItemMeta(partM6);
      ItemStack part7 = new ItemStack(Material.NETHER_STAR, 1);
      ItemMeta partM7 = part7.getItemMeta();
      partM7.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Star Particle.Name")));
      List<String> converted7 = new ArrayList();
      Iterator var25 = this.main.getStatsFile().getStringList("Star Particle.Lore").iterator();

      while(var25.hasNext()) {
         String s7 = (String)var25.next();
         converted7.add(ChatColor.translateAlternateColorCodes('&', s7));
      }

      partM7.setLore(converted7);
      part7.setItemMeta(partM7);
      ItemStack part8 = new ItemStack(Material.SNOW_BALL);
      ItemMeta partM8 = part8.getItemMeta();
      partM8.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Snowball Particle.Name")));
      List<String> converted8 = new ArrayList();
      Iterator var28 = this.main.getStatsFile().getStringList("Snowball Particle.Lore").iterator();

      while(var28.hasNext()) {
         String s8 = (String)var28.next();
         converted8.add(ChatColor.translateAlternateColorCodes('&', s8));
      }

      partM8.setLore(converted8);
      part8.setItemMeta(partM8);
      ItemStack part9 = new ItemStack(Material.BOOKSHELF);
      ItemMeta partM9 = part9.getItemMeta();
      partM9.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("HappyVilliger Particle.Name")));
      List<String> converted9 = new ArrayList();
      Iterator var31 = this.main.getStatsFile().getStringList("HappyVilliger Particle.Lore").iterator();

      while(var31.hasNext()) {
         String s9 = (String)var31.next();
         converted9.add(ChatColor.translateAlternateColorCodes('&', s9));
      }

      partM9.setLore(converted9);
      part9.setItemMeta(partM9);
      ItemStack part10 = new ItemStack(Material.ENCHANTMENT_TABLE, 1);
      ItemMeta partM10 = part10.getItemMeta();
      partM10.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Enchantment Particle.Name")));
      List<String> converted10 = new ArrayList();
      Iterator var34 = this.main.getStatsFile().getStringList("Enchantment Particle.Lore").iterator();

      while(var34.hasNext()) {
         String s10 = (String)var34.next();
         converted10.add(ChatColor.translateAlternateColorCodes('&', s10));
      }

      partM10.setLore(converted10);
      part10.setItemMeta(partM10);
      ItemStack part11 = new ItemStack(Material.ANVIL, 1);
      ItemMeta partM11 = part11.getItemMeta();
      partM11.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Twister Particle.Name")));
      List<String> converted11 = new ArrayList();
      Iterator var37 = this.main.getStatsFile().getStringList("Twister Particle.Lore").iterator();

      while(var37.hasNext()) {
         String s11 = (String)var37.next();
         converted11.add(ChatColor.translateAlternateColorCodes('&', s11));
      }

      partM11.setLore(converted11);
      part11.setItemMeta(partM11);
      ItemStack part12 = new ItemStack(Material.CAULDRON_ITEM, 1);
      ItemMeta partM12 = part12.getItemMeta();
      partM12.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Magic Particle.Name")));
      List<String> converted12 = new ArrayList();
      Iterator var40 = this.main.getStatsFile().getStringList("Magic Particle.Lore").iterator();

      while(var40.hasNext()) {
         String s12 = (String)var40.next();
         converted12.add(ChatColor.translateAlternateColorCodes('&', s12));
      }

      partM12.setLore(converted12);
      part12.setItemMeta(partM12);
      ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)15);
      ItemMeta emptyM = empty.getItemMeta();
      emptyM.setDisplayName(ChatColor.GRAY + " ");
      empty.setItemMeta(emptyM);
      ItemStack remove = new ItemStack(Material.MAGMA_CREAM);
      ItemMeta removeM = remove.getItemMeta();
      removeM.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("RemoveParticles.Name")));
      List<String> removel = new ArrayList();
      Iterator var45 = this.main.getStatsFile().getStringList("RemoveParticles.Lore").iterator();

      while(var45.hasNext()) {
         String r1 = (String)var45.next();
         removel.add(ChatColor.translateAlternateColorCodes('&', r1));
      }

      removeM.setLore(removel);
      remove.setItemMeta(removeM);
      ItemStack back = new ItemStack(Material.SLIME_BALL);
      ItemMeta backm = back.getItemMeta();
      backm.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Back.Name")));
      List<String> backl = new ArrayList();
      Iterator var48 = this.main.getStatsFile().getStringList("Back.Lore").iterator();

      while(var48.hasNext()) {
         String b1 = (String)var48.next();
         backl.add(ChatColor.translateAlternateColorCodes('&', b1));
      }

      backm.setLore(backl);
      back.setItemMeta(backm);
      inv.setItem(0, empty);
      inv.setItem(1, empty);
      inv.setItem(2, empty);
      inv.setItem(3, empty);
      inv.setItem(4, empty);
      inv.setItem(5, empty);
      inv.setItem(6, empty);
      inv.setItem(7, empty);
      inv.setItem(8, empty);
      inv.setItem(9, empty);
      inv.setItem(10, part1);
      inv.setItem(11, empty);
      inv.setItem(12, part9);
      inv.setItem(13, empty);
      inv.setItem(14, part10);
      inv.setItem(15, empty);
      inv.setItem(16, part2);
      inv.setItem(17, empty);
      inv.setItem(18, empty);
      inv.setItem(19, empty);
      inv.setItem(20, part4);
      inv.setItem(21, empty);
      inv.setItem(22, part8);
      inv.setItem(23, empty);
      inv.setItem(24, part3);
      inv.setItem(25, empty);
      inv.setItem(26, empty);
      inv.setItem(27, empty);
      inv.setItem(28, empty);
      inv.setItem(29, empty);
      inv.setItem(30, part6);
      inv.setItem(31, empty);
      inv.setItem(32, part5);
      inv.setItem(33, empty);
      inv.setItem(34, empty);
      inv.setItem(35, empty);
      inv.setItem(36, empty);
      inv.setItem(37, empty);
      inv.setItem(38, part11);
      inv.setItem(39, empty);
      inv.setItem(40, part7);
      inv.setItem(41, empty);
      inv.setItem(42, part12);
      inv.setItem(43, empty);
      inv.setItem(44, empty);
      inv.setItem(45, remove);
      inv.setItem(46, empty);
      inv.setItem(47, empty);
      inv.setItem(48, empty);
      inv.setItem(49, empty);
      inv.setItem(50, empty);
      inv.setItem(51, empty);
      inv.setItem(52, empty);
      inv.setItem(53, back);
      p.openInventory(inv);
   }
}
