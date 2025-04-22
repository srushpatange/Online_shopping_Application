package com.tnsif.onlineshopping.entities;

import java.util.HashMap;

public class ShoppingCart {
	
	private Map<Product,Integer> items;
	
	public void Shoppingcart() {
		this.items = new HashMap<>();
		
	}

	public Map<Product, Integer> getItems() {
		return items;
	}

	public void addItems(Product product, int items) {
		items.put(product,quantity);
	}
	public void removeItems(Product product) {
		items.remove(product);
		
	}

	@Override
	public String toString() {
		return "ShoppingCart [items= " + items+ "]";
	}
	

}
