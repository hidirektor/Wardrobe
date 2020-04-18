package me.bronzzze.wardrobe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinEvent implements Listener {
   private Main main;

   public JoinEvent(Main main) {
      this.main = main;
   }

   @EventHandler
   public void onPlayerJoin(PlayerJoinEvent e) {
      Player p = e.getPlayer();
      if (this.main.getConfig().getBoolean("On Join")) {
         ItemStack chest = new ItemStack(Material.CHEST);
         ItemMeta chestm = chest.getItemMeta();
         chestm.setDisplayName(ChatColor.GOLD + "Dolap");
         chest.setItemMeta(chestm);
         p.getInventory().setItem(this.main.getConfig().getInt("Slot"), chest);
      }

   }
}
