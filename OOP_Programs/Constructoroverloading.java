package com.OOP_Programs;

public class Constructoroverloading {
	int id;
	String name;
	float sal;
	
	

	protected Constructoroverloading(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public Constructoroverloading(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("int");
	}
	
	public Constructoroverloading(long id, String name) {
		this.id = (int)id;
		this.name = name;
		System.out.println("long");
	}
	public void Dis() {
		System.out.println(id + "  " +  name);
		System.out.println(sal);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloading obj=new Constructoroverloading(12, "Sidd");
		Constructoroverloading obj1=new Constructoroverloading(12, "Sidd" ,(float) 2324.23);
		Constructoroverloading obj2=new Constructoroverloading(12L, "Sidd");
		
		/* obj.Dis(); */
		obj1.Dis();
		
	}

}
