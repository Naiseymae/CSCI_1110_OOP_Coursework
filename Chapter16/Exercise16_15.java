
/* 
 * Author: Renee Linford
 * Date: 8-26-19
 * OOP Exercise 16-15: Demonstrate Label Properties
 */

import javafx.application.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.collections.*;
import java.awt.*;

public class Exercise16_15 extends Application {

	// Create grapes label with text and graphic.	
	public Label grapesLabel = new Label("Grapes", new ImageView(new Image("grapes.gif")));


	protected Pane getPane() { 
		// Method for creating a pane ComboBox and Image with user input TextGap.

		// Create main borderpane 
		BorderPane pane = new BorderPane();
		pane.setCenter(grapesLabel);
		grapesLabel.setContentDisplay(ContentDisplay.TOP);

		// Create HBox for combo box and text field.
		HBox topPane = new HBox(10);

		// Create textfield for user input.	
		TextField textField = new TextField("5");
		textField.setPrefColumnCount(3); // Set preferred number of columns in textfield.
		textField.setEditable(true); // User can edit textfield.

		// Create combo box for contentDisplay gif location.
		ComboBox<String> cbo = new ComboBox<>(); // contentDisplay options
		cbo.getItems().addAll("TOP", "BOTTOM", "LEFT", "RIGHT");
		cbo.setValue("TOP");
		cbo.setPrefWidth(100);

		// Add comboBox, textField, and labels to topPane.
		Text contentDisplay = new Text("contentDisplay"); 
		Text graphicTextGap = new Text("graphicTextGap"); 
		topPane.getChildren().addAll(contentDisplay, cbo, graphicTextGap, textField);

		// Add text and image to main pane.
		pane.setTop(topPane);

		// Action handlers for combo box and text field.
		cbo.setOnAction(e -> setDisplay(cbo.getValue(), textField.getText()));
		textField.setOnAction(e -> setDisplay(cbo.getValue(), textField.getText()));

		return pane;  // Return a pane
	}


	@Override // Override the start method in the Application Class.
	public void start(Stage primaryStage) {

		// Set initial display.
		setDisplay("TOP", "5");

		// Create a scene and place it in the stage.
		Scene scene = new Scene(getPane(), 600, 400); // Set pane to scene.
		primaryStage.setTitle("Exercise 16-15"); // Set stage title.
		primaryStage.setScene(scene); // Place the scene in the stage.
		primaryStage.show(); // Display the stage.

	}

	// Set display for grapes image and text gap.
	public void setDisplay(String gifLocation, String textGap) {
		System.out.println(gifLocation);

		// Switch to set location of gif.
		switch (gifLocation) {
		case "TOP":
			grapesLabel.setContentDisplay(ContentDisplay.TOP); break;
		case "LEFT":
			grapesLabel.setContentDisplay(ContentDisplay.LEFT); break;
		case "RIGHT":
			grapesLabel.setContentDisplay(ContentDisplay.RIGHT); break;
		case "BOTTOM":
			grapesLabel.setContentDisplay(ContentDisplay.BOTTOM); break;
		}

		// Set text gap between image and text.
		grapesLabel.setGraphicTextGap(Double.parseDouble(textGap));

	}
}
