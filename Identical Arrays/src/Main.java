/*
 * Program Name: Identical Arrays
 * Author: Anthony Kidd
 * Date of Last Revision: 09/08/2024
 * Purpose: To test if two arrays are identical or not. 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Add elements to m1
        int[][] m1 = new int[3][3];
        System.out.println("Enter elements for list 1 :");
        fillMatrix(m1, input);

        // Add elements to m2
        int[][] m2 = new int[3][3];
        System.out.println("Enter elements for list 2 :");
        fillMatrix(m2, input);

        // Output results (matching or not) 
        if (equals(m1, m2)) {
            System.out.println("The arrays match.");
        } else {
            System.out.println("The arrays do not match.");
        }
        input.close();
    }

    // Method for adding elements to matrix 
    private static void fillMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    // Evaluate if the two matrices are the same
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}