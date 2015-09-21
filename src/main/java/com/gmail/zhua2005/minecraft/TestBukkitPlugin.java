package com.gmail.zhua2005.minecraft;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class TestBukkitPlugin extends JavaPlugin {
	
	List<Player> playerList = new ArrayList<Player>();
	
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");
		
		// Save player information on reload enable
		for (Player player: Bukkit.getServer().getOnlinePlayers()) {
			playerList.add(player);
		}
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDosable has been invoked!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("basic")) { // If the player typed /basic then do the following...
			// doSomething
			return true;
		} //If this has happened the function will return true. 
	        // If this hasn't happened the value of false will be returned.
		return false; 
	}

}
