package exercise_13_1;

/* 
 * Author: Renee Linford
 * Date: 6-13-19
 * OOP Exercise 13-1: New Triangle Class
 */

import java.util.Scanner;

public class Exercise13_1 {

	public static void main(String[] args) {
		// Program prompts user for input for a Triangle object.
		
		
		// Declare variables.
		double side1 = 0;
		double side2 = 0;
		double side3 = 0;
		String color = "";
		boolean fillStatus = true; 
		Scanner input = new Scanner(System.in);
		
		
		
		
		
		// User input.
		System.out.println("Enter parameters for a new triangle below.");
		System.out.print("Enter length of side 1: ");
		side1 = input.nextInt();
		
		System.out.print("Enter length of side 2: ");
		side2 = input.nextInt();
		
		System.out.print("Enter length of side 3: ");
		side3 = input.nextInt();
		
		System.out.print("Enter color: ");
		color = input.next();
		
		System.out.print("Is triangle filled (true/false)? ");
		fillStatus = input.nextBoolean();
		System.out.println();
		
		
		// Create Triangle object.
		Triangle triangle1 = new Triangle(side1, side2, side3, color, fillStatus);
				
		
		// Display area, perimeter, color, and filled status.
		System.out.println("New Triangle: ");
		System.out.println("\tArea is " + triangle1.getArea());
		System.out.println("\tPerimeter is " + triangle1.getPerimeter());
		System.out.println("\tColor is " + triangle1.getColor() + ".");
		System.out.println("\tIs it filled? " + triangle1.isFilled());
		

	}

}
