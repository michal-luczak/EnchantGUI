package me.taison.enchantgui.listeners.guienchanting;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static me.taison.enchantgui.Utils.msg;

public class BowGUIEnchanting extends GUIEnchantingAbstract {

    public BowGUIEnchanting(ItemStack item, int slot, Player player, int bookshelves) {
        super(item, player, bookshelves);

        switch (slot) {

            //power
            case 10: {
                if (config.getBoolean("enchanty.power.5.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.ARROW_DAMAGE, 5,
                        config.getInt("enchanty.power.5.potrzebne-biblioteczki"),
                        config.getInt("enchanty.power.5.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.power.5.potrzebny-lvl"));
                }
                break;
            }
            case 19: {
                if (config.getBoolean("enchanty.power.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.ARROW_DAMAGE, 4,
                        config.getInt("enchanty.power.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.power.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.power.4.potrzebny-lvl"));
                }
                break;
            }
            case 28: {
                if (config.getBoolean("enchanty.power.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.ARROW_DAMAGE, 3,
                        config.getInt("enchanty.power.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.power.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.power.3.potrzebny-lvl"));
                }
                break;
            }
            case 37: {
                if (config.getBoolean("enchanty.power.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.ARROW_DAMAGE, 2,
                        config.getInt("enchanty.power.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.power.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.power.2.potrzebny-lvl"));
                }
                break;
            }
            case 46: {
                if (config.getBoolean("enchanty.power.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.ARROW_DAMAGE, 1,
                        config.getInt("enchanty.power.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.power.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.power.1.potrzebny-lvl"));
                }
                break;
            }

            //flame
            case 47: {
                if (config.getBoolean("enchanty.flame.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.ARROW_FIRE, 1,
                        config.getInt("enchanty.flame.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.flame.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.ARROW_FIRE, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.flame.1.potrzebny-lvl"));
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

            //punch
            case 40: {
                if (config.getBoolean("enchanty.punch.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.ARROW_KNOCKBACK, 2,
                        config.getInt("enchanty.punch.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.punch.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.punch.2.potrzebny-lvl"));
                }
                break;
            }
            case 49: {
                if (config.getBoolean("enchanty.punch.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.ARROW_KNOCKBACK, 1,
                        config.getInt("enchanty.punch.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.punch.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.punch.1.potrzebny-lvl"));
                }
                break;
            }

            //infinity
            case 50: {
                if (config.getBoolean("enchanty.infinity.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.ARROW_INFINITE, 1,
                        config.getInt("enchanty.infinity.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.infinity.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.ARROW_INFINITE, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.infinity.1.potrzebny-lvl"));
                }
                break;
            }
        }
    }
}
