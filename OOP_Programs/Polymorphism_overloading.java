package com.OOP_Programs;

public class Polymorphism_overloading {
	
	
	public void name(int a) {
		System.out.println("print a" + a);
		
	}
	
	public void name(int a,int b) {
		System.out.println("print a" + a + "print b" + b);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_overloading ob=new Polymorphism_overloading();
		ob.name(1);
		ob.name(1, 2);
	}

}
