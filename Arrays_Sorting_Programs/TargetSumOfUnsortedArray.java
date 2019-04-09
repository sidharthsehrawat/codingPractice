package com.Arrays_Sorting_Programs;

import java.util.ArrayList;

public class TargetSumOfUnsortedArray {
	public ArrayList<Integer> TargetPair(int[] arr, int targetsum) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int sum1 = arr[i];
			list.add(arr[i]);
			for (int j = i + 1; j < arr.length; j++) {
				sum1 = sum1 + arr[j];
				list.add(arr[j]);

				if (sum1 == targetsum) {
                  display(list);
				}
				

			}
			list.removeAll(list);
           
		}
		return list;

	}
	
	public void display(ArrayList<Integer> list) {
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 0, 1, 2, 10, 6 };
	//  int[] arr = { -3, 2, 3, 1, 6 };
		TargetSumOfUnsortedArray ob = new TargetSumOfUnsortedArray();
		ArrayList<Integer> res = ob.TargetPair(arr, 7);
		//System.out.println(res);
	}

}
