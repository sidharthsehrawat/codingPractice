package com.OOP_Programs;


public class AbstractClassdemo {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* new Animal(); */
	Animal animal=new Dog();
	animal.run();
	animal.eat();
	}

}

abstract class Animal{
public void run(){
	System.out.println("c1 class lines");
	
}	

abstract public void eat();
} 

 class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("e class lines ");
	}
	
	
}

