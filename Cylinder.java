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
}
