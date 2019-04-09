package com.StringProgrammes;

public class StringTest {
public static void main(String args[]) {
	String str1="Sid"; //String literal
	String str2="Sid";
	System.out.println(str1==str2);
	System.out.println(str1.equals(str2));
	String str3 = new String("Sid"); //String pool
	String str4=new String("Sidh");
			
	System.out.println(str1==str3);
	System.out.println(str1.equals(str3));
	System.out.println(str3==str4);
	System.out.println(str3=str4);
}
}
