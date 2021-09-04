package com.advanced.collections.arraylist;

import java.util.Objects;

public class Product {
	private String name;
	private double  price;
	private String description;
	
	public Product(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		
		if(obj== null || getClass()!=obj.getClass()) return false;
		
		Product product = (Product) obj;
		
		return Double.compare(price,product.price)==0 && Objects.equals(name,product.name) 
				&& Objects.equals(description,product.description);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,price,description);
	}
	
	@Override
	public String toString() {
		return "Product{"+
				"name='"+name+ '\''+
				",Price='"+price+ '\''+
				",description='"+description+ '\'';
	}
}