package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class Display5ArrayNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();
		System.out.println("Enter number 'a' is: ");
		int a = utility.getIntValue();
		System.out.println("Enter number 'b' is: ");
		int b = utility.getIntValue();
	
		Utility.getDisplay5ArrayNumber(a, b);
		
		System.out.println(Utility.getDisplay5ArrayNumber(a, b));

	}

}
