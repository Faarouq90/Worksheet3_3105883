//Asaju Faarouq 3105883
// This is an abstract class representing a generic shape.

public abstract class Shape {
    private String name; // Name of the shape

    // to Construct a shape with a given name.

    public Shape(String name) {
        this.name = name;
    }

    //To get and return name of shape
    public String getName() {
        return name;
    }

   //To set name of the shape
    public void setName(String name) {
        this.name = name;
    }


     // Abstract method to calculate the area and  return The area of the shape.

    public abstract double area();


     // Abstract method to calculate and return The perimeter of the shape.

    public abstract double perimeter();


    //Overrides the toString method to return the name of the shape.

    @Override
    public String toString() {
        return name;
    }
}
