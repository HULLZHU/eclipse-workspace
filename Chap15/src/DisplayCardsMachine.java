import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DisplayCardsMachine extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		CardMachine machine = new CardMachine();
		
		Scene scene = new Scene(machine);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
