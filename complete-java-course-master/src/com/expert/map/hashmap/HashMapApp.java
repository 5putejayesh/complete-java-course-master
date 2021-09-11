package com.expert.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> capitals = new  HashMap<String,String>();
		
		capitals.put("England","Londan");
		capitals.put("India","New Delhi");
		capitals.put("Russia","Moscow");
		capitals.put("England","Oslo"); //Duplictes not allowed, london is overwritten by "Oslo" here.
		
		System.out.println("The capital of England : "+capitals.get("England"));
		capitals.remove("England", "Oslo");
		System.out.println("The capital of England : "+capitals.get("England"));
		
		if(capitals.containsValue("Moscow")){
			System.out.println("Russia is in the list.");
		}
		
		capitals.put(null, "The city is not in the List");
		String userInput="Denmark";
		if(capitals.containsKey(userInput)){
			System.out.println(capitals.get(userInput));
		}
		else{
			System.out.println(capitals.get(null));
		}
		
		System.out.println(capitals.getOrDefault(userInput,"The city is not in the List"));
		
		capitals.replace("India", "New Delhi","Mumbai");
		System.out.println("The replcaed capital of India is: "+capitals.get("India"));
		
		/*if(!capitals.containsKey(userInput)){
			capitals.put(userInput, "Copenhagen");
		}*/
		
		capitals.putIfAbsent(userInput, "Copenhagen");

		System.out.println("Following countries can be found in the list: ");
		capitals.remove(null);
		for(String ctr:capitals.keySet()){
			System.out.println("-"+ctr);
		}
		
		
	}
	}
