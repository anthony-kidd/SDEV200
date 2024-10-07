/*
 * Author: Anthony Kidd
 * Date of Last Revision: 10/07/24
 * Description: Define a custom exception called BinaryFormatException. 
 * Implement the bin2Dec method to throw a BinaryFormatException 
 * if the string is not a binary string.
 */


import java.util.Scanner;

 //Main method
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         // Prompt user to enter three sides of the triangle
        System.out.print("Enter the three sides of the triangle: ");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();

         // Prompt user to enter color of the triangle
        System.out.print("Enter the color of the triangle: ");
        String color = in.next();

         // Prompt user to enter whether the triangle is filled
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = in.nextBoolean();

         // Create Triangle object
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

         // Display the triangle properties
        System.out.println("\nTriangle Information:");
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Is Filled: " + triangle.isFilled());
        
         // Close the scanner
        in.close();
    }
}
