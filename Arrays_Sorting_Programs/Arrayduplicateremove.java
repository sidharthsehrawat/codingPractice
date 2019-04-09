package com.Arrays_Sorting_Programs;

public class Arrayduplicateremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,3,4,7,7};
		
		removeduplicate(a);
		
	}
	
	private static int[] removeduplicate(int a[]) {
		int[] result= new int[8];
		for(int i=0;i<a.length;i++) {
			/*if(result[a[i]]>=0) {*/
				result[a[i]]++;
			/* } */
		}
		for(int j=0;j<result.length;j++) {
			if(result[j]>=1) {
			System.out.println( j);
			}
		
}
		return result;
	}
}
	
