//Faarouq Asaju 3105883
public class Rhombus extends Shape {
    // Declare a private double variable for the side length of the rhombus.
    private double sideLength;

    // Constructor for the Rhombus class
    public Rhombus(String name, double sideLength) {
        super(name); // Call the constructor of the parent Shape class with the name.
        this.sideLength = sideLength; // Set the side length of this rhombus.
    }

    //to override the abstract area method from Shape.
    @Override
    public double area() {
        return 0;
    }

    //to override the abstract perimeter method from Shape.
    @Override
    public double perimeter() {
        return 0;
    }

    // to override the toString method to provide a string representation of the Rhombus.
    @Override
    public String toString() {
        // Include the string representation from Shape and add the side length information.
        return super.toString() + " (side length: " + sideLength + ")";
    }
}