package lab4;

public class Circle {
	
	Point center;
	double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = Math.abs(radius);
	}
	
	public double perimeter() {
		return Math.PI * this.radius * 2;
	}
	
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}

}
