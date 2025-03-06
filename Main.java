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
                    // Prompting the user to enter the radius
                    System.out.print("Enter radius: ");
                    Circle circle = new Circle(scanner.nextDouble());
                    System.out.println("Area: " + circle.calculateArea());
                    System.out.println("Perimeter: " + circle.calculatePerimeter());
                    break;
            }
        }
    }
}
