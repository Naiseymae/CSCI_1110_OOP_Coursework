package exercise_14_1;

/* 
 * Author: Renee Linford
 * Date: 6-19-19
 * OOP Exercise 14-1: Display 4 images
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exercise14_1 extends Application {

		@Override 
		// Override the start method in the Application class.
		
		public void start(Stage primaryStage) throws Exception {
			
			//Create pane to hold the image views.
			Pane pane = new FlowPane();
			pane.setPadding(new Insets (10, 10, 10, 10));
			
			
			//Place nodes in the pane.
			pane.getChildren().add(new ImageView("rose_blue.jpeg"));
			pane.getChildren().add(new ImageView("neptune.jpg"));
			pane.getChildren().add(new ImageView("purple_jellies.jpg"));
			pane.getChildren().add(new ImageView("water_lily.jpg"));
			
			
			//Create scene & place it in the stage.
			Scene scene1 = new Scene(pane, 1000, 1000);
			primaryStage.setTitle("ShowImage"); // Set title.
			primaryStage.setScene(scene1); // Place scene in stage.
			primaryStage.show(); // Display the stage.
	
	}
	
	public static void main(String[] args) {
		// Program displays 4 images in a grid plane.
		
		Application.launch(args);
		
		
		

	}

}

