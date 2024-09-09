/*
 * Program Name: Regular Polygons
 * Author: Anthony Kidd
 * Date of Last Revision: 09/08/2024
 * Purpose: Create a class for regular polygons and a main program to test it.
 */
public class Main {

 public static void main(String[] args) {
	 RegularPolygon polygon1 = new RegularPolygon();
	 RegularPolygon polygon2 = new RegularPolygon(6, 4);
	 RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

	 System.out.println("The perimeter of polygon one is " + polygon1.getPerimeter() + " and the "
             + "area of polygon one is " + polygon1.getArea());
	 System.out.println("The perimeter of polygon two is " + polygon2.getPerimeter() + " and the "
             + "area of polygon two is " + polygon2.getArea());
	 System.out.println("The perimeter of polygon three is " + polygon3.getPerimeter() + " and the "
             + "area of polygon three is " + polygon3.getArea());
 	 } 	
}