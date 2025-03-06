# Shape

## Description
This Java program is a menu-driven application that calculates the area, perimeter, and volume of various shapes like Circle, Rectangle, Square, Sphere, Cylinder, and Equilateral Pyramid (Square Base). 

## Features
- **Calculate Area & Perimeter**: Uses an **abstract Shape class** with `calculateArea()` and `calculatePerimeter()`.
- **Calculate Volume**: Implements a **Volume interface** with `calculateVolume()` for 3D shapes.

## Project Structure
- **Main.java**: Handles user input and menu operations.
- **Shape.java**: Abstract class defining shape properties and methods.
- **Volume.java**: Interface for volume calculation.
- **Circle.java**: Implements area and perimeter calculations for a circle.
- **Rectangle.java**: Implements area and perimeter calculations for a rectangle.
- **Square.java**: Implements area and perimeter calculations for a square.
- **Sphere.java**: Implements area, volume (no perimeter).
- **Cylinder.java**: Implements area, volume (no perimeter).
- **EquilateralPyramid.java**: Implements area, volume, and perimeter.

## Technologies Used
- **Java**
- **Object-Oriented Programming (OOP)**
- **Abstract Classes & Interfaces**
- **Math Library** (for calculations)

## How to Run
1. Clone the repository: git clone https://github.com/Ameya2137/Shape.git

2. Navigate to the project directory: cd Shape

3. Compile the Java files: javac Main.java

4. Run the program: java Main
