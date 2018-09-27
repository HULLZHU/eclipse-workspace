import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DrawOvals extends Application{
	private int radius = 200;
	private StackPane pane = new StackPane();
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		paintCircle(10);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void paintCircle(int order) {
		if ( order > 0) {
			radius = order* 20;
			Circle circle = new Circle(radius);
			pane.getChildren().add(circle);
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
			paintCircle(--order);
		}
	}


}
