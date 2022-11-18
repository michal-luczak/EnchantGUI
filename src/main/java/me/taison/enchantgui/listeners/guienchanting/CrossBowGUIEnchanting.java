package me.taison.enchantgui.listeners.guienchanting;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static me.taison.enchantgui.Utils.msg;

public class CrossBowGUIEnchanting extends GUIEnchantingAbstract{

    public CrossBowGUIEnchanting(ItemStack item, int slot, Player player, int bookshelves) {
        super(item, player, bookshelves);

        switch (slot) {

            //multishot
            case 46: {
                if (config.getBoolean("enchanty.multishot.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.MULTISHOT, 1,
                        config.getInt("enchanty.multishot.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.multishot.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.MULTISHOT, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.multishot.1.potrzebny-lvl"));
                }
                break;
            }

            //Piercing
            case 20: {
                if (config.getBoolean("enchanty.piercing.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PIERCING, 4,
                        config.getInt("enchanty.piercing.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.piercing.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PIERCING, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.piercing.4.potrzebny-lvl"));
                }
                break;
            }
            case 29: {
                if (config.getBoolean("enchanty.piercing.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PIERCING, 3,
                        config.getInt("enchanty.piercing.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.piercing.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PIERCING, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.piercing.3.potrzebny-lvl"));
                }
                break;
            }
            case 38: {
                if (config.getBoolean("enchanty.piercing.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PIERCING, 2,
                        config.getInt("enchanty.piercing.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.piercing.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PIERCING, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.piercing.2.potrzebny-lvl"));
                }
                break;
            }
            case 47: {
                if (config.getBoolean("enchanty.piercing.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PIERCING, 1,
                        config.getInt("enchanty.piercing.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.piercing.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PIERCING, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.piercing.1.potrzebny-lvl"));
                }
                break;
            }

            //quick charge
            case 30: {
                if (config.getBoolean("enchanty.quick-charge.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.QUICK_CHARGE, 3,
                        config.getInt("enchanty.quick-charge.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.quick-charge.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.QUICK_CHARGE, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.quick-charge.3.potrzebny-lvl"));
                }
                break;
            }
            case 39: {
                if (config.getBoolean("enchanty.quick-charge.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.QUICK_CHARGE, 2,
                        config.getInt("enchanty.quick-charge.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.quick-charge.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.QUICK_CHARGE, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.quick-charge.2.potrzebny-lvl"));
                }
                break;
            }
            case 48: {
                if (config.getBoolean("enchanty.quick-charge.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.QUICK_CHARGE, 1,
                        config.getInt("enchanty.quick-charge.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.quick-charge.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.QUICK_CHARGE, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.quick-charge.1.potrzebny-lvl"));
                }
                break;
            }

            //unbreaking
            case 31: {
                if (config.getBoolean("enchanty.unbreaking.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DURABILITY, 3,
                        config.getInt("enchanty.unbreaking.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.unbreaking.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DURABILITY, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.unbreaking.3.potrzebny-lvl"));
                }
                break;
            }
            case 40: {
                if (config.getBoolean("enchanty.unbreaking.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DURABILITY, 2,
                        config.getInt("enchanty.unbreaking.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.unbreaking.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DURABILITY, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.unbreaking.2.potrzebny-lvl"));
                }
                break;
            }
            case 49: {
                if (config.getBoolean("enchanty.unbreaking.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DURABILITY, 1,
                        config.getInt("enchanty.unbreaking.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.unbreaking.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DURABILITY, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.unbreaking.1.potrzebny-lvl"));
                }
                break;
            }
        }
    }
}
