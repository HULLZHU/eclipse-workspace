import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlageRisingAnimation extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		ImageView imageView = new ImageView("file:image/us.gif");
		pane.getChildren().add(imageView);
		PathTransition pt = new PathTransition();
		pt.setNode(imageView);
		pt.setPath(new Line(0,0,1000,1000));
		pt.setCycleCount(5);
		pt.setDuration(Duration.millis(10000));
		pt.play();
		pt.setAutoReverse(true);
		pt.setOrientation(OrientationType.NONE);
		
		Scene scene = new Scene (pane,1000,1000);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
