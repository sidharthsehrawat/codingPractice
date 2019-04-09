package com.Arrays_Sorting_Programs;


public class BinarySearch {

	public int BinaryMethod(int[] arr, int num, int start, int end) {

		int mid = (start + end) / 2;
		int index = 0;

		while (start <= end) {
			if (arr[mid] < num) {
				start = mid + 1;
			} else if (arr[mid] > num) {
				end = mid - 1;
			} else if (arr[mid] == num) {
				/* System.out.println("Element found at index " + mid); */
				index = mid;
				break;

			}

			mid = (start + end) / 2;
		}

		return index;

	}

	public static void main(String[] args) {

		int[] arr = { 12, 13, 14, 15, 16, 23, 24, 25, 26, 27 };
		BinarySearch ob = new BinarySearch();
		int start = 0;
		int end = arr.length - 1;

		int index = ob.BinaryMethod(arr, 89, start, end);

		if (index == 0) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index " + index);
		}

	}

}
