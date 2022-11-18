package me.taison.enchantgui.listeners.guienchanting;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static me.taison.enchantgui.Utils.msg;

public class ChestplateGUIEnchanting extends GUIEnchantingAbstract {

    public ChestplateGUIEnchanting(ItemStack item, int slot, Player player, int bookshelves) {
        super(item, player, bookshelves);

        switch (slot) {

            //protection
            case 19: {
                if (config.getBoolean("enchanty.protection.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4,
                        config.getInt("enchanty.protection.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.protection.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.protection.4.potrzebny-lvl"));
                }
                break;
            }
            case 28: {
                if (config.getBoolean("enchanty.protection.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3,
                        config.getInt("enchanty.protection.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.protection.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.protection.3.potrzebny-lvl"));
                }
                break;
            }
            case 37: {
                if (config.getBoolean("enchanty.protection.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2,
                        config.getInt("enchanty.protection.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.protection.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.protection.2.potrzebny-lvl"));
                }
                break;
            }
            case 46: {
                if (config.getBoolean("enchanty.protection.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1,
                        config.getInt("enchanty.protection.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.protection.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.protection.1.potrzebny-lvl"));
                }
                break;
            }

            //throns
            case 29: {
                if (config.getBoolean("enchanty.thorns.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.THORNS, 3,
                        config.getInt("enchanty.thorns.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.thorns.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.THORNS, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.thorns.3.potrzebny-lvl"));
                }
                break;
            }
            case 38: {
                if (config.getBoolean("enchanty.thorns.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.THORNS, 2,
                        config.getInt("enchanty.thorns.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.thorns.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.THORNS, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.thorns.2.potrzebny-lvl"));
                }
                break;
            }
            case 47: {
                if (config.getBoolean("enchanty.thorns.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.THORNS, 1,
                        config.getInt("enchanty.thorns.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.thorns.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.THORNS, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.thorns.1.potrzebny-lvl"));
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
                    player.setLevel(player.getLevel()- config.getInt("enchanty.unbreaking.3.potrzebny-lvl"));
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

            //blast protection
            case 22: {
                if (config.getBoolean("enchanty.blast-protection.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_EXPLOSIONS, 4,
                        config.getInt("enchanty.blast-protection.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.blast-protection.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.blast-protection.4.potrzebny-lvl"));
                }
                break;
            }
            case 31: {
                if (config.getBoolean("enchanty.blast-protection.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_EXPLOSIONS, 3,
                        config.getInt("enchanty.blast-protection.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.blast-protection.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.blast-protection.3.potrzebny-lvl"));
                }
                break;
            }
            case 40: {
                if (config.getBoolean("enchanty.blast-protection.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_EXPLOSIONS, 2,
                        config.getInt("enchanty.blast-protection.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.blast-protection.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.blast-protection.2.potrzebny-lvl"));
                }
                break;
            }
            case 49: {
                if (config.getBoolean("enchanty.blast-protection.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_EXPLOSIONS, 1,
                        config.getInt("enchanty.blast-protection.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.blast-protection.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.blast-protection.1.potrzebny-lvl"));
                }
                break;
            }

            //fire-protection
            case 23: {
                if (config.getBoolean("enchanty.fire-protection.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_FIRE, 4,
                        config.getInt("enchanty.fire-protection.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.fire-protection.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_FIRE, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.fire-protection.4.potrzebny-lvl"));
                }
                break;
            }
            case 32: {
                if (config.getBoolean("enchanty.fire-protection.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_FIRE, 3,
                        config.getInt("enchanty.fire-protection.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.fire-protection.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.fire-protection.3.potrzebny-lvl"));
                }
                break;
            }
            case 41: {
                if (config.getBoolean("enchanty.fire-protection.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_FIRE, 2,
                        config.getInt("enchanty.fire-protection.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.fire-protection.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_FIRE, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.fire-protection.2.potrzebny-lvl"));
                }
                break;
            }
            case 50: {
                if (config.getBoolean("enchanty.fire-protection.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_FIRE, 1,
                        config.getInt("enchanty.fire-protection.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.fire-protection.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_FIRE, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.fire-protection.1.potrzebny-lvl"));
                }
                break;
            }

            //projectile-protection
            case 24: {
                if (config.getBoolean("enchanty.projectile-protection.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_PROJECTILE, 4,
                        config.getInt("enchanty.projectile-protection.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.projectile-protection.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.projectile-protection.4.potrzebny-lvl"));
                }
                break;
            }
            case 33: {
                if (config.getBoolean("enchanty.projectile-protection.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_PROJECTILE, 3,
                        config.getInt("enchanty.projectile-protection.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.projectile-protection.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.projectile-protection.3.potrzebny-lvl"));
                }
                break;
            }
            case 42: {
                if (config.getBoolean("enchanty.projectile-protection.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_PROJECTILE, 2,
                        config.getInt("enchanty.projectile-protection.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.projectile-protection.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.projectile-protection.2.potrzebny-lvl"));
                }
                break;
            }
            case 51: {
                if (config.getBoolean("enchanty.projectile-protection.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.PROTECTION_PROJECTILE, 1,
                        config.getInt("enchanty.projectile-protection.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.projectile-protection.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.projectile-protection.1.potrzebny-lvl"));
                }
                break;
            }
        }
    }
}
