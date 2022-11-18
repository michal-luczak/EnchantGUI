package me.taison.enchantgui.listeners.guienchanting;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static me.taison.enchantgui.Utils.msg;

public class ToolGUIEnchanting extends GUIEnchantingAbstract {

    public ToolGUIEnchanting(ItemStack item, int slot, Player player, int bookshelves) {
        super(item, player, bookshelves);

        switch (slot) {

            //efficiency
            case 10: {
                if (config.getBoolean("enchanty.efficiency.5.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DIG_SPEED, 5,
                        config.getInt("enchanty.efficiency.5.potrzebne-biblioteczki"),
                        config.getInt("enchanty.efficiency.5.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DIG_SPEED, 5);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.efficiency.5.potrzebny-lvl"));
                }
                break;
            } case 19: {
                if (config.getBoolean("enchanty.efficiency.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DIG_SPEED, 4,
                        config.getInt("enchanty.efficiency.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.efficiency.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DIG_SPEED, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.efficiency.4.potrzebny-lvl"));
                }
                break;
            } case 28: {
                if (config.getBoolean("enchanty.efficiency.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DIG_SPEED, 3,
                        config.getInt("enchanty.efficiency.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.efficiency.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DIG_SPEED, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.efficiency.3.potrzebny-lvl"));
                }
                break;
            } case 37: {
                if (config.getBoolean("enchanty.efficiency.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DIG_SPEED, 2,
                        config.getInt("enchanty.efficiency.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.efficiency.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DIG_SPEED, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.efficiency.2.potrzebny-lvl"));
                }
                break;
            } case 46: {
                if (config.getBoolean("enchanty.efficiency.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DIG_SPEED, 1,
                        config.getInt("enchanty.efficiency.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.efficiency.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DIG_SPEED, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.efficiency.1.potrzebny-lvl"));
                }
                break;
            }

            //fortune
            case 29: {
                if (config.getBoolean("enchanty.fortune.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3,
                        config.getInt("enchanty.fortune.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.fortune.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.fortune.3.potrzebny-lvl"));
                }
                break;
            }
            case 38: {
                if (config.getBoolean("enchanty.fortune.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2,
                        config.getInt("enchanty.fortune.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.fortune.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.fortune.2.potrzebny-lvl"));
                }
                break;
            }
            case 47: {
                if (config.getBoolean("enchanty.fortune.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1,
                        config.getInt("enchanty.fortune.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.fortune.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.fortune.1.potrzebny-lvl"));
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

            //silk touch
            case 49: {
                if (config.getBoolean("enchanty.silk-touch.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.SILK_TOUCH, 1,
                        config.getInt("enchanty.silk-touch.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.silk-touch.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.SILK_TOUCH, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.silk-touch.1.potrzebny-lvl"));
                }
                break;
            }
        }
    }
}
