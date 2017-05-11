package com.coalesce.newlands;

import com.coalesce.plugin.CoPlugin;
import org.bukkit.ChatColor;
import org.bukkit.generator.ChunkGenerator;

public class NewLandsPlugin extends CoPlugin {

    @Override
    public void onPluginEnable(){

        this.displayName = ChatColor.GREEN + "New Lands";

    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        //This is where the generator we create will be returned
        return null;
    }

}
