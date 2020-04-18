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
import particlelib.ParticleEffect;

public class VortexEvent implements Listener {
   private final Main main;
   public static int tornado;
   public static int magic;

   public VortexEvent(Main main) {
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
         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Twister Particle.Name")))) {
            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

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

            tornado = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
               private int time = 6;
               private double a = Math.sin(45.0D) * 1.0D;
               private double a1 = Math.cos(45.0D) * 1.0D;
               private double b = Math.sin(45.0D) * 0.75D;
               private double b1 = Math.cos(45.0D) * 0.75D;

               public void run() {
                  Location l1 = p.getLocation();
                  l1.setY(l1.getY() + 2.5D);
                  Location loc1 = new Location(w, l1.getX() + 0.5D, l1.getY(), l1.getZ());
                  Location loc2 = new Location(w, l1.getX() + 0.43D, l1.getY(), l1.getZ() + 0.25D);
                  Location loc3 = new Location(w, l1.getX() + 0.25D, l1.getY(), l1.getZ() + 0.43D);
                  Location loc4 = new Location(w, l1.getX(), l1.getY(), l1.getZ() + 0.5D);
                  Location loc5 = new Location(w, l1.getX() - 0.25D, l1.getY(), l1.getZ() + 0.43D);
                  Location loc6 = new Location(w, l1.getX() - 0.43D, l1.getY(), l1.getZ() + 0.25D);
                  Location loc7 = new Location(w, l1.getX() - 0.5D, l1.getY(), l1.getZ());
                  Location loc8 = new Location(w, l1.getX() - 0.43D, l1.getY(), l1.getZ() - 0.25D);
                  Location loc9 = new Location(w, l1.getX() - 0.25D, l1.getY(), l1.getZ() - 0.43D);
                  Location loc10 = new Location(w, l1.getX(), l1.getY(), l1.getZ() - 0.5D);
                  Location loc11 = new Location(w, l1.getX() + 0.25D, l1.getY(), l1.getZ() - 0.43D);
                  Location loc12 = new Location(w, l1.getX() + 0.43D, l1.getY(), l1.getZ() - 0.25D);
                  Location l2 = p.getLocation();
                  l2.setY(l2.getY() + 2.0D);
                  Location locq1 = new Location(w, l2.getX() + 0.25D, l2.getY(), l2.getZ());
                  Location locq2 = new Location(w, l2.getX() + 0.21D, l2.getY(), l2.getZ() + 0.13D);
                  Location locq3 = new Location(w, l2.getX() + 0.13D, l2.getY(), l2.getZ() + 0.21D);
                  Location locq4 = new Location(w, l2.getX(), l2.getY(), l2.getZ() + 0.25D);
                  Location locq5 = new Location(w, l2.getX() - 0.13D, l2.getY(), l2.getZ() + 0.21D);
                  Location locq6 = new Location(w, l2.getX() - 0.21D, l2.getY(), l2.getZ() + 0.13D);
                  Location locq7 = new Location(w, l2.getX() - 0.25D, l2.getY(), l2.getZ());
                  Location locq8 = new Location(w, l2.getX() - 0.21D, l2.getY(), l2.getZ() - 0.13D);
                  Location locq9 = new Location(w, l2.getX() - 0.13D, l2.getY(), l2.getZ() - 0.21D);
                  Location locq10 = new Location(w, l2.getX(), l2.getY(), l2.getZ() - 0.25D);
                  Location locq11 = new Location(w, l2.getX() + 0.13D, l2.getY(), l2.getZ() - 0.21D);
                  Location locq12 = new Location(w, l2.getX() + 0.21D, l2.getY(), l2.getZ() - 0.13D);
                  Location l3 = p.getLocation();
                  l3.setY(l3.getY() + 3.5D);
                  Location locw1 = new Location(w, l3.getX() + 1.0D, l3.getY(), l3.getZ());
                  Location locw2 = new Location(w, l3.getX() + this.a, l3.getY(), l3.getZ() + this.a1);
                  Location locw3 = new Location(w, l3.getX() + this.a1, l3.getY(), l3.getZ() + this.a);
                  Location locw4 = new Location(w, l3.getX(), l3.getY(), l3.getZ() + 1.0D);
                  Location locw5 = new Location(w, l3.getX() - this.a1, l3.getY(), l3.getZ() + this.a);
                  Location locw6 = new Location(w, l3.getX() - this.a, l3.getY(), l3.getZ() + this.a1);
                  Location locw7 = new Location(w, l3.getX() - 1.0D, l3.getY(), l3.getZ());
                  Location locw8 = new Location(w, l3.getX() - this.a, l3.getY(), l3.getZ() - this.a1);
                  Location locw9 = new Location(w, l3.getX() - this.a1, l3.getY(), l3.getZ() - this.a);
                  Location locw10 = new Location(w, l3.getX(), l3.getY(), l3.getZ() - 1.0D);
                  Location locw11 = new Location(w, l3.getX() + this.a1, l3.getY(), l3.getZ() - this.a);
                  Location locw12 = new Location(w, l3.getX() + this.a, l3.getY(), l3.getZ() - this.a1);
                  Location l4 = p.getLocation();
                  l4.setY(l4.getY() + 3.0D);
                  Location loce1 = new Location(w, l4.getX() + 0.75D, l4.getY(), l4.getZ());
                  Location loce2 = new Location(w, l4.getX() + this.b, l4.getY(), l4.getZ() + this.b1);
                  Location loce3 = new Location(w, l4.getX() + this.b1, l4.getY(), l4.getZ() + this.b);
                  Location loce4 = new Location(w, l4.getX(), l4.getY(), l4.getZ() + 0.75D);
                  Location loce5 = new Location(w, l4.getX() - this.b1, l4.getY(), l4.getZ() + this.b);
                  Location loce6 = new Location(w, l4.getX() - this.b, l4.getY(), l4.getZ() + this.b1);
                  Location loce7 = new Location(w, l4.getX() - 0.75D, l4.getY(), l4.getZ());
                  Location loce8 = new Location(w, l4.getX() - this.b, l4.getY(), l4.getZ() - this.b1);
                  Location loce9 = new Location(w, l4.getX() - this.b1, l4.getY(), l4.getZ() - this.b);
                  Location loce10 = new Location(w, l4.getX(), l4.getY(), l4.getZ() - 0.75D);
                  Location loce11 = new Location(w, l4.getX() + this.b1, l4.getY(), l4.getZ() - this.b);
                  Location loce12 = new Location(w, l4.getX() + this.b, l4.getY(), l4.getZ() - this.b1);
                  if (this.time == 6) {
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw1, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw2, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw3, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw4, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw5, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw6, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw7, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw8, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw9, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw10, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw11, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw12, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locw1, 15.0D);
                  }

                  if (this.time == 5) {
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce1, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce2, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce3, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce4, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce5, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce6, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce7, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce8, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce9, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce10, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce11, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce12, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loce1, 15.0D);
                  }

                  if (this.time == 4) {
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc1, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc2, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc3, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc4, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc5, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc6, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc7, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc8, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc9, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc10, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc11, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc12, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc1, 15.0D);
                  }

                  if (this.time == 3) {
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq1, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq2, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq3, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq4, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq5, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq6, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq7, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq8, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq9, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq10, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq11, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq12, 15.0D);
                     ParticleEffect.CRIT.display(0.0F, 0.0F, 0.0F, 0.0F, 5, locq1, 15.0D);
                     this.time += 6;
                  }

                  --this.time;
               }
            }, 1L, 3L);
            this.main.twister.put(p.getName(), tornado);
         }

         if (e.getCurrentItem() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', this.main.getStatsFile().getString("Magic Particle.Name")))) {
            p.getWorld().playSound(p.getLocation(), Sound.CLICK, 1.0F, 1.0F);
            if (this.main.getConfig().getBoolean("Inventory Close")) {
               p.closeInventory();
            }

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

            magic = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.main, new Runnable() {
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
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc1, 15.0D);
                  }

                  if (this.time == 11) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc2, 15.0D);
                  }

                  if (this.time == 10) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc3, 15.0D);
                  }

                  if (this.time == 9) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc4, 15.0D);
                  }

                  if (this.time == 8) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc5, 15.0D);
                  }

                  if (this.time == 7) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc6, 15.0D);
                  }

                  if (this.time == 6) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc7, 15.0D);
                  }

                  if (this.time == 5) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc8, 15.0D);
                  }

                  if (this.time == 4) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc9, 15.0D);
                  }

                  if (this.time == 3) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc10, 15.0D);
                  }

                  if (this.time == 2) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc11, 15.0D);
                  }

                  if (this.time == 1) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc12, 15.0D);
                  }

                  if (this.time == 0) {
                     ParticleEffect.CRIT_MAGIC.display(0.0F, 0.0F, 0.0F, 0.0F, 5, loc1, 15.0D);
                     this.time += 12;
                  }

                  --this.time;
               }
            }, 1L, 1L);
            this.main.magic.put(p.getName(), magic);
         }
      }

   }
}
