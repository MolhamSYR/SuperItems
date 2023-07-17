package me.molhamsyr.superitems.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class SuperAxeListener implements Listener {

	private final BlockFace[] faces = { BlockFace.DOWN, BlockFace.UP,
			BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST,
			BlockFace.SOUTH_EAST, BlockFace.SOUTH_WEST, BlockFace.NORTH_EAST,
			BlockFace.NORTH_WEST

	};

	List<Block> wood = new ArrayList<Block>();

	@EventHandler
	public void onBreak(BlockBreakEvent event) {

		Player player = event.getPlayer();

		if (!player.getInventory().getItemInMainHand().hasItemMeta()) {
			return;
		}

		if (player.getInventory().getItemInMainHand().getItemMeta()
				.getDisplayName()
				.equalsIgnoreCase(ChatColor.GOLD + "Super Axe")) {
			if (player.getInventory().getItemInMainHand().getItemMeta()
					.hasLore()) {

				// Safe Zone

				Block block = event.getBlock();

				if (block.getType() == Material.OAK_LOG
						|| block.getType() == Material.BIRCH_LOG
						|| block.getType() == Material.ACACIA_LOG
						|| block.getType() == Material.DARK_OAK_LOG
						|| block.getType() == Material.SPRUCE_LOG) {

					for (BlockFace face : faces) {

						block = event.getBlock();

						while ((block.getRelative(face).getType() == Material.OAK_LOG
								|| block.getRelative(face).getType() == Material.BIRCH_LOG
								|| block.getRelative(face).getType() == Material.ACACIA_LOG
								|| block.getRelative(face).getType() == Material.DARK_OAK_LOG || block
								.getRelative(face).getType() == Material.SPRUCE_LOG)
								&& wood.size() <= 30) {

							wood.add(block.getRelative(face));

							block = block.getRelative(face);

						}


					}

				}

				for (int i = 0; i < wood.size(); i++) {

					wood.get(i).breakNaturally(
							new ItemStack(Material.DIAMOND_AXE));

				}

				wood.clear();

			}
		}

	}

}
