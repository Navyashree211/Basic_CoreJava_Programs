package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class FactorialNumber {
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		  System.out.println("Enter Number to check it is Factorial or not: ");
		  int Number = utility.getIntValue();
		  
		  System.out.println("Result "+Utility.getFactorialNumber(Number));
	}

}
