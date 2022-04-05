package classlab.week11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Random;


public class DesignRec extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Random rand = new Random();
		Rectangle rec1 = new Rectangle (rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10);
		Rectangle rec2 = new Rectangle (rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10);
		Rectangle rec3 = new Rectangle (rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10);
		Rectangle rec4 = new Rectangle (rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10);
		Rectangle rec5 = new Rectangle (rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10, rand.nextInt(100-10)+10);
		
		Color[] color = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
		
		int idx = rand.nextInt(4);
		rec1.setFill(color[idx]);
		rec2.setFill(color[idx]);
		rec3.setFill(color[idx]);
		rec4.setFill(color[idx]);
		rec5.setFill(color[idx]);
		
		Rectangle[] rec = {rec1, rec2, rec3, rec4, rec5};
		
		Button button = new Button("Change Color");
		button.setOnAction(value ->{
			Color c = randomize(color);
			rec1.setFill(c);
			rec2.setFill(c);
			rec3.setFill(c);
			rec4.setFill(c);
			rec5.setFill(c);
		});
		
		Group root = new Group(button, rec1, rec2, rec3, rec4, rec5);
		Scene scene = new Scene(root, 600, 600);
		stage.setScene(scene);
		stage.show();
	}
	
	private Color randomize(Color[] color) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int idx = rand.nextInt(4);
		return color[idx];
	}

	public static void main(String[] args) {
		launch(args);
	}
}
