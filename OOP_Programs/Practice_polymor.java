package com.OOP_Programs;

public class Practice_polymor {

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		char ch5=a.c;
		 char ch=a.getValue();
		 char ch2=b.getValue();
		char ch3=b.getSuperValue();
		
		//System.out.println( + " " + a.getValue() + " " + b.getValue() + " " + b.getSuperValue());
	}

}

class A {
 public char c = 'A';

	char getValue() {
		return c;
	}
}

class B extends A {
	public char c = 'B';

	char getValue() {
		return c;
	}

	char getSuperValue() {
		return super.c;
	}
}