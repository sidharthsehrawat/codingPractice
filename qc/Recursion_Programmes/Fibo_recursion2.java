package com.qc.Recursion_Programmes;

public class Fibo_recursion2 {
	int first = 0;
	int second = 1;
	int next = 0;

	public void fibo(int num) {

		if (num > 0) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(" " + next);
			fibo(num - 1); // recursive call
		}

	}

	public static void main(String[] args) {
		Fibo_recursion2 ob = new Fibo_recursion2();
		int num = 9;
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " " + n2);
		ob.fibo(num - 2);

	}

}
