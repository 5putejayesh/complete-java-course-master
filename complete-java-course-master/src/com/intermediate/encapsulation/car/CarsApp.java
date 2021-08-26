package com.intermediate.encapsulation.car;

public class CarsApp {
	/*
	 * Inheritance:- Allows you to define a new class from an existing one and
	 * inherits it's attributes and methods. Used to avoid code duplication and
	 * maintain relationship between classes. We use inheritance to maintain
	 * IS-A relationship.
	 * 
	 */
	public static void main(String[] args) {
		DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte) 3, (short) 450, (short) 717,
				(short) 7700, 40000, 15000, true);
		redDodgeChallenger.getDescription();
		redDodgeChallenger.startTheEngine();

		System.out.println("----------------------------------------------");
		ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte) 1, (short) 225, (short) 717, (short) 3500, 40000,
				15000, false);
		blackToyotaSupra.getDescription();
		blackToyotaSupra.startTheEngine();
	}

}
