package me.taison.enchantgui.listeners;

import me.taison.enchantgui.Main;
import me.taison.enchantgui.gui.GuiHolder;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.List;

import static me.taison.enchantgui.Utils.msg;

public class EnchantInteract implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {

        if (event.getClickedBlock() == null)
            return;
        else if (!event.getClickedBlock().getType().equals(Material.ENCHANTING_TABLE))
            return;
        else if (event.getAction().equals(Action.LEFT_CLICK_BLOCK))
            return;

        event.setCancelled(true);

        if (event.getItem() == null) {
            msg(event.getPlayer(), "&cTrzymaj w ręce przedmiot, który chcesz enchantować!");
            return;
        }

        List<String> allowedItems = new ArrayList<>(Main.getPlugin(Main.class).getConfig().getStringList("przedmioty-ktore-mozna-enchantowac"));

        boolean shortName = allowedItems.contains(event.getItem().getType().toString().substring(event.getItem().getType().toString().indexOf('_')+1));

        if (!allowedItems.contains(event.getItem().getType().toString()) && !shortName) {
            msg(event.getPlayer(), "&cNie możesz tego enchantować!");
            return;
        }

        GuiHolder gui = new GuiHolder(event.getClickedBlock(), event.getItem());
        event.getPlayer().openInventory(gui.getInventory());
    }
}
