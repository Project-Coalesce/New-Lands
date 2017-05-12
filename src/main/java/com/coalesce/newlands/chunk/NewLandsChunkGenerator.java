package com.coalesce.newlands.chunk;

import net.minecraft.server.v1_11_R1.ChunkGenerator;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_11_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_11_R1.generator.NormalChunkGenerator;

import java.lang.reflect.Field;

public class NewLandsChunkGenerator extends NormalChunkGenerator {

	protected ChunkGenerator chunkGenerator;

	public NewLandsChunkGenerator(World world, long seed){
		super(((CraftWorld)world).getHandle(), seed);

		chunkGenerator = getChunkGenerator();

		System.out.println("It works");
	}

	private ChunkGenerator getChunkGenerator(){

		ChunkGenerator generator = null;

		try {
			Field chunkGeneratorField = NormalChunkGenerator.class.getField("generator");
			chunkGeneratorField.setAccessible(true);
			generator = (ChunkGenerator) chunkGeneratorField.get(this);
			chunkGeneratorField.setAccessible(false);

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return generator;
	}

}
