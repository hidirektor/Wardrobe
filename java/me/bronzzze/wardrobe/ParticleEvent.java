package me.bronzzze.wardrobe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import particlelib.ParticleEffect;

public class ParticleEvent implements Listener {
   private final Main main;
   public static int redstone;
   public static int note;
   public static int villager;
   public static int spell;
   public static int water;
   public static int heart;
   public static int star;
   public static int snowball;
   public static int happy;
   public static int enchantment;

   public ParticleEvent(Main main) {
      this.main = main;
   }

   @EventHandler
   public void onClick(InventoryClickEvent e) {
      final Player p = (Player)e.getWhoClicked();
      final World w = p.getWorld();
      if (e.getInventory().getName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("ParticleMenuName")))) {
         if (e.getCurrentItem() == null) {
            return;
         }

         e.setCancelled(true);
         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Note Particle.Name")))) {
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            note = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 1;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.125D);
                  if (this.time == 1) {
                     ParticleEffect.NOTE.display(0.0F, 0.0F, 0.0F, 2.0F, 3, l, 15.0D);
                     ++this.time;
                  }

                  --this.time;
               }
            }, 1L, 2L);
            this.main.note.put(p.getName(), note);
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Back.Name")))) {
            this.main.mainGUI.openInventory(p);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Redstone Particle.Name")))) {
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            redstone = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 12;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.0D);
                  Location loc1 = new Location(w, l.getX() + 0.5D, l.getY(), l.getZ());
                  Location loc2 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc3 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc4 = new Location(w, l.getX(), l.getY(), l.getZ() + 0.5D);
                  Location loc5 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc6 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc7 = new Location(w, l.getX() - 0.5D, l.getY(), l.getZ());
                  Location loc8 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() - 0.25D);
                  Location loc9 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc10 = new Location(w, l.getX(), l.getY(), l.getZ() - 0.5D);
                  Location loc11 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc12 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() - 0.25D);
                  if (this.time == 12) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                  }

                  if (this.time == 11) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc2, 15.0D);
                  }

                  if (this.time == 10) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc3, 15.0D);
                  }

                  if (this.time == 9) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc4, 15.0D);
                  }

                  if (this.time == 8) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc5, 15.0D);
                  }

                  if (this.time == 7) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc6, 15.0D);
                  }

                  if (this.time == 6) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc7, 15.0D);
                  }

                  if (this.time == 5) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc8, 15.0D);
                  }

                  if (this.time == 4) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc9, 15.0D);
                  }

                  if (this.time == 3) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc10, 15.0D);
                  }

                  if (this.time == 2) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc11, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc12, 15.0D);
                  }

                  if (this.time == 0) {
                     ParticleEffect.REDSTONE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     this.time += 12;
                  }

                  --this.time;
               }
            }, 1L, 1L);
            this.main.redstone.put(p.getName(), redstone);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Water Particle.Name")))) {
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            water = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 1;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.0D);
                  Location loc1 = new Location(w, l.getX() + 1.0D, l.getY(), l.getZ());
                  Location loc2 = new Location(w, l.getX() + 0.7D, l.getY(), l.getZ() + 0.3D);
                  Location loc3 = new Location(w, l.getX() + 0.3D, l.getY(), l.getZ() + 0.7D);
                  Location loc4 = new Location(w, l.getX(), l.getY(), l.getZ() + 1.0D);
                  Location loc5 = new Location(w, l.getX() - 0.3D, l.getY(), l.getZ() + 0.7D);
                  Location loc6 = new Location(w, l.getX() - 0.7D, l.getY(), l.getZ() + 0.3D);
                  Location loc7 = new Location(w, l.getX() - 1.0D, l.getY(), l.getZ());
                  Location loc8 = new Location(w, l.getX() - 0.7D, l.getY(), l.getZ() - 0.3D);
                  Location loc9 = new Location(w, l.getX() - 0.3D, l.getY(), l.getZ() - 0.7D);
                  Location loc10 = new Location(w, l.getX(), l.getY(), l.getZ() - 1.0D);
                  Location loc11 = new Location(w, l.getX() + 0.3D, l.getY(), l.getZ() - 0.7D);
                  Location loc12 = new Location(w, l.getX() + 0.3D, l.getY(), l.getZ() - 0.7D);
                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc2, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc3, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc4, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc5, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc6, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc7, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc8, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc9, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc10, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc11, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc12, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     ++this.time;
                  }

                  --this.time;
               }
            }, 1L, 2L);
            this.main.water.put(p.getName(), water);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("AngryVillager Particle.Name")))) {
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            villager = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 12;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.0D);
                  Location loc1 = new Location(w, l.getX() + 0.5D, l.getY(), l.getZ());
                  Location loc2 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc3 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc4 = new Location(w, l.getX(), l.getY(), l.getZ() + 0.5D);
                  Location loc5 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc6 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc7 = new Location(w, l.getX() - 0.5D, l.getY(), l.getZ());
                  Location loc8 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() - 0.25D);
                  Location loc9 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc10 = new Location(w, l.getX(), l.getY(), l.getZ() - 0.5D);
                  Location loc11 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc12 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() - 0.25D);
                  if (this.time == 12) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                  }

                  if (this.time == 11) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc2, 15.0D);
                  }

                  if (this.time == 10) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc3, 15.0D);
                  }

                  if (this.time == 9) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc4, 15.0D);
                  }

                  if (this.time == 8) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc5, 15.0D);
                  }

                  if (this.time == 7) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc6, 15.0D);
                  }

                  if (this.time == 6) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc7, 15.0D);
                  }

                  if (this.time == 5) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc8, 15.0D);
                  }

                  if (this.time == 4) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc9, 15.0D);
                  }

                  if (this.time == 3) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc10, 15.0D);
                  }

                  if (this.time == 2) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc11, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc12, 15.0D);
                  }

                  if (this.time == 0) {
                     ParticleEffect.VILLAGER_ANGRY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     this.time += 12;
                  }

                  --this.time;
               }
            }, 1L, 2L);
            this.main.villager.put(p.getName(), villager);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Spell Particle.Name")))) {
            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            spell = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 12;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.0D);
                  Location loc1 = new Location(w, l.getX() + 0.5D, l.getY(), l.getZ());
                  Location loc2 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc3 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc4 = new Location(w, l.getX(), l.getY(), l.getZ() + 0.5D);
                  Location loc5 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc6 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc7 = new Location(w, l.getX() - 0.5D, l.getY(), l.getZ());
                  Location loc8 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() - 0.25D);
                  Location loc9 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc10 = new Location(w, l.getX(), l.getY(), l.getZ() - 0.5D);
                  Location loc11 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc12 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() - 0.25D);
                  if (this.time == 12) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                  }

                  if (this.time == 11) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc2, 15.0D);
                  }

                  if (this.time == 10) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc3, 15.0D);
                  }

                  if (this.time == 9) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc4, 15.0D);
                  }

                  if (this.time == 8) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc5, 15.0D);
                  }

                  if (this.time == 7) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc6, 15.0D);
                  }

                  if (this.time == 6) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc7, 15.0D);
                  }

                  if (this.time == 5) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc8, 15.0D);
                  }

                  if (this.time == 4) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc9, 15.0D);
                  }

                  if (this.time == 3) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc10, 15.0D);
                  }

                  if (this.time == 2) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc11, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc12, 15.0D);
                  }

                  if (this.time == 0) {
                     ParticleEffect.SPELL_WITCH.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     this.time += 12;
                  }

                  --this.time;
               }
            }, 1L, 1L);
            this.main.spell.put(p.getName(), spell);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Heart Particle.Name")))) {
            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            heart = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 12;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.0D);
                  Location loc1 = new Location(w, l.getX() + 0.5D, l.getY(), l.getZ());
                  Location loc2 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc3 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc4 = new Location(w, l.getX(), l.getY(), l.getZ() + 0.5D);
                  Location loc5 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc6 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc7 = new Location(w, l.getX() - 0.5D, l.getY(), l.getZ());
                  Location loc8 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() - 0.25D);
                  Location loc9 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc10 = new Location(w, l.getX(), l.getY(), l.getZ() - 0.5D);
                  Location loc11 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc12 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() - 0.25D);
                  if (this.time == 12) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                  }

                  if (this.time == 11) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc2, 15.0D);
                  }

                  if (this.time == 10) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc3, 15.0D);
                  }

                  if (this.time == 9) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc4, 15.0D);
                  }

                  if (this.time == 8) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc5, 15.0D);
                  }

                  if (this.time == 7) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc6, 15.0D);
                  }

                  if (this.time == 6) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc7, 15.0D);
                  }

                  if (this.time == 5) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc8, 15.0D);
                  }

                  if (this.time == 4) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc9, 15.0D);
                  }

                  if (this.time == 3) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc10, 15.0D);
                  }

                  if (this.time == 2) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc11, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc12, 15.0D);
                  }

                  if (this.time == 0) {
                     ParticleEffect.HEART.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     this.time += 12;
                  }

                  --this.time;
               }
            }, 1L, 1L);
            this.main.heart.put(p.getName(), heart);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Star Particle.Name")))) {
            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            star = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 12;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.0D);
                  Location loc1 = new Location(w, l.getX() + 0.5D, l.getY(), l.getZ());
                  Location loc2 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc3 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc4 = new Location(w, l.getX(), l.getY(), l.getZ() + 0.5D);
                  Location loc5 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc6 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc7 = new Location(w, l.getX() - 0.5D, l.getY(), l.getZ());
                  Location loc8 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() - 0.25D);
                  Location loc9 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc10 = new Location(w, l.getX(), l.getY(), l.getZ() - 0.5D);
                  Location loc11 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc12 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() - 0.25D);
                  if (this.time == 1) {
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc2, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc3, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc4, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc5, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc6, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc7, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc8, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc9, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc10, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc11, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc12, 15.0D);
                     ParticleEffect.SPELL_INSTANT.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     this.time += 12;
                  }

                  --this.time;
               }
            }, 1L, 1L);
            this.main.star.put(p.getName(), star);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Snowball Particle.Name")))) {
            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            snowball = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 12;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.0D);
                  Location loc1 = new Location(w, l.getX() + 0.5D, l.getY(), l.getZ());
                  Location loc2 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc3 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc4 = new Location(w, l.getX(), l.getY(), l.getZ() + 0.5D);
                  Location loc5 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc6 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc7 = new Location(w, l.getX() - 0.5D, l.getY(), l.getZ());
                  Location loc8 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() - 0.25D);
                  Location loc9 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc10 = new Location(w, l.getX(), l.getY(), l.getZ() - 0.5D);
                  Location loc11 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc12 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() - 0.25D);
                  if (this.time == 1) {
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc2, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc3, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc4, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc5, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc6, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc7, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc8, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc9, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc10, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc11, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc12, 15.0D);
                     ParticleEffect.SNOWBALL.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     this.time += 12;
                  }

                  --this.time;
               }
            }, 1L, 1L);
            this.main.snowball.put(p.getName(), snowball);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("HappyVilliger Particle.Name")))) {
            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            happy = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 12;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.0D);
                  Location loc1 = new Location(w, l.getX() + 0.5D, l.getY(), l.getZ());
                  Location loc2 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc3 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc4 = new Location(w, l.getX(), l.getY(), l.getZ() + 0.5D);
                  Location loc5 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc6 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc7 = new Location(w, l.getX() - 0.5D, l.getY(), l.getZ());
                  Location loc8 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() - 0.25D);
                  Location loc9 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc10 = new Location(w, l.getX(), l.getY(), l.getZ() - 0.5D);
                  Location loc11 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc12 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() - 0.25D);
                  if (this.time == 12) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                  }

                  if (this.time == 11) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc2, 15.0D);
                  }

                  if (this.time == 10) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc3, 15.0D);
                  }

                  if (this.time == 9) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc4, 15.0D);
                  }

                  if (this.time == 8) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc5, 15.0D);
                  }

                  if (this.time == 7) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc6, 15.0D);
                  }

                  if (this.time == 6) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc7, 15.0D);
                  }

                  if (this.time == 5) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc8, 15.0D);
                  }

                  if (this.time == 4) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc9, 15.0D);
                  }

                  if (this.time == 3) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc10, 15.0D);
                  }

                  if (this.time == 2) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc11, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc12, 15.0D);
                  }

                  if (this.time == 0) {
                     ParticleEffect.VILLAGER_HAPPY.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     this.time += 12;
                  }

                  --this.time;
               }
            }, 1L, 3L);
            this.main.happy.put(p.getName(), happy);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Enchantment Particle.Name")))) {
            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

            enchantment = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 12;

               public void run() {
                  Location l = p.getLocation();
                  l.setY(l.getY() + 2.0D);
                  Location loc1 = new Location(w, l.getX() + 0.5D, l.getY(), l.getZ());
                  Location loc2 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc3 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc4 = new Location(w, l.getX(), l.getY(), l.getZ() + 0.5D);
                  Location loc5 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() + 0.43D);
                  Location loc6 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() + 0.25D);
                  Location loc7 = new Location(w, l.getX() - 0.5D, l.getY(), l.getZ());
                  Location loc8 = new Location(w, l.getX() - 0.43D, l.getY(), l.getZ() - 0.25D);
                  Location loc9 = new Location(w, l.getX() - 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc10 = new Location(w, l.getX(), l.getY(), l.getZ() - 0.5D);
                  Location loc11 = new Location(w, l.getX() + 0.25D, l.getY(), l.getZ() - 0.43D);
                  Location loc12 = new Location(w, l.getX() + 0.43D, l.getY(), l.getZ() - 0.25D);
                  if (this.time == 12) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                  }

                  if (this.time == 11) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc2, 15.0D);
                  }

                  if (this.time == 10) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc3, 15.0D);
                  }

                  if (this.time == 9) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc4, 15.0D);
                  }

                  if (this.time == 8) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc5, 15.0D);
                  }

                  if (this.time == 7) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc6, 15.0D);
                  }

                  if (this.time == 6) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc7, 15.0D);
                  }

                  if (this.time == 5) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc8, 15.0D);
                  }

                  if (this.time == 4) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc9, 15.0D);
                  }

                  if (this.time == 3) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc10, 15.0D);
                  }

                  if (this.time == 2) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc11, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc12, 15.0D);
                  }

                  if (this.time == 0) {
                     ParticleEffect.ENCHANTMENT_TABLE.display(0.0F, 0.0F, 0.0F, 4.0F, 5, loc1, 15.0D);
                     this.time += 12;
                  }

                  --this.time;
               }
            }, 1L, 1L);
            this.main.enchantment.put(p.getName(), enchantment);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("RemoveParticles.Name")))) {
            if (this.main.note.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
               this.main.note.remove(p.getName());
            }

            if (this.main.redstone.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
               this.main.redstone.remove(p.getName());
            }

            if (this.main.water.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
               this.main.water.remove(p.getName());
            }

            if (this.main.villager.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
               this.main.villager.remove(p.getName());
            }

            if (this.main.spell.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
               this.main.spell.remove(p.getName());
            }

            if (this.main.heart.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
               this.main.heart.remove(p.getName());
            }

            if (this.main.star.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
               this.main.star.remove(p.getName());
            }

            if (this.main.snowball.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
               this.main.snowball.remove(p.getName());
            }

            if (this.main.happy.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
               this.main.happy.remove(p.getName());
            }

            if (this.main.enchantment.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
               this.main.enchantment.remove(p.getName());
            }

            if (this.main.twister.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
               this.main.twister.remove(p.getName());
            }

            if (this.main.magic.containsKey(p.getName())) {
               Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
               this.main.magic.remove(p.getName());
            }

            p.getWorld().playSound(p.getLocation(), Sound.HORSE_JUMP, 1.0F, 1.0F);
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }
         }
      }

   }

   @EventHandler
   public void onQuit(PlayerQuitEvent e) {
      Player p = e.getPlayer();
      if (this.main.note.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.note.get(p.getName()));
         this.main.note.remove(p.getName());
      }

      if (this.main.redstone.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.redstone.get(p.getName()));
         this.main.redstone.remove(p.getName());
      }

      if (this.main.water.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.water.get(p.getName()));
         this.main.water.remove(p.getName());
      }

      if (this.main.villager.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.villager.get(p.getName()));
         this.main.villager.remove(p.getName());
      }

      if (this.main.spell.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.spell.get(p.getName()));
         this.main.spell.remove(p.getName());
      }

      if (this.main.heart.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.heart.get(p.getName()));
         this.main.heart.remove(p.getName());
      }

      if (this.main.star.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.star.get(p.getName()));
         this.main.star.remove(p.getName());
      }

      if (this.main.snowball.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.snowball.get(p.getName()));
         this.main.snowball.remove(p.getName());
      }

      if (this.main.happy.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.happy.get(p.getName()));
         this.main.happy.remove(p.getName());
      }

      if (this.main.enchantment.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.enchantment.get(p.getName()));
         this.main.enchantment.remove(p.getName());
      }

      if (this.main.twister.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.twister.get(p.getName()));
         this.main.twister.remove(p.getName());
      }

      if (this.main.magic.containsKey(p.getName())) {
         Bukkit.getScheduler().cancelTask((Integer)this.main.magic.get(p.getName()));
         this.main.magic.remove(p.getName());
      }

   }
}
