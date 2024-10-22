package lab4;

public class Parallelogram {
	Point A;
	Point B;
	Point C;
	Point D;
	
	//Precondition: input is a valid parallelogram
	public Parallelogram(Point A, Point B, Point C, Point D) {
		this.A = A;
		if(A.y == B.y) {
			this.B = B;
			this.C = C;
			this.D = D;
		} else if(A.y == C.y) {
			this.B = C;
			this.C = B;
			this.D = D;
		} else {
			this.B = D;
			this.D = B;
			this.C = C;
		}
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	public double area() {
		double height;
		if(A.distance(C) <= A.distance(D)) {
			height = Math.sqrt(Math.pow(A.distance(C), 2) - Math.pow(Math.abs(A.x-C.x), 2));
		} else {
			height = Math.sqrt(Math.pow(A.distance(D), 2) - Math.pow(Math.abs(A.x-D.x), 2));
		}
		double base = A.distance(B);
		return base * height;
	}

}
