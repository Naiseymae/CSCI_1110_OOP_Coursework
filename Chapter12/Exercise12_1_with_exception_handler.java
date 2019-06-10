
/* 
 * Author: Renee Linford
 * Date: 6-6-19
 * OOP Exercise 12-1: NumberFormatException - calculator with exception handler.
 */

import java.util.Scanner;

public class Exercise12_1_with_exception_handler {

	/** Main method */
	public static void main(String[] args) {
		// Calculator with exception handling in program.


		// Prompt user for input.
		System.out.println("Enter simple calculation (i.e. 4 + 5): ");
		Scanner input = new Scanner(System.in);
		String value1 = input.next();
		String operator = input.next();
		String value2 = input.next();


		// The result of the operation
		int result = 0;


		// Try & catch for value1.
		try {
			int int1 = Integer.parseInt(value1);
		}

		catch (Exception ex) {
			System.out.println(ex);
		}


		// Try & catch for value2.
		try {
			int int2 = Integer.parseInt(value2);
		}

		catch (Exception ex) {
			System.out.println(ex);
		}


		// Try & catch for operator.
		try {
			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") ) {

				// Perform operation & get result.
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

		catch (Exception ex) {
			System.out.println(ex);
		}
		
		
	}
}


