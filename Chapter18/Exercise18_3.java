package exercise_18_3;

/* 
 * Author: Renee Linford
 * Date: 9-10-19
 * OOP Exercise 18-3: Compute greatest common divisor using recursion.
 */

import java.util.*;

public class Exercise18_3 {

	public static void main(String[] args) {
		// Find GCD of two integers input by user. 
		
		// Prompt user for input.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers separated by a space: ");
		int m = input.nextInt();
		int n = input.nextInt();
		
		// Call findGCD method.
		System.out.println(
				"Greatest common divisor of " + m + " and " + n + " is " + findGCD(m,n) + ".");
	}
	
	/* Method for finding Greatest Common Divisor. */
	public static int findGCD(int m, int n) {
		
		if (m%n == 0) { // if remainder is 0, GCD is n.
			return n;
		}
		else {
			return findGCD(n, m%n); // if remainder is not 0, call recursive method.
		}
		
	}

}
