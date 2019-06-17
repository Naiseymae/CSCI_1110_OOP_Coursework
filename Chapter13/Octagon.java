package exercise_13_11;

/* 
 * Author: Renee Linford
 * Date: 6-14-19
 * OOP Exercise 13-11: The Octagon Class
 * 
 * -------------------------------
 * 			Octagon
 * -------------------------------
 * -side1: double
 * -side2: double
 * -side3: double
 * -side4: double
 * -side5: double
 * -side6: double
 * -side7: double
 * -side8: double
 * -------------------------------
 * +Octagon()
 * +Octagon(sideLength: double)
 * +compareTo(): int
 * +getArea(): double
 * +getPerimeter(): double
 * +getSide1: double
 * +getSide2: double
 * +getSide3: double
 * +getSide4: double
 * +getSide5: double
 * +getSide6: double
 * +getSide7: double
 * +getSide8: double
 * +setSide1: void
 * +setSide2: void
 * +setSide3: void
 * +setSide4: void
 * +setSide5: void
 * +setSide6: void
 * +setSide7: void
 * +setSide8: void
 * -------------------------------
 */

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	// Creates a regular octagon GeometricObject that is comparable and cloneable.

	
	// Declare variables with default length of 1.0.
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double side4 = 1.0;
	private double side5 = 1.0;
	private double side6 = 1.0;
	private double side7 = 1.0;
	private double side8 = 1.0;
	
	
	// Default constructor.
	public Octagon() {
		super();
	}
	
	
	// Constructor with input for lengths of 4 sides.
	public Octagon(double sideLength) {
		super();
		this.side1 = sideLength;
		this.side2 = sideLength;
		this.side3 = sideLength;
		this.side4 = sideLength;
		this.side5 = sideLength;
		this.side6 = sideLength;
		this.side7 = sideLength;
		this.side8 = sideLength;
	}
	
	
	// Implement the clone method.
	public Object clone() {
		try {
			// Shallow octagon copy.
			Octagon octagonClone = (Octagon)super.clone();
			// Deep copy of dateCreated.
			octagonClone.dateCreated = (java.util.Date)(dateCreated.clone());
			return octagonClone;
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	

	@Override
	// Implement the compareTo method defined in Comparable.
	public int compareTo(Octagon o) {
		if (side1 > ((Octagon) o).getSide1())
			return 1;
		else if (side1 < ((Octagon) o).getSide1())
			return -1;
		else
			return 0;
	}
	
	
	@Override
	// Compute area of octagon.
	public double getArea() {
		double area = (2 + (4 / Math.sqrt(2))) * side1 * side1;
		return area;
	}

	
	@Override
	// Compute perimeter of octagon.
	public double getPerimeter() {
		double perimeter = side1 * 8;
		return perimeter;
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
	
	public double getSide5() {
		return side5;
	}

	public double getSide6() {
		return side6;
	}

	public double getSide7() {
		return side7;
	}
	
	public double getSide8() {
		return side8;
	}


	// Public set methods.
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side1 = side2;
	}

	public void setSide3(double side3) {
		this.side1 = side3;
	}
	
	public void setSide4(double side4) {
		this.side1 = side4;
	}
	
	public void setSide5(double side5) {
		this.side1 = side5;
	}

	public void setSide6(double side6) {
		this.side1 = side6;
	}

	public void setSide7(double side7) {
		this.side1 = side7;
	}
	
	public void setSide8(double side8) {
		this.side1 = side8;
	}

	
}
