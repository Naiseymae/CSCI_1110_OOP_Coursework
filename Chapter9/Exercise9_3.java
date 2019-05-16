
/* 
 * Author: Renee Linford
 * Date: 5-13-19
 * OOP Exercise 9-3: Use the Date Class
 * 
 */


import java.util.Date;


public class Exercise9_3 {

	
	public static void main(String[] args) {
	// Implement Date class: set the elapsed time, display that date and time as String.
		
		
		// Declare date object.
		Date date = new Date();
		
		
		// Define elapsed time.
		long elapsedTime = 10000L;
		
		
		// Loop increases milliseconds x10 (10000, 100000, 1000000, etc.) & prints each new date.
		for (int i = 0; i < 8; i++) {
			date.setTime(elapsedTime); // Set new elapsed time to date.
			System.out.println("The set time is " + date.toString() + ".");
			elapsedTime = elapsedTime * 10; // Increase elapsed time by 10x.
			
		}

	}

}
