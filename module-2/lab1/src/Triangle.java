// Triangle class - a subclass of Shape
public class Triangle extends Shape {
    // Step 1: Declare private variables for the three sides
    private double side1, side2, side3;
    
    // Step 2: Create a constructor that takes name, color, and three sides as parameters
    // Hint: Use super() to call the parent constructor and then initialize the sides
    public Triangle(String name, String color, double s1, double s2, double s3) {
        super(name, color);
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    
    // Step 3: Create getter methods for the three sides
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    // Step 4: Override the area() method to calculate the area of a triangle
    @Override
    public double area() {
        // Heron's formula: Area = √(s(s-a)(s-b)(s-c)) where s = (a+b+c)/2
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    // Step 5: Override the perimeter() method to calculate the perimeter of a triangle
    @Override
    public double perimeter() {
        // Perimeter of a triangle = side1 + side2 + side3
        return side1 + side2 + side3;
    }

    // Step 6: Override toString() method to include triangle-specific information
    @Override
    public String toString() {
        return super.toString() + ", shape type: Triangle, a: " + side1 + ", b: " + side2 + ", c: " + side3;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nTriangle Details:");
        System.out.println(toString());
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
