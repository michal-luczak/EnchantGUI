package me.taison.enchantgui.gui.guibuilders;

import me.taison.enchantgui.Main;
import me.taison.enchantgui.gui.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;

public class SwordGUIBuilder {

    private final Inventory inv;
    private static final FileConfiguration config = Main.getPlugin(Main.class).getConfig();

    public SwordGUIBuilder(Inventory inv) {
        this.inv = inv;
    }

    public void init() {

        //sharp
        inv.setItem(10, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSHARPNESS V")
                .book(config.getInt("enchanty.sharpness.5.potrzebny-lvl"),
                        config.getInt("enchanty.sharpness.5.potrzebne-biblioteczki")));
        inv.setItem(19, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSHARPNESS IV")
                .book(config.getInt("enchanty.sharpness.4.potrzebny-lvl"),
                        config.getInt("enchanty.sharpness.4.potrzebne-biblioteczki")));
        inv.setItem(28, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSHARPNESS III")
                .book(config.getInt("enchanty.sharpness.3.potrzebny-lvl"),
                        config.getInt("enchanty.sharpness.3.potrzebne-biblioteczki")));
        inv.setItem(37, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSHARPNESS II")
                .book(config.getInt("enchanty.sharpness.2.potrzebny-lvl"),
                        config.getInt("enchanty.sharpness.2.potrzebne-biblioteczki")));
        inv.setItem(46, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSHARPNESS I")
                .book(config.getInt("enchanty.sharpness.1.potrzebny-lvl"),
                        config.getInt("enchanty.sharpness.1.potrzebne-biblioteczki")));

        //fire
        inv.setItem(38, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFIRE ASPECT II")
                .book(config.getInt("enchanty.fire-aspect.2.potrzebny-lvl"),
                        config.getInt("enchanty.fire-aspect.2.potrzebne-biblioteczki")));
        inv.setItem(47, new ItemBuilder(Material.ENCHANTED_BOOK, "&eFIRE ASPECT I")
                .book(config.getInt("enchanty.fire-aspect.1.potrzebny-lvl"),
                        config.getInt("enchanty.fire-aspect.1.potrzebne-biblioteczki")));

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

        //knock
        inv.setItem(40, new ItemBuilder(Material.ENCHANTED_BOOK, "&eKNOCKBACK II")
                .book(config.getInt("enchanty.knockback.2.potrzebny-lvl"),
                        config.getInt("enchanty.knockback.2.potrzebne-biblioteczki")));
        inv.setItem(49, new ItemBuilder(Material.ENCHANTED_BOOK, "&eKNOCKBACK I")
                .book(config.getInt("enchanty.unbreaking.1.potrzebny-lvl"),
                        config.getInt("enchanty.unbreaking.1.potrzebne-biblioteczki")));

        //looting
        inv.setItem(32, new ItemBuilder(Material.ENCHANTED_BOOK, "&eLOOTING III")
                .book(config.getInt("enchanty.looting.3.potrzebny-lvl"),
                        config.getInt("enchanty.looting.3.potrzebne-biblioteczki")));
        inv.setItem(41, new ItemBuilder(Material.ENCHANTED_BOOK, "&eLOOTING II")
                .book(config.getInt("enchanty.looting.2.potrzebny-lvl"),
                        config.getInt("enchanty.looting.2.potrzebne-biblioteczki")));
        inv.setItem(50, new ItemBuilder(Material.ENCHANTED_BOOK, "&eLOOTING I")
                .book(config.getInt("enchanty.looting.1.potrzebny-lvl"),
                        config.getInt("enchanty.looting.1.potrzebne-biblioteczki")));

        //bane of Arthropods
        inv.setItem(15, new ItemBuilder(Material.ENCHANTED_BOOK, "&eBANE OF ARTHROPODS V")
                .book(config.getInt("enchanty.bane-of-arthropods.5.potrzebny-lvl"),
                        config.getInt("enchanty.bane-of-arthropods.5.potrzebne-biblioteczki")));
        inv.setItem(24, new ItemBuilder(Material.ENCHANTED_BOOK, "&eBANE OF ARTHROPODS IV")
                .book(config.getInt("enchanty.bane-of-arthropods.4.potrzebny-lvl"),
                        config.getInt("enchanty.bane-of-arthropods.4.potrzebne-biblioteczki")));
        inv.setItem(33, new ItemBuilder(Material.ENCHANTED_BOOK, "&eBANE OF ARTHROPODS III")
                .book(config.getInt("enchanty.bane-of-arthropods.3.potrzebny-lvl"),
                        config.getInt("enchanty.bane-of-arthropods.3.potrzebne-biblioteczki")));
        inv.setItem(42, new ItemBuilder(Material.ENCHANTED_BOOK, "&eBANE OF ARTHROPODS II")
                .book(config.getInt("enchanty.bane-of-arthropods.2.potrzebny-lvl"),
                        config.getInt("enchanty.bane-of-arthropods.2.potrzebne-biblioteczki")));
        inv.setItem(51, new ItemBuilder(Material.ENCHANTED_BOOK, "&eBANE OF ARTHROPODS I")
                .book(config.getInt("enchanty.bane-of-arthropods.1.potrzebny-lvl"),
                        config.getInt("enchanty.bane-of-arthropods.1.potrzebne-biblioteczki")));

        //smite
        inv.setItem(16, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSMITE V")
                .book(config.getInt("enchanty.smite.5.potrzebny-lvl"),
                        config.getInt("enchanty.smite.5.potrzebne-biblioteczki")));
        inv.setItem(25, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSMITE IV")
                .book(config.getInt("enchanty.smite.4.potrzebny-lvl"),
                        config.getInt("enchanty.smite.4.potrzebne-biblioteczki")));
        inv.setItem(34, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSMITE III")
                .book(config.getInt("enchanty.smite.3.potrzebny-lvl"),
                        config.getInt("enchanty.smite.3.potrzebne-biblioteczki")));
        inv.setItem(43, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSMITE II")
                .book(config.getInt("enchanty.smite.2.potrzebny-lvl"),
                        config.getInt("enchanty.smite.2.potrzebne-biblioteczki")));
        inv.setItem(52, new ItemBuilder(Material.ENCHANTED_BOOK, "&eSMITE I")
                .book(config.getInt("enchanty.smite.1.potrzebny-lvl"),
                        config.getInt("enchanty.smite.1.potrzebne-biblioteczki")));
    }
}
