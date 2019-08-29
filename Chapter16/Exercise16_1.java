package exercise_16_1;

/* 
 * Author: Renee Linford
 * Date: 8-22-19
 * OOP Exercise 16-1: Use Radio Buttons
 */

import javafx.application.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.control.Button;

public class Exercise16_1 extends Application {

	protected BorderPane getPane() { 
		// Method for creating a pane with text and left/right buttons. 

		Text txt1 = new Text(50, 50, "Programming is fun!");
		txt1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));

		// Pane for Left/Right Buttons 
		HBox paneForButtons = new HBox(20);
		Button btLeft = new Button("<="); // Left button
		Button btRight = new Button("=>"); // Right button
		paneForButtons.getChildren().addAll(btLeft, btRight); // Add buttons to pane
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color: black");

		BorderPane pane = new BorderPane(); // Create a border pane
		pane.setBottom(paneForButtons); // Add buttons to the bottom

		Pane paneForText = new Pane();
		paneForText.getChildren().add(txt1); // Add text to pane
		pane.setCenter(paneForText);

		// Add action handlers (using lambda expressions)
		btLeft.setOnAction(e -> txt1.setX(txt1.getX() - 10));
		btRight.setOnAction(e -> txt1.setX(txt1.getX() + 10));

		// Pane for Radio Buttons
		HBox paneForRadioButtons = new HBox(20); 
		paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5)); 
		paneForRadioButtons.setStyle("-fx-border-color: black");
		RadioButton rbRed = new RadioButton("Red"); 
		RadioButton rbYellow = new RadioButton("Yellow"); 
		RadioButton rbBlack = new RadioButton("Black");
		RadioButton rbOrange = new RadioButton("Orange");
		RadioButton rbGreen = new RadioButton("Green");
		paneForRadioButtons.getChildren().addAll( // Add buttons to radio pane
				rbRed, rbYellow, rbBlack, rbOrange, rbGreen); 
		pane.setTop(paneForRadioButtons); // Add radio pane to border pane

		// Add ToggleGroup to group Radio Buttons
		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbBlack.setToggleGroup(group);
		rbOrange.setToggleGroup(group);
		rbGreen.setToggleGroup(group);

		// Add handlers for Radio Buttons
		rbRed.setOnAction(e -> { 
			if (rbRed.isSelected()) { // Red Text Color
				txt1.setFill(Color.RED);
			}
		});

		rbYellow.setOnAction(e -> { 
			if (rbYellow.isSelected()) { // Yellow Text Color
				txt1.setFill(Color.YELLOW);
			}
		});

		rbBlack.setOnAction(e -> { 
			if (rbBlack.isSelected()) { // Black Text Color
				txt1.setFill(Color.BLACK);
			}
		});

		rbOrange.setOnAction(e -> { 
			if (rbOrange.isSelected()) { // Orange Text Color
				txt1.setFill(Color.ORANGE);
			}
		});

		rbGreen.setOnAction(e -> { 
			if (rbGreen.isSelected()) { // Green Text Color
				txt1.setFill(Color.GREEN);
			}
		});

		return pane;  // Return a pane

	}


	@Override // Override the start method in the Application Class.
	public void start(Stage primaryStage) {

		// Create a scene and place it in the stage.
		Scene scene = new Scene(getPane(), 450, 200); // Set pane to scene
		primaryStage.setTitle("Exercise 16-1"); // Set stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage.
	}


}