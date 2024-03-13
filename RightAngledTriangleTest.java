import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RightAngledTriangleTest {
    private final double epsilon = 0.001; // Precision for floating-point comparisons

    @Test
    public void testArea() {
        RightAngledTriangle triangle = new RightAngledTriangle("RightAngledTriangle", 3, 4); // base, height
        assertEquals(6.0, triangle.area(), epsilon, "Incorrect area calculation.");
    }

    @Test
    public void testPerimeter() {
        RightAngledTriangle triangle = new RightAngledTriangle("RightAngledTriangle", 3, 4);
        double expectedPerimeter = 3 + 4 + 5; // base + height + hypotenuse (5 for a 3-4-5 triangle)
        assertEquals(expectedPerimeter, triangle.perimeter(), epsilon, "Incorrect perimeter calculation.");
    }
}
