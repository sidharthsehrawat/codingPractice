package com.OOP_Programs;


class Base { 
    public void Print() { 
        System.out.println("Base"); 
    }          
} 
  
class Derived extends Base {     
    public void Print() { 
        super.Print(); 
    } 
} 
public class PracticeOOPs {
	 public static void DoPrint( Base o ) { 
	        o.Print();    
	    } 

	public static void main(String[] args) {

		
		 Base x = new Base(); 
	        Base y = new Derived(); 
	        Derived z = new Derived(); 
	        DoPrint(x); 
	        DoPrint(y); 
	        DoPrint(z); 
	}

}


