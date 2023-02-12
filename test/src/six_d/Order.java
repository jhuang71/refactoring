package six_d;

import java.util.*;
public class Order {
	private List<Item> items;

	public Order(List<Item> items) {
		this.items = items;
	}

	public double getTotal() {
		double total = 0;
		for (Item item : items) {
			total += item.getPrice();
		}
		return total;
	}
}
