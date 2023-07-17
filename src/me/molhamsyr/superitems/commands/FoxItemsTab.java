package me.molhamsyr.superitems.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class FoxItemsTab implements TabCompleter {

	List<String> argumentsOne = new ArrayList<String>();
	List<String> items = new ArrayList<String>();

	public List<String> onTabComplete(CommandSender sender, Command cmd,
			String label, String[] args) {

		if (argumentsOne.isEmpty()) {
			argumentsOne.add("give");
		}

		if (items.isEmpty()) {
			items.add("spearofwynn");
			items.add("superbow");
			items.add("superpickaxe");
			items.add("superaxe");
			items.add("supershovel");
			items.add("witherwand");
		}

		List<String> results = new ArrayList<String>();

		if (args.length == 1) {

			for (String a : argumentsOne) {
				if (a.toLowerCase().startsWith(args[0].toLowerCase())) {
					results.add(a);
				}
			}

			return results;

		}

		else if (args.length == 2) {

			if (args[0].equalsIgnoreCase("give")) {

				for (String a : items) {
					if (a.toLowerCase().startsWith(args[1].toLowerCase())) {
						results.add(a);
					}
				}

				return results;

			}

		}

		return null;
	}

}
