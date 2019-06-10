
/* 
 * Author: Renee Linford
 * Date: 6-10-19
 * OOP Exercise 12-3: ArrayIndexOutOfBoundsException
 */

import java.util.Scanner;

public class Exercise12_3 {

	public static void main(String[] args) {
		// Program creates array with 100 randomly chosen integers.
		// User enters index of array & program displays corresponding value.
		
		
		// Create arrayList of 100 random numbers.
		int [] randomArray = new int [100];
		for (int n = 0; n < 99; n++) {
			randomArray[n] = (int)(Math.random() * 101);
		}
		/* Print array - check.
		System.out.println("array:");
		for (int i = 0; i < 100; i++) {
			System.out.println("randomArray[" + i + "] = " + randomArray[i]);
		}
		*/
		
		
		// Prompt user for index.
		System.out.print("Enter an index from 1 - 100: ");
		Scanner input = new Scanner(System.in);
		
		
		// Exception handling:
		try {
			int index = input.nextInt();
			if (index >= 1 || index <= 100) {
				// Print index value.
				System.out.print("\nValue at corresponding index is " + randomArray[index-1] + ".");
			}
		}
		
		catch (Exception ex) {
			System.out.println(ex);
			System.out.println("Error: Out of Bounds");
		}
		

	}

}
