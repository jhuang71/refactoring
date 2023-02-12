package six_c;

import java.util.*;
public class Order {
	private Customer customer;
	private List<Item> items;

	public Order(Customer customer, List<Item> items) {
		this.customer = customer;
		this.items = items;
	}

	public double getTotal() {
		double total = 0;
		for (Item item : this.getItems()) {
			total += item.getPrice();
		}
		return total;
	}

	public Customer getCustomer() {
		return this.customer;
	}
	
	public List<Item> getItems() {
		return this.items;
	}

	// remove codes below
	// 
//	public String getCustomerName() {
//		return customer.getName();
//	}

//	public String getCustomerAddress() {
//		return customer.getAddress();
//	}
}
