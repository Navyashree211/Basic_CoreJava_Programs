package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class PrimeNumber {

	public static void main(String[] args)
	{
		Utility utility = new Utility();
	    System.out.println("Enter a number to check given number is prime or not: ");
	    int number = utility.getIntValue();
	    utility.getPrimeNumber(number);

	}

}
