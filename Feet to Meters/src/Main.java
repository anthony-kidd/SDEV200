/* 
 * Name of Program: Feet to Meters Conversion
 * Author: Anthony Kidd
 * Date of Last Revision: 08/24/2024
 * Purpose: To Convert Feet to Meters and 
*/
public class Main {
	 public static void main(String[] args) {
		 double foot = 1; 
		 double meter = 20;
		 System.out.printf("%-15s%-15s%5s%-15s%-15s\n", "Feet", "Meters", "|    ", "Meters", "Feet");
		 System.out.println("----------------------------------------------------------");
		 for (int i = 1; i <= 10; foot++, meter += 5, i++) {
			 System.out.printf("%-15.1f%-15.3f%5s%-15.1f%-15.3f\n", foot, convert.footToMeter(foot), "|    ", meter,convert.meterToFoot(meter));
		    }
	 }	  
}
