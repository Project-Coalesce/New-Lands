package com.coalesce.newlands.world;

import com.coalesce.newlands.chunk.NewLandsChunkGenerator;
import com.coalesce.plugin.CoModule;
import com.coalesce.plugin.CoPlugin;
import net.minecraft.server.v1_11_R1.MinecraftServer;
import net.minecraft.server.v1_11_R1.WorldServer;

import java.util.List;
import java.util.stream.Collectors;

public class WorldModule extends CoModule {

	private List<WorldServer> newLandsWorlds;

	public WorldModule(CoPlugin plugin) {
		super(plugin, "World Module");
	}

	public void load(){

		newLandsWorlds = MinecraftServer.getServer().worlds.stream()
				.filter(worldServer -> worldServer.generator instanceof NewLandsChunkGenerator)
				.collect(Collectors.toList());

		System.out.println(newLandsWorlds.size());
		System.out.println(MinecraftServer.getServer().worlds.size());



		newLandsWorlds.forEach(craftWorld -> {

			System.out.println("HELLO");
			craftWorld.generator = null;

		});
	}

	@Override
	protected void onEnable() throws Exception {

	}

	@Override
	protected void onDisable() throws Exception {

	}

}
