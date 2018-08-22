import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {
	@Override
	public void start(Stage primaryStage) {
		//create a pane and set its property 
		GridPane pane = new GridPane();
		//Following code keeps pane in the center though resizing the window
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		//following code makes the grid line visible
		//pane.setGridLinesVisible(true);
		
		//place nodes in the pane
		pane.add(new Label("FirstName: "),0,0);
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("MI:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name"), 0, 2);
		pane.add(new TextField(), 1, 2);
		Button btAdd= new Button("Add Name");
		pane.add(btAdd, 1, 3);
		
		GridPane.setHalignment(btAdd, HPos.LEFT);
		
		//created a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowGridPane");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}