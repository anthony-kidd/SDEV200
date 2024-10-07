/*
 * Author: Anthony Kidd
 * Date of Last Revision: 10/27/24
 * Description: Define a custom exception called BinaryFormatException. 
 * Implement the bin2Dec method to throw a BinaryFormatException 
 * if the string is not a binary string.
 */
public class Main {
	
 // Main method
public static void main(String[] args) {
		String firstBinaryString = "10100101"; // Valid binary string (output: 165)
		String secondBinaryString = "1234"; // Invalid binary string (throws exception)
        try {
            System.out.println(bin2Dec(firstBinaryString));
            System.out.println(bin2Dec(secondBinaryString));  
        } 
        catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
    }
	

	 // Method to convert binary string to decimal integer
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
    	
         // Check if the string is a binary number with only 0s and 1s.
        for (char ch : binaryString.toCharArray()) {
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException(binaryString+ " Is not a valid binary string.");
            }
        }

         // If valid, convert binary string to decimal integer
        return Integer.parseInt(binaryString, 2);
    }
}