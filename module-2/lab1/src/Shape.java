// Shape class - the superclass
public class Shape {
    // Step 1: Declare private variables for name and color
    private String name;
    private String color;
    
    // Step 2: Create a constructor that takes name and color as parameters
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    // Step 3: Create getter methods for the attributes
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    
    // Step 4: Create a method called area() that will be overridden by subclasses
    public double area() { 
        return 0.0; // Return 0.0 in the superclass version
    }
    
    // Step 5: Create a method called perimeter() that will be overridden by subclasses
    public double perimeter() {
        return 0.0; // Return 0.0 in the superclass version
    }
    
    // Step 6: Create a toString() method that returns information about the shape
    @Override
    public String toString() {
        return "shape: " + name + ", color: " + color;
    }

    public void displayDetails() {
        this.toString();
    }
}