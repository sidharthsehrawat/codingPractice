package com.qc.Recursion_Programmes;

public class Fibonacci_Recursion {

	public  int Fibo(int n) {
		
		if(n==0) {
			return 0;
			
		}
		
		if(n==1) {
			return 1;
			
		}
		else {
			int ans1=(Fibo(n-1) + Fibo(n-2));
			System.out.println(ans1);
			return ans1;
		}
		
		
	}
	public static void main(String[] args) {
		Fibonacci_Recursion ob=new Fibonacci_Recursion();
		int num=5;
		int ans=ob.Fibo(num);
		 System.out.println(ans); 

	}

}
