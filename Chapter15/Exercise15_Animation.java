package exercise_15_Animation;

/* 
 * Author: Renee Linford
 * Date: 8-21-19
 * OOP Exercise 15-Animation: Rectangle on a Pentagon
 */

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import javafx.util.Duration;

public class Exercise15_Animation extends Application {
	@Override // Override the start method in the Application class.

	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();

		// Create a rectangle
		Rectangle rectangle = new Rectangle (0, 0, 25, 50);
		rectangle.setFill(Color.ORANGE);

		// Create an octagon
		Polygon octagon = new Polygon();
		octagon.setFill(Color.WHITE);
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

		// Add circle and octagon to the pane.
		pane.getChildren().add(octagon);
		pane.getChildren().add(rectangle);

		// Create a path transition.
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000)); // Set duration
		pt.setPath(octagon); // Set path in transition.
		pt.setNode(rectangle); // Set node in transition.
		pt.setOrientation( // Set orientation.
				PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE); // Continuing animation
		pt.setAutoReverse(true); // Animation will not reverse in alternating cycle.
		pt.play(); // Start animation

		// Apply a fade transistion to rectangle.
		FadeTransition ft =
				new FadeTransition(Duration.millis(4000), rectangle);
		ft.setFromValue(1.0); // Set start opaque value.
		ft.setToValue(0.1); // Set end opaque value.
		ft.setCycleCount(Timeline.INDEFINITE); // Set cycle count
		ft.setAutoReverse(true); // Set auto reverse
		ft.play(); // Start animation

		// Control animation depending on mouse button pressed.
		octagon.setOnMousePressed(e -> {
			if (e.getButton() == MouseButton.PRIMARY) { // Right click = resume animation
				pt.play();
				ft.play();
			}
			if (e.getButton() == MouseButton.SECONDARY) { // Left click = pause animation
				pt.pause();
				ft.pause();
			}
		});	

		// Create a scene and place it in the stage.
		Scene scene = new Scene(pane, 250, 200);
		// Set the stage title.
		primaryStage.setTitle("Rectangle Transition on Octagon with Fade Transition"); 
		primaryStage.setScene(scene); // Place the scene in the stage.
		primaryStage.show(); // Display the stage.

	}
}
