package me.taison.enchantgui.gui.guibuilders;

import me.taison.enchantgui.Main;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

import static me.taison.enchantgui.Utils.color;

public abstract class BuilderAbstract {

    private static final FileConfiguration config = Main.getPlugin(Main.class).getConfig();

    protected void init(Inventory inv, int lvlOfEnchant, int startIndex, String enchant) {

        int counter = 1;

        for (int i = startIndex; i >= startIndex - 9*(lvlOfEnchant-1); i -= 9) {
            int requireBookshelves = config.getInt("enchanty." + enchant + "." + counter + ".potrzebne-biblioteczki");
            int requireLvl = config.getInt("enchanty." + enchant + "." + counter + ".potrzebny-lvl");

            inv.setItem(i, itemBuilder(requireLvl, requireBookshelves, enchant, counter));

            counter++;
        }
    }

    private ItemStack itemBuilder(int requireLvl, int requireBookshelves, String enchant, int lvlOfEnchant) {
        ItemStack itemStack = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta meta = itemStack.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add(color("&7Wymagany level: &9" + requireLvl));
        lore.add(color("&7Wymagane biblioteczki: &9" + requireBookshelves));
        meta.setLore(lore);
        meta.setDisplayName(color("&e" + enchant.replace('-', ' ') + " " + romanDigitConverter(lvlOfEnchant)).toUpperCase());
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    private String romanDigitConverter(int digit) {
        switch (digit) {
            case 1 : return "I";
            case 2 : return "II";
            case 3 : return "III";
            case 4 : return "IV";
            case 5 : return "V";
            default: return null;
        }
    }
}
