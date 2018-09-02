import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.PathTransition.OrientationType;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.*;
public class PathTransitionDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Rectangle rectangle = new Rectangle(0,0,25,50);
		rectangle.setFill(Color.ORANGE);
		
		Circle circle = new Circle(125,100,50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		
		pane.getChildren().addAll(rectangle,circle);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(10000));
		pt.setRate(100);
		pt.setPath(circle);
		pt.setNode(rectangle);
		pt.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setAutoReverse(true);
		pt.play();
		
		circle.setOnMousePressed(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				pt.pause();
			}
		});
		
		circle.setOnMouseReleased(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				pt.play();
			}
		});
		
		 Scene scene = new Scene(pane,250,200);
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}

}
