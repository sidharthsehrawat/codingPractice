package com.qc.Recursion_Programmes;

public class QuickSortProgramme {

	public void Quicksort(int[] arr, int start, int end) {

		if (start < end) {

			int P_index = Get_partitionindexandsorting(arr, start, end);

			Quicksort(arr, start, P_index - 1);
			Quicksort(arr, P_index + 1, end);

		}

	}

	public int Get_partitionindexandsorting(int[] arr, int start, int end) {
		int pivot = arr[end];
		int index = start;

		
		for (int i = start; i <= end - 1; i++) {

			if (arr[i] < pivot) {
				swap(arr, index, i);
				index++;

			}
		}
		swap(arr, index,end);

		return index;

	}

	public void printarray(int[] arr) {
		for (int z = 0; z < arr.length ; z++)

		{
			System.out.print(" " + arr[z]);
		}
	}

	public void swap(int[] arr, int index, int i) {
		int temp = arr[index];
		arr[index] = arr[i];
		arr[i] = temp;
	}

	public static void main(String[] args) {
		QuickSortProgramme ob = new QuickSortProgramme();
		int[] arr = { 1, 7, 3, 8, 2, 6, 9, 5, 4 };
		int start = 0;
		int end = arr.length - 1;
		ob.Quicksort(arr, start, end);
		ob.printarray(arr);

	}

}
