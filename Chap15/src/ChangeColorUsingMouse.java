
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeColorUsingMouse extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Circle circle = new Circle();
		circle.setRadius(20);
		pane.getChildren().add(circle);
		
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setOnMouseReleased(e ->{
			circle.setFill(Color.GREEN);
		});
		
		circle.setOnMousePressed(e ->{
			circle.setFill(Color.BLACK);
		});
		
		Scene scene = new Scene (pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
