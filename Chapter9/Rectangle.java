package exercise_9_1;


/* 
 * Author: Renee Linford
 * Date: 5-13-19
 * OOP Exercise 9-1: Rectangle class
 * 
 * -----------------------
 * 		Rectangle
 * -----------------------
 * width: double
 * height: double
 * -----------------------
 * +Rectangle()
 * +Rectangle(newWidth: double, newHeight: double)
 * +getArea(): double
 * +getPerimenter(): double
 * -----------------------
 * 
 */


public class Rectangle {
// This class contains methods to return the area or perimeter of a rectangle.
	
	// The width and height of the rectangle.
	double width = 1;
	double height = 1;
	
	
	// Default construct of a rectangle object.
	public Rectangle() {
	}
	
	
	// Construct of a rectangle object.
	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	
	// Return the area of a rectangle.
	public double getArea( ) {
		return (width * height);
	}
	
	
	// Return the perimeter of a rectangle.
	public double getPerimeter() {
		return (2 * (width + height));
	}
	
	
}
