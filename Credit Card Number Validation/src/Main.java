/*
 * Program Name: Credit Card Number Validation
 * Author: Anthony Kidd
 * Date of Last Revision: 09/08/2024
 * Purpose: To validate Credit Card Numbers
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String creditCardNumber = "";

        // Loop to get a valid credit card number
        while (true) {
            System.out.print("Please enter a credit card number to validate: ");
            creditCardNumber = input.nextLine().trim();

            // Check if the input is numeric and within valid length
            if (isNumeric(creditCardNumber) && creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric credit card number between 13 and 16 digits.");
            }
        }

        // Convert the valid credit card number to long
        long cardNumber = Long.parseLong(creditCardNumber);

        // Validate the credit card number
        boolean isValid = isValid(cardNumber);

        // Output result
        if (isValid) {
            System.out.println(creditCardNumber + " is valid.");
        } else {
            System.out.println(creditCardNumber + " is invalid.");
        }

        input.close();
    }

    /** Check if the input string is numeric */
    public static boolean isNumeric(String str) {
        // Use regular expression to check if the string is numeric
        return str.matches("\\d+");
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        // Check if the prefix matches credit card companies
        if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37)) {
            // Calculate the total sum for Luhn's algorithm
            int sumEven = sumOfDoubleEvenPlace(number);
            int sumOdd = sumOfOddPlace(number);
            int total = sumEven + sumOdd;
            // Return true if the total modulo 10 is zero
            return total % 10 == 0;
        } else {
            return false;
        }
    }

    /** Return the sum of doubled even place digits */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = String.valueOf(number);
        // Start from the second last digit and move backward
        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + number / 10;
        }
    }

    /** Return the sum of odd-place digits */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = String.valueOf(number);
        // Start from the last digit and move backward
        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        String numStr = String.valueOf(number);
        return numStr.startsWith(String.valueOf(d));
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        return String.valueOf(d).length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        String numStr = String.valueOf(number);
        return numStr.length() <= k ? number : Long.parseLong(numStr.substring(0, k));
    }
}