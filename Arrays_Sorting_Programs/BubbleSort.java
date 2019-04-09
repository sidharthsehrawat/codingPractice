package com.Arrays_Sorting_Programs;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {2,1,4,5,8,2,3,90,45,32,78};
		int[] c=Sort(a);
		for(int k=0;k<c.length;k++) {
		 System.out.print("  "+ c[k]); 
		}

	}

	public static int[] Sort(int a[]) {
		int temp ;
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
			}	
	}
		return a;
}
}
