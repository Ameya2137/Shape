//EquilateralSquarePyramid.java

// Declaring a class named EquilateralPyramid that inherits properties and methods of Shape
class EquilateralPyramid extends Shape implements Volume {
    private double baseSide, height;

    // Creating a Constructor that initializes a EquilateralPyramid object
    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    // Method to calculate area of a EquilateralPyramid
    public double calculateArea() {
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        return (baseSide * baseSide) + 2 * baseSide * slantHeight;
    }

    // Method to calculate perimeter of a EquilateralPyramid
    public double calculatePerimeter() {
        return 4 * baseSide;
    }

    // Method to calculate volume of a EquilateralPyramid
    public double calculateVolume() {
        return (1.0 / 3.0) * (baseSide * baseSide) * height;
    }
}
