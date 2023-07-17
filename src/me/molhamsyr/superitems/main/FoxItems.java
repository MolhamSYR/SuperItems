package me.molhamsyr.superitems.main;

import me.molhamsyr.superitems.commands.FoxItemsCommand;
import me.molhamsyr.superitems.commands.FoxItemsTab;
import me.molhamsyr.superitems.listeners.SuperAxeListener;
import me.molhamsyr.superitems.listeners.SuperBowListener;
import me.molhamsyr.superitems.listeners.SuperPickListener;
import me.molhamsyr.superitems.listeners.SuperShovelListener;
import me.molhamsyr.superitems.listeners.WitherWandListener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FoxItems extends JavaPlugin {
	
	RecipesManager recipemanager = new RecipesManager(this);
	
	
	
	@Override
	public void onEnable() {
		
		
		
		this.saveDefaultConfig();
			
		this.getCommand("superitems").setExecutor(new FoxItemsCommand());
		this.getCommand("superitems").setTabCompleter(new FoxItemsTab());
		
		
		
		this.getServer().getPluginManager().registerEvents(new SuperBowListener(), this);
		this.getServer().getPluginManager().registerEvents(new SuperPickListener(), this);
		this.getServer().getPluginManager().registerEvents(new SuperAxeListener(), this);
		this.getServer().getPluginManager().registerEvents(new SuperShovelListener(), this);
		this.getServer().getPluginManager().registerEvents(new WitherWandListener(), this);
		
		if(this.getConfig().getBoolean("recipes-enabled")) {
			
			Bukkit.addRecipe(recipemanager.getSpearRecipe());
			Bukkit.addRecipe(recipemanager.getSuperPickaxeRecipe());
			Bukkit.addRecipe(recipemanager.getSuperAxeRecipe());
			Bukkit.addRecipe(recipemanager.getSuperBowRecipe());
			Bukkit.addRecipe(recipemanager.getSuperShovelRecipe());
			Bukkit.addRecipe(recipemanager.getWitherWandRecipe());
			
		}
		
		this.getServer().getConsoleSender().sendMessage("[SuperItems] is Enabled!, Beep Boop Beep!");
		
	}
	
	@Override
	public void onDisable() {
		
		
		
		
	}

}
