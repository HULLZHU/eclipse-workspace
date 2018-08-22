import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MultiStageDemo extends Application {

	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new Button("OK"),200,200);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage newStage = new Stage();
		newStage.setTitle("Second Stage");
		newStage.setScene(new Scene( new Button("Hello"),100,200));
		newStage.show();
		
		primaryStage.setResizable(false);
		newStage.setResizable(false);
		}
	
	public static void main(String [] args) {
		launch(args);
	}

}
