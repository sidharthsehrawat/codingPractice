package com.Arrays_Sorting_Programs;

public class PrimeCheck {
	public boolean checkMethod(int num) {
	int count=0;boolean res = false;
		for(int i=2;i<=num;i++) {
			
			if(num%i==0) {
				count++;
			}
			if(count>1) {
				 res=false;
				
			}
			else {
				res=true;
			}
		}
		
		
		return res;
		
	}

	public static void main(String[] args) {
		PrimeCheck ob=new PrimeCheck();
		int num=33;
		 boolean rel=ob.checkMethod(num);
		System.out.println(rel);
		
	}

}
