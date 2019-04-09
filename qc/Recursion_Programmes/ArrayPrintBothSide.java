package com.qc.Recursion_Programmes;

public class ArrayPrintBothSide {

	public void printArray(int[] a, int i) {
		/*
		 * if (i >= 0) {
		 * 
		 * // Revrse order printing by tail recursion System.out.println(a[i]);
		 * printArray(a, i - 1);
		 * 
		 * }
		 */
	
		if (i >= 0) {

			// starting order by head recursion
			printArray(a, i - 1);
			System.out.println(a[i]);

		}
	}

	public static void main(String[] args) {
		ArrayPrintBothSide ob = new ArrayPrintBothSide();
		int[] arr = { 1, 2, 3, 4, 5 };
		ob.printArray(arr, arr.length - 1);
	}

}
