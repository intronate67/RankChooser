package io.github.intronate67;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class RankChooser extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static RankChooser plugin;
	public int version = (int) 1.1;
	public String author = "intronate67";

	@Override
	public void onEnable(){
		//Creating Config.yml
		if(!new File(this.getDataFolder(), "config.yml").exists()){
			this.saveDefaultConfig();
		}
		//Displays server on/off
		getLogger().info("Rank Chooser" + version + " has been enabled!");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("Rank Chooser" + version + " has been disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args){
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("chooserank")){
			if(args.length < 1){
				player.sendMessage(ChatColor.BLUE + "Available Ranks:");
				player.sendMessage(getConfig().getString("rank1"));
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "Student");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.YELLOW + "Apprentice");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_PURPLE + "Skillful");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Master");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.AQUA + "Legendary");
				player.sendMessage(getConfig().getString("rank2"));
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_BLUE + "Architect");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "Student");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.YELLOW + "Apprentice");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_PURPLE + "Skillful");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Master");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.AQUA + "Legendary");
				player.sendMessage(getConfig().getString("rank3"));
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_BLUE + "Architect");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "Student");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.YELLOW + "Apprentice");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_PURPLE + "Skillful");
				player.sendMessage(ChatColor.DARK_GRAY + "- " + ChatColor.GREEN + "Master");
			}else{
				player.sendMessage(ChatColor.BLUE + "[ChooseRank] " + ChatColor.AQUA + "You have chosen the rank: " + ChatColor.ITALIC + args[0] + ChatColor.AQUA + ", Now wait for a staff member to rank you.");
				Bukkit.broadcast(ChatColor.BLUE + "[ChooseRank] " + ChatColor.AQUA + "Player: " + ChatColor.ITALIC + player.getDisplayName() + ChatColor.AQUA + " Would like to choose the Rank: " + ChatColor.ITALIC + args[0],"fuckbitches.getmoney");
			}
		}
		if(cmd.getName().equalsIgnoreCase("cr")){
			player.sendMessage(ChatColor.BLUE + "Choose Rank");
			player.sendMessage(ChatColor.BLUE + "Version: " + version);
			player.sendMessage(ChatColor.BLUE + "Made By: " + author);
			player.sendMessage(ChatColor.BLUE + "For Help goto: ");
			player.sendMessage(ChatColor.BLUE + "https://github.com/intronate67/RankChooser or use /cshelp");
		}
		if(cmd.getName().equalsIgnoreCase("crhelp")){
			player.sendMessage(ChatColor.DARK_AQUA + "Commands" + ChatColor.DARK_GRAY + " Page 1 of 4");
			player.sendMessage(ChatColor.AQUA + "/chooserank");
			player.sendMessage(ChatColor.AQUA + "/cs");
			player.sendMessage(ChatColor.AQUA + "/cshelp");
		}
		if(cmd.getName().equalsIgnoreCase("crhelp 2")){
			player.sendMessage(ChatColor.DARK_AQUA + "/ChooseRank" + ChatColor.DARK_GRAY + " Page 2 of 4");
			player.sendMessage(ChatColor.AQUA + "Usage: /chooserank <rank>");
			player.sendMessage(ChatColor.AQUA + "Functionality: Sends message ");
			player.sendMessage(ChatColor.AQUA + "to you and staff with your rank request.");
		}
		if(cmd.getName().equalsIgnoreCase("crhelp 3")){
			player.sendMessage(ChatColor.DARK_AQUA + "/cr" + ChatColor.DARK_GRAY + " Page 3 of 4");
			player.sendMessage(ChatColor.AQUA + "Usage: /cr");
			player.sendMessage(ChatColor.AQUA + "Functionality: Displays all of the  ");
			player.sendMessage(ChatColor.AQUA + "plugin info inlcuding Version and Author.");
		}
		if(cmd.getName().equalsIgnoreCase("crhelp 4")){
			player.sendMessage(ChatColor.DARK_AQUA + "/CrHelp" + ChatColor.DARK_GRAY + " Page 4 of 4");
			player.sendMessage(ChatColor.AQUA + "Usage: /crshelp");
			player.sendMessage(ChatColor.AQUA + "Functionality: Displays all of the commands ");
			player.sendMessage(ChatColor.AQUA + "and four pages about them.");
		}
			
		
		return false;
	}

}
