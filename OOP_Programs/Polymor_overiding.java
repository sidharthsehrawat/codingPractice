package com.OOP_Programs;

public class Polymor_overiding {

	public void name(int a) {
	System.out.println("here is a1");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymor_overiding ob=new Polymor_overiding();
		ob.name(0);
		
		Polymor_overiding ob1=new a2();
		ob1.name(0);
	}

}
class a2 extends Polymor_overiding{
	public void name(int a) {
		System.out.println("here is a2");
	}
}