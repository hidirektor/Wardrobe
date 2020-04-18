package me.bronzzze.wardrobe;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
   public HashMap<String, Integer> note = new HashMap();
   public HashMap<String, Integer> redstone = new HashMap();
   public HashMap<String, Integer> water = new HashMap();
   public HashMap<String, Integer> villager = new HashMap();
   public HashMap<String, Integer> spell = new HashMap();
   public HashMap<String, Integer> heart = new HashMap();
   public HashMap<String, Integer> star = new HashMap();
   public HashMap<String, Integer> snowball = new HashMap();
   public HashMap<String, Integer> happy = new HashMap();
   public HashMap<String, Integer> enchantment = new HashMap();
   public HashMap<String, Integer> twister = new HashMap();
   public HashMap<String, Integer> magic = new HashMap();
   public HashMap<String, Integer> helmet = new HashMap();
   public HashMap<String, Integer> chestplate = new HashMap();
   public HashMap<String, Integer> leggings = new HashMap();
   public HashMap<String, Integer> boots = new HashMap();
   ArmourGUI armourGUI;
   ArmourGUIpage2 armourGUIpage2;
   MainGUI mainGUI;
   ParticleGUI particleGUI;
   ParticleEvent particleEvent;
   DiscoArmourEvent discoarmourEvent;
   RemoveGUI removeGUI;
   HatGUI hatGUI;
   VortexEvent vortexEvent;
   public static Main main;
   public FileConfiguration languageConfig = null;
   public File lFile;
   String message = ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("Message when you select Hat"));
   FileConfiguration config = this.getConfig();
   String prefix = ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("Chat Wardrobe Prefix"));

   public void onEnable() {
      this.armourGUI = new ArmourGUI(this);
      this.hatGUI = new HatGUI(this);
      this.armourGUIpage2 = new ArmourGUIpage2(this);
      this.mainGUI = new MainGUI(this);
      this.particleGUI = new ParticleGUI(this);
      this.particleEvent = new ParticleEvent(this);
      this.discoarmourEvent = new DiscoArmourEvent(this);
      this.removeGUI = new RemoveGUI(this);
      this.vortexEvent = new VortexEvent(this);
      PluginDescriptionFile pdf = this.getDescription();
      main = this;
      this.reloadStatsFile();
      this.saveDefaultStatsFile();
      this.getCommand("wardrobe").setExecutor(new Commands(this));
      Bukkit.getServer().getPluginManager().registerEvents(new MainEvent(this), this);
      Bukkit.getServer().getPluginManager().registerEvents(new ChestEvent(this), this);
      Bukkit.getServer().getPluginManager().registerEvents(new QuitEvent(this), this);
      Bukkit.getServer().getPluginManager().registerEvents(new ArmourEvent(this), this);
      Bukkit.getServer().getPluginManager().registerEvents(new ParticleEvent(this), this);
      Bukkit.getServer().getPluginManager().registerEvents(new HatEvent(this), this);
      Bukkit.getServer().getPluginManager().registerEvents(new JoinEvent(this), this);
      Bukkit.getServer().getPluginManager().registerEvents(new DiscoArmourEvent(this), this);
      Bukkit.getServer().getPluginManager().registerEvents(new RemoveEvent(this), this);
      Bukkit.getServer().getPluginManager().registerEvents(new VortexEvent(this), this);
      ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
      console.sendMessage(ChatColor.RED + "-=*=-=*=-=*=-=*=-=*=-=*=-=*=-=*=-");
      console.sendMessage("");
      console.sendMessage(ChatColor.BLUE + "             Wardrobe+");
      console.sendMessage("");
      console.sendMessage(ChatColor.BLUE + "           Version: " + pdf.getVersion());
      console.sendMessage("");
      console.sendMessage(ChatColor.BLUE + "          Author: bronzzze");
      console.sendMessage("");
      console.sendMessage(ChatColor.BLUE + "             Enabled");
      console.sendMessage("");
      console.sendMessage(ChatColor.RED + "-=*=-=*=-=*=-=*=-=*=-=*=-=*=-=*=-");
      this.getConfig().addDefault("Enchantments", true);
      this.saveDefaultConfig();
   }

   public void onDisable() {
      main = null;
   }

   public void reloadStatsFile() {
      if (this.lFile == null) {
         this.lFile = new File(this.getDataFolder(), "language.yml");
      }

      this.languageConfig = YamlConfiguration.loadConfiguration(this.lFile);
      InputStream defConfigStream = this.getResource("language.yml");
      if (defConfigStream != null) {
         YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
         this.languageConfig.setDefaults(defConfig);
      }

   }

   public FileConfiguration getStatsFile() {
      if (this.languageConfig == null) {
         this.reloadStatsFile();
      }

      return this.languageConfig;
   }

   public void saveStatsFile() {
      if (this.lFile != null && this.languageConfig != null) {
         try {
            this.getStatsFile().save(this.lFile);
         } catch (IOException var2) {
            this.getLogger().log(Level.SEVERE, "Could not save config " + this.lFile, var2);
         }

      }
   }

   public void saveDefaultStatsFile() {
      if (this.lFile == null) {
         this.lFile = new File(this.getDataFolder(), "stats.yml");
      }

      if (!this.lFile.exists()) {
         this.saveResource("language.yml", false);
      }

   }
}
