// Cylinder.java

// Declaring a class named Cylinder that inherits properties and methods of Shape
class Cylinder extends Shape implements Volume {
    private double radius, height;

    // Creating a Constructor that initializes a Cylinder object
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate area of a Cylinder
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate perimeter of a Cylinder
    public double calculatePerimeter() {
        return 0; // No perimeter for a cylinder
    }

    // Method to calculate volume of a Cylinder
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
