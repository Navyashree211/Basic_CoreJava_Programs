package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class SwappingTwoNumber
{
  public static void main(String[] args)
  {
	  Utility utility = new Utility();
	    System.out.println("Enter the First Number: ");
	    int number1 = utility.getIntValue();
	    System.out.println("Enter the Second Number: ");
		    int number2 = utility.getIntValue();
	    utility.getSwappingTwoNumber(number1 , number2);
	    
  }
}
