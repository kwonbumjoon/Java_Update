package ex01;

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea();

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Circle extends Shape {

	double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	double calcArea() {
		return Math.PI * r * r;
	}

}

class Rectangle extends Shape {

	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		return (width == height) ? true : false;
	}

}

public class test01 {
	public static void main(String[] args) {
		Shape s = new Circle(5.0);
		System.out.println("원의 면적 : " +s.calcArea());

		s = new Rectangle(3, 4);
		System.out.println("사각형의 면적 : " +s.calcArea());
	}

}
