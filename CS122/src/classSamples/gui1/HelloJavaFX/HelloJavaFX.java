package classSamples.gui1.HelloJavaFX;

//************************************************************************
//	HelloJavaFX.java       Author: Lewis/Loftus
//	
//	Demonstrates a basic JavaFX application.
//	
//	API - Application Program Interface
//	GUI - Graphic User Interface
//************************************************************************

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
	
	// --------------------------------------------------------------------
	// Creates and displays two Text objects in a JavaFX window.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Text hello = new Text(50, 50, "Hello, JavaFX!");
		Text question = new Text(120, 80, "How's it going?");
		
		//Add shapes
		Line x = new Line(10, 10, 20, 20);
		Rectangle r = new Rectangle (30, 50, 200, 70);
		Circle c = new Circle(100, 150, 40);
		Ellipse e = new Ellipse(100, 50, 80, 30); //distance of radius to x and radius to y

		Group root = new Group(hello, question);
		Scene scene = new Scene(root, 300, 120, Color.LIGHTGREEN);

		primaryStage.setTitle("A JavaFX Program");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// --------------------------------------------------------------------
	// Launches the JavaFX application. This method is not required
	// in IDEs that launch JavaFX applications automatically.
	// --------------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}