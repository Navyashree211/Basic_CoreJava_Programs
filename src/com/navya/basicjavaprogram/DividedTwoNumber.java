package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class DividedTwoNumber
{
  public static void main(String[] args) {
	 
	  Utility utility = new Utility();
	  
	  System.out.println("Enter 1st Number: ");
	  int a = utility.getIntValue();
	  System.out.println("Enter 2nd Number: ");
	  int b = utility.getIntValue();
	  
	  Utility.getDividedTwoNumber(a , b);
	  System.out.println("Result "+Utility.getDividedTwoNumber(a , b));
	  
}
}
