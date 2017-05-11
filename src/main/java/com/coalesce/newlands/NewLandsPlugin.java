package com.coalesce.newlands;

import com.coalesce.plugin.CoPlugin;
import net.minecraft.server.v1_11_R1.ChunkProviderGenerate;
import org.bukkit.ChatColor;

public class NewLandsPlugin extends CoPlugin {

    @Override
    public void onPluginEnable(){

        this.displayName = ChatColor.GREEN + "New Lands";
    }

}
