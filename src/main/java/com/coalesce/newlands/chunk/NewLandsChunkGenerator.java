package com.coalesce.newlands.chunk;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class NewLandsChunkGenerator extends ChunkGenerator {

	@Override
	public byte[][] generateBlockSections(World world, Random random, int x, int z, ChunkGenerator.BiomeGrid biomes) {
		return new byte[16 * 16 * 16][];
	}

}
