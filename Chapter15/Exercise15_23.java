package exercise_15_23;

/* 
 * Author: Renee Linford
 * Date: 8-20-19
 * OOP Exercise 15-23: Auto Resize Stop Sign
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


public class Exercise15_23 extends Application {

	private double width = 200, height = 200;
	private Polygon octagon = new Polygon();
	private ObservableList<Double> list = octagon.getPoints();


	@Override 
	// Override the start method in the Application class.

	public void start(Stage primaryStage) {

		// Create new pane
		StackPane pane = new StackPane();

		// Set octagon properties
		octagon.setFill(Color.RED);
		octagon.setStroke(Color.BLACK);

		// Draw new octagon when window is resized.
		drawOctagon();

		// Stop sign text
		Text stop = new Text(20, 20, "STOP");
		stop.setFont(Font.font("Courier", 45));
		stop.setFill(Color.WHITE);

		// Add to pane	
		pane.getChildren().add(octagon);  
		pane.getChildren().add(stop); 

		// Create scene & place it in stage.
		Scene scene = new Scene(pane, width, height);
		primaryStage.setTitle("Show Stop Sign with Resizing"); // Set title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		// Create listeners and set a new width/height for the clock when pane is resized.
		scene.widthProperty().addListener(ov -> {
			width = scene.getWidth();
			drawOctagon();
		});

		scene.heightProperty().addListener(ov -> {
			height = scene.getHeight();
			drawOctagon();
		});

	}


	public void drawOctagon() {
		// Method to redraw octagon when scene is resized.

		// Remove previous octagon
		list.clear();

		// Add points to octagon
		double centerX = width / 2, centerY = height / 2;
		double radius = Math.min(width, height) * 0.4;

		// Loop for adding points to ObservableList.
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));	
		}	

		// Rotate octagon
		octagon.setRotate(22.5);

	}


	// Launch args in main.
	public static void main(String[] args) {
		Application.launch(args);
	}

}