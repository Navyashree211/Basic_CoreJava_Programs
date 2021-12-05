package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class LeapYear
{
   public static void main(String[] args) 
   {
	   Utility utility = new Utility();
	    System.out.println("Enter an Year : ");
	    int year = utility.getIntValue();
	    utility.getLeapYear(year);
	   
 }
}
