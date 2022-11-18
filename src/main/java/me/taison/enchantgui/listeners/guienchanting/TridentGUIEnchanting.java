package me.taison.enchantgui.listeners.guienchanting;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static me.taison.enchantgui.Utils.msg;

public class TridentGUIEnchanting extends GUIEnchantingAbstract {

    public TridentGUIEnchanting(ItemStack item, int slot, Player player, int bookshelves) {
        super(item, player, bookshelves);

        switch (slot) {

            //impaling
            case 10: {
                if (config.getBoolean("enchanty.impaling.5.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.IMPALING, 5,
                        config.getInt("enchanty.impaling.5.potrzebne-biblioteczki"),
                        config.getInt("enchanty.impaling.5.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.IMPALING, 5);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.impaling.5.potrzebny-lvl"));
                }
                break;
            } case 19: {
                if (config.getBoolean("enchanty.impaling.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.IMPALING, 4,
                        config.getInt("enchanty.impaling.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.impaling.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.IMPALING, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.impaling.4.potrzebny-lvl"));
                }
                break;
            } case 28: {
                if (config.getBoolean("enchanty.impaling.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.IMPALING, 3,
                        config.getInt("enchanty.impaling.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.impaling.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.IMPALING, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.impaling.3.potrzebny-lvl"));
                }
                break;
            } case 37: {
                if (config.getBoolean("enchanty.impaling.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.IMPALING, 2,
                        config.getInt("enchanty.impaling.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.impaling.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.IMPALING, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.impaling.2.potrzebny-lvl"));
                }
                break;
            } case 46: {
                if (config.getBoolean("enchanty.impaling.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.IMPALING, 1,
                        config.getInt("enchanty.impaling.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.impaling.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.IMPALING, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.impaling.1.potrzebny-lvl"));
                }
                break;
            }

            //loyalty
            case 29: {
                if (config.getBoolean("enchanty.loyalty.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.LOYALTY, 3,
                        config.getInt("enchanty.loyalty.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.loyalty.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.LOYALTY, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.loyalty.3.potrzebny-lvl"));
                }
                break;
            }
            case 38: {
                if (config.getBoolean("enchanty.loyalty.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.LOYALTY, 2,
                        config.getInt("enchanty.loyalty.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.loyalty.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.LOYALTY, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.loyalty.2.potrzebny-lvl"));
                }
                break;
            }
            case 47: {
                if (config.getBoolean("enchanty.loyalty.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.LOYALTY, 1,
                        config.getInt("enchanty.loyalty.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.loyalty.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.LOYALTY, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.loyalty.1.potrzebny-lvl"));
                }
                break;
            }

            //unbreaking
            case 30: {
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
            case 39: {
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
            case 48: {
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

            //riptide
            case 31: {
                if (config.getBoolean("enchanty.riptide.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.RIPTIDE, 3,
                        config.getInt("enchanty.riptide.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.riptide.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.RIPTIDE, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.riptide.3.potrzebny-lvl"));
                }
                break;
            }
            case 40: {
                if (config.getBoolean("enchanty.riptide.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.RIPTIDE, 2,
                        config.getInt("enchanty.riptide.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.riptide.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.RIPTIDE, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.riptide.2.potrzebny-lvl"));
                }
                break;
            }
            case 49: {
                if (config.getBoolean("enchanty.riptide.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.RIPTIDE, 1,
                        config.getInt("enchanty.riptide.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.riptide.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.RIPTIDE, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.riptide.1.potrzebny-lvl"));
                }
                break;
            }

            //channeling
            case 50: {
                if (config.getBoolean("enchanty.channeling.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.CHANNELING, 1,
                        config.getInt("enchanty.channeling.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.channeling.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.CHANNELING, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.channeling.1.potrzebny-lvl"));
                }
                break;
            }
        }
    }
}
