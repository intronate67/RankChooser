package io.github.intronate67;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.MemorySection;
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
		saveConfig();
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args){
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("chooserank")){
			if(args.length < 1){
				player.sendMessage(ChatColor.BLUE + "Available Ranks:");
				player.sendMessage(getConfig().getString("rank1"));
				//Subranks
				if(getConfig().getBoolean("subrank1")){
					player.sendMessage("subrank1.subrank_1");
				}
				if(getConfig().getBoolean("subrank2")){
					player.sendMessage("subrank2.subrank_2");
				}
				if(getConfig().getBoolean("subrank3")){
					player.sendMessage("subrank3.subrank_3");
				}
				if(getConfig().getBoolean("subrank4")){
					player.sendMessage("subrank4.subrank_4");
				}
				if(getConfig().getBoolean("subrank5")){
					player.sendMessage("subrank5.subrank_5");
				}
				player.sendMessage(getConfig().getString("rank2"));
				if(getConfig().getBoolean("subrank1")){
					player.sendMessage("subrank1.subrank_1");
				}
				if(getConfig().getBoolean("subrank2")){
					player.sendMessage("subrank2.subrank_2");
				}
				if(getConfig().getBoolean("subrank3")){
					player.sendMessage("subrank3.subrank_3");
				}
				if(getConfig().getBoolean("subrank4")){
					player.sendMessage("subrank4.subrank_4");
				}
				if(getConfig().getBoolean("subrank5")){
					player.sendMessage("subrank5.subrank_5");
				}	
				player.sendMessage(getConfig().getString("rank3"));
				if(getConfig().getBoolean("subrank1")){
					player.sendMessage("subrank1.subrank_1");
				}
				if(getConfig().getBoolean("subrank2")){
					player.sendMessage("subrank2.subrank_2");
				}
				if(getConfig().getBoolean("subrank3")){
					player.sendMessage("subrank3.subrank_3");
				}
				if(getConfig().getBoolean("subrank4")){
					player.sendMessage("subrank4.subrank_4");
				}
				if(getConfig().getBoolean("subrank5")){
					player.sendMessage("subrank5.subrank_5");
				}	
				MemorySection getConfig = ((JavaPlugin) player).getConfig();
				if(getConfig.getBoolean("rank4")){
					player.sendMessage(getConfig().getString("rank_4"));
				}
				if(getConfig.getBoolean("rank5")){
					player.sendMessage(getConfig.getString("rank_5"));
					
				}
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
			if(){
				
			}else{
				player.sendMessage(ChatColor.DARK_AQUA + "Commands" + ChatColor.DARK_GRAY + " Page 1 of 4");
                player.sendMessage(ChatColor.AQUA + "/chooserank");
                player.sendMessage(ChatColor.AQUA + "/cs");
                player.sendMessage(ChatColor.AQUA + "/cshelp");
			}
		
		}
		return false;
	}

}
