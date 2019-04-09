package com.Arrays_Sorting_Programs;

public class MAXandMIN_element_inARRAY {
	public class Result {
		int min;
		int max;
	}
	public  Result MAXMIN(int[] arr) {
		int[] temp=new int[2] ;
		int max=32555;
		int min=-32555;
		for(int j=0;j<arr.length;j++) {
		if(	arr[j] > min) {
			min=arr[j];
			
		}
		
		
		if(	arr[j] < max) {
			max=arr[j];
			
		}
		}
		Result res = new Result();
		res.min = min;
		res.max = max;
		
		return res;
	}

	public static void main(String[] args) {
		int arr[]= {4,4,2,34,6,7,3,56,335,22,45,33,3,32};
		
		MAXandMIN_element_inARRAY ob=new MAXandMIN_element_inARRAY();
		
		Result  a=ob.MAXMIN(arr);
		System.out.println("Maximum NO " + a.min);
		System.out.println("Minimum No " +a.max);
		
	}

}
