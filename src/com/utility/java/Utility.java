package com.utility.java;

import java.util.Scanner;

import com.navya.basicjavaprogram.FlipCoin;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public int getIntValue() {
		return scanner.nextInt();
	}
  //  Harming number
	
	public void getHarmonicNumber(int number) {
		double harmonicNumber = 0;
		for (double i = 1; i <= number; i++) {
			harmonicNumber = harmonicNumber + (1 / i);
		}
		System.out.println("n'th Harmonic Number of " + number + "" + harmonicNumber);
	}

//Even or Odd

	public void getEvenOdd(int number) {

		if (number % 2 == 0) {
			System.out.println("Entered Number is Even");
		} else {
			System.out.println("Entered Number is odd");
		}

	}

	// Leap Year

	public void getLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Specified year is a leap year");
		} else {
			System.out.println("Specified year is not a leap year");
		}

	}

	// Swapping Two Number

	public void getSwappingTwoNumber(int number1, int number2) {
		int temp;

		// swapping in steps
		temp = number1;
		number1 = number2;
		number2 = temp;

		// verify swapped values
		System.out.println("number1 = " + number1 + " and number2 = " + number2);

	}

	// To check given Number is Prime Number Or Not.

	public void getPrimeNumber(int number) {

	}

	public void getSumOFNumber(int num1, int num2) {
		for (int i = 0; i < 5; i++) {
			int result = num1;
		}

		// System.out.println("Addision of Two number : " + sum);

	}

	// Add two number

	public static int getDisplay5ArrayNumber(int a, int b) {

		// System.out.println("Enter number 'a' is: ");

		// System.out.println("Enter number 'b' is: ");

		return a + b;

	}
	// Add Three Number

	public static int getAddThreeNumber(int a, int b, int c) {

		return a + b + c;
	}

	// Divided two number

	public static int getDividedTwoNumber(int a, int b) {

		return a / b;

	}

	// Digit Count

	public static int getDigitCount(int digit) { // digit=4323

		int count = 0;
		while (digit > 0) { // 4323>0 ; 432 >0 ; 43 >0; 4
			digit /= 10; // 4323/10 ==>432 ; 432/10 =>43 ; 43/10 ==>4 ; 4/10==>0

			count++; // 1 ;2 ; 3 ;4
		}

		return count;
	}

	// Sum of digits

	public static int getSumOfDigits(int digit1, int digit2) { // digit1=99 ; digit2=1

		int count1 = 0;
		while (digit1 > 0) { // 99>0 ; 9>0
			digit1 /= 10; // 99/=10 => 9 9/=10==>0

			count1++; // 1 ;2
		}
		int count2 = 0;
		while (digit2 > 0) { // 1
			digit2 /= 10; // 1/=10==>0

			count2++; // 1
		}

		int sumOfDigits = count1 + count2;

		return sumOfDigits;
	}

	// Factorial number

	public static int getFactorialNumber(int number) {

		int i;
		int fact = 1;

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}

		return fact;
	}
}
