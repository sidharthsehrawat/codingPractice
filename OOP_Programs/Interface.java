package com.OOP_Programs;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* new Animal1(); */ 
		Animal1 animal =new Dog1();
		animal.eat();
		animal.run();
		
		Animal2 animal1 =new Dog1();
		animal1.eat1();
		animal1.run1();
	}

}

interface Animal1{
	public void run(); 
	
	public void eat(); 
}

interface Animal2{
	public void run1(); 
	
	public void eat1(); 
}
class Dog1 implements Animal1 , Animal2{
	
	public void run() {
		System.out.println("enter in child");
		
	}
	
	public void eat() {
		System.out.println("enter in eat method");
		
	}

	@Override
	public void run1() {
		System.out.println("enter in run1 method");
		
	}

	@Override
	public void eat1() {
		System.out.println("enter in eat1 method");
		
	}
	
	
}
