
/* 
* Author: Renee Linford
* Date: 8-20-19
* OOP Exercise 15-11: Move the Ball with arrow keys
*/


import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;


public class Untitled extends Application {
	
	private CirclePane circlePane = new CirclePane();
	
	@Override // Override the start method in the Application class.
	public void start(Stage primaryStage) {	
		
		// Create a pane and set its properties
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		
		
		// Use lambda expression (for listener and handler) and get the key pressed and move circle depending on key.
		circlePane.setOnKeyPressed(e -> {
			switch (e.getCode()) {
				case UP: circlePane.moveUp(); break;
				case DOWN: circlePane.moveDown(); break;
				case LEFT: circlePane.moveLeft(); break;
				case RIGHT: circlePane.moveRight(); break;
			}
		});
		
		// Create a scene and place it in the stage.
		Scene scene = new Scene(borderPane, 400, 300);
		primaryStage.setTitle("MoveCircleKeys"); // Set the stage title.
		primaryStage.setScene(scene); // Place the scene in the stage.
		primaryStage.show(); // Display the stage.
		
		circlePane.requestFocus(); // Circle is focused to receive key input.
	}
	
	
	// Create CirclePane class
	
	class CirclePane extends Pane {
		private Circle circle = new Circle (200, 150, 50);
		
		public CirclePane() {
			getChildren().add(circle);
			circle.setStroke(Color.BLACK);
			circle.setFill(Color.WHITE);
		}
		
		public void moveLeft() {
			circle.setCenterX(circle.getCenterX() - 10);
		}
				
		public void moveRight() {
			circle.setCenterX(circle.getCenterX() + 10);
		}
				
		public void moveUp() {
			circle.setCenterY(circle.getCenterY() - 10);
		}
		
		public void moveDown() {
			circle.setCenterY(circle.getCenterY() + 10);
		}
	}
}
