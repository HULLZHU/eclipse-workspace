import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class TestClock extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ClockPane pane = new ClockPane(9,27,0);
		pane = pane.setSize(1000,1000);
		Scene scene = new Scene(pane);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}