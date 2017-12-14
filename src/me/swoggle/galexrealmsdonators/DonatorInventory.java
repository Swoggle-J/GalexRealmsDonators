package me.swoggle.galexrealmsdonators;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class DonatorInventory {

    private static ItemStack setNameAndLore(Material material, int amount, String name, String... lore)
    {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        ArrayList<String> lorez = new ArrayList<String>();
        for(String mylores : lore)
        {
            lorez.add(ChatColor.translateAlternateColorCodes('&', mylores));
        }
        meta.setLore(lorez);
        item.setItemMeta(meta);
        return item;
    }

    public static Inventory DInventory = Bukkit.createInventory(null, 9, "Donator Features");

    static {
        DInventory.setItem(0, new ItemStack(setNameAndLore(Material.COAL, 1, "&aTEST", "&6TEST", "&4TEST")));
        DInventory.setItem(1, new ItemStack(setNameAndLore(Material.SAND, 1, "&aTEST", "&6TEST", "&4TEST")));
        DInventory.setItem(2, new ItemStack(setNameAndLore(Material.RED_MUSHROOM, 1, "&aTEST", "&6TEST", "&4TEST")));
        DInventory.setItem(3, new ItemStack(setNameAndLore(Material.RAW_FISH, 1, "&aTEST", "&6TEST", "&4TEST")));
        DInventory.setItem(4, new ItemStack(setNameAndLore(Material.QUARTZ, 1, "&aTEST", "&6TEST", "&4TEST")));
        DInventory.setItem(5, new ItemStack(setNameAndLore(Material.POWERED_RAIL, 1, "&aTEST", "&6TEST", "&4TEST")));
        DInventory.setItem(6, new ItemStack(setNameAndLore(Material.ACACIA_FENCE, 1, "&aTEST", "&6TEST", "&4TEST")));
        DInventory.setItem(7, new ItemStack(setNameAndLore(Material.ACACIA_DOOR, 1, "&aTEST", "&6TEST", "&4TEST")));
        DInventory.setItem(8, new ItemStack(setNameAndLore(Material.STICK, 1, "&aTEST", "&6TEST", "&4TEST")));
    }
}