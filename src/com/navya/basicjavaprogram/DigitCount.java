package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class DigitCount {
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		  System.out.println("Enter Digits: ");
		  int digit = utility.getIntValue();
		  
		  System.out.println("Result "+Utility.getDigitCount(digit));
	}

}
