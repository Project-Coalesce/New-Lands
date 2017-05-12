package com.coalesce.newlands;

import com.coalesce.newlands.chunk.NewLandsChunkGenerator;
import com.coalesce.plugin.CoPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class NewLandsPlugin extends CoPlugin {

	private final static String TARGET_WORLD_NAME = "world";

    @Override
    public void onPluginEnable(){

        this.displayName = ChatColor.GREEN + "New Lands";
    }

	@Override
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id){

    	World world = Bukkit.getWorld(worldName);

		return new NewLandsChunkGenerator(world, world.getSeed());

	}

}
