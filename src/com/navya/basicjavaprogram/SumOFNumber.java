package com.navya.basicjavaprogram;

import com.utility.java.Utility;

public class SumOFNumber
{
	public static void main(String[] args) 
	{
		 Utility utility = new Utility();
		    System.out.println("Enter the First Five Number: ");
		    int num1 = utility.getIntValue();
		    System.out.println("Enter the Second Five Number: ");
			    int num2 = utility.getIntValue();
		    utility.getSumOFNumber(num1 , num2);
	}
}
