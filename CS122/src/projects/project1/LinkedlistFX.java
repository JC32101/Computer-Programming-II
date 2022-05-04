package projects.project1;

import projects.project1.Linkedlist;
import java.util.Optional;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LinkedlistFX extends Application {
	private Linkedlist list;
	private String str = "";
	
	public void start(Stage primaryStage) {	
		list = new Linkedlist();	
		
		Text text = new Text("");
		text.setText("null");
		text.setLayoutX(100.0);
		text.setLayoutY(100.0);
		
		Button addBTN = new Button("ADD");
		addBTN.setOnAction(value ->{
			inputText(list);
			text.setText(str);
		});
		addBTN.setLayoutX(100.0);
		addBTN.setLayoutY(10.0);
		
		Button removeBTN = new Button("REMOVE");
		removeBTN.setOnAction(value ->{
			list.remove();
			str = list.print();
			text.setText(str);
		});
		removeBTN.setLayoutX(250.0);
		removeBTN.setLayoutY(10.0);
		
		Button clearBTN = new Button("CLEAR");
		clearBTN.setOnAction(value ->{
			list.clear();
			str = list.print();
			text.setText(str);
		});
		clearBTN.setLayoutX(400.0);
		clearBTN.setLayoutY(10.0);

		Group root = new Group(addBTN, removeBTN, clearBTN, text);
		Scene scene = new Scene(root, 600, 400, Color.BEIGE);

		primaryStage.setTitle("LinkedList");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void inputText(Linkedlist list) {
		TextInputDialog textInput = new TextInputDialog();
		textInput.setTitle("ADD");
		textInput.getDialogPane().setContentText("Enter String or Integer: ");
		
		Optional<String> result = textInput.showAndWait();
		TextField input = textInput.getEditor();
		
		if(input.getText() != null)
			list.add(input.getText());
		str = list.print();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
