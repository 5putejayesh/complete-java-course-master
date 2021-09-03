package com.advanced.collections.vector;

import java.util.Vector;

/*
 * Vector is thread safe.
 */
public class VectorApp {

	public static void main(String[] args) {
		
		Vector<String> toDoVector = new Vector<String>(2,3);
		
		System.out.println("Initial capasity of the vector: "+toDoVector.capacity());
		
		toDoVector.add("Cleaning the garden");
		toDoVector.add("Painting the walls");
		toDoVector.add("Taking th Dog for a walk");
		
		System.out.println("Capasity of the vector after adding 3 elements: "+toDoVector.capacity());
		System.out.println("Siz eof the vector after adding 3 elements: "+toDoVector.size());
		
		System.out.println("The first ekement of vector is"+toDoVector.firstElement());
		System.out.println("The last element of vector is"+toDoVector.lastElement());
		
	}
}
