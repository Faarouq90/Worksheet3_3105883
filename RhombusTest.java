import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RhombusTest {

    @Test
    public void testArea() {
        // Example rhombus with diagonals of length 5 and 6
        Rhombus rhombus = new Rhombus("Rhombus", 5, 5, 6);
        assertEquals(15, rhombus.area(), 0.001, "Area should be 15 for diagonals 5 and 6");
    }

    @Test
    public void testPerimeter() {
        Rhombus rhombus = new Rhombus("Rhombus", 5, 5, 6);
        assertEquals(20, rhombus.perimeter(), 0.001, "Perimeter should be 20 for side length 5");
    }
}
