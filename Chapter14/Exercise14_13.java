
/* 
 * Author: Renee Linford
 * Date: 6-20-19
 * OOP Exercise 14-13: Display a pie chart
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.control.Label;

public class Exercise14_13 extends Application {

	@Override 
	// Override the start method in the Application class.
	
	public void start(Stage primaryStage) {
		// Create a pie chart, color pie sections, & display text percentages.
		
		// Create pane.
		Pane pane = new Pane();
		
		
		// Create arcs for pie chart.
		double centerX = 300 / 2;
		double centerY = 300 / 2;
		double radius = Math.min(300, 300) * 0.4;
		
		
		// Define arc perimeters.
		Arc project = new Arc(centerX, centerY, radius, radius, -288, -72);
		project.setFill(Color.RED);
		project.setType(ArcType.ROUND);
		
		Arc quiz = new Arc(centerX, centerY, radius, radius, -252, -36);
		quiz.setFill(Color.BLUE);
		quiz.setType(ArcType.ROUND);
		
		Arc midterm = new Arc(centerX, centerY, radius, radius, -144, -108);
		midterm.setFill(Color.GREEN);
		midterm.setType(ArcType.ROUND);
		
		Arc finalTest = new Arc(centerX, centerY, radius, radius, 0, -144);
		finalTest.setFill(Color.YELLOW);
		finalTest.setType(ArcType.ROUND);


		// Add arcs to pane.
		pane.getChildren().addAll(project, quiz, midterm, finalTest);
		
		
		// Create label for each pie section.
		Text projectText = new Text(170, 120, "Project -- 20%");
		projectText.setFont(Font.font("Courier", 15));
		Text quizText = new Text(115, 20, "Quiz -- 10%");
		quizText.setFont(Font.font("Courier", 15));
		Text midtermText = new Text(20, 150, "Midterm -- 30%");
		midtermText.setFont(Font.font("Courier", 15));
		Text finalText = new Text(130, 220, "Final -- 40%");
		finalText.setFont(Font.font("Courier", 15));
		
		
		// Add labels to pane.
		pane.getChildren().addAll(projectText, quizText, midtermText, finalText);
		
		
		// Create a scene and place arcs in the stage.
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("PieChart"); // Set the stage title.
		primaryStage.setScene(scene); // Place the scene in the stage.
		primaryStage.show(); // Display the stage.
		
	}

	// Launch args in main.
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
