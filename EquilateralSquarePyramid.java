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
}
