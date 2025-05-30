import java.util.Scanner;

// ShapeDemo class to demonstrate polymorphism with Shapes
public class ShapeDemo {
    public static void main(String[] args) {
        // Step 1: Create an array of Shape objects with size 5
        Shape[] shapes = new Shape[5];

        // Step 2: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int shapeCount = 0;
        boolean exit = false;

        // Step 3: Create an interactive menu to add shapes to the array
        // Hint: Use a loop and a counter to keep track of how many shapes are added
        while (!exit) {
            // Display menu options
            System.out.println("\n===== Shape Management System =====");
            System.out.println("1. Add a Circle");
            System.out.println("2. Add a Rectangle");
            System.out.println("3. Add a Triangle");
            System.out.println("4. Display all shapes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1: // Add a Circle
                    if (shapeCount < shapes.length) {
                        // Step 4: Prompt for Circle attributes (name, color, radius)
                        System.out.print("Enter circle name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter circle color: ");
                        String color = scanner.nextLine();

                        System.out.print("Enter circle radius: ");
                        double radius = scanner.nextDouble();
                        scanner.nextLine();

                        // Create the Circle and add to array
                        shapes[shapeCount] = new Circle(name, color, radius);
                        System.out.println("Circle added successfully!");

                        // Step 5: After adding a shape, display its details
                        shapes[shapeCount].displayDetails();
                        shapeCount++;

                    } else
                        System.out.println("Cannot add more shapes. Array is full!");

                    break;

                case 2: // Add a Rectangle
                    if (shapeCount < shapes.length) {
                        // Step 4: Prompt for Rectangle attributes (name, color, length, width)
                        System.out.print("Enter rectangle name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter rectangle color: ");
                        String color = scanner.nextLine();

                        System.out.print("Enter rectangle length: ");
                        double length = scanner.nextDouble();

                        System.out.print("Enter rectangle width: ");
                        double width = scanner.nextDouble();
                        scanner.nextLine();

                        // Create the Rectangle and add to array
                        shapes[shapeCount] = new Rectangle(name, color, length, width);
                        System.out.println("Rectangle added successfully!");

                        // Step 5: After adding a shape, display its details
                        shapes[shapeCount].displayDetails();
                        shapeCount++;
                    } else
                        System.out.println("Cannot add more shapes. Array is full!");

                    break;

                case 3: // Add a Triangle
                    if (shapeCount < shapes.length) {
                        // Step 4: Prompt for Triangle attributes
                        System.out.print("Enter triangle name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter triangle color: ");
                        String color = scanner.nextLine();

                        System.out.print("Enter length of side 1: ");
                        double side1 = scanner.nextDouble();

                        System.out.print("Enter length of side 2: ");
                        double side2 = scanner.nextDouble();

                        System.out.print("Enter length of side 3: ");
                        double side3 = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline

                        // Create the Triangle and add to array
                        shapes[shapeCount] = new Triangle(name, color, side1, side2, side3);
                        System.out.println("Triangle added successfully!");

                        // Step 5: After adding a shape, display its details
                        shapes[shapeCount].displayDetails();
                        shapeCount++;
                    } else
                        System.out.println("Cannot add more shapes. Array is full!");

                    break;
                case 4: // Display all shapes
                    // Step 6: Display all shapes in the array
                    if (shapeCount > 0) {
                        System.out.println("\n===== All Shapes =====");
                        for (int i = 0; i < shapeCount; i++) {
                            System.out.println("\nShape " + (i + 1) + ":");
                            shapes[i].displayDetails();
                            System.out.println("------------------------");
                        }
                    } else
                        System.out.println("No shapes to display. Please add some shapes first.");

                    break;

                case 5: // Exit
                    exit = true;
                    System.out.println("Thank you for using the Shape Management System. Goodbye!");
                    scanner.close();
                    break;
                default:
                    break;
            }
        }
    }
}