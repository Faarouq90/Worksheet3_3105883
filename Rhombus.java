public class Rhombus extends Shape {
    private double sideLength;
    private double diagonal1; // First diagonal
    private double diagonal2; // Second diagonal

    // Modified constructor to include diagonals
    public Rhombus(String name, double sideLength, double diagonal1, double diagonal2) {
        super(name);
        this.sideLength = sideLength;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double area() {
        // Area = (d1 * d2) / 2
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double perimeter() {
        // Perimeter = 4 * side length
        return 4 * sideLength;
    }

    @Override
    public String toString() {
        return super.toString() + " (side length: " + sideLength + ", diagonals: " + diagonal1 + ", " + diagonal2 + ")";
    }
}
