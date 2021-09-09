package com.expert.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		Map<String, String> capitals = new  HashMap<String,String>();
		
		capitals.put("England","Londan");
		capitals.put("India","New Delhi");
		capitals.put("Russia","Moscow");
		capitals.put("England","Oslo"); //Duplictes not allowed, london is overwritten by "Oslo".
		
		System.out.println("The capital of England : "+capitals.get("England"));
		capitals.remove("England", "Oslo");
		System.out.println("The capital of England : "+capitals.get("England"));
	}
}
