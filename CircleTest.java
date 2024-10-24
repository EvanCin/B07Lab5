package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTest {
    @Test
    void testPerimeter() {
        Circle c = new Circle(new Point(0, 0), 2);
        assertEquals(4 * Math.PI, c.perimeter());
    }

    @Test
    void testArea() {
        Circle c = new Circle(new Point(2, 4), 2);
        assertEquals(4 * Math.PI, c.area());
    }
}