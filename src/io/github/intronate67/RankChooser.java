package io.github.intronate67;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class RankChooser extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static RankChooser plugin;
	public int version = (int) 1.0;

	@Override
	public void onEnable(){
		getLogger().info("Rank Chooser" + version + " has been disabled!");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("Rank Chooser" + version + " has been disabled!");
	}
	
		public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args){
		Player player = (Player) sender;
		Player target = Bukkit.getPlayer(args[1]);
		if(cmd.getName().equalsIgnoreCase("chooserank")){
			if(args.length < 10){
				player.sendMessage(ChatColor.BLUE + "Available Ranks:");
				player.sendMessage(ChatColor.DARK_BLUE + "Architect");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "Student");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.YELLOW + "Apprentice");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_PURPLE + "Skillful");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Master");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.AQUA + "Legendary");
				player.sendMessage(ChatColor.GOLD + "Explorer");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_BLUE + "Architect");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "Student");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.YELLOW + "Apprentice");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_PURPLE + "Skillful");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Master");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.AQUA + "Legendary");
				player.sendMessage(ChatColor.RED + "Redstoner");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_BLUE + "Architect");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "Student");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.YELLOW + "Apprentice");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_PURPLE + "Skillful");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Master");
			}else{
				Bukkit.broadcast(sender.getName() + target.getName() , "fuckbitches.getmoney");
			}
		}
			
		
		return false;
	}

}
