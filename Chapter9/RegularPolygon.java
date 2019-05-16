import java.util.Date;

/* 
 * Author: Renee Linford
 * Date: 5-16-19
 * OOP Exercise 9-9: RegularPolygon Class
 * 
 * -------------------------------
 * 		Regular Polygon
 * -------------------------------
 * -n:int
 * -side:double
 * -x:double
 * -y:double
 * -------------------------------
 * +RegularPolygon()
 * +getPerimeter():double
 * +getArea():double
 * +getN:int
 * +getSide:double
 * +getX:double
 * +getY:double
 * +setN:void
 * +setSide:void
 * +setX:void
 * +setY:void
 * -------------------------------
 */


public class RegularPolygon {
	// RegularPolygon class creates object with n sides, side length and x- & y-coordinates.

	// Declare data fields
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;


	// Set no-arg constructor.
	public RegularPolygon() {
	}

	// Set constructor with specified number of sides & length of sides.
	public RegularPolygon(int numberOfSides, double lengthOfSides) {
		this.n = numberOfSides;
		this.side = lengthOfSides;
	}	

	// Set constructor with specified number of sides & length of sides and x- & y-coordinates.
	public RegularPolygon(int numberOfSides, double lengthOfSides, double xCoordinate, double yCoordinate) {
		this.n = numberOfSides;
		this.side = lengthOfSides;
		this.x = xCoordinate;
		this.y = yCoordinate;
	}


	// Method getPerimeter() that returns the perimeter of the polygon.
	public double getPerimeter() {
		// P = length of sides * number of sides
		double perimeter = (this.side * this.n); 
		return perimeter;
	}


	// Method getArea() that returns the area of the polygon. 
	public double getArea() {
		// A = (n * side^2)/(4 * tan(PI/n))
		double area = (this.n * (this.side * this.side)) / (4 * Math.tan(Math.PI / this.n)); 
		return area;
	}


	// Accessor methods for RegularPolygon class.
	public double getN() {
		return this.n;
	}

	public double getSide() {
		return this.side;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}


	// Mutator methods for RegularPolygon class.
	public void setN(int newN) {
		this.n = newN;
	}

	public void setSide(double newSide) {
		this.side = newSide;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public void setY(double newY) {
		this.y = newY;
	}

}
