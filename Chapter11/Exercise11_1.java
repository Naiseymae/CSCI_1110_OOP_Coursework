
/* 
 * Author: Renee Linford
 * Date: 6-3-19
 * OOP Exercise 11-1: Main method (Triangle class)
 */

import java.util.Scanner;

public class Exercise11_1 {

	public static void main(String[] args) {
		// Create triangle objects with Triangle Class.
		Triangle userTriangle = new Triangle();
		
		
		// Prompt user to ender Triangle parameters.
		System.out.print("Enter triangle parameters below, including three numbers, a color, and filled status (i.e., 4, 6, 9, green, true)." +
				"\n\nLength of side 1: "); 
		Scanner input = new Scanner(System.in);
		userTriangle.setSide1(input.nextDouble());
		
		System.out.print("\nLength of side 2: ");
		userTriangle.setSide2(input.nextDouble());
		
		System.out.print("\nLength of side 3: ");
		userTriangle.setSide3(input.nextDouble());
		
		System.out.print("\nColor: ");
		userTriangle.setColor(input.next());
		
		System.out.print("\nIs triangle filled (true/false): ");
		userTriangle.setFilled(input.nextBoolean());
		
		
		// Display area, perimeter, color, and filled status.
		System.out.printf("\nArea of triangle is %.2f", userTriangle.getArea());
		System.out.printf("\nPerimeter of triangle is %.2f", userTriangle.getPerimeter());
		System.out.print("\nColor of triangle is " + userTriangle.getColor() + ".");
		System.out.print("\nTriangle is filled: " + userTriangle.isFilled());
		
	}

}
