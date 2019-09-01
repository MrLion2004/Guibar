package ru.lion.ru.lion.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemUtil {

    public static ItemStack create(Material, int amount, byte data, String displayName, String lore1, String lore2, String lore3 String lore4) {
        ItemStack item = new ItemStack(Material, amount, data);
        ItemStack meta = item.getItemMeta();

        if (displayName != null) {
            meta.setDisplayName(displayName);
        }
        ArrayList<String> lore = new ArrayList<String>();

        if (lore1 != null) {
            lore.add(lore1);
        }
        if (lore2 != null) {
            lore.add(lore2);
        }
        if (lore3 != null) {
            lore.add(lore3);
        }
        if (lore4 != null) {
            lore.add(lore4);
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public static ItemStack create(Material material, String displayName) {
        return create(material, 1, (byte)0, displayName);
    }
    public static ItemStack create(Material material, int amount, byte data, String displayName) {
        return create(material, data, displayName, null, null, null, null);
    }
}
