package me.taison.enchantgui.gui.guibuilders;

import me.taison.enchantgui.Main;
import me.taison.enchantgui.gui.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;

public class BowGUIBuilder extends BuilderAbstract {

    private final Inventory inv;

    public BowGUIBuilder(Inventory inv) {
        this.inv = inv;
    }

    public void init() {

        super.init(inv, 5, 46, "power");
        super.init(inv, 1, 47, "flame");
        super.init(inv, 3, 48, "unbreaking");
        super.init(inv, 2, 49, "punch");
        super.init(inv, 1, 50, "infinity");

        //power
//        inv.setItem(10, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePOWER V")
//                .book(config.getInt("enchanty.power.5.potrzebny-lvl"),
//                        config.getInt("enchanty.power.5.potrzebne-biblioteczki")));
//        inv.setItem(19, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePOWER IV")
//                .book(config.getInt("enchanty.power.4.potrzebny-lvl"),
//                        config.getInt("enchanty.power.4.potrzebne-biblioteczki")));
//        inv.setItem(28, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePOWER III")
//                .book(config.getInt("enchanty.power.3.potrzebny-lvl"),
//                        config.getInt("enchanty.power.3.potrzebne-biblioteczki")));
//        inv.setItem(37, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePOWER II")
//                .book(config.getInt("enchanty.power.2.potrzebny-lvl"),
//                        config.getInt("enchanty.power.2.potrzebne-biblioteczki")));
//        inv.setItem(46, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePOWER I")
//                .book(config.getInt("enchanty.power.1.potrzebny-lvl"),
//                        config.getInt("enchanty.power.1.potrzebne-biblioteczki")));

        //flame
//        inv.setItem(47, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFLAME")
//                .book(config.getInt("enchanty.flame.1.potrzebny-lvl"),
//                        config.getInt("enchanty.flame.1.potrzebne-biblioteczki")));

        //unbreaking
//        inv.setItem(30, new ItemBuilder(Material.ENCHANTED_BOOK, "&eUNBREAKING III")
//                .book(config.getInt("enchanty.unbreaking.3.potrzebny-lvl"),
//                        config.getInt("enchanty.unbreaking.3.potrzebne-biblioteczki")));
//        inv.setItem(39, new ItemBuilder(Material.ENCHANTED_BOOK, "&eUNBREAKING II")
//                .book(config.getInt("enchanty.unbreaking.2.potrzebny-lvl"),
//                        config.getInt("enchanty.unbreaking.2.potrzebne-biblioteczki")));
//        inv.setItem(48, new ItemBuilder(Material.ENCHANTED_BOOK, "&eUNBREAKING I")
//                .book(config.getInt("enchanty.unbreaking.1.potrzebny-lvl"),
//                        config.getInt("enchanty.unbreaking.1.potrzebne-biblioteczki")));

        //punch
//        inv.setItem(40, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePUNCH II")
//                .book(config.getInt("enchanty.punch.2.potrzebny-lvl"),
//                        config.getInt("enchanty.punch.2.potrzebne-biblioteczki")));
//        inv.setItem(49, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePUNCH I")
//                .book(config.getInt("enchanty.punch.1.potrzebny-lvl"),
//                        config.getInt("enchanty.punch.1.potrzebne-biblioteczki")));

        //infinity
//        inv.setItem(50, new ItemBuilder(Material.ENCHANTED_BOOK, "&eINFINITY")
//                .book(config.getInt("enchanty.infinity.1.potrzebny-lvl"),
//                        config.getInt("enchanty.infinity.1.potrzebne-biblioteczki")));
    }
}
