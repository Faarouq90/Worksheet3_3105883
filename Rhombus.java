public class Rhombus extends Shape {
    private double sideLength;
    private double diagonal; // Longer diagonal
    private double angle; // Internal angle in degrees, assuming it's the smaller angle

    // Constructor for the Rhombus class with side length and longer diagonal
    public Rhombus(String name, double sideLength, double diagonal) {
        super(name);
        this.sideLength = sideLength;
        this.diagonal = diagonal;
        this.angle = 0; // Default to 0, meaning angle is not used
    }

    // Constructor for the Rhombus class with side length and internal angle
    public Rhombus(String name, double sideLength, double angle, boolean isAngle) {
        super(name);
        this.sideLength = sideLength;
        this.diagonal = 0; // Default to 0, meaning diagonal is not used
        this.angle = angle;
    }

    @Override
    public double area() {
        if (diagonal > 0) {
            // Simplified formula for the area of a rhombus with one diagonal known
            // This is a placeholder. The correct formula depends on both diagonals.
            return Math.pow(diagonal, 2) / (2 * Math.sqrt(2));
        } else if (angle > 0) {
            // Area formula using side length and an internal angle
            return sideLength * sideLength * Math.sin(Math.toRadians(angle));
        }
        return 0; // Placeholder in case neither diagonal nor angle is properly set
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }

    @Override
    public String toString() {
        return super.toString() + " (side length: " + sideLength + ")";
    }
}
