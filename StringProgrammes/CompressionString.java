package com.StringProgrammes;

import java.util.Arrays;
import java.util.List;

public class CompressionString {
	public StringBuilder compressMethod(String str) {

		StringBuilder sb = new StringBuilder();
		int j = 1;
		int count = 1;
		int i = 0;
		while (i < str.length() - 1) { //change it to for loop

			if (str.charAt(i) == str.charAt(j)) {
				count++;
				j++;
			}
			else {
				sb.append(str.charAt(i));
				sb.append(count);
				j++;
				count = 1;
			}
			i++;
		}
		sb.append(str.charAt(j-1));
		sb.append(count);
		return sb;

	}

	public static void main(String[] args) {
		CompressionString ob = new CompressionString();

		String str = "aabbc";
		StringBuilder res = ob.compressMethod(str);
		System.out.println(res);
	}

}
