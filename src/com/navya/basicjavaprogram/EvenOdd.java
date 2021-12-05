package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class EvenOdd
{
  public static void main(String[] args) 
  {
	  Utility utility = new Utility();
	    System.out.println("Enter the number to check even or odd: ");
	    int number = utility.getIntValue();
	    utility.getEvenOdd(number);
  }
}
