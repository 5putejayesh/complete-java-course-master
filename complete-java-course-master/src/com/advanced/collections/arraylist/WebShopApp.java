package com.advanced.collections.arraylist;

import java.util.ArrayList;

public class WebShopApp {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product("Fidget Spinner",3.99,"It's Fun"));
		products.add(new Product("Earbud",39.99,"Extremly clear sound & water proof"));
		products.add(new Product("Earbud",39.99,"Extremly clear sound & water proof"));
		
		products.add(0, new Product("36 AAA Bateries",10.99,"High performance alkaline batteries"));
		//System.out.println(products);
		
		//products.remove(2);
		//products.remove(new Product("Earbud",39.99,"Extremly clear sound & water proof"));
		
		products.set(2, new Product("Boat Earbud",49.99,"Extremly clear sound & water proof"));
		
		for(Product product:products){
			System.out.println(product);
		}
		
		System.out.println("The third element in the list");
		System.out.println(products.get(2));
		System.out.println(products.size()+" elements can be found in the list");
	}

}
