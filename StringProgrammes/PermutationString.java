package com.StringProgrammes;

public class PermutationString {

	public void Permutaionmethod(String str, int l, int r) {

  		if (l == r) {

			System.out.println(str);
		} else 
		{
			for (int i=l; i <= r; i++) {
				str = swap(str, l, i);

				Permutaionmethod(str, l + 1, r);

				//str = swap(str, l, i);
			}
		}

		 

	}

	public String swap(String str, int i, int j) {
        char[] str1=str.toCharArray();
		char temp = str1[i];
		str1[i] = str1[j];
		str1[j] = temp;

		return str1.toString().valueOf(str1);
	}

	public static void main(String[] args) {

		PermutationString ob = new PermutationString();
		String str = "ABC";
		int i = 0;
		int end = str.length();
		 ob.Permutaionmethod(str, i, end-1);
		
	}

}
