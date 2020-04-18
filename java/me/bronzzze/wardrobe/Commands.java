package me.bronzzze.wardrobe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Commands implements CommandExecutor {
   private Main main;

   public Commands(Main main) {
      this.main = main;
   }

   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
      if (!(sender instanceof Player)) {
         sender.sendMessage(ChatColor.DARK_RED + "Console can't use this command! Sorry!");
         return false;
      } else {
         Player p = (Player)sender;
         World w = p.getWorld();
         if (!this.main.getConfig().getStringList("Worlds").contains(w.getName())) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', this.main.getConfig().getString("Message on disabled world")));
            return false;
         } else if (!cmd.getName().equals("wardrobe")) {
            return false;
         } else if (!p.hasPermission("wardrobe.open")) {
            p.sendMessage(ChatColor.DARK_RED + "No Permission!");
            return true;
         } else {
            if (args.length == 0) {
               if (this.main.getConfig().getBoolean("Main Menu Message")) {
                  p.sendMessage(this.main.prefix + ChatColor.translateAlternateColorCodes('&', this.main.getConfig().getString("Message when you open Main Menu")));
               }

               this.main.mainGUI.openInventory(p);
            } else if (args.length >= 1 && args[0].equalsIgnoreCase("give")) {
               if (!p.hasPermission("wardrobe.give")) {
                  p.sendMessage(ChatColor.DARK_RED + "No Permission!");
                  return true;
               }

               String message = this.main.prefix + ChatColor.DARK_PURPLE + "Giving Wardrobe Chest";
               Player target;
               if (args.length == 1) {
                  target = p;
               } else {
                  target = Bukkit.getPlayer(args[1]);
                  if (target == null) {
                     sender.sendMessage(ChatColor.DARK_RED + "No such user online!");
                     return true;
                  }
               }

               target.sendMessage(message);
               ItemStack chest = new ItemStack(Material.CHEST);
               ItemMeta chestm = chest.getItemMeta();
               chestm.setDisplayName(ChatColor.GOLD + "Dolap");
               chest.setItemMeta(chestm);
               target.getInventory().addItem(new ItemStack[]{chest});
               return true;
            }

            if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
               if (!p.hasPermission("wardrobe.reload")) {
                  p.sendMessage(ChatColor.DARK_RED + "No Permission!");
                  return true;
               }

               this.main.reloadConfig();
               p.sendMessage(ChatColor.GREEN + "Config Reloaded!");
            }

            return false;
         }
      }
   }
}
