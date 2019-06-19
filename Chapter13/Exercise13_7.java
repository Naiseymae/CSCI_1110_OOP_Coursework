
/* 
 * Author: Renee Linford
 * Date: 6-13-19
 * OOP Exercise 13-7: Colorable Interface
 */

public class Exercise13_7 {

	public static void main(String[] args) {
	// Program creates array of 5 GeometricObjects. 
	// For each object in array, display its area and invoke its howToColor method if its colorable.

		// Create new array.
		GeometricObject [] objectArray = new GeometricObject[5];
		
		
		// Five new objects.
		Triangle triangle1 = new Triangle(3, 5, 7);
		Square square1 = new Square(3, 3, 3, 3);
		Square square2 = new Square(5, 5, 5, 5);
		Square square3 = new Square(7, 7, 7, 7);
		Triangle triangle2 = new Triangle(8, 8, 8);

		
		// Assign objects to array.
		objectArray[0] = triangle1;
		objectArray[1] = square1;
		objectArray[2] = square2;
		objectArray[3] = square3;
		objectArray[4] = triangle2;


		// Loop displays each object in array & if its an instance of Colorable.
		for (int i = 0; i < 5; i++) {
			System.out.printf("Area of object: %.2f", objectArray[i].getArea());
			System.out.println();
			if (objectArray[i] instanceof Colorable) {
				System.out.println ("Object is colorable: " + (Colorable.howToColor()));
			}
			else 
				System.out.println("Object is not colorable.");
			System.out.println();
		}


	}

}
