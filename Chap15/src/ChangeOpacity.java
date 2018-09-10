import javafx.animation.Animation.Status;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ChangeOpacity extends Application {
	private Arc path = new Arc();
	private Circle ball = new Circle();
	private Pane pane = new Pane();
	

	public static void main(String[] args) {
		launch(args);	
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(pane,300,300);
		pane.getChildren().add(path);
		pane.getChildren().add(ball);
		
		/*path.setCenterX(200);
		path.setCenterY(200);
		path.setRadiusX(70);
		path.setRadiusY(30);*/
		path.setLength(-180);
		path.centerXProperty().bind(scene.widthProperty().divide(2));
		path.centerYProperty().bind(scene.heightProperty().divide(2));
		path.radiusXProperty().bind(scene.widthProperty().divide(3));
		path.radiusYProperty().bind(scene.heightProperty().divide(5));
		path.setFill(Color.WHITE);
		path.setType(ArcType.OPEN);
		path.setStroke(Color.BLACK);
		
		ball.setFill(Color.YELLOW);
		ball.setRadius(20);
		ball.setCenterX(path.getCenterX());
		ball.setCenterY(path.getCenterY()+path.getRadiusY());
		
		PathTransition pt = new PathTransition();
		pt.setPath(path);
		pt.setNode(ball);
		pt.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		
		FadeTransition ft = new FadeTransition();
		ft.setDuration(Duration.millis(3000));
		ft.setNode(ball);
		ft.setFromValue(1);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		
		ball.setOnMouseClicked( e ->{
			if(pt.getStatus()== Status.PAUSED|| pt.getStatus()==Status.STOPPED) {
				ft.play();
				pt.play();
			}
			else {
				ft.pause();
				pt.stop();
			}
		});
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
