package com.Arrays_Sorting_Programs;

public class RemoveItemInArray {

	public static int[] RemoveArrayEle(int[] arr, int pos, int size) {
		for (int i = 1; i < size; i++) {
			arr[i] = i;
			System.out.print(" " + arr[i]);
		}

		for (int j = pos; j < size; j++) {
			arr[j] = arr[j + 1];

		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		int size = 7;
		int[] result = RemoveItemInArray.RemoveArrayEle(arr, 8, 7);
		System.out.println();
		for (int k = 1; k < size - 1; k++) {
			System.out.print(result[k]);

		}

	}

}
