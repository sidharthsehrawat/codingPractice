package com.StringProgrammes;

public class FillStringSpaceBy_20 {

	public StringBuilder FillMethod(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			} else {
				sb.append("%20");
			}

		}

		return sb;
	}

	public static void main(String[] args) {
		FillStringSpaceBy_20 ob=new FillStringSpaceBy_20();
		String str = "Quick sort and dynamic pro";

	StringBuilder res=	ob.FillMethod(str);
	System.out.println(res);
		
	}

}
