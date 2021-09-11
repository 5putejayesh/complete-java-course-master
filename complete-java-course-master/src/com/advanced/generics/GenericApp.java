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
		
		OrderedPair<Integer,String> kobeBryant=new OrderedPair<>(24,"Kobe Brayant");
		Util.displayToString(kobeBryant);
		
		ArrayList<OrderedPair<String,String>> listOfCountries = new ArrayList<>();
		OrderedPair<String,String> malta = new OrderedPair<>("MLT","Malta");
		OrderedPair<String,String> germany = new OrderedPair<>("GER","Germay");
		
		listOfCountries.add(malta);
		listOfCountries.add(germany);
		Util.displayToString(listOfCountries);
		
	}
}
