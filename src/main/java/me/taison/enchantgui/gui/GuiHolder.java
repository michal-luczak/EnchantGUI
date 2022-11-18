package me.taison.enchantgui.gui;

import me.taison.enchantgui.TypeOfInventory;
import me.taison.enchantgui.gui.guibuilders.*;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import static me.taison.enchantgui.Utils.color;

public class GuiHolder implements InventoryHolder {

    private final Inventory inv;
    public final ItemStack itemInHand;
    public TypeOfInventory typeOfInventory;
    public Block clickedBlock;


    public Block getClickedBlock() {
        return clickedBlock;
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }

    public ItemStack getItemInHand() {
        return itemInHand;
    }


    public GuiHolder(Block clickedBlock, ItemStack itemInHand) {
        inv = Bukkit.createInventory(this, 54, color("&8»  &9AKTYWNE BIBLIOTECZKI: &e" + findBookshelves(clickedBlock.getLocation()) + "  &8«"));
        init(clickedBlock, itemInHand.getType());
        this.itemInHand = itemInHand;
        this.clickedBlock = clickedBlock;
    }

    private void init(Block clickedBlock, Material itemInHand) {

        ItemStack redGlass = new ItemStack(Material.RED_STAINED_GLASS_PANE);
        ItemStack greenGlass = new ItemStack(Material.LIME_STAINED_GLASS_PANE);

        if (findBookshelves(clickedBlock.getLocation()) == 35) {
            for (int i=45; i>=0; i-=9) {
                inv.setItem(i, greenGlass);
                inv.setItem(i+8, greenGlass);
            }
        } else if (findBookshelves(clickedBlock.getLocation()) == 0) {
            for (int i=45; i>=0; i-=9) {
                inv.setItem(i, redGlass);
                inv.setItem(i+8, redGlass);
            }
        } else {
            int counter = 0;
            for (int i=45; i>=0; i-=9) {
                if (findBookshelves(clickedBlock.getLocation())/6 > counter) {
                    inv.setItem(i, greenGlass);
                    inv.setItem(i+8, greenGlass);
                } else {
                    inv.setItem(i, redGlass);
                    inv.setItem(i+8, redGlass);
                }
                counter++;
            }
        }

        switch (itemInHand.toString().substring(itemInHand.toString().indexOf('_')+1)) {

            //tools
            case "PICKAXE":
            case "HOE":
            case "SHOVEL":
            case "AXE": {
                new ToolGUIBuilder(inv).init();
                typeOfInventory = TypeOfInventory.TOOLS;
                break;
            }

            //armor
            case "CHESTPLATE": {
                new ChestplateGUIBuilder(inv).init();
                typeOfInventory = TypeOfInventory.CHESTPLATE;
                break;
            }
            case "LEGGINGS": {
                new LeggingsGUIBuilder(inv).init();
                typeOfInventory = TypeOfInventory.LEGGINGS;
                break;
            }
            case "BOOTS": {
                new BootsGUIBuilder(inv).init();
                typeOfInventory = TypeOfInventory.BOOTS;
                break;
            }
            case "HELMET": {
                new HelmetGUIBuilder(inv).init();
                typeOfInventory = TypeOfInventory.HELMET;
                break;
            }

            //weapons
            case "SWORD": {
                new SwordGUIBuilder(inv).init();
                typeOfInventory = TypeOfInventory.SWORD;
                break;
            }
            case "BOW": {
                new BowGUIBuilder(inv).init();
                typeOfInventory = TypeOfInventory.BOW;
                break;
            }
            case "CROSSBOW": {
                new CrossbowGUIBuilder(inv).init();
                typeOfInventory = TypeOfInventory.CROSSBOW;
                break;
            }
            case "TRIDENT": {
                new TridentGUIBuilder(inv).init();
                typeOfInventory = TypeOfInventory.TRIDENT;
                break;
            }
        }
    }

    public int findBookshelves(Location location) {
        int amount = 0;
        int x = location.getBlockX();
        int y = location.getBlockY();
        int z = location.getBlockZ();

        for (int i=y; i<y+3; i++) {

            for (int j=x-2; j<=x+2; j++)
                if (location.getWorld().getBlockAt(j, i, z-2).getType().equals(Material.BOOKSHELF))
                    amount++;

            for (int j=x-2; j<=x+2; j++)
                if (location.getWorld().getBlockAt(j, i, z+2).getType().equals(Material.BOOKSHELF))
                    amount++;

            for (int j=z-1; j<=z+1; j++)
                if (location.getWorld().getBlockAt(x+2, i, j).getType().equals(Material.BOOKSHELF))
                    amount++;

            for (int j=z-1; j<=z+1; j++)
                if (location.getWorld().getBlockAt(x-2, i, j).getType().equals(Material.BOOKSHELF))
                    amount++;
        }

        return amount;
    }
}
