// Square.java

// Declaring a class named Square that inheritants properties and methods of Shape
class Square extends Shape {
    private double side;

    // Creating a Constructor that initializes a Square object
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    // Method to calculate area of a Square
    public double calculateArea() {
        return side * side;
    }

    // Method to calculate perimeter of a Square
    public double calculatePerimeter() {
        return 4 * side;
    }
}
