package six_c;
import java.util.*;

public class test {

	public static void main(String[] args) {
		Customer c1 = new Customer("Jay", "4xxx S xxx Ave");
		Item item = new Item(1.1);
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		Order order = new Order(c1, items);
		
		System.out.println("Customer Name: " + order.getCustomer().getName());
		System.out.println("Customer Order Total: $" + order.getTotal());
	}

}
