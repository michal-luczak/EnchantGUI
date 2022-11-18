package me.taison.enchantgui.gui.guibuilders;

import me.taison.enchantgui.Main;
import me.taison.enchantgui.gui.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;

public class ToolGUIBuilder {

    private final Inventory inv;
    private static final FileConfiguration config = Main.getPlugin(Main.class).getConfig();

    public ToolGUIBuilder(Inventory inv) {
        this.inv = inv;
    }

    public void init() {

        //Efficiency
        inv.setItem(10, new ItemBuilder(Material.ENCHANTED_BOOK, "&eEFFICIENCY V")
                .book(config.getInt("enchanty.efficiency.5.potrzebny-lvl"),
                        config.getInt("enchanty.efficiency.5.potrzebne-biblioteczki")));
        inv.setItem(19, new ItemBuilder(Material.ENCHANTED_BOOK, "&eEFFICIENCY IV")
                .book(config.getInt("enchanty.efficiency.4.potrzebny-lvl"),
                        config.getInt("enchanty.efficiency.4.potrzebne-biblioteczki")));
        inv.setItem(28, new ItemBuilder(Material.ENCHANTED_BOOK, "&eEFFICIENCY III")
                .book(config.getInt("enchanty.efficiency.3.potrzebny-lvl"),
                        config.getInt("enchanty.efficiency.3.potrzebne-biblioteczki")));
        inv.setItem(37, new ItemBuilder(Material.ENCHANTED_BOOK, "&eEFFICIENCY II")
                .book(config.getInt("enchanty.efficiency.2.potrzebny-lvl"),
                        config.getInt("enchanty.efficiency.2.potrzebne-biblioteczki")));
        inv.setItem(46, new ItemBuilder(Material.ENCHANTED_BOOK, "&eEFFICIENCY I")
                .book(config.getInt("enchanty.efficiency.1.potrzebny-lvl"),
                        config.getInt("enchanty.efficiency.1.potrzebne-biblioteczki")));

        //fortune
        inv.setItem(29, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFORTUNE III")
                .book(config.getInt("enchanty.fortune.3.potrzebny-lvl"),
                        config.getInt("enchanty.fortune.3.potrzebne-biblioteczki")));
        inv.setItem(38, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFORTUNE II")
                .book(config.getInt("enchanty.fortune.2.potrzebny-lvl"),
                        config.getInt("enchanty.fortune.2.potrzebne-biblioteczki")));
        inv.setItem(47, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFORTUNE I")
                .book(config.getInt("enchanty.fortune.1.potrzebny-lvl"),
                        config.getInt("enchanty.fortune.1.potrzebne-biblioteczki")));

        //unbreaking
        inv.setItem(30, new ItemBuilder(Material.ENCHANTED_BOOK, "&eUNBREAKING III")
                .book(config.getInt("enchanty.unbreaking.3.potrzebny-lvl"),
                        config.getInt("enchanty.unbreaking.3.potrzebne-biblioteczki")));
        inv.setItem(39, new ItemBuilder(Material.ENCHANTED_BOOK, "&eUNBREAKING II")
                .book(config.getInt("enchanty.unbreaking.2.potrzebny-lvl"),
                        config.getInt("enchanty.unbreaking.2.potrzebne-biblioteczki")));
        inv.setItem(48, new ItemBuilder(Material.ENCHANTED_BOOK, "&eUNBREAKING I")
                .book(config.getInt("enchanty.unbreaking.1.potrzebny-lvl"),
                        config.getInt("enchanty.unbreaking.1.potrzebne-biblioteczki")));

        //Silk touch
        inv.setItem(49, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSilk Touch")
                .book(config.getInt("enchanty.silk-touch.1.potrzebny-lvl"),
                        config.getInt("enchanty.silk-touch.1.potrzebne-biblioteczki")));
    }
}
