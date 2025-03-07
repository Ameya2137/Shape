//Circle.java

// Declaring a class named Circle that inheritants properties and methods of Shape
class Circle extends Shape {
    private double radius;

    // Creating a Constructor that initializes a Circle object
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
}
