package me.taison.enchantgui.gui.guibuilders;

import me.taison.enchantgui.Main;
import me.taison.enchantgui.gui.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;

public class ChestplateGUIBuilder {

    private final Inventory inv;
    private static final FileConfiguration config = Main.getPlugin(Main.class).getConfig();

    public ChestplateGUIBuilder(Inventory inv) {
        this.inv = inv;
    }

    public void init() {

        //protection
        inv.setItem(19, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePROTECTION IV")
                .book(config.getInt("enchanty.protection.4.potrzebny-lvl"),
                        config.getInt("enchanty.protection.4.potrzebne-biblioteczki")));
        inv.setItem(28, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePROTECTION III")
                .book(config.getInt("enchanty.protection.3.potrzebny-lvl"),
                        config.getInt("enchanty.protection.3.potrzebne-biblioteczki")));
        inv.setItem(37, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePROTECTION II")
                .book(config.getInt("enchanty.protection.2.potrzebny-lvl"),
                        config.getInt("enchanty.protection.2.potrzebne-biblioteczki")));
        inv.setItem(46, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePROTECTION I")
                .book(config.getInt("enchanty.protection.1.potrzebny-lvl"),
                        config.getInt("enchanty.protection.1.potrzebne-biblioteczki")));

        //thorns
        inv.setItem(29, new ItemBuilder(Material.ENCHANTED_BOOK, "&eTHORNS III")
                .book(config.getInt("enchanty.thorns.3.potrzebny-lvl"),
                        config.getInt("enchanty.thorns.3.potrzebne-biblioteczki")));
        inv.setItem(38, new ItemBuilder(Material.ENCHANTED_BOOK, "&eTHORNS II")
                .book(config.getInt("enchanty.thorns.2.potrzebny-lvl"),
                        config.getInt("enchanty.thorns.2.potrzebne-biblioteczki")));
        inv.setItem(47, new ItemBuilder(Material.ENCHANTED_BOOK, "&eTHORNS I")
                .book(config.getInt("enchanty.thorns.1.potrzebny-lvl"),
                        config.getInt("enchanty.thorns.1.potrzebne-biblioteczki")));

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

        //blast protection
        inv.setItem(22, new ItemBuilder(Material.ENCHANTED_BOOK, "&eBLAST PROTECTION IV")
                .book(config.getInt("enchanty.blast-protection.4.potrzebny-lvl"),
                        config.getInt("enchanty.blast-protection.4.potrzebne-biblioteczki")));
        inv.setItem(31, new ItemBuilder(Material.ENCHANTED_BOOK, "&eBLAST PROTECTION III")
                .book(config.getInt("enchanty.blast-protection.3.potrzebny-lvl"),
                        config.getInt("enchanty.blast-protection.3.potrzebne-biblioteczki")));
        inv.setItem(40, new ItemBuilder(Material.ENCHANTED_BOOK, "&eBLAST PROTECTION II")
                .book(config.getInt("enchanty.blast-protection.2.potrzebny-lvl"),
                        config.getInt("enchanty.blast-protection.2.potrzebne-biblioteczki")));
        inv.setItem(49, new ItemBuilder(Material.ENCHANTED_BOOK, "&eBLAST PROTECTION I")
                .book(config.getInt("enchanty.blast-protection.1.potrzebny-lvl"),
                        config.getInt("enchanty.blast-protection.1.potrzebne-biblioteczki")));

        //fire protection
        inv.setItem(23, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFIRE PROTECTION IV")
                .book(config.getInt("enchanty.fire-protection.4.potrzebny-lvl"),
                        config.getInt("enchanty.fire-protection.4.potrzebne-biblioteczki")));
        inv.setItem(32, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFIRE PROTECTION III")
                .book(config.getInt("enchanty.fire-protection.3.potrzebny-lvl"),
                        config.getInt("enchanty.fire-protection.3.potrzebne-biblioteczki")));
        inv.setItem(41, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFIRE PROTECTION II")
                .book(config.getInt("enchanty.fire-protection.2.potrzebny-lvl"),
                        config.getInt("enchanty.fire-protection.2.potrzebne-biblioteczki")));
        inv.setItem(50, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFIRE PROTECTION I")
                .book(config.getInt("enchanty.fire-protection.1.potrzebny-lvl"),
                        config.getInt("enchanty.fire-protection.1.potrzebne-biblioteczki")));

        //projectile protection
        inv.setItem(24, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePROJECTILE PROTECTION IV")
                .book(config.getInt("enchanty.projectile-protection.4.potrzebny-lvl"),
                        config.getInt("enchanty.projectile-protection.4.potrzebne-biblioteczki")));
        inv.setItem(33, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePROJECTILE PROTECTION III")
                .book(config.getInt("enchanty.projectile-protection.3.potrzebny-lvl"),
                        config.getInt("enchanty.projectile-protection.3.potrzebne-biblioteczki")));
        inv.setItem(42, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePROJECTILE PROTECTION II")
                .book(config.getInt("enchanty.projectile-protection.2.potrzebny-lvl"),
                        config.getInt("enchanty.projectile-protection.2.potrzebne-biblioteczki")));
        inv.setItem(51, new ItemBuilder(Material.ENCHANTED_BOOK, "&ePROJECTILE PROTECTION I")
                .book(config.getInt("enchanty.projectile-protection.1.potrzebny-lvl"),
                        config.getInt("enchanty.projectile-protection.1.potrzebne-biblioteczki")));
    }
}
