package com.Arrays_Sorting_Programs;

public class UniqueCharacterInString {
	public void method(String str) {
		char[] ch=str.toCharArray();
		char[] result=new char[150];
		for(int i=0;i<ch.length;i++) {
		result[ch[i]]++;
		}
		
		for(int j=0;j<result.length;j++) {
			if(result[ch[j]]<2) {
				System.out.println(ch[j]);
				
			}
			
		}
	}

	public static void main(String[] args) {
		UniqueCharacterInString ob=new UniqueCharacterInString();
		String str="aabccdde";
		ob.method(str);
	}

}
