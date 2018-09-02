import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.util.Duration;
public class ClockAnimation extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public  void start (Stage primaryStage) {

		ClockPane clock = new ClockPane();
		
		EventHandler<ActionEvent> eventHandler = e ->{
			clock.setCurrentTime();
		};
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		Scene scene = new Scene(clock,250,250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
}
