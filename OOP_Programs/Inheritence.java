package com.OOP_Programs;

public class Inheritence {

	public static class Employee {
		int empid;
		String name;

		public Employee(int e, String e_name) {
			e_name = name;
			e = empid;
		}

		public String display(String e_name, int e) {
			/* System.out.println("empid " + e + "\n" + "employee_name " + e_name); */
			return e_name + e;

		}

	}

	public static class Manager extends Employee {

		String Designation;

		public Manager(int e, String e_name, String desg) {
			super(e, e_name);
			desg = Designation;

		}
		
		public void display2(String e_name, int e,String desgi) {
			Designation=desgi;
			
		}
		public String toString() {
			
			return (super.display("Sidd", 2) + "\nDesignation of Employee " + Designation);
			
			
		}
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ob=new Manager(1,"Sid","SDE");
		System.out.println(ob.toString());
	}

}
