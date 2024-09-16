/*
 *+-------------------------------------------+
 *|                  MyDate                   |
 *+-------------------------------------------+
 *| - day: int                                |
 *| - month: int                              |
 *| - year: int                               |
 *+-------------------------------------------+
 *| + MyDate()                                |
 *| + MyDate(year: int, month: int, day: int) |
 *| + MyDate(elapsedTime: long)               |
 *| + getYear(): int                          |
 *| + getMonth(): int                         |
 *| + getDay(): int                           |
 *| + setYear(): int                          |
 *| + setMonth(): int                         |
 *| + setDay(): int                           |
 *| + setDate(elapsedTime: long): void        |
 *| + toString(): string                      |
 *+-------------------------------------------+
*/

import java.util.*;

public class MyDate {
	GregorianCalendar gregorianCalendar = new GregorianCalendar();
	private int day;
	private int month;
	private int year;
	
	
	// No-arg constructor
	public MyDate() {
        this(System.currentTimeMillis());
    }
    
    // Constructor that constructs an object with the specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Constructor that constructs an object with the specified elapsed time
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    
    
    
    //Accessor Methods
   
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    
    
    
    //Mutator Methods
    
    public int setYear(int year) {
    	this.year = year;
        return year;
    }

    public int SetMonth(int month) {
    	this.month = month;
        return month;
    }

    public int SetDay(int day) {
    	this.day = day;
        return day;
    }
    
    public void setDate(long elapsedTime) {
    	 gregorianCalendar.setTimeInMillis(elapsedTime);
         this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
         this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
         this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    
    // To String
    public String toString() {
    	return "Month: " + month + " Day: " + day + " Year: " + year;
    }
    
}
