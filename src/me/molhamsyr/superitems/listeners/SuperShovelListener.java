package me.molhamsyr.superitems.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SuperShovelListener implements Listener {

	BlockFace blockface = null;

	@EventHandler
	public void onStartBreaking(PlayerInteractEvent event) {

		Player player = event.getPlayer();

		if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
			if (!player.getInventory().getItemInMainHand().hasItemMeta()) {
				return;
			}

			if (player.getInventory().getItemInMainHand().getItemMeta()
					.getDisplayName()
					.equalsIgnoreCase(ChatColor.GOLD + "Super Shovel")) {

				if (player.getInventory().getItemInMainHand().getItemMeta()
						.hasLore()) {

					blockface = event.getBlockFace();

				}

			}

		}

	}

	@EventHandler
	public void onBreak(BlockBreakEvent event) {

		Block block = event.getBlock();
		Player player = event.getPlayer();

		if (!player.getInventory().getItemInMainHand().hasItemMeta()) {
			return;
		}

		if (player.getInventory().getItemInMainHand().getItemMeta()
				.getDisplayName()
				.equalsIgnoreCase(ChatColor.GOLD + "Super Shovel")) {

			if (player.getInventory().getItemInMainHand().getItemMeta()
					.hasLore()) {

				// Silk Touch
				ItemStack silkTouch = new ItemStack(Material.DIAMOND_SHOVEL);
				ItemMeta meta = silkTouch.getItemMeta();
				meta.addEnchant(Enchantment.SILK_TOUCH, 1, false);
				silkTouch.setItemMeta(meta);

				// UP OR DOWN
				if (blockface.equals(BlockFace.UP)
						|| blockface.equals(BlockFace.DOWN)) {

					Block block1 = block.getRelative(BlockFace.EAST);
					Block block2 = block.getRelative(BlockFace.WEST);
					Block block3 = block.getRelative(BlockFace.NORTH);
					Block block4 = block.getRelative(BlockFace.SOUTH);
					Block block5 = block.getRelative(BlockFace.NORTH_EAST);
					Block block6 = block.getRelative(BlockFace.NORTH_WEST);
					Block block7 = block.getRelative(BlockFace.SOUTH_EAST);
					Block block8 = block.getRelative(BlockFace.SOUTH_WEST);

					if (player.getInventory().getItemInMainHand().getItemMeta()
							.hasEnchant(Enchantment.SILK_TOUCH)) {
						block1.breakNaturally(silkTouch);
						block2.breakNaturally(silkTouch);
						block3.breakNaturally(silkTouch);
						block4.breakNaturally(silkTouch);
						block5.breakNaturally(silkTouch);
						block6.breakNaturally(silkTouch);
						block7.breakNaturally(silkTouch);
						block8.breakNaturally(silkTouch);
					}

					else if (player.getInventory().getItemInMainHand()
							.getItemMeta()
							.hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)) {
						ItemStack fortune = new ItemStack(
								Material.DIAMOND_SHOVEL);
						ItemMeta metaFortune = silkTouch.getItemMeta();
						meta.addEnchant(
								Enchantment.LOOT_BONUS_BLOCKS,
								player.getInventory()
										.getItemInMainHand()
										.getEnchantmentLevel(
												Enchantment.LOOT_BONUS_BLOCKS),
								false);
						silkTouch.setItemMeta(metaFortune);

						block1.breakNaturally(fortune);
						block2.breakNaturally(fortune);
						block3.breakNaturally(fortune);
						block4.breakNaturally(fortune);
						block5.breakNaturally(fortune);
						block6.breakNaturally(fortune);
						block7.breakNaturally(fortune);
						block8.breakNaturally(fortune);
					}

					else {

						block1.breakNaturally();
						block2.breakNaturally();
						block3.breakNaturally();
						block4.breakNaturally();
						block5.breakNaturally();
						block6.breakNaturally();
						block7.breakNaturally();
						block8.breakNaturally();

					}

				}

				if (blockface.equals(BlockFace.EAST)
						|| blockface.equals(BlockFace.WEST)) {

					Block block1 = block.getRelative(BlockFace.UP);
					Block block2 = block.getRelative(BlockFace.DOWN);
					Block block3 = block.getRelative(BlockFace.NORTH);
					Block block4 = block.getRelative(BlockFace.SOUTH);
					Block block5 = block1.getRelative(BlockFace.NORTH);
					Block block6 = block1.getRelative(BlockFace.SOUTH);
					Block block7 = block2.getRelative(BlockFace.SOUTH);
					Block block8 = block2.getRelative(BlockFace.NORTH);

					if (player.getInventory().getItemInMainHand().getItemMeta()
							.hasEnchant(Enchantment.SILK_TOUCH)) {
						block1.breakNaturally(silkTouch);
						block2.breakNaturally(silkTouch);
						block3.breakNaturally(silkTouch);
						block4.breakNaturally(silkTouch);
						block5.breakNaturally(silkTouch);
						block6.breakNaturally(silkTouch);
						block7.breakNaturally(silkTouch);
						block8.breakNaturally(silkTouch);
					}

					else if (player.getInventory().getItemInMainHand()
							.getItemMeta()
							.hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)) {
						ItemStack fortune = new ItemStack(
								Material.DIAMOND_SHOVEL);
						ItemMeta metaFortune = silkTouch.getItemMeta();
						meta.addEnchant(
								Enchantment.LOOT_BONUS_BLOCKS,
								player.getInventory()
										.getItemInMainHand()
										.getEnchantmentLevel(
												Enchantment.LOOT_BONUS_BLOCKS),
								false);
						silkTouch.setItemMeta(metaFortune);

						block1.breakNaturally(fortune);
						block2.breakNaturally(fortune);
						block3.breakNaturally(fortune);
						block4.breakNaturally(fortune);
						block5.breakNaturally(fortune);
						block6.breakNaturally(fortune);
						block7.breakNaturally(fortune);
						block8.breakNaturally(fortune);
					}

					else {

						block1.breakNaturally();
						block2.breakNaturally();
						block3.breakNaturally();
						block4.breakNaturally();
						block5.breakNaturally();
						block6.breakNaturally();
						block7.breakNaturally();
						block8.breakNaturally();

					}

				}

				if (blockface.equals(BlockFace.NORTH)
						|| blockface.equals(BlockFace.SOUTH)) {

					Block block1 = block.getRelative(BlockFace.UP);
					Block block2 = block.getRelative(BlockFace.DOWN);
					Block block3 = block.getRelative(BlockFace.EAST);
					Block block4 = block.getRelative(BlockFace.WEST);
					Block block5 = block1.getRelative(BlockFace.EAST);
					Block block6 = block1.getRelative(BlockFace.WEST);
					Block block7 = block2.getRelative(BlockFace.EAST);
					Block block8 = block2.getRelative(BlockFace.WEST);

					if (player.getInventory().getItemInMainHand().getItemMeta()
							.hasEnchant(Enchantment.SILK_TOUCH)) {
						block1.breakNaturally(silkTouch);
						block2.breakNaturally(silkTouch);
						block3.breakNaturally(silkTouch);
						block4.breakNaturally(silkTouch);
						block5.breakNaturally(silkTouch);
						block6.breakNaturally(silkTouch);
						block7.breakNaturally(silkTouch);
						block8.breakNaturally(silkTouch);
					}

					else if (player.getInventory().getItemInMainHand()
							.getItemMeta()
							.hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)) {
						ItemStack fortune = new ItemStack(
								Material.DIAMOND_SHOVEL);
						ItemMeta metaFortune = silkTouch.getItemMeta();
						meta.addEnchant(
								Enchantment.LOOT_BONUS_BLOCKS,
								player.getInventory()
										.getItemInMainHand()
										.getEnchantmentLevel(
												Enchantment.LOOT_BONUS_BLOCKS),
								false);
						silkTouch.setItemMeta(metaFortune);

						block1.breakNaturally(fortune);
						block2.breakNaturally(fortune);
						block3.breakNaturally(fortune);
						block4.breakNaturally(fortune);
						block5.breakNaturally(fortune);
						block6.breakNaturally(fortune);
						block7.breakNaturally(fortune);
						block8.breakNaturally(fortune);
					}

					else {

						block1.breakNaturally();
						block2.breakNaturally();
						block3.breakNaturally();
						block4.breakNaturally();
						block5.breakNaturally();
						block6.breakNaturally();
						block7.breakNaturally();
						block8.breakNaturally();

					}

				}

			}

		}

	}

}
