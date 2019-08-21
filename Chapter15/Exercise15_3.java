
/* 
 * Author: Renee Linford
 * Date: 8-20-19
 * OOP Exercise 15-3: Move the Ball
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


public class Exercise15_3 extends Application {
	
	private CirclePane circlePane = new CirclePane();
	
	@Override // Override the start method in the Application class.
	public void start(Stage primaryStage) {
		
		// Hold four buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		hBox.getChildren().add(btLeft);
		hBox.getChildren().add(btRight);
		hBox.getChildren().add(btUp);
		hBox.getChildren().add(btDown);
		
		// Create and register the listeners.
		btLeft.setOnAction(new LeftHandler());
		btRight.setOnAction(new RightHandler());
		btUp.setOnAction(new UpHandler());
		btDown.setOnAction(new DownHandler());
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		borderPane.setAlignment(hBox, Pos.CENTER);
		
		// Create a scene and place it in the stage.
		Scene scene = new Scene(borderPane, 400, 300);
		primaryStage.setTitle("MoveCircle"); // Set the stage title.
		primaryStage.setScene(scene); // Place the scene in the stage.
		primaryStage.show(); // Display the stage.
		
	}
	
	
	// Create Handler classes.
	
	class LeftHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method.
		public void handle(ActionEvent e) {
			circlePane.moveLeft();
		}
	}
	
	class RightHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method.
		public void handle(ActionEvent e) {
			circlePane.moveRight();
		}
	}
	
	class UpHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method.
		public void handle(ActionEvent e) {
			circlePane.moveUp();
		}
	}
	
	class DownHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method.
		public void handle(ActionEvent e) {
			circlePane.moveDown();
		}
	}
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

