package com.Arrays_Sorting_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z__TEST__CLASS {

	public static void main(String[] args) {

//		/List<String> asList = Arrays.asList(str);

		/*
		 * for (int i = 0; i < str.length(); i++) {
		 * 
		 * // System.out.println( ch); // System.out.println((int) ch);
		 * 
		 * list.add(ch[i]);
		 * 
		 * System.out.print(list); }
		 */

		String str = "My Name Is Sid";
		char[] ch = str.toCharArray();
		List<Character> biglist=new ArrayList<Character>();
		List<Character> list = new ArrayList<Character>();
		
		for (int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				biglist.addAll(list);
				list.removeAll(list);
			}
			
			list.add(ch[i]);
			System.out.println(biglist);
		}
	}

}
