// Sphere.java

// Declaring a class named Sphere that inherits properties and methods of Shape
class Sphere extends Shape implements Volume {
    private double radius;

    // Creating a Constructor that initializes a Sphere object
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Method to calculate area of a Sphere
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Method to calculate perimeter of a Sphere
    public double calculatePerimeter() {
        return 0; // No perimeter for a sphere
    }

    // Method to calculate volume of a Sphere
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
