// Circle class - a subclass of Shape
public class Circle extends Shape {
    // Step 1: Declare private variable for radius
    private double radius;
    
    // Step 2: Create a constructor that takes name, color, and radius as parameters
    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }
    
    // Step 3: Create getter method for radius
    public double getRadius() {
        return radius;
    }
    
    // Step 4: Override the area() method to calculate the area of a circle
    @Override
    public double area() {
        // Area of a circle = π * radius * radius (use Math.PI)
        return Math.PI * radius * radius;
    }
    
    // Step 5: Override the perimeter() method to calculate the perimeter (circumference) of a circle
    @Override
    public double perimeter() {
        // Perimeter of a circle = 2 * π * radius (use Math.PI)
        return 2 * Math.PI * radius;
    }
    
    // Step 6: Override toString() method to include circle-specific information
    @Override
    public String toString() {
        return super.toString() + ", shape type: Circle, radius: " + radius;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nCircle Details:");
        System.out.println(toString());
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}