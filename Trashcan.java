package io.github.spaacemc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class InventoryHandler implements CommandExecutor, Listener {
		
	
	//Now for the "trashcan" command...
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String list, String[] args) {
		
		//If the player typed /trashcan then
		if (cmd.getName().equalsIgnoreCase("trashcan") && sender instanceof Player) {
			
			Player player = (Player) sender; //Checking if the sender is a player
			
			//If the player DOES NOT have  the permission
			if(!player.hasPermission("trashcan.open")) {
				player.sendMessage(ChatColor.RED + "You do not have permission!");
			}
			
			//Player opens the trashcan
			player.openInventory(globalTrashcan);
			
		}
		return false;
	}
	
	//Now what we all have been waiting for... the Inventory itself
	public static Inventory globalTrashcan = Bukkit.createInventory(null, 54, "Global Trash Can");

}
