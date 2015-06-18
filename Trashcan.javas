package io.github.spaacemc;

import org.bukkit.ChatColor;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

public class Trashcan extends JavaPlugin {

	// Trashcan Permission
	public Permission openSesame = new Permission("trashcan.open");
	
	@Override
	public void onEnable() {
		
		//Sets the Executor class where the trashcan command is located
		this.getCommand("trashcan").setExecutor(new InventoryHandler());
		
		//For fun ; u ;
		getLogger().info(ChatColor.AQUA + "One man's trash is another man's treasure...");
	}
	
	@Override
	public void onDisable() {
		
	}
	

}
