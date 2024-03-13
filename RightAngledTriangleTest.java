import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RightAngledTriangleTest {

    @Test
    public void testArea() {
        RightAngledTriangle triangle = new RightAngledTriangle("RightAngledTriangle", 3, 4);
        assertEquals(6.0, triangle.area(), "Area should be 6 for base 3 and height 4");
    }

    @Test
    public void testPerimeter() {
        RightAngledTriangle triangle = new RightAngledTriangle("RightAngledTriangle", 3, 4);
        // Hypotenuse will be 5 for a 3-4-5 right triangle
        double expectedPerimeter = 3 + 4 + 5;
        assertEquals(expectedPerimeter, triangle.perimeter(), "Perimeter should be 12 for a 3-4-5 right triangle");
    }
}
