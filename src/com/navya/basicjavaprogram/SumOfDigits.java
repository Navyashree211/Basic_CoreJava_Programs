package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		

		  System.out.println("Enter Digits 1st: ");
		  int digit1 = utility.getIntValue();

		  System.out.println("Enter Digits 2nd: ");
		  int digit2 = utility.getIntValue();
		  
		  System.out.println("Result "+Utility.getSumOfDigits(digit1 , digit2));

	}

}
