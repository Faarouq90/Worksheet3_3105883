//Faarouq Asaju 3105883
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RhombusTest {
    private final double epsilon = 0.001;

    @Test
    public void testAreaWithDiagonal() {

        Rhombus rhombus = new Rhombus("RhombusWithDiagonal", 5, 6); // Side length, diagonal
        double expectedArea = 5 * 5 * Math.sin(Math.toRadians(60));
        assertEquals(expectedArea, rhombus.area(), epsilon, "Incorrect area calculation.");
    }

    @Test
    public void testAreaWithAngle() {

        Rhombus rhombus = new Rhombus("RhombusWithAngle", 5, 60, true); // Side length, angle, useAngle flag
        double expectedArea = 5 * 5 * Math.sin(Math.toRadians(60));
        assertEquals(expectedArea, rhombus.area(), epsilon, "Incorrect area calculation.");
    }

    @Test
    public void testPerimeter() {
        Rhombus rhombus = new Rhombus("RhombusPerimeter", 5, 6); // Using the first constructor as an example
        assertEquals(20, rhombus.perimeter(), epsilon, "Incorrect perimeter calculation.");
    }
}
