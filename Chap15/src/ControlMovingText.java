import javafx.animation.Animation;
import javafx.animation.Animation.Status;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlMovingText extends Application {
	private Pane pane = new Pane();
	private Text text = new Text("Programming is fun");
	private Line path = new Line();
	private Button button = new Button("Click");
	private Button button2 = new Button("PAUSE");
	private int status = 0;
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.getChildren().add(text);
		pane.getChildren().add(path);
		pane.getChildren().add(button);
		pane.getChildren().add(button2);
		
		path.setStartX(0);
		path.setStartY(0);
		path.endXProperty().bind(pane.widthProperty());
		path.endYProperty().bind(pane.heightProperty());
		
		text.xProperty().bind(pane.widthProperty().divide(2).subtract(50));
		text.yProperty().bind(pane.heightProperty().divide(2));
		
		button.layoutXProperty().bind(pane.widthProperty().divide(2));
		button.layoutYProperty().bind(pane.heightProperty().subtract(20));
		
		button2.layoutXProperty().bind(pane.widthProperty().divide(2));
		button2.layoutYProperty().bind(pane.heightProperty().subtract(50));
		
		path.setOpacity(0);
		
			PathTransition pt = new PathTransition();
			pt.setPath(path);
			pt.setAutoReverse(false);
			pt.setCycleCount(Timeline.INDEFINITE);
			pt.setNode(text);
			pt.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
			pt.setDuration(Duration.millis(2000));
		
		button.setOnAction(e->{
				pt.play();
		});
		
		button2.setOnAction(e->{
			pt.stop();
		});
		
		
		
		Scene scene = new Scene(pane,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
