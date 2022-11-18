package me.taison.enchantgui.listeners.guienchanting;

import me.taison.enchantgui.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static me.taison.enchantgui.Utils.msg;

public abstract class GUIEnchantingAbstract {

    private final ItemStack itemStack;
    private final Player player;
    private final int bookshelves;
    protected static final FileConfiguration config = Main.getPlugin(Main.class).getConfig();

    protected GUIEnchantingAbstract(ItemStack itemStack, Player player, int bookshelves) {
        this.itemStack = itemStack;
        this.player = player;
        this.bookshelves = bookshelves;
    }

    public boolean validateEnchant(Enchantment enchantment, int enchantLvl, int requireBookshelves, int requireLvl) {
        if (enchantChecker(enchantment)) {
            if (!enchantLvlChecker(enchantment, enchantLvl)) {
                msg(player, "&cPosiadasz już ten enchant!");
                return false;
            }
        }
        if (!lvlChecker(requireLvl)) {
            msg(player, "&cNie masz wystarczająco exp'a!");
            return false;
        }
        if (!bookshelvesChecker(requireBookshelves)) {
            msg(player, "&cPostawiono za mało biblioteczek!");
            return false;
        }
        msg(player, "&aEnchant udany!");
        return true;
    }

    private boolean enchantChecker(Enchantment enchantment) {
        return itemStack.containsEnchantment(enchantment);
    }

    private boolean enchantLvlChecker(Enchantment enchantment, int lvl) {
        return itemStack.getEnchantments().get(enchantment) < lvl;
    }

    private boolean lvlChecker(int requireLvl) {
        return player.getLevel() >= requireLvl;
    }

    private boolean bookshelvesChecker(int requireBookshelves) {
        return bookshelves >= requireBookshelves;
    }
}
