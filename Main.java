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
            System.out.println("\nChoose a Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid (Square Base)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Reads a number 0-6 from user and stores it in choice
        }
    }
}
