package six_d;

import java.util.ArrayList;
import java.util.List;


public class test {

	public static void main(String[] args) {
		Item item = new Item(1.1);
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		Order order = new Order(items);
		Customer c1 = new Customer(order);
		
		System.out.println("Customer Order Total: $" + c1.getOrder().getTotal());
	}

}
