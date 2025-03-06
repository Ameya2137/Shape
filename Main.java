// Name: Ameya Tipnis
// PRN: 23070126012
// Batch: 2023-27 (A1)

// Main.java

// Importing Scanner for User Input
import java.util.Scanner;

// Defining a public class named Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object for taking user-input
        int choice; // Declaring an integer variable to store user input

        // Using do-while for making a menu-driven program
        do {
            // Prompting the uer to enter a number between 0-6
            System.out.println("\nChoose a Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid (Square Base)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Reads the prompted number from user and stores it in choice

            // Switch statement selects a case based on user's input
            switch (choice) {
                case 1:
                    // Prompting the user to enter the radius for a Circle
                    System.out.print("Enter radius: ");
                    Circle circle = new Circle(scanner.nextDouble());
                    System.out.println("Area: " + circle.calculateArea());
                    System.out.println("Perimeter: " + circle.calculatePerimeter());
                    break;
                case 2:
                    // Prompting the user to enter the length for a Rectangle
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    // Prompting the user to enter the width for a Rectangle
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area: " + rectangle.calculateArea());
                    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                    break;
                case 3:
                    // Prompting the user to enter the length for a Square
                    System.out.print("Enter side length: ");
                    Square square = new Square(scanner.nextDouble());
                    System.out.println("Area: " + square.calculateArea());
                    System.out.println("Perimeter: " + square.calculatePerimeter());
                    break;
                case 4:
                    // Prompting the user to enter the radius for a Sphere
                    System.out.print("Enter radius: ");
                    Sphere sphere = new Sphere(scanner.nextDouble());
                    System.out.println("Surface Area: " + sphere.calculateArea());
                    System.out.println("Volume: " + sphere.calculateVolume());
                    break;
                case 5:
                    // Prompting the user to enter the radius for a Cylinder
                    System.out.print("Enter radius: ");
                    double r = scanner.nextDouble();
                    // Prompting the user to enter the height for a Cylinder
                    System.out.print("Enter height: ");
                    double h = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(r, h);
                    System.out.println("Surface Area: " + cylinder.calculateArea());
                    System.out.println("Volume: " + cylinder.calculateVolume());
                    break;
                case 6:
                    // Prompting the user to enter the base side for a EquilateralPyramid (Square Base)
                    System.out.print("Enter base side: ");
                    double b = scanner.nextDouble();
                    // Prompting the user to enter the height for a EquilateralPyramid (Square Base)
                    System.out.print("Enter height: ");
                    double pyHeight = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(b, pyHeight);
                    System.out.println("Surface Area: " + pyramid.calculateArea());
                    System.out.println("Volume: " + pyramid.calculateVolume());
                    break;
                case 0:
                    // Ends loop and prints and exit message
                    System.out.println("Exiting...");
                    break;
                default:
                    // If the user enters a number other than 0-6, following error message is returned
                    System.out.println("Invalid choice!");
            }
        }
    }
}
