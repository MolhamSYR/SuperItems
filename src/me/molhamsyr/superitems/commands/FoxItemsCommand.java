package me.molhamsyr.superitems.commands;

import me.molhamsyr.superitems.main.ItemManager;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FoxItemsCommand implements CommandExecutor {

	private final String HELP_MESSAGE = ChatColor.GRAY + ""
			+ "Sorry, You have to add an argument to this command!\n"
			+ "Possible Arguments:\n" + "1. give <item>";

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		if (label.equalsIgnoreCase("superitems")) {

			if (args.length == 0) {
				sender.sendMessage(HELP_MESSAGE);
			}

			// Give Command Under Here
			if (args[0].equalsIgnoreCase("give")) {

				// Kicks Out Console from Give Command
				if (!(sender instanceof Player)) {
					sender.sendMessage("Can't Give Console an Item!");
					return true;
				}

				Player player = (Player) sender;

				// Checks if the player has OP

				if (!(player.isOp())) {
					player.sendMessage(ChatColor.RED
							+ "You don't have access to execute this command!");
					return true;
				}

				if (args[1].equalsIgnoreCase("spearofwynn")) {
					ItemManager.givePlayerItem(player, ItemManager.getSpear());
				}

				else if (args[1].equalsIgnoreCase("superbow")) {
					ItemManager.givePlayerItem(player,
							ItemManager.getSuperBow());
				}

				else if (args[1].equalsIgnoreCase("superpickaxe")) {
					ItemManager.givePlayerItem(player,
							ItemManager.getSuperPick());
				}

				else if (args[1].equalsIgnoreCase("superaxe")) {
					ItemManager.givePlayerItem(player,
							ItemManager.getSuperAxe());
				}

				else if (args[1].equalsIgnoreCase("supershovel")) {
					ItemManager.givePlayerItem(player,
							ItemManager.getSuperShovel());
				}

				else if (args[1].equalsIgnoreCase("witherwand")) {
					ItemManager.givePlayerItem(player,
							ItemManager.getWitherWand());
				}

			}

		}

		return false;
	}

}
