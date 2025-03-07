// Sphere.java

// Declaring a class named Sphere that inheritants properties and methods of Shape
class Sphere extends Shape implements Volume {
    private double radius;

    // Creating a Constructor that initializes a Sphere object
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }
}
