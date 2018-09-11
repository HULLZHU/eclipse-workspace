import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SetTranslateDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Line line = new Line ( 40,40,40,80);
		Circle circle = new Circle(line.getStartX(),line.getStartY(),3);
		line.setRotate(90);
		pane.getChildren().add(line);
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
