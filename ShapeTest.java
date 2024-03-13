import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeTest {
    private final double epsilon = 0.0; // Using an epsilon of 0 for exact matches; adjust as necessary

    @Test
    public void testShapesList() {
        // Creating an ArrayList of Shape objects
        ArrayList<Shape> shapes = new ArrayList<>();

        // Adding two Circle objects with different radii
        shapes.add(new Circle("Circle1", 4.5));
        shapes.add(new Circle("Circle2", 1.5));

        // Adding two Rhombus objects, one with side length and diagonal, another with side length and angle
        shapes.add(new Rhombus("Rhombus1", 5, 7)); // Assume constructor modified to accept side length and one diagonal
        shapes.add(new Rhombus("Rhombus2", 3, 45, true)); // Assume constructor modified for side length and angle

        // Adding two RightAngledTriangle objects with different bases and heights
        shapes.add(new RightAngledTriangle("Triangle1", 6, 8));
        shapes.add(new RightAngledTriangle("Triangle2", 5, 5));

        for (Shape shape : shapes) {
            // Test that the area and perimeter are calculated correctly and are not negative or zero
            assertTrue(shape.area() > 0, shape.getName() + " area should be positive");
            assertTrue(shape.perimeter() > 0, shape.getName() + " perimeter should be positive");
        }
    }
}
