package com.inheritance;



class Shape{
	public void area() {
		
	}
}

class Square extends Shape{
	
	
	public void area(int side) {
		System.out.println(side*side);
	}
	
	
}

class Rectangle extends Shape{
	
	public void area(int length, int breadth) {
		System.out.println(length*breadth);
	}
	
}

class Circle extends Shape{
	
	static float pi = 3.142f;
	public void area(int radius) {
		System.out.println(pi * radius * radius);
	}
	
}







public class Inheritance2 {

	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		s.area(4);
		r.area(4, 2);
		c.area(6);
		

	}

}
