package Day28;
import java.util.Scanner;

abstract class Shape{
	float area;
	abstract void acceptInput();
	abstract void calcArea();
	void dispArea(){
		System.out.println(area);
	}
}

class Square extends Shape{
	private float side;

	public void acceptInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter side of the Square");
		side = s.nextFloat();
	}
	void calcArea() {
		area = side * side;
	}
}

class Rectangle extends Shape{
	private float length;
	private float breadth;

	public void acceptInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length");
		length = s.nextFloat();
		System.out.println("Enter breadth");
		breadth = s.nextFloat();
	}
	void calcArea() {
		area = length * breadth;
	}
}

class Circle extends Shape{
	private float radius;

	public void acceptInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius");
		radius = s.nextFloat();
	}
	void calcArea() {
		area = 3.141f * radius * radius;
	}
}

class Goementry{
	void objects(Shape ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}


public class Day28 {
	public static void main(String tap[]) {
		Square S = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Goementry g = new Goementry();
		g.objects(S);
		g.objects(r);
		g.objects(c);
	}
}