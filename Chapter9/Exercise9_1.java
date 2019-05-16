package exercise_9_1;


/* 
 * Author: Renee Linford
 * Date: 5-13-19
 * OOP Exercise 9-1: Rectangle class
 * 
 */


public class Exercise9_1 {

	
	public static void main(String[] args) {
	// Implement Rectangle class for two separate rectangles.	
		
		// Create rectangle A with width = 4 and height = 40
		Rectangle rectangleA = new Rectangle(4, 40);
		
		
		// Create rectangle B with width = 3.5 and height = 35.9
		Rectangle rectangleB = new Rectangle(3.5, 35.9);
		
		
		// Display width, height, area, and perimeter of rectangle A
		System.out.println("Rectangle A:");
		System.out.println("\tWidth: 4");
		System.out.println("\tHeight: 40");
		System.out.printf("\tArea: %.2f", rectangleA.getArea());
		System.out.println();
		System.out.printf("\tPerimeter: %.2f", + rectangleA.getPerimeter());
		System.out.println();
		
		
		// Display width, height, area, and perimeter of rectangle B
		System.out.println();
		System.out.println("Rectangle B:");
		System.out.println("\tWidth: 3.5");
		System.out.println("\tHeight: 35.9");
		System.out.printf("\tArea: %.2f", rectangleB.getArea());
		System.out.println();
		System.out.printf("\tPerimeter: %.2f", + rectangleB.getPerimeter());
		System.out.println();
	}

}
