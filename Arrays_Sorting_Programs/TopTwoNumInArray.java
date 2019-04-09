package com.Arrays_Sorting_Programs;

public class TopTwoNumInArray {

	public static int[] TopTwoMethod(int[] arr) {
		int temp[] =new int[2];
		int top1 = 0;
		int top2 = 0;
		
		 
		for (int j = 0; j < arr.length; j++) {
			if (top2 < arr[j]) {
				if (top1 < arr[j]) {
					top1 = arr[j];
				} else {
					if(top2<arr[j]) {
					top2 = arr[j];
				}
			} 
		}

		
	}
		temp[0]=top1;
		temp[1]=top2;
		
		return temp;
	}

	public static void main(String[] args) {

		int arr[] = { 21, 3, 234, 3, 4, 23, 23, 34, 56, 3 };
		int[] res= TopTwoNumInArray.TopTwoMethod(arr);
		System.out.println("top1 no " + res[0] + "\ntop2 no " +res[1]);
	}

}
