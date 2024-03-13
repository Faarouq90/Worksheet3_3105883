//Faarouq Asaju 3105883
public class RightAngledTriangle extends Shape {

    private double base;
    private double height;

    // Constructor for the RightAngledTriangle
    public RightAngledTriangle(String name, double base, double height) {
        super(name); // Call the constructor of the parent Shape class with the name.
        this.base = base; // to Set the base of the triangle.
        this.height = height; //to  Set the height of the triangle.
    }

    // Override the abstract area method from Shape.
    @Override
    public double area() {
        return 0;
    }

    // Override the abstract perimeter method from Shape
    @Override
    public double perimeter() {
        return 0;
    }

    // Override the toString method to provide a string representation of the RightAngledTriangle.
    @Override
    public String toString() {
        // Include the string representation from Shape and add the base and height information.
        return super.toString() + " (base: " + base + ", height: " + height + ")";
    }
}