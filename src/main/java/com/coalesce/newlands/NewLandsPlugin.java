package com.coalesce.newlands;

import com.coalesce.newlands.chunk.NewLandsChunkGenerator;
import com.coalesce.newlands.world.WorldModule;
import com.coalesce.plugin.CoPlugin;
import org.bukkit.ChatColor;
import org.bukkit.generator.ChunkGenerator;

public class NewLandsPlugin extends CoPlugin {

	WorldModule worldModule;

	private final static String TARGET_WORLD_NAME = "world";

    @Override
    public void onPluginEnable(){

        this.displayName = ChatColor.GREEN + "New Lands";
    }

	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id){

		return new NewLandsChunkGenerator();

	}

}
