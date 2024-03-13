import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testArea() {
        Circle circle = new Circle("Circle", 1);
        assertEquals(Math.PI, circle.area(), 0.001, "Area should be π for radius 1");
    }

    @Test
    public void testPerimeter() {
        Circle circle = new Circle("Circle", 1);
        assertEquals(2 * Math.PI, circle.perimeter(), 0.001, "Perimeter should be 2π for radius 1");
    }
}
