package com.StringProgrammes;

class Person {
	public static  void who() {
		System.out.println("Inside private method Person(who)");
	}

	public  void whoAmI() {
		System.out.println("Inside static method, Person(whoAmI)");
	}

	public  void whoAreYou() {
		who();
		System.out.println("Inside virtual method, Person(whoAreYou)");
	}
}

class Kid extends Person {
	public static void who() {
		System.out.println("Kid(who)");
	}

	public  void whoAmI() {
		System.out.println("Kid(whoAmI)");
	}

	public  void whoAreYou() {
		who();
		System.out.println("Kid(whoAreYou)");
	}
}

public class StringPractice {

	public static void main(String[] args) {
		Person p = new Kid();
		p.whoAmI();
		p.whoAreYou();
		p.who();

	}

}
