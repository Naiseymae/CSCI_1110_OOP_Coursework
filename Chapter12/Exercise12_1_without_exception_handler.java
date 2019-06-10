package exercise_12_1;

/* 
 * Author: Renee Linford
 * Date: 6-5-19
 * OOP Exercise 12-1: NumberFormatException - calculator without exception handler.
 */

import java.util.Scanner;

public class Exercise12_1_without_exception_handler {

	/** Main method */
	public static void main(String[] args) {
		// Calculator with exception handling in program.
		
		// Prompt user for input.
		System.out.println("Enter simple calculation (i.e. 4 + 5): ");
		Scanner input = new Scanner(System.in);
		String value1 = input.next();
		String operator = input.next();
		String value2 = input.next();
		
		
		// Check operator character of calculation.
		if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
			System.out.println(
					"Usage: java Calculator input operator not valid");
			System.exit(0);
		}
		
		
		// Check input values of calculation.
		if (!((Character.isDigit((char)value1.charAt(0))))) {
			System.out.println(
					"Usage: java Calculator input value not integer");
			System.exit(1);
		}

		if (!((Character.isDigit((char)value2.charAt(0))))) {
			System.out.println(
					"Usage: java Calculator input value not integer");
			System.exit(1);
		}
		
		
		// The result of the operation
		int result = 0;
		
		
		
		// Determine the operator
		switch (operator.charAt(0)) {
		case '+': result = Integer.parseInt(value1) +
				Integer.parseInt(value2);
		break;
		case '-': result = Integer.parseInt(value1) -
				Integer.parseInt(value2);
		break;
		case '*': result = Integer.parseInt(value1) *
				Integer.parseInt(value2);
		break;
		case '/': result = Integer.parseInt(value1) /
				Integer.parseInt(value2);
		}
		// Display result
		System.out.println(value1 + ' ' + operator + ' ' + value2
				+ " = " + result);
	}

}
