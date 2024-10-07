
/*
 *----------------------------------------
 *|              Triangle                |
 *----------------------------------------
 *| - side1: double                      |
 *| - side2: double                      |
 *| - side3: double                      |
 *----------------------------------------
 *| + Triangle()                         |
 *| + Triangle(side1: double,            |
 *|     side2: double, side3: double)    |
 *| + getSide1(): double                 |
 *| + getSide2(): double                 |
 *| + getSide3(): double                 |
 *| + getArea(): double                  |
 *| + getPerimeter(): double             |
 *| + toString(): String                 |
 *----------------------------------------
 */

public class Triangle extends GeometricObject {
	
    private double side1;
    private double side2;
    private double side3;

     // Default constructor
    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

     // Constructor with specified side1, side2, and side3
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

     // Accessor methods for side1, side2, and side3
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

     // Method to calculate the area of the triangle using Heron's formula
    @Override
    public double getArea() {
        double s = getPerimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

     // Method to calculate the perimeter of the triangle
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

     // Override toString method to return the description of the triangle
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}

