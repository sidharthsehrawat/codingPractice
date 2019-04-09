package com.OOP_Programs;

public class PraticeThisKeyword {
	int num1 = 100;

	public void calc(int num) {
		this.num1 = num * 10;
	}

	public void printNum() {
		System.out.println(num1);
	}

	public static void main(String[] args) {
		PraticeThisKeyword obj = new PraticeThisKeyword(); 
        obj.calc(2); 
        obj.printNum(); 
	}

}
