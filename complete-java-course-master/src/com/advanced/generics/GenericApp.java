package com.advanced.generics;

import java.util.ArrayList;

public class GenericApp {

	public static void main(String[] args) {
		
		Box<Integer> myFavouriteNumber = new Box<>();
		myFavouriteNumber.setTypeData(10);
		Util.displayToString(myFavouriteNumber);
		
		Box<String> myFavouriteActor = new Box<>();
		myFavouriteActor.setTypeData("Russel Crow");
		Util.displayToString(myFavouriteActor);
		
		ArrayList<Box<String>> pileOfBoxes =new ArrayList<>();
		
		pileOfBoxes.add(myFavouriteActor);
		pileOfBoxes.add(myFavouriteActor);
		Util.displayToString(pileOfBoxes);
	}
}