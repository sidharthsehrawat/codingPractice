package com.StringProgrammes;

public class StringPatternFoundOrNot {
	public int indexFunction(String str, String pattern) {
		int j = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == pattern.charAt(j)) {
				j++;

			} else if (j > 3) {

				if (str.charAt(i) == pattern.charAt(j - 1) || str.charAt(i) == pattern.charAt(j - 2)
						|| str.charAt(i) == pattern.charAt(j - 3)) {
					i = i - 1;

				}
				j = 0;
			}

			if (j == pattern.length()) {

				return i - pattern.length() + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		StringPatternFoundOrNot ob = new StringPatternFoundOrNot();
		String str = "aababcceabcde";
		String pattern = "abcd";

		int res = ob.indexFunction(str, pattern);
		if (res == -1) {
			System.out.println("Pattern not found ");

		} else {
			System.out.println("String found at index" + res);
		}
	}

}
