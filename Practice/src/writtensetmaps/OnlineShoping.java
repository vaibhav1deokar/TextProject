package writtensetmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OnlineShoping {

	public static void main(String[] args) {
		// Create a sample ArrayList of items
		ArrayList<Items> itemList = new ArrayList<>();
		itemList.add(new Items(112, "ParleG", 20.00, 10));
		itemList.add(new Items(113, "GoodDay", 40.00, 30));
		itemList.add(new Items(112, "ParleG", 20.00, 5));
		itemList.add(new Items(113, "GoodDay", 40.00, 10));

		// Create a map to store item names as keys and total quantity as values
		Map<String, Integer> quentity = new HashMap<>();

		// Iterate over the item list and calculate the total quantity for each item
		for (Items item : itemList) {
			String itemName = item.getName();
			int itemQuantity = item.getQty();

			// If the item name already exists in the map, update the quantity
			if (quentity.containsKey(itemName)) {
				int existingQuantity = quentity.get(itemName);
				quentity.put(itemName, existingQuantity + itemQuantity);
			} else {
				// If the item name does not exist in the map, add it with the initial quantity
				quentity.put(itemName, itemQuantity);
			}
		}

		// Print the resulting map
		System.out.println(quentity);
	}
}