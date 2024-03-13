import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTest {
    private final double epsilon = 0.0;

    @Test
    void testArea() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(38.48451, circle.area(), epsilon);
    }

    @Test
    void testPerimeter() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(21.99115, circle.perimeter(), epsilon);
    }

    @Test
    void testToString() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals("Circle", circle.toString());
    }
}
