package me.molhamsyr.superitems.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.entity.WitherSkull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class WitherWandListener implements Listener {

	@EventHandler
	public void onClick(PlayerInteractEvent event) {

		Player player = event.getPlayer();

		if (!(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK))
			return;

		ItemStack iteminHand = player.getInventory().getItemInMainHand();

		if (!iteminHand.hasItemMeta())
			return;

		if (iteminHand.getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.GRAY + "Wither Wand")) {

			if (iteminHand.getItemMeta().hasLore()) {

				// Safe Zone

				player.launchProjectile(WitherSkull.class);

			}

		}

	}

	@EventHandler
	public void onDestroy(EntityExplodeEvent event) {

		if (!(event.getEntity() instanceof WitherSkull))
			return;

		WitherSkull skull = (WitherSkull) event.getEntity();

		if (!(skull.getShooter() instanceof Player))
			return;

		Player player = (Player) skull.getShooter();

		ItemStack iteminHand = player.getInventory().getItemInMainHand();

		if (!iteminHand.hasItemMeta())
			return;

		if (iteminHand.getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.GRAY + "Wither Wand")) {

			if (iteminHand.getItemMeta().hasLore()) {

				// Safe Zone

				World world = skull.getWorld();
				Location loc = skull.getLocation();

				world.createExplosion(loc, 2F, false, false);

				event.setCancelled(true);

			}

		}

	}

	@EventHandler
	public void onDamage(EntityDamageEvent event) {

		if (!(event.getEntity() instanceof Player)) {
			return;
		}

		Player player = (Player) event.getEntity();

		ItemStack iteminHand = player.getInventory().getItemInMainHand();

		if (!iteminHand.hasItemMeta()) {
			return;
		}

		if (iteminHand.getItemMeta().getDisplayName()
				.equalsIgnoreCase(ChatColor.GRAY + "Wither Wand")) {

			if (iteminHand.getItemMeta().hasLore()) {

				// Safe Zone
				event.setCancelled(true);

			}

		}

	}

}
