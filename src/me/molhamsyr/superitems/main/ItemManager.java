package me.molhamsyr.superitems.main;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.attribute.AttributeModifier.Operation;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {

	@SuppressWarnings("deprecation")
	public static ItemStack getSpear() {
		
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		AttributeModifier attackModifier = new AttributeModifier(UUID.randomUUID(), "generic.attackdamage", 10, Operation.ADD_NUMBER, EquipmentSlot.HAND);
		
		meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attackModifier);
		
		meta.setDisplayName(ChatColor.GOLD + "Spear of Shu");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "A spear made in a mighty castle, rumors say it belongs to the king of sparta");
		
		meta.setLore(lore);
		
		
		
		meta.setCustomModelData(7771);
		item.setDurability((short) 10000);
		
		item.setItemMeta(meta);
		
		return item;
		
	}
	
	
	@SuppressWarnings("deprecation")
	public static ItemStack getSuperBow() {
		
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "Super Bow");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "A bow constructed by the king's craftsmen, rumors say it belongs to the queen of sparta");
		
		meta.setLore(lore);
		
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		
		meta.setCustomModelData(7772);
		
		item.setDurability((short) 10000);
		
		item.setItemMeta(meta);
		
		
		return item;
	}
	
	@SuppressWarnings("deprecation")
	public static ItemStack getSuperPick() {
		
		ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "Super Pickaxe");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "A precious pickaxe made for the king's most favorite miners");
		
		meta.setLore(lore);
		
		meta.setCustomModelData(7773);
		
		item.setDurability((short) 10000);
		
		item.setItemMeta(meta);
		
		return item;
		
	}
	
	@SuppressWarnings("deprecation")
	public static ItemStack getSuperAxe() {
		
		ItemStack item = new ItemStack(Material.NETHERITE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "Super Axe");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "A precious axe made for the king's most favorite lumberjacks");
		
		meta.setLore(lore);
		
		meta.setCustomModelData(7774);
		
		item.setDurability((short) 10000);
		
		item.setItemMeta(meta);
		
		return item;
		
	}
	
	@SuppressWarnings("deprecation")
	public static ItemStack getSuperShovel() {
		
		ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "Super Shovel");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "A precious shovel made for the king's most favorite landscapers");
		
		meta.setLore(lore);
		
		meta.setCustomModelData(7775);
		
		item.setDurability((short) 10000);
		
		item.setItemMeta(meta);
		
		return item;
		
	}
	
	public static ItemStack getWitherWand() {
		
		ItemStack item = new ItemStack(Material.NETHERITE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GRAY + "Wither Wand");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "A wand made for the wither king");
		
		meta.setLore(lore);
		
		meta.setCustomModelData(7776);
		
		
		item.setItemMeta(meta);
		
		return item;
		
	}
	

	// Give Player Items Method
	
	public static void givePlayerItem(Player player, ItemStack item) {
		
		if(player.getInventory().firstEmpty() == -1) {
			World world = player.getWorld();
			Location loc = player.getLocation();
			
			world.dropItemNaturally(loc, item);
			return;
		}
		
		player.getInventory().addItem(item);
		
	}
	
	
}
