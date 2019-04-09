package com.StringProgrammes;

public class ReverseString {
	

	public static String RevMethod(String str) {

		char ch[] = str.toCharArray();

		int j = ch.length - 1;
		int k = 0;
		char temp;
		while (k < ch.length / 2) {
			temp = ch[k];
			ch[k] = ch[j];
			ch[j] = temp;
			k++;
			j--;

		}
		//System.out.println(ch);
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		String name = "Siddharth";

		String res = ReverseString.RevMethod(name);
		System.out.println(res);

	}

}
