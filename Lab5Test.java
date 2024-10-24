package lab4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lab4Test {
	//testing for point.java
	Point p0, p1, p1a, p2, p3, p4, p5, p6, p7, p8, c1, c2;
	String s0;

	@BeforeEach
	void setUp() {
		p0 = new Point(0,1);
		p1 = new Point(0,0);
		p1a = new Point(1,0);
		p2 = new Point(1,2);
		p3 = new Point(9,16);
		p4 = new Point(1,2);
		p5 = new Point(Math.sqrt(5.0), 0);
		p6 = new Point(Math.sqrt(5)/2, Math.sqrt(15.0)/2);
		p7 = new Point(-1, -1);
		p8 = new Point(-3, -4);
		s0 = "not a point";
		c1 = new Point(5, 2);
		c2 = new Point(4,0);
		
	}
	
	@Test
	void testDistance1() {
		assertEquals(Math.sqrt(5.0), p1.distance(p2),0.001);
	}

	@Test
	void testDistance2() {
		assertEquals(0.0, p1.distance(p1));
	}
	@Test
	void testDistance3() {
		assertNotEquals(p7.hashCode(), p8.hashCode());
		assertEquals(Math.sqrt(13),p7.distance(p8));
		assertFalse(p7.equals(p8));
		
	}
	
	@Test
	void testHashCode() {
		assertEquals(p2.hashCode(), p4.hashCode());
		assertNotEquals(p1.hashCode(), p2.hashCode());
		
	}
	
	
	@Test
	void testEquals() {
		assertTrue(p0.equals(p0));
		assertTrue(p2.equals(p4));
		assertFalse(p1.equals(p2));
		assertFalse(p0.equals(p1));
		assertFalse(p1a.equals(p1));
		assertFalse(p1a.equals(null));
		assertFalse(p1a.equals(s0));

		
	}

	//tests for Parallelogram.java
	@Test
	void testPerimeter() {
		Parallelogram parallelogram = new Parallelogram(p1, p2, c1, c2);
		double expectedPerimeter = p1.distance(p2) + p2.distance(c1) + c1.distance(c2) + c2.distance(p1);
		assertEquals(expectedPerimeter, parallelogram.perimeter(), 0.001);
	}
	
	@Test
	void testArea() {
		Parallelogram parallelogram = new Parallelogram(p1,p2,c1,c2);
		assertEquals(8, parallelogram.area());

	}
	@Test
	void testArea2() {
		Point A = new Point(0,0);
		Point B = new Point(2,0);
		Point C = new Point(1,4);
		Point D = new Point(3,4);
		Parallelogram parallelogram = new Parallelogram(A,B,C,D);
		assertEquals(8, parallelogram.area());
	}
	@Test
	void testArea3() {
		Point A3 = new Point(0,0);
		Point B3 = new Point(2,0);
		Point C3 = new Point(1,2);
		Point D3 = new Point(3,2);
		Parallelogram parallelogram = new Parallelogram(A3, B3, C3, D3);
		assertEquals(4, parallelogram.area());
		Parallelogram parallelogram2 = new Parallelogram(A3,C3,B3,D3);
		assertEquals(4, parallelogram2.area());
	}
	
}
