package com.StringProgrammes;

public class StringPalindrome {

	public boolean PalindromMethod(String str) {
		int end = str.length();
		int j = end - 1;
		int mid = (0 + end) / 2;
		int i = 0;
		boolean res;
		if ((end / 2) != 0) { //EVEN

			while (i < mid && j >= mid) {
				char ch=str.charAt(i);
				char ch2=str.charAt(j);
				if ( ((int) ch) - ((int) ch2)==0 || ((int) ch) - ((int) ch2)==-32 || ((int) ch) - ((int) ch2)==-32) {
					j--;
					i++;

				} else {
					return false;
				}
			}
			res = true;

		} else { //ODD
			while (i < mid) {
				char ch=str.charAt(i);
				char ch2=str.charAt(j);
				if ((int) ch-(int) ch==32|| ((int) ch) - ((int) ch2)==32) {
					
					j--;
					i++;
				} else {
					return false;
				}
			}
			res = true;
		}

		return res;

	}

	public static void main(String[] args) {
		StringPalindrome ob = new StringPalindrome();
		String str = "MADAm";
		boolean result = ob.PalindromMethod(str);
		System.out.println(result);
		
		
	}

}
