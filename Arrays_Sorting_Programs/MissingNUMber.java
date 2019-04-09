package com.Arrays_Sorting_Programs;

public class MissingNUMber {

	public static int method(int[] arr) {
		int missing = 0;
		int totalarraysum=(arr.length+1)*(arr.length+2)/2;
		
        int sum=0;
		for (int j = 0; j < arr.length; j++) {
			sum=sum+arr[j];
		}
		
		missing=totalarraysum-sum;
		
		return missing;
	}

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,6,7,8,9,10};

		int result = MissingNUMber.method(arr);
		System.out.println(result);

	}

}
