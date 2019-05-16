
/* 
 * Author: Renee Linford
 * Date: 5-16-19
 * OOP Exercise 9-9: Create RegularPolygon objects
 * 
 */

public class Exercise9_9 {

	public static void main(String[] args) {
		// Create 2 objects with RegularPolygon class & display perimeter and area.


		// Create RegularPolygon 1 with 6 sides and side length of 4.
		RegularPolygon polygon1 = new RegularPolygon(6, 4);
		

		// Create RegularPolygon 2 with 10 sides and side length of 4, and x- & y-coordinates of (5.6, 7.8).
		RegularPolygon polygon2 = new RegularPolygon(10, 4, 5.6, 7.8);

		
		// Display polygon1 perimeter and area.
		System.out.printf("Polygon 1: \n\tNumber of sides = %.0f\n", polygon1.getN());
		System.out.printf("\tSide Length = %.0f\n", polygon1.getSide());
		System.out.println("\t(X,Y) = (" + polygon1.getX() + ", " + polygon1.getY() + ")");
		System.out.println("\tPerimeter = " + polygon1.getPerimeter());
		System.out.printf("\tArea = %.2f\n", polygon1.getArea());
		System.out.println();

		// Display polygon2 perimeter and area. 
		System.out.printf("Polygon 2: \n\tNumber of sides = %.0f\n", polygon2.getN());
		System.out.printf("\tSide Length = %.0f\n", polygon2.getSide());
		System.out.println("\t(X,Y) = (" + polygon2.getX() + ", " + polygon2.getY() + ")");
		System.out.println("\tPerimeter = " + polygon2.getPerimeter());
		System.out.printf("\tArea = %.2f\n", polygon2.getArea());
		System.out.println();
		
	}

}
