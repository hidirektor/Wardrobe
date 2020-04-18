package me.bronzzze.wardrobe;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

public class QuitEvent implements Listener {
   private final Main main;

   public QuitEvent(Main main) {
      this.main = main;
   }

   @EventHandler
   public void onQuit(PlayerQuitEvent e) {
      Player p = e.getPlayer();
      if (this.main.getConfig().getBoolean("On Quit") && this.main.getConfig().getStringList("Worlds").contains(p.getWorld().getName())) {
         p.getInventory().setHelmet((ItemStack)null);
         p.getInventory().setChestplate((ItemStack)null);
         p.getInventory().setLeggings((ItemStack)null);
         p.getInventory().setBoots((ItemStack)null);
      }

   }

   @EventHandler
   public void onWorldChange(PlayerChangedWorldEvent e) {
      Player p = e.getPlayer();
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
