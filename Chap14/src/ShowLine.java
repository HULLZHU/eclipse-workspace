import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
public class ShowLine extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create a scene for a specific root node with a specific size
		Scene scene = new Scene(new LinePane(),400,400);
		primaryStage.setTitle("ShowLine");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
