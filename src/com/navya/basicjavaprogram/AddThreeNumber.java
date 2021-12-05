package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class AddThreeNumber {
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		System.out.println("Enter number 'a' is: ");
		int a = utility.getIntValue();
		System.out.println("Enter number 'b' is: ");
		int b = utility.getIntValue();
		System.out.println("Enter number 'c' is: ");
        int c = utility.getIntValue();
        
        Utility.getAddThreeNumber(a, b, c);
        System.out.println(Utility.getAddThreeNumber(a, b, c));
		

	}
}
