package ru.lion;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import ru.lion.ru.lion.utils.ItemUtil;

public class GUI implements Listener {

    public static void openGUI(Player p) {
        Inventory inv = Bukkit.createInventory(null, 9, "Anus");

        inv.setItem(0, ItemUtil.create(Material.LEATHER_HELMET, "Одеть анус"));
        inv.setItem(1, ItemUtil.create(Material.CHAINMAIL_HELMET, "Одеть шкуру ануса"));
        inv.setItem(2, ItemUtil.create(Material.IRON_HELMET, "Ничего не придумал"));
        inv.setItem(3, ItemUtil.create(Material.DIAMOND_HELMET, "..."));

        inv.setItem(8, ItemUtil.create(Material.WOOD_DOOR, ChatColor.RED + "Выход в кишку ->"));

        p.openInventory(inv);
    }

    @EventHandler
    public void onInventoryClick (InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equalsIgnoreCase("Выбор | Ануса")) {
            e.setCancelled(true);

            if (e.getCurrentItem().getType() == Material.WOOD_DOOR) {
                p.closeInventory();
            }

            else if (e.getCurrentItem().getType() == Material.LEATHER_HELMET) {
                p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
                p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
                p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
                p.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));

                p.sendMessage("Вы одели Идеальный Анус");
                p.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.CHAINMAIL_HELMET) {
                p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
                p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
                p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
                p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));

                p.sendMessage("Вы Слегка погнутый анус");
                p.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.GOLD_HELMET) {
                p.getInventory().setHelmet(new ItemStack(Material.GOLD_HELMET));
                p.getInventory().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
                p.getInventory().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
                p.getInventory().setBoots(new ItemStack(Material.GOLD_BOOTS));

                p.sendMessage("Вы одели весьма погнутый Анус");
                p.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.IRON_HELMET) {
                p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
                p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
                p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));

                p.sendMessage("Вы одели Анус");
                p.closeInventory();
            }
            else if (e.getCurrentItem().getType() == Material.LEATHER_HELMET) {
                p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
                p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
                p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
                p.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));

                p.sendMessage("Вы одели Анус");
                p.closeInventory();
            }

        }
    }
}
