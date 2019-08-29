
/* 
 * Author: Renee Linford
 * Date: 8-29-19
 * OOP Exercise 16-27: Display country flag and flag description
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import java.util.Scanner;
import java.io.File;


public class Exercise16_27 extends Application {

	// Declare an array of Strings for flag titles
	private String[] flagTitles = {"Canada", "China", "Denmark", 
			"France", "Germany", "India", "Norway", "United Kingdom",
	"United States of America"};

	// Declare an ImageView array for the national flags of 9 countries
	private ImageView[] flagImage = {new ImageView("image/ca.gif"),
			new ImageView("image/china.gif"), 
			new ImageView("image/denmark.gif"), 
			new ImageView("image/fr.gif"), 
			new ImageView("image/germany.gif"),
			new ImageView("image/india.gif"), 
			new ImageView("image/norway.gif"),
			new ImageView("image/uk.gif"), 
			new ImageView("image/us.gif")};

	// Declare an array of strings for flag descriptions
	private String[] flagDescription = new String[9];

	// Declare and create a description pane
	private DescriptionPane descriptionPane = new DescriptionPane();

	// Create a combo box for selecting countries
	private ComboBox<String> cbo = new ComboBox<>(); // flagTitles

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {

		// Read in text from file as string, then assign string to textfield.
		// Repeat for each country.

		// Import Java Scanner.
		Scanner input = new Scanner(new File("description0.txt"));

		// Canada
		String string0 = input.nextLine();
		TextField text0 = new TextField("");
		text0.setText(string0);

		// China
		input = new Scanner (new File("description1.txt"));	
		String string1 = input.nextLine();
		TextField text1 = new TextField("");
		text1.setText(string1);

		// Denmark
		input = new Scanner(new File("description2.txt"));
		String string2 = input.nextLine();
		TextField text2 = new TextField("");
		text2.setText(string2);

		// France
		input = new Scanner(new File("description3.txt"));
		String string3 = input.nextLine();
		TextField text3 = new TextField("");
		text3.setText(string3);

		// Germany
		input = new Scanner(new File("description4.txt"));
		String string4 = input.nextLine();
		TextField text4 = new TextField("");
		text4.setText(string4);

		// India
		input = new Scanner(new File("description5.txt"));
		String string5 = input.nextLine();
		TextField text5 = new TextField("");
		text5.setText(string5);

		// Norway
		input = new Scanner(new File("description6.txt"));
		String string6 = input.nextLine();
		TextField text6 = new TextField("");
		text6.setText(string6);

		// United Kingdom
		input = new Scanner(new File("description7.txt"));	
		String string7 = input.nextLine();
		TextField text7 = new TextField("");
		text7.setText(string7);

		// United States
		input = new Scanner(new File("description8.txt"));
		String string8 = input.nextLine();
		TextField text8 = new TextField("");
		text8.setText(string8);		

		// Set text description for flagDescriptions.
		flagDescription[0] = string0; 
		flagDescription[1] = string1;
		flagDescription[2] = string2;
		flagDescription[3] = string3;
		flagDescription[4] = string4;
		flagDescription[5] = string5;
		flagDescription[6] = string6;
		flagDescription[7] = string7;
		flagDescription[8] = string8;

		// Set the first country (Canada) for display
		setDisplay(0);

		// Add combo box and description pane to the border pane
		BorderPane pane = new BorderPane();

		BorderPane paneForComboBox = new BorderPane();
		paneForComboBox.setLeft(new Label("Select a country: "));
		paneForComboBox.setCenter(cbo);
		pane.setTop(paneForComboBox);
		cbo.setPrefWidth(400);
		cbo.setValue("Canada");

		ObservableList<String> items = 
				FXCollections.observableArrayList(flagTitles);
		cbo.getItems().addAll(items); 
		pane.setCenter(descriptionPane);

		// Display the selected country
		cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 450, 170);
		primaryStage.setTitle("ComboBoxDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}


	/** Set display information on the description pane */
	public void setDisplay(int index) {
		descriptionPane.setTitle(flagTitles[index]);
		descriptionPane.setImageView(flagImage[index]);
		descriptionPane.setDescription(flagDescription[index]);
	}


	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
