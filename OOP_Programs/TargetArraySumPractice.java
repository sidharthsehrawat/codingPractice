package com.OOP_Programs;

import java.util.ArrayList;

public class TargetArraySumPractice {
	public void Method(int[] arr, int T) {
		int j = arr.length - 1;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] + arr[j]) < T) {
				i++;
			}

			if ((arr[i] + arr[j]) > T) {
				j--;
			}

			if (arr[i] + arr[j] == T) {
				list.add(arr[i]);
				list.add(arr[j]);
				display(list);
				list.removeAll(list);
			}
		}

	}

	public void display(ArrayList<Integer> list) {
		System.out.println(list);

	}

	public static void main(String[] args) {
		TargetArraySumPractice ob = new TargetArraySumPractice();

		int[] arr = { 0, 1, 2, 4, 6, 10 };
		// int[] arr = {10, 2, -2, -20, 10 };
		
		ob.Method(arr, 6);

	}
	
	/*
	 * 
	 * public static void subArraySum(int[] arr, int n, int sum) { //cur_sum to keep
	 * track of cummulative sum till that point int cur_sum = 0; int start = 0; int
	 * end = -1; HashMap<Integer, Integer> hashMap = new HashMap<>();
	 * 
	 * for (int i = 0; i < n; i++) { cur_sum = cur_sum + arr[i]; //check whether
	 * cur_sum - sum = 0, if 0 it means //the sub array is starting from index 0- so
	 * stop if (cur_sum - sum == 0) { start = 0; end = i; break; } //if hashMap
	 * already has the value, means we already // have subarray with the sum - so
	 * stop if (hashMap.containsKey(cur_sum - sum)) { start = hashMap.get(cur_sum -
	 * sum) + 1; end = i; break; } //if value is not present then add to hashmap
	 * hashMap.put(cur_sum, i);
	 * 
	 * } // if end is -1 : means we have reached end without the sum if (end == -1)
	 * { System.out.println("No subarray with given sum exists"); } else {
	 * System.out.println("Sum found between indexes " + start + " to " + end); }
	 * 
	 * }
	 * 
	 * // Driver code public static void main(String[] args) { int[] arr = {10, 2,
	 * -2, -20, 10}; int n = arr.length; int sum = -10; subArraySum(arr, n, sum);
	 * 
	 * } }
	 */ 

	
	

}
