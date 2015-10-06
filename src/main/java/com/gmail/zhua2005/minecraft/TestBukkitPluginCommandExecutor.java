package com.gmail.zhua2005.minecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TestBukkitPluginCommandExecutor implements CommandExecutor {
    	private final TestBukkitPlugin plugin;
     
    	public TestBukkitPluginCommandExecutor(TestBukkitPlugin plugin) {
    		this.plugin = plugin; // Store the plugin in situations where you need it.
    	}
     
    	@Override
    	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    		// implementation exactly as before...
    		
    		return false;
    	}
    }