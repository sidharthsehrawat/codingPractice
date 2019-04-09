package com.Arrays_Sorting_Programs;

public class SelectionSort {

	public int[] SortMethod(int a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < a.length ; j++) {

				if (a[min] > a[j]) {
					min = j;
				}
					
				

			}
			/*
			 * int temp = a[min]; a[min] = a[i]; a[i] = temp;
			 */
			 swap(a, min, i); 

		}
		return a;

	}

	
	  public void swap(int[] a, int min, int i) {
		  int temp = a[min]; 
		  a[min] = a[i];
	  a[i] = temp;
	  
	  }
	 

	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort();
		int[] a = { 11, 2, 5, 1, 3, 9,4,7 };
		int[] sortedarray = ob.SortMethod(a);

		for (int k = 0; k < sortedarray.length; k++) {
			System.out.print("  " + sortedarray[k]);
		}

	}

}
