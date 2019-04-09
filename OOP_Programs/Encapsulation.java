package com.OOP_Programs;

public class Encapsulation {

	public static abstract class Shape {

		String color;

		public Shape(String color) {
			this.color = color;

		}

		abstract double area();

		public abstract String toString();

		public String getcolor() {
			return color;
		}
	}
	
	public static class Circle extends Shape{

		double radius;
		public Circle(String color,double radius) {
			super(color);
			this.radius=radius;
			System.out.println("Shape Construcrtor called");
			
			
		}

		@Override
		double area() {
			return Math.PI *Math.pow(radius, 2); 
			
		}

		@Override
		public String toString() {
			
			return "Circle color " + getcolor() + "\narea of circle " + area();
		} 
		
	}
	
	public  static class Rectangle extends Shape{

		double length,breadth;
		public Rectangle(String color,double length,double breadth) {
			super(color);
			this.length=length;
			this.breadth=breadth;
			System.out.println("rectangle constructor called ");
		}

		@Override
		double area() {
			
			return length*breadth;
		}

		@Override
		public String toString() {
			
			return "color of rectangle " + getcolor() + "\narea of rectangle " + area();
		}
		
		
	}

	public static void main(String[] args) {
	
		Shape ob=new Circle("red", 2.2);
		System.out.println(ob.toString());
		
		Shape ob1=new Rectangle( "Blue",2.0,3.0);
		
		System.out.println(ob1.toString());
	}

}
