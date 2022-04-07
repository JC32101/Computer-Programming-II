package classlab.week12;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//************************************************************************
//  FontDemo.java       Author: Lewis/Loftus
//
//  Demonstrates the creation and use of fonts.
//************************************************************************

public class Font extends Application {
	// --------------------------------------------------------------------
	// Displays three Text objects using various font styles.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Font font1 = new Font("Courier", 36);
		Font font2 = Font.font("Times", FontWeight.BOLD, FontPosture.ITALIC, 28);
		Font font3 = Font.font("Arial", FontPosture.ITALIC, 14);
		
		Font[] fonts = {font1, font2, font3};
		
		Text text1 = new Text(30, 55, "Dream Big");
		text1.setFont(font1);
		text1.setUnderline(true);

		Text text2 = new Text(150, 110, "Know thyself!");
		text2.setFont(font2);
		text2.setFill(Color.GREEN);

		Text text3 = new Text(50, 150,
				"In theory, there is no difference " + "between theory\nand practice, but in practice there is.");
		text3.setFont(font3);
		
		Text[] texts = {text1, text2, text3};
		
		Button button = new Button("Change Font");
		button.setOnAction(value ->{
			Font f = randomizeFont(fonts);
			int textIDX = randomizeNum(3);
			texts[textIDX].setFont(f);
		});

		Group root = new Group(text1, text2, text3);
		Scene scene = new Scene(root, 400, 200, Color.LIGHTCYAN);

		primaryStage.setTitle("Font Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public Font randomizeFont(Font[] fonts) {
		Random rand = new Random();
		int idx = rand.nextInt(3);
		return fonts[idx];
	}
	
	public int randomizeNum(int num) {
		Random rand = new Random();
		int idx = rand.nextInt(num);
		return idx;
	}

	public static void main(String[] args) {
		launch(args);
	}
}