package exercise_14_28;

/* 
 * Author: Renee Linford
 * Date: 6-20-19
 * OOP Exercise 14-28: Random Time
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Exercise14_28 extends Application {
	
	@Override 
	// Override the start method in the Application class
	public void start(Stage primaryStage) { 

		// Create a clock and a label
		ClockPane clock = new ClockPane();
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);

		
		// Place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		
		
		// Display only hour and minute hands.
		clock.setHourHandVisible(true);
		clock.setMinuteHandVisible(true);
		clock.setSecondHandVisible(false);

		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("DisplayClock"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
	
	// Launch args in main.
	public static void main(String[] args) {
		Application.launch(args);
	}

	
}
