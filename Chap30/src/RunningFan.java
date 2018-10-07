import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RunningFan extends Application{
	
	private BorderPane pane = new BorderPane();
	private Button play = new Button("Play");
	private Button pause = new Button("Pause");
	private Button reverse = new Button("Reverse");
	private HBox lowerPane = new HBox(5);
	private Fan fan = new Fan();
	
	public static void main(String args[]) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.setTop(fan); 
		pane.setBottom(lowerPane);
		lowerPane.getChildren().addAll(play,pause,reverse);
		lowerPane.setAlignment(Pos.CENTER);
		
		EventHandler<ActionEvent> playHandler = e ->{
			fan.run();
		}; 
		 
		EventHandler<ActionEvent> reverseHandler = e ->{
			fan.reverse();
		};
		 
		Timeline animationPlay = new Timeline(new KeyFrame(Duration.millis(500),playHandler));
		animationPlay.setCycleCount(Timeline.INDEFINITE);
		animationPlay.setRate(10);
		Timeline animationReverse = new Timeline(new KeyFrame(Duration.millis(500),reverseHandler));
		animationReverse.setCycleCount(Timeline.INDEFINITE);
		animationReverse.setRate(10);
		
		play.setOnAction( e ->{
			Platform.runLater( new Runnable() {
				@Override
				public void run() {
					animationPlay.play();
				}
				
			});
		}); 
		
		reverse.setOnAction(e -> {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					animationPlay.pause(); 
					animationReverse.play();
				}
			});
			
		});
		
		pause.setOnAction( e ->{
			animationPlay.pause();
			animationReverse.pause();
		});
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
}
