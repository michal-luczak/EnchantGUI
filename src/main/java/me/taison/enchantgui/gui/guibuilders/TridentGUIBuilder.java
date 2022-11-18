package me.taison.enchantgui.gui.guibuilders;

import me.taison.enchantgui.Main;
import me.taison.enchantgui.gui.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;

public class TridentGUIBuilder {

    private final Inventory inv;
    private static final FileConfiguration config = Main.getPlugin(Main.class).getConfig();

    public TridentGUIBuilder(Inventory inv) {
        this.inv = inv;
    }

    public void init() {

        //Impaling
        inv.setItem(10, new ItemBuilder(Material.ENCHANTED_BOOK, "&eIMPALING V")
                .book(config.getInt("enchanty.impaling.5.potrzebny-lvl"),
                        config.getInt("enchanty.impaling.5.potrzebne-biblioteczki")));
        inv.setItem(19, new ItemBuilder(Material.ENCHANTED_BOOK, "&eIMPALING IV")
                .book(config.getInt("enchanty.impaling.4.potrzebny-lvl"),
                        config.getInt("enchanty.impaling.4.potrzebne-biblioteczki")));
        inv.setItem(28, new ItemBuilder(Material.ENCHANTED_BOOK, "&eIMPALING III")
                .book(config.getInt("enchanty.impaling.3.potrzebny-lvl"),
                        config.getInt("enchanty.impaling.3.potrzebne-biblioteczki")));
        inv.setItem(37, new ItemBuilder(Material.ENCHANTED_BOOK, "&eIMPALING II")
                .book(config.getInt("enchanty.impaling.2.potrzebny-lvl"),
                        config.getInt("enchanty.impaling.2.potrzebne-biblioteczki")));
        inv.setItem(46, new ItemBuilder(Material.ENCHANTED_BOOK, "&eIMPALING I")
                .book(config.getInt("enchanty.impaling.1.potrzebny-lvl"),
                        config.getInt("enchanty.impaling.1.potrzebne-biblioteczki")));

        //Loyalty
        inv.setItem(29, new ItemBuilder(Material.ENCHANTED_BOOK, "&eLOYALTY III")
                .book(config.getInt("enchanty.loyalty.3.potrzebny-lvl"),
                        config.getInt("enchanty.loyalty.3.potrzebne-biblioteczki")));
        inv.setItem(38, new ItemBuilder(Material.ENCHANTED_BOOK, "&eLOYALTY II")
                .book(config.getInt("enchanty.loyalty.2.potrzebny-lvl"),
                        config.getInt("enchanty.loyalty.2.potrzebne-biblioteczki")));
        inv.setItem(47, new ItemBuilder(Material.ENCHANTED_BOOK, "&eLOYALTY I")
                .book(config.getInt("enchanty.loyalty.1.potrzebny-lvl"),
                        config.getInt("enchanty.loyalty.1.potrzebne-biblioteczki")));

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

        //riptide
        inv.setItem(31, new ItemBuilder(Material.ENCHANTED_BOOK, "&eRIPTIDE III")
                .book(config.getInt("enchanty.riptide.3.potrzebny-lvl"),
                        config.getInt("enchanty.riptide.3.potrzebne-biblioteczki")));
        inv.setItem(40, new ItemBuilder(Material.ENCHANTED_BOOK, "&eRIPTIDE II")
                .book(config.getInt("enchanty.riptide.2.potrzebny-lvl"),
                        config.getInt("enchanty.riptide.2.potrzebne-biblioteczki")));
        inv.setItem(49, new ItemBuilder(Material.ENCHANTED_BOOK, "&eRIPTIDE I")
                .book(config.getInt("enchanty.riptide.1.potrzebny-lvl"),
                        config.getInt("enchanty.riptide.1.potrzebne-biblioteczki")));

        //channeling
        inv.setItem(50, new ItemBuilder(Material.ENCHANTED_BOOK, "&eCHANNELING")
                .book(config.getInt("enchanty.channeling.1.potrzebny-lvl"),
                        config.getInt("enchanty.channeling.1.potrzebne-biblioteczki")));
    }
}
