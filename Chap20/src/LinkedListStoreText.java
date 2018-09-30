import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class LinkedListStoreText extends Application {
	BorderPane scrollPane = new BorderPane();
	ScrollBar sbHorizontal = new ScrollBar();
	ScrollBar sbVertical = new ScrollBar();
	TextField tfNumber = new TextField();
	TextArea txArea = new TextArea();
	Label lbEnter = new Label("Enter a number",tfNumber);
	HBox hbox = new HBox(10);
	Button btSort = new Button("Sort");
	Button btShuffle = new Button("Shuffle");
	Button btReverse = new Button("Reverse");
	LinkedList<Integer> list = new LinkedList<Integer>();

	@Override
	public void start(Stage primaryStage) throws Exception {
		//set scrollPane
		sbHorizontal.setOrientation(Orientation.HORIZONTAL);
		sbVertical.setOrientation(Orientation.VERTICAL);
		lbEnter.setContentDisplay(ContentDisplay.RIGHT);
		scrollPane.setRight(sbVertical);
		scrollPane.setBottom(sbHorizontal);
		scrollPane.setCenter(txArea);
		scrollPane.setTop(lbEnter);
		//set HBox
		hbox.getChildren().addAll(btSort,btShuffle,btReverse);
		tfNumber.setPrefColumnCount(60);
		hbox.setAlignment(Pos.CENTER);
		//set Main Pane
		BorderPane pane = new BorderPane();
		pane.setCenter(scrollPane);
		pane.setBottom(hbox);
		
		
		
		//set buttons
		btSort.setOnAction(e ->{
			list = transferNumbersToList();
			Collections.sort(list);
			txArea.clear();
			String str = "";
			while ( !list.isEmpty()) {
				str = str +" " + list.pop();
			}
			
			txArea.setText(str);
		});
		
		btShuffle.setOnAction(e->{
			list =transferNumbersToList();
			Collections.shuffle(list);
			txArea.clear();
			String str = "";
			while ( !list.isEmpty()) {
				str = str +" " + list.pop();
			}
			
			txArea.setText(str);
		});
		
		btReverse.setOnAction(e->{
			list = transferNumbersToList();
			Collections.reverse(list);
			txArea.clear();
			String str = "";
			while ( !list.isEmpty()) {
				str = str +" " + list.pop();
			}
			
			txArea.setText(str);
		});
		
		
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}


	private LinkedList<Integer> transferNumbersToList() {
		String str = tfNumber.getText();
		String numbers[] = str.split(" ");
		LinkedList<Integer> list = new LinkedList<>();
		try {
		for ( int i = 0 ; i < numbers.length ; i++) {
			System.out.println(numbers[i]);
			list.push(Integer.parseInt(numbers[i]));
		}
		}
		catch (Exception ex) {
			System.out.println("Please enter valid integers");
		}
		return list;
	}

}
