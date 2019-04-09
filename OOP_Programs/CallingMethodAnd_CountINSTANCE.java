package com.OOP_Programs;


public class CallingMethodAnd_CountINSTANCE {
	
	public static class A {
		static int i=0;
		public A() {
			i++;
		}
		
		public static int countinstance() {
			return i;
		}
		
		public void method1(){
			System.out.println("Inside method 1 ");
			
			this.method2();
		}
		
		
		public void method2() {
			System.out.println("Inside method 2 ");
		}
	}
	 
	

	public static void main(String[] args) {
		

		A obj=new A();
		A obj2=new A();
		A obj3=new A();
		A obj4=new A();
		
		obj.method1();
		int i=A.countinstance();
		System.out.println("Instance count " + i);
		
		
	}

}
