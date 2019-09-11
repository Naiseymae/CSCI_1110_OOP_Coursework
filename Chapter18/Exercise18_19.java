package exercise_18_19;

/* 
 * Author: Renee Linford
 * Date: 9-11-19
 * OOP Exercise 18-19: Sierpinski Triangle with buttons
 */

import java.util.*;
import java.io.*;
import javafx.application.*;
import javafx.geometry.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class Exercise18_19 extends Application {
	@Override // Override the start method in the Application class.

	public void start(Stage primaryStage) { // Create & set stage.

		// Create new pane for triangles.
		SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane(); 

		// Create buttons.
		Button btIncrease = new Button("+");
		Button btDecrease = new Button("-");

		// Handlers for pressing buttons.
		btIncrease.setOnAction(
				e -> trianglePane.setOrder(trianglePane.increase()));
		btDecrease.setOnAction(
				e -> trianglePane.setOrder(trianglePane.decrease()));

		// Pane to hold label, text field, and buttons.
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(btDecrease, btIncrease);
		hBox.setAlignment(Pos.CENTER);

		// Main pane for trianglePane and hBox.
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(trianglePane);
		borderPane.setBottom(hBox);

		// Create a scene and place it in the stage.
		Scene scene = new Scene(borderPane, 400, 410);
		primaryStage.setTitle("SierpinskiTriangle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		// Listeners for painting new triangles.
		scene.widthProperty().addListener(ov -> trianglePane.paint());
		scene.heightProperty().addListener(ov -> trianglePane.paint());
	}


	/** Pane for displaying triangles */
	static class SierpinskiTrianglePane extends Pane {

		// Order number for Sierpinski Triangle.
		private int order = 0;

		/** Set a new order */
		public void setOrder(int order) {
			this.order = order;
			paint();
		}

		// Add get method for order number.
		public int getOrder() { 
			return this.order;
		}

		// Method increases order by 1.
		public int increase() {
			this.order += 1;
			return this.order;
		}

		// Method decreases order by 1, as long as order is greater than 0.
		public int decrease() {
			if (this.order >= 0) {
				return this.order -= 1;
			}
			else {
				return this.order;
			}
		}

		// Constructor
		SierpinskiTrianglePane() {
		}

		// Method to plot new triangles points in pane.
		protected void paint() {
			// Select three points in proportion to the pane size
			Point2D p1 = new Point2D(getWidth() / 2, 10);
			Point2D p2 = new Point2D(10, getHeight() - 10);
			Point2D p3 = new Point2D(getWidth() - 10, getHeight() - 10);

			this.getChildren().clear(); // Clear the pane before redisplay

			displayTriangles(order, p1, p2, p3); // Paint triangles with given order.
		}

		// Recursive method to display new triangles in pane.
		private void displayTriangles(int order, Point2D p1, 
				Point2D p2, Point2D p3) {
			if (order == 0) {
				// Draw a triangle to connect three points
				Polygon triangle = new Polygon(); // New triangle
				triangle.getPoints().addAll(p1.getX(), p1.getY(), p2.getX(), 
						p2.getY(), p3.getX(), p3.getY()); // Plot points
				triangle.setStroke(Color.BLACK);
				triangle.setFill(Color.WHITE);

				this.getChildren().add(triangle); // Add triangle to pane.
			} 
			else {
				// Get the midpoint on each edge in the triangle
				Point2D p12 = p1.midpoint(p2);
				Point2D p23 = p2.midpoint(p3);
				Point2D p31 = p3.midpoint(p1);

				// Recursively display three triangles
				displayTriangles(order - 1, p1, p12, p31);
				displayTriangles(order - 1, p12, p2, p23);
				displayTriangles(order - 1, p31, p23, p3);
			}
		}
	}
}


