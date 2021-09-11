package com.beginner.datatypes.primitives;

public class PrimitiveDataTypes {
/*
 * Four Types:-
 * 	1.Whole Numbers :- 
 * 			byte :-  -128 to 127
 * 			short :-    -32768 to 32767
 * 			int :-     -2147483648 to 2147483647
 * 			long :-   -9223372036854775808 to 9223372036854775807
 * 	2.Floatiing Point Numbers :-
 * 			Float :-  6 to 7 Decimal digits
 * 			Double:-  upto 15 decimal digits
 * 	3.Boolean :-
 * 			true or false
 * 	4.Character:-
 *       single character or ASCII value.
 * */
	public static void main(String[] args) {
		
        byte numberOfSeats = 5;
        short horsePower = 392;
        int price = 14999;
        long registrationNumber = 23452352345245234L;

        float fuelConsumptionUrban = 15.5F;
        double fuelConsumptionPreciseAverage = 15.235252345;

        boolean isDamaged = true;
        char energyEfficiencyCategory = 'G';

        String carType = "Dodge Challenger SRT 392";
        String carTypeWithNewKeyword = new String("Dodge Challenger SRT 392");

        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Horsepower: " + horsePower + "hp");
        System.out.println("Price: €" + price );
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km");
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km");
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);
        System.out.println("Car model: " + carType);
        System.out.println("Car model with uppercase: " + carType.toUpperCase());
        System.out.println("Car model with lowercase: " + carType.toLowerCase());
        System.out.println("Car model with new keyword: " + carTypeWithNewKeyword);
        System.out.println("carType variable equals to carTypeWithNewKeyword: " + carTypeWithNewKeyword.equals(carType));
        
        System.out.println("Conversion / Casting:-");
        System.out.println("Widenning / UpCasting");
        //Byte to Short
        short newNumberOfSeats = numberOfSeats;
        System.out.println("New number of seats: "+newNumberOfSeats);
        
        //float to double
        double newfuelConsumptionUrban=fuelConsumptionUrban;
        System.out.println("New Urban Fuel consumption: "+newfuelConsumptionUrban);
        
        System.out.println("Narrowwing / Downcasting :");
        
        //short to byte
        //here there is a posibility of data loss
        // so choose your data types carefully.
        byte newPower= (byte) horsePower;
        System.out.println("New Horse power: "+newPower);
        
	}

}
