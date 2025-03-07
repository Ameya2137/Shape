//Rectangle.java

// Declaring a class named Rectangle that inheritants properties and methods of Shape
class Rectangle extends Shape {
    private double length, width;

    // Creating a Constructor that initializes a Rectangle object
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
