package com.advanced.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ToDoListApp {
	public static void main(String[] args) {
		
		ArrayList<String> urgentTasks = new ArrayList<String>();
		ArrayList<String> allTasks = new ArrayList<String>();
		
		urgentTasks.add("Repairing the cars");
		urgentTasks.add("Paying the cheques");
		
		allTasks.add("Cleaning");
		allTasks.add("Moving the Lawn");
		allTasks.add("Going to grocessory store");
		
		System.out.println("Urgent Tasks:");
		urgentTasks.forEach((u)->System.out.println("-"+ u));
		
		System.out.println();
		System.out.println("Swapping urgebt task elements:");
		Collections.swap(urgentTasks, 0, 1);
		//urgentTasks.clear();
		if(!urgentTasks.isEmpty()){
			urgentTasks.forEach((u)->System.out.println("-"+ u));
		}	
		
		allTasks.addAll(urgentTasks);
		System.out.println();
		System.out.println("All Tasks");
		allTasks.forEach((a)->System.out.println("-"+a));
		
		System.out.println();
		System.out.println("Sorted Tasks in ascending order");
		Collections.sort(allTasks);
		allTasks.forEach((t)->System.out.println("-"+t));
		
		System.out.println();
		System.out.println("Sorted Tasks in reverse order");
		Collections.sort(allTasks,Collections.reverseOrder());
		allTasks.forEach((t)->System.out.println("-"+t));
		
		System.out.println("---------------------------------");
		
		if(allTasks.contains("Cleaning")){
			System.out.println("I haven't cleaned");
		}
		
		System.out.println("---------------------------------");
		System.out.println("First 3 important tasks :");
		for(String task : allTasks.subList(0,3)){
			System.out.println("- "+task);
		}
		
		Collections.shuffle(allTasks);
		System.out.println("---------------------------------");
		System.out.println("Shuffle tasks :");
		for(String task : allTasks){
			System.out.println("- "+task);
		}
	}
}
