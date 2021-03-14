package com.simonsejse.freeze.core;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public enum Kit {

    STANDARD(new ItemStack(Material.GRASS));

    private List<ItemStack> items = new LinkedList<>();

    Kit(ItemStack... itemStack){
        Arrays.stream(itemStack).forEach(items::add);
    }

}
