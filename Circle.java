//Faarouq Asaju 3105883
public class Circle extends Shape {
    // Declare a private double variable for the radius of the circle.
    private double radius;

    // Constructor for the Circle class
    public Circle(String name, double radius) {
        super(name); // Call the constructor of the parent Shape class with the name.
        this.radius = radius; //to Set the radius of this circle.
    }

    // Override the abstract area method from Shape.
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2); // πr^2
    }

    // Override the abstract perimeter method from Shape.
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // 2πr
    }

    // Override the toString method to provide a string representation of the Circle.
    @Override
    public String toString() {
        // Include the string representation from Shape and add the radius information.
        return super.toString() + " (radius: " + radius + ")";
    }
}