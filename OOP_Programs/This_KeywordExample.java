package com.OOP_Programs;

public class This_KeywordExample {

	B obj;

	public This_KeywordExample(B obj) {
		this.obj = obj;
		
		 obj.display(); 
	}

	public static class B {
		int x = 10;

		B() {
			This_KeywordExample ob = new This_KeywordExample(this);
		}
		
		void display() 
	    { 
	        System.out.println("Value of x in Class B : " + x); 
	    } 
	}

	public static void main(String[] args) {

		B obj = new B();
	}

}
