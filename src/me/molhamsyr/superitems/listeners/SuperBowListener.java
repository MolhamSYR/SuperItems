package me.molhamsyr.superitems.listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SuperBowListener implements Listener {

	@EventHandler
	public void onLeftClick(PlayerInteractEvent event) {

		Player player = event.getPlayer();

		if ((event.getAction() == Action.LEFT_CLICK_AIR)
				|| (event.getAction() == Action.LEFT_CLICK_BLOCK)
				|| (event.getAction() == Action.PHYSICAL)) {

			if (player.getInventory().getItemInMainHand().hasItemMeta()) {

				if (player.getInventory().getItemInMainHand().getItemMeta()
						.getDisplayName().equals(ChatColor.GOLD + "Super Bow")) {

					if (player.getInventory().getItemInMainHand().getItemMeta()
							.hasLore()) {

						// Safe Zone (Using Fox Super Bow)

						if ((player.getGameMode() == GameMode.CREATIVE)) {
							player.launchProjectile(Arrow.class);
						}

						else if (hasArrows(player)) {

							player.launchProjectile(Arrow.class);

							Inventory inv = player.getInventory();

							for (ItemStack item : inv.getContents()) {

								if (!(item.getType() == Material.ARROW)) {
									continue;
								}

								if (item.getAmount() == 1) {
									inv.remove(item);
								}

								else if (item.getType() == Material.ARROW) {
									item.setAmount(item.getAmount() - 1);
								}

							}

						}

					}

				}

			}

		}

	}

	public boolean hasArrows(Player player) {

		if (player.getInventory().contains(Material.ARROW)) {
			return true;
		}

		return false;
	}

}
