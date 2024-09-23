/*
 * Program Name: BigInteger
 * Author: Anthony Kidd
 * Date of last revision: 09/20/24
 * Purpose: To adapt the code from listing 13.13 to use BigInteger for the numerator and denominator.
 */
import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Prompt for the first rational number
        System.out.print("Enter the first rational number (numerator): ");
        BigInteger numerator1 = scanner.nextBigInteger();
        System.out.print("Enter the first rational number (denominator): ");
        BigInteger denominator1 = scanner.nextBigInteger();
        Rational rational1 = new Rational(numerator1, denominator1);

        // Prompt for the second rational number
        System.out.print("Enter the second rational number (numerator): ");
        BigInteger numerator2 = scanner.nextBigInteger();
        System.out.print("Enter the second rational number (denominator): ");
        BigInteger denominator2 = scanner.nextBigInteger();
        Rational rational2 = new Rational(numerator2, denominator2);

        // Perform operations
        Rational sum = rational1.add(rational2);
        Rational difference = rational1.subtract(rational2);
        Rational product = rational1.multiply(rational2);
        Rational quotient = rational1.divide(rational2);

        // Display results
        System.out.println(rational1 + " + " + rational2 + " = " + sum);
        System.out.println(rational1 + " - " + rational2 + " = " + difference);
        System.out.println(rational1 + " * " + rational2 + " = " + product);
        System.out.println(rational1 + " / " + rational2 + " = " + quotient);
        System.out.println(rational2 + " is " + rational2.doubleValue());
	}
}
