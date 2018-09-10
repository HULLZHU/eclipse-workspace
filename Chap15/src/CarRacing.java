import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CarRacing extends Application{
	private Pane pane = new Pane();
	private Car car = new Car();
	private Line path = new Line(); 
	private double velocity = 1;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(pane,900,400);
		primaryStage.setScene(scene);
		
		car.setLayoutX(0);
		car.setLayoutY(100);
		
		path.setStartX(0);
		path.setStartY(115);
		path.endXProperty().bind(pane.widthProperty());
		path.setEndY(115);
		
		pane.getChildren().addAll(path,car);
		
		path.setOpacity(0);
		
		PathTransition pt = new PathTransition();
		pt.setNode(car);
		pt.setDuration(Duration.millis(3000));
		pt.setRate(velocity);
		pt.setPath(path);
		pt.setAutoReverse(true);
		pt.setCycleCount(Timeline.INDEFINITE);
		
		car.setOnMouseClicked( e->{
			pt.play();
		});
		
		car.setOnKeyPressed( e->{
			if (e.getCode() == KeyCode.ENTER) {
				if(pt.getStatus()==Animation.Status.PAUSED||pt.getStatus()==Animation.Status.STOPPED)
					pt.play();
				else
					pt.pause();
			}
			else if(e.getCode() == KeyCode.UP) {
				velocity+=.2;
				pt.setRate(velocity);
			}
			
			else if(e.getCode() == KeyCode.DOWN) {
				if(velocity>=0.2) {			
				velocity -=.2;
				pt.setRate(velocity);
				}
			}
		});
		
		car.requestFocus();
		primaryStage.show();
	}

}
