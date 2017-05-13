package com.coalesce.newlands.populator;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

public class LogPopulator extends BlockPopulator {

	@Override
	public void populate(World world, Random random, Chunk chunk) {

		chunk.getBlock(0, 100, 0).setType(Material.GOLD_BLOCK);

	}
}
