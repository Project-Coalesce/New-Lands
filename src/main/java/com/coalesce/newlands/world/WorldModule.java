package com.coalesce.newlands.world;

import com.coalesce.newlands.chunk.NewLandsChunkGenerator;
import com.coalesce.newlands.populator.LogPopulator;
import com.coalesce.newlands.util.ReflectionUtil;
import com.coalesce.plugin.CoModule;
import com.coalesce.plugin.CoPlugin;
import net.minecraft.server.v1_11_R1.*;
import org.bukkit.craftbukkit.v1_11_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_11_R1.generator.NormalChunkGenerator;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.WorldInitEvent;

public class WorldModule extends CoModule {

	public WorldModule(CoPlugin plugin) {
		super(plugin, "World Module");

		getPlugin().registerListener(this);
	}

	@Override
	protected void onEnable() throws Exception {

	}

	@Override
	protected void onDisable() throws Exception {

	}

	private ChunkProviderServer getChunkProvider(WorldServer worldServer){

		return new ChunkProviderServer(
				worldServer,
				worldServer.getDataManager().createChunkLoader(worldServer.worldProvider),
				new NormalChunkGenerator(worldServer, worldServer.getSeed()));

	}

	@EventHandler
	public void onWorldInit(final WorldInitEvent event){
		//This listener listens for worlds that implement our dummy generator, and then intercept it

		if (event.getWorld().getGenerator() instanceof NewLandsChunkGenerator){

			CraftWorld craftWorld = (CraftWorld) event.getWorld();
			WorldServer worldServer = craftWorld.getHandle();

			try {
				//Change world values so that we go back to using the default generator
				ReflectionUtil.setField(World.class.getDeclaredField("generator"), worldServer, null);
				ReflectionUtil.setField(World.class.getDeclaredField("chunkProvider"), worldServer, getChunkProvider(worldServer));

				//TODO: This is a test
				craftWorld.getPopulators().add(new LogPopulator());

			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
		}
	}
}
