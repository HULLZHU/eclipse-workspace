import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MyJavaFX extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button buttonOK = new Button("OK");
		Scene scene = new Scene(buttonOK,200,250);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}	
}
