package com.beginner.datatypes.object.references;
/*
 *Types:-
 *	1.Byte
 *	2.Short
 *	3.Integer
 *	4.Long
 *	5.Float
 *	6.Double
 *	7.Boolean
 *	8.Character
 *	9.String
 *
 * These classes provides extra functionality like String provide some usefull functions like
 * toUppercase(),isEmpty() etc.
 */

public class ObjectReferenceTypes {

public static void main(String[] args) {
	
	Byte numberOfSeats=5;
	Short horsePoer=392;
	Integer price=14999;
	Long registrationNumber=2424242145456321L;
	
	Float fuelConsumptionCombined=15.5F;
	Double fuelConsumptionPrecise=15.23564874589789748977;
	
	Boolean isDamaged=true;
	Character energyEfficiencyCategory='G';
	
	String carModel="DodgeChallenger SRT 392";
	String carModelNew =new String("DodgeChallenger SRT 392");
	
	System.out.println("Numbner Of Seats: "+numberOfSeats);
	System.out.println("Horse Power: "+horsePoer);
	System.out.println("Price: "+price);
	System.out.println("Registration Number: "+registrationNumber);
	System.out.println("Combined fuel Consumption : "+fuelConsumptionCombined);
	System.out.println("Combined fuel Precise : "+fuelConsumptionPrecise);
	System.out.println("This car is damaged: "+isDamaged);
	System.out.println("Energy Efficiency Category : "+energyEfficiencyCategory);
	System.out.println("The car model: "+carModel);
	System.out.println("The car model with new keyword: "+carModelNew);
	
	System.out.println("Advantages of Wrapper classes");
	System.out.println("Price: "+price.floatValue());
	System.out.println("Combined fuel Precise : "+fuelConsumptionPrecise.intValue());
	System.out.println("The car model in lower case: "+carModel.toLowerCase());
	System.out.println("The car model in upper case: "+carModel.toUpperCase());
	System.out.println("The car model and car model with new keyword are equal: "+carModel.equals(carModelNew));
}
}
