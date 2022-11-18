package me.taison.enchantgui;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Utils {

    public static void msg(Player player, String message) {
        player.sendMessage(color(message));
    }

    public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}
