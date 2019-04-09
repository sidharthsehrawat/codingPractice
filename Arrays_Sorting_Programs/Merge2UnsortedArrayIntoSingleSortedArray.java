package com.Arrays_Sorting_Programs;

public class Merge2UnsortedArrayIntoSingleSortedArray {

	public int[] Mergefuntion(int[] arr1, int[] arr2) {
		int finallength = arr1.length + arr2.length;
		int[] finalarray = new int[finallength];

		int j = 0;
		int p = 0;
		
		
		for (int i = 0; i < finalarray.length ; i++) {

			if(p<arr1.length && j<arr1.length) {
				
			
			
				if (arr1[p] <arr2[j]) {
					finalarray[i] = arr1[p];
					
					p++;

				} else {
					finalarray[i] = arr2[j];
					j++;
				}
			
			}
			else {
			
			if(p<arr1.length) {
				finalarray[i]=	arr1[p];
				p++;
			}
			if(j<arr2.length) {
				finalarray[i]=	arr2[j];
				j++;
			}
			}

		}

		return finalarray;

	}

	public static void main(String[] args) {
		Merge2UnsortedArrayIntoSingleSortedArray ob = new Merge2UnsortedArrayIntoSingleSortedArray();
		int arr1[] = { 2, 3, 4, 6, 9 };
		int arr2[] = { 1, 5, 7, 8, 10 };

		int[] result = ob.Mergefuntion(arr1, arr2);
		for (int k = 0; k < result.length; k++) {
			System.out.print(" " + result[k]);
		}

	}

}
