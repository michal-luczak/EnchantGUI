package me.taison.enchantgui.gui.guibuilders;

import me.taison.enchantgui.Main;
import me.taison.enchantgui.gui.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;

public class CrossbowGUIBuilder extends BuilderAbstract {

    private final Inventory inv;

    public CrossbowGUIBuilder(Inventory inv) {
        this.inv = inv;
    }

    public void init() {

        super.init(inv, 1, 46, "multishot");
        super.init(inv, 4, 47, "piercing");
        super.init(inv, 3, 48, "quick-charge");
        super.init(inv, 3, 49, "unbreaking");

        //multishot
//        inv.setItem(46, new ItemBuilder(Material.ENCHANTED_BOOK, "&eMULTISHOT")
//                .book(config.getInt("enchanty.multishot.1.potrzebny-lvl"),
//                        config.getInt("enchanty.multishot.1.potrzebne-biblioteczki")));

        //piercing
//        inv.setItem(20, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePIERCING IV")
//                .book(config.getInt("enchanty.piercing.4.potrzebny-lvl"),
//                        config.getInt("enchanty.piercing.4.potrzebne-biblioteczki")));
//        inv.setItem(29, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePIERCING III")
//                .book(config.getInt("enchanty.piercing.3.potrzebny-lvl"),
//                        config.getInt("enchanty.piercing.3.potrzebne-biblioteczki")));
//        inv.setItem(38, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePIERCING II")
//                .book(config.getInt("enchanty.piercing.2.potrzebny-lvl"),
//                        config.getInt("enchanty.piercing.2.potrzebne-biblioteczki")));
//        inv.setItem(47, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePIERCING I")
//                .book(config.getInt("enchanty.piercing.1.potrzebny-lvl"),
//                        config.getInt("enchanty.piercing.1.potrzebne-biblioteczki")));

        //quick charge
//        inv.setItem(30, new ItemBuilder(Material.ENCHANTED_BOOK, "&eQUICK CHARGE III")
//                .book(config.getInt("enchanty.quick-charge.3.potrzebny-lvl"),
//                        config.getInt("enchanty.quick-charge.3.potrzebne-biblioteczki")));
//        inv.setItem(39, new ItemBuilder(Material.ENCHANTED_BOOK, "&eQUICK CHARGE II")
//                .book(config.getInt("enchanty.quick-charge.2.potrzebny-lvl"),
//                        config.getInt("enchanty.quick-charge.2.potrzebne-biblioteczki")));
//        inv.setItem(48, new ItemBuilder(Material.ENCHANTED_BOOK, "&eQUICK CHARGE I")
//                .book(config.getInt("enchanty.quick-charge.1.potrzebny-lvl"),
//                        config.getInt("enchanty.quick-charge.1.potrzebne-biblioteczki")));

        //unbreaking
//        inv.setItem(31, new ItemBuilder(Material.ENCHANTED_BOOK, "&eUNBREAKING III")
//                .book(config.getInt("enchanty.unbreaking.3.potrzebny-lvl"),
//                        config.getInt("enchanty.unbreaking.3.potrzebne-biblioteczki")));
//        inv.setItem(40, new ItemBuilder(Material.ENCHANTED_BOOK, "&eUNBREAKING II")
//                .book(config.getInt("enchanty.unbreaking.2.potrzebny-lvl"),
//                        config.getInt("enchanty.unbreaking.2.potrzebne-biblioteczki")));
//        inv.setItem(49, new ItemBuilder(Material.ENCHANTED_BOOK, "&eUNBREAKING I")
//                .book(config.getInt("enchanty.unbreaking.1.potrzebny-lvl"),
//                        config.getInt("enchanty.unbreaking.1.potrzebne-biblioteczki")));
    }
}
