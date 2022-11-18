package me.taison.enchantgui;

import me.taison.enchantgui.listeners.EnchantInteract;
import me.taison.enchantgui.listeners.InventoryClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EnchantInteract(), this);
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
