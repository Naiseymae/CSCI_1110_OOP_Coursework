
/* 
 * Author: Renee Linford
 * Date: 6-14-19
 * OOP Exercise 13-11: The Octagon Class
 */

public class Exercise13_11 {

	public static void main(String[] args) {
		// Program creates an Octagon object.

		
		// Create octagon.
		Octagon octagon1 = new Octagon(10);
		
		
		// Clone octagon1 to make octagon2.
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		
		// Display both octagons.
		System.out.printf("Area of octagon1 = %.2f", octagon1.getArea());
		System.out.println();
		System.out.printf("Area of octagon2 = %.2f", octagon2.getArea());
		System.out.println();
		

		// Invoke compareTo method
		System.out.print("Comparing octagon1 to octagon2: ");
		if (octagon1.compareTo(octagon2) == 0) 
			System.out.println("objects are equal.");
		else 	
			System.out.println("objects are not equal.");
		
	
		
	}

}
