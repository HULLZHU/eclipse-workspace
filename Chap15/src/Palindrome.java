import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Palindrome extends Application{
	private Circle circle =new Circle();
	private Arc path = new Arc();
	private Pane pane = new Pane();
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//get Nodes
		pane.getChildren().add(path);
		pane.getChildren().add(circle);
		//set path
		path.setCenterX(200);
		path.setCenterY(200);
		path.setRadiusX(70);
		path.setRadiusY(30);
		path.setLength(-180);
		path.setFill(Color.WHITE);
		path.setStroke(Color.BLACK);
		path.setType(ArcType.OPEN);
		//set circle style
		circle.setFill(Color.YELLOW);
		circle.setStroke(Color.BLACK);
		circle.setRadius(10);
		circle.setCenterX(path.getCenterX()-path.getRadiusX());
		circle.setCenterY(path.getCenterY());
		//set path
		PathTransition pt = new PathTransition();
		pt.setPath(path);
		pt.setNode(circle);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.setRate(1);
		pane.setOnMouseClicked(e ->{
			if ( pt.getStatus()== Animation.Status.PAUSED || pt.getStatus()==Animation.Status.STOPPED)
				pt.play();
			else
				pt.pause();
		});
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
