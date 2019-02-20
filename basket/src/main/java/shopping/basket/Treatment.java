package shopping.basket;

import java.util.Scanner;

/**
 * 
 * @author David Kossivi Sossavi
 *
 */
public class Treatment {

	public static final String CURRENCY = "CHF  ";

	public static void main(String[] args) {

		float totalCost = 0;
		float papayasDiscount = 0;
		int itemQty = 0;
		Scanner sc;
		String userEntry;
		String[] itemsQuantity;
		Item item;
		Items items = new Items();

		System.out.println(
				"Type the quantity of some or all items in this order: " + Items.itemArray[0] + "," + Items.itemArray[1]
						+ "," + Items.itemArray[2] + "," + Items.itemArray[3] + " separetad by comma. Example: 1,2,3");

		sc = new Scanner(System.in);
		userEntry = sc.nextLine();
		sc.close();

		itemsQuantity = userEntry.split(",");

		// Save each item quantity
		for (int i = 0; i < itemsQuantity.length; i++) {
			items.getItemList().get(Items.itemArray[i]).setQuantity(Integer.parseInt(itemsQuantity[i]));
		}

		totalCost = items.totalCostForEachItem();
		papayasDiscount = items.papayasDiscount();

		// Display a receipt
		for (int i = 0; i < itemsQuantity.length; i++) {
			System.out.print(Items.itemArray[i]); // Display item name

			item = items.getItemList().get(Items.itemArray[i]);
			itemQty = item.getQuantity();
			if (itemQty > 1) {
				System.out.print("          X" + itemQty);
			} else {
				System.out.print("            ");
			}
			System.out.println("            " + CURRENCY + item.getTotalCost());
		}
		if (papayasDiscount < 0) {
			System.out.println(" Discount                      " + CURRENCY + papayasDiscount);
		}
		System.out.println("------------------------------------");
		System.out.println("Total:                          " + CURRENCY + (totalCost + papayasDiscount));
	}
}
