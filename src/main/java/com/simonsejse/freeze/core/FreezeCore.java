package com.simonsejse.freeze.core;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class FreezeCore extends JavaPlugin {

    private Configuration configuration;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        final File file = new File(this.getDataFolder(), "config.yml");
        Yaml yaml = new Yaml(new CustomClassLoaderConstructor(Configuration.class.getClassLoader()));
        try(InputStream in = Files.newInputStream(file.toPath())){
            this.configuration = yaml.loadAs(in, Configuration.class);
        }catch(IOException io) {
            Bukkit.getLogger().info("Configuration wasn't loaded properly. Reload or check your config.yml file.");
        }
        Kit.
    }


c
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}


