import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RotateRectangle extends Application {
	private double angle = 0;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Rectangle rectangle = new Rectangle(100,100,200,100);
		rectangle.setFill(Color.BLUE);
		rectangle.setStroke(Color.BLACK);
		pane.getChildren().add(rectangle);
		
		Button rotateButton = new Button("Rotate");
		pane.getChildren().add(rotateButton);
		rotateButton.setLayoutX(175);
		rotateButton.setLayoutY(300);
		
		//define a event handler
		EventHandler<ActionEvent> rotateHandler = e ->{
			angle += 0.3;
			rectangle.setRotate(angle);
		};
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(80),rotateHandler));
		animation.setCycleCount(Timeline.INDEFINITE);

		rotateButton.setOnAction(e->{
			if(animation.getStatus() !=Animation.Status.RUNNING)
			   animation.play();
			else
				animation.pause();
		});
		
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

}
