import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestConnectionToDB extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {  
		Scene scene = new Scene(new ConnectionToDB());
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
	 
	public static void main(String[]args) {
		launch(args); 
	} 

}
