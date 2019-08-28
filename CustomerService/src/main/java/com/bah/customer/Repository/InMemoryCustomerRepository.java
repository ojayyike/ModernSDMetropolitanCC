package com.bah.customer.Repository;
import java.util.*;
public class InMemoryCustomerRepository {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public ArrayList<Customer> getAllCustomers() {
		setCustomers();
		return customers;
	}
	
	public void setCustomers() {
		customers.add(new Customer("frank","f@yahoo.com", "pass1"));
		customers.add(new Customer("frankie","fee@yahoo.com", "pass12"));
		customers.add(new Customer("frankfortt","f12@yahoo.com", "pass13"));
	}
	
	public Customer getCustomer(String name) {
		Customer temp = null;
		for(Customer cus: customers) {
			temp = (cus.getName().equalsIgnoreCase(name)) ? cus : null;
		}
		return temp;
	}
}
