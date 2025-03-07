//Circle.java

// Declaring a class named Circle that inherits properties and methods of Shape
class Circle extends Shape {
    private double radius;

    // Creating a Constructor that initializes a Circle object
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Method to calculate area of a Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference) of a Circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
