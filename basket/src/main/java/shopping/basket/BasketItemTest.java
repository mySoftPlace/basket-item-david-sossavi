package shopping.basket;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class BasketItemTest {
	
	Items items;
	Map<String, Item> itemList;
	public static String itemArray[] = { "Apples", "Oranges", "Bananas", "Papayas" };
	
	@Before
	public void setUp() {
		items = new Items();
		itemList = items.getItemList();
		itemList.get(itemArray[0]).setQuantity(1);
		itemList.get(itemArray[1]).setQuantity(5);
		itemList.get(itemArray[2]).setQuantity(4);
		itemList.get(itemArray[3]).setQuantity(14);
	}
	
	@Test
	public void testTotalCostForEachItem() {
		float totalCost = items.totalCostForEachItem();
		
		assertEquals("Apples", 25, itemList.get(itemArray[0]).getTotalCost(), 0.0);
		assertEquals("Oranges", 150, itemList.get(itemArray[1]).getTotalCost(), 0.0);
		assertEquals("Bananas", 60, itemList.get(itemArray[2]).getTotalCost(), 0.0);
		assertEquals("Papayas", 700, itemList.get(itemArray[3]).getTotalCost(), 0.0);
		assertEquals("Total cost without discount", 935, totalCost, 0.0);
	}
	
	@Test
	public void testPapayasDiscount() {
		assertEquals("Discount on Papayas price", -200, items.papayasDiscount(), 0.0);
	}
}
