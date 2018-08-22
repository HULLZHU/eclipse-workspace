import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;

public class FourFans extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane pane = new GridPane();
		pane.add(new Fan(), 0, 0);
		pane.add(new Fan(), 0, 1);
		pane.add(new Fan(), 1, 0);
		pane.add(new Fan(), 1, 1);
		
		pane.setHgap(5);
		pane.setVgap(5);
		
		Scene scene = new Scene(pane);
		arg0.setScene(scene);
		arg0.setResizable(false);
		arg0.show();
		
	}

}