package me.taison.enchantgui.listeners;

import me.taison.enchantgui.gui.GuiHolder;
import me.taison.enchantgui.listeners.guienchanting.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null)
            return;

        if (!(event.getClickedInventory().getHolder() instanceof GuiHolder))
            return;

        event.setCancelled(true);

        GuiHolder gui = (GuiHolder) event.getClickedInventory().getHolder();
        ItemStack item = gui.getItemInHand();

        switch (gui.typeOfInventory) {
            case SWORD: {
                new SwordGUIEnchanting(item,
                        event.getSlot(),
                        (Player) event.getWhoClicked(),
                        gui.findBookshelves(gui.getClickedBlock().getLocation()));
                break;
            }
            case TOOLS: {
                new ToolGUIEnchanting(item,
                        event.getSlot(),
                        (Player) event.getWhoClicked(),
                        gui.findBookshelves(gui.getClickedBlock().getLocation()));
                break;
            }
            case CROSSBOW: {
                new CrossBowGUIEnchanting(item,
                        event.getSlot(),
                        (Player) event.getWhoClicked(),
                        gui.findBookshelves(gui.getClickedBlock().getLocation()));
                break;
            }
            case BOW: {
                new BowGUIEnchanting(item,
                        event.getSlot(),
                        (Player) event.getWhoClicked(),
                        gui.findBookshelves(gui.getClickedBlock().getLocation()));
                break;
            }
            case TRIDENT: {
                new TridentGUIEnchanting(item,
                        event.getSlot(),
                        (Player) event.getWhoClicked(),
                        gui.findBookshelves(gui.getClickedBlock().getLocation()));
                break;
            }
            case HELMET: {
                new HelmetGUIEnchanting(item,
                        event.getSlot(),
                        (Player) event.getWhoClicked(),
                        gui.findBookshelves(gui.getClickedBlock().getLocation()));
                break;
            }
            case CHESTPLATE: {
                new ChestplateGUIEnchanting(item,
                        event.getSlot(),
                        (Player) event.getWhoClicked(),
                        gui.findBookshelves(gui.getClickedBlock().getLocation()));
                break;
            }
            case LEGGINGS: {
                new LeggingsGUIEnchanting(item,
                        event.getSlot(),
                        (Player) event.getWhoClicked(),
                        gui.findBookshelves(gui.getClickedBlock().getLocation()));
                break;
            }
            case BOOTS: {
                new BootsGUIEnchanting(item,
                        event.getSlot(),
                        (Player) event.getWhoClicked(),
                        gui.findBookshelves(gui.getClickedBlock().getLocation()));
                break;
            }
        }
    }
}
