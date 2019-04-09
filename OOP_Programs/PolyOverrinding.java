package com.OOP_Programs;

public class PolyOverrinding {
	
	public static class A{
		
		private  void method1() {
			System.out.println("A method 1");
		}
		
		protected void method2() {
			System.out.println("A method 2");
		}
	}
	
static	class B extends A{
		@SuppressWarnings("unused")
		private  void method1() {
			System.out.println("B method 1");
		}
		
		protected void method2() {
			System.out.println("B method 2");
		}
		
	}

	public static void main(String[] args) {
		
		A ob=new A();
		ob.method1();
		ob.method2();
		
		A ob1=new B();
		ob1.method1();
		ob1.method2();
	}

}
