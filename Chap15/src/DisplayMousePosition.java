import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayMousePosition extends Application {
	private Label label = new Label();
	private double x ;
	private double y;
	private Pane pane = new Pane();
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		pane.setOnMouseClicked(e ->{
			pane.getChildren().clear();
			x = e.getX();
			y = e.getY();
			label.setLayoutX(x);
			label.setLayoutY(y);
			showPostion();
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private void showPostion() {
		label.setText("("+x+","+y+")");
		pane.getChildren().add(label);
	}

}
