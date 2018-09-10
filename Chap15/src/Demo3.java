import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Demo3 extends Application {
	Car car = new Car();
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
		Line path = new Line();
		path.setStartX(0);
		path.setStartY(115);
		path.setEndX(1000);
		path.setEndY(115);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(3000));
		pt.setNode(car);
		pt.setPath(path);
		pt.play();
		
		
		
		
		pane.getChildren().addAll(path,car);
		car.setLayoutY(100);
		stage.setScene(new Scene(pane));
		stage.show();
	}

}
