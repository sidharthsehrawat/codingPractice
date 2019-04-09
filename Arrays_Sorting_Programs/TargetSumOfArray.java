package com.Arrays_Sorting_Programs;

import java.util.HashMap;
import java.util.Map;

public class TargetSumOfArray {

	public void QuickSort(int[] a, int start, int end) {
		if (start < end) {

			int index = PartionIndexAndSorting(a, start, end);
			QuickSort(a, start, index - 1);
			QuickSort(a, index + 1, end);

		}

	}

	public int PartionIndexAndSorting(int[] arr, int start, int end) {
		int index = start;
		int pivot = arr[end];
		for (int i = start; i <= end - 1; i++) {
			if (arr[i] < pivot) {
				swap(arr, index, i);
				index++;
			}

		}

		swap(arr, index, end);

		return index;
	}

	public void PrintArray(int[] arr) {

		for (int j = 0; j < arr.length; j++) {
			System.out.print(" " + arr[j]);

		}

	}

	// find pair function

	public HashMap<Integer, Integer> FindPAir(int[] arr, int start, int end, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int j = end;
		for (int i = start; i < end / 2; i++) {

			if (arr[start] + arr[j] == target) {
				map.put(arr[start], arr[j]);
				start++;
			}
			
			if ((arr[start] + arr[j]) > target) {
				j--;

			}
			if ((arr[start] + arr[j]) < target) {
				continue;
			}
			

		}
		return map;
	}

	public void swap(int[] arr, int index, int i) {
		int temp = arr[i];
		arr[i] = arr[index];
		arr[index] = temp;
	}

	public static void main(String[] args) {
		TargetSumOfArray ob = new TargetSumOfArray();
		int[] arr = { 7, 8, 5, 6, 2, 9, 1, 3, 0, 4 };
		int start = 0;
		int end = arr.length - 1;
		ob.QuickSort(arr, start, end);
        HashMap<Integer, Integer> map= ob.FindPAir(arr, start, end, 9);
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
        	System.out.println(entry.getKey() + " " + entry.getValue());
        	
        }
        
		//ob.PrintArray(arr);
	}

}
