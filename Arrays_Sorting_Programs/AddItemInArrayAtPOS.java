package com.Arrays_Sorting_Programs;

public class AddItemInArrayAtPOS {

	public static int[] MethodAdd(int[] arr, int pos, int num, int size) {

		for (int p = 0; p < size; p++) {
			arr[p] = p;

		}

		for (int i = size; i > pos - 1; i--) {

			arr[i] = arr[i - 1];
		}
		arr[pos - 1] = num;

		return arr;

	}

	public static void main(String[] args) {
		int arr[] = new int[10];
		
        //System.out.println(arr.length);
		int size=6;
		int[] finalarray = AddItemInArrayAtPOS.MethodAdd(arr, 1, 9, 6);

		for (int k = 0; k < size+1; k++) {
			System.out.print(finalarray[k]);
		}
	}

}
