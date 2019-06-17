package exercise_13_11;

/* 
 * Author: Renee Linford
 * Date: 6-14-19
 * OOP Exercise 13-11: The Octagon Class
 * 
 * -------------------------------
 * 		Geometric Object
 * -------------------------------
 * -color: String
 * -filled: boolean
 * -dateCreated: Date
 * -------------------------------
 * #GeometricObject()
 * #GeometricObject(color: string, filled: boolean)
 * +getColor(): String
 * +setColor: void
 * +isFilled(): boolean
 * +setFilled: void
 * +toString: String
 * +getDateCreated: Date
 * +[i]getArea(): double[/i]
 * +[i]getPerimeter(): double[/i]
 * -------------------------------
 */

public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  protected java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}