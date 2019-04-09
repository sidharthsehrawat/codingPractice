package com.StringProgrammes;

public class FillSpaceBy_20UsingArray {

	public String FillMethod(String str) {

		char ch[]=str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;

			}

		}
		int newlength=str.length() + 2*count;
        char[] newarray=new char[newlength];
		int j=0;	
        for(int i=0;i<ch.length;i++) {
				if(ch[i]!=' ') {
					newarray[j]=ch[i];
					j++;
				}else {
					newarray[j]='%';
					j++;
					newarray[j]='2';
					j++;
					newarray[j]='0';
					j++;
				}
				
			}
		

		return String.valueOf(newarray);

	}

	public static void main(String[] args) {
		FillSpaceBy_20UsingArray ob=new FillSpaceBy_20UsingArray();
		String str = "My name is Sid";
		String result=	ob.FillMethod(str);
		System.out.println(result);
		
	}

}
