package me.taison.enchantgui.listeners.guienchanting;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static me.taison.enchantgui.Utils.msg;

public class HelmetGUIEnchanting extends GUIEnchantingAbstract {

    public HelmetGUIEnchanting(ItemStack item, int slot, Player player, int bookshelves) {
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

            //aqua affinity
            case 47: {
                if (config.getBoolean("enchanty.aqua-affinity.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.WATER_WORKER, 1,
                        config.getInt("enchanty.aqua-affinity.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.aqua-affinity.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.WATER_WORKER, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.aqua-affinity.1.potrzebny-lvl"));
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

            //fire protection
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

            //respiration
            case 33: {
                if (config.getBoolean("enchanty.respiration.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.OXYGEN, 3,
                        config.getInt("enchanty.respiration.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.respiration.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.OXYGEN, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.respiration.3.potrzebny-lvl"));
                }
                break;
            }
            case 42: {
                if (config.getBoolean("enchanty.respiration.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.OXYGEN, 2,
                        config.getInt("enchanty.respiration.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.respiration.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.OXYGEN, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.respiration.2.potrzebny-lvl"));
                }
                break;
            }
            case 51: {
                if (config.getBoolean("enchanty.respiration.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.OXYGEN, 1,
                        config.getInt("enchanty.respiration.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.respiration.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.OXYGEN, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.respiration.1.potrzebny-lvl"));
                }
                break;
            }

            //projectile protection
            case 25: {
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
            case 34: {
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
            case 43: {
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
            case 52: {
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
