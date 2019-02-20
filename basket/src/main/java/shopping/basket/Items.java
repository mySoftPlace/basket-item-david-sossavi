package shopping.basket;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author David Kossivi Sossavi
 *
 */
public class Items {

	public static final String PAPAYAS = "Papayas";

	public static String itemArray[] = { "Apples", "Oranges", "Bananas", "Papayas" };

	private Map<String, Item> itemList = new HashMap<String, Item>();

	// Constructor to put items in the basket
	public Items() {
		itemList.put(itemArray[0], new Item(0, 25, 0));
		itemList.put(itemArray[1], new Item(0, 30, 0));
		itemList.put(itemArray[2], new Item(0, 15, 0));
		itemList.put(itemArray[3], new Item(0, 50, 0));
	}

	/**
	 * Calculate the total cost of the items in the basket
	 * 
	 * @return total cost of the items
	 */
	public float totalCostForEachItem() {
		float totalCost = 0;
		for (int i = 0; i < itemArray.length; i++) {
			if (itemList.get(itemArray[i]).getQuantity() > 0) {
				itemList.get(itemArray[i]).setTotalCost(
						itemList.get(itemArray[i]).getUnitPrice() * itemList.get(itemArray[i]).getQuantity());
				totalCost += itemList.get(itemArray[i]).getTotalCost();
			}
		}
		return totalCost;
	}

	/**
	 * Calculate the discount on the price of Papayas if the quantity exceed 2
	 * 
	 * @return the discount
	 */
	public float papayasDiscount() {
		int qtyOfPapayas = itemList.get(PAPAYAS).getQuantity();
		float papDiscount = 0;
		if (qtyOfPapayas >= 3) {
			papDiscount = (qtyOfPapayas / 3) * (itemList.get(PAPAYAS).getUnitPrice());
		}
		return -papDiscount;
	}

	public Map<String, Item> getItemList() {
		return itemList;
	}

	public void setItemList(Map<String, Item> itemList) {
		this.itemList = itemList;
	}
}
