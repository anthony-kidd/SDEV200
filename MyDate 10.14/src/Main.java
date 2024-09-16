/*
 * Program Name: My Date 
 * Author: Anthony Kidd
 * Date of last revision: 09/13/24
 * Purpose: To define a MyDate class that represents a date and provides constructors 
 * and methods to initialize and manipulate dates based on either the current time, 
 * elapsed time since January 1, 1970, or specified year, month, and day, and to 
 * demonstrate its functionality with example dates.
 */
public class Main {
	 public static void main(String[] args) {
	        // Test the MyDate class
	        MyDate date1 = new MyDate();
	        System.out.println("Today's Date: " + date1.getMonth() + "-" + date1.getDay() + "-" + date1.getYear());

	        MyDate date2 = new MyDate(34355555133101L);
	        System.out.println("Elapsed Time Date: " + date2.getMonth() + "-" + date2.getDay() + "-" + date2.getYear());
	    }
	}