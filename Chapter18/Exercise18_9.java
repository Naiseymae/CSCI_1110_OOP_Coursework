package exercise_18_9;

/* 
 * Author: Renee Linford
 * Date: 9-11-19
 * OOP Exercise 18-9: Print the characters in a string reversely using recursive method.
 */

import java.util.*;

public class Exercise18_9 {

	public static void main(String[] args) {
		/* Main method calls reverseDisplay method. */
		
		// Prompt user for string input.
		Scanner input = new Scanner(System.in);
		System.out.print("Type a message to reverse: ");
		String message = input.nextLine();
		
		// Print string written in reverse.
		reverseDisplay(message);

	}
	

	public static void reverseDisplay(String message) {
		/* Helper method for reverseDisplay method. */
		
		// Method now allows StringBuilder as parameter.
		StringBuilder string = new StringBuilder(message.substring(0));
		
		reverseDisplay(string); // Recursive call
		
	}
	
	
	public static void reverseDisplay(StringBuilder message) {
		/* Method to print string in reverse.*/
		
		if (message.length() == 1) { // Base case.
			// Print last character in string.
			System.out.print(message.charAt(0));
		}
		
		if (message.length() > 1) {
			// If message length greater than 1, print last character in string.
			System.out.print(message.charAt(message.length() -1));
			
			// Create new string with remaining characters.
			StringBuilder string = new StringBuilder(message.substring(0, message.length() - 1));
			
			// Call recursion method with new StringBuilder.
			reverseDisplay(string);
		}
		
	}
	 
}
