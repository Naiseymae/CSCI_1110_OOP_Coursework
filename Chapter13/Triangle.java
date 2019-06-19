
/* 
 * Author: Renee Linford
 * Date: 6-13-19
 * OOP Exercise 13-7: Colorable Interface
 * 
 * -------------------------------
 * 			Triangle
 * -------------------------------
 * -side1: double
 * -side2: double
 * -side3: double
 * -------------------------------
 * +Triangle()
 * +Triangle(side1: double, side2: double, side3: double)
 * +Triangle(side1: double, side2: double, side3: double, color: String, filled: boolean)
 * +getArea(): double
 * +getPerimeter(): double
 * +toString(): String
 * +getSide1: double
 * +getSide2: double
 * +getSide3: double
 * +setSide1: void
 * +setSide2: void
 * +setSide3: void
 * -------------------------------
 */

public class Triangle extends GeometricObject{
	// Triangle class extends abstract GeometricObject class.

	
	// Variables for 3 sides of triangle. Default length is 1.0
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	
	// Set no-arg constructor.
	public Triangle() {
		super();
	}


	// Set constructor with specified length of sides.
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}	


	// Set constructor with specified length of sides, color, and fill.
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}	


	@Override
	public double getArea() {
		// Compute the area of a triangle.
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}


	@Override
	public double getPerimeter() {
		// Compute the perimeter of a triangle.
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	
	@Override	
	// Public method toString.
	public String toString() {
		return "Triangle: side 1 = " + side1 + ", side 2 = " + side2 + ", side 3 = " + side3;
	}


	// Public get methods.
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}


	// Public set methods.
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}


}
