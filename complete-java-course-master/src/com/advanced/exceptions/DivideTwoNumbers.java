package com.advanced.exceptions;

public class DivideTwoNumbers {

	public static void main(String[] args) {

		System.out.println(divide(30, 15));
		System.out.println(divide(15, 0));
		System.out.println("Our Job is finished.");
	}
	
	private static int divide(int dividend,int divisor){
		try{
			if(divisor==0){
				throw new ZeroDivisorException(""
						+ "The Divisor can't be zero!- Custom Exception.");
			}
			return dividend/divisor;
		}
		catch (ZeroDivisorException e) {
			e.printStackTrace();
			return 0;
		}
		catch (ArithmeticException e) {
			System.err.println("The divisor can't be zero.");
			e.printStackTrace();
			return 0;
		}
		finally {
			System.out.println("USed to close file and DB connections.");
		}
	}
}
