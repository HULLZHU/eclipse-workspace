import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
public class NodeStyleRotateDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Button okButton = new Button("OK");
		okButton.setRotate(-45);
		okButton.setStyle("-fx-border-color:blue;");
		pane.getChildren().add(okButton);
		
		pane.setRotate(45);
		pane.setStyle("-fx-border-color:red); -fx-background-color: lightgray;");
		
		Scene scene = new Scene(pane,100,100);
		primaryStage.setTitle("NodeStyleRotateDemo.");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String args) {
		launch(args);
	}
	

}
