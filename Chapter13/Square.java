package exercise_13_7;

/* 
 * Author: Renee Linford
 * Date: 6-13-19
 * OOP Exercise 13-7: Colorable Interface
 * 
 * -------------------------------
 * 			Square
 * -------------------------------
 * -side1: double
 * -side2: double
 * -side3: double
 * -side4: double
 * -------------------------------
 * +Square()
 * +Square(side1: double, side2: double, side3: double, side4: double)
 * +getArea(): double
 * +getPerimeter(): double
 * +toString(): String
 * +getSide1: double
 * +getSide2: double
 * +getSide3: double
 * +getSide4: double
 * +setSide1: void
 * +setSide2: void
 * +setSide3: void
 * +setSide4: void
 * -------------------------------
 */

public class Square extends GeometricObject implements Colorable{
	// Square class extends abstract GeometricObject class & implements Colorable interface.


	// Variables for 4 sides of square. Default length is 1.0
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double side4 = 1.0;


	// Default constructor.
	public Square() {
		super();
	}


	// Constructor with input for lengths of 4 sides.
	public Square(double side1, double side2, double side3, double side4) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
	}
	

	@Override
	// Compute area of a square.
	public double getArea() {
		double area = side1 * side2;
		return area;
	}

	@Override
	// Compute perimeter of a square.
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3 + side4;
		return perimeter;
	}

	@Override
	// Public method toString.
	public String toString() {
		return "Square: side 1 = " + side1 + ", side 2 = " + side2 + ", side 3 = " + side3 + ", side 4 = " + side4;
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
	
	public double getSide4() {
		return side4;
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
	
	public void setSide4(double side4) {
		this.side4 = side4;
	}

}
