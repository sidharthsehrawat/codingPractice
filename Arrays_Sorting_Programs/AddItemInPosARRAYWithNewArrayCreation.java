package com.Arrays_Sorting_Programs;

public class AddItemInPosARRAYWithNewArrayCreation {

	public int[] AddItemATPos(int[] arr, int pos, int num) {

		int newlength = arr.length + 1;
		
		int[] newarray = new int[newlength];
		for(int j=0;j<arr.length;j++) {
			
			newarray[j]=arr[j];
		}

		for (int i = newarray.length-1; i > pos-1; i--) {

			newarray[i] = newarray[i - 1];
		}
		newarray[pos-1] = num;

		return newarray;
	}

	public static void main(String[] args) {

		AddItemInPosARRAYWithNewArrayCreation ob = new AddItemInPosARRAYWithNewArrayCreation();
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int[] result=ob.AddItemATPos(arr, 3, 9);
		for(int k=0;k<result.length;k++) {
			System.out.print(result[k]);
			
		}
		
	}

}
