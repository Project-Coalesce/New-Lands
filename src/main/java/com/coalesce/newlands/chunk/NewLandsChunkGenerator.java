package com.coalesce.newlands.chunk;

import net.minecraft.server.v1_11_R1.WorldServer;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_11_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_11_R1.generator.NormalChunkGenerator;
import org.bukkit.generator.ChunkGenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class NewLandsChunkGenerator extends NormalChunkGenerator {

	Set<UUID> modifiedWorlds;

	public NewLandsChunkGenerator(World world, long seed){
		super(world, seed);

		modifiedWorlds = new HashSet<>();

	}

}
