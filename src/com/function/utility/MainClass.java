package com.function.utility;

public class MainClass {

	// Step1 to make one-D array
	public static int[] getArray() {
		System.out.println("Enter array size");
		int n = InputUtility.getInt(); // for size of array to user

		int[] ar = new int[n]; // one-D array

		// 2. initialize array
		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			ar[i] = InputUtility.getInt(); // ar
		}
		return ar;
	}

	public static void dispArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar" + "[" + i + "]" + "= " + ar[i]);
		}
	}

	// To make Two-D array
	public static int[][] getArrays() {
		System.out.println("Enter row");
		int n = InputUtility.getInt(); // take size of array to user

		System.out.println("Enter column");
		int m = InputUtility.getInt();
		int[][] ar = new int[n][m]; // Two-D array

		System.out.println("Enter " + n * m + " elements of array");
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar.length; j++) {
				ar[i][j] = InputUtility.getInt();
			}
		}
		return ar;
	}

	public static void dispArrays(int[][] ar) {
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.println("ar"+"["+i+"]"+"["+j+"]"+"= "+ar[i][j]);
			}
		}
	}	
	
	// Three-D array 
	public static int[][][] getThreeArray()
	{
		// take input to user 
		System.out.println("Enter First Array element : r1");
		int r1 =InputUtility.getInt();
		
		System.out.println("Enter First Array element : r2");
		int r2 =InputUtility.getInt();
		
		System.out.println("Enter First Array element : r3");
		int r3 =InputUtility.getInt();
		
		// make array
		int[][][] ar = new int[r1][r2][r3];
		
		// initialize array 
		
		//System.out.println("Enter "+r1*r2*r3+ " element of array");
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++)
			{
				for (int k = 0; k < ar.length; k++)
				{
					ar[i][j][k] = InputUtility.getInt();
				}
			}
		
		return ar;
	}	
		public static void displayArray(int[][][] ar) {
			
			for (int i = 0; i < ar.length; i++) {
				for (int j = 0; j < ar.length; j++) {
					for (int k = 0; k < ar.length; k++) {
						
						ar[i][j][k] = InputUtility.getInt();
						System.out.println("ar"+"["+i+"]"+"["+j+"]"+"["+k+"]"+"= "+ar[i][j][k]);
					}
				}
			}
		}
  }
          public static void SumOfTwo() {
        	  System.out.println("Enter Sum of Three Program");
        	  int n = InputUtility.getInt();
        	  
        	  int a[] = new int[n]
          }
}

