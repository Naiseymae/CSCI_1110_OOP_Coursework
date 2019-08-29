
/* 
 * Author: Renee Linford
 * Date: 8-28-19
 * OOP Exercise 16-21: Count-down stopwatch with music
 */

import javafx.application.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.media.*;
import javafx.scene.input.*;
import javafx.scene.paint.*;
import javafx.collections.*;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Exercise16-21 extends Application {
	// Create TextField and video duration of 1 second for each number.

	// Create main pane .
	protected BorderPane pane = new BorderPane();			

	// Create editable TextField.
	protected TextField text = new TextField();

	// Create an animation for the countdown.
	protected Timeline animation = new Timeline(
			// Create keyframe.
			new KeyFrame(Duration.millis(1000), e-> { // Handler for TimeLine.
				String s = text.getText(); // Convert text to string.
				text.setText(countdown(s)); // Call countdown method after new text "second" is set.
			})); 

	// Import media: anthem url
	protected static final String MEDIA_URL = 
			"https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
	protected Media media = new Media(MEDIA_URL);
	protected MediaPlayer mediaPlayer = new MediaPlayer(media);
	protected MediaView mediaView = new MediaView(mediaPlayer);		


	protected Pane getPane() { 
		// Method for creating a stopwatch pane that countsdown to music playing.

		// Set preferences for TextField.
		text.setPrefColumnCount(10); // Set preferred number of columns in textfield.
		text.setEditable(true); // User can edit TextField.
		text.setAlignment(Pos.CENTER);
		text.setFont(Font.font(150));
		pane.setCenter(text);	// Set textfield to center of main pane.			

		// Set animation cycle count.				
		animation.setCycleCount(Timeline.INDEFINITE); 

		// Handler/listener for user pressing Enter key.
		text.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				// If enter key pressed, convert text entered to string seconds.
				animation.play(); // Start animation.
			}
		});

		return pane;  // Return the main border pane
	}


	@Override // Override the start method in the Application Class.
	public void start(Stage primaryStage) {

		// Create a scene and place it in the stage.
		Scene scene = new Scene(getPane(), 500, 300); // Set pane to scene.
		primaryStage.setTitle("Exercise 16-21"); // Set stage title.
		primaryStage.setScene(scene); // Place the scene in the stage.
		primaryStage.show(); // Display the stage.

	}


	protected String countdown(String s) {
		// Method to countdown seconds. Returns new second string.

		int second = (Integer.parseInt(s)); // Convert string to int.

		if (second == 0) {
			// Play anthem. 
			mediaPlayer.play();
		}
		else { // Continue countdown by removing a second.
			second--;
		}

		String newSecond = Integer.toString(second); // Convert second int back to string.
		// System.out.print(newSecond);
		return newSecond; // String returned.
	}

}

