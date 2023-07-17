package me.molhamsyr.superitems.main;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class RecipesManager {
	
	FoxItems main;
	
	public RecipesManager(FoxItems main) {
		this.main = main;
	}
	
	public ShapedRecipe getSpearRecipe() {
		
		NamespacedKey key = new NamespacedKey(main, "spear_of_shu");
		ShapedRecipe recipe = new ShapedRecipe(key, ItemManager.getSpear());
		
		recipe.shape(" NN"," DN","D  ");
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('D', Material.DIAMOND_BLOCK);
		
		return recipe;
	}
	
	public ShapedRecipe getSuperPickaxeRecipe() {
		
		NamespacedKey key = new NamespacedKey(main, "super_pickaxe");
		ShapedRecipe recipe = new ShapedRecipe(key, ItemManager.getSuperPick());
		
		recipe.shape("NNN"," D "," D ");
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('D', Material.DIAMOND_BLOCK);
		
		return recipe;
	}
	
	public ShapedRecipe getSuperAxeRecipe() {
		
		NamespacedKey key = new NamespacedKey(main, "super_axe");
		ShapedRecipe recipe = new ShapedRecipe(key, ItemManager.getSuperAxe());
		
		recipe.shape(" NN"," DN"," D ");
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('D', Material.DIAMOND_BLOCK);
		
		return recipe;
	}
	
	public ShapedRecipe getSuperBowRecipe() {
		
		NamespacedKey key = new NamespacedKey(main, "super_bow");
		ShapedRecipe recipe = new ShapedRecipe(key, ItemManager.getSuperBow());
		
		recipe.shape(" ND","N D"," ND");
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('D', Material.DIAMOND_BLOCK);
		
		return recipe;
	}
	
	public ShapedRecipe getSuperShovelRecipe() {
		
		NamespacedKey key = new NamespacedKey(main, "super_shovel");
		ShapedRecipe recipe = new ShapedRecipe(key, ItemManager.getSuperShovel());
		
		recipe.shape(" N "," D "," D ");
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('D', Material.DIAMOND_BLOCK);
		
		return recipe;
	}
	
	public ShapedRecipe getWitherWandRecipe() {
		
		NamespacedKey key = new NamespacedKey(main, "super_wither_wand");
		ShapedRecipe recipe = new ShapedRecipe(key, ItemManager.getWitherWand());
		
		recipe.shape("NDN"," D "," D ");
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('D', Material.DIAMOND_BLOCK);
		
		return recipe;
	}
	
	
	
	

}
