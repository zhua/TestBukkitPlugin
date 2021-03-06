package com.gmail.zhua2005.minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public final class TestBukkitPlugin extends JavaPlugin {

	List<Player> playerList = new ArrayList<Player>();

	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked!");

		// Save player information on reload enable
		for (Player player : Bukkit.getServer().getOnlinePlayers()) {
			playerList.add(player);
		}
		
		// Set command executor
		this.getCommand("basic").setExecutor(new TestBukkitPluginCommandExecutor(this));
	}

	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("basic")) { // If the player typed
														// /basic then do the
														// following...
			// doSomething
			return true;
		} // If this has happened the function will return true.
			// If this hasn't happened the value of false will be returned.
		else if (cmd.getName().equalsIgnoreCase("basic2")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command can only be run by a player.");
			} else {
				Player player = (Player) sender;
				// do something
			}
			return true;
		}
			
		return false;
	}

	// Event listener
	public final class MyPlayerListerner implements Listener {
		@EventHandler
		public void onLogin(PlayerLoginEvent event) {
			getLogger()
					.log(Level.INFO,
							"Player " + event.getPlayer().getName()
									+ " is logging in!");
		}

		@EventHandler(priority = EventPriority.HIGH)
		public void onHighLogin(PlayerLoginEvent event) {

		}
	}

}
