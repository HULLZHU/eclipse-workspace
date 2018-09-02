import javafx.animation.Animation;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class TimeLineDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Text text = new Text(20,50,"Programming is Fun");
		text.setFill(Color.RED);
		pane.getChildren().add(text);
		text.setFont(Font.font(null, FontWeight.BLACK, FontPosture.ITALIC, 30));
		
		//another to create EventHandler Class
		EventHandler<ActionEvent> eventHandler = e->{
			if (text.getText().length() != 0 ) {
				text.setText("");
			}
			else {
				text.setText("Programming is Fun");
			}
		};

		KeyFrame keyFrame =new KeyFrame(Duration.millis(500),eventHandler);
		Timeline animation = new Timeline(keyFrame);
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		text.setOnMouseClicked( new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				if (animation.getStatus() ==Animation.Status.PAUSED)
					animation.play();
				else
					animation.pause();	
			}
		});
		
		Scene scene = new Scene(pane,250,250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
