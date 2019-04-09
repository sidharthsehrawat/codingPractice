package com.OOP_Programs;

public class CopyConstructor {
	
	int num;
	String name;
	static long l;
	CopyConstructor(int num ,String name, long l){
		
		this.num=num;
		this.name=name;
		this.l = l;
	}
	
	CopyConstructor(CopyConstructor s){
		this.name=s.name;
		this.num=s.num;
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.num);
		System.out.println(this.l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyConstructor ob=new CopyConstructor(12,"sidh",8);
		CopyConstructor ob1=new CopyConstructor(ob);
		/*
		 * System.out.println(ob1.name); System.out.println(ob1.num);
		 */
		ob.display(); // 12 Sidd 8
		ob1.num = 10;
		ob1.name="Batta";
		ob1.l=5;
		ob.display(); // 12 Sidd 5
		ob1.display(); // 10 Batta 5
	}
}
