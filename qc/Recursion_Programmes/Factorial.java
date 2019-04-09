package com.qc.Recursion_Programmes;

public class Factorial {

	public int Fact(int n) {
		if(n==0) {
			return 1;
			
		}
		else {

			int ans1=n*Fact(n-1);
			 System.out.println(ans1); 
		    return ans1;
		}
		
		
	}
	public static void main(String[] args) {

		Factorial ob=new Factorial();
		int num=5;
		int ans =ob.Fact(num);
		System.out.println(ans);
	}

}
