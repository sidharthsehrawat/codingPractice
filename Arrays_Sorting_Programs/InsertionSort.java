package com.Arrays_Sorting_Programs;

public class InsertionSort {
	public int[] SortMethod(int a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			int j = i + 1;
			int value = a[i + 1];

			while (j > 0 && a[j - 1] > value) {

				swap(a, j);
				j--;

			}
			a[j] = value;

		}
		return a;

	}

	public void swap(int[] a, int j) {
		int temp = a[j];
		a[j] = a[j - 1];
		a[j - 1] = temp;

	}

	public static void main(String[] args) {

		int a[] = { 4, 3, 2, 10, 12, 1, 5, 6 };
		InsertionSort ob = new InsertionSort();
		int[] sortedarray = ob.SortMethod(a);
		for (int k = 0; k < sortedarray.length; k++) {
			System.out.print(" " + sortedarray[k]);

		}
	}

}
