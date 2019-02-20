package shopping.basket;

/**
 * 
 * @author David Kossivi Sossavi
 * 
 *         A class to store the unit price, quantity and total
 *
 */
public class Item {

	private int quantity;
	private float unitPrice;
	private float totalCost;

	public Item() {

	}

	public Item(int quantity, float unitPrice, float totalCost) {
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalCost = totalCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

}
