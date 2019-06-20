package exercise_14_15;

/* 
 * Author: Renee Linford
 * Date: 6-19-19
 * OOP Exercise 14-15: Display a STOP sign
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.shape.Polygon;


public class Exercise14_15 extends Application {

	@Override 
	// Override the start method in the Application class.

	public void start(Stage primaryStage) {

		// Create new pane
		StackPane pane = new StackPane();
		//pane.setpadding(new Insets(10, 10, 10, 10));

		
		// Create octagon object
		Polygon octagon = new Polygon();
		octagon.setFill(Color.RED);
		octagon.setStroke(Color.BLACK);
		ObservableList<Double> list = octagon.getPoints();

		
		// Add points to octagon
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		
		
		// Loop for adding points to ObsrvableList.
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));	
		}	
		
		
		// Rotate octagon
		octagon.setRotate(22.5);

		
		// Add to pane	
		pane.getChildren().add(octagon); 


		// Stop sign text
		Text stop = new Text(20, 20, "STOP");
		stop.setFont(Font.font("Courier", 45));
		stop.setFill(Color.WHITE);
		
		
		// Add to pane
		pane.getChildren().add(stop); 


		// Create scene & place it in stage.
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		primaryStage.setTitle("Show stopSign"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}

	// Launch args in main.
	public static void main(String[] args) {
		Application.launch(args);
	}
}