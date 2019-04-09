package com.Arrays_Sorting_Programs;

import java.util.ArrayList;

public class AlternatePOS_NEGNumber {
	public ArrayList<Integer> altermethod(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int flag = 1;
		int j = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			if (flag == 1) {
				
				list.add(arr[i]);
				flag = 0;
			}
			if(flag==0) {
				list.add(arr[j]);
				flag = 1;
				j--;
			}
		}

		return list;
	}

	public static void main(String[] args) {
		AlternatePOS_NEGNumber ob=new AlternatePOS_NEGNumber();
		int arr[] = { -9, -6, -4, -3, 1, 2, 3, 4 };
	ArrayList<Integer>	list=ob.altermethod(arr);
	System.out.println(list);
	}

}
