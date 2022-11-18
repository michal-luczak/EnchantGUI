package me.taison.enchantgui.gui;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

import static me.taison.enchantgui.Utils.color;

public class ItemBuilder {

    private final String title;
    private final Material material;

    public ItemBuilder(Material material, String title) {
        this.title = title;
        this.material = material;
    }

    public ItemStack book(int lvl, int bookshelves) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta meta = itemStack.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add(color("&7Wymagany level: &9" + lvl));
        lore.add(color("&7Wymagane biblioteczki: &9" + bookshelves));
        meta.setLore(lore);
        meta.setDisplayName(color(title));
        itemStack.setItemMeta(meta);
        return itemStack;
    }
}
