/*
 * Program Name: Circle 
 * Author: Anthony Kidd
 * Date of last revision: 09/12/24
 * Purpose: To create objects of the circle class and compare them.
 */
public class Main {
	public static void main(String[] args) {
        Circle circle1 = new Circle(12.34);
        Circle circle2 = new Circle(12.34);
        Circle circle3 = new Circle(75.43);
        Circle circle4 = new Circle(55.55);
        
        circle1.printCircle();
        circle2.printCircle();
        circle3.printCircle();
        circle4.printCircle();

        System.out.println("circle 1 equals circle 2: " + circle1.equals(circle2));
        System.out.println("circle 1 equals circle 4: " + circle1.equals(circle4));
        System.out.println("circle 2 compare to circle 3: " + circle2.compareTo(circle3));
    }
}
