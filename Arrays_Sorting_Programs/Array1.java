package com.Arrays_Sorting_Programs;

public class Array1 {
	
	public static void main(String[] args) {
		int arr[]= {2,4,5,7,8,3};
		int target=12;
		check(target, arr);
	}
	
	public static  int check(int target1, int a[]) {
		/*int a1[]=new int[5];*/
		for(int i=0;i<a.length;i++) {
	
			for(int j=1;j<a.length;j++) {
				if(a[i]+a[j]==target1) {
					System.out.println("index=" + i + "index=" + j);
					
				}
				
			}
				
			
			
		}
		return target1;
		
	}

}
