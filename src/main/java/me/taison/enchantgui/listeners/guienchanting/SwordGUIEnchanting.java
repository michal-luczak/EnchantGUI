package me.taison.enchantgui.listeners.guienchanting;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static me.taison.enchantgui.Utils.msg;

public class SwordGUIEnchanting extends GUIEnchantingAbstract {

    public SwordGUIEnchanting(ItemStack item, int slot, Player player, int bookshelves) {
        super(item, player, bookshelves);

        switch (slot) {

            //sharpness
            case 10: {
                if (config.getBoolean("enchanty.sharpness.5.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ALL, 5,
                        config.getInt("enchanty.sharpness.5.potrzebne-biblioteczki"),
                        config.getInt("enchanty.sharpness.5.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.sharpness.5.potrzebny-lvl"));
                }
                break;
            } case 19: {
                if (config.getBoolean("enchanty.sharpness.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ALL, 4,
                        config.getInt("enchanty.sharpness.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.sharpness.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.sharpness.4.potrzebny-lvl"));
                }
                break;
            } case 28: {
                if (config.getBoolean("enchanty.sharpness.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ALL, 3,
                        config.getInt("enchanty.sharpness.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.sharpness.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.sharpness.3.potrzebny-lvl"));
                }
                break;
            } case 37: {
                if (config.getBoolean("enchanty.sharpness.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ALL, 2,
                        config.getInt("enchanty.sharpness.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.sharpness.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.sharpness.2.potrzebny-lvl"));
                }
                break;
            } case 46: {
                if (config.getBoolean("enchanty.sharpness.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ALL, 1,
                        config.getInt("enchanty.sharpness.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.sharpness.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.sharpness.1.potrzebny-lvl"));
                }
                break;
            }

            //fire aspect
            case 38: {
                if (config.getBoolean("enchanty.fire-aspect.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.FIRE_ASPECT, 2,
                        config.getInt("enchanty.fire-aspect.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.fire-aspect.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.fire-aspect.2.potrzebny-lvl"));
                }
                break;
            }
            case 47: {
                if (config.getBoolean("enchanty.fire-aspect.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.FIRE_ASPECT, 1,
                        config.getInt("enchanty.fire-aspect.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.fire-aspect.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.FIRE_ASPECT, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.fire-aspect.1.potrzebny-lvl"));
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

            //knockback
            case 40: {
                if (config.getBoolean("enchanty.knockback.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.KNOCKBACK, 2,
                        config.getInt("enchanty.knockback.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.knockback.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.KNOCKBACK, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.knockback.2.potrzebny-lvl"));
                }
                break;
            }
            case 49: {
                if (config.getBoolean("enchanty.knockback.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.KNOCKBACK, 1,
                        config.getInt("enchanty.knockback.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.knockback.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.KNOCKBACK, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.knockback.1.potrzebny-lvl"));
                }
                break;
            }

            //looting
            case 32: {
                if (config.getBoolean("enchanty.looting.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.LOOT_BONUS_MOBS, 3,
                        config.getInt("enchanty.looting.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.looting.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.looting.3.potrzebny-lvl"));
                }
                break;
            }
            case 41: {
                if (config.getBoolean("enchanty.looting.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.LOOT_BONUS_MOBS, 2,
                        config.getInt("enchanty.looting.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.looting.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.looting.2.potrzebny-lvl"));
                }
                break;
            }
            case 50: {
                if (config.getBoolean("enchanty.looting.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.LOOT_BONUS_MOBS, 1,
                        config.getInt("enchanty.looting.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.looting.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.looting.1.potrzebny-lvl"));
                }
                break;
            }

            //bane of arthropods
            case 15: {
                if (config.getBoolean("enchanty.bane-of-arthropods.5.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ARTHROPODS, 5,
                        config.getInt("enchanty.bane-of-arthropods.5.potrzebne-biblioteczki"),
                        config.getInt("enchanty.bane-of-arthropods.5.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ARTHROPODS, 5);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.bane-of-arthropods.5.potrzebny-lvl"));
                }
                break;
            }
            case 24: {
                if (config.getBoolean("enchanty.bane-of-arthropods.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ARTHROPODS, 4,
                        config.getInt("enchanty.bane-of-arthropods.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.bane-of-arthropods.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ARTHROPODS, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.bane-of-arthropods.4.potrzebny-lvl"));
                }
                break;
            }
            case 33: {
                if (config.getBoolean("enchanty.bane-of-arthropods.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ARTHROPODS, 3,
                        config.getInt("enchanty.bane-of-arthropods.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.bane-of-arthropods.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ARTHROPODS, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.bane-of-arthropods.3.potrzebny-lvl"));
                }
                break;
            }
            case 42: {
                if (config.getBoolean("enchanty.bane-of-arthropods.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ARTHROPODS, 2,
                        config.getInt("enchanty.bane-of-arthropods.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.bane-of-arthropods.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ARTHROPODS, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.bane-of-arthropods.2.potrzebny-lvl"));
                }
                break;
            }
            case 51: {
                if (config.getBoolean("enchanty.bane-of-arthropods.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_ARTHROPODS, 1,
                        config.getInt("enchanty.bane-of-arthropods.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.bane-of-arthropods.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_ARTHROPODS, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.bane-of-arthropods.1.potrzebny-lvl"));
                }
                break;
            }

            //smite
            case 16: {
                if (config.getBoolean("enchanty.smite.5.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_UNDEAD, 5,
                        config.getInt("enchanty.smite.5.potrzebne-biblioteczki"),
                        config.getInt("enchanty.smite.5.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_UNDEAD, 5);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.smite.5.potrzebny-lvl"));
                }
                break;
            }
            case 25: {
                if (config.getBoolean("enchanty.smite.4.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_UNDEAD, 4,
                        config.getInt("enchanty.smite.4.potrzebne-biblioteczki"),
                        config.getInt("enchanty.smite.4.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_UNDEAD, 4);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.smite.4.potrzebny-lvl"));
                }
                break;
            }
            case 34: {
                if (config.getBoolean("enchanty.smite.3.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_UNDEAD, 3,
                        config.getInt("enchanty.smite.3.potrzebne-biblioteczki"),
                        config.getInt("enchanty.smite.3.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_UNDEAD, 3);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.smite.3.potrzebny-lvl"));
                }
                break;
            }
            case 43: {
                if (config.getBoolean("enchanty.smite.2.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_UNDEAD, 2,
                        config.getInt("enchanty.smite.2.potrzebne-biblioteczki"),
                        config.getInt("enchanty.smite.2.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_UNDEAD, 2);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.smite.2.potrzebny-lvl"));
                }
                break;
            }
            case 52: {
                if (config.getBoolean("enchanty.smite.1.zablokowany")) {
                    msg(player, "&cTen enchant jest zablokowany na tym serwerze!");
                    return;
                }
                if (validateEnchant(Enchantment.DAMAGE_UNDEAD, 1,
                        config.getInt("enchanty.smite.1.potrzebne-biblioteczki"),
                        config.getInt("enchanty.smite.1.potrzebny-lvl"))) {
                    item.addEnchantment(Enchantment.DAMAGE_UNDEAD, 1);
                    player.setLevel(player.getLevel()-config.getInt("enchanty.smite.1.potrzebny-lvl"));
                }
                break;
            }
        }
    }
}
