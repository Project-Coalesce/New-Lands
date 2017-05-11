package com.coalesce.newlands;

import org.bukkit.block.Biome;

public enum NMSBiome {

    BEACH(Biome.BEACHES, "Beach"),
    BIG_HILLS(Biome.EXTREME_HILLS, "BigHills"),
    DESERT(Biome.DESERT, "Desert"),
    FOREST(Biome.FOREST, "Forest"),
    FOREST_MUTATED(Biome.MUTATED_FOREST, "ForestMutated"),
    HELL(Biome.HELL, "Hell"),
    ICE_PLAINS(Biome.ICE_FLATS, "IcePlains"),
    JUNGLE(Biome.JUNGLE, "Jungle"),
    MESA(Biome.MESA, "Mesa"),
    MUSHROOMS(Biome.MUSHROOM_ISLAND, "Mushrooms"),
    OCEAN(Biome.OCEAN, "Ocean"),
    PLAINS(Biome.PLAINS, "Plains"),
    RIVER(Biome.RIVER, "River"),
    SAVANNA(Biome.SAVANNA, "Savanna"),
    SAVANNA_MUTATED(Biome.MUTATED_SAVANNA, "SavannaMutated"),
    STONE_BEACH(Biome.STONE_BEACH, "StoneBeach"),
    SWAMP(Biome.SWAMPLAND, "Swamp"),
    TAIGA(Biome.TAIGA, "Taiga"),
    THE_END(Biome.SKY, "TheEnd"),
    VOID(Biome.VOID, "Void");

    private Biome bukkitBiome;
    private String nmsClassName;

    NMSBiome(Biome bukkitBiome, String nmsClassName){
        this.bukkitBiome = bukkitBiome;
        this.nmsClassName = "Biome" + nmsClassName;
    }

    public Biome getBukkitBiome() {
        return bukkitBiome;
    }

    public String getNmsClassName() {
        return nmsClassName;
    }

}
