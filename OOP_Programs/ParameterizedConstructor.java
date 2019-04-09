package com.OOP_Programs;

public class ParameterizedConstructor {
	int id;
	String name;
	
	ParameterizedConstructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedConstructor obj=new ParameterizedConstructor(12, "Sid");
		obj.display();
		
	
	}

}
