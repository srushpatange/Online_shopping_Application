package com.tnsif.onlineshopping.entities;
import java.util.Arrays;
public class Customer extends User {

	private String address;
	private ShoppingCart ShoppingCart;
	private list<order> orders;
	
	public Customer(int userId, String username, String email, String address) 
	{
		super(userId, username, email);
		this.address = address;
		this.ShoppingCart = new shoppingCart();
		this.orders = new orders ArrayList<>();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ShoppingCart getShoppingCart() {
		return ShoppingCart;
	}

	public list<order> getOrders() {
		return orders;
	}

	public void addOrders(Order order) {
		orders.add(order);
	}
	
	

}
